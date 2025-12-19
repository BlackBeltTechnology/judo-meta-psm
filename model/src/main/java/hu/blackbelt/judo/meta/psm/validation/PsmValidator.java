package hu.blackbelt.judo.meta.psm.validation;

/*-
 * #%L
 * Judo :: Psm :: Model
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

import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.validation.rules.accesspoint.ActorTypeValidations;
import hu.blackbelt.judo.meta.psm.validation.rules.data.*;
import hu.blackbelt.judo.meta.psm.validation.rules.derived.*;
import hu.blackbelt.judo.meta.psm.validation.rules.measure.*;
import hu.blackbelt.judo.meta.psm.validation.rules.namespace.ModelValidations;
import hu.blackbelt.judo.meta.psm.validation.rules.namespace.NamedElementValidations;
import hu.blackbelt.judo.meta.psm.validation.rules.service.*;
import hu.blackbelt.judo.meta.psm.validation.rules.type.*;
import hu.blackbelt.judo.zeta.common.ExtensionMethodRegistry;
import hu.blackbelt.judo.zeta.validation.core.*;
import org.eclipse.emf.ecore.EObject;
import org.slf4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Java-based validator for PSM models using the Zeta validation framework.
 * This validator provides equivalent functionality to the EVL-based validation
 * but with significantly better performance.
 */
public class PsmValidator {

    private static final List<Class<?>> VALIDATION_RULE_CLASSES = Arrays.asList(
            // Namespace validations
            NamedElementValidations.class,
            ModelValidations.class,
            // Type validations
            PrimitiveValidations.class,
            StringValidations.class,
            NumericValidations.class,
            TimestampValidations.class,
            TimeValidations.class,
            EnumerationTypeValidations.class,
            EnumerationMemberValidations.class,
            // Data validations
            CardinalityValidations.class,
            AttributeValidations.class,
            AssociationEndValidations.class,
            RelationValidations.class,
            EntityTypeValidations.class,
            EntitySequenceValidations.class,
            // Derived validations
            DataPropertyValidations.class,
            NavigationPropertyValidations.class,
            PrimitiveAccessorValidations.class,
            ReferenceAccessorValidations.class,
            StaticDataValidations.class,
            StaticNavigationValidations.class,
            // Measure validations
            MeasureValidations.class,
            UnitValidations.class,
            DerivedMeasureValidations.class,
            DurationUnitValidations.class,
            // Service validations
            TransferObjectTypeValidations.class,
            MappedTransferObjectTypeValidations.class,
            TransferAttributeValidations.class,
            TransferObjectRelationValidations.class,
            BoundOperationValidations.class,
            UnboundOperationValidations.class,
            BoundBehaviourValidations.class,
            ParameterValidations.class,
            InvariantConstraintValidations.class,
            GetPrincipalBehaviourValidations.class,
            GetRangeBehaviourValidations.class,
            GetTemplateBehaviourValidations.class,
            // Access point validations
            ActorTypeValidations.MappedTransferObjectActorTypeValidations.class,
            ActorTypeValidations.UnmappedTransferObjectActorTypeValidations.class
    );

    private PsmValidator() {
        // Utility class
    }

    /**
     * Validates a PSM model and returns all validation results.
     *
     * @param log      the logger to use
     * @param psmModel the PSM model to validate
     * @return list of validation results (errors and warnings)
     */
    public static List<ValidationResult> validate(Logger log, PsmModel psmModel) {
        PsmModelProvider modelProvider = new PsmModelProvider(psmModel);
        ValidationRegistry registry = new ValidationRegistry();

        // Register all validation rule classes
        for (Class<?> ruleClass : VALIDATION_RULE_CLASSES) {
            registry.register(ruleClass);
        }

        // Create validation context
        ValidationContext context = new ValidationContext(
                modelProvider,
                modelProvider.getResourceSet(),
                new ExtensionMethodRegistry()
        );
        context.setValidationRegistry(registry);

        // Create executor and run validation
        ValidationExecutor executor = new ValidationExecutor(registry, context, false);
        
        // Get all model elements
        Collection<EObject> allElements = new ArrayList<>();
        psmModel.getResourceSet().getAllContents().forEachRemaining(obj -> {
            if (obj instanceof EObject) {
                allElements.add((EObject) obj);
            }
        });
        
        List<ValidationResult> results = executor.validate(allElements);

        if (log.isDebugEnabled()) {
            log.debug("Java validation found {} issues", results.size());
            for (ValidationResult result : results) {
                log.debug("  - [{}] {}: {}", result.getSeverity(), result.getConstraintName(), result.getMessage());
            }
        }

        return results;
    }

