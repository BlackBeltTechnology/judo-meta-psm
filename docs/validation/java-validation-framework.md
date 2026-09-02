# PSM Java Validation Framework

The PSM Java Validation Framework provides native Java-based validation for PSM models using the Zeta validation framework. It offers an alternative to EVL validation with better IDE support, debugging capabilities, and improved performance.

## Overview

The framework translates all EVL validation rules to Java, providing:
- Full IDE support (code completion, refactoring, navigation)
- Standard Java debugging
- ~7.5x performance improvement over EVL
- Type-safe validation rule development
- Easy unit testing with JUnit

## Architecture

```
model/src/main/java/hu/blackbelt/judo/meta/psm/validation/
├── PsmValidator.java              # Main entry point
├── PsmModelProvider.java          # Model element provider
├── PsmJavaValidationException.java # Exception class
└── rules/
    ├── namespace/                 # Namespace validations (2 classes)
    │   ├── ModelValidations.java
    │   └── NamedElementValidations.java
    ├── type/                      # Type validations (7 classes)
    │   ├── EnumerationMemberValidations.java
    │   ├── EnumerationTypeValidations.java
    │   ├── NumericValidations.java
    │   ├── PrimitiveValidations.java
    │   ├── StringValidations.java
    │   ├── TimeValidations.java
    │   └── TimestampValidations.java
    ├── data/                      # Data validations (6 classes)
    │   ├── AssociationEndValidations.java
    │   ├── AttributeValidations.java
    │   ├── CardinalityValidations.java
    │   ├── EntitySequenceValidations.java
    │   ├── EntityTypeValidations.java
    │   └── RelationValidations.java
    ├── derived/                   # Derived validations (6 classes)
    │   ├── DataPropertyValidations.java
    │   ├── NavigationPropertyValidations.java
    │   ├── PrimitiveAccessorValidations.java
    │   ├── ReferenceAccessorValidations.java
    │   ├── StaticDataValidations.java
    │   └── StaticNavigationValidations.java
    ├── measure/                   # Measure validations (4 classes)
    │   ├── DerivedMeasureValidations.java
    │   ├── DurationUnitValidations.java
    │   ├── MeasureValidations.java
    │   └── UnitValidations.java
    ├── service/                   # Service validations (12 classes)
    │   ├── BoundBehaviourValidations.java
    │   ├── BoundOperationValidations.java
    │   ├── GetPrincipalBehaviourValidations.java
    │   ├── GetRangeBehaviourValidations.java
    │   ├── GetTemplateBehaviourValidations.java
    │   ├── InvariantConstraintValidations.java
    │   ├── MappedTransferObjectTypeValidations.java
    │   ├── ParameterValidations.java
    │   ├── TransferAttributeValidations.java
    │   ├── TransferObjectRelationValidations.java
    │   ├── TransferObjectTypeValidations.java
    │   └── UnboundOperationValidations.java
    └── accesspoint/               # Accesspoint validations (1 class)
        └── ActorTypeValidations.java
```

## Usage

### Basic Validation

```java
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.Severity;

// Validate model
List<ValidationResult> results = PsmValidator.validate(log, psmModel);

// Check for errors
List<ValidationResult> errors = results.stream()
    .filter(r -> r.getSeverity() == Severity.ERROR)
    .collect(Collectors.toList());

// Check for warnings
List<ValidationResult> warnings = results.stream()
    .filter(r -> r.getSeverity() == Severity.WARNING)
    .collect(Collectors.toList());
```

### Validation with Expected Results

```java
import hu.blackbelt.judo.meta.psm.validation.PsmValidator;
import hu.blackbelt.judo.meta.psm.validation.PsmJavaValidationException;

Collection<String> expectedErrors = Arrays.asList(
    "ConstraintName|Error message"
);
Collection<String> expectedWarnings = Collections.emptyList();

try {
    PsmValidator.validatePsm(log, psmModel, expectedErrors, expectedWarnings);
} catch (PsmJavaValidationException e) {
    // Handle unexpected validation results
    log.error("Validation failed: {}", e.getMessage());
}
```

