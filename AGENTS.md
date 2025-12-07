<!-- OPENSPEC:START -->
# OpenSpec Instructions

These instructions are for AI assistants working in this project.

Always open `@/openspec/AGENTS.md` when the request:
- Mentions planning or proposals (words like proposal, spec, change, plan)
- Introduces new capabilities, breaking changes, architecture shifts, or big performance/security work
- Sounds ambiguous and you need the authoritative spec before coding

Use `@/openspec/AGENTS.md` to learn:
- How to create and apply change proposals
- Spec format and conventions
- Project structure and guidelines

Keep this managed block so 'openspec update' can refresh the instructions.

<!-- OPENSPEC:END -->

# Judo PSM (Platform Specific Model) Meta - Project Documentation

## Project Overview

**Repository:** BlackBeltTechnology/judo-meta-psm  
**License:** Eclipse Public License 2.0 (EPL-2.0)  
**Java Version:** 21  
**Build System:** Maven 3.9.4+ with Tycho (Eclipse build tooling)

This is a sophisticated Eclipse/Tycho-based metamodel project that:
1. **Defines** a comprehensive Platform Specific Model (PSM) metamodel via EMF/Ecore
2. **Generates** Java code from the model using MWE2 workflows
3. **Provides** both Eclipse UI (Sirius-based designer) and OSGi standalone runtime
4. **Implements** a code generation framework using Handlebars templates, Epsilon scripting, and Spring Expression Language
5. **Distributes** via both Maven Central and Eclipse P2 repositories

## Directory Structure

```
judo-meta-psm/
├── model/                          # Core PSM metamodel (Ecore)
├── model-test/                     # Unit tests for metamodel
├── northwind-model/                # Example PSM model implementation
├── osgi/                           # OSGi bundle repackaging
├── osgi-itest/                     # OSGi integration tests (Pax Exam)
├── generator-engine/               # Code generation engine
├── generator-maven-plugin/         # Maven plugin for generation
├── generator-maven-plugin-test/    # Plugin tests
├── designer/                       # Sirius-based visual editor
├── designer-eclipse-runtime/       # Eclipse runtime support
├── designer-defaultmodelfactory/   # Default model factory
├── designer-templatemodel-default/ # Default template model
├── designer-templatemodel-empty/   # Empty template model
├── designer-templatemodel-provider/# Template provider interface
├── designer-wizard/                # Model creation wizard
├── feature/                        # Eclipse feature (model)
├── designer-feature/               # Eclipse feature (designer)
├── site/                           # Eclipse P2 update site
├── targetdefinition/               # P2 repository definitions
└── openspec/                       # OpenSpec change management
```

## Core Modules

### Model Definition Layer

| Module | Type | Purpose |
|--------|------|---------|
| `model/` | eclipse-plugin | Core PSM metamodel via Ecore (`psm.ecore`). Generates EMF code, builders, helpers. Contains Epsilon validation rules. |
| `model-test/` | test | Unit tests for PSM metamodel using JUnit 5 and Epsilon runtime |
| `northwind-model/` | bundle | Example PSM model demonstrating usage patterns |

### Runtime/OSGi Layer

| Module | Type | Purpose |
|--------|------|---------|
| `osgi/` | bundle | Repackages model for OSGi environments using Apache Felix Bundle Plugin |
| `osgi-itest/` | test | Pax Exam integration tests for Karaf container (4.4.7) |

### Code Generation Layer

| Module | Type | Purpose |
|--------|------|---------|
| `generator-engine/` | bundle | Core code generation engine using Handlebars, SpEL, and Jackson YAML |
| `generator-maven-plugin/` | maven-plugin | Maven plugin wrapper with goals: `generate`, `create`, `clean`, `calculate-checksum`, `reset-checksum`, `synchronize-gitignore` |
| `generator-maven-plugin-test/` | test | Unit and integration tests for Maven plugin |

### Designer/UI Layer

| Module | Type | Purpose |
|--------|------|---------|
| `designer/` | eclipse-plugin | Sirius-based visual editor for ESM models |
| `designer-eclipse-runtime/` | eclipse-plugin | Eclipse platform integration |
| `designer-defaultmodelfactory/` | eclipse-plugin | Default model factory |
| `designer-templatemodel-*` | eclipse-plugin | Template model configurations |
| `designer-wizard/` | eclipse-plugin | Model creation wizard |

### Distribution Layer

| Module | Type | Purpose |
|--------|------|---------|
| `feature/` | eclipse-feature | Bundles model and plugins |
| `designer-feature/` | eclipse-feature | Designer UI feature |
| `site/` | eclipse-repository | P2 update site for Eclipse distribution |

## PSM Metamodel Structure

The core metamodel (`model/model/psm.ecore`) defines these packages:

