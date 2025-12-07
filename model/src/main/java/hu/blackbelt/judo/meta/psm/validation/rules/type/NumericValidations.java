package hu.blackbelt.judo.meta.psm.validation.rules.type;

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

import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for NumericType.
 * Corresponds to validations/type/numeric.evl
 */
@ValidationContext(NumericType.class)
public class NumericValidations {

    @Constraint(name = "ScaleIsLowerThanPrecision", message = "Scale must be less than precision")
    public ValidationRule scaleIsLowerThanPrecision() {
        return (element, context) -> {
            NumericType self = (NumericType) element;
            if (self.getPrecision() <= self.getScale()) {
                return ValidationResult.fail(
                        "ScaleIsLowerThanPrecision",
                        "Scale (" + self.getScale() + ") must be less than precision (" + self.getPrecision() + ")",
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = "ValidScale", message = "Scale must be at least 0")
    public ValidationRule validScale() {
        return (element, context) -> {
            NumericType self = (NumericType) element;
            if (self.getScale() < 0) {
                return ValidationResult.fail(
                        "ValidScale",
                        "Scale (" + self.getScale() + ") must be at least 0",
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }
}
