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
import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.meta.psm.validation.PsmJavaValidationException;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for PsmValidator Java-based validation.
 * These tests verify that the Java validation rules produce the same results as EVL.
 */
@Slf4j
class PsmJavaValidationTest {

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;

    @BeforeEach
    void setUp() {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .build();
    }

    private void runJavaValidation(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        try {
            PsmValidator.validatePsm(log, psmModel, expectedErrors, expectedWarnings);
        } catch (PsmJavaValidationException ex) {
            log.error("Java validation failed: {}", ex.getMessage());
            throw ex;
        }
    }

    private List<ValidationResult> getValidationResults() {
        return PsmValidator.validate(log, psmModel);
    }

    @Test
    void testValidModel() throws Exception {
        log.info("Testing valid model with Java validation");

        EntityType E10 = newEntityTypeBuilder().withName("E10").build();
        EntityType E11 = newEntityTypeBuilder().withName("E11").withAbstract_(true).build();

        AssociationEnd b = newAssociationEndBuilder().withName("ep2").withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build();
        AssociationEnd c = newAssociationEndBuilder().withName("ep3").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();
        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        EntityType E1 = newEntityTypeBuilder().withName("E1").withAttributes(
                newAttributeBuilder().withName("a1").withDataType(string).withRequired(true).withIdentifier(true).build()
        ).withRelations(
                ImmutableList.of(b, c)
        ).withSuperEntityTypes(ImmutableList.of(E10, E11)).build();

        StringType text = newStringTypeBuilder().withName("Text").withMaxLength(255).build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
        AssociationEnd a = newAssociationEndBuilder().withName("ep1").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();

        EntityType E3 = newEntityTypeBuilder().withName("E3").withRelations(newAssociationEndBuilder().withName("ep4").withTarget(E1).withCardinality(newCardinalityBuilder().withUpper(-1).build()).build()).build();

        EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(a).build();

        EntityType S2 = newEntityTypeBuilder().withName("S2").withRelations(
                newAssociationEndBuilder().withName("endpoint").withTarget(E2).withCardinality(newCardinalityBuilder().build()).build()
        ).build();

        EntityType S1 = newEntityTypeBuilder().withName("S1").withRelations(ImmutableList.of(
                newAssociationEndBuilder().withName("ep5").withTarget(E1).withCardinality(newCardinalityBuilder().build()).build(),
                newAssociationEndBuilder().withName("s2").withTarget(S2).withCardinality(newCardinalityBuilder().build()).build()
        )).build();

        a.setTarget(E1);
        a.setPartner(b);
        b.setTarget(E2);
        b.setPartner(a);
        c.setTarget(E3);

        Model test = newModelBuilder().withPackages(newPackageBuilder().withName("sandbox").withElements(ImmutableList.of(
                E10,
                E11,
                E1,
                E2,
                E3,
                S1,
                S2
        )).build()).withElements(ImmutableList.of(
                string,
                text,
                integer
        )).withName("TEST").build();

        psmModel.addContent(test);
        
        List<ValidationResult> results = getValidationResults();
        log.info("Java validation found {} issues", results.size());
        results.forEach(r -> log.debug("  - {}: {}", r.getConstraintName(), r.getMessage()));
        
        // Valid model should have no errors
        runJavaValidation(Collections.emptyList(), Collections.emptyList());
    }

    @Test
    void testElementNameNotEmpty() throws Exception {
        log.info("Testing constraint: ElementNameNotEmpty");

        StringType string = newStringTypeBuilder().withName("").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M").withElements(string).build();

        psmModel.addContent(m);

        List<ValidationResult> results = getValidationResults();
        
        // Check that we get an error for empty name
        boolean hasEmptyNameError = results.stream()
                .anyMatch(r -> "ElementNameNotEmpty".equals(r.getConstraintName()));
        
        assertTrue(hasEmptyNameError, "Expected ElementNameNotEmpty constraint violation");
    }

    @Test
    void testNamedElementIsUniqueInItsContainer() throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        StringType string1 = newStringTypeBuilder().withName("DuplicateName").withMaxLength(255).build();
        StringType string2 = newStringTypeBuilder().withName("DuplicateName").withMaxLength(100).build();
        
        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(string1, string2)).build();

        psmModel.addContent(m);

        List<ValidationResult> results = getValidationResults();
        
        // Check that we get an error for duplicate names
        boolean hasDuplicateNameError = results.stream()
                .anyMatch(r -> "NamedElementIsUniqueInItsContainer".equals(r.getConstraintName()));
        
        assertTrue(hasDuplicateNameError, "Expected NamedElementIsUniqueInItsContainer constraint violation");
    }

    @Test
    void testValidMaxLength() throws Exception {
        log.info("Testing constraint: ValidMaxLength");

        StringType string = newStringTypeBuilder().withName("InvalidString").withMaxLength(0).build();
        Model m = newModelBuilder().withName("M").withElements(string).build();

        psmModel.addContent(m);

        List<ValidationResult> results = getValidationResults();
        
        // Check that we get an error for zero max length
        boolean hasMaxLengthError = results.stream()
                .anyMatch(r -> "ValidMaxLength".equals(r.getConstraintName()));
        
        assertTrue(hasMaxLengthError, "Expected ValidMaxLength constraint violation");
    }

    @Test
    void testScaleIsLowerThanPrecision() throws Exception {
        log.info("Testing constraint: ScaleIsLowerThanPrecision");

        // Create a numeric with scale >= precision (invalid)
        NumericType numeric = newNumericTypeBuilder().withName("InvalidNumeric").withPrecision(5).withScale(5).build();
        Model m = newModelBuilder().withName("M").withElements(numeric).build();

        psmModel.addContent(m);

        List<ValidationResult> results = getValidationResults();
        
        // Check that we get an error for scale not less than precision
        boolean hasScaleError = results.stream()
                .anyMatch(r -> "ScaleIsLowerThanPrecision".equals(r.getConstraintName()));
        
        assertTrue(hasScaleError, "Expected ScaleIsLowerThanPrecision constraint violation");
    }

    @Test
    void testCardinalityUpperIsAtLeastOne() throws Exception {
        log.info("Testing constraint: CardinalityUpperIsAtLeastOne");

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

        List<ValidationResult> results = getValidationResults();
        
        // Check that we get an error for invalid upper bound
        boolean hasUpperError = results.stream()
                .anyMatch(r -> "CardinalityUpperIsAtLeastOne".equals(r.getConstraintName()));
        
        assertTrue(hasUpperError, "Expected CardinalityUpperIsAtLeastOne constraint violation");
    }

    @Test
    void testValidationResultsContainCorrectInfo() throws Exception {
        log.info("Testing that validation results contain correct information");

        StringType string = newStringTypeBuilder().withName("").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M").withElements(string).build();

        psmModel.addContent(m);

        List<ValidationResult> results = getValidationResults();
        
        assertFalse(results.isEmpty(), "Expected at least one validation result");
        
        ValidationResult firstResult = results.get(0);
        assertNotNull(firstResult.getConstraintName(), "Constraint name should not be null");
        assertNotNull(firstResult.getMessage(), "Message should not be null");
        assertNotNull(firstResult.getSeverity(), "Severity should not be null");
    }
}
