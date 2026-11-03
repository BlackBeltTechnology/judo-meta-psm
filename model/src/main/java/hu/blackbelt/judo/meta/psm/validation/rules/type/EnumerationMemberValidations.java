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

import hu.blackbelt.judo.meta.psm.type.EnumerationMember;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for EnumerationMember.
 * Corresponds to validations/type/enumerationMember.evl
 */
@ValidationContext(EnumerationMember.class)
public class EnumerationMemberValidations {

    // Constraint/Critique name constants
    private static final String ENUMERATION_MEMBER_VALUE_IS_UNIQUE = "EnumerationMemberValueIsUnique";
    // External constraint references
    private static final String NAMED_ELEMENT_HAS_CONTAINER = "namedElementHasContainer";


    @Constraint(name = ENUMERATION_MEMBER_VALUE_IS_UNIQUE, message = "Enumeration member value is not unique")
    @Satisfies(NAMED_ELEMENT_HAS_CONTAINER)
    public ValidationRule enumerationMemberValueIsUnique() {
        return (element, context) -> {
            EnumerationMember self = (EnumerationMember) element;
        if (self.eContainer() == null || !(self.eContainer() instanceof EnumerationType)) {
            return ValidationResult.pass();
        }

        EnumerationType enumType = (EnumerationType) self.eContainer();
        boolean hasDuplicate = enumType.getMembers().stream()
                .filter(m -> m != self)
                .anyMatch(m -> m.getOrdinal() == self.getOrdinal());

        if (hasDuplicate) {
            return ValidationResult.fail(
                    ENUMERATION_MEMBER_VALUE_IS_UNIQUE,
                    "Enum member number of enum member: " + self.getName() + " is not unique in enum: " + enumType.getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
