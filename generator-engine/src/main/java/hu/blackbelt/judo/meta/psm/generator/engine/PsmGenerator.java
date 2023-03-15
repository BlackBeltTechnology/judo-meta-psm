package hu.blackbelt.judo.meta.psm.generator.engine;

/*-
 * #%L
 * Judo :: PSM :: Model :: Genetator :: Engine
 * %%
 * Copyright (C) 2018 - 2023 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import com.github.jknack.handlebars.Context;
import com.github.jknack.handlebars.ValueResolver;
import com.github.jknack.handlebars.io.URLTemplateLoader;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.generator.commons.*;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * This class loads descriptor yaml file and processing it.
 * The yaml file contains a entries describes the generation itself. On entry can
 * be used to generate several entries of files. @see {@link GeneratorTemplate}
 */
@Slf4j
public class PsmGenerator {

    public static final String NAME = "name";
    public static final Boolean TEMPLATE_DEBUG = System.getProperty("templateDebug") != null;
    public static final String YAML = ".yaml";
    public static final String ADD_DEBUG_TO_TEMPLATE = "addDebugToTemplate";
    public static final String TEMPLATE = "template";

    public static final String SELF = "self";
    public static final String ACTOR_TYPES = "actorTypes";
    public static final String ACTOR_TYPE = "actorType";
    public static final String MODEL = "model";


    public static PsmGeneratorResult execute(PsmGeneratorParameter.PsmGeneratorParameterBuilder builder) throws Exception {
        return execute(builder.build());
    }

    public static PsmGeneratorResult execute(PsmGeneratorParameter parameter) throws Exception {
        final AtomicBoolean loggerToBeClosed = new AtomicBoolean(false);
        Log log = Objects.requireNonNullElseGet(parameter.log,
                                                () -> {
                                                    loggerToBeClosed.set(true);
                                                    return new BufferedSlf4jLogger(PsmGenerator.log);
                                                });
        try {
            return execute(parameter, log);
        } finally {
            if (loggerToBeClosed.get()) {
                log.close();
            }
        }
    }

