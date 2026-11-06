# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/eclipse/psm`

Eclipse UI plugin activator managing runtime lifecycle for the PSM meta bundle.

| File | Purpose |
| --- | --- |
| `Activator.java` | Controls Eclipse plugin lifecycle. Exports `PLUGIN_ID`, singleton accessor `getDefault()`, `start(BundleContext)`, and `stop(BundleContext)`. |
