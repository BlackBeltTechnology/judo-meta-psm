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

import hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for ReferenceAccessor.
 * Corresponds to validations/derived/referenceAccessor.evl
 */
@ValidationContext(ReferenceAccessor.class)
public class ReferenceAccessorValidations {

    // Constraint/Critique name constants
    private static final String SETTER_EXPRESSIONS_ARE_NOT_SUPPORTED_YET = "SetterExpressionsAreNotSupportedYet";
    // External constraint references
    private static final String NAMED_ELEMENT_HAS_CONTAINER = "namedElementHasContainer";


    @Constraint(name = SETTER_EXPRESSIONS_ARE_NOT_SUPPORTED_YET, message = "Setter expressions are not supported yet")
    @Satisfies(NAMED_ELEMENT_HAS_CONTAINER)
    public ValidationRule setterExpressionsAreNotSupportedYet() {
        return (element, context) -> {
            ReferenceAccessor self = (ReferenceAccessor) element;
        if (self.eContainer() == null) {
            return ValidationResult.pass();
        }

        if (self.getSetterExpression() != null) {
            String containerName = self.eContainer() instanceof NamedElement 
                    ? ((NamedElement) self.eContainer()).getName() 
                    : String.valueOf(self.eContainer());
            
            return ValidationResult.fail(
                    SETTER_EXPRESSIONS_ARE_NOT_SUPPORTED_YET,
                    "Setter expressions are not supported yet (" + containerName + "." + self.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
