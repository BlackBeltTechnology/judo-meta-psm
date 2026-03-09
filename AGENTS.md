# JUDO PSM (Platform Specific Model) - Project Documentation

## Project Overview


**Repository:** BlackBeltTechnology/judo-meta-psm
**License:** Eclipse Public License 2.0 (EPL-2.0)
**Java Version:** 21
**Build System:** Maven 3.9.4 with Tycho 4.0.13 (Eclipse/OSGi plugin builds)

1. **EMF Metamodel**: Defines the PSM (Platform Specific Model) using Eclipse Modeling Framework — the foundational data model for the JUDO framework's model-driven architecture
2. **Model Validation**: Enforces structural and semantic constraints on PSM models using Epsilon Validation Language (EVL) rules
3. **Code Generation Engine**: Template-based generation using Handlebars + Spring Expression Language (SpEL) with YAML project descriptors
4. **Maven Plugin**: Exposes the generator engine as a Maven plugin for downstream projects to generate code from PSM models
5. **Multi-Platform Runtime**: Runs as an Eclipse plugin, standalone Java library, or OSGi bundle (Karaf)

## Code Instructions

1. First think through the problem, read the codebase for relevant files.
2. Before you make any major changes, check in with me and I will verify the plan.
3. Please every step of the way just give me a high level explanation of what changes you made.
4. Make every task and code change you do as simple as possible. We want to avoid making any massive or complex changes. Every change should impact as little code as possible. Everything is about simplicity.
5. Maintain a documentation file that describes how the architecture of the app works inside and out.
6. Never speculate about code you have not opened. If the user references a specific file, you MUST read the file before answering. Make sure to investigate and read relevant files BEFORE answering questions about the codebase. Never make any claims about code before investigating unless you are certain of the correct answer - give grounded and hallucination-free answers.
7. For implementation use TDD (Test-Driven Development): write or update tests first to define the expected behaviour, verify they fail, then write the minimal implementation to make them pass.
8. Use DRY (Don't Repeat Yourself): extract reusable logic into separate classes, utilities, or components. If the same pattern appears in multiple places, refactor it into a shared helper.

## Directory Structure

```
judo-meta-psm/
├── model/                          # Core Eclipse plugin with Ecore metamodel
│   ├── model/psm.ecore             # Source-of-truth metamodel definition
│   ├── src/main/java/              # Hand-written Java (PsmUtils, validators, CLI)
│   ├── src/main/epsilon/           # EVL validation rules
│   ├── src/workflow/               # MWE2 code generation workflow
│   └── src-gen/                    # EMF-generated Java (do NOT edit)
├── model-test/                     # JUnit 5 validation tests
├── northwind-model/                # Northwind reference/test model
├── generator-engine/               # Handlebars + SpEL generation engine
├── generator-maven-plugin/         # Maven mojo wrapping the generator
├── generator-maven-plugin-test/    # Generator Maven plugin integration tests
├── osgi/                           # OSGi bundle with service registration
├── osgi-itest/                     # Pax Exam OSGi integration tests
├── feature/                        # Eclipse feature definition
├── site/                           # Eclipse P2 update site
├── .github/workflows/              # CI/CD pipelines
└── openspec/                       # OpenSpec specifications
```

## Core Modules

### Metamodel & Validation

| Module | Type | Purpose |
|--------|------|---------|
| `model/` | eclipse-plugin | Ecore metamodel (`psm.ecore`), EMF-generated Java classes, Epsilon validators, PsmUtils, CLI integration. Generated code in `src-gen/` via MWE2 workflow. |
| `model-test/` | jar | JUnit 5 tests exercising Epsilon validators against programmatically constructed models and the Northwind reference model |
| `northwind-model/` | jar | Reference PSM model based on the Northwind database schema, used across test modules |

### Code Generation

| Module | Type | Purpose |
|--------|------|---------|
| `generator-engine/` | bundle (OSGi) | Core generation engine: reads PSM models + YAML descriptors, evaluates SpEL expressions, renders Handlebars templates. Supports parallel generation and checksum-based change tracking. |
| `generator-maven-plugin/` | maven-plugin | Maven goals: `generate`, `reset-checksum`, `clean`, `calculate-checksum`, `synchronize-gitignore`. Wraps generator-engine for build integration. |
| `generator-maven-plugin-test/` | jar | Integration tests for Maven plugin goal execution |

### OSGi & Eclipse Distribution

| Module | Type | Purpose |
|--------|------|---------|
| `osgi/` | bundle | Repackages the model as an OSGi bundle with `PsmModelBundleTracker` for automatic model discovery and service registration in Karaf |
| `osgi-itest/` | jar | Pax Exam integration tests validating OSGi bundle lifecycle and service registration |
| `feature/` | eclipse-feature | Eclipse feature packaging for P2 installation |
| `site/` | eclipse-repository | Eclipse P2 update site with version-specific URLs |

## Technology Stack

### Core Technologies
- **Eclipse EMF 2.21+** — Metamodel framework (Ecore, GenModel, ResourceSet)
- **Epsilon 2.8.0** — Model validation (EVL) and transformation runtime
- **Handlebars 4.1.2** — Template engine for code generation
- **Spring Expression Language 6.2.7** — Expression evaluation in YAML descriptors and templates
- **Jackson 2.17.2** — YAML/JSON parsing for project descriptors
- **MWE2** — Modeling Workflow Engine for EMF code generation pipeline

### Build & Quality
- **Maven 3.9.4** via wrapper (`./mvnw`)
- **Tycho 4.0.13** — Eclipse plugin/OSGi build integration
- **JUnit 5** (Jupiter) — Unit testing
- **AssertJ** — Fluent assertions
- **Pax Exam** — OSGi container integration testing
- **JaCoCo** — Code coverage
- **SLF4J 2.0.16 + Logback 1.5.12** — Logging

## Build Commands

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

### Maven Profiles

| Profile | Purpose |
|---------|---------|
| `modules` | Activates all submodules (default, activates when `!skipModules`) |
| `sign-artifacts` | Sign JARs with GPG for release distribution |
| `release-dummy` | Dummy distribution repository for local testing |
| `release-judong` | Deploy to JUDO Nexus repository |
| `release-central` | Deploy to Maven Central (OSSRH) |
| `generate-github-asciidoc-diagrams` | Generate diagram images for GitHub documentation |
| `update-source-code-license` | Update license headers in source files |

## Key Configuration Files

| File | Purpose |
|------|---------|
| `pom.xml` | Root POM: version management (`${revision}`), dependency versions, build plugins, profiles |
| `.mvn/wrapper/maven-wrapper.properties` | Maven 3.9.4 wrapper configuration |
| `model/model/psm.ecore` | Ecore metamodel definition — source of truth for all PSM concepts |
| `model/model/psm.genmodel` | EMF GenModel controlling Java code generation from Ecore |
| `model/src/workflow/generateModel.mwe2` | MWE2 workflow: EcoreGenerator → HelperGenerator → BuilderGenerator → RuntimeModelGenerator |
| `model/src/main/epsilon/validations/psm.evl` | Root Epsilon validation file importing all domain validators |
| `logback-test.xml` | Shared test logging configuration |
| `.github/workflows/build.yml` | Main CI pipeline (build, test, deploy) |
| `.github/workflows/release.yml` | Manual release pipeline |

## Development Environment

**Required:**
- Java 21 JDK (OpenJDK Zulu recommended)
- Maven 3.9.4+ (or use `./mvnw`)

**For Eclipse IDE work:**
- m2e plugin
- Epsilon plugin
- Eclipse Modeling Tools

**Verify setup:**
```bash
java -version    # Must be 21
./mvnw --version # Must be 3.9.4+
```

## Git Workflow

- **Main Branch:** `develop`
- **Release Branch:** `master` (latest stable release)
- **Versioning:** `1.3.0-SNAPSHOT` (Maven) / `1.3.0.qualifier` (Eclipse) — kept in sync by Tycho
- **Branching Model:** GitFlow — `feature/JNG-xxx`, `release/X.Y.Z`, `bugfix/JNG-xxx`, `support/JNG-xxx`, `hotfix/JNG-xxx`
- **Commit Convention:** Every commit must reference a JIRA ticket (`JNG-xxxx`)

## Important Notes

1. **Generated code in `model/src-gen/`** is produced by MWE2 and should never be edited manually. Regenerate with `./mvnw -f model/pom.xml clean generate-sources`.
2. **Validation rules are written in Epsilon (`.evl` files)**, not Java. The entry point is `psm.evl` which imports domain-specific validators from subdirectories.
3. **No Lombok in Eclipse modules** — Tycho does not support Lombok. All model code is EMF-generated.
4. **Dual versioning system** — Maven SNAPSHOT and Eclipse qualifier versions are equivalent (`1.0.0-SNAPSHOT` = `1.0.0.qualifier`). Tycho replaces qualifiers with timestamps on CI.
5. **FQN format uses `::` as namespace separator** — e.g., `Model::Package::EntityType`, with `.` for features: `Model::Package::Entity.attributeName`.
6. **Template override system** — Generator templates support layered overrides via multiple URIs, with `exclude`, `replace`, and `decorator` (`.override.hbs`) mechanisms.
7. **OSGi bundle tracking** — The `osgi` module uses `Psm-Models` manifest header to auto-discover and register PSM models as OSGi services.
8. **Test models are built programmatically** — Model tests construct PSM models in Java using EMF builders, then validate with Epsilon. The Northwind model serves as a comprehensive reference.

## Related Documentation

- [README](README.md) — Project overview and ecosystem context
- [Contributing Guide](CONTRIBUTING.md) — Development setup, branching, and submission guidelines
- [CI Flow](.github/CIFLOW.md) — GitHub Actions pipeline documentation
- [Generator Plugin](generator-maven-plugin/README.md) — Maven plugin configuration and template system
- [Model Operations](model/README.md) — PSM operation behaviour reference
