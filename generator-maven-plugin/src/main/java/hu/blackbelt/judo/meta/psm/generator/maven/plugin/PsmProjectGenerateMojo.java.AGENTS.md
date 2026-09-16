# `PsmProjectGenerateMojo.java`

`@Mojo(name = "generate")`, default phase `generate-resources`, `requiresDependencyResolution = COMPILE`,
`threadSafe = true`. Extends `AbstractPsmProjectMojo`; the only goal that actually renders templates.

**Exports**

- `performExecutionOnPsmParameters(PsmGeneratorParameter.PsmGeneratorParameterBuilder)` — builds the
  generator context and calls `PsmGenerator.generateToDirectory`.
- private `generalizeTemplateVariableNames(Map<String,String>)` — normalises every variable key through
  `PsmGenerator.generalizeName`.

**Mojo parameters**

- `type` (required) — template descriptor name passed as `descriptorName`.
- `uris` — template roots; each is resolved through `getResolvedTemplateDirectory(uri)` into an ordered
  `LinkedHashMap<String,URI>`.
- `helpers` — explicit helper class names.
- `scanDependencies` (default `true`), `scanPackages` — classpath scan for `@TemplateHelper` classes and
  for a context accessor.
- `contextAccessor` — explicit context-accessor class name.
- `templateParameters` (`HashMap<String,String>`), `parameterFiles`
  (default `judo-version.properties,generator-parameter.properties`), `parameterDirectory`
  (default `${project.basedir}/target/fullstack-project`).
- `variablePrecedence` (default `projectProperties,templateVariables,propertiesFiles,environmentVariables,systemProperties`).
- `validateChecksum` (default `true`).

**Contracts a caller can violate**

- Variables are merged in `variablePrecedence` **list order into one map**, so a later entry overwrites
  an earlier one — the last name in the list wins, which is the reverse of how "precedence" usually
  reads. Reordering the list changes which source wins.
- `systemProperties` is not handled; the branch tests `systemVariables`, and that branch reads
  `System.getenv()` again — system properties never reach the template context.
- An unknown precedence token is silently ignored, contributing no variables.
- A helper class in `helpers` that fails to load is only logged via `getLog().error` and skipped;
  generation continues without it. A failed classpath scan throws
  `MojoExecutionException("Could not scan dependencies")`, and an unloadable `contextAccessor` throws
  `IllegalArgumentException`.
- Explicit `contextAccessor` wins over the scanned one; scanning only sets it when `contextAccessor` is
  null or blank.
- `parameterFiles` entries are looked up relative to the file itself, then `parameterDirectory`, then
  `destination`; when none exists only a warning is logged, so a typo degrades to missing variables
  instead of a failure.
- Helper resolution relies on the thread context classloader installed by
  `AbstractPsmProjectMojo.execute()` — it is valid only inside this method.
- `validateChecksum = false` lets generation overwrite hand-modified generated files.
