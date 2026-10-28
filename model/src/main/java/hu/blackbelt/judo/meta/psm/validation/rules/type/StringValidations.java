package hu.blackbelt.judo.meta.psm.validation.rules.type;

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

import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Validation rules for StringType.
 * Corresponds to validations/type/string.evl
 */
@ValidationContext(StringType.class)
public class StringValidations {

    // Constraint/Critique name constants
    private static final String VALID_MAX_LENGTH = "ValidMaxLength";
    private static final String MAX_LENGTH_IS_NOT_TOO_LARGE = "MaxLengthIsNotTooLarge";
    private static final String VALID_REGEX = "ValidRegex";


    @Constraint(name = VALID_MAX_LENGTH, message = "MaxLength must be greater than 0")
    public ValidationRule validMaxLength() {
        return (element, context) -> {
            StringType self = (StringType) element;
            if (self.getMaxLength() <= 0) {
                return ValidationResult.fail(
                        VALID_MAX_LENGTH,
                        "MaxLength must be greater than 0: " + self.getName(),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Critique(name = MAX_LENGTH_IS_NOT_TOO_LARGE, message = "MaxLength is recommended to be less than or equal to 4000")
    public ValidationRule maxLengthIsNotTooLarge() {
        return (element, context) -> {
            StringType self = (StringType) element;
            if (self.getMaxLength() > 4000) {
                return ValidationResult.fail(
                        MAX_LENGTH_IS_NOT_TOO_LARGE,
                        "MaxLength is recommended to be less than/equals to 4000: " + self.getName(),
                        Severity.WARNING,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = VALID_REGEX, message = "Invalid regular expression")
    public ValidationRule validRegex() {
        return (element, context) -> {
            StringType self = (StringType) element;
            // Guard: only check if regExp is defined
            if (self.getRegExp() == null || self.getRegExp().isEmpty()) {
                return ValidationResult.pass();
            }

            try {
                Pattern.compile(self.getRegExp());
                return ValidationResult.pass();
            } catch (PatternSyntaxException e) {
                return ValidationResult.fail(
                        VALID_REGEX,
                        "Invalid regular expression of " + self.getName(),
                        Severity.ERROR,
                        self
                );
            }
        };
    }
}
