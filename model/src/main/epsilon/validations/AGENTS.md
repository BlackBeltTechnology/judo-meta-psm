# AGENTS.md — `model/src/main/epsilon/validations`

| File | Purpose |
|---|---|
| `psm-plugin-validator.evl` | Entry script used when validation runs inside the Eclipse/OSGi plugin. Imports `psm.evl` and its `pre` block binds `psmUtils` to `new Native("hu.blackbelt.judo.meta.psm.PsmUtils")`. Every imported rule that calls `psmUtils` depends on this binding, so a runner that executes `psm.evl` directly must supply `psmUtils` itself. |
| `psm.evl` | Aggregate root of the EVL rule set: imports `_importAccesspoint.evl`, `_importData.evl`, `_importDerived.evl`, `_importMeasure.evl`, `_importNamespace.evl`, `_importService.evl`, `_importType.evl` — one per metamodel package subdirectory. Holds no rules of its own; a new rule file is only reachable once its package `_import*.evl` lists it. |
