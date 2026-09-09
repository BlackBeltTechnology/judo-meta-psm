# judo-meta-psm — module agent doctrine

## Module purpose

`judo-meta-psm` owns the **PSM (Platform Specific Model)** — the first model in
the JUDO transformation chain and the point at which a business application
stops being source text and becomes a typed, validated graph. A source model
(JUDO SDL / ESM) is *compiled into* PSM; PSM is then transformed *downstream*
into ASM plus a measure model, which is what the runtime actually executes. PSM
is therefore the widest of the three: ESM upstream is the author-facing
shorthand a modeller writes, ASM downstream is the narrowed, execution-oriented
form; PSM is the complete, canonical, fully-resolved statement of the
application that both sides are checked against.

What "complete" means is visible in the `psm.ecore` subpackage layout
(`nsURI http://blackbelt.hu/judo/meta/psm`, nine subpackages, one namespace URI
each):

| Subpackage | What it settles |
|---|---|
| `namespace` | `Model` / `Package` / `NamedElement` / `NamespaceElement` and `Annotation`(`Detail`) — the containment tree and the `Model::Package::Element` FQN space every other subpackage names into. |
| `type` | The primitive vocabulary: `StringType`, `NumericType`, `BooleanType`, `DateType`, `TimestampType`, `TimeType`, `BinaryType`, `PasswordType`, `EnumerationType` + `EnumerationMember`, `CustomType`, `XMLType`, plus `RegExp` / `Cardinality`. |
| `data` | The persisted domain: `EntityType` with `Attribute`, `AssociationEnd`, `Containment` (`Relation`/`EntityMember` hierarchies), `BoundOperation` + `OperationBody`, and `EntitySequence`/`NamespaceSequence`. |
| `constraint` | `InvariantConstraint` — declarative invariants attached to model elements. |
| `script` | The `Script` datatype: a JCL body carried as a typed value on an element. |
| `derived` | Computed data: `DataProperty`, `NavigationProperty`, `StaticData`, `StaticNavigation` and the expression types (`ReferenceExpressionType`, `DataExpressionType`, `AttributeSelectorType`, `LogicalExpressionType`, `ExpressionDialect`). |
| `service` | The exposed API: `MappedTransferObjectType` / `UnmappedTransferObjectType`, `TransferAttribute`, `TransferObjectRelation`, `UnboundOperation`, `BoundTransferOperation`, `Parameter`, `TransferOperationBehaviour`. |
| `accesspoint` | `ActorType` / `MappedActorType` — who may reach which services. |
| `measure` | `Measure`, `BaseMeasure` terms via `MeasureDefinitionTerm`, `DerivedMeasure`, `Unit`, `DurationUnit`/`DurationType` and `MeasuredType`, so a numeric attribute can declare the unit it is expressed in (aligned with `judo-meta-measure`). |

Because PSM is the contract every downstream transformation trusts, this module
also carries the enforcement: the EVL rule tree rooted at
`model/src/main/epsilon/validations/psm.evl` (imports per domain —
`data/`, `derived/`, `service/`, `type/`, `measure/`, `namespace/`,
`accesspoint/`) with a mirrored set of Zeta Java rules under
`model/src/main/java/hu/blackbelt/judo/meta/psm/validation/rules/`. Beyond the
metamodel, the repository ships a Handlebars + SpEL **generator engine** and a
Maven plugin that drives it, so downstream projects generate code from a PSM
model as a normal build step.

**Repository:** BlackBeltTechnology/judo-meta-psm ·
**Artifact:** `hu.blackbelt.judo.meta:hu.blackbelt.judo.meta.psm`
(packaging `pom`, version `${revision}` = `1.3.0-SNAPSHOT`) ·
**License:** EPL-2.0 · **Java:** 21 ·
**Build:** Maven 3.9.4 / Eclipse Tycho 4.0.13.

## Reactor map

The root `pom.xml` declares its `<modules>` inside the `modules` profile, active
unless `-DskipModules=true`. Build order is the declared order — `model`
produces the artifact everything else consumes.

