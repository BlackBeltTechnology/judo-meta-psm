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

import hu.blackbelt.judo.meta.psm.type.EnumerationType;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for EnumerationType.
 * Corresponds to validations/type/enumerationType.evl
 */
@ValidationContext(EnumerationType.class)
public class EnumerationTypeValidations {

    // Constraint/Critique name constants
    private static final String ENUMERATION_CONTAINS_AT_LEAST_TWO_MEMBERS = "EnumerationContainsAtLeastTwoMembers";


    @Critique(name = ENUMERATION_CONTAINS_AT_LEAST_TWO_MEMBERS, message = "Enumeration should have at least two members")
    public ValidationRule enumerationContainsAtLeastTwoMembers() {
        return (element, context) -> {
            EnumerationType self = (EnumerationType) element;
        if (self.getMembers().size() <= 1) {
            return ValidationResult.fail(
                    ENUMERATION_CONTAINS_AT_LEAST_TWO_MEMBERS,
                    "Enum " + self.getName() + " has no or only a single member",
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
