# `EntityTypeValidations.java`

Ports `validations/data/entityType.evl`, `@ValidationContext(EntityType.class)`. Exposes 23 public `ValidationRule` factories: `entityTypeNamesAreUnique`, `inheritanceIsNotRecursive`, `abstractEntityTypeSuperEntityTypesAreAbstract`, five `inheritingUnique*Names`, five `inheritedOperationAnd*NamesAreUnique`, ten pairwise `inheriting*OfTheSameNameIsNotAllowed`.

Private `getInherited*Names(EntityType)` collect `toLowerCase()` inherited member names from `getAllSuperEntityTypes()`; every name collision check is case-insensitive.

`entityTypeNamesAreUnique()` is `@Critique`-annotated, fails with `Severity.WARNING`, self-excluding scan over `context.getAllInstances(EntityType.class)`, null-guards `getName()`; all other rules `@Constraint` `Severity.ERROR`. `abstractEntityTypeSuperEntityTypesAreAbstract` gated `@Satisfies(INHERITANCE_IS_NOT_RECURSIVE)`; `entityTypeNamesAreUnique` gated `@Satisfies(NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER)`.