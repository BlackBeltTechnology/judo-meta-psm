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

import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for GET_RANGE behaviour.
 * Corresponds to validations/service/getRangeBehaviour.evl
 */
@ValidationContext(TransferOperationBehaviour.class)
public class GetRangeBehaviourValidations {

    private boolean isGetRange(TransferOperationBehaviour self) {
        return self.eContainer() != null && self.getBehaviourType() == TransferOperationBehaviourType.GET_RANGE;
    }

    private String getOperationName(TransferOperationBehaviour self) {
        if (self.eContainer() instanceof TransferOperation) {
            TransferOperation op = (TransferOperation) self.eContainer();
            String containerName = op.eContainer() instanceof TransferObjectType
                    ? ((TransferObjectType) op.eContainer()).getName()
                    : String.valueOf(op.eContainer());
            return containerName + "." + op.getName();
        }
        return String.valueOf(self.eContainer());
    }

    @Constraint(name = "OwnerIsRelationOrOperationUnboundBehaviourGetRange", message = "Owner of GET_RANGE must be a relation or operation")
    public ValidationRule ownerIsRelationOrOperationUnboundBehaviourGetRange() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetRange(self)) {
            return ValidationResult.pass();
        }

        if (self.getOwner() == null 
                || (!(self.getOwner() instanceof TransferObjectRelation) 
                    && !(self.getOwner() instanceof TransferOperation))) {
            return ValidationResult.fail(
                    "OwnerIsRelationOrOperationUnboundBehaviourGetRange",
                    "Owner of '" + self.getBehaviourType() + "' operation: " + getOperationName(self) + " must be a relation or operation.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "OwnerIsValidGetRangeBehaviour", message = "Owner must be a relation or operation of the containing transfer object type")
    public ValidationRule ownerIsValidGetRangeBehaviour() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetRange(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (!(operation.eContainer() instanceof TransferObjectType)) {
            return ValidationResult.pass();
        }

        TransferObjectType containerType = (TransferObjectType) operation.eContainer();
        boolean isValid = containerType.getRelations().contains(self.getOwner())
                || containerType.getOperations().contains(self.getOwner());

        if (!isValid) {
            return ValidationResult.fail(
                    "OwnerIsValidGetRangeBehaviour",
                    "Owner of '" + self.getBehaviourType() + "' behaviour  (" + getOperationName(self) + ") must be a relation or operation of the transfer object type containing the operation",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "GetRangeBehaviourInputParameterIsDefined", message = "GET_RANGE operation must have input parameter")
    @Satisfies("ownerIsValidGetRangeBehaviour")
    public ValidationRule getRangeBehaviourInputParameterIsDefined() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetRange(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getInput() == null) {
            return ValidationResult.fail(
                    "GetRangeBehaviourInputParameterIsDefined",
                    "'GET_RANGE' operation: " + operation.getName() + " must have an input parameter named 'input'",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "GetRangeBehaviourInputNameIsValid", message = "GET_RANGE operation input must be named 'input'")
    @Satisfies("getRangeBehaviourInputParameterIsDefined")
    public ValidationRule getRangeBehaviourInputNameIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetRange(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getInput() == null) {
            return ValidationResult.pass();
        }

        if (!"input".equals(operation.getInput().getName())) {
            return ValidationResult.fail(
                    "GetRangeBehaviourInputNameIsValid",
                    "'GET_RANGE' operation's input parameter must be named 'input' (operation: " + operation.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "GetRangeBehaviourInputCardinalityIsValid", message = "GET_RANGE input cardinality must be 0..1")
    @Satisfies("getRangeBehaviourInputParameterIsDefined")
    public ValidationRule getRangeBehaviourInputCardinalityIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetRange(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getInput() == null || operation.getInput().getCardinality() == null) {
            return ValidationResult.pass();
        }

        if (operation.getInput().getCardinality().getLower() != 0 
                || operation.getInput().getCardinality().getUpper() != 1) {
            String ownerName = self.getOwner() != null && self.getOwner().eContainer() instanceof TransferObjectType
                    ? ((TransferObjectType) self.getOwner().eContainer()).getName()
                    : "";
            return ValidationResult.fail(
                    "GetRangeBehaviourInputCardinalityIsValid",
                    "Cardinality of 'GET_RANGE' operation's input parameter must be 0..1 (operation: " + operation.getName() + " in " + ownerName + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