<modules>
  <module>model</module>
  <module>northwind-model</module>
  <module>model-test</module>
  <module>generator-engine</module>
  <module>generator-maven-plugin</module>
  <module>generator-maven-plugin-test</module>
  <module>osgi</module>
  <module>osgi-itest</module>
  <module>feature</module>
  <module>site</module>
</modules>

| Module | Artifact / packaging | What it contributes |
|---|---|---|
| `model` | `…psm.model`, `eclipse-plugin` | The metamodel and everything derived from it: `model/model/psm.ecore` + `.genmodel`, the MWE2 workflow under `src/workflow/` that regenerates `src-gen/`, the per-domain EVL validation tree under `src/main/epsilon/validations/`, and the hand-written runtime (`PsmUtils`, the Epsilon validator wiring, the Zeta validation rules, and the CLI entry point under `.../psm/cli/`). |
| `northwind-model` | `…psm.model.northwind`, `bundle` | The Northwind reference PSM model built programmatically in Java (entities, services, types, measures, extensions), published as an OSGi bundle so every other module and downstream consumer validates against one realistic non-toy model instead of ad-hoc fixtures. |
| `model-test` | `…psm.model.test`, `jar` | JUnit 5 + AssertJ proof of the validation contract: per-domain validation suites run against models constructed in-code with the EMF builders and against the Northwind model, so a rule regression fails the build. |
| `generator-engine` | `judo-psm-generator-engine`, `bundle` | The generation runtime: reads a PSM model plus a YAML project descriptor, evaluates SpEL expressions and renders Handlebars templates. Supports parallel generation, checksum-based change tracking and the layered template-override mechanism. |
| `generator-maven-plugin` | `judo-psm-generator-maven-plugin`, `maven-plugin` | Exposes the engine as build goals — `generate`, `reset-checksum`, `clean`, `calculate-checksum`, `synchronize-gitignore` — so a downstream project generates from PSM without embedding the engine. Ships m2e lifecycle metadata for in-IDE incremental builds. |
| `generator-maven-plugin-test` | `judo-psm-generator-maven-plugin-test`, `jar` | Executes the plugin's goals for real and asserts the output, including the `base`/`override` template-layering fixtures and a post-build verifier — the check unit tests of the engine cannot make. |
| `osgi` | `…psm.osgi`, `bundle` | Repackages `model` for non-Eclipse OSGi containers, shipping `PsmModelBundleTracker`, which discovers models advertised by the `Psm-Models` manifest header and registers them as OSGi services. |
| `osgi-itest` | `…psm.osgi.itest`, `jar` | Pax Exam integration tests that boot an Apache Karaf container and assert the bundle resolves, the services register and validation runs in a live container. |
| `feature` | `…psm.feature`, `eclipse-feature` | Installable Eclipse feature grouping the plugin for IDE consumption. Descriptor-only module, no sources. |
| `site` | `…psm.site`, `eclipse-repository` | Builds the P2 update site consumed by "Install New Software" and by downstream Tycho builds. Its category P2 URLs carry hardcoded versions (see `update-category-versions`). |

`targetdefinition/` is not a reactor module — it holds the Tycho target
platform definition the Tycho builds resolve against.

## Build commands

All builds use the Maven wrapper. Java 21 is required.

```bash
# Full build
./mvnw clean install

# Run all tests
./mvnw clean test

# Build a specific module
./mvnw -f model/pom.xml clean install
./mvnw -f generator-engine/pom.xml clean install

# Run a specific test class
./mvnw test -Dtest=PsmValidationDataTest

# Run a specific test method
./mvnw test -Dtest=PsmValidationDataTest#testMethodName

# Skip tests
./mvnw clean install -DskipTests

# Regenerate EMF model code from Ecore
./mvnw -f model/pom.xml clean generate-sources

# Update Eclipse site category versions
mvn clean install -P update-category-versions -f site/pom.xml
```

### Maven profiles

