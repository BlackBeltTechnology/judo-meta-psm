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

import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for BoundTransferOperation.
 * Corresponds to validations/service/boundTransferOperation.evl
 */
@ValidationContext(BoundTransferOperation.class)
public class BoundOperationValidations {

    // Constraint/Critique name constants
    private static final String OWNER_IS_MAPPED_TRANSFER_OBJECT_TYPE = "OwnerIsMappedTransferObjectType";
    // External constraint references
    private static final String NAMED_ELEMENT_HAS_CONTAINER = "namedElementHasContainer";


    @Constraint(name = OWNER_IS_MAPPED_TRANSFER_OBJECT_TYPE, message = "Container must be mapped transfer object type")
    @Satisfies(NAMED_ELEMENT_HAS_CONTAINER)
    public ValidationRule ownerIsMappedTransferObjectType() {
        return (element, context) -> {
            BoundTransferOperation self = (BoundTransferOperation) element;
        if (self.eContainer() == null) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof MappedTransferObjectType)) {
            return ValidationResult.fail(
                    OWNER_IS_MAPPED_TRANSFER_OBJECT_TYPE,
                    "Container of bound transfer operation must be mapped transfer object type (operation: " + self.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    // Note: BindingIsValid and ParametersAreValid require psmUtils.getAllBoundOperations
    // and psmUtils.parametersAreCompatible which are complex to implement
}
