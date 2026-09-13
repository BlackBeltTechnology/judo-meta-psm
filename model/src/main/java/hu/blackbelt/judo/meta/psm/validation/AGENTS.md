# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm/validation`

| File | Purpose |
|---|---|
| `PsmJavaValidationException.java` | Checked exception carrying the diff between produced and expected validation outcomes. Exports `getValidationResults()`, `getUnexpectedErrors()`, `getErrorsNotFound()`, `getUnexpectedWarnings()`, `getWarningsNotFound()`. Two-arg constructor defaults all four diff sets to empty lists. |
| `PsmModelProvider.java` | Adapts `PsmModel` to Zeta `ModelProvider`. `getAllContents(ResourceSet, Class<T>)` iterates the passed set and keeps instances of `type` only; `getPsmModel()` and `getResourceSet()` expose the wrapped model. Iterates the argument set, not the wrapped model — callers must pass `getResourceSet()`. |
| `PsmValidator.java` | Static entry point for Zeta Java validation of PSM, replacing the EVL path. `validate(Logger, PsmModel)` registers `VALIDATION_RULE_CLASSES` into a `ValidationRegistry` and runs `ValidationExecutor` on every `EObject`. `validatePsm(...)` diffs against expected constraint-name-plus-message strings, throws `PsmJavaValidationException`. Rule class runs only when listed in `VALIDATION_RULE_CLASSES`. |
