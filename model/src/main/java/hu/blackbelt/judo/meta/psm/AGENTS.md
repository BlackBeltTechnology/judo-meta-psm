# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm`

Core Epsilon EVL validation orchestration and metamodel helper utilities for PSM models.

| File | Purpose |
| --- | --- |
| `PsmEpsilonValidator.java` | Executes EVL validation against PSM models using Epsilon runtime. Exports `validatePsm(Logger, PsmModel, URI, ...)`, `calculatePsmValidationScriptURI()`; throws `ScriptExecutionException` on failure. |
| `PsmUtils.java` | Metamodel traversal and query utilities for PSM entities, relations, features, operations, and duration rates. Exports `parametersAreCompatible()`, `getAllBoundOperations()`, `getRate()`, `isRegex()`. |
