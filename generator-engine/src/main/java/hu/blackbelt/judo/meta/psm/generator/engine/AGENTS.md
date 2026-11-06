# `generator-engine/src/main/java/hu/blackbelt/judo/meta/psm/generator/engine` — PSM-side binding of the shared `judo-generator-commons` template engine

| File | Purpose |
|---|---|
| `PsmGenerator.java` | Fans Handlebars/SpringEL templates over the `ActorType` instances of a `PsmModel`, one `CompletableFuture` per generated file. Exports `execute`, `generateToDirectory`, `resetChecksumsInDirectory`, `cleanGeneratedFromChecksumInDirectory`, `synchronizeGitignoreInDirectory`, `recalculateChecksumForDirectory`, `fqName`. A resource set without a `Model` throws `RuntimeException("Could not find the model entry")`. |
| `PsmGeneratorParameter.java` | Lombok `@Builder(builderMethodName = "psmGeneratorParameter")` argument holder every `PsmGenerator` entry point takes. Fields `psmModel`, `generatorContext`, `actorTypePredicate` (default accept-all), `actorTypeTargetDirectoryResolver`, `targetDirectoryResolver`, `log`, `extraContextVariables`, `validateChecksum` (default `true`), `normalizerRegistry`. `psmModel` and both resolvers are `@NonNull`; omitting one fails `build()`. |
