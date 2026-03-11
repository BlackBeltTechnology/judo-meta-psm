# generator-maven-plugin-test Specification

## Purpose

The `generator-maven-plugin-test` module contains integration tests that verify the Maven plugin goals execute correctly in a real Maven build context.

## Architecture

Tests invoke Maven plugin goals with configured PSM models and template URIs, then verify the generated output matches expectations. The module depends on the Northwind model and test template packages.

## Requirements

### Requirement: Generate goal integration test SHALL produce expected output

The integration test SHALL execute the `generate` goal with the Northwind model and verify files are created at the expected paths with correct content.

#### Scenario: End-to-end generation test
- **GIVEN** a test Maven configuration with Northwind PSM model and test templates
- **WHEN** the `generate` goal executes
- **THEN** generated files appear in the target directory with expected structure and content

### Requirement: Plugin SHALL handle template overrides in integration context

The integration test SHALL verify that layered template URIs produce correctly merged/overridden output.

#### Scenario: Override replaces base template
- **GIVEN** base and override template URIs configured
- **WHEN** generation runs
- **THEN** the overridden template output reflects the override layer content
