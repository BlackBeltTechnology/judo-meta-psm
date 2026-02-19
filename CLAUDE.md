# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What This Is

**judo-meta-psm** is the Platform Specific Model (PSM) metamodel for the JUDO platform. It defines the runtime metamodel using EMF/Ecore, and includes a Handlebars+SpEL code generation engine. PSM is the first model in the JUDO transformation chain, followed by ASM, Measure, etc.

## Build Commands

```bash
# Full build (all modules)
mvn clean install

# Skip tests
mvn clean install -DskipTests

# Build single module
mvn clean install -pl model-test

# Run all tests in a module
mvn clean test -pl model-test

# Run a single test class
mvn clean test -pl model-test -Dtest=PsmValidationDataTest

# Run a single test method
mvn clean test -pl model-test -Dtest=PsmValidationDataTest#testValidAttribute

# Skip non-code modules (OSGi, feature, site)
mvn clean install -pl model,northwind-model,model-test,generator-engine,generator-maven-plugin,generator-maven-plugin-test
```

**Requirements:** Java 21, Maven 3.9.4+

## Module Structure

| Module | Packaging | Purpose |
|---|---|---|
| `model` | eclipse-plugin | Ecore metamodel, EMF generated classes, Epsilon validations (.evl), utility classes |
| `northwind-model` | jar | Northwind sample PSM model for testing |
| `model-test` | jar | Unit tests for metamodel, validations, and PsmUtils |
| `generator-engine` | bundle (OSGi) | Handlebars+SpEL code generation engine (`PsmGenerator`, `PsmGeneratorParameter`) |
| `generator-maven-plugin` | maven-plugin | Maven Mojos: `generate`, `checksum`, `reset-checksum`, `clean`, `synchronize-gitignore` |
| `generator-maven-plugin-test` | jar | Integration tests for the Maven plugin using verifier |
| `osgi` | bundle | OSGi wrapper bundle |
| `osgi-itest` | jar | OSGi integration tests (Pax Exam + Karaf) |
| `feature` | eclipse-feature | Eclipse/Tycho feature |
| `site` | eclipse-repository | P2 update site |

## Architecture

### Ecore Metamodel (`model/model/psm.ecore`)

The PSM metamodel root namespace is `http://blackbelt.hu/judo/meta/psm` with these subpackages:

- **namespace** - `Model`, `Package`, `NamedElement`, `Namespace`, annotations
- **type** - Primitives: `StringType`, `NumericType`, `BooleanType`, `DateType`, `TimestampType`, `TimeType`, `EnumerationType`, `CustomType`
- **data** - `EntityType`, `Attribute`, `Relation`, `AssociationEnd`, `BoundOperation`, `Sequence`
- **derived** - `DataProperty`, `NavigationProperty`, `StaticData`, `StaticNavigation`, `PrimitiveAccessor`, `ReferenceAccessor`
- **service** - `TransferObjectType`, `MappedTransferObjectType`, `TransferAttribute`, `TransferObjectRelation`, `BoundTransferOperation`, `UnboundOperation`, `Parameter`
- **accesspoint** - `ActorType`
- **measure** - `Measure`, `Unit`, `DerivedMeasure`, `DurationUnit`
- **constraint** - Invariant constraints
- **script** - Script definitions

### EMF Code Generation

`model/src/workflow/generateModel.mwe2` drives EMF code generation from the Ecore model. It generates:
1. Standard EMF classes from GenModel
2. Fluent builder classes (via `BuilderGeneratorWorkflow`)
3. Builder helper classes (via `HelperGeneratorWorkflow`)
4. Runtime model support class `PsmModel` (via `RuntimeModelGeneratorWorkflow`)

### Epsilon Validation Rules

Validation rules live in `model/src/main/epsilon/validations/` organized by metamodel subpackage. Entry point is `psm.evl` which imports domain-specific `.evl` files. These are executed by `PsmEpsilonValidator`.

### Code Generation Engine

`PsmGenerator` (in `generator-engine`) processes YAML template descriptors (`<type>.yaml`) that define:
- **factoryExpression** (SpEL) - produces a list of context objects
- **pathExpression** (SpEL) - determines output file path
- **templateName** - Handlebars `.hbs` template file
- **actorTypeBased** - whether to iterate over actor types
- **templateContext** - additional SpEL-bound variables

Templates are loaded from URI chains where later URIs override earlier ones. Override templates use `.override.hbs` suffix. Custom files can be protected via `.generator-ignore` (glob format).

### Checksum / Content Comparison

The `checksum` Maven goal (`PsmProjectCalculateChecksumMojo`) tracks file content checksums to prevent regenerating user-modified files and enable incremental generation.

## Key Java Classes

- `PsmUtils` (`model/.../psm/PsmUtils.java`) - FQN resolution, namespace traversal, element lookup utilities
- `PsmEpsilonValidator` (`model/.../psm/PsmEpsilonValidator.java`) - Epsilon-based model validation
- `PsmGenerator` (`generator-engine/.../engine/PsmGenerator.java`) - Core generation orchestration
- `PsmGeneratorParameter` (`generator-engine/.../engine/PsmGeneratorParameter.java`) - Lombok builder for generator config
- `AbstractPsmProjectMojo` (`generator-maven-plugin/.../plugin/AbstractPsmProjectMojo.java`) - Base Mojo with artifact resolution via `mvn:` URIs

## Key Conventions

- Uses CI-friendly Maven versioning via `${revision}` property (currently `1.3.0-SNAPSHOT`)
- The `model` module is an Eclipse plugin (Tycho build); non-Eclipse modules use standard Maven
- Lombok is used throughout (`@Builder`, `@Getter`, `@Setter`, etc.)
- JUnit 5 for standard tests; JUnit 4 + Pax Exam for OSGi integration tests
- Surefire argLine includes `--add-opens` for Java 21 module access
- License: Eclipse Public License 2.0