    private static PsmGeneratorResult execute(PsmGeneratorParameter parameter, Log log) throws InterruptedException, ExecutionException {
        PsmGeneratorResult result = PsmGeneratorResult.psmGeneratorResult().build();

        parameter.generatorContext.getModelResourceSupport().getStreamOfPsmAccesspointActorType().forEach(
                app -> { result.generatedByActors.put(app, ConcurrentHashMap.newKeySet()); });

        Set<ActorType> actorTypes = parameter.generatorContext.getModelResourceSupport().getStreamOfPsmAccesspointActorType()
                .filter(parameter.actorTypePredicate).collect(Collectors.toSet());

        Model model = parameter.generatorContext.getModelResourceSupport().getStreamOfPsmNamespaceModel().findFirst()
                .orElseThrow(() -> new RuntimeException("Could not find the model entry"));

        List<CompletableFuture<GeneratedFile>> tasks = new ArrayList<>();

        parameter.generatorContext.getGeneratorModel().getTemplates().stream().forEach(generatorTemplate -> {

            // Handlebars context builder
            // It creates parameters accessible within templates.
            // It returns the function, the context creation itself is called when template is processed.
            Function<Object, Context.Builder> defaultHandlebarsContextBuilder = o -> {
                ImmutableMap.Builder params = ImmutableMap.<String, Object>builder()
                    .put(ADD_DEBUG_TO_TEMPLATE, TEMPLATE_DEBUG)
                    .put(ACTOR_TYPES, actorTypes)
                    .put(TEMPLATE, generatorTemplate)
                    .put(SELF, o)
                    .put(MODEL, model);

                Map<String, ?> extraVariables = parameter.extraContextVariables.get();
                extraVariables.forEach((k, v) -> {
                    if (k != null && v != null) {
                        params.put(k, v);
                    }
                });

                Context.Builder contextBuilder = Context.newBuilder(params.build());
                if (parameter.generatorContext.getValueResolvers().size() > 0) {
                    contextBuilder.push(parameter.generatorContext.getValueResolvers().toArray(ValueResolver[]::new));
                }
                return contextBuilder;
            };

            // SpringEL Context builder
            Function<Object, StandardEvaluationContext> defaultSpringELContextProvider = o -> {
                StandardEvaluationContext templateContext = parameter.generatorContext.createSpringEvaluationContext();
                templateContext.setVariable(ADD_DEBUG_TO_TEMPLATE, TEMPLATE_DEBUG);
                templateContext.setVariable(ACTOR_TYPES, actorTypes);
                templateContext.setVariable(TEMPLATE, generatorTemplate);
                templateContext.setVariable(SELF, o);
                templateContext.setVariable(MODEL, model);

                Map<String, ?> extraVariables = parameter.extraContextVariables.get();
                extraVariables.forEach((k, v) -> {
                    templateContext.setVariable(k, v);
                });
                return templateContext;
            };

            StandardEvaluationContext evaulationContext = defaultSpringELContextProvider.apply(model);
            final TemplateEvaluator templateEvaulator;
            try {
                templateEvaulator = generatorTemplate.getTemplateEvalulator(
                        parameter.generatorContext, evaulationContext);
            } catch (IOException e) {
                throw new RuntimeException("Could not evaluate template", e);
            }

            if (generatorTemplate.isActorTypeBased()) {
                actorTypes.forEach(actorType -> {
                    evaulationContext.setVariable(ACTOR_TYPE, actorType);

                    Collection processingList = new HashSet(Arrays.asList(actorType));
                    if (templateEvaulator.getFactoryExpression() != null) {
                        processingList = templateEvaulator.getFactoryExpressionResultOrValue(generatorTemplate, actorType, Collection.class);
                    }
                    templateEvaulator.getFactoryExpressionResultOrValue(generatorTemplate, processingList, Collection.class).stream().forEach(element -> {
                        tasks.add(CompletableFuture.supplyAsync(() -> {
                            StandardEvaluationContext templateContext = defaultSpringELContextProvider.apply(element);
                            templateContext.setVariable(ACTOR_TYPE, actorType);

                            Context.Builder contextBuilder = defaultHandlebarsContextBuilder.apply(element)
                                    .combine(ACTOR_TYPE, actorType);

                            callBindContextForTypeIfCan(parameter.generatorContext, StandardEvaluationContext.class, templateContext);
                            callBindContextForTypeIfCan(parameter.generatorContext, Map.class, parameter.extraContextVariables.get());

                            generatorTemplate.evalToContextBuilder(templateEvaulator, contextBuilder, templateContext);
                            GeneratedFile generatedFile = generateFile(parameter.generatorContext, templateContext, templateEvaulator, generatorTemplate, contextBuilder, log);
                            result.generatedByActors.get(actorType).add(generatedFile);
                            return generatedFile;
                        }));
                    });
                });
            } else {
                evaulationContext.setVariable(TEMPLATE, generatorTemplate);
                Set iterableCollection = new HashSet(Arrays.asList(generatorTemplate));

                if (templateEvaulator.getTemplate() != null) {
                    iterableCollection = actorTypes;
                }
                templateEvaulator.getFactoryExpressionResultOrValue(generatorTemplate, iterableCollection, Collection.class).stream().forEach(element -> {
                    tasks.add(CompletableFuture.supplyAsync(() -> {

                        StandardEvaluationContext templateContext = defaultSpringELContextProvider.apply(element);
                        Context.Builder contextBuilder = defaultHandlebarsContextBuilder.apply(element);

                        callBindContextForTypeIfCan(parameter.generatorContext, StandardEvaluationContext.class, templateContext);
                        callBindContextForTypeIfCan(parameter.generatorContext, Map.class, parameter.extraContextVariables.get());

                        generatorTemplate.evalToContextBuilder(templateEvaulator, contextBuilder, evaulationContext);
                        GeneratedFile generatedFile = generateFile(parameter.generatorContext, templateContext, templateEvaulator, generatorTemplate, contextBuilder, log);
                        result.generated.add(generatedFile);
                        return generatedFile;
                    }));
                });
            }
        });

        StreamHelper.performFutures(tasks);
        return result;
    }


    private static GeneratedFile generateFile(
            final PsmGeneratorContext generatorContext,
            final StandardEvaluationContext evaluationContext,
            final TemplateEvaluator templateEvaulator,
            final GeneratorTemplate generatorTemplate,
            final Context.Builder contextBuilder,
            final Log log) {

        GeneratedFile generatedFile = new GeneratedFile();

        try {
            generatedFile.setPath(templateEvaulator.getPathExpression().getValue(evaluationContext, String.class));
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not evaluate path expression in " + generatorTemplate.toString());
        }


        if (generatorTemplate.isCopy()) {
            String location = generatorTemplate.getTemplateName();
            if (location.startsWith("/")) {
                location =  location.substring(1);
            }
            location = generatorContext.getTemplateLoader().resolve(location);
            try {
                URL resource = generatorContext.getUrlResolver().getResource(location);
                if (resource != null) {
                    generatedFile.setContent(ByteStreams.toByteArray(resource.openStream()));
                }  else {
                    log.error("Could not locate: " + location);
                }
            } catch (Exception e) {
                log.error("Could not resolve: " + location);
            }
        } else {
            StringWriter sourceFile = new StringWriter();
            try {
                Context context = contextBuilder.build();
                callBindContextForTypeIfCan(generatorContext, Context.class, context);
                templateEvaulator.getTemplate().apply(context, sourceFile);
            } catch (Exception e) {
                throw new RuntimeException("Could not generate file: " + generatedFile.getPath(), e);
            }
            generatedFile.setContent(sourceFile.toString().getBytes(Charsets.UTF_8));
        }
        return generatedFile;
    }

