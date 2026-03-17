# site Specification

## Purpose

The `site` module builds an Eclipse P2 update site that hosts the PSM feature for installation into Eclipse IDE. Update site URLs are version-specific.

## Architecture

The module uses Tycho's `eclipse-repository` packaging. It contains a `category.xml` that organizes the PSM feature into a category for the P2 update site. Because Tycho loads the category definition before Maven can substitute version properties, a special Maven profile (`update-category-versions`) handles version replacement.

## Requirements

### Requirement: Site SHALL produce a valid P2 repository

The site build SHALL produce a P2 repository containing the PSM feature with correct version metadata.

#### Scenario: P2 repository generation
- **WHEN** `./mvnw -f site/pom.xml clean install` runs
- **THEN** a P2 repository is generated in `site/target/repository/` with `content.jar`, `artifacts.jar`, and feature/plugin archives

### Requirement: Category versions SHALL be updateable via Maven profile

The `update-category-versions` profile SHALL replace version placeholders in the category definition with actual dependency versions.

#### Scenario: Version replacement
- **WHEN** `mvn clean install -P update-category-versions -f site/pom.xml` runs
- **THEN** the category.xml version references are updated to match the versions defined in the parent POM

### Requirement: Site SHALL reference correct P2 repositories

The site definition SHALL reference required P2 repositories for all external dependencies (EMF, Epsilon runtime, JUDO EPP commons).

#### Scenario: External dependency resolution
- **GIVEN** the site category.xml with repository references
- **WHEN** Eclipse resolves the update site
- **THEN** all referenced P2 repositories are accessible and contain the required features
