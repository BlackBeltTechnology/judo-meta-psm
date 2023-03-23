package hu.blackbelt.judo.meta.psm;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import hu.blackbelt.epsilon.runtime.execution.ExecutionContext;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;

import java.io.File;

import static hu.blackbelt.epsilon.runtime.execution.ExecutionContext.executionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.contexts.EvlExecutionContext.evlExecutionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.model.emf.WrappedEmfModelContext.wrappedEmfModelContextBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;

@Slf4j
class ExecutionContextTest {

    @Test
    void testReflectiveCreated() throws Exception {

        String createdSourceModelName = "urn:psm.judo-meta-psm";

        ResourceSet executionResourceSet = PsmModelResourceSupport.createPsmResourceSet();
        Resource psmResource = executionResourceSet.createResource(
                URI.createURI(createdSourceModelName));

        Primitive stringType = newStringTypeBuilder()
                .withName("String")
                .withMaxLength(20)
                .build();

        Model model = newModelBuilder()
                .withName("model")
                .withPackages(
                        newPackageBuilder()
                                .withName("test")
                                .withElements(ImmutableList.of(
                                        newEntityTypeBuilder()
                                                .withName("entity1")
                                                .withAttributes(newAttributeBuilder()
                                                        .withName("attt1")
                                                        .withDataType(stringType)
                                                        .build()
                                                )
                                        .build()
                                ))
                        .build()
                )
                .build();

        psmResource.getContents().add(model);

        // Execution context
        ExecutionContext executionContext;
        try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
            executionContext = executionContextBuilder()
                    .log(bufferedLog)
                    .resourceSet(executionResourceSet)
                    .metaModels(ImmutableList.of())
                    .modelContexts(ImmutableList.of(
                            wrappedEmfModelContextBuilder()
                                    .log(bufferedLog)
                                    .name("PSM")
                                    .validateModel(false)
                                    .resource(psmResource)
                                    .build()))
                    .injectContexts(ImmutableMap.of("psmUtils", new PsmUtils()))
                    .build();
        }

        // run the model / metadata loading
        executionContext.load();

        // Transformation script
        executionContext.executeProgram(
                evlExecutionContextBuilder()
                        .source(new File("../model/src/main/epsilon/validations/psm.evl").toURI())
                        .build());

        executionContext.commit();
        executionContext.close();
    }
}
