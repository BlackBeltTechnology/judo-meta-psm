package hu.blackbelt.judo.meta.psm.validation.rules.measure;

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

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for Measure.
 * Corresponds to validations/measure/measure.evl
 */
@ValidationContext(Measure.class)
public class MeasureValidations {

    @Critique(name = "BaseUnitShouldBeDefined", message = "No base unit is defined for measure")
    public ValidationRule baseUnitShouldBeDefined() {
        return (element, context) -> {
            Measure self = (Measure) element;
        boolean hasBaseUnit = self.getUnits().stream()
                .anyMatch(u -> u.getRateDividend() == u.getRateDivisor());

        if (!hasBaseUnit) {
            return ValidationResult.fail(
                    "BaseUnitShouldBeDefined",
                    "No base unit is defined for measure: " + self.getName(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Critique(name = "MeasureNameIsUnique", message = "Measure name is not unique")
    public ValidationRule measureNameIsUnique() {
        return (element, context) -> {
            Measure self = (Measure) element;
        boolean hasDuplicate = context.getAllInstances(Measure.class).stream()
                .filter(m -> m != self)
                .anyMatch(m -> m.getName() != null && self.getName() != null
                        && m.getName().equals(self.getName()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "MeasureNameIsUnique",
                    "There are two or more measures of the same name: " + self.getName(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "MeasureSymbolIsUnique", message = "Measure symbol is not unique")
    public ValidationRule measureSymbolIsUnique() {
        return (element, context) -> {
            Measure self = (Measure) element;
        // Guard: symbol must be defined
        if (self.getSymbol() == null || self.getSymbol().isEmpty()) {
            return ValidationResult.pass();
        }

        boolean hasDuplicate = context.getAllInstances(Measure.class).stream()
                .filter(m -> m != self)
                .anyMatch(m -> m.getSymbol() != null && m.getSymbol().equals(self.getSymbol()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "MeasureSymbolIsUnique",
                    "Measure symbol is not unique: " + self.getSymbol() + " (measure: " + self.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
