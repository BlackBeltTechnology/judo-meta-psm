# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm/validation/rules/namespace`

Validation rules for PSM models and named namespace elements.

| File | Purpose |
| --- | --- |
| `ModelValidations.java` | Validates PSM `Model` instances. Exports `standaloneModelLoadedOnly()`. Requires exactly one model instance in the validation context; multiple model roots trigger ERROR severity. |
| `NamedElementValidations.java` | Validates naming constraints and containment for `NamedElement`; exports `namedElementHasContainer()`, `namedElementIsUniqueInItsContainer()` and six `elementName*()` rules. → see `NamedElementValidations.java.AGENTS.md` |
