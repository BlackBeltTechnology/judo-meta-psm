# `AbstractPsmProjectMojo.java`

Base mojo shared by all six `judo-psm-generator-maven-plugin` goals. Loads the PSM
model, fixes up the classloader, assembles a `PsmGeneratorParameter` and hands it to
the concrete goal.

**Exports**

- `abstract performExecutionOnPsmParameters(PsmGeneratorParameter.PsmGeneratorParameterBuilder)` — the
  single extension point each goal implements.
- `execute()` (overrides `AbstractMojo`) — template method; subclasses never override it.
- `addPsmModel(builder)` — resolves `psm` to a file, loads it with `validateModel(false)`, and derives
  `modelName` from the first PSM namespace model when `modelName` is unset.
- `getArtifact(String url)` — resolves `mvn:` coordinates via Aether, or treats the string as a plain path.
- `getArtifactResult(String mvnUrl)`, `getFileFromArchive(File, String path)`, `iterateArchive(File, Function<ArchiveTuplet,Boolean>)`,
  `extractArchive(...)`, `getResolvedTemplateDirectory(String)`.
- inner `@AllArgsConstructor class ArchiveTuplet { ArchiveEntry archiveEntry; ArchiveInputStream archiveInputStream; }`.

**Shared mojo parameters**

`project`, `repoSystem`, `repoSession`, `repositories`, `pluginDescriptor` are read-only
injected. Author-facing: `psm` (model URL/coordinate), `destination` (default
`${project.basedir}/target/backend-project`), `modelName`, `actors`.

**Contracts a caller can violate**

- `execute()` replaces the thread context classloader with a `URLClassLoader` over project compile
  classpath + plugin artifacts + plugin `ClassRealm`, before any generation. A goal that resolves
  helper/template classes outside `performExecutionOnPsmParameters` sees the original realm and fails
  to find them.
- `addPsmModel` only loads a model when `psm` is non-blank; otherwise `psmModel(null)` is set and the
  goal must tolerate a null model. Model name derivation throws `IllegalStateException` when the
  resource carries no `Model` element.
- Model load errors surface as `MojoExecutionException("Could not load model: ")`; from
  `performExecutionOnPsmParameters` a `URISyntaxException` / `IOException` / anything else is wrapped
  as `Invalid URL:` / `IO Error:` / `Unknown exception:`.
- `actorTypePredicate` keeps every actor when `actors` is empty; otherwise the list entries must be
  written as `<namespace>::<name>` (`PsmUtils.namespaceToString`), any other spelling silently
  excludes the actor.
- Both `targetDirectoryResolver` and `actorTypeTargetDirectoryResolver` resolve to the same
  `destination`, so per-actor output is not separated by directory.
- `iterateArchive` dispatches on filename suffix only — `.tgz`/`.tar.gz`, `.zip`/`.jar`,
  `.bz2`/`.tar.bzip2`; any other name throws `IOException("Could not open: ")`. The callback returning
  `true` stops iteration; streams are closed in `finally`.
- `getArtifact` supports the `mvn:<coords>!<path-in-archive>` form; a missing inner path throws
  `MojoExecutionException`, while a missing plain file only logs a warning and returns a
  non-existent `File`.
