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

import java.util.EnumSet;
import java.util.Set;

/**
 * Validation rules for TransferOperationBehaviour.
 * Corresponds to validations/service/boundBehaviour.evl
 */
@ValidationContext(TransferOperationBehaviour.class)
public class BoundBehaviourValidations {

    // Constraint/Critique name constants
    private static final String OWNER_OF_BOUND_BEHAVIOUR_IS_RELATION = "OwnerOfBoundBehaviourIsRelation";
    private static final String OWNER_OF_BOUND_BEHAVIOUR_IS_VALID = "OwnerOfBoundBehaviourIsValid";
    private static final String CREATE_TARGET_IS_NOT_ABSTRACT = "CreateTargetIsNotAbstract";
    // External constraint references

    private static final Set<TransferOperationBehaviourType> RELATION_OWNER_TYPES = EnumSet.of(
            TransferOperationBehaviourType.LIST,
            TransferOperationBehaviourType.CREATE_INSTANCE,
            TransferOperationBehaviourType.VALIDATE_CREATE,
            TransferOperationBehaviourType.SET_REFERENCE,
            TransferOperationBehaviourType.UNSET_REFERENCE,
            TransferOperationBehaviourType.ADD_REFERENCE,
            TransferOperationBehaviourType.REMOVE_REFERENCE
    );

    private static final Set<TransferOperationBehaviourType> CREATE_TYPES = EnumSet.of(
            TransferOperationBehaviourType.CREATE_INSTANCE,
            TransferOperationBehaviourType.VALIDATE_CREATE
    );

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

    @Constraint(name = OWNER_OF_BOUND_BEHAVIOUR_IS_RELATION, message = "Owner of behaviour must be a transfer object relation")
    public ValidationRule ownerOfBoundBehaviourIsRelation() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        // Guard: container must be defined and behaviour type must be in RELATION_OWNER_TYPES
        if (self.eContainer() == null || !RELATION_OWNER_TYPES.contains(self.getBehaviourType())) {
            return ValidationResult.pass();
        }

        if (self.getOwner() == null || !(self.getOwner() instanceof TransferObjectRelation)) {
            return ValidationResult.fail(
                    OWNER_OF_BOUND_BEHAVIOUR_IS_RELATION,
                    "Owner of '" + self.getBehaviourType() + "' behaviour  (" + getOperationName(self) + ") must be a transfer object relation",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = OWNER_OF_BOUND_BEHAVIOUR_IS_VALID, message = "Owner must be a relation of the containing transfer object type")
    @Satisfies(OWNER_OF_BOUND_BEHAVIOUR_IS_RELATION)
    public ValidationRule ownerOfBoundBehaviourIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        // Guard: container must be defined and behaviour type must be in RELATION_OWNER_TYPES
        if (self.eContainer() == null || !RELATION_OWNER_TYPES.contains(self.getBehaviourType())) {
            return ValidationResult.pass();
        }
        if (self.getOwner() == null || !(self.getOwner() instanceof TransferObjectRelation)) {
            return ValidationResult.pass();
        }

        // Get the transfer object type containing the operation
        TransferOperation operation = (TransferOperation) self.eContainer();
        if (!(operation.eContainer() instanceof TransferObjectType)) {
            return ValidationResult.pass();
        }

        TransferObjectType containerType = (TransferObjectType) operation.eContainer();
        boolean isValid = containerType.getRelations().contains(self.getOwner());

        if (!isValid) {
            return ValidationResult.fail(
                    OWNER_OF_BOUND_BEHAVIOUR_IS_VALID,
                    "Owner of '" + self.getBehaviourType() + "' behaviour  (" + getOperationName(self) + ") must be a relation of the transfer object type containing the operation",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = CREATE_TARGET_IS_NOT_ABSTRACT, message = "Owner of CREATE operation cannot reference abstract entity type")
    @Satisfies({OWNER_OF_BOUND_BEHAVIOUR_IS_RELATION, OWNER_OF_BOUND_BEHAVIOUR_IS_VALID})
    public ValidationRule createTargetIsNotAbstract() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        // Guard: container must be defined, behaviour type must be CREATE_INSTANCE or VALIDATE_CREATE
        if (self.eContainer() == null || !CREATE_TYPES.contains(self.getBehaviourType())) {
            return ValidationResult.pass();
        }
        if (self.getOwner() == null || !(self.getOwner() instanceof TransferObjectRelation)) {
            return ValidationResult.pass();
        }

        TransferObjectRelation relation = (TransferObjectRelation) self.getOwner();
        if (!(relation.getTarget() instanceof MappedTransferObjectType)) {
            return ValidationResult.pass();
        }

        MappedTransferObjectType mappedTarget = (MappedTransferObjectType) relation.getTarget();
        if (mappedTarget.getEntityType() != null && mappedTarget.getEntityType().isAbstract()) {
            return ValidationResult.fail(
                    CREATE_TARGET_IS_NOT_ABSTRACT,
                    "Owner of 'CREATE' operation cannot reference the mapped transfer object of an abstract entity type.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
