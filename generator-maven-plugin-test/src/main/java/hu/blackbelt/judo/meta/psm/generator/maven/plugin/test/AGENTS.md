# `generator-maven-plugin-test/src/main/java/hu/blackbelt/judo/meta/psm/generator/maven/plugin/test` — SpEL helper the plugin integration-test templates resolve names through

| File | Purpose |
|---|---|
| `TestHelper.java` | Name-mangling helpers the plugin's Handlebars fixtures call: extends `StaticMethodValueResolver` with `@TemplateHelper`; exports `fQName(ActorType)` plus plain/path/package/model name variants. → see `TestHelper.java.AGENTS.md` |