### Parallel Validation

```java
// Enable parallel validation for large models
List<ValidationResult> results = PsmValidator.validate(log, psmModel, true);
```

## Zeta Annotations

Validation rules use the following Zeta annotations:

### @ValidationContext

Specifies the model element type the rules apply to:

```java
@ValidationContext(EntityType.class)
public class EntityTypeValidations {
    // Rules for EntityType elements
}
```

### @Constraint

Defines a validation constraint (error on failure):

```java
@Constraint(
    name = "EntityHasName",
    message = "Entity must have a name"
)
public ValidationRule entityHasName() {
    return (element, ctx) -> {
        EntityType self = (EntityType) element;
        if (self.getName() != null && !self.getName().isEmpty()) {
            return ValidationResult.pass();
        }
        return ValidationResult.fail("Entity must have a name");
    };
}
```

### @Critique

Defines a validation critique (warning on failure):

```java
@Critique(
    name = "EntityShouldHaveDescription",
    message = "Entity should have a description"
)
public ValidationRule entityShouldHaveDescription() {
    return (element, ctx) -> {
        EntityType self = (EntityType) element;
        if (self.getDescription() != null) {
            return ValidationResult.pass();
        }
        return ValidationResult.warn("Entity " + self.getName() + " should have a description");
    };
}
```

### @Satisfies

Specifies dependencies on other constraints:

```java
@Constraint(name = "UniqueAttributeNames")
@Satisfies("EntityHasName")
public ValidationRule uniqueAttributeNames() {
    // This rule only runs if EntityHasName passes
}
```

## Validation Classes

### Namespace Validations

| Class | Constraints |
|-------|-------------|
| `NamedElementValidations` | NamedElementHasContainer, NamedElementIsUniqueInItsContainer, ElementNameNotEmpty, ElementNameContainsValidCharacters, ElementNameCannotContainSubsequentUnderscores, ElementNameFirstCharacterCannotBeDigit, ElementNameLastCharacterCannotBeUnderscore |
| `ModelValidations` | StandaloneModelLoadedOnly |

### Type Validations

| Class | Constraints |
|-------|-------------|
| `PrimitiveValidations` | Primitive type validations |
| `NumericValidations` | ScaleIsLowerThanPrecision, ValidScale |
| `StringValidations` | ValidMaxLength, MaxLengthIsNotTooLarge (critique), ValidRegex |
| `TimestampValidations` | Timestamp validations |
| `TimeValidations` | Time validations |
| `EnumerationTypeValidations` | Enumeration type validations |
| `EnumerationMemberValidations` | Enumeration member validations |

### Data Validations

| Class | Constraints |
|-------|-------------|
| `EntityTypeValidations` | Entity type validations |
| `AttributeValidations` | Attribute validations |
| `RelationValidations` | Relation validations |
| `AssociationEndValidations` | Association end validations |
| `CardinalityValidations` | CardinalityLowerIsGreaterThanOrEqualToZero, CardinalityLowerMustBeLessOrEqualToUpper, CardinalityUpperIsAtLeastOne |
| `BoundOperationValidations` | Bound operation validations |
| `SequenceValidations` | Sequence validations |
| `EntitySequenceValidations` | Entity sequence validations |
| `InvariantConstraintValidations` | Invariant constraint validations |

### Derived Validations

| Class | Constraints |
|-------|-------------|
| `DataPropertyValidations` | Data property validations |
| `NavigationPropertyValidations` | Navigation property validations |
| `StaticDataValidations` | Static data validations |
| `StaticNavigationValidations` | Static navigation validations |
| `PrimitiveAccessorValidations` | Primitive accessor validations |
| `ReferenceAccessorValidations` | Reference accessor validations |

### Measure Validations

| Class | Constraints |
|-------|-------------|
| `MeasureValidations` | Measure validations |
| `UnitValidations` | Unit validations |
| `DerivedMeasureValidations` | Derived measure validations |
| `DurationUnitValidations` | Duration unit validations |

### Service Validations

