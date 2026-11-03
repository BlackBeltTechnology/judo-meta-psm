# `generator-engine/src/test/resources/base/test1` — Handlebars fixtures exercising the `TestHelper` naming helpers

| File | Purpose |
|---|---|
| `actorToDelete.hbs` | Renders the seven-line name block (`Name`, `FQName`, `PlainName`, `Plain FQ`, `Path FQ`, `ModelName FQ`, `Package Name FQ`). Bound by descriptor entry `testDelete`, which the override root sets `exclude: true`; `NorthwindTest` asserts the output file is absent. |
| `actorToNotGenerated.hbs` | Same seven-line name block, bound by entry `testNotGenerated` whose `conditionExpression: false` suppresses it. Proves condition evaluation, not rendering — a change making it emit breaks `NorthwindTest`. |
| `actorToOverride.hbs` | Same name block plus an `Extra: {{ extra }}` line fed from `extraContextVariables`. Included verbatim by `override/test1/actorToOverride.override.hbs` via a partial, so the `Extra` line and line order are load-bearing for the `containsExactly` assertion. |
| `actorToReplace.hbs` | Same seven-line name block, bound by entry `testReplace`. The override root rebinds that entry name to `actorReplaced.hbs` at a different path, so this template's output must not exist after generation. |
