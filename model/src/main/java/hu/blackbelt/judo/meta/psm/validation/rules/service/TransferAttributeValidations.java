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

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for TransferAttribute.
 * Corresponds to validations/service/transferAttribute.evl
 */
@ValidationContext(TransferAttribute.class)
public class TransferAttributeValidations {

    @Constraint(name = "DataTypeMatchesBindingDataType", message = "DataType must match binding's dataType")
    public ValidationRule dataTypeMatchesBindingDataType() {
        return (element, context) -> {
            TransferAttribute self = (TransferAttribute) element;
        // Guard: binding must be defined
        if (self.getBinding() == null) {
            return ValidationResult.pass();
        }

        if (self.getDataType() != self.getBinding().getDataType()) {
            return ValidationResult.fail(
                    "DataTypeMatchesBindingDataType",
                    "DataType of transfer attribute " + self.getName() + " must match the dataType of its binding.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "RequiredFlagMatchesBindingRequiredFlag", message = "Required flag must match binding's required flag")
    public ValidationRule requiredFlagMatchesBindingRequiredFlag() {
        return (element, context) -> {
            TransferAttribute self = (TransferAttribute) element;
        // Guard: binding must be defined
        if (self.getBinding() == null) {
            return ValidationResult.pass();
        }

        if (self.isRequired() != self.getBinding().isRequired()) {
            return ValidationResult.fail(
                    "RequiredFlagMatchesBindingRequiredFlag",
                    "Required flag of transfer attribute " + self.getName() + " must equal required flag of its binding.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "TransferAttributeBindingIsValid", message = "Binding must match entity type of mapped transfer object")
    @Satisfies("namedElementHasContainer")
    public ValidationRule transferAttributeBindingIsValid() {
        return (element, context) -> {
            TransferAttribute self = (TransferAttribute) element;
        // Guard: container must be MappedTransferObjectType and binding must be defined
        if (self.eContainer() == null || !(self.eContainer() instanceof MappedTransferObjectType)) {
            return ValidationResult.pass();
        }
        if (self.getBinding() == null) {
            return ValidationResult.pass();
        }

        MappedTransferObjectType mappedType = (MappedTransferObjectType) self.eContainer();
        if (mappedType.getEntityType() == null) {
            return ValidationResult.pass();
        }

        boolean isValid = mappedType.getEntityType().getAllSuperEntityTypes().contains(self.getBinding().eContainer())
                || mappedType.getEntityType() == self.getBinding().eContainer();

        if (!isValid) {
            return ValidationResult.fail(
                    "TransferAttributeBindingIsValid",
                    "Binding of transfer attribute " + self.getName() + " of mapped transfer object " + mappedType.getName() +
                            " must match the entity type of the mapped transfer object.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
