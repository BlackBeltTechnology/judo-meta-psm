# `NamedElementValidations.java`

Validates naming constraints and containment for `NamedElement`. Exports `namedElementHasContainer()`, `namedElementIsUniqueInItsContainer()`, `elementNameNotEmpty()`, `elementNameContainsValidCharacters()`, `elementNameCannotContainSubsequentUnderscores()`, `elementNameFirstCharacterCannotBeDigit()`, `elementNameLastCharacterCannotBeUnderscore()`.
Enforces container presence (except for `Model`), container-scoped uniqueness, and strict alphanumeric/underscore identifier formatting.