# `TestHelper.java`

Name-mangling functions the plugin's Handlebars fixtures call. Extends `StaticMethodValueResolver`, annotated `@TemplateHelper` so `judo-generator-commons` auto-registers its `public static` methods into the SpEL context.
Exports `fQName(ActorType)`, `plainName`, `pathName`, `path`, `packageName`, `modelName`, `fqClass` (`@Deprecated`), `fqClassWithoutModel`; `packageName` returns `null` for FQNs with ≤2 `::` tokens.