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
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for Unit.
 * Corresponds to validations/measure/unit.evl
 */
@ValidationContext(Unit.class)
public class UnitValidations {

    private String getMeasureName(Unit self) {
        if (self.eContainer() instanceof Measure) {
            return ((Measure) self.eContainer()).getName();
        }
        return String.valueOf(self.eContainer());
    }

    @Critique(name = "UnitNameIsUnique", message = "Unit name is not unique")
    public ValidationRule unitNameIsUnique() {
        return (element, context) -> {
            Unit self = (Unit) element;
        boolean hasDuplicate = context.getAllInstances(Unit.class).stream()
                .filter(u -> u != self)
                .anyMatch(u -> {
                    boolean nameMatch = u.getName() != null && self.getName() != null
                            && u.getName().equalsIgnoreCase(self.getName());
                    boolean symbolMatchesName = u.getSymbol() != null && self.getName() != null
                            && u.getSymbol().equalsIgnoreCase(self.getName());
                    return nameMatch || symbolMatchesName;
                });

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "UnitNameIsUnique",
                    "There are two or more units of the same name: " + self.getName() + " (in measure: " + getMeasureName(self) + ")",
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Critique(name = "UnitSymbolIsUnique", message = "Unit symbol is not unique")
    @Satisfies("unitSymbolIsUniqueInMeasure")
    public ValidationRule unitSymbolIsUnique() {
        return (element, context) -> {
            Unit self = (Unit) element;
        // Guard: symbol must be defined
        if (self.getSymbol() == null || self.getSymbol().isEmpty()) {
            return ValidationResult.pass();
        }

        boolean hasDuplicate = context.getAllInstances(Unit.class).stream()
                .filter(u -> u != self)
                .anyMatch(u -> {
                    boolean nameMatchesSymbol = u.getName() != null && self.getSymbol() != null
                            && u.getName().equalsIgnoreCase(self.getSymbol());
                    boolean symbolMatch = u.getSymbol() != null && self.getSymbol() != null
                            && u.getSymbol().equals(self.getSymbol());
                    return nameMatchesSymbol || symbolMatch;
                });

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "UnitSymbolIsUnique",
                    "There are two or more units that have the same symbol: " + self.getSymbol() + " (unit: " + self.getName() + ", measure: " + getMeasureName(self) + ")",
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "UnitSymbolIsUniqueInMeasure", message = "Unit symbol is not unique in measure")
    @Satisfies("namedElementHasContainer")
    public ValidationRule unitSymbolIsUniqueInMeasure() {
        return (element, context) -> {
            Unit self = (Unit) element;
        // Guard: symbol must be defined and container must be a Measure
        if (self.getSymbol() == null || self.getSymbol().isEmpty()) {
            return ValidationResult.pass();
        }
        if (self.eContainer() == null || !(self.eContainer() instanceof Measure)) {
            return ValidationResult.pass();
        }

        Measure measure = (Measure) self.eContainer();
        boolean hasDuplicate = measure.getUnits().stream()
                .filter(u -> u != self)
                .anyMatch(u -> u.getSymbol() != null && u.getSymbol().equals(self.getSymbol()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "UnitSymbolIsUniqueInMeasure",
                    "Unit symbol: " + self.getSymbol() + " of unit: " + self.getName() + " of measure: " + measure.getName() + " is not unique",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
