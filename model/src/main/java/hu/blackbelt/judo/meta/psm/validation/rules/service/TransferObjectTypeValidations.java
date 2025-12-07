package hu.blackbelt.judo.meta.psm.validation.rules.service;

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

import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for TransferObjectType.
 * Corresponds to validations/service/transferObjectType.evl
 */
@ValidationContext(TransferObjectType.class)
public class TransferObjectTypeValidations {

    // Constraint/Critique name constants
    private static final String TRANSFER_OBJECT_TYPE_NAMES_ARE_UNIQUE = "TransferObjectTypeNamesAreUnique";
    // External constraint references
    private static final String NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER = "namedElementIsUniqueInItsContainer";


    @Critique(name = TRANSFER_OBJECT_TYPE_NAMES_ARE_UNIQUE, message = "Transfer object type name is not unique")
    @Satisfies(NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER)
    public ValidationRule transferObjectTypeNamesAreUnique() {
        return (element, context) -> {
            TransferObjectType self = (TransferObjectType) element;
        boolean hasDuplicate = context.getAllInstances(TransferObjectType.class).stream()
                .filter(t -> t != self)
                .anyMatch(t -> t.getName() != null && self.getName() != null
                        && t.getName().equalsIgnoreCase(self.getName()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    TRANSFER_OBJECT_TYPE_NAMES_ARE_UNIQUE,
                    "There are two or more transfer object types of the same name: " + self.getName(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
