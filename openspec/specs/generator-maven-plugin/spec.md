# generator-maven-plugin Specification

## Purpose

The `generator-maven-plugin` module wraps the generator-engine as a set of Maven goals, enabling downstream projects to generate code from PSM models as part of their Maven build lifecycle.

## Architecture

- **AbstractPsmProjectMojo**: Base Mojo handling PSM model loading from Maven artifact URIs, common parameters (psm, destination, modelName, actors), and repository resolution.
- **PsmProjectGenerateMojo** (`generate` goal): Main code generation mojo. Configures template URIs, helper classes, context accessor, template parameters, scan settings, and variable precedence. Binds to `generate-resources` phase by default.
- **PsmProjectResetChecksumMojo** (`reset-checksum` goal): Resets file checksums for regeneration tracking.
- **PsmProjectCleanMojo** (`clean` goal): Removes generated files based on stored checksums.
- **PsmProjectCalculateChecksumMojo** (`calculate-checksum` goal): Recalculates checksums for existing generated files.
- **PsmProjectSynchronizeGitignoreMojo** (`synchronize-gitignore` goal): Updates `.gitignore` with entries for generated files.

## Requirements

### Requirement: Generate goal SHALL produce code from PSM model and templates

The `generate` goal SHALL load a PSM model, resolve template URIs, instantiate helper classes, and delegate to PsmGenerator for code generation.

#### Scenario: Basic code generation
- **GIVEN** a Maven project with the plugin configured with `psm`, `type`, and `uris` parameters
- **WHEN** `mvn generate-resources` runs
- **THEN** generated files appear in the `destination` directory

#### Scenario: Actor filtering
- **GIVEN** plugin configuration with `actors` set to a comma-separated list of ActorType FQNs
- **WHEN** generation runs
- **THEN** only the specified actors are processed

### Requirement: Plugin SHALL resolve PSM models from Maven coordinates

The plugin SHALL support Maven artifact URIs in the format `mvn:<groupId>:<artifactId>[:<extension>[:<classifier>]]:<version>[!path/in/archive]`.

#### Scenario: Load model from Maven artifact
- **GIVEN** a `psm` parameter with a `mvn:` URI referencing a model artifact
- **WHEN** the plugin executes
- **THEN** the PSM model is resolved from the Maven repository and loaded

### Requirement: Plugin SHALL support dependency scanning

When `scanDependencies=true`, the plugin SHALL scan the classpath for classes annotated with `@TemplateHelper` and `@ContextAccessor`.

#### Scenario: Auto-discovered helpers
- **GIVEN** `scanDependencies=true` and a dependency containing `@TemplateHelper` annotated classes
- **WHEN** generation runs
- **THEN** the annotated classes are registered as helpers alongside explicitly configured ones

### Requirement: Variable precedence SHALL be configurable

The `variablePrecedence` parameter SHALL control the order in which template variables are resolved from different sources.

#### Scenario: Properties file overrides template variables
- **GIVEN** `variablePrecedence` set to `"projectProperties,templateVariables,propertiesFiles"`
- **WHEN** the same variable is defined in both `templateParameters` and a properties file
- **THEN** the properties file value takes precedence (later source wins)

### Requirement: Clean goal SHALL remove generated files

The `clean` goal SHALL remove files that were previously generated, identified by stored checksums.

#### Scenario: Clean generated output
- **GIVEN** a destination directory with generated files and checksum records
- **WHEN** `mvn judo-psm-generator:clean` runs
- **THEN** generated files are removed but manually created files are preserved