| Profile | Purpose |
|---|---|
| `modules` | Activates all submodules (default; activates when `!skipModules`) |
| `sign-artifacts` | Sign JARs with GPG for release distribution |
| `release-dummy` | Dummy distribution repository for local testing |
| `release-judong` | Deploy to JUDO Nexus repository |
| `release-central` | Deploy to Maven Central (OSSRH) |
| `generate-github-asciidoc-diagrams` | Generate diagram images for GitHub documentation |
| `update-source-code-license` | Update license headers in source files |

## Technology stack

- **Eclipse EMF 2.21+** — Ecore, GenModel, ResourceSet
- **Epsilon 2.8.0** — EVL validation and transformation runtime
- **MWE2** — code generation pipeline (EcoreGenerator → HelperGenerator → BuilderGenerator → RuntimeModelGenerator)
- **Handlebars 4.1.2** — template engine
- **Spring Expression Language 6.2.7** — expression evaluation in YAML descriptors and templates
- **Jackson 2.17.2** — YAML/JSON parsing of project descriptors
- **Tycho 4.0.13** — Eclipse plugin / OSGi build integration
- **JUnit 5** (Jupiter) + **AssertJ**; **Pax Exam** for OSGi container tests
- **JaCoCo** coverage; **SLF4J 2.0.16 + Logback 1.5.12** logging
- **Maven 3.9.4** via wrapper (`.mvn/wrapper/maven-wrapper.properties`)

The root `pom.xml` is the parent POM: `${revision}` version management,
dependency versions, build plugins and profiles. Root-level `logback-test.xml`
is the shared test logging configuration. CI lives in
`.github/workflows/build.yml` (build, test, deploy) with a manual
`.github/workflows/release.yml` release pipeline.

## Development environment

**Required:** Java 21 JDK (OpenJDK Zulu recommended), Maven 3.9.4+ (or `./mvnw`).

**For Eclipse IDE work:** m2e plugin, Epsilon plugin, Eclipse Modeling Tools.

**Verify setup:**
```bash
java -version    # Must be 21
./mvnw --version # Must be 3.9.4+
```

## Git workflow

- **Main branch:** `develop`; **release branch:** `master` (latest stable release)
- **Versioning:** `1.3.0-SNAPSHOT` (Maven) / `1.3.0.qualifier` (Eclipse), kept in sync by Tycho
- **Branching model:** GitFlow — `feature/JNG-xxx`, `release/X.Y.Z`, `bugfix/JNG-xxx`, `support/JNG-xxx`, `hotfix/JNG-xxx`
- **Commit convention:** every commit must reference a JIRA ticket (`JNG-xxxx`)

## Important notes

1. **Generated code in `model/src-gen/`** is produced by MWE2 and must never be
   hand-edited. Regenerate with `./mvnw -f model/pom.xml clean generate-sources`.
2. **Validation rules are written in Epsilon (`.evl`), not Java.** The entry
   point is `psm.evl`, which imports the domain-specific validators from its
   subdirectories.
3. **No Lombok in Eclipse modules** — Tycho does not support Lombok. All model
   code is EMF-generated.
4. **Dual versioning** — Maven SNAPSHOT and Eclipse qualifier versions are
   equivalent (`1.0.0-SNAPSHOT` = `1.0.0.qualifier`); Tycho replaces qualifiers
   with timestamps on CI.
5. **FQN format uses `::` as the namespace separator** — e.g.
   `Model::Package::EntityType`, with `.` for features:
   `Model::Package::Entity.attributeName`.
6. **Template override system** — generator templates support layered overrides
   via multiple URIs, with `exclude`, `replace` and `decorator` (`.override.hbs`)
   mechanisms.
7. **OSGi bundle tracking** — the `osgi` module uses the `Psm-Models` manifest
   header to auto-discover and register PSM models as OSGi services.
8. **Test models are built programmatically** — model tests construct PSM models
   in Java with the EMF builders, then validate with Epsilon. The Northwind
   model is the comprehensive reference.
9. **PSM is a downstream contract.** Changing `psm.ecore` changes what every
   consumer of ASM, the measure model and the generator engine may assume — pair
   any classifier or feature change with the matching EVL rule and its Zeta Java
   counterpart, and expect the change to be breaking until proven otherwise.

## Related documentation