    public static Consumer<Map.Entry<ActorType, Collection<GeneratedFile>>> getDirectoryWriterForActor(Function<ActorType, File> actorTypeTargetDirectoryResolver, Log log) {
        return e -> {
            File targetDirectory = actorTypeTargetDirectoryResolver.apply(e.getKey());
            GeneratorIgnore generatorIgnore = new GeneratorIgnore(targetDirectory.toPath());
            e.getValue().stream().forEach(f -> {
                File outFile = new File(targetDirectory, f.getPath());
                outFile.getParentFile().mkdirs();
                if (!generatorIgnore.shouldExcludeFile(outFile.toPath())) {
                    try {
                        if (outFile.exists()) {
                            log.debug("File already exists, overwrite: " + outFile.getAbsolutePath());
                            outFile.delete();
                        }
                        ByteStreams.copy(new ByteArrayInputStream(f.getContent()), new FileOutputStream(outFile));
                    } catch (Exception exception) {
                        log.error("Could not write file: " + outFile.getAbsolutePath());
                        throw new RuntimeException(exception);
                    }
                }
            });
        };
    }

    public static Consumer<Collection<GeneratedFile>> getDirectoryWriter(Supplier<File> targetDirectoryResolver, Log log) {
        return e -> {
            File targetDirectory = targetDirectoryResolver.get();
            GeneratorIgnore generatorIgnore = new GeneratorIgnore(targetDirectory.toPath());
            e.stream().forEach(f -> {
                File outFile = new File(targetDirectory, f.getPath());
                outFile.getParentFile().mkdirs();
                if (!generatorIgnore.shouldExcludeFile(outFile.toPath())) {
                    try {
                        if (outFile.exists()) {
                            log.debug("File already exists, overwrite: " + outFile.getAbsolutePath());
                            outFile.delete();
                        }
                        ByteStreams.copy(new ByteArrayInputStream(f.getContent()), new FileOutputStream(outFile));
                    } catch (Exception exception) {
                        log.error("Could not write file: " + outFile.getAbsolutePath());
                        throw new RuntimeException(exception);
                    }
                }
            });

        };
    }


    public static void generateToDirectory(PsmGeneratorParameter.PsmGeneratorParameterBuilder builder) throws Exception {
        generateToDirectory(builder.build());
    }

    public static void generateToDirectory(PsmGeneratorParameter parameter) throws Exception {
        final AtomicBoolean loggerToBeClosed = new AtomicBoolean(false);
        Log log = Objects.requireNonNullElseGet(parameter.log,
                                                () -> {
                                                    loggerToBeClosed.set(true);
                                                    return new BufferedSlf4jLogger(PsmGenerator.log);
                                                });

        try {
            PsmGeneratorResult result = execute(parameter);
            result.generatedByActors
                    .entrySet()
                    .stream()
                    .filter(e -> parameter.actorTypePredicate.test(e.getKey()))
                    .forEach(getDirectoryWriterForActor(parameter.actorTypeTargetDirectoryResolver, log));
            getDirectoryWriter(parameter.targetDirectoryResolver, log).accept(result.generated);
        } finally {
            if (loggerToBeClosed.get()) {
                log.close();
            }
        }
    }

    @SneakyThrows(IOException.class)
    public static InputStream getGeneratedFilesAsZip(Collection<GeneratedFile> generatedFiles) {
        ByteArrayOutputStream generatedZip = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(generatedZip);
        for (GeneratedFile generatedFile : generatedFiles) {
            zipOutputStream.putNextEntry(new ZipEntry(generatedFile.getPath()));
            zipOutputStream.write(generatedFile.getContent(), 0, generatedFile.getContent().length);
            zipOutputStream.flush();
            zipOutputStream.closeEntry();
        }
        zipOutputStream.flush();
        zipOutputStream.close();
        return new ByteArrayInputStream(generatedZip.toByteArray());
    }


