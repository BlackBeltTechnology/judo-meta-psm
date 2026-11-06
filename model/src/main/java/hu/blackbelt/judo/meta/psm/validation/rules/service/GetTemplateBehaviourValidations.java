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
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for GET_TEMPLATE behaviour.
 * Corresponds to validations/service/getTemplateBehaviour.evl
 */
@ValidationContext(TransferOperationBehaviour.class)
public class GetTemplateBehaviourValidations {

    // Constraint/Critique name constants
    private static final String OPERATION_OF_GET_TEMPLATE_BEHAVIOUR_IS_VALID = "OperationOfGetTemplateBehaviourIsValid";
    private static final String OWNER_OF_GET_TEMPLATE_BEHAVIOUR_IS_VALID = "OwnerOfGetTemplateBehaviourIsValid";
    private static final String RELATION_OF_GET_TEMPLATE_BEHAVIOUR_IS_UNDEFINED = "RelationOfGetTemplateBehaviourIsUndefined";


    private boolean isGetTemplate(TransferOperationBehaviour self) {
        return self.eContainer() != null && self.getBehaviourType() == TransferOperationBehaviourType.GET_TEMPLATE;
    }

    @Constraint(name = OPERATION_OF_GET_TEMPLATE_BEHAVIOUR_IS_VALID, message = "GET_TEMPLATE behaviour must be owned by unbound operation")
    public ValidationRule operationOfGetTemplateBehaviourIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetTemplate(self)) {
            return ValidationResult.pass();
        }

        if (!(self.eContainer() instanceof UnboundOperation)) {
            return ValidationResult.fail(
                    OPERATION_OF_GET_TEMPLATE_BEHAVIOUR_IS_VALID,
                    "'GET_TEMPLATE' behaviour type must be owned by unbound operation",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = OWNER_OF_GET_TEMPLATE_BEHAVIOUR_IS_VALID, message = "Owner of GET_TEMPLATE behaviour must be a transfer object type")
    public ValidationRule ownerOfGetTemplateBehaviourIsValid() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetTemplate(self)) {
            return ValidationResult.pass();
        }

        if (self.getOwner() == null || !(self.getOwner() instanceof TransferObjectType)) {
            return ValidationResult.fail(
                    OWNER_OF_GET_TEMPLATE_BEHAVIOUR_IS_VALID,
                    "Owner of 'GET_TEMPLATE' behaviour must be a transfer object type",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = RELATION_OF_GET_TEMPLATE_BEHAVIOUR_IS_UNDEFINED, message = "Relation for GET_TEMPLATE behaviour must be undefined")
    public ValidationRule relationOfGetTemplateBehaviourIsUndefined() {
        return (element, context) -> {
            TransferOperationBehaviour self = (TransferOperationBehaviour) element;
        if (!isGetTemplate(self)) {
            return ValidationResult.pass();
        }

        if (self.getRelation() != null) {
            return ValidationResult.fail(
                    RELATION_OF_GET_TEMPLATE_BEHAVIOUR_IS_UNDEFINED,
                    "Relation for 'GET_TEMPLATE' behaviour types must be undefined",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