    /**
     * Validates a PSM model and throws an exception if there are any errors.
     *
     * @param log      the logger to use
     * @param psmModel the PSM model to validate
     * @throws PsmModel.PsmValidationException if validation fails with errors
     */
    public static void validatePsm(Logger log, PsmModel psmModel) throws PsmModel.PsmValidationException {
        List<ValidationResult> results = validate(log, psmModel);

        // Check for errors
        List<ValidationResult> errors = results.stream()
                .filter(r -> r.getSeverity() == Severity.ERROR)
                .collect(Collectors.toList());

        // Log warnings
        results.stream()
                .filter(r -> r.getSeverity() == Severity.WARNING)
                .forEach(w -> log.warn("[{}] {}", w.getConstraintName(), w.getMessage()));

        if (!errors.isEmpty()) {
            for (ValidationResult error : errors) {
                log.error("[{}] {}", error.getConstraintName(), error.getMessage());
            }
            throw new PsmModel.PsmValidationException(psmModel);
        }
    }

    /**
     * Validates a PSM model and throws an exception if there are unexpected errors or warnings.
     *
     * @param log              the logger to use
     * @param psmModel         the PSM model to validate
     * @param expectedErrors   collection of expected error messages in format "ConstraintName|message"
     * @param expectedWarnings collection of expected warning messages in format "ConstraintName|message"
     * @throws PsmJavaValidationException if validation fails with unexpected results
     */
    public static void validatePsm(Logger log, PsmModel psmModel,
                                    Collection<String> expectedErrors,
                                    Collection<String> expectedWarnings) throws PsmJavaValidationException {
        List<ValidationResult> results = validate(log, psmModel);

        // Separate errors and warnings
        List<ValidationResult> errors = results.stream()
                .filter(r -> r.getSeverity() == Severity.ERROR)
                .collect(Collectors.toList());

        List<ValidationResult> warnings = results.stream()
                .filter(r -> r.getSeverity() == Severity.WARNING)
                .collect(Collectors.toList());

        // Convert results to comparable format
        Set<String> actualErrors = errors.stream()
                .map(r -> r.getConstraintName() + "|" + r.getMessage())
                .collect(Collectors.toSet());

        Set<String> actualWarnings = warnings.stream()
                .map(r -> r.getConstraintName() + "|" + r.getMessage())
                .collect(Collectors.toSet());

        // Find unexpected and missing
        Set<String> expectedErrorSet = new HashSet<>(expectedErrors);
        Set<String> expectedWarningSet = new HashSet<>(expectedWarnings);

        Set<String> unexpectedErrors = new HashSet<>(actualErrors);
        unexpectedErrors.removeAll(expectedErrorSet);

        Set<String> errorsNotFound = new HashSet<>(expectedErrorSet);
        errorsNotFound.removeAll(actualErrors);

        Set<String> unexpectedWarnings = new HashSet<>(actualWarnings);
        unexpectedWarnings.removeAll(expectedWarningSet);

        Set<String> warningsNotFound = new HashSet<>(expectedWarningSet);
        warningsNotFound.removeAll(actualWarnings);

        // Check if validation passed
        boolean hasUnexpected = !unexpectedErrors.isEmpty() || !unexpectedWarnings.isEmpty();
        boolean hasMissing = !errorsNotFound.isEmpty() || !warningsNotFound.isEmpty();

        if (hasUnexpected || hasMissing) {
            StringBuilder message = new StringBuilder("Java validation failed:\n");
            if (!unexpectedErrors.isEmpty()) {
                message.append("  Unexpected errors: ").append(unexpectedErrors).append("\n");
            }
            if (!errorsNotFound.isEmpty()) {
                message.append("  Errors not found: ").append(errorsNotFound).append("\n");
            }
            if (!unexpectedWarnings.isEmpty()) {
                message.append("  Unexpected warnings: ").append(unexpectedWarnings).append("\n");
            }
            if (!warningsNotFound.isEmpty()) {
                message.append("  Warnings not found: ").append(warningsNotFound).append("\n");
            }

            throw new PsmJavaValidationException(
                    message.toString(),
                    results,
                    unexpectedErrors,
                    errorsNotFound,
                    unexpectedWarnings,
                    warningsNotFound
            );
        }

        log.info("Java validation passed: {} errors, {} warnings (all expected)",
                errors.size(), warnings.size());
    }
}
