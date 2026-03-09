# model-test Specification

## Purpose

The `model-test` module contains JUnit 5 tests that validate PSM model constraints by programmatically constructing models and running Epsilon validation rules against them. Tests are organized by PSM domain: data, type, namespace, measure, derived, accesspoint, and service.

## Architecture

Test classes follow a common pattern:
1. Build a PSM model programmatically using EMF builders
2. Run `PsmEpsilonValidator.validatePsm()` with expected errors/warnings
3. Assert that exactly the expected validation messages are produced

Key test classes: `PsmValidationDataTest`, `PsmValidationTypeTest`, `PsmValidationNamespaceTest`, `PsmValidationMeasureTest`, `PsmValidationDerivedTest`, `PsmValidationAccesspointTest`, `NorthwindTest`, `BuiltInOperationTest`, `ExecutionContextTest`, `DataTypeTest`.

## Requirements

### Requirement: Data validation tests SHALL verify entity and attribute constraints

Tests SHALL verify that EntityType, Attribute, Relation, BoundOperation, InvariantConstraint, and Sequence validation rules are correctly enforced.

#### Scenario: Invalid attribute type detected
- **GIVEN** an EntityType with an Attribute whose dataType is null
- **WHEN** Epsilon validation runs
- **THEN** a validation error is reported for the missing data type

#### Scenario: Valid entity passes
- **GIVEN** a well-formed EntityType with properly typed attributes and valid relations
- **WHEN** Epsilon validation runs
- **THEN** no errors are reported for the entity

### Requirement: Type validation tests SHALL verify primitive type constraints

Tests SHALL verify constraints on StringType (maxLength, regExp), NumericType (precision, scale), TimestampType, DateType, TimeType, BooleanType, and EnumerationType.

#### Scenario: StringType with negative maxLength
- **GIVEN** a StringType with maxLength set to -1
- **WHEN** Epsilon validation runs
- **THEN** a validation error is reported

### Requirement: Namespace validation tests SHALL verify naming and structure rules

Tests SHALL verify that namespace elements have valid names, packages are properly nested, and no naming conflicts exist.

#### Scenario: Duplicate element names in same namespace
- **GIVEN** a Package containing two EntityTypes with the same name
- **WHEN** Epsilon validation runs
- **THEN** a validation error is reported for the name conflict

### Requirement: Measure validation tests SHALL verify unit and measure constraints

Tests SHALL verify Measure, Unit, DerivedMeasure, and DurationUnit validation rules.

#### Scenario: DerivedMeasure with empty terms
- **GIVEN** a DerivedMeasure with no MeasureDefinitionTerms
- **WHEN** Epsilon validation runs
- **THEN** a validation error is reported

### Requirement: Northwind integration test SHALL validate the reference model

The NorthwindTest SHALL load the full Northwind demo model and verify it passes all validation rules and supports expected queries.

#### Scenario: Northwind model loads and validates
- **GIVEN** the Northwind demo model
- **WHEN** the model is loaded and validated
- **THEN** all validation rules pass and entities are resolvable by name
