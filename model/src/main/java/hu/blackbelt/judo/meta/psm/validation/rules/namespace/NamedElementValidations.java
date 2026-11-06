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
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

import java.util.regex.Pattern;

/**
 * Validation rules for NamedElement.
 * Corresponds to validations/namespace/namedElement.evl
 */
@ValidationContext(NamedElement.class)
public class NamedElementValidations {

    // Constraint/Critique name constants
    private static final String NAMED_ELEMENT_HAS_CONTAINER = "NamedElementHasContainer";
    private static final String NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER = "NamedElementIsUniqueInItsContainer";
    private static final String ELEMENT_NAME_NOT_EMPTY = "ElementNameNotEmpty";
    private static final String ELEMENT_NAME_CONTAINS_VALID_CHARACTERS = "ElementNameContainsValidCharacters";
    private static final String ELEMENT_NAME_CANNOT_CONTAIN_SUBSEQUENT_UNDERSCORES = "ElementNameCannotContainSubsequentUnderscores";
    private static final String ELEMENT_NAME_FIRST_CHARACTER_CANNOT_BE_DIGIT = "ElementNameFirstCharacterCannotBeDigit";
    private static final String ELEMENT_NAME_LAST_CHARACTER_CANNOT_BE_UNDERSCORE = "ElementNameLastCharacterCannotBeUnderscore";
    // External constraint references

    private static final Pattern VALID_NAME_PATTERN = Pattern.compile("([a-z]|[A-Z]|[0-9]|_)+");
    private static final Pattern FIRST_CHAR_PATTERN = Pattern.compile("[a-zA-Z_]");

    @Constraint(name = NAMED_ELEMENT_HAS_CONTAINER, message = "Named element has no container")
    public ValidationRule namedElementHasContainer() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            // Guard: not a Model (Models don't need containers)
            if (self instanceof Model) {
                return ValidationResult.pass();
            }

            if (self.eContainer() == null) {
                return ValidationResult.fail(
                        NAMED_ELEMENT_HAS_CONTAINER,
                        "Named element " + self.getName() + " has no container",
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER, message = "Named element is not unique in its container")
    @Satisfies(NAMED_ELEMENT_HAS_CONTAINER)
    public ValidationRule namedElementIsUniqueInItsContainer() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            if (self.eContainer() == null) {
                return ValidationResult.pass();
            }

            boolean hasDuplicate = self.eContainer().eContents().stream()
                    .filter(c -> c instanceof NamedElement)
                    .map(c -> (NamedElement) c)
                    .filter(ne -> ne != self)
                    .anyMatch(ne -> ne.getName() != null && self.getName() != null
                            && ne.getName().equalsIgnoreCase(self.getName()));

            if (hasDuplicate) {
                return ValidationResult.fail(
                        NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER,
                        "Named element " + self.getName() + " is not unique in its container",
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = ELEMENT_NAME_NOT_EMPTY, message = "Named element name must contain at least one character")
    public ValidationRule elementNameNotEmpty() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            if (self.getName() == null || self.getName().isEmpty()) {
                return ValidationResult.fail(
                        ELEMENT_NAME_NOT_EMPTY,
                        "Named element name must contain at least one character. Zero length name found in " + self,
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = ELEMENT_NAME_CONTAINS_VALID_CHARACTERS, message = "Named element's name can only contain valid characters")
    @Satisfies(ELEMENT_NAME_NOT_EMPTY)
    public ValidationRule elementNameContainsValidCharacters() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            if (self.getName() == null || self.getName().isEmpty()) {
                return ValidationResult.pass();
            }

            if (!VALID_NAME_PATTERN.matcher(self.getName()).matches()) {
                return ValidationResult.fail(
                        ELEMENT_NAME_CONTAINS_VALID_CHARACTERS,
                        "Named element's name can only contain english letters (A-Z, a-z), digits (0-9) and underscore characters (_): " + self.getName(),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = ELEMENT_NAME_CANNOT_CONTAIN_SUBSEQUENT_UNDERSCORES, message = "Named element's name cannot contain subsequent underscores")
    @Satisfies(ELEMENT_NAME_NOT_EMPTY)
    public ValidationRule elementNameCannotContainSubsequentUnderscores() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            if (self.getName() == null || self.getName().isEmpty()) {
                return ValidationResult.pass();
            }

            if (self.getName().contains("__")) {
                return ValidationResult.fail(
                        ELEMENT_NAME_CANNOT_CONTAIN_SUBSEQUENT_UNDERSCORES,
                        "Named element's name cannot contain two subsequent underscore characters: " + self.getName(),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = ELEMENT_NAME_FIRST_CHARACTER_CANNOT_BE_DIGIT, message = "Named element's name must start with a letter or underscore")
    @Satisfies(ELEMENT_NAME_NOT_EMPTY)
    public ValidationRule elementNameFirstCharacterCannotBeDigit() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            if (self.getName() == null || self.getName().isEmpty()) {
                return ValidationResult.pass();
            }

            String firstChar = String.valueOf(self.getName().charAt(0));
            if (!FIRST_CHAR_PATTERN.matcher(firstChar).matches()) {
                return ValidationResult.fail(
                        ELEMENT_NAME_FIRST_CHARACTER_CANNOT_BE_DIGIT,
                        "Named element's name must start with an english letter or an underscore: " + self.getName(),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }

    @Constraint(name = ELEMENT_NAME_LAST_CHARACTER_CANNOT_BE_UNDERSCORE, message = "Named element's name must end with a letter or digit")
    @Satisfies(ELEMENT_NAME_NOT_EMPTY)
    public ValidationRule elementNameLastCharacterCannotBeUnderscore() {
        return (element, context) -> {
            NamedElement self = (NamedElement) element;
            if (self.getName() == null || self.getName().isEmpty()) {
                return ValidationResult.pass();
            }

            if (self.getName().endsWith("_")) {
                return ValidationResult.fail(
                        ELEMENT_NAME_LAST_CHARACTER_CANNOT_BE_UNDERSCORE,
                        "Named element's name must end with an english letter or a digit: " + self.getName(),
                        Severity.ERROR,
                        self
                );
            }
            return ValidationResult.pass();
        };
    }
}
