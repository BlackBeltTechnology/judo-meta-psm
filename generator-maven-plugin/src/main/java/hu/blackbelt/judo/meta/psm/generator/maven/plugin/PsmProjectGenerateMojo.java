package hu.blackbelt.judo.meta.psm.generator.maven.plugin;

/*-
 * #%L
 * Judo :: PSM :: Model :: Generator :: Maven :: Plugin
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

import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import hu.blackbelt.judo.generator.commons.ModelGenerator;
import hu.blackbelt.judo.generator.commons.TemplateHelperFinder;
import hu.blackbelt.judo.meta.psm.generator.engine.PsmGeneratorParameter;
import hu.blackbelt.judo.meta.psm.generator.engine.PsmGenerator;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.*;
import org.apache.maven.project.MavenProject;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.repository.RemoteRepository;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Mojo(name = "generate",
        defaultPhase = LifecyclePhase.GENERATE_RESOURCES,
        requiresDependencyResolution = ResolutionScope.COMPILE,
        threadSafe = true)
public class PsmProjectGenerateMojo extends AbstractPsmProjectMojo {

    @Parameter(property = "type", required = true)
    private String type;

    @Parameter(property = "uris")
    private List<String> uris = new ArrayList<>();

    @Parameter(property = "helpers")
    private List<String> helpers = new ArrayList<>();

    @Parameter(property="templateParameters")
    private HashMap<String, String> templateParameters;

    @Parameter(property="contextAccessor")
    private String contextAccessor;

    @Parameter(property="scanDependencies", defaultValue = "true")
    private Boolean scanDependencies;

    @Parameter(property="validateChecksum", defaultValue = "true")
    private Boolean validateChecksum;

    @Parameter(property="scanPackages")
    private List<String> scanPackages;

    @Parameter(property = "parameterDirectory", defaultValue = "${project.basedir}/target/fullstack-project")
    protected File parameterDirectory;

    @Parameter(property="parameterFiles", defaultValue = "judo-version.properties,generator-parameter.properties")
    private List<File> parameterFiles;

    @Parameter(property="variablePrecedence", defaultValue = "projectProperties,templateVariables,propertiesFiles,environmentVariables,systemProperties")
    private List<String> variablePrecedence;

    @Override
    public void performExecutionOnPsmParameters(PsmGeneratorParameter.PsmGeneratorParameterBuilder psmGeneratorParameterBuilder) throws Exception {
        LinkedHashMap<String, URI> uriMap = new LinkedHashMap<>();
        if (uris != null) {
            for (String uri : uris) {
                uriMap.put(uri, getResolvedTemplateDirectory(uri).toURI());
            }
        }

        Collection<Class> resolvedHelpers = new HashSet<>();
        for (String helperClass : helpers) {
            try {
                Class clazz = Thread.currentThread().getContextClassLoader().loadClass(helperClass);
                resolvedHelpers.add(clazz);
            } catch (Exception e) {
                getLog().error("Could not load helper class: " + helperClass);
            }
        }

        AtomicReference<Class> contextAccessorClass = new AtomicReference<>();

        if (scanDependencies) {
            getLog().debug("Scanning classpath for helpers...");
            try {
                Collection<Class> scannedHelpers = TemplateHelperFinder.collectHelpersAsClass(scanPackages, Thread.currentThread().getContextClassLoader());
                for (Class helper : scannedHelpers) {
                    getLog().debug("Helper found: " + helper.getName());
                }
                if (scannedHelpers.size() == 0) {
                    getLog().warn("No class with @TemplateHelper found");
                }
                resolvedHelpers.addAll(scannedHelpers);
            } catch (IOException e) {
                throw new MojoExecutionException("Could not scan dependencies", e);
            }

            if (contextAccessor == null || contextAccessor.isBlank()) {
                TemplateHelperFinder.findContextAccessorAsClass(scanPackages, Thread.currentThread().getContextClassLoader()).ifPresent(c -> {
                    getLog().debug("ContextAccessor class found: " + c.getName());
                    contextAccessorClass.set(c);
                });
            }
        }

        if (contextAccessor != null && !"".equals(contextAccessor.trim())) {
            try {
                contextAccessorClass.set(Thread.currentThread().getContextClassLoader().loadClass(contextAccessor));
            } catch (Exception e) {
                throw new IllegalArgumentException("Could not load contextAccessor class: " + contextAccessor, e);
            }
        }

        Map<String, Object> extras = new LinkedHashMap<>();
        if (variablePrecedence == null) {
            variablePrecedence = Arrays.stream("projectProperties,templateVariables,propertiesFiles,environmentVariables,systemProperties".split(",")).toList();
        }

        for (String precedence : variablePrecedence) {

            if (precedence.equalsIgnoreCase("environmentVariables")) {
                extras.putAll(generalizeTemplateVariableNames(System.getenv().entrySet().stream().collect(
                        Collectors.toMap(
                                e -> String.valueOf(e.getKey()),
                                e -> e.getValue(),
                                (prev, next) -> next, HashMap::new
                        ))));
            } else if (precedence.equalsIgnoreCase("systemVariables")) {
                extras.putAll(generalizeTemplateVariableNames(System.getenv().entrySet().stream().collect(
                        Collectors.toMap(
                                e -> String.valueOf(e.getKey()),
                                e -> e.getValue(),
                                (prev, next) -> next, HashMap::new
                        ))));
            } else if (precedence.equalsIgnoreCase("projectProperties")) {
                extras.putAll(generalizeTemplateVariableNames(project.getProperties().entrySet().stream().collect(
                        Collectors.toMap(
                                e -> String.valueOf(e.getKey()),
                                e -> (String) e.getValue(),
                                (prev, next) -> next, HashMap::new
                        ))));

            } else if (precedence.equalsIgnoreCase("propertiesFiles")) {
                if (parameterFiles != null && parameterFiles.size() > 0) {
                    for (File parameterFile : parameterFiles) {
                        if (parameterFile != null) {
                            if (!parameterFile.exists() && parameterDirectory != null) {
                                parameterFile = new File(parameterDirectory, parameterFile.getName());
                            }
                            if (!parameterFile.exists()) {
                                parameterFile = new File(destination, parameterFile.getName());
                            }
                            if (parameterFile.exists()) {
                                Properties prop = new Properties();
                                prop.load(new FileReader(parameterFile, Charsets.UTF_8));
                                extras.putAll(generalizeTemplateVariableNames(Maps.fromProperties(prop)));
                            } else {
                                getLog().warn("File is missing:" + parameterFile.getAbsolutePath());
                            }
                        }
                    }
                }
            } else if (precedence.equalsIgnoreCase("templateVariables")) {
                if (templateParameters != null) {
                    extras.putAll(generalizeTemplateVariableNames(templateParameters));
                }
            }
        }

        psmGeneratorParameterBuilder.generatorContext(ModelGenerator.createGeneratorContext(
                        ModelGenerator.CreateGeneratorContextArgument.builder()
                                .descriptorName(type)
                                .uris(uriMap)
                                .helpers(resolvedHelpers)
                                .contextAccessor(contextAccessorClass.get())
                                .build()))
                .validateChecksum(validateChecksum)
                .extraContextVariables(() -> extras);

        PsmGenerator.generateToDirectory(psmGeneratorParameterBuilder);
    }

    private Map<String, String> generalizeTemplateVariableNames(Map<String, String> parametrers) {
        return parametrers.entrySet().stream().filter(e -> e.getKey() != null && e.getValue() != null).collect(
                Collectors.toMap(
                        e -> PsmGenerator.generalizeName(String.valueOf(e.getKey())),
                        e -> e.getValue(),
                        (prev, next) -> next, HashMap::new
                ));
    }

}
