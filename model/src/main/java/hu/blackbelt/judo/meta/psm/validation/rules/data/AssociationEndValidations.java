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

    // Constraint/Critique name constants
    private static final String CASCADE_DELETE_ONLY_ALLOWED_IF_UPPER_CARDINALITY_IS_ONE = "CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne";
    private static final String PARTNER_IS_NOT_SELF = "PartnerIsNotSelf";
    private static final String OPPOSITE_PARTNER_IS_DEFINED = "OppositePartnerIsDefined";
    private static final String VALID_PARTNER_RELATIONS = "ValidPartnerRelations";
    private static final String VALID_PARTNER_TYPE = "ValidPartnerType";
    private static final String AT_LEAST_ONE_REFERENCE_IN_BIDIRECTIONAL_ASSOCIATION_HAS_ZERO_LOWER_BOUND = "AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound";
    // External constraint references

    private EntityType getEntityType(AssociationEnd self) {
        if (self.eContainer() instanceof EntityType) {
            return (EntityType) self.eContainer();
        }
        return null;
    }

    @Constraint(name = CASCADE_DELETE_ONLY_ALLOWED_IF_UPPER_CARDINALITY_IS_ONE, message = "Cascade delete only allowed if upper cardinality is 1")
    public ValidationRule cascadeDeleteOnlyAllowedIfUpperCardinalityIsOne() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if reverseCascadeDelete is true
        if (!self.isReverseCascadeDelete()) {
            return ValidationResult.pass();
        }

        if (self.getCardinality() == null || self.getCardinality().getUpper() != 1) {
            return ValidationResult.fail(
                    CASCADE_DELETE_ONLY_ALLOWED_IF_UPPER_CARDINALITY_IS_ONE,
                    "Cascade delete behavior only allowed on endpoints if their upper cardinality is 1: " + self.getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = PARTNER_IS_NOT_SELF, message = "Partner cannot be self")
    public ValidationRule partnerIsNotSelf() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if partner is defined
        if (self.getPartner() == null) {
            return ValidationResult.pass();
        }

        if (self.getPartner() == self) {
            return ValidationResult.fail(
                    PARTNER_IS_NOT_SELF,
                    "Self partner relation found: " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = OPPOSITE_PARTNER_IS_DEFINED, message = "Opposite partner must be defined")
    @Satisfies(PARTNER_IS_NOT_SELF)
    public ValidationRule oppositePartnerIsDefined() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: only check if partner is defined and not self
        if (self.getPartner() == null || self.getPartner() == self) {
            return ValidationResult.pass();
        }

        if (self.getPartner().getPartner() == null) {
            return ValidationResult.fail(
                    OPPOSITE_PARTNER_IS_DEFINED,
                    "Missing opposite partner relation for " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = VALID_PARTNER_RELATIONS, message = "Invalid partner relations")
    @Satisfies(OPPOSITE_PARTNER_IS_DEFINED)
    public ValidationRule validPartnerRelations() {
        return (element, context) -> {
            AssociationEnd self = (AssociationEnd) element;
        // Guard: partner and opposite partner must be defined
        if (self.getPartner() == null || self.getPartner().getPartner() == null) {
            return ValidationResult.pass();
        }

        if (self.getPartner().getPartner() != self) {
            return ValidationResult.fail(
                    VALID_PARTNER_RELATIONS,
                    "Opposite partner relation of " + self.getPartner() + " must be " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = VALID_PARTNER_TYPE, message = "Invalid partner type")
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
                    VALID_PARTNER_TYPE,
                    "Invalid partner type: " + self.getPartner() + " for " + self,
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Critique(name = AT_LEAST_ONE_REFERENCE_IN_BIDIRECTIONAL_ASSOCIATION_HAS_ZERO_LOWER_BOUND, message = "At least one reference in bidirectional association should have zero lower bound")
    @Satisfies({VALID_PARTNER_RELATIONS, VALID_PARTNER_TYPE})
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
                    AT_LEAST_ONE_REFERENCE_IN_BIDIRECTIONAL_ASSOCIATION_HAS_ZERO_LOWER_BOUND,
                    "At least one reference of a bidirectional association should have lower bound with zero: " + self + " or " + self.getPartner(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
