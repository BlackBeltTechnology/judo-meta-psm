# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm/validation/rules/derived`

Validation rules for derived PSM elements including data properties, navigation properties, accessors, and static elements.

| File | Purpose |
| --- | --- |
| `DataPropertyValidations.java` | Validates PSM `DataProperty` instances. Exports `inheritedAndOwnDataPropertyNameIsUniqueInEntityType()`, `dataPropertyIsNotRequired()`. Requires non-null container; flags duplicate property names across inheritance hierarchy as ERROR and required flags on derived properties as ERROR. |
| `NavigationPropertyValidations.java` | Validates PSM `NavigationProperty` instances. Exports `inheritedAndOwnNavigationPropertyNameIsUniqueInEntityType()`, `navigationPropertyIsSingleOrCollection()`. Rejects duplicate property names across entity super types and verifies cardinality bounds. |
| `PrimitiveAccessorValidations.java` | Validates PSM `PrimitiveAccessor` instances. Exports `setterExpressionsAreNotSupportedYet()`. Rejects presence of `setterExpression` on primitive accessors with ERROR severity. |
| `ReferenceAccessorValidations.java` | Validates PSM `ReferenceAccessor` instances. Exports `setterExpressionsAreNotSupportedYet()`. Rejects presence of `setterExpression` on reference accessors with ERROR severity. |
| `StaticDataValidations.java` | Validates PSM `StaticData` instances across model context. Exports `staticDataNamesAreUnique()`. Emits WARNING critique when multiple `StaticData` instances share case-insensitive names. |
| `StaticNavigationValidations.java` | Validates PSM `StaticNavigation` instances across model context. Exports `staticNavigationNamesAreUnique()`. Emits WARNING critique when multiple `StaticNavigation` instances share case-insensitive names. |
