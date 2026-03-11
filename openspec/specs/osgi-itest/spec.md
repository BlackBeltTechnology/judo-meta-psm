# osgi-itest Specification

## Purpose

The `osgi-itest` module contains integration tests that verify the PSM OSGi bundle works correctly inside a real OSGi container using Pax Exam.

## Architecture

Tests use Pax Exam to provision an Apache Karaf container, install the PSM bundle and its dependencies, and verify that the bundle lifecycle and service registration work correctly. Tests run JUnit 5 inside the OSGi container.

## Requirements

### Requirement: PSM bundle SHALL start successfully in Karaf

The integration test SHALL verify that the PSM OSGi bundle and all its dependencies resolve and start without errors in a Karaf container.

#### Scenario: Bundle activation
- **GIVEN** a Pax Exam Karaf container with PSM features installed
- **WHEN** the container starts
- **THEN** the PSM bundle is in ACTIVE state

### Requirement: PsmModel service SHALL be available in OSGi registry

The integration test SHALL verify that PsmModel instances are discoverable as OSGi services after bundle activation.

#### Scenario: Service discovery
- **GIVEN** a running Karaf container with PSM bundle active and a test PSM model bundle installed
- **WHEN** the service registry is queried for PsmModel services
- **THEN** the expected PsmModel service is found with correct properties (name, version)

### Requirement: Model loading SHALL work in OSGi context

The integration test SHALL verify that PSM models loaded in an OSGi context can be queried and validated.

#### Scenario: Model query in OSGi
- **GIVEN** a PsmModel service obtained from the OSGi registry
- **WHEN** the model's ResourceSet is accessed and entities are queried
- **THEN** expected model elements are found with correct FQNs
