package hu.blackbelt.judo.meta.psm.validation.rules.measure;

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

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for DerivedMeasure.
 * Corresponds to validations/measure/derivedMeasure.evl
 */
@ValidationContext(DerivedMeasure.class)
public class DerivedMeasureValidations {

    // Constraint/Critique name constants
    private static final String NO_CIRCULAR_REFERENCES_OF_DERIVED_MEASURES = "NoCircularReferencesOfDerivedMeasures";


    @Constraint(name = NO_CIRCULAR_REFERENCES_OF_DERIVED_MEASURES, message = "Derived measure definition is recursive")
    public ValidationRule noCircularReferencesOfDerivedMeasures() {
        return (element, context) -> {
            DerivedMeasure self = (DerivedMeasure) element;
        if (self.getAllTermMeasures().contains(self)) {
            return ValidationResult.fail(
                    NO_CIRCULAR_REFERENCES_OF_DERIVED_MEASURES,
                    "Derived measure definition " + self.getName() + " is recursive",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }
}
