package hu.blackbelt.judo.meta.psm.validation.rules.namespace;

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

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

/**
 * Validation rules for Model.
 * Corresponds to validations/namespace/model.evl
 */
@ValidationContext(Model.class)
public class ModelValidations {

    // Constraint/Critique name constants
    private static final String STANDALONE_MODEL_LOADED_ONLY = "StandaloneModelLoadedOnly";


    @Constraint(name = STANDALONE_MODEL_LOADED_ONLY, message = "Standalone models are supported only")
    public ValidationRule standaloneModelLoadedOnly() {
        return (element, context) -> {
            Model self = (Model) element;
            long modelCount = context.getAllInstances(Model.class).size();

            if (modelCount != 1) {
                return ValidationResult.fail(
                        STANDALONE_MODEL_LOADED_ONLY,
                        "Standalone models are supported only",
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }
}
