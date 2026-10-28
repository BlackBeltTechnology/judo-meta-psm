# `generator-maven-plugin-test/src/test/resources` — descriptor roots and parameter files the plugin executions point at

The module `pom.xml` passes `src/test/resources/base` then `src/test/resources/override` as the
`<uris>` of `judo-psm-generator-maven-plugin:generate`, and this directory itself as
`<parameterDirectory>`.

| File | Purpose |
|---|---|
| `generator-parameter.properties` | Supplies `stringListFactory=test1,test2,test3` to the SpEL context as the `#stringListFactory` variable. Read because the plugin's `parameterDirectory` points at this directory. The `baseFactory` descriptor entry expands one output per comma-separated token, so editing the list changes how many `*.baseFactory` files the verifier's target tree contains. |
