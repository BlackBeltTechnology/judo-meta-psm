# AGENTS.md — `model/src/main/epsilon/validations/derived`

EVL validation constraints and aggregator for PSM derived features, accessors, and static elements.

| File | Purpose |
| --- | --- |
| `_importDerived.evl` | Aggregates derived-feature EVL validations. Imports rules for data properties, navigation properties, primitive/reference accessors, and static elements. |
| `dataProperty.evl` | Validates `PSM!DataProperty` naming and requiredness. Defines `InheritedAndOwnDataPropertyNameIsUniqueInEntityType` and `DataPropertyIsNotRequired` (`not self.required`). |
| `navigationProperty.evl` | Validates `PSM!NavigationProperty` naming and multiplicity. Defines `InheritedAndOwnNavigationPropertyNameIsUniqueInEntityType` and `NavigationProptertyIsSingleOrCollection` (`lower == 0 and upper in (1, -1)`). |
| `primitiveAccessor.evl` | Enforces supported accessor features on `PSM!PrimitiveAccessor`. Defines `SetterExpressionsAreNotSupportedYet` requiring setter expressions to remain undefined. |
| `referenceAccessor.evl` | Enforces supported accessor features on `PSM!ReferenceAccessor`. Defines `SetterExpressionsAreNotSupportedYet` requiring setter expressions to remain undefined. |
| `staticData.evl` | Validates `PSM!StaticData` global naming. Defines critique `StaticDataNamesAreUnique` checking case-insensitive uniqueness across all static data instances. |
| `staticNavigation.evl` | Validates `PSM!StaticNavigation` global naming. Defines critique `StaticNavigationNamesAreUnique` checking case-insensitive uniqueness across all static navigation instances. |
