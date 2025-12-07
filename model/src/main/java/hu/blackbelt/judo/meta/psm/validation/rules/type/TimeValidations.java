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

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.type.TimeType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

import java.util.EnumSet;
import java.util.Set;

/**
 * Validation rules for TimeType.
 * Corresponds to validations/type/time.evl
 */
@ValidationContext(TimeType.class)
public class TimeValidations {

    private static final Set<DurationType> VALID_BASE_UNITS = EnumSet.of(
            DurationType.NANOSECOND,
            DurationType.MICROSECOND,
            DurationType.MILLISECOND,
            DurationType.SECOND
    );

    @Constraint(name = "TimeBaseUnitIsValid", message = "Base unit of time type is invalid")
    public ValidationRule timeBaseUnitIsValid() {
        return (element, context) -> {
            TimeType self = (TimeType) element;
        if (!VALID_BASE_UNITS.contains(self.getBaseUnit())) {
            return ValidationResult.fail(
                    "TimeBaseUnitIsValid",
                    "Base unit of time type: " + self.getName() + " is invalid.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