| Package | Purpose |
|---------|---------|
| `namespace` | Core namespace, packages, named elements |
| `type` | Primitive types, custom types, enumerations |
| `structure` | Data structure definitions |
| `operation` | Operations and behaviors |
| `accesspoint` | Access points and actor types |
| `measure` | Measurement definitions |
| `ui` | UI-related definitions |
| `expression` | Expression support |
| `script` | Script support |

**Validation Rules:** 
- **EVL (Epsilon):** Located in `model/src/main/epsilon/validations/` using Epsilon Validation Language
- **Java Validation Framework:** Located in `model/src/main/java/hu/blackbelt/judo/meta/esm/validation/` - Native Java alternative with better IDE support, debugging, and performance

## Technology Stack

### Core Technologies
- **Eclipse Modeling Framework (EMF)** 2.38.0+ - Metamodel foundation
- **Ecore** - Model definition language
- **MWE2** (Model Workflow Engine) 2.13.0 - Code generation workflows
- **Epsilon** 2.8.0 - Model validation and transformation
- **Tycho** 4.0.13 - Eclipse plugin build

### Generator Technologies
- **Handlebars** 4.4.0 - Template engine
- **Spring Expression Language (SpEL)** - Expression evaluation
- **Jackson** 2.17.2 - YAML/JSON parsing

### Runtime
- **Apache Karaf** 4.4.7 - OSGi container
- **Apache Felix** 6.0.0 - OSGi bundle plugin
- **Pax Exam** 4.13.5 - OSGi testing

### Build & Quality
- **Maven** 3.9.4+ with wrapper
- **JaCoCo** 0.8.12 - Code coverage
- **SonarQube** 3.9.1 - Code quality
- **Lombok** 1.18.34 - Annotation processing

## Build Commands

```bash
# Standard build
mvn clean install
# or with wrapper
./mvnw clean install

# Memory requirements (configured in .mvn/jvm.config)
# -Xms1024m -Xmx2048m
```

### Maven Profiles

| Profile | Purpose |
|---------|---------|
| `modules` | Includes all 17 submodules (default) |
| `sign-artifacts` | GPG signing for release |
| `release-central` | Maven Central deployment |
| `release-judong` | Internal Judo repository |
| `update-target-versions` | Version substitution in target definitions |
| `update-category-versions` | Version substitution in P2 site |

## Code Generation Flow

1. **MWE2 Workflow** (`model/src/workflow/generateModel.mwe2`)
   - Generates EMF code from `esm.ecore`
   - Produces GenModel-based Java classes
   - Generates builders and helpers

2. **Model Compilation**
   - Tycho compiles eclipse-plugin modules
   - OSGi bundle compilation with Felix

3. **Generator Engine**
   - Copies Epsilon scripts to `tatami/psm2project`
   - Maven plugin descriptor generation

4. **Feature/Site Building**
   - P2 metadata generation
   - Feature packaging
   - Update site assembly

## Key Configuration Files

| File | Purpose |
|------|---------|
| `pom.xml` | Parent POM with module definitions and plugin management |
| `.mvn/jvm.config` | JVM arguments for Maven build |
| `.mvn/extensions.xml` | Maven extensions |
| `model/model/psm.ecore` | Core metamodel definition |
| `model/model/psm.genmodel` | EMF code generation model |

## Development Environment

**Required:**
- Java 21 JDK
- Maven 3.9.4+
- Eclipse IDE with:
  - m2e (Maven integration)
  - Epsilon plugin
  - Modeling tools
  - Sirius (for designer)
  - Xtext/Xtend plugins

## Git Workflow

- **Main Branch:** `develop`
- **Versioning:** SNAPSHOT-based development (currently 1.2.0-SNAPSHOT)
- **Version Placeholder:** `$VERSION_PLACEHOLDER$` in model metadata
- **Release Process:** CI/CD via Wercker with Maven Central and P2 deployment

## Important Notes

1. **Understand EMF/Ecore patterns** before modifying model code
2. **Respect Tycho build constraints** when modifying Eclipse plugins
3. **Validation rules** - Two implementations available:
   - **EVL (Epsilon):** Located in `model/src/main/epsilon/validations/`
   - **Java Validation Framework:** Located in `osgi/src/main/java/hu/blackbelt/judo/meta/psm/validation/`
   - See `docs/validation/java-validation-framework.md` for Java framework documentation
4. **Generator templates use Handlebars** - Located in generator-engine module
5. **Use OpenSpec for significant changes** - See `openspec/AGENTS.md` for proposal workflow

## Related Documentation

- `README.adoc` - Project overview
- `AGENTS.md` - Detailed project documentation for AI assistants
- `openspec/AGENTS.md` - OpenSpec workflow for spec-driven development
- `openspec/project.md` - Project conventions for OpenSpec
- `docs/validation/README.md` - Validation rules overview
- `docs/validation/java-validation-framework.md` - PSM-specific Java validation documentation
- `docs/zeta/` - Complete Zeta validation framework documentation (getting started, user guide, examples, reference)
