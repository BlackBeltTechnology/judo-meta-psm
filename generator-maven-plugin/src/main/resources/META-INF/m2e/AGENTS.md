# AGENTS.md — `generator-maven-plugin/src/main/resources/META-INF/m2e`

| File | Purpose |
|---|---|
| `lifecycle-mapping-metadata.xml` | m2e lifecycle mapping shipped inside the plugin jar: one `pluginExecution` maps goals to `<execute>` with `runOnIncremental=false` and `runOnConfiguration=false`; new goals must be listed here or m2e flags a not-covered mapping error. → see `lifecycle-mapping-metadata.xml.AGENTS.md` |
