# model Specification

## Purpose

The `model` module is the core Eclipse plugin containing the PSM (Platform Specific Model) Ecore metamodel, EMF-generated Java classes, Epsilon validation rules, and utility classes for model manipulation, FQN resolution, and CLI integration.

## Architecture

The module is structured around several key components:
- **Ecore Metamodel** (`model/psm.ecore`): Defines all PSM concepts across 9 packages — namespace, type, data, derived, service, measure, accesspoint, constraint, and script.
- **EMF Generated Code** (`src-gen/`): Java classes generated from the Ecore model via MWE2 workflow (EcoreGenerator, HelperGenerator, BuilderGenerator, RuntimeModelGenerator).
- **PsmUtils**: Core utility class for namespace traversal, FQN resolution (using `::` separator), inheritance queries, and model navigation.
- **PsmEpsilonValidator**: Orchestrates Epsilon Validation Language (EVL) rules for model constraint checking.
- **PsmModel / PsmModelResourceSupport**: Runtime model wrapper with builder pattern for loading, saving, and querying PSM models.
- **CLI Integration** (`PsmFqnResolverImpl`, `PsmValidatorImpl`): Implements judo-cli-api interfaces for FQN resolution and validation.

## Requirements

### Requirement: Ecore metamodel SHALL define all PSM concepts

The metamodel SHALL define entity types, data types, transfer objects, services, measures, access points, and derived properties as EClasses with proper inheritance and containment.

#### Scenario: Entity type with attributes and relations
- **GIVEN** a PSM model with a Package
- **WHEN** an EntityType is added with Attributes and Relations (AssociationEnd/Containment)
- **THEN** the EMF resource contains the EntityType with properly typed attributes and navigable relations

#### Scenario: Transfer object mapped to entity
- **GIVEN** an EntityType defined in the model
- **WHEN** a MappedTransferObjectType is created referencing that EntityType
- **THEN** TransferAttributes can bind to entity Attributes and TransferObjectRelations can bind to entity Relations

### Requirement: PsmUtils SHALL resolve fully qualified names

PsmUtils SHALL compute FQNs for all named elements using `::` as namespace separator and `.` as feature separator.

#### Scenario: Namespace element FQN
- **GIVEN** a Model named "MyModel" containing a Package "pkg" containing an EntityType "Order"
- **WHEN** `PsmUtils.namespaceElementToString(orderEntity)` is called
- **THEN** the result is `"MyModel::pkg::Order"`

#### Scenario: Attribute FQN
- **GIVEN** an EntityType "Order" with an Attribute "total"
- **WHEN** `PsmUtils.attributeToString(totalAttr)` is called
- **THEN** the result is `"MyModel::pkg::Order.total"`

### Requirement: PsmUtils SHALL resolve entity inheritance hierarchies

PsmUtils SHALL traverse super entity types to collect all inherited attributes, relations, data properties, navigation properties, operations, and sequences.

#### Scenario: Inherited attributes
- **GIVEN** EntityType "Base" with attribute "id" and EntityType "Child" extending "Base" with attribute "name"
- **WHEN** `PsmUtils.getAllAttributes(childEntity)` is called
- **THEN** the result contains both "id" and "name"

### Requirement: PsmEpsilonValidator SHALL validate models against EVL rules

The validator SHALL execute all Epsilon validation rules from `psm.evl` and its imports, reporting errors and warnings.

#### Scenario: Valid model passes validation
- **GIVEN** a well-formed PSM model with no constraint violations
- **WHEN** `PsmEpsilonValidator.validatePsm()` is called
- **THEN** no validation errors are reported

#### Scenario: Invalid model reports errors
- **GIVEN** a PSM model with a StringType having negative maxLength
- **WHEN** `PsmEpsilonValidator.validatePsm()` is called
- **THEN** a validation error is reported for the constraint violation

### Requirement: PsmModel SHALL support loading and saving models

PsmModel SHALL load PSM models from URIs/InputStreams and save to OutputStreams/URIs with configurable options.

#### Scenario: Load model from file
- **GIVEN** a PSM model file on disk
- **WHEN** `PsmModel.loadPsmModel(LoadArguments.loadArgumentsBuilder().uri(uri).build())` is called
- **THEN** the returned PsmModel contains the full model tree with accessible ResourceSet

#### Scenario: Save model to file
- **GIVEN** a PsmModel instance with content
- **WHEN** `psmModel.savePsmModel(SaveArguments.saveArgumentsBuilder().outputStream(os).build())` is called
- **THEN** the model is serialized to the output stream in XMI format

### Requirement: PsmFqnResolverImpl SHALL resolve FQNs bidirectionally

The CLI FQN resolver SHALL map between FQN strings and EObjects for all named PSM elements.

#### Scenario: Resolve FQN to EObject
- **GIVEN** a bound PsmFqnResolverImpl with a loaded PSM model
- **WHEN** `resolve("Model::Package::MyEntity")` is called
- **THEN** the corresponding EntityType EObject is returned

#### Scenario: Pattern-based FQN search
- **GIVEN** a bound PsmFqnResolverImpl
- **WHEN** `findByPattern("Model::*::Order*")` is called
- **THEN** all matching FQNs are returned as a Stream
