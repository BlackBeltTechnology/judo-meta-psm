# PSM Validation

PSM models are validated using two complementary validation frameworks:

## Validation Frameworks

### 1. EVL (Epsilon Validation Language)

The original validation implementation using Epsilon's EVL language.

- **Location:** `model/src/main/epsilon/validations/`
- **Documentation:** See [Epsilon EVL documentation](https://eclipse.dev/epsilon/doc/evl/) for EVL syntax and usage

### 2. Java Validation Framework (Zeta)

A native Java validation implementation providing better IDE support, debugging, and performance.

- **Location:** `model/src/main/java/hu/blackbelt/judo/meta/psm/validation/`
- **Documentation:** See [java-validation-framework.md](java-validation-framework.md)
- **Zeta Framework:** See [judo-zeta repository](https://github.com/BlackBeltTechnology/judo-zeta)

## Comparison

| Feature | EVL | Java (Zeta) |
|---------|-----|-------------|
| IDE Support | Limited | Full (code completion, refactoring) |
| Debugging | EVL debugger | Standard Java debugger |
| Performance | ~400ms/1000 elements | ~50ms/1000 elements (~7.5x faster) |
| Type Safety | Runtime | Compile-time |
| Test Integration | Epsilon runtime | Standard JUnit |

## Validation Categories

Both frameworks implement validations for all PSM domains:

| Category | EVL Files | Java Package |
|----------|-----------|--------------|
| Namespace | `namespace/*.evl` | `rules.namespace` |
| Type | `type/*.evl` | `rules.type` |
| Data | `data/*.evl` | `rules.data` |
| Derived | `derived/*.evl` | `rules.derived` |
| Measure | `measure/*.evl` | `rules.measure` |
| Service | `service/*.evl` | `rules.service` |
| Accesspoint | `accesspoint/*.evl` | `rules.accesspoint` |

## Usage

### EVL Validation

```java
import hu.blackbelt.judo.meta.psm.PsmEpsilonValidator;

PsmEpsilonValidator.validatePsm(log, psmModel, 
    PsmEpsilonValidator.calculatePsmValidationScriptURI(),
    expectedErrors, expectedWarnings);
```

### Java Validation

```java
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;

// Simple validation
List<ValidationResult> results = PsmValidator.validate(log, psmModel);

// Validation with expected errors/warnings
PsmValidator.validatePsm(log, psmModel, expectedErrors, expectedWarnings);
```

## Testing

Both validation frameworks have comprehensive test coverage. See [tests.md](tests.md) for complete test documentation.

### Test Summary

| Test Category | Test Count | Description |
|---------------|------------|-------------|
| Namespace Tests | 22 | Container, naming, uniqueness |
| Type Tests | 10 | Numeric, string, enumeration |
| Data Tests | 41 | Entity, attribute, relation |
| Derived Tests | 7 | Data/navigation properties |
| Measure Tests | 16 | Measures and units |
| Service Tests | 20 | Transfer objects, operations |
| Java Tests | 7 | Zeta framework specific |
| Parameterized | 30 | EVL/Java consistency |
| Performance | 3 | Performance comparison |

### Running Tests

```bash
# Run all validation tests
mvn test -pl model-test

# Run parameterized tests (both EVL and Java)
mvn test -pl model-test -Dtest=PsmValidationParameterizedTest

# Run performance tests
mvn test -pl model-test -Dtest=PsmValidationPerformanceTest
```

## Related Documentation

### PSM-Specific
- [Java Validation Framework](java-validation-framework.md) - PSM-specific Java validation documentation
- [Validation Tests](tests.md) - Complete test documentation

### Zeta Framework Documentation
The Java validation framework is built on the [Judo Zeta Framework](https://github.com/BlackBeltTechnology/judo-zeta). Complete documentation is available in the Zeta repository:

- **[Getting Started](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/getting-started.md)** - Install and write your first validation rule
- **[User Guide](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/user-guide/)** - Core concepts, rules, guards, caching
- **[EVL Comparison](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/evl-comparison/)** - Migration from Epsilon EVL
- **[Best Practices](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/best-practices/)** - Production patterns
- **[Examples](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/examples/)** - Working examples
- **[Reference](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/reference/)** - API reference

### External References
- [Epsilon EVL Reference](https://eclipse.dev/epsilon/doc/evl/) - Epsilon Validation Language reference
- [Zeta Framework Repository](https://github.com/BlackBeltTechnology/judo-zeta) - Source code and issues
