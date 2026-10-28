# `osgi/src/main/java/hu/blackbelt/judo/meta/psm/osgi` — OSGi bridge publishing bundle-embedded PSM models as services

| File | Purpose |
|---|---|
| `PsmModelBundleTracker.java` | Tracks bundles declaring the `Psm-Models` manifest header, loads each declared model entry with `loadPsmModel`, and registers it as a `PsmModel` OSGi service. → see `PsmModelBundleTracker.AGENTS.md` |
