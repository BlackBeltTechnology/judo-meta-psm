package hu.blackbelt.judo.meta.psm;

/*-
 * #%L
 * Judo :: Psm :: Model :: Test
 * %%
 * Copyright (C) 2018 - 2024 BlackBelt Technology
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
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.type.Cardinality;
import hu.blackbelt.model.northwind.Demo;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.zeta.validation.core.Severity;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Parameterized tests that run the same test cases with both EVL and Java validation.
 * This ensures both validation engines produce consistent results.
 */
@Slf4j
class PsmValidationParameterizedTest {

    private static final String MODEL_URI = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;

    enum ValidationEngine {
        EVL("EVL"),
        JAVA("Java");

        private final String displayName;

        ValidationEngine(String displayName) {
            this.displayName = displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }

    /**
     * Test case definition that includes model setup and expected constraint violations.
     */
    static class ValidationTestCase {
        final String name;
        final Consumer<PsmModel> modelSetup;
        final Set<String> expectedConstraints;
        final boolean expectPass;

        ValidationTestCase(String name, Consumer<PsmModel> modelSetup, Set<String> expectedConstraints) {
            this.name = name;
            this.modelSetup = modelSetup;
            this.expectedConstraints = expectedConstraints;
            this.expectPass = expectedConstraints.isEmpty();
        }

        static ValidationTestCase passing(String name, Consumer<PsmModel> modelSetup) {
            return new ValidationTestCase(name, modelSetup, Collections.emptySet());
        }

        static ValidationTestCase failing(String name, Consumer<PsmModel> modelSetup, String... expectedConstraints) {
            return new ValidationTestCase(name, modelSetup, new HashSet<>(Arrays.asList(expectedConstraints)));
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @BeforeEach
    void setUp() {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(MODEL_URI))
                .build();
    }

    /**
     * Run EVL validation and return constraint names that failed.
     */
    private Set<String> runEvlValidation() {
        Set<String> violations = new HashSet<>();
        try (BufferedSlf4jLogger bufferedLog = new BufferedSlf4jLogger(log)) {
            PsmEpsilonValidator.validatePsm(bufferedLog,
                    psmModel,
                    PsmEpsilonValidator.calculatePsmValidationScriptURI(),
                    Collections.emptyList(),
                    Collections.emptyList());
        } catch (Exception ex) {
            // Parse the error message to extract constraint names
            String message = ex.getMessage();
            if (message != null) {
                // EVL errors are in format "ConstraintName|message"
                for (String line : message.split("\n")) {
                    if (line.contains("|")) {
                        String constraintName = line.split("\\|")[0].trim();
                        if (!constraintName.isEmpty()) {
                            violations.add(constraintName);
                        }
                    }
                }
            }
            // Also check for unexpected errors list
            if (ex instanceof hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException) {
                var evlEx = (hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException) ex;
                for (String error : evlEx.getUnexpectedErrors()) {
                    if (error.contains("|")) {
                        violations.add(error.split("\\|")[0].trim());
                    }
                }
                for (String warning : evlEx.getUnexpectedWarnings()) {
                    if (warning.contains("|")) {
                        violations.add(warning.split("\\|")[0].trim());
                    }
                }
            }
        }
        return violations;
    }

    /**
     * Run Java validation and return constraint names that failed.
     */
    private Set<String> runJavaValidation() {
        List<ValidationResult> results = PsmValidator.validate(log, psmModel);
        return results.stream()
                .filter(r -> r.getSeverity() == Severity.ERROR || r.getSeverity() == Severity.WARNING)
                .map(ValidationResult::getConstraintName)
                .collect(Collectors.toSet());
    }

