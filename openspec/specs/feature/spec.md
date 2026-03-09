# feature Specification

## Purpose

The `feature` module defines an Eclipse Feature that packages the PSM model plugin for installation into Eclipse IDE via P2 update sites.

## Architecture

The module uses Tycho's `eclipse-feature` packaging. It contains a `feature.xml` that declares the PSM model plugin as an included plugin, along with required dependencies (EMF, Epsilon, etc.). The feature is referenced by the `site` module for P2 repository generation.

## Requirements

### Requirement: Feature SHALL include the PSM model plugin

The feature definition SHALL include `hu.blackbelt.judo.meta.psm.model` as a bundled plugin.

#### Scenario: Feature includes model plugin
- **GIVEN** the feature.xml definition
- **WHEN** the feature is built with Tycho
- **THEN** the PSM model plugin JAR is included in the feature archive

### Requirement: Feature SHALL declare required dependencies

The feature SHALL declare dependencies on Eclipse EMF, Epsilon, and other required platform features.

#### Scenario: Dependency resolution
- **GIVEN** an Eclipse installation with the required platform features
- **WHEN** the PSM feature is installed via P2
- **THEN** all dependencies are satisfied and the feature installs successfully
