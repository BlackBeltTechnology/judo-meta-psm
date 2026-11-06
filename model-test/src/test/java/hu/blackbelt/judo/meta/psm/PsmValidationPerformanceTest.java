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
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Performance comparison tests between Java and EVL validation.
 * 
 * <p>This test generates a model with 1000 elements and compares the
 * execution time of Java-based validation vs EVL-based validation.</p>
 */
@Slf4j
class PsmValidationPerformanceTest {

    private static final int ENTITY_COUNT = 100;
    private static final int ATTRIBUTES_PER_ENTITY = 5;
    private static final int RELATIONS_PER_ENTITY = 3;
    private static final int WARMUP_ITERATIONS = 3;
    private static final int TEST_ITERATIONS = 5;

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;

    @BeforeEach
    void setUp() {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .build();
    }

    /**
     * Generate a model with approximately 1000 elements.
     * 
     * <p>Creates:</p>
     * <ul>
     *   <li>100 EntityTypes</li>
     *   <li>500 Attributes (5 per entity)</li>
     *   <li>300 Relations (3 per entity)</li>
     *   <li>2 primitive types</li>
     *   <li>10 packages</li>
     * </ul>
     * 
     * <p>Total: ~1000 elements</p>
     */
    private void generateLargeModel() {
        // Create primitive types
        StringType stringType = newStringTypeBuilder()
                .withName("String")
                .withMaxLength(255)
                .build();
        
        NumericType integerType = newNumericTypeBuilder()
                .withName("Integer")
                .withPrecision(10)
                .withScale(0)
                .build();

        // Create entities
        List<EntityType> entities = new ArrayList<>();
        for (int i = 0; i < ENTITY_COUNT; i++) {
            // Create attributes for this entity
            List<Attribute> attributes = new ArrayList<>();
            for (int j = 0; j < ATTRIBUTES_PER_ENTITY; j++) {
                Attribute attr = newAttributeBuilder()
                        .withName("attr_" + i + "_" + j)
                        .withDataType(j % 2 == 0 ? stringType : integerType)
                        .withRequired(j == 0)
                        .build();
                attributes.add(attr);
            }

            EntityType entity = newEntityTypeBuilder()
                    .withName("Entity" + i)
                    .withAttributes(attributes)
                    .build();
            entities.add(entity);
        }

        // Create relations between entities
        for (int i = 0; i < ENTITY_COUNT; i++) {
            EntityType source = entities.get(i);
            List<AssociationEnd> relations = new ArrayList<>();
            
            for (int j = 0; j < RELATIONS_PER_ENTITY; j++) {
                int targetIdx = (i + j + 1) % ENTITY_COUNT;
                EntityType target = entities.get(targetIdx);
                
                AssociationEnd relation = newAssociationEndBuilder()
                        .withName("rel_" + i + "_" + j)
                        .withTarget(target)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(0)
                                .withUpper(j == 0 ? 1 : -1)
                                .build())
                        .build();
                relations.add(relation);
            }
            
            source.getRelations().addAll(relations);
        }

        // Create packages to organize entities
        List<Package> packages = new ArrayList<>();
        int entitiesPerPackage = ENTITY_COUNT / 10;
        for (int i = 0; i < 10; i++) {
            List<EntityType> packageEntities = entities.subList(
                    i * entitiesPerPackage, 
                    (i + 1) * entitiesPerPackage
            );
            
            Package pkg = newPackageBuilder()
                    .withName("package" + i)
                    .withElements(new ArrayList<>(packageEntities))
                    .build();
            packages.add(pkg);
        }

        // Create model
        Model model = newModelBuilder()
                .withName("PerformanceTestModel")
                .withElements(ImmutableList.of(stringType, integerType))
                .withPackages(packages)
                .build();

        psmModel.addContent(model);
        
