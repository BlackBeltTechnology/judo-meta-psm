package hu.blackbelt.judo.meta.psm.validation.rules.derived;

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

import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for DataProperty.
 * Corresponds to validations/derived/dataProperty.evl
 */
@ValidationContext(DataProperty.class)
public class DataPropertyValidations {

    // Constraint/Critique name constants
    private static final String INHERITED_AND_OWN_DATA_PROPERTY_NAME_IS_UNIQUE_IN_ENTITY_TYPE = "InheritedAndOwnDataPropertyNameIsUniqueInEntityType";
    private static final String DATA_PROPERTY_IS_NOT_REQUIRED = "DataPropertyIsNotRequired";
    // External constraint references
    private static final String NAMED_ELEMENT_HAS_CONTAINER = "namedElementHasContainer";


    @Constraint(name = INHERITED_AND_OWN_DATA_PROPERTY_NAME_IS_UNIQUE_IN_ENTITY_TYPE, message = "Data property has the same name as inherited content")
    @Satisfies(NAMED_ELEMENT_HAS_CONTAINER)
    public ValidationRule inheritedAndOwnDataPropertyNameIsUniqueInEntityType() {
        return (element, context) -> {
            DataProperty self = (DataProperty) element;
        if (self.eContainer() == null || !(self.eContainer() instanceof EntityType)) {
            return ValidationResult.pass();
        }

        EntityType entityType = (EntityType) self.eContainer();
        
        boolean hasDuplicate = entityType.getAllSuperEntityTypes().stream()
                .flatMap(superType -> superType.eContents().stream())
                .filter(c -> c instanceof NamedElement)
                .map(c -> (NamedElement) c)
                .anyMatch(ne -> ne.getName() != null && self.getName() != null
                        && ne.getName().equalsIgnoreCase(self.getName()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    INHERITED_AND_OWN_DATA_PROPERTY_NAME_IS_UNIQUE_IN_ENTITY_TYPE,
                    "Data property: " + self.getName() + " has the same name as inherited content(s) of entity type: " + entityType.getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = DATA_PROPERTY_IS_NOT_REQUIRED, message = "Data property cannot be required")
    public ValidationRule dataPropertyIsNotRequired() {
        return (element, context) -> {
            DataProperty self = (DataProperty) element;
        if (self.eContainer() == null || !(self.eContainer() instanceof EntityType)) {
            return ValidationResult.pass();
        }

        EntityType entityType = (EntityType) self.eContainer();

        if (self.isRequired()) {
            return ValidationResult.fail(
                    DATA_PROPERTY_IS_NOT_REQUIRED,
                    "Data property " + self.getName() + " of entity type " + entityType.getName() + " cannot be required.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
