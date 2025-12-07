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

import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for Primitive types.
 * Corresponds to validations/type/primitive.evl
 */
@ValidationContext(Primitive.class)
public class PrimitiveValidations {

    @Critique(name = "PrimitiveTypeNamesAreUnique", message = "Primitive type name is not unique")
    public ValidationRule primitiveTypeNamesAreUnique() {
        return (element, context) -> {
            Primitive self = (Primitive) element;
        boolean hasDuplicate = context.getAllInstances(Primitive.class).stream()
                .filter(p -> p != self)
                .anyMatch(p -> p.getName() != null && self.getName() != null
                        && p.getName().equalsIgnoreCase(self.getName()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    "PrimitiveTypeNamesAreUnique",
                    "Primitive type name is not unique: " + self.getName(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