- [README](README.md) — project overview and ecosystem context
- [Contributing Guide](CONTRIBUTING.md) — development setup, branching, submission guidelines
- [CI Flow](.github/CIFLOW.md) — GitHub Actions pipeline documentation
- [Generator Plugin](generator-maven-plugin/README.md) — Maven plugin configuration and template system
- [Model Operations](model/README.md) — PSM operation behaviour reference

<!-- dox-doctrine -->
## Documentation Update Protocol (WRITE discipline)

Per-directory `AGENTS.md` files form a tree. Each directory `AGENTS.md` is the
per-file record for the files in that directory. This module-root `AGENTS.md`
holds doctrine + architecture pointers only — never a per-file index.

**Keep the root lean.** This file loads into every agent turn — every byte costs
tokens on every turn. A verbose root file buries the rules the model must follow
(signal dilution) and measurably degrades adherence; a lean file keeps doctrine
salient. Default assumption: your update does NOT belong in the root — route it
by the table below.

**Route every doc update by kind:**

| Kind of update | Goes in |
|---|---|
| New file in a directory, or its per-file detail / change history | Nearest directory `AGENTS.md`. Add a `` | `<basename>` | <purpose> | `` row, path-alphabetical. |
| Data flow, protocol, architecture rationale | `docs/architecture.md` or a `docs/<topic>.md` |
| End-user / developer setup | `README.md` |
| Cross-cutting rule every agent needs every turn (rare) | this module-root `AGENTS.md` |

**Read before editing (chain walk).** Before editing a file, read the nearest
`AGENTS.md` chain root→leaf so you know the file's recorded purpose, contracts,
and change history. Do not edit blind.

**Update after editing (closeout pass).** After changing a file, update its row
in the nearest directory `AGENTS.md`: find the file's row, update its purpose in
place; if absent, add it in path-alphabetical order. New directory → scaffold
its `AGENTS.md`. One row per file. The purpose carries a one-line summary, key
exported symbols, contracts/invariants, and `See change: <id>` history.

**Row style (caveman).** Short declarative fragments. Drop articles. Subject →
verb → object, present tense. One fact per row. Prefer concrete tokens (paths,
symbols, env vars) over prose. Keep identifiers verbatim.

**Size rule — split an over-large directory `AGENTS.md` file-based.** pi
auto-injects a directory `AGENTS.md` on every turn when cwd sits at/below it, so
an over-large directory `AGENTS.md` is not supported. Split it file-based: a row
exceeding the length threshold promotes to a per-file `<File>.AGENTS.md`
sidecar carrying that file's full detail (including every `See change:`). The
sidecar is pull-only — its name is not `AGENTS.md`, so pi never auto-injects it
— yet it stays search-indexed (`agents` doc_type). The directory `AGENTS.md`
keeps a one-line summary plus a `→ see `<File>.AGENTS.md`` pointer. Rows within
the threshold stay verbatim (lossless).

## Finding docs (READ discipline)

`kb_*` tools are faster and cheaper than raw search — they return a one-line
purpose + key exports per file, not raw bytes. **This fires on the ACTION, not
the intent** — before you `grep`/`rg` for a symbol, `cat`/read a file to learn
what it does, or chase an import, the kb call goes first. It fires **even
mid-task when you already know the file**; knowing the file does not exempt you.
When your reflex is the left column, run the right column instead:

| You're about to… | Do this FIRST instead |
|---|---|
| `grep -rn "SymbolName" src/` — find where a fn / type / const lives | `kb_search --doc-type agents "SymbolName"` — tree indexes key exports per file |
| `grep -rn "feature\|topic" src/` — how does X work / where's X handled | `kb_search "feature topic"` |
| `cat` / read a file just to learn its purpose before editing | `kb agents <path>` — one-line purpose + exports + change history |
| chase imports / callers across files | `kb_neighbors <path\|heading>` |
| read one doc section in full | `kb_get <path> <section>` |

**Fall-through (explicit):** if the kb call returns nothing relevant, `rg` /
source read is allowed — then add the missing directory `AGENTS.md` row per the
WRITE discipline. kb does NOT replace grep; it goes first.
