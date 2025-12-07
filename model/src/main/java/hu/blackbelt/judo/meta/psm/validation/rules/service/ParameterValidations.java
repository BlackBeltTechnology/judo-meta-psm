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

import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.TransferOperation;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for Parameter.
 * Corresponds to validations/service/parameter.evl
 */
@ValidationContext(Parameter.class)
public class ParameterValidations {

    @Constraint(name = "FaultCardinalityIsValid", message = "Cardinality of fault parameter must be 1..1")
    @Satisfies("namedElementHasContainer")
    public ValidationRule faultCardinalityIsValid() {
        return (element, context) -> {
            Parameter self = (Parameter) element;
        // Guard: container must be defined and parameter must be a fault
        if (self.eContainer() == null || !(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (!operation.getFaults().contains(self)) {
            return ValidationResult.pass();
        }

        if (self.getCardinality() == null) {
            return ValidationResult.pass();
        }

        if (self.getCardinality().getLower() != 1 || self.getCardinality().getUpper() != 1) {
            return ValidationResult.fail(
                    "FaultCardinalityIsValid",
                    "Cardinality of fault parameter: " + self.getName() + " must be 1..1",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
