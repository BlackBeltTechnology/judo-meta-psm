# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm/cli`

CLI adapters providing type-safe FQN resolution and model validation for PSM metamodels.

| File | Purpose |
| --- | --- |
| `PsmFqnResolverImpl.java` | Resolves PSM model elements by fully qualified name using cached lazy index. Implements `FqnResolver`; exports `bind(ResourceSet)`, `unbind()`, `resolve(String)`, `getFqn(EObject)`, `findByPattern(String)`. |
| `PsmValidatorImpl.java` | Adapts PSM validation into judo-cli-api. Implements `ModelValidator`; exports `getModelType()` returning `"psm"`, and `validate(Logger, Object)` invoking `PsmEpsilonValidator.validatePsm()`. |
