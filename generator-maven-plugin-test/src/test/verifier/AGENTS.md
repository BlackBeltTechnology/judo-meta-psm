# AGENTS.md — `generator-maven-plugin-test/src/test/verifier`

Maven invoker plugin verification descriptor validating generator plugin output files.

| File | Purpose |
| --- | --- |
| `verification.xml` | Asserts post-generation file outputs for integration tests: verifies `target/test-classes/psm/file/InternalUser/actorToOverride` contains `DECORATED` and `target/test-classes/psm/file/InternalUser/actorReplaced` contains `REPLACED`. |
