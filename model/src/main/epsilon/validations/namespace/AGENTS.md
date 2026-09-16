# AGENTS.md — `model/src/main/epsilon/validations/namespace`

EVL validation constraints and aggregator for top-level model containers and named element identifiers.

| File | Purpose |
| --- | --- |
| `_importNamespace.evl` | Aggregates namespace EVL validations. Imports rules from `model.evl` and `namedElement.evl`. |
| `model.evl` | Validates root model boundaries. Defines `StandaloneModelLoadedOnly` checking `PSM!Model.all().size() == 1`. |
| `namedElement.evl` | Validates `PSM!NamedElement` containment and identifier syntax. Defines `NamedElementHasContainer`, `NamedElementIsUniqueInItsContainer`, `ElementNameNotEmpty`, `ElementNameContainsValidCharacters`, `ElementNameCannotContainSubsequentUnderscores`, `ElementNameFirstCharacterCannotBeDigit`, and `ElementNameLastCharacterCannotBeUnderscore`. |
