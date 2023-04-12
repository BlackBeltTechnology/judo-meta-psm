package hu.blackbelt.judo.meta.psm.generator.engine;

/*-
 * #%L
 * Judo :: PSM :: Model :: Generator :: Engine
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

import com.google.common.collect.ImmutableMap;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.generator.commons.ModelGenerator;
import hu.blackbelt.judo.generator.commons.TemplateHelperFinder;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.model.northwind.Demo;
import lombok.extern.slf4j.Slf4j;
//import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.SaveArguments.psmSaveArgumentsBuilder;
import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.buildPsmModel;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.linesOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class NorthwindTest {

    public static final String NORTHWIND_TEST = "northwind-test";
    public static final String BASE = "base";
    public static final String OVERRIDE = "override";
    private final String TEST_SOURCE_MODEL_NAME = "urn:test.judo-meta-psm";
    private final String TEST = "northwind";
    private final String TARGET_TEST_CLASSES = "target/test-classes";

    PsmModel psmModel;

    String testName;
    Map<EObject, List<EObject>> resolvedTrace;

    @BeforeEach
    void setUp() {
        psmModel = buildPsmModel().uri(org.eclipse.emf.common.util.URI.createURI(TEST_SOURCE_MODEL_NAME)).build();
    }

    @AfterEach
    void tearDown() throws Exception {
        psmModel.savePsmModel(psmSaveArgumentsBuilder().file(new File(TARGET_TEST_CLASSES, testName + "-psm.model")));
    }

    @Test
    void testCreateApplication() throws Exception {
        testName = "Northwind";

        psmModel = new Demo().fullDemo();
        File testOutput =  new File(TARGET_TEST_CLASSES, NORTHWIND_TEST);

        LinkedHashMap uris = new LinkedHashMap();
        uris.put(new File(TARGET_TEST_CLASSES, BASE).toString(), new File(TARGET_TEST_CLASSES, BASE).toURI());
        uris.put(new File(TARGET_TEST_CLASSES, OVERRIDE).toString(), new File(TARGET_TEST_CLASSES, OVERRIDE).toURI());

        try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
            PsmGenerator.generateToDirectory(PsmGeneratorParameter.psmGeneratorParameter()
                            .psmModel(psmModel)
                            .generatorContext(ModelGenerator.createGeneratorContext(
                                    ModelGenerator.CreateGeneratorContextArgument.builder()
                                            .descriptorName("test-project")
                                            .uris(uris)
                                            .helpers(TemplateHelperFinder.collectHelpersAsClass(this.getClass().getClassLoader()))
                                            .build()))
                            .log(bufferedLog)
                            .targetDirectoryResolver(() -> testOutput)
                            .actorTypeTargetDirectoryResolver( a -> testOutput)
                            .extraContextVariables(() -> ImmutableMap.of("extra", "extra"))
                    );
        }


        final Optional<ActorType> application = allPsm(ActorType.class)
                .findAny();
        assertTrue(application.isPresent());

        assertTrue(new File(testOutput, "ExternalUser").isDirectory());
        assertTrue(new File(testOutput, "InternalUser").isDirectory());

        assertThat(linesOf(new File(testOutput, "InternalUser/actorToOverride"))).containsExactly(
                "DECORATED Name: InternalUser",
                "Extra: extra",
                "FQName: demo::InternalUser",
                "PlainName: internaluser",
                "Plain FQ: demo__internaluser",
                "Path FQ: demo__internal_user",
                "ModelName FQ: Demo",
                "Package Name FQ: ",
                ""
        );

        assertThat(linesOf(new File(testOutput, "InternalUser/actorReplaced"))).containsExactly(
                "REPLACED",
                "Name: InternalUser",
                "FQName: demo::InternalUser",
                "PlainName: internaluser",
                "Plain FQ: demo__internaluser",
                "Path FQ: demo__internal_user",
                "ModelName FQ: Demo",
                "Package Name FQ: ",
                ""
        );

        assertThat(!new File(testOutput, "InternalUser/actorToReplace").exists());

        assertThat(!new File(testOutput, "InternalUser/actorToDelete").exists());

    }

    static <T> Stream<T> asStream(Iterator<T> sourceIterator, boolean parallel) {
        Iterable<T> iterable = () -> sourceIterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }

    <T> Stream<T> allPsm() {
        return asStream((Iterator<T>) psmModel.getResourceSet().getAllContents(), false);
    }

    private <T> Stream<T> allPsm(final Class<T> clazz) {
        return allPsm().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e);
    }

}
