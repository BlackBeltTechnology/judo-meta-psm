# AGENTS.md — `generator-maven-plugin-test/src/test/resources/base/test1`

Handlebars test templates for generator plugin base-level actor and factory code generation tests.

| File | Purpose |
| --- | --- |
| `actorToDelete.hbs` | Template testing file deletion behaviour during generation. Outputs actor name, FQName, and helper projections (`plainName`, `pathName`, `modelName`, `packageName`). |
| `actorToNotGenerated.hbs` | Template testing generation exclusion filter. Outputs actor name, FQName, and helper projections (`plainName`, `pathName`, `modelName`, `packageName`). |
| `actorToOverride.hbs` | Base template testing override semantics. Outputs actor name, extra property, FQName, and helper projections (`plainName`, `pathName`, `modelName`, `packageName`). |
| `actorToReplace.hbs` | Base template testing replacement semantics. Outputs actor name, FQName, and helper projections (`plainName`, `pathName`, `modelName`, `packageName`). |
| `baseFactory.hbs` | Template testing factory generation at base level. Interpolates context root `{{ self }}` into `Name:` line. |
| `language.hbs` | Template testing language parameter injection. Interpolates context root `{{ self }}` into `Lang:` line. |
