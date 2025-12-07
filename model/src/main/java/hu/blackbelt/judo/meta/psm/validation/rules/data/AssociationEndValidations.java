package hu.blackbelt.judo.meta.psm.validation.rules.data;

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
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for AssociationEnd.
 * Corresponds to validations/data/associationEnd.evl
 */
@ValidationContext(AssociationEnd.class)
public class AssociationEndValidations {

    private EntityType getEntityType(AssociationEnd self) {
        if (self.eContainer() instanceof EntityType) {
            return (EntityType) self.eContainer();
        }
        return null;
    }

    @Constraint(name = "CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne", message = "Cascade delete only allowed if upper cardinality is 1")
    public ValidationRule cascadeDeleteOnlyAllowedIfUpperCardinalityIsOne() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if reverseCascadeDelete is true
        if (!self.isReverseCascadeDelete()) {
            return ValidationResult.pass();
        }

        if (self.getCardinality() == null || self.getCardinality().getUpper() != 1) {
            return ValidationResult.fail(
                    "CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne",
                    "Cascade delete behavior only allowed on endpoints if their upper cardinality is 1: " + self.getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "PartnerIsNotSelf", message = "Partner cannot be self")
    public ValidationRule partnerIsNotSelf() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if partner is defined
        if (self.getPartner() == null) {
            return ValidationResult.pass();
        }

        if (self.getPartner() == self) {
            return ValidationResult.fail(
                    "PartnerIsNotSelf",
                    "Self partner relation found: " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "OppositePartnerIsDefined", message = "Opposite partner must be defined")
    @Satisfies("partnerIsNotSelf")
    public ValidationRule oppositePartnerIsDefined() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if partner is defined and not self
        if (self.getPartner() == null || self.getPartner() == self) {
            return ValidationResult.pass();
        }

        if (self.getPartner().getPartner() == null) {
            return ValidationResult.fail(
                    "OppositePartnerIsDefined",
                    "Missing opposite partner relation for " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "ValidPartnerRelations", message = "Invalid partner relations")
    @Satisfies("oppositePartnerIsDefined")
    public ValidationRule validPartnerRelations() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: partner and opposite partner must be defined
        if (self.getPartner() == null || self.getPartner().getPartner() == null) {
            return ValidationResult.pass();
        }

        if (self.getPartner().getPartner() != self) {
            return ValidationResult.fail(
                    "ValidPartnerRelations",
                    "Opposite partner relation of " + self.getPartner() + " must be " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "ValidPartnerType", message = "Invalid partner type")
    public ValidationRule validPartnerType() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if partner is defined
        if (self.getPartner() == null) {
            return ValidationResult.pass();
        }

        EntityType selfEntityType = getEntityType(self);
        EntityType partnerEntityType = getEntityType(self.getPartner());

        boolean isValid = self.getPartner().eContainer() == self.getTarget()
                && self.getPartner().getTarget() == selfEntityType;

        if (!isValid) {
            return ValidationResult.fail(
                    "ValidPartnerType",
                    "Invalid partner type: " + self.getPartner() + " for " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Critique(name = "AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound", message = "At least one reference in bidirectional association should have zero lower bound")
    @Satisfies({"validPartnerRelations", "validPartnerType"})
    public ValidationRule atLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: partner must be defined and relations must be valid
        if (self.getPartner() == null) {
            return ValidationResult.pass();
        }

        // Both cardinalities must be defined
        if (self.getCardinality() == null || self.getPartner().getCardinality() == null) {
            return ValidationResult.pass();
        }

        boolean hasZeroLowerBound = self.getCardinality().getLower() == 0
                || self.getPartner().getCardinality().getLower() == 0;

        if (!hasZeroLowerBound) {
            return ValidationResult.fail(
                    "AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound",
                    "At least one reference of a bidirectional association should have lower bound with zero: " + self + " or " + self.getPartner(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