    /**
     * Provides test cases for both validation engines.
     */
    static Stream<Arguments> validationTestCases() {
        List<ValidationTestCase> testCases = Arrays.asList(
                // Valid model - should pass with no constraint violations
                ValidationTestCase.passing("ValidModel", psmModel -> {
                    EntityType E10 = newEntityTypeBuilder().withName("E10").build();
                    EntityType E11 = newEntityTypeBuilder().withName("E11").withAbstract_(true).build();
                    AssociationEnd b = newAssociationEndBuilder().withName("ep2")
                            .withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build();
                    AssociationEnd c = newAssociationEndBuilder().withName("ep3")
                            .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();
                    StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

                    EntityType E1 = newEntityTypeBuilder().withName("E1")
                            .withAttributes(newAttributeBuilder().withName("a1").withDataType(string)
                                    .withRequired(true).withIdentifier(true).build())
                            .withRelations(ImmutableList.of(b, c))
                            .withSuperEntityTypes(ImmutableList.of(E10, E11)).build();

                    StringType text = newStringTypeBuilder().withName("Text").withMaxLength(255).build();
                    NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
                    AssociationEnd a = newAssociationEndBuilder().withName("ep1")
                            .withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();

                    EntityType E3 = newEntityTypeBuilder().withName("E3")
                            .withRelations(newAssociationEndBuilder().withName("ep4").withTarget(E1)
                                    .withCardinality(newCardinalityBuilder().withUpper(-1).build()).build()).build();

                    EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(a).build();

                    a.setTarget(E1);
                    a.setPartner(b);
                    b.setTarget(E2);
                    b.setPartner(a);
                    c.setTarget(E3);

                    Model model = newModelBuilder()
                            .withPackages(newPackageBuilder().withName("sandbox")
                                    .withElements(ImmutableList.of(E10, E11, E1, E2, E3)).build())
                            .withElements(ImmutableList.of(string, text, integer))
                            .withName("TEST").build();

                    psmModel.addContent(model);
                }),

                // Empty element name - should fail ElementNameNotEmpty
                ValidationTestCase.failing("EmptyElementName", psmModel -> {
                    StringType string = newStringTypeBuilder().withName("").withMaxLength(255).build();
                    Model m = newModelBuilder().withName("M").withElements(string).build();
                    psmModel.addContent(m);
                }, "ElementNameNotEmpty"),

                // Duplicate element names - should fail NamedElementIsUniqueInItsContainer
                ValidationTestCase.failing("DuplicateElementNames", psmModel -> {
                    StringType string1 = newStringTypeBuilder().withName("DuplicateName").withMaxLength(255).build();
                    StringType string2 = newStringTypeBuilder().withName("DuplicateName").withMaxLength(100).build();
                    Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(string1, string2)).build();
                    psmModel.addContent(m);
                }, "NamedElementIsUniqueInItsContainer"),

                // Invalid max length (zero) - should fail ValidMaxLength
                ValidationTestCase.failing("InvalidMaxLength", psmModel -> {
                    StringType string = newStringTypeBuilder().withName("InvalidString").withMaxLength(0).build();
                    Model m = newModelBuilder().withName("M").withElements(string).build();
                    psmModel.addContent(m);
                }, "ValidMaxLength"),

                // Scale >= precision - should fail ScaleIsLowerThanPrecision
                ValidationTestCase.failing("InvalidScale", psmModel -> {
                    NumericType numeric = newNumericTypeBuilder().withName("InvalidNumeric")
                            .withPrecision(5).withScale(5).build();
                    Model m = newModelBuilder().withName("M").withElements(numeric).build();
                    psmModel.addContent(m);
                }, "ScaleIsLowerThanPrecision"),

                // Invalid cardinality upper bound - should fail CardinalityUpperIsAtLeastOne
                ValidationTestCase.failing("InvalidCardinalityUpper", psmModel -> {
                    EntityType target = newEntityTypeBuilder().withName("Target").build();
                    EntityType source = newEntityTypeBuilder().withName("Source")
                            .withRelations(newAssociationEndBuilder()
                                    .withName("relation")
                                    .withTarget(target)
                                    .withCardinality(newCardinalityBuilder().withLower(0).withUpper(-2).build())
                                    .build())
                            .build();
                    Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(source, target)).build();
                    psmModel.addContent(m);
                }, "CardinalityUpperIsAtLeastOne"),

                // Negative cardinality lower bound - should fail CardinalityLowerIsGreaterThanOrEqualToZero
                ValidationTestCase.failing("NegativeCardinalityLower", psmModel -> {
                    EntityType target = newEntityTypeBuilder().withName("Target").build();
                    EntityType source = newEntityTypeBuilder().withName("Source")
                            .withRelations(newAssociationEndBuilder()
                                    .withName("relation")
                                    .withTarget(target)
                                    .withCardinality(newCardinalityBuilder().withLower(-1).withUpper(1).build())
                                    .build())
                            .build();
                    Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(source, target)).build();
                    psmModel.addContent(m);
                }, "CardinalityLowerIsGreaterThanOrEqualToZero"),

