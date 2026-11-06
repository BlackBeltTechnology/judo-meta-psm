# `lifecycle-mapping-metadata.xml`

m2e lifecycle mapping shipped inside the plugin jar. One `pluginExecution` filters goals `generate`, `clean`, `synchronizeGitignore`, `resetChecksum`, `checksum` and maps them to `<execute>` with `runOnIncremental=false` and `runOnConfiguration=false`, so Eclipse never fires generation on workspace build or project configure.
Contract: a new goal added to the plugin must be listed here or m2e reports it as a not-covered lifecycle mapping error.