        // Count total elements
        int totalElements = countElements();
        log.info("Generated model with {} total elements", totalElements);
        log.info("  - {} EntityTypes", ENTITY_COUNT);
        log.info("  - {} Attributes", ENTITY_COUNT * ATTRIBUTES_PER_ENTITY);
        log.info("  - {} Relations", ENTITY_COUNT * RELATIONS_PER_ENTITY);
        log.info("  - 2 primitive types");
        log.info("  - 10 packages");
    }

    private int countElements() {
        int count = 0;
        for (var resource : psmModel.getResourceSet().getResources()) {
            var iterator = resource.getAllContents();
            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }
        }
        return count;
    }

    @Test
    void testPerformanceComparison() throws Exception {
        log.info("=== PSM Validation Performance Test ===");
        log.info("Generating large model...");
        
        generateLargeModel();
        
        assertTrue(psmModel.isValid(), "Generated model should be valid");

        // Warmup phase
        log.info("\n--- Warmup Phase ({} iterations) ---", WARMUP_ITERATIONS);
        for (int i = 0; i < WARMUP_ITERATIONS; i++) {
            runJavaValidation();
            runEvlValidation();
        }

        // Test phase
        log.info("\n--- Test Phase ({} iterations) ---", TEST_ITERATIONS);
        
        List<Long> javaTimings = new ArrayList<>();
        List<Long> evlTimings = new ArrayList<>();
        
        for (int i = 0; i < TEST_ITERATIONS; i++) {
            log.info("\nIteration {}", i + 1);
            
            // Java validation
            long javaStart = System.nanoTime();
            List<ValidationResult> javaResults = runJavaValidation();
            long javaEnd = System.nanoTime();
            long javaTime = (javaEnd - javaStart) / 1_000_000; // Convert to ms
            javaTimings.add(javaTime);
            log.info("  Java validation: {} ms ({} results)", javaTime, javaResults.size());
            
            // EVL validation
            long evlStart = System.nanoTime();
            runEvlValidation();
            long evlEnd = System.nanoTime();
            long evlTime = (evlEnd - evlStart) / 1_000_000; // Convert to ms
            evlTimings.add(evlTime);
            log.info("  EVL validation:  {} ms", evlTime);
        }

        // Calculate statistics
        double javaAvg = javaTimings.stream().mapToLong(Long::longValue).average().orElse(0);
        double evlAvg = evlTimings.stream().mapToLong(Long::longValue).average().orElse(0);
        long javaMin = javaTimings.stream().mapToLong(Long::longValue).min().orElse(0);
        long javaMax = javaTimings.stream().mapToLong(Long::longValue).max().orElse(0);
        long evlMin = evlTimings.stream().mapToLong(Long::longValue).min().orElse(0);
        long evlMax = evlTimings.stream().mapToLong(Long::longValue).max().orElse(0);
        
        double speedup = evlAvg / javaAvg;

        // Print results
        log.info("\n=== Performance Results ===");
        log.info("Java Validation:");
        log.info("  Average: {} ms", String.format("%.2f", javaAvg));
        log.info("  Min:     {} ms", javaMin);
        log.info("  Max:     {} ms", javaMax);
        log.info("EVL Validation:");
        log.info("  Average: {} ms", String.format("%.2f", evlAvg));
        log.info("  Min:     {} ms", evlMin);
        log.info("  Max:     {} ms", evlMax);
        log.info("Speedup: {}x", String.format("%.2f", speedup));
        
        // Log formatted summary for easy reading
        log.info("\n+----------------------+------------+------------+------------+");
        log.info("| Validation Type      | Avg (ms)   | Min (ms)   | Max (ms)   |");
        log.info("+----------------------+------------+------------+------------+");
        log.info(String.format("| Java                 | %10.2f | %10d | %10d |", javaAvg, javaMin, javaMax));
        log.info(String.format("| EVL                  | %10.2f | %10d | %10d |", evlAvg, evlMin, evlMax));
        log.info("+----------------------+------------+------------+------------+");
        log.info(String.format("| Speedup              | %10.2fx |            |            |", speedup));
        log.info("+----------------------+------------+------------+------------+");
    }

    @Test
    void testJavaValidationOnLargeModel() throws Exception {
        log.info("Testing Java validation on large model");
        
        generateLargeModel();
        
        long start = System.nanoTime();
        List<ValidationResult> results = runJavaValidation();
        long elapsed = (System.nanoTime() - start) / 1_000_000;
        
        log.info("Java validation completed in {} ms", elapsed);
        log.info("Found {} validation issues", results.size());
        
        // The generated model should be valid (no errors expected)
        long errorCount = results.stream()
                .filter(r -> r.getSeverity() == hu.blackbelt.judo.zeta.validation.core.Severity.ERROR)
                .count();
        
        assertEquals(0, errorCount, "Generated model should have no validation errors");
    }

    @Test
    void testEvlValidationOnLargeModel() throws Exception {
        log.info("Testing EVL validation on large model");
        
        generateLargeModel();
        
        long start = System.nanoTime();
        runEvlValidation();
        long elapsed = (System.nanoTime() - start) / 1_000_000;
        
        log.info("EVL validation completed in {} ms", elapsed);
    }

    private List<ValidationResult> runJavaValidation() {
        return PsmValidator.validate(log, psmModel);
    }

    private void runEvlValidation() throws Exception {
        try (BufferedSlf4jLogger bufferedLog = new BufferedSlf4jLogger(log)) {
            PsmEpsilonValidator.validatePsm(
                    bufferedLog,
                    psmModel,
                    PsmEpsilonValidator.calculatePsmValidationScriptURI(),
                    Collections.emptyList(),
                    Collections.emptyList()
            );
        }
    }
}
