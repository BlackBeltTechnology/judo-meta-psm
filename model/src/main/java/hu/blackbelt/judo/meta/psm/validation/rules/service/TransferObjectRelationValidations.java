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

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for TransferObjectRelation.
 * Corresponds to validations/service/transferObjectRelation.evl
 */
@ValidationContext(TransferObjectRelation.class)
public class TransferObjectRelationValidations {

    @Constraint(name = "TargetMatchesBindingTarget", message = "Target entity type must match binding target")
    public ValidationRule targetMatchesBindingTarget() {
        return (element, context) -> {
            TransferObjectRelation self = (TransferObjectRelation) element;
        // Guard: target must be MappedTransferObjectType and binding must be defined
        if (!(self.getTarget() instanceof MappedTransferObjectType)) {
            return ValidationResult.pass();
        }
        if (self.getBinding() == null) {
            return ValidationResult.pass();
        }

        MappedTransferObjectType mappedTarget = (MappedTransferObjectType) self.getTarget();
        if (mappedTarget.getEntityType() == null || self.getBinding().getTarget() == null) {
            return ValidationResult.pass();
        }

        boolean isValid = mappedTarget.getEntityType().getAllSuperEntityTypes().contains(self.getBinding().getTarget())
                || mappedTarget.getEntityType() == self.getBinding().getTarget();

        if (!isValid) {
            return ValidationResult.fail(
                    "TargetMatchesBindingTarget",
                    "EntityType of mapped transfer object type " + self.getTarget().getName() + 
                            " (target of transfer object relation " + self.getName() +
                            ") must match the target of the binding of transfer object relation " + self.getName() + ".",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "CardinalityMatchesBindingCardinality", message = "Cardinality must match binding cardinality")
    public ValidationRule cardinalityMatchesBindingCardinality() {
        return (element, context) -> {
            TransferObjectRelation self = (TransferObjectRelation) element;
        // Guard: binding must be defined
        if (self.getBinding() == null) {
            return ValidationResult.pass();
        }
        if (self.getCardinality() == null || self.getBinding().getCardinality() == null) {
            return ValidationResult.pass();
        }

        boolean isValid = self.getCardinality().getLower() == self.getBinding().getCardinality().getLower()
                && self.getCardinality().getUpper() == self.getBinding().getCardinality().getUpper();

        if (!isValid) {
            return ValidationResult.fail(
                    "CardinalityMatchesBindingCardinality",
                    "Transfer object relation " + self.getName() + " and its binding must have the same cardinality.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "TransferObjectRelationIsEmbedded", message = "Relation to unmapped transfer object must be embedded")
    public ValidationRule transferObjectRelationIsEmbedded() {
        return (element, context) -> {
            TransferObjectRelation self = (TransferObjectRelation) element;
        // Guard: target must be UnmappedTransferObjectType
        if (!(self.getTarget() instanceof UnmappedTransferObjectType)) {
            return ValidationResult.pass();
        }

        // Check if container is access point
        boolean isAccessPoint = false;
        if (self.eContainer() instanceof TransferObjectType) {
            isAccessPoint = ((TransferObjectType) self.eContainer()).isAccessPoint();
        }

        if (!self.isEmbedded() && !isAccessPoint) {
            return ValidationResult.fail(
                    "TransferObjectRelationIsEmbedded",
                    "Transfer object relation " + self.getName() + " is referencing to unembedded unmapped transfer object type: " + self.getTarget().getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "TransferObjectRelationBindingIsValid", message = "Binding must match entity type of mapped transfer object")
    @Satisfies("namedElementHasContainer")
    public ValidationRule transferObjectRelationBindingIsValid() {
        return (element, context) -> {
            TransferObjectRelation self = (TransferObjectRelation) element;
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
                    "TransferObjectRelationBindingIsValid",
                    "Binding of transfer object relation " + self.getName() + " of mapped transfer object " + mappedType.getName() +
                            " must match the entity type of the mapped transfer object.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "EmbeddedOnBothSidesAreNotAllowed", message = "Circular aggregation found on relation")
    @Satisfies({"targetMatchesBindingTarget", "cardinalityMatchesBindingCardinality", "transferObjectRelationBindingIsValid"})
    public ValidationRule embeddedOnBothSidesAreNotAllowed() {
        return (element, context) -> {
            TransferObjectRelation self = (TransferObjectRelation) element;
        // Guard: binding must be defined and embedded must be true
        if (self.getBinding() == null || !self.isEmbedded()) {
            return ValidationResult.pass();
        }
        
        // Check if binding is AssociationEnd with partner
        if (!(self.getBinding() instanceof AssociationEnd)) {
            return ValidationResult.pass();
        }
        
        AssociationEnd bindingAssoc = (AssociationEnd) self.getBinding();
        if (bindingAssoc.getPartner() == null) {
            return ValidationResult.pass();
        }

        // Check if target has an embedded relation with partner binding
        if (self.getTarget() == null) {
            return ValidationResult.pass();
        }

        boolean hasCircular = self.getTarget().getRelations().stream()
                .anyMatch(r -> r.isEmbedded()
                        && r.getBinding() != null
                        && r.getBinding() == bindingAssoc.getPartner());

        if (hasCircular) {
            return ValidationResult.fail(
                    "EmbeddedOnBothSidesAreNotAllowed",
                    "Circular aggregation found on relation: " + self.eContainer() + "." + self.getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
