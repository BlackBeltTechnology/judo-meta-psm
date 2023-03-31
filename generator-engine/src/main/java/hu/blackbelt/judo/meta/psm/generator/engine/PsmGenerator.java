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
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
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

import static hu.blackbelt.judo.generator.commons.ModelGenerator.*;

/**
 * This class loads descriptor yaml file and processing it.
 * The yaml file contains a entries describes the generation itself. On entry can
 * be used to generate several entries of files. @see {@link hu.blackbelt.judo.generator.commons.GeneratorTemplate}
 */
@Slf4j
public class PsmGenerator {

    public static final String NAME = "name";
    public static final Boolean TEMPLATE_DEBUG = System.getProperty("templateDebug") != null;
    public static final String ADD_DEBUG_TO_TEMPLATE = "addDebugToTemplate";
    public static final String TEMPLATE = "template";

    public static final String SELF = "self";
    public static final String ACTOR_TYPES = "actorTypes";
    public static final String ACTOR_TYPE = "actorType";
    public static final String MODEL = "model";


    private static GeneratorParameter mapPsmParameters(PsmGeneratorParameter parameter) {
        return GeneratorParameter.<ActorType>generatorParameter()
                .generatorContext(parameter.generatorContext)
                .discriminatorPredicate(parameter.actorTypePredicate)
                .extraContextVariables(parameter.extraContextVariables)
                .targetDirectoryResolver(parameter.targetDirectoryResolver)
                .discriminatorTargetDirectoryResolver(parameter.actorTypeTargetDirectoryResolver)
                .log(parameter.log)
                .performExecutor(p -> execute(parameter))
                .build();
    }

    public static GeneratorResult<ActorType> execute(PsmGeneratorParameter.PsmGeneratorParameterBuilder builder) throws RuntimeException {
        return execute(builder.build());
    }
    public static GeneratorResult<ActorType> execute(PsmGeneratorParameter parameter) throws RuntimeException {
        final AtomicBoolean loggerToBeClosed = new AtomicBoolean(false);
        Log log = Objects.requireNonNullElseGet(parameter.log,
                                                () -> {
                                                    loggerToBeClosed.set(true);
                                                    return new BufferedSlf4jLogger(PsmGenerator.log);
                                                });
        try {
            return execute(parameter.psmModel, mapPsmParameters(parameter), log);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (loggerToBeClosed.get()) {
                try {
                    log.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static GeneratorResult execute(PsmModel psmModel, GeneratorParameter<ActorType> parameter, Log log) throws InterruptedException, ExecutionException {
        GeneratorResult<ActorType> result = GeneratorResult.<ActorType>generatorResult().build();

        PsmModelResourceSupport modelResourceSupport = PsmModelResourceSupport.psmModelResourceSupportBuilder()
                .resourceSet(psmModel.getResourceSet())
                .build();

        modelResourceSupport.getStreamOfPsmAccesspointActorType().forEach(
                app -> { result.getGeneratedByDiscriminator().put(app, ConcurrentHashMap.newKeySet()); });

        Set<ActorType> actorTypes = modelResourceSupport.getStreamOfPsmAccesspointActorType()
                .filter(parameter.getDiscriminatorPredicate()).collect(Collectors.toSet());

        Model model = modelResourceSupport.getStreamOfPsmNamespaceModel().findFirst()
                .orElseThrow(() -> new RuntimeException("Could not find the model entry"));

        List<CompletableFuture<GeneratedFile>> tasks = new ArrayList<>();

        parameter.getGeneratorContext().getGeneratorModel().getTemplates().stream().forEach(generatorTemplate -> {

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

                Map<String, ?> extraVariables = (Map<String, ?>) parameter.getExtraContextVariables().get();
                extraVariables.forEach((k, v) -> {
                    if (k != null && v != null) {
                        params.put(k, v);
                    }
                });

                Context.Builder contextBuilder = Context.newBuilder(params.build());
                if (parameter.getGeneratorContext().getValueResolvers().size() > 0) {
                    contextBuilder.push(parameter.getGeneratorContext().getValueResolvers().toArray(ValueResolver[]::new));
                }
                return contextBuilder;
            };

            // SpringEL Context builder
            Function<Object, StandardEvaluationContext> defaultSpringELContextProvider = o -> {
                StandardEvaluationContext templateContext = parameter.getGeneratorContext().createSpringEvaluationContext();
                templateContext.setVariable(ADD_DEBUG_TO_TEMPLATE, TEMPLATE_DEBUG);
                templateContext.setVariable(ACTOR_TYPES, actorTypes);
                templateContext.setVariable(TEMPLATE, generatorTemplate);
                templateContext.setVariable(SELF, o);
                templateContext.setVariable(MODEL, model);

                Map<String, ?> extraVariables = (Map<String, ?>) parameter.getExtraContextVariables().get();
                extraVariables.forEach((k, v) -> {
                    templateContext.setVariable(k, v);
                });
                return templateContext;
            };

            StandardEvaluationContext evaulationContext = defaultSpringELContextProvider.apply(model);
            final TemplateEvaluator templateEvaulator;
            try {
                templateEvaulator = generatorTemplate.getTemplateEvalulator(
                        parameter.getGeneratorContext(), evaulationContext);
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

                            callBindContextForTypeIfCan(parameter.getGeneratorContext(), StandardEvaluationContext.class, templateContext);
                            callBindContextForTypeIfCan(parameter.getGeneratorContext(), Map.class, parameter.getExtraContextVariables().get());

                            generatorTemplate.evalToContextBuilder(templateEvaulator, contextBuilder, templateContext);
                            GeneratedFile generatedFile = generateFile(parameter.getGeneratorContext(), templateContext, templateEvaulator, generatorTemplate, contextBuilder, log);
                            result.getGeneratedByDiscriminator().get(actorType).add(generatedFile);
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

                        callBindContextForTypeIfCan(parameter.getGeneratorContext(), StandardEvaluationContext.class, templateContext);
                        callBindContextForTypeIfCan(parameter.getGeneratorContext(), Map.class, parameter.getExtraContextVariables().get());

                        generatorTemplate.evalToContextBuilder(templateEvaulator, contextBuilder, evaulationContext);
                        GeneratedFile generatedFile = generateFile(parameter.getGeneratorContext(), templateContext, templateEvaulator, generatorTemplate, contextBuilder, log);
                        ((GeneratorResult<ActorType>) result).getGenerated().add(generatedFile);
                        return generatedFile;
                    }));
                });
            }
        });

        StreamHelper.performFutures(tasks);
        return result;
    }

    public static void generateToDirectory(PsmGeneratorParameter.PsmGeneratorParameterBuilder builder) throws Exception {
        generateToDirectory(builder.build());
    }

    public static void generateToDirectory(PsmGeneratorParameter parameter) throws Exception {
        ModelGenerator.generateToDirectory(mapPsmParameters(parameter));
    }

}
