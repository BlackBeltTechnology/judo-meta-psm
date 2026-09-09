# `generator-engine/src/test/resources/override/test1` — override-root Handlebars fixtures

| File | Purpose |
|---|---|
| `actorReplaced.hbs` | Emits a leading `REPLACED` line before the seven-line name block. Bound by the override entry `testReplace`; `NorthwindTest` asserts the file `InternalUser/actorReplaced` starts with `REPLACED`. |
| `actorToOverride.override.hbs` | Single line `DECORATED {{> test1/actorToOverride.hbs }}` — the `.override.hbs` suffix makes the engine decorate the base template of the same name instead of replacing it. The base partial is pulled from the base root, so removing that file breaks resolution here. |
