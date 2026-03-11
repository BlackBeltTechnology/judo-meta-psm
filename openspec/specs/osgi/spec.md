# osgi Specification

## Purpose

The `osgi` module repackages the PSM model as an OSGi bundle and provides automatic model discovery and service registration for use in OSGi containers (e.g., Apache Karaf).

## Architecture

- **PsmModelBundleTracker**: An OSGi Declarative Services component (`@Component(immediate=true)`) that uses `BundleTrackerManager` to monitor installed bundles for PSM models.
- **PsmBundlePredicate**: Identifies PSM bundles by checking for the `Psm-Models` manifest header.
- **PsmRegisterCallback / PsmUnregisterCallback**: Bundle callbacks that load PSM models from bundle resources and register/unregister them as OSGi services.
- **Service Properties**: Registered PsmModel services include name, version, URI, and ResourceSet as service properties.

The `Psm-Models` manifest header format is: `name=<model-name>;file=<path-to-model-file>`.

## Requirements

### Requirement: Bundle tracker SHALL discover PSM models in installed bundles

PsmModelBundleTracker SHALL register a bundle callback that detects bundles with the `Psm-Models` manifest header.

#### Scenario: Bundle with PSM model detected
- **GIVEN** an OSGi container with PsmModelBundleTracker active
- **WHEN** a bundle with `Psm-Models` manifest header is installed and started
- **THEN** the tracker identifies the bundle as a PSM model bundle

### Requirement: PSM models SHALL be registered as OSGi services

When a PSM model bundle is detected, the tracker SHALL load the model and register it as a `PsmModel` OSGi service.

#### Scenario: Model registration
- **GIVEN** a PSM bundle with header `Psm-Models: name=northwind;file=model/northwind-psm.model`
- **WHEN** the bundle starts
- **THEN** a PsmModel service is registered with name "northwind" and the loaded model resource

### Requirement: Model services SHALL be unregistered on bundle stop

When a PSM model bundle is stopped, the tracker SHALL unregister the corresponding PsmModel service.

#### Scenario: Bundle stop cleans up service
- **GIVEN** a running PSM bundle with a registered PsmModel service
- **WHEN** the bundle is stopped
- **THEN** the PsmModel service is unregistered from the OSGi service registry