| Class | Constraints |
|-------|-------------|
| `TransferObjectTypeValidations` | Transfer object type validations |
| `MappedTransferObjectTypeValidations` | Mapped transfer object type validations |
| `TransferAttributeValidations` | Transfer attribute validations |
| `TransferObjectRelationValidations` | Transfer object relation validations |
| `ParameterValidations` | Parameter validations |
| `BoundTransferOperationValidations` | Bound transfer operation validations |
| `UnboundOperationValidations` | Unbound operation validations |
| `BoundBehaviourValidations` | Bound behaviour validations |
| `GetPrincipalBehaviourValidations` | GET_PRINCIPAL behaviour validations |
| `GetTemplateBehaviourValidations` | GET_TEMPLATE behaviour validations |
| `GetRangeBehaviourValidations` | GET_RANGE behaviour validations |

### Accesspoint Validations

| Class | Constraints |
|-------|-------------|
| `MappedTransferObjectActorTypeValidations` | ActorTypeIsMapped |
| `UnmappedTransferObjectActorTypeValidations` | ActorTypeIsUnmapped |

## Performance

Performance comparison with a model containing ~1000 elements:

| Validation Type | Avg (ms) | Min (ms) | Max (ms) |
|-----------------|----------|----------|----------|
| Java            | 54.00    | 50       | 58       |
| EVL             | 406.60   | 397      | 432      |
| **Speedup**     | **7.53x**|          |          |

## Adding New Validation Rules

### Step 1: Create Validation Class

```java
package hu.blackbelt.judo.meta.psm.validation.rules.mypackage;

import hu.blackbelt.judo.meta.psm.mypackage.MyElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;

@ValidationContext(MyElement.class)
public class MyElementValidations {

    @Constraint(
        name = "MyConstraint",
        message = "Validation message"
    )
    public ValidationRule myConstraint() {
        return (element, ctx) -> {
            MyElement self = (MyElement) element;
            
            // Validation logic
            if (isValid(self)) {
                return ValidationResult.pass();
            }
            
            return ValidationResult.fail("Error message: " + self.getName());
        };
    }
}
```

### Step 2: Register in PsmValidator

Add the class to `VALIDATOR_CLASSES` in `PsmValidator.java`:

```java
private static final List<Class<?>> VALIDATOR_CLASSES = Arrays.asList(
    // ... existing classes ...
    MyElementValidations.class
);
```

### Step 3: Add Tests

Create test cases in `PsmJavaValidationTest.java`:

```java
@Test
void testMyConstraint() throws Exception {
    // Create model that violates the constraint
    MyElement element = createInvalidElement();
    psmModel.addContent(element);
    
    List<ValidationResult> results = getValidationResults();
    
    boolean hasError = results.stream()
        .anyMatch(r -> "MyConstraint".equals(r.getConstraintName()));
    
    assertTrue(hasError, "Expected MyConstraint violation");
}
```

## Related Documentation

### PSM-Specific
- [Validation Overview](README.md) - Overview of PSM validation

### Zeta Framework Documentation
Complete Zeta framework documentation is available in the [judo-zeta repository](https://github.com/BlackBeltTechnology/judo-zeta):

- **[Getting Started](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/getting-started.md)** - Install and write your first validation rule
- **[Core Concepts](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/user-guide/core-concepts.md)** - Validation fundamentals
- **[Validation Rules](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/user-guide/validation-rules.md)** - Writing validation rules
- **[Guards and Dependencies](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/user-guide/guards-and-dependencies.md)** - Conditional validation
- **[Caching](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/user-guide/caching.md)** - Performance optimization
- **[Extension Methods](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/user-guide/extension-methods.md)** - Custom helper methods
- **[Annotations Reference](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/reference/annotations.md)** - Complete annotation API
- **[EVL Migration Guide](https://github.com/BlackBeltTechnology/judo-zeta/blob/develop/docs/validation/evl-comparison/migration-guide.md)** - Migrating from EVL

### External References
- [Epsilon EVL Reference](https://eclipse.dev/epsilon/doc/evl/) - Epsilon Validation Language reference
- [Zeta Framework Repository](https://github.com/BlackBeltTechnology/judo-zeta) - Source code and issues
