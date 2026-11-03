# `generator-engine/src/test/resources/override` — second descriptor root layered over `base` by `NorthwindTest`

| File | Purpose |
|---|---|
| `test-project.yaml` | Redefines `testReplace` to emit `#actorType.name + '/actorReplaced'` from `test1/actorReplaced.hbs`, and cancels `testDelete` with `exclude: true`. Entries are matched to the base root by `name`; renaming one here stops overriding and starts adding a template. |
