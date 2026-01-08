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

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for UnboundOperation.
 * Corresponds to validations/service/unboundOperation.evl
 */
@ValidationContext(UnboundOperation.class)
public class UnboundOperationValidations {

    // Constraint/Critique name constants
    private static final String BEHAVIOUR_OR_IMPLEMENTATION_IS_REQUIRED = "BehaviourOrImplementationIsRequired";
    private static final String INIT_OPERATION_CANNOT_HAVE_INPUT = "InitOperationCannotHaveInput";


    private String getContainerName(UnboundOperation self) {
        if (self.eContainer() instanceof NamedElement) {
            return ((NamedElement) self.eContainer()).getName();
        }
        return String.valueOf(self.eContainer());
    }

    @Constraint(name = BEHAVIOUR_OR_IMPLEMENTATION_IS_REQUIRED, message = "Unbound operation must have implementation or behaviour")
    public ValidationRule behaviourOrImplementationIsRequired() {
        return (element, context) -> {
            UnboundOperation self = (UnboundOperation) element;
        if (self.getImplementation() == null && self.getBehaviour() == null) {
            return ValidationResult.fail(
                    BEHAVIOUR_OR_IMPLEMENTATION_IS_REQUIRED,
                    "Unbound operation must have implementation or behaviour (" + getContainerName(self) + "." + self.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INIT_OPERATION_CANNOT_HAVE_INPUT, message = "Initializer operation cannot have input")
    public ValidationRule initOperationCannotHaveInput() {
        return (element, context) -> {
            UnboundOperation self = (UnboundOperation) element;
        // Guard: only check if initializer is true
        if (!self.isInitializer()) {
            return ValidationResult.pass();
        }

        if (self.getInput() != null) {
            return ValidationResult.fail(
                    INIT_OPERATION_CANNOT_HAVE_INPUT,
                    "Initializer operation: " + self.getName() + " cannot have input.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
