package hu.blackbelt.judo.meta.psm.validation.rules.accesspoint;

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

import hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for ActorType.
 * Corresponds to validations/accesspoint/actorType.evl
 */
public class ActorTypeValidations {

    /**
     * Validation for MappedTransferObjectType with actor type.
     */
    @ValidationContext(MappedTransferObjectType.class)
    public static class MappedTransferObjectActorTypeValidations {

        // Constraint/Critique name constants
        private static final String ACTOR_TYPE_IS_MAPPED = "ActorTypeIsMapped";


        @Constraint(name = ACTOR_TYPE_IS_MAPPED, message = "Actor type must be mapped")
        public ValidationRule actorTypeIsMapped() {
            return (element, context) -> {
                MappedTransferObjectType self = (MappedTransferObjectType) element;
                // Guard: actorType must be defined
                if (self.getActorType() == null) {
                    return ValidationResult.pass();
                }

                if (!(self.getActorType() instanceof MappedActorType)) {
                    return ValidationResult.fail(
                            ACTOR_TYPE_IS_MAPPED,
                            "Actor type must be mapped: " + self.getName(),
                            Severity.ERROR,
                            self
                    );
                }
                return ValidationResult.pass();
            };
        }
    }

    /**
     * Validation for UnmappedTransferObjectType with actor type.
     */
    @ValidationContext(UnmappedTransferObjectType.class)
    public static class UnmappedTransferObjectActorTypeValidations {

        // Constraint/Critique name constants
        private static final String ACTOR_TYPE_IS_UNMAPPED = "ActorTypeIsUnmapped";


        @Constraint(name = ACTOR_TYPE_IS_UNMAPPED, message = "Actor type must be unmapped")
        public ValidationRule actorTypeIsUnmapped() {
            return (element, context) -> {
                UnmappedTransferObjectType self = (UnmappedTransferObjectType) element;
                // Guard: actorType must be defined
                if (self.getActorType() == null) {
                    return ValidationResult.pass();
                }

                // The EVL checks self.actorType.isKindOf(PSM!ActorType) which is always true
                // since actorType is of type ActorType. But for unmapped, we want to ensure
                // it's NOT a MappedActorType
                if (self.getActorType() instanceof MappedActorType) {
                    return ValidationResult.fail(
                            ACTOR_TYPE_IS_UNMAPPED,
                            "Actor type must be unmapped: " + self.getName(),
                            Severity.ERROR,
                            self
                    );
                }
                return ValidationResult.pass();
            };
        }
    }
}