    @Builder
    @Getter
    public static final class CreateGeneratorContextArgument {
        PsmModel psmModel;
        String descriptorName;
        @Builder.Default
        LinkedHashMap<String, URI> uris = new LinkedHashMap<>();
        @Builder.Default
        Collection<Class> helpers = new ArrayList<>();
        //@Builder.Default
        //Collection<ValueResolver> valueResolvers = new ArrayList<>();
        @Builder.Default
        Class contextAccessor = null;
        @Builder.Default
        Function<Collection<URI>, URLTemplateLoader> urlTemplateLoaderFactory = null;
        @Builder.Default
        Function<Collection<URI>, URLResolver> urlResolverFactory = null;
    }

    public static PsmGeneratorContext createGeneratorContext(CreateGeneratorContextArgument args) throws IOException {

        URLTemplateLoader urlTemplateLoader = null;
        URLResolver urlResolver = null;

        if (args.urlTemplateLoaderFactory != null) {
            urlTemplateLoader = args.urlTemplateLoaderFactory.apply(args.uris.values());
            if (args.urlResolverFactory != null) {
                urlResolver = args.urlResolverFactory.apply(args.uris.values());
            } else {
                throw new IllegalStateException("Could not determinate URLResolver");
            }
        } else {
            urlTemplateLoader = ChainedURLTemplateLoader.createFromURIs(args.uris.values());
            if (args.urlResolverFactory != null) {
                urlResolver = args.urlResolverFactory.apply(args.uris.values());
            } else {
                urlResolver = (URLResolver) urlTemplateLoader;
            }
        }

        if (args.uris.isEmpty()) {
            throw new IllegalArgumentException("Minimum one URI is mandatory for templates");
        }


        GeneratorModel generatorModel = null;

        Map.Entry<String, URI> root = args.uris.entrySet().stream().findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No template URI is defined"));

        for (Map.Entry<String, URI> entry : args.uris.entrySet()) {
            GeneratorModel model = GeneratorModel.loadYamlURL(entry.getKey(),
                    UriHelper.calculateRelativeURI(entry.getValue(), args.descriptorName + YAML).normalize().toURL());
            if (entry == root) {
                generatorModel = model;
            } else {
                if (model != null && generatorModel != null) {
                    generatorModel.overrideTemplates(model.getTemplates());
                }
            }
        }

        List<ValueResolver> valueResolversPar = new ArrayList<>();
        for (Class helper : args.helpers) {
            if (ValueResolver.class.isAssignableFrom(helper) &&
                    valueResolversPar.stream().map(v -> v.getClass()).filter(v -> v == helper).findAny().isEmpty()) {
                try {
                    Object o = helper.getDeclaredConstructor().newInstance();
                    if (o instanceof ValueResolver) {
                        valueResolversPar.add((ValueResolver) o);
                    } else {
                        throw new IllegalArgumentException("Could not instantiate value resolver class: " + helper.getName());
                    }
                } catch (Exception e) {
                    throw new IllegalArgumentException("Could not load value resolver class: " + helper.getName());
                }
            }
        }

        Collection<Class> helpersPar = new ArrayList<>();
        if (args.helpers != null) {
            helpersPar.addAll(args.helpers);
        }

        PsmGeneratorContext psmGeneratorContext = PsmGeneratorContext.builder()
                .psmModel(args.psmModel)
                .templateLoader(urlTemplateLoader)
                .urlResolver(urlResolver)
                .generatorModel(generatorModel)
                .helpers(helpersPar)
                .valueResolvers(valueResolversPar)
                .contextAccessor(args.contextAccessor)
                .build();

        return psmGeneratorContext;
    }


    @SneakyThrows
    private static void callBindContextForTypeIfCan(PsmGeneratorContext generatorContext, Class type, Object value) {
        if (generatorContext.getContextAccessor() != null) {
            Optional<Method> callMethod = Arrays.stream(generatorContext.getContextAccessor().getMethods()).filter(m ->
                    m.getName().equals("bindContext") &&
                            Modifier.isPublic(m.getModifiers()) &&
                            Modifier.isStatic(m.getModifiers()) &&
                            m.getParameters().length == 1 &&
                            type.isAssignableFrom(m.getParameters()[0].getType())
            ).findFirst();
            if (callMethod.isPresent()) {
                callMethod.get().invoke(null, value);
            }
        }
    }
}
