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
 * Validation rules for GET_PRINCIPAL behaviour.
 * Corresponds to validations/service/getPrincipalBehaviour.evl
 */
@ValidationContext(TransferOperationBehaviour.class)
public class GetPrincipalBehaviourValidations {

    // Constraint/Critique name constants
    private static final String OPERATION_OF_GET_PRINCIPAL_BEHAVIOUR_IS_VALID = "OperationOfGetPrincipalBehaviourIsValid";
    private static final String OWNER_OF_GET_PRINCIPAL_BEHAVIOUR_IS_VALID = "OwnerOfGetPrincipalBehaviourIsValid";
    private static final String RELATION_OF_GET_PRINCIPAL_BEHAVIOUR_IS_UNDEFINED = "RelationOfGetPrincipalBehaviourIsUndefined";
    private static final String GET_PRINCIPAL_OPERATION_INPUT_NAME_IS_VALID = "GetPrincipalOperationInputNameIsValid";
    private static final String GET_PRINCIPAL_OPERATION_OUTPUT_PARAMETER_IS_DEFINED = "GetPrincipalOperationOutputParameterIsDefined";
    private static final String GET_PRINCIPAL_OPERATION_OUTPUT_NAME_IS_VALID = "GetPrincipalOperationOutputNameIsValid";
    private static final String GET_PRINCIPAL_OPERATION_OUTPUT_CARDINALITY_IS_VALID = "GetPrincipalOperationOutputCardinalityIsValid";
    // External constraint references

    private boolean isGetPrincipal(TransferOperationBehaviour self) {
        return self.eContainer() != null && self.getBehaviourType() == TransferOperationBehaviourType.GET_PRINCIPAL;
    }

    private String getOperationName(TransferOperationBehaviour self) {
        if (self.eContainer() instanceof TransferOperation) {
            return ((TransferOperation) self.eContainer()).getName();
        }
        return String.valueOf(self.eContainer());
    }

    @Constraint(name = OPERATION_OF_GET_PRINCIPAL_BEHAVIOUR_IS_VALID, message = "GET_PRINCIPAL behaviour must be owned by unbound operation")
    public ValidationRule operationOfGetPrincipalBehaviourIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof UnboundOperation)) {
            return ValidationResult.fail(
                    OPERATION_OF_GET_PRINCIPAL_BEHAVIOUR_IS_VALID,
                    "'GET_PRINCIPAL' behaviour type must be owned by unbound operation",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = OWNER_OF_GET_PRINCIPAL_BEHAVIOUR_IS_VALID, message = "Owner of GET_PRINCIPAL behaviour must be a transfer object type")
    public ValidationRule ownerOfGetPrincipalBehaviourIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (self.getOwner() == null || !(self.getOwner() instanceof TransferObjectType)) {
            return ValidationResult.fail(
                    OWNER_OF_GET_PRINCIPAL_BEHAVIOUR_IS_VALID,
                    "Owner of 'GET_PRINCIPAL' behaviour must be a transfer object type",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = RELATION_OF_GET_PRINCIPAL_BEHAVIOUR_IS_UNDEFINED, message = "Relation for GET_PRINCIPAL behaviour must be undefined")
    public ValidationRule relationOfGetPrincipalBehaviourIsUndefined() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (self.getRelation() != null) {
            return ValidationResult.fail(
                    RELATION_OF_GET_PRINCIPAL_BEHAVIOUR_IS_UNDEFINED,
                    "Relation for 'GET_PRINCIPAL' behaviour types must be undefined",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = GET_PRINCIPAL_OPERATION_INPUT_NAME_IS_VALID, message = "GET_PRINCIPAL operation must not have input parameter")
    public ValidationRule getPrincipalOperationInputNameIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getInput() != null) {
            return ValidationResult.fail(
                    GET_PRINCIPAL_OPERATION_INPUT_NAME_IS_VALID,
                    "'GET_PRINCIPAL' operation's input parameter must not exists (operation: " + operation.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = GET_PRINCIPAL_OPERATION_OUTPUT_PARAMETER_IS_DEFINED, message = "GET_PRINCIPAL operation must have output parameter")
    public ValidationRule getPrincipalOperationOutputParameterIsDefined() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getOutput() == null) {
            return ValidationResult.fail(
                    GET_PRINCIPAL_OPERATION_OUTPUT_PARAMETER_IS_DEFINED,
                    "'GET_PRINCIPAL' operation must have an output parameter named 'output' (operation: " + operation.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = GET_PRINCIPAL_OPERATION_OUTPUT_NAME_IS_VALID, message = "GET_PRINCIPAL operation output must be named 'output'")
    @Satisfies(GET_PRINCIPAL_OPERATION_OUTPUT_PARAMETER_IS_DEFINED)
    public ValidationRule getPrincipalOperationOutputNameIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getOutput() == null) {
            return ValidationResult.pass();
        }

        if (!"output".equals(operation.getOutput().getName())) {
            return ValidationResult.fail(
                    GET_PRINCIPAL_OPERATION_OUTPUT_NAME_IS_VALID,
                    "'GET_PRINCIPAL' operation's output parameter must be named 'output' (operation: " + operation.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = GET_PRINCIPAL_OPERATION_OUTPUT_CARDINALITY_IS_VALID, message = "GET_PRINCIPAL output cardinality must be 0..1")
    @Satisfies(GET_PRINCIPAL_OPERATION_OUTPUT_PARAMETER_IS_DEFINED)
    public ValidationRule getPrincipalOperationOutputCardinalityIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetPrincipal(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof TransferOperation)) {
            return ValidationResult.pass();
        }

        TransferOperation operation = (TransferOperation) self.eContainer();
        if (operation.getOutput() == null || operation.getOutput().getCardinality() == null) {
            return ValidationResult.pass();
        }

        if (operation.getOutput().getCardinality().getLower() != 0 
                || operation.getOutput().getCardinality().getUpper() != 1) {
            return ValidationResult.fail(
                    GET_PRINCIPAL_OPERATION_OUTPUT_CARDINALITY_IS_VALID,
                    "Cardinality of 'GET_PRINCIPAL' operation's output parameter must be 0..1 (operation: " + operation.getName() + ")",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
