# AGENTS.md — `generator-maven-plugin-test/src/test/resources/override/test1`

Override templates used to test replacement and decoration semantics in code generation.

| File | Purpose |
| --- | --- |
| `actorReplaced.hbs` | Replacement template for actor generation tests. Prepends `REPLACED` marker and renders actor names and helper projections (`plainName`, `pathName`, `modelName`, `packageName`). |
| `actorToOverride.override.hbs` | Decorator template testing template override semantics. Prepends `DECORATED` marker and delegates to partial `test1/actorToOverride.hbs`. |
