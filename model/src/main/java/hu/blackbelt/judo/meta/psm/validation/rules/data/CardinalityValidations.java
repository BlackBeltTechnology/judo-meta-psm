package hu.blackbelt.judo.meta.psm.validation.rules.data;

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

import hu.blackbelt.judo.meta.psm.type.Cardinality;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for Cardinality.
 * Corresponds to validations/data/cardinality.evl
 */
@ValidationContext(Cardinality.class)
public class CardinalityValidations {

    // Constraint/Critique name constants
    private static final String CARDINALITY_LOWER_IS_GREATER_THAN_OR_EQUAL_TO_ZERO = "CardinalityLowerIsGreaterThanOrEqualToZero";
    private static final String CARDINALITY_LOWER_MUST_BE_LESS_OR_EQUAL_TO_UPPER = "CardinalityLowerMustBeLessOrEqualToUpper";
    private static final String CARDINALITY_UPPER_IS_AT_LEAST_ONE = "CardinalityUpperIsAtLeastOne";


    private String getContainerName(Cardinality self) {
        if (self.eContainer() instanceof NamedElement) {
            return ((NamedElement) self.eContainer()).getName();
        }
        return String.valueOf(self.eContainer());
    }

    @Constraint(name = CARDINALITY_LOWER_IS_GREATER_THAN_OR_EQUAL_TO_ZERO, message = "Lower must be greater than or equal to zero")
    public ValidationRule cardinalityLowerIsGreaterThanOrEqualToZero() {
        return (element, context) -> {
            Cardinality self = (Cardinality) element;
            // Guard: container must be defined
            if (self.eContainer() == null) {
                return ValidationResult.pass();
            }

            if (self.getLower() < 0) {
                return ValidationResult.fail(
                        CARDINALITY_LOWER_IS_GREATER_THAN_OR_EQUAL_TO_ZERO,
                        "Lower attribute of element: " + getContainerName(self) + " must be greater than or equal to zero",
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = CARDINALITY_LOWER_MUST_BE_LESS_OR_EQUAL_TO_UPPER, message = "Lower must be less or equal to upper")
    public ValidationRule cardinalityLowerMustBeLessOrEqualToUpper() {
        return (element, context) -> {
            Cardinality self = (Cardinality) element;
            // Guard: container must be defined
            if (self.eContainer() == null) {
                return ValidationResult.pass();
            }

            // -1 means unbounded, so skip this check
            if (self.getUpper() == -1) {
                return ValidationResult.pass();
            }

            if (self.getLower() > self.getUpper()) {
                return ValidationResult.fail(
                        CARDINALITY_LOWER_MUST_BE_LESS_OR_EQUAL_TO_UPPER,
                        "Lower (" + self.getLower() + ") must be less or equal to upper (" + self.getUpper() + ") of element: " + getContainerName(self),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = CARDINALITY_UPPER_IS_AT_LEAST_ONE, message = "Upper must be at least 1 or -1 (unbounded)")
    public ValidationRule cardinalityUpperIsAtLeastOne() {
        return (element, context) -> {
            Cardinality self = (Cardinality) element;
            // Guard: container must be defined
            if (self.eContainer() == null) {
                return ValidationResult.pass();
            }

            if (self.getUpper() <= 0 && self.getUpper() != -1) {
                return ValidationResult.fail(
                        CARDINALITY_UPPER_IS_AT_LEAST_ONE,
                        "Invalid upper attribute of element: " + getContainerName(self),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }
}