                // Lower > Upper - should fail CardinalityLowerMustBeLessOrEqualToUpper
                ValidationTestCase.failing("CardinalityLowerGreaterThanUpper", psmModel -> {
                    EntityType target = newEntityTypeBuilder().withName("Target").build();
                    EntityType source = newEntityTypeBuilder().withName("Source")
                            .withRelations(newAssociationEndBuilder()
                                    .withName("relation")
                                    .withTarget(target)
                                    .withCardinality(newCardinalityBuilder().withLower(5).withUpper(2).build())
                                    .build())
                            .build();
                    Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(source, target)).build();
                    psmModel.addContent(m);
                }, "CardinalityLowerMustBeLessOrEqualToUpper"),

                // Invalid precision (zero) - should fail ScaleIsLowerThanPrecision (since scale=0 is not < precision=0)
                ValidationTestCase.failing("InvalidPrecision", psmModel -> {
                    NumericType numeric = newNumericTypeBuilder().withName("InvalidNumeric").withPrecision(0).build();
                    Model m = newModelBuilder().withName("M").withElements(numeric).build();
                    psmModel.addContent(m);
                }, "ScaleIsLowerThanPrecision"),

                // Negative scale - should fail ValidScale
                ValidationTestCase.failing("NegativeScale", psmModel -> {
                    NumericType numeric = newNumericTypeBuilder().withName("InvalidNumeric")
                            .withPrecision(10).withScale(-1).build();
                    Model m = newModelBuilder().withName("M").withElements(numeric).build();
                    psmModel.addContent(m);
                }, "ValidScale")
        );

        // Generate test arguments for each combination of test case and validation engine
        return testCases.stream()
                .flatMap(tc -> Stream.of(
                        Arguments.of(tc, ValidationEngine.EVL),
                        Arguments.of(tc, ValidationEngine.JAVA)
                ));
    }

    @ParameterizedTest(name = "{0} with {1} validation")
    @MethodSource("validationTestCases")
    @DisplayName("Parameterized validation test")
    void testValidation(ValidationTestCase testCase, ValidationEngine engine) {
        log.info("Running test '{}' with {} validation", testCase.name, engine);

        // Setup the model
        testCase.modelSetup.accept(psmModel);

        // Run the appropriate validation engine
        Set<String> violations;
        if (engine == ValidationEngine.EVL) {
            violations = runEvlValidation();
        } else {
            violations = runJavaValidation();
        }

        log.info("  Violations found: {}", violations);
        log.info("  Expected constraints: {}", testCase.expectedConstraints);

        if (testCase.expectPass) {
            // For passing tests, expect no violations
            assertTrue(violations.isEmpty(),
                    String.format("Expected no violations but got: %s", violations));
        } else {
            // For failing tests, check that all expected constraints were violated
            for (String expectedConstraint : testCase.expectedConstraints) {
                assertTrue(violations.contains(expectedConstraint),
                        String.format("Expected constraint '%s' to be violated but it wasn't. Violations found: %s",
                                expectedConstraint, violations));
            }
        }
    }

    /**
     * Tests that both validation engines produce the same results for identical models.
     */
    static Stream<Arguments> consistencyTestCases() {
        return validationTestCases()
                .filter(args -> args.get()[1] == ValidationEngine.EVL)
                .map(args -> Arguments.of(args.get()[0]));
    }

    @ParameterizedTest(name = "Consistency: {0}")
    @MethodSource("consistencyTestCases")
    @DisplayName("EVL and Java validation consistency")
    void testValidationConsistency(ValidationTestCase testCase) {
        log.info("Testing consistency for '{}'", testCase.name);

        // Setup model for EVL
        testCase.modelSetup.accept(psmModel);
        Set<String> evlViolations = runEvlValidation();

        // Reset and setup model for Java
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(MODEL_URI))
                .build();
        testCase.modelSetup.accept(psmModel);
        Set<String> javaViolations = runJavaValidation();

        log.info("  EVL violations: {}", evlViolations);
        log.info("  Java violations: {}", javaViolations);

        // Check consistency for expected constraints
        for (String expectedConstraint : testCase.expectedConstraints) {
            boolean evlHas = evlViolations.contains(expectedConstraint);
            boolean javaHas = javaViolations.contains(expectedConstraint);

            assertEquals(evlHas, javaHas,
                    String.format("Constraint '%s' inconsistency: EVL=%s, Java=%s",
                            expectedConstraint, evlHas, javaHas));
        }
    }

    // ------------------------------------------------------------------------------------------------
    // EmbeddedOnBothSidesAreNotAllowed: only a real cycle (reverse relation targets the container) is reported.
    // See change: yaml-pipeline-adoption-blockers (D5)
    // ------------------------------------------------------------------------------------------------

    private static final String EMBEDDED_CYCLE = "EmbeddedOnBothSidesAreNotAllowed";

    private static Cardinality manyCardinality() {
        return newCardinalityBuilder().withLower(0).withUpper(-1).build();
    }

    private static AssociationEnd end(String name, EntityType target) {
        return newAssociationEndBuilder().withName(name).withTarget(target).withCardinality(manyCardinality()).build();
    }

    private static void pair(AssociationEnd a, EntityType ownerOfA, AssociationEnd b, EntityType ownerOfB) {
        ownerOfA.getRelations().add(a);
        ownerOfB.getRelations().add(b);
        a.setPartner(b);
        b.setPartner(a);
    }

    private static TransferObjectRelation relation(String name, MappedTransferObjectType owner,
                                                   MappedTransferObjectType target, AssociationEnd binding,
                                                   boolean embedded) {
        TransferObjectRelation r = newTransferObjectRelationBuilder().withName(name)
                .withTarget(target).withEmbedded(embedded).withBinding(binding).withCardinality(manyCardinality()).build();
        owner.getRelations().add(r);
        return r;
    }

    /** TP-1: T1.r1 embedded -> T2, T2.r2 embedded -> T1, bindings are partner ends. */
    private static void twoSidedCycle(PsmModel psmModel) {
        EntityType e1 = newEntityTypeBuilder().withName("E1").build();
        EntityType e2 = newEntityTypeBuilder().withName("E2").build();
        AssociationEnd end1 = end("end1", e2);
        AssociationEnd end2 = end("end2", e1);
        pair(end1, e1, end2, e2);
        MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName("T1").withEntityType(e1).build();
        MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName("T2").withEntityType(e2).build();
        relation("r1", t1, t2, end1, true);
        relation("r2", t2, t1, end2, true);
        psmModel.addContent(newModelBuilder().withName("M").withElements(ImmutableList.of(e1, e2, t1, t2)).build());
    }

    /** TP-2: rackinspect shape, the reverse relation targets a different transfer object of the same entity. */
    private static void rackInspectShape(PsmModel psmModel) {
        EntityType rackType = newEntityTypeBuilder().withName("RackType").build();
        EntityType rackElement = newEntityTypeBuilder().withName("RackElement").build();
        AssociationEnd rackElementEnd = end("rackElement", rackElement);
        AssociationEnd rackTypeEnd = end("rackType", rackType);
        pair(rackElementEnd, rackType, rackTypeEnd, rackElement);
        MappedTransferObjectType rackTypeTo = newMappedTransferObjectTypeBuilder().withName("RackTypeTO")
                .withEntityType(rackType).build();
        MappedTransferObjectType rackElementTo = newMappedTransferObjectTypeBuilder().withName("RackElementTO")
                .withEntityType(rackElement).build();
        MappedTransferObjectType rackTypeForRackElement = newMappedTransferObjectTypeBuilder()
                .withName("RackTypeForRackElement").withEntityType(rackType).build();
        relation("rackElement", rackTypeTo, rackElementTo, rackElementEnd, true);
        relation("rackType", rackElementTo, rackTypeForRackElement, rackTypeEnd, true);
        psmModel.addContent(newModelBuilder().withName("M")
                .withElements(ImmutableList.of(rackType, rackElement, rackTypeTo, rackElementTo, rackTypeForRackElement))
                .build());
    }

    /** TP-3: T1.r1 and T1.r2 both embedded -> T1, bound to the two ends of a self-association. */
    private static void selfAssociationCycle(PsmModel psmModel) {
        EntityType e1 = newEntityTypeBuilder().withName("E1").build();
        AssociationEnd end1 = end("end1", e1);
        AssociationEnd end2 = end("end2", e1);
        pair(end1, e1, end2, e1);
        MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName("T1").withEntityType(e1).build();
        relation("r1", t1, t1, end1, true);
        relation("r2", t1, t1, end2, true);
        psmModel.addContent(newModelBuilder().withName("M").withElements(ImmutableList.of(e1, t1)).build());
    }

    /** TP-4: reverse relation bound to the partner end, targeting the container, but not embedded. */
    private static void reverseNotEmbedded(PsmModel psmModel) {
        EntityType e1 = newEntityTypeBuilder().withName("E1").build();
        EntityType e2 = newEntityTypeBuilder().withName("E2").build();
        AssociationEnd end1 = end("end1", e2);
        AssociationEnd end2 = end("end2", e1);
        pair(end1, e1, end2, e2);
        MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName("T1").withEntityType(e1).build();
        MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName("T2").withEntityType(e2).build();
        relation("r1", t1, t2, end1, true);
        relation("r2", t2, t1, end2, false);
        psmModel.addContent(newModelBuilder().withName("M").withElements(ImmutableList.of(e1, e2, t1, t2)).build());
    }

    /** TP-5: reverse relation embedded and targeting the container, but bound to an end of another association. */
    private static void reverseBoundToOtherAssociation(PsmModel psmModel) {
        EntityType e1 = newEntityTypeBuilder().withName("E1").build();
        EntityType e2 = newEntityTypeBuilder().withName("E2").build();
        AssociationEnd end1 = end("end1", e2);
        AssociationEnd end2 = end("end2", e1);
        pair(end1, e1, end2, e2);
        AssociationEnd end3 = end("end3", e1);
        AssociationEnd end4 = end("end4", e2);
        pair(end3, e2, end4, e1);
        MappedTransferObjectType t1 = newMappedTransferObjectTypeBuilder().withName("T1").withEntityType(e1).build();
        MappedTransferObjectType t2 = newMappedTransferObjectTypeBuilder().withName("T2").withEntityType(e2).build();
        relation("r1", t1, t2, end1, true);
        relation("r2", t2, t1, end3, true);
        psmModel.addContent(newModelBuilder().withName("M").withElements(ImmutableList.of(e1, e2, t1, t2)).build());
    }

    /** Scenario name, model setup, relation names expected to be reported by {@value #EMBEDDED_CYCLE}. */
    static Stream<Arguments> embeddedCycleScenarios() {
        List<Arguments> scenarios = Arrays.asList(
                Arguments.of("TP-1 two-sided cycle", (Consumer<PsmModel>) PsmValidationParameterizedTest::twoSidedCycle,
                        new TreeSet<>(Arrays.asList("r1", "r2"))),
                Arguments.of("TP-2 rackinspect shape", (Consumer<PsmModel>) PsmValidationParameterizedTest::rackInspectShape,
                        new TreeSet<String>()),
                Arguments.of("TP-3 self-association cycle", (Consumer<PsmModel>) PsmValidationParameterizedTest::selfAssociationCycle,
                        new TreeSet<>(Arrays.asList("r1", "r2"))),
                Arguments.of("TP-4 reverse not embedded", (Consumer<PsmModel>) PsmValidationParameterizedTest::reverseNotEmbedded,
                        new TreeSet<String>()),
                Arguments.of("TP-5 reverse bound to another association",
                        (Consumer<PsmModel>) PsmValidationParameterizedTest::reverseBoundToOtherAssociation,
                        new TreeSet<String>()));
        return scenarios.stream().flatMap(a -> Stream.of(
                Arguments.of(a.get()[0], a.get()[1], a.get()[2], ValidationEngine.EVL),
                Arguments.of(a.get()[0], a.get()[1], a.get()[2], ValidationEngine.JAVA)));
    }

    /** Names of the relations reported by {@value #EMBEDDED_CYCLE}, empty when none is reported. */
    private Set<String> embeddedCycleRelations(ValidationEngine engine) {
        Set<String> relations = new TreeSet<>();
        if (engine == ValidationEngine.JAVA) {
            for (ValidationResult r : PsmValidator.validate(log, psmModel)) {
                if (EMBEDDED_CYCLE.equals(r.getConstraintName())) {
                    relations.add(((TransferObjectRelation) r.getContext()).getName());
                }
            }
            return relations;
        }
        try (BufferedSlf4jLogger bufferedLog = new BufferedSlf4jLogger(log)) {
            PsmEpsilonValidator.validatePsm(bufferedLog, psmModel, PsmEpsilonValidator.calculatePsmValidationScriptURI(),
                    Collections.emptyList(), Collections.emptyList());
        } catch (hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException ex) {
            // message format: "EmbeddedOnBothSidesAreNotAllowed|Circular aggregation found on relation: M::E2.r2"
            for (String error : ex.getUnexpectedErrors()) {
                if (error.startsWith(EMBEDDED_CYCLE + "|")) {
                    relations.add(error.substring(error.lastIndexOf('.') + 1).trim());
                }
            }
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
        return relations;
    }

    private void reloadThroughXmi() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        psmModel.savePsmModel(PsmModel.SaveArguments.psmSaveArgumentsBuilder().outputStream(out).validateModel(false));
        psmModel = PsmModel.buildPsmModel().uri(URI.createURI(MODEL_URI)).build();
        psmModel.loadResource(PsmModel.LoadArguments.psmLoadArgumentsBuilder()
                .inputStream(new ByteArrayInputStream(out.toByteArray())).validateModel(false));
    }

    @ParameterizedTest(name = "{0} with {3} validation")
    @MethodSource("embeddedCycleScenarios")
    @DisplayName("Embedded cycle rule reports only real cycles")
    void testEmbeddedCycleRule(String scenario, Consumer<PsmModel> modelSetup, Set<String> expected,
                               ValidationEngine engine) {
        modelSetup.accept(psmModel);
        assertEquals(expected, embeddedCycleRelations(engine), scenario + " / " + engine);
    }

    @ParameterizedTest(name = "{0} with {3} validation after XMI reload")
    @MethodSource("embeddedCycleScenarios")
    @DisplayName("Embedded cycle rule gives the same result after an XMI save/reload")
    void testEmbeddedCycleRuleAfterXmiReload(String scenario, Consumer<PsmModel> modelSetup, Set<String> expected,
                                             ValidationEngine engine) throws Exception {
        modelSetup.accept(psmModel);
        reloadThroughXmi();
        assertEquals(expected, embeddedCycleRelations(engine), scenario + " / " + engine + " / reloaded");
    }

    @ParameterizedTest(name = "Consistency: {0}")
    @MethodSource("embeddedCycleConsistencyScenarios")
    @DisplayName("EVL and Java agree on the embedded cycle rule")
    void testEmbeddedCycleRuleConsistency(String scenario, Consumer<PsmModel> modelSetup) {
        modelSetup.accept(psmModel);
        Set<String> evl = embeddedCycleRelations(ValidationEngine.EVL);
        psmModel = PsmModel.buildPsmModel().uri(URI.createURI(MODEL_URI)).build();
        modelSetup.accept(psmModel);
        Set<String> java = embeddedCycleRelations(ValidationEngine.JAVA);
        assertEquals(evl, java, scenario);
    }

    static Stream<Arguments> embeddedCycleConsistencyScenarios() {
        return embeddedCycleScenarios()
                .filter(a -> a.get()[3] == ValidationEngine.EVL)
                .map(a -> Arguments.of(a.get()[0], a.get()[1]));
    }

    /** TP-6: Northwind has no circular aggregation, in either engine. */
    @ParameterizedTest(name = "Northwind with {0} validation")
    @MethodSource("engines")
    @DisplayName("Northwind reports no embedded cycle")
    void testNorthwindHasNoEmbeddedCycle(ValidationEngine engine) {
        psmModel = new Demo().fullDemo();
        assertEquals(Collections.emptySet(), embeddedCycleRelations(engine));
    }

    static Stream<ValidationEngine> engines() {
        return Stream.of(ValidationEngine.EVL, ValidationEngine.JAVA);
    }
}
