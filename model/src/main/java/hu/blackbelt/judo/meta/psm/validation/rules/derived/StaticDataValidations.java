package hu.blackbelt.judo.meta.psm.validation.rules.derived;

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

import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for StaticData.
 * Corresponds to validations/derived/staticData.evl
 */
@ValidationContext(StaticData.class)
public class StaticDataValidations {

    @Critique(name = "StaticDataNamesAreUnique", message = "Static data name is not unique")
    public ValidationRule staticDataNamesAreUnique() {
        return (element, context) -> {
            StaticData self = (StaticData) element;
        boolean hasDuplicate = context.getAllInstances(StaticData.class).stream()
                .filter(s -> s != self)
                .anyMatch(s -> s.getName() != null && self.getName() != null
                        && s.getName().equalsIgnoreCase(self.getName()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "StaticDataNamesAreUnique",
                    "Static data name is not unique: " + self.getName(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
