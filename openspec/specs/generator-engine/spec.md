# generator-engine Specification

## Purpose

The `generator-engine` module is the core code generation engine that transforms PSM models into text-based output files using Handlebars templates, Spring Expression Language (SpEL) expressions, and YAML project descriptors.

## Architecture

- **PsmGenerator**: Main entry point. Takes a `PsmGeneratorParameter`, loads ActorTypes from the model, creates Handlebars/SpEL contexts, and processes templates in parallel using CompletableFuture.
- **PsmGeneratorParameter**: Builder-pattern configuration class holding the PsmModel, generator context, actor type predicate, target directory resolvers, and extra context variables.
- **YAML Project Descriptors** (`<type>.yaml`): Define template entries with `name`, `factoryExpression`, `pathExpression`, `templateName`, `templateContext`, `actorTypeBased`, `exclude`, and `copy` fields.
- **Template Override System**: Multiple template URIs are processed in reverse order. Templates can be replaced (same name, new definition), decorated (`.override.hbs` suffix), or excluded (`exclude: true`).
- **Checksum Tracking**: Generated files are tracked via checksums to detect manual modifications and support incremental generation.

Context variables available in templates: `#model`, `#actorTypes`, `#actorType`, `#self`, `#template`, plus custom variables from `templateContext` and `extraContextVariables`.

## Requirements

### Requirement: PsmGenerator SHALL produce output files from templates

The generator SHALL read a PSM model and YAML descriptor, evaluate SpEL expressions for factory and path computation, render Handlebars templates, and return generated file contents.

#### Scenario: Generate files for a project type
- **GIVEN** a valid PsmModel and a generator context with a `<type>.yaml` descriptor
- **WHEN** `PsmGenerator.execute(parameter)` is called
- **THEN** a `GeneratorResult` is returned containing generated file paths and contents

#### Scenario: Actor-type-based generation
- **GIVEN** a template entry with `actorTypeBased: true`
- **WHEN** generation runs
- **THEN** the template is rendered once per ActorType with `#actorType` available in context

### Requirement: Factory expressions SHALL produce context objects

The `factoryExpression` SpEL expression SHALL return a list of objects, each becoming the `#self` context for one template rendering.

#### Scenario: Factory returns entity list
- **GIVEN** a factoryExpression `"{#actorTypes}"`
- **WHEN** the expression is evaluated against the PSM model
- **THEN** each ActorType becomes a separate rendering context

### Requirement: Path expressions SHALL compute output file paths

The `pathExpression` SpEL expression SHALL return a string representing the relative output path for each generated file.

#### Scenario: Dynamic path computation
- **GIVEN** a pathExpression `"'lib/' + #path(#actorType.name) + '/output.java'"`
- **WHEN** evaluated with an ActorType named "Admin"
- **THEN** the output path is `"lib/admin/output.java"`

### Requirement: Template override system SHALL support layered customization

When multiple template URIs are configured, later URIs SHALL override earlier ones by name matching, decoration, or exclusion.

#### Scenario: Template replacement
- **GIVEN** a base template entry named "testReplace" and an override with the same name
- **WHEN** generation runs
- **THEN** the override definition is used instead of the base

#### Scenario: Template exclusion
- **GIVEN** a base template entry named "testDelete" and an override with `exclude: true`
- **WHEN** generation runs
- **THEN** the template is not rendered

### Requirement: PsmGenerator SHALL support checksum-based change tracking

The generator SHALL compute checksums for generated files and support clean, reset, and recalculate operations.

#### Scenario: Regeneration skips unchanged files
- **GIVEN** previously generated files with stored checksums
- **WHEN** generation runs again with identical templates and model
- **THEN** unchanged files are not overwritten

### Requirement: Generator SHALL support parallel execution

Template rendering SHALL execute in parallel using CompletableFuture for performance.

#### Scenario: Concurrent template rendering
- **GIVEN** a YAML descriptor with multiple template entries
- **WHEN** generation executes
- **THEN** templates are rendered concurrently across available threads
