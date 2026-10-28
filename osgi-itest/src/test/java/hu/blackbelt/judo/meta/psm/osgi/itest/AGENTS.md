# AGENTS.md — `osgi-itest/src/test/java/hu/blackbelt/judo/meta/psm/osgi/itest`

Pax Exam OSGi integration tests validating PSM model loading and validation inside Apache Karaf container.

| File | Purpose |
| --- | --- |
| `KarafFeatureProvider.java` | Configures Pax Exam Apache Karaf container for integration testing. Exports `karafUrl()`, `getFreePort()`, `getKarafPort()`, `karafConfig()`, `getOsgiService()`, and bundle tracking helper assertions. |
| `PsmModelLoadITest.java` | OSGi integration test running inside Pax Exam Karaf. Injects `BundleContext`, `BundleTrackerManager`, and `PsmModel`, asserting model load validity and running `validatePsm`. |
