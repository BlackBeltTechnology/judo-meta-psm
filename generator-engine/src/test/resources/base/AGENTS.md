# `generator-engine/src/test/resources/base` — first descriptor root layered by `NorthwindTest`

| File | Purpose |
|---|---|
| `test-project.yaml` | Declares the four baseline `templates` entries `testOverride`, `testReplace`, `testDelete`, `testNotGenerated`, each `actorTypeBased: true` with a `pathExpression` of `#actorType.name + '/<file>'`. `testNotGenerated` carries `conditionExpression: false`, so it must never emit. Template names are resolved relative to this directory (`test1/*.hbs`); the override root reuses entry `name` values to replace or exclude these. |
