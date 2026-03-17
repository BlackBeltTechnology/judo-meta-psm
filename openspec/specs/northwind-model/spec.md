# northwind-model Specification

## Purpose

The `northwind-model` module provides a comprehensive reference PSM model based on the classic Northwind database schema. It serves as the standard test fixture across multiple test modules and demonstrates real-world PSM modeling patterns.

## Architecture

The module contains a single `Demo` class that programmatically constructs a complete PSM model with entities, transfer objects, services, measures, and access points representing the Northwind domain (Orders, Products, Categories, Customers, Employees, etc.). The model is built using EMF builder APIs.

## Requirements

### Requirement: Demo model SHALL represent the Northwind domain

The Demo class SHALL construct a complete PSM model covering entities, types, relations, services, and access points for a typical e-commerce application.

#### Scenario: Full demo model construction
- **WHEN** `new Demo().fullDemo()` is called
- **THEN** a PsmModel is returned containing packages with EntityTypes (Order, Product, Category, Customer, Employee, etc.), MappedTransferObjectTypes, and ActorTypes

### Requirement: Demo model SHALL exercise all PSM metamodel features

The model SHALL include examples of all major PSM concepts: inheritance, containment, associations, derived properties, measures, enumerations, bound operations, and access points.

#### Scenario: Entity inheritance
- **GIVEN** the full demo model
- **WHEN** entity types are inspected
- **THEN** at least one EntityType has a non-empty superEntityTypes list

#### Scenario: Containment relations
- **GIVEN** the full demo model
- **WHEN** relations are inspected
- **THEN** at least one Containment relation exists between entities

### Requirement: Demo model SHALL be valid against Epsilon rules

The Northwind model SHALL pass all PSM Epsilon validation rules without errors.

#### Scenario: Validation passes
- **GIVEN** the full demo model
- **WHEN** PsmEpsilonValidator validates the model
- **THEN** no validation errors are reported
