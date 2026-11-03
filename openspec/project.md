# Project Context: Judo PSM (Platform-Specific Model) Meta

## Project Overview

**Repository:** BlackBeltTechnology/judo-meta-psm  
**License:** Eclipse Public License 2.0 (EPL-2.0)  
**Java Version:** 21  
**Build System:** Maven 3.9.4+ with Tycho (Eclipse build tooling)

This is an Eclipse/Tycho-based metamodel project that defines the Platform-Specific Model (PSM) for the JUDO framework. PSM represents a lower-level abstraction than ESM, providing platform-specific details for code generation.

## Technology Stack

- **Eclipse Modeling Framework (EMF)** 2.38.0+ - Metamodel foundation
- **Ecore** - Model definition language
- **MWE2** (Model Workflow Engine) 2.13.0 - Code generation workflows
- **Epsilon** 2.8.0 - Model validation and transformation (EVL for validation)
- **Tycho** 4.0.13 - Eclipse plugin build
- **Maven** 3.9.4+ with wrapper
- **JUnit** 5 - Testing framework
- **Lombok** 1.18.34 - Annotation processing

## Validation Approach

**Current State:**
- EVL (Epsilon Validation Language) is the primary validation mechanism
- 47 EVL validation files organized by metamodel packages
- Tests use `PsmEpsilonValidator` to execute EVL validations

**In Progress:**
- Adding Java validation framework (Zeta) as dual alternative to EVL
- Following ESM module's proven implementation pattern
- Parameterized tests to run both EVL and Java validation
- Goal: Identical results from both validation approaches

## Directory Structure

```
judo-meta-psm/
├── model/                          # Core PSM metamodel (Ecore)
│   ├── model/psm.ecore            # Metamodel definition
│   ├── src/main/epsilon/validations/  # EVL validation rules
│   └── src/main/java/             # Java code (including future Java validations)
├── model-test/                     # Unit tests for metamodel
├── northwind-model/                # Example PSM model implementation
├── osgi/                           # OSGi bundle repackaging
├── osgi-itest/                     # OSGi integration tests
├── generator-maven-plugin/         # Maven plugin for generation
├── site/                           # Eclipse P2 update site
└── openspec/                       # OpenSpec change management
```

## PSM Metamodel Structure

The core metamodel (`model/model/psm.ecore`) defines these packages:

| Package | Purpose |
|---------|---------|
| `namespace` | Models, packages, named elements |
| `type` | Primitive types, custom types, enumerations, measured types |
| `data` | Entity types, attributes, relations, sequences |
| `derived` | Data properties, navigation properties, accessors, static data |
| `measure` | Measures, units, derived measures |
| `service` | Transfer objects, operations, parameters, behaviours |
| `accesspoint` | Actor types, access points |

## Coding Conventions

### Java Code Style
- Use Lombok annotations for boilerplate reduction (`@Getter`, `@Builder`, etc.)
- Package structure follows metamodel organization
- Prefer immutable value objects for validation framework
- Use functional interfaces and lambdas where appropriate

### Validation Rules
- **EVL Files**: Organized by metamodel package under `model/src/main/epsilon/validations/`
- **Java Validations**: Mirror EVL structure under `hu.blackbelt.judo.meta.psm.validation.rules/`
- One validation class per EVL file
- Annotation-based declarative style

### Testing
- JUnit 5 for all tests
- Parameterized tests for dual validation (EVL + Java)
- Test naming: `test<ConstraintName>` for validation tests
- Use builders for test model construction

## Build Commands

```bash
# Standard build
mvn clean install

# Or with wrapper
./mvnw clean install

# Skip tests
mvn clean install -DskipTests

# Run specific test
mvn test -Dtest=PsmValidationTest
```

## Architectural Patterns

### Validation Framework (New)
- **Annotation-driven**: `@Constraint`, `@Critique`, `@Guard`, `@Satisfies`
- **Functional style**: `ValidationRule` as functional interface
- **Registry pattern**: `ValidationRegistry` and `ExtensionMethodRegistry`
- **Parallel execution**: Automatic for large models (>5000 elements)
- **Caching**: `satisfies()` results and `@Cached` extension methods

### Model Building
- Use generated builder classes (EMF + custom builders)
- Fluent API style
- Build complete model structures in tests

## Dependencies and Relationships

- **Related Projects:**
  - `judo-meta-esm` - Enterprise Service Model (higher abstraction)
  - `judo-meta-rsm` - Runtime Service Model (deployment-specific)
  
- **Validation Framework:**
  - PSM Java validation framework mirrors ESM implementation
  - Identical package structure and component names
  - Shared design patterns across Judo metamodels

## Important Notes

1. **Dual Validation**: Both EVL and Java validation must produce identical results
2. **EVL Preservation**: Existing EVL validations remain unchanged
3. **Test Coverage**: All validation rules must have parameterized tests
4. **Framework Consistency**: Follow ESM patterns exactly for cross-project consistency
5. **Performance**: Java validation should be faster via parallelization
6. **Type Safety**: Java validation provides compile-time checking

## OpenSpec Workflow

- Use OpenSpec for significant changes (features, breaking changes, architecture)
- Simple bug fixes and typos don't require proposals
- Validation changes go through proposal → implementation → archiving
- See `openspec/AGENTS.md` for detailed workflow

## Contact and Resources

- Main branch: `develop`
- CI/CD: Wercker with Maven Central and P2 deployment
- Issue tracking: GitHub Issues
- Documentation: See `README.adoc` and `openspec/` directory
