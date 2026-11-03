# AGENTS.md — `model/src/workflow`

MWE2 workflow definitions for generating EMF, helper, builder, and runtime model code.

| File | Purpose |
| --- | --- |
| `generateModel.mwe2` | MWE2 workflow module `PsmModelBuilder`. Cleans `${rootPath}/${javaGenPath}`, runs `EcoreGenerator` against `psm.genmodel`, and invokes `HelperGeneratorWorkflow`, `BuilderGeneratorWorkflow`, and `RuntimeModelGeneratorWorkflow` to emit Java sources into `src-gen`. |
