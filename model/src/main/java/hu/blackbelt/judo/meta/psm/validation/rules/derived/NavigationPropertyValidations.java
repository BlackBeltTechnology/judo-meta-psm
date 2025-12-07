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
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for NavigationProperty.
 * Corresponds to validations/derived/navigationProperty.evl
 */
@ValidationContext(NavigationProperty.class)
public class NavigationPropertyValidations {

    @Constraint(name = "InheritedAndOwnNavigationPropertyNameIsUniqueInEntityType", message = "Navigation property has the same name as inherited content")
    @Satisfies("namedElementHasContainer")
    public ValidationRule inheritedAndOwnNavigationPropertyNameIsUniqueInEntityType() {
        return (element, context) -> {
            NavigationProperty self = (NavigationProperty) element;
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
                    "InheritedAndOwnNavigationPropertyNameIsUniqueInEntityType",
                    "Navigation property: " + self.getName() + " has the same name as inherited content(s) of entity type: " + entityType.getName(),
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = "NavigationPropertyIsSingleOrCollection", message = "Navigation property must be single or collection")
    public ValidationRule navigationPropertyIsSingleOrCollection() {
        return (element, context) -> {
            NavigationProperty self = (NavigationProperty) element;
        if (self.eContainer() == null || !(self.eContainer() instanceof EntityType)) {
            return ValidationResult.pass();
        }

        EntityType entityType = (EntityType) self.eContainer();

        if (self.getCardinality() == null) {
            return ValidationResult.pass();
        }

        boolean isValid = self.getCardinality().getLower() == 0
                && (self.getCardinality().getUpper() == 1 || self.getCardinality().getUpper() == -1);

        if (!isValid) {
            return ValidationResult.fail(
                    "NavigationProptertyIsSingleOrCollection",
                    "Navigation property " + self.getName() + " of entity type " + entityType.getName() + " cannot be required.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
