# `generator-engine/src/test/java/hu/blackbelt/judo/meta/psm/generator/engine` — end-to-end generation run over the Northwind demo model

| File | Purpose |
|---|---|
| `NorthwindTest.java` | Runs `PsmGenerator.generateToDirectory` over `new Demo().fullDemo()` with the `base` then `override` descriptor roots layered in a `LinkedHashMap`, asserting emitted line content of `InternalUser/actorToOverride` and `InternalUser/actorReplaced` and absence of `actorToReplace`/`actorToDelete`/`actorToNotGenerated`. Descriptor name is `test-project`; output lands in `target/test-classes/northwind-test`. `@AfterEach` saves the model, so `testName` must be set inside each test. |
| `PsmGeneratorTest.java` | Pins glob semantics of `PsmGenerator.getIgnoredFileMatcher`: `pom.xml` matches only at root, `**/pom.xml` matches nested `rest/pom.xml` and `rest/other/pom.xml`, `readme.txt` matches neither. Single `@Test testFileIgnore`. |
| `TestHelper.java` | `@TemplateHelper` `StaticMethodValueResolver` registered by `TemplateHelperFinder` and used by the `.hbs` fixtures. Exports `fQName`, `plainName`, `cleanup`, `pathName`, `path`, `packageName`, `modelName`, `fqClass` (deprecated), `fqClassWithoutModel`. All return `""` on null input except `packageName`, which returns `null` when the fq name has 2 or fewer `::` tokens. |
