# PSM Validation Tests

This document describes all validation tests for the PSM model. Tests are located in `model-test/src/test/java/hu/blackbelt/judo/meta/psm/`.

## Test Overview

| Test Class | Description | Test Count |
|------------|-------------|------------|
| `PsmValidationTest` | Core EVL validation tests | 4 |
| `PsmValidationNamespaceTest` | Namespace and naming validation | 22 |
| `PsmValidationTypeTest` | Type system validation | 10 |
| `PsmValidationDataTest` | Entity and data validation | 41 |
| `PsmValidationDerivedTest` | Derived property validation | 7 |
| `PsmValidationMeasureTest` | Measure and unit validation | 16 |
| `PsmValidationServiceTest` | Service layer validation | 20 |
| `PsmValidationAccesspointTest` | Access point validation | - |
| `PsmJavaValidationTest` | Java (Zeta) validation tests | 7 |
| `PsmValidationParameterizedTest` | Parameterized EVL/Java tests | 30 |
| `PsmValidationPerformanceTest` | Performance comparison tests | 3 |

**Total: ~160 validation tests**

---

## PsmValidationTest

Core validation tests using EVL.

| Test Method | Description |
|-------------|-------------|
| `testModelNameIsUnique` | Validates that model names are unique (StandaloneModelLoadedOnly) |
| `testDataPropertyGetterTypeIsValid` | Validates data property getter expressions |
| `testValidModelWithMeasures` | Validates a complete model with measures |
| `testValidModel` | Validates a complete valid model |

---

## PsmValidationNamespaceTest

Tests for namespace, container, and naming validations.

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testStandaloneModelLoadedOnly` | StandaloneModelLoadedOnly |
| `testPackageHasNamespace` | NamedElementHasContainer |
| `testNamespaceElementBelongsToOneNamespace` | NamedElementHasContainer |
| `testEnumerationMemberHasEnumerationType` | NamedElementHasContainer |
| `testRelationBelongsToEntity` | NamedElementHasContainer |
| `testAttributeBelongsToEntity` | NamedElementHasContainer |
| `testDataPropertyBelongsToEntity` | NamedElementHasContainer |
| `testNavigationPropertyBelongsToEntity` | NamedElementHasContainer |
| `testNamedElementHasContainer` | NamedElementHasContainer |
| `testDataPropertyNameIsUnique` | NamedElementIsUniqueInItsContainer |
| `testNavigationPropertyNameIsUnique` | NamedElementIsUniqueInItsContainer |
| `testAttributeNameIsUnique` | NamedElementIsUniqueInItsContainer |
| `testRelationNameIsUnique` | NamedElementIsUniqueInItsContainer |
| `testNoAttributeAndRelationAreWithTheSameName` | NamedElementIsUniqueInItsContainer |
| `testNamedElementIsUniqueInItsContainer` | NamedElementIsUniqueInItsContainer |
| `testNamespaceHasUniqueElementNames` | NamedElementIsUniqueInItsContainer |
| `testEnumerationMemberNameIsUnique` | NamedElementIsUniqueInItsContainer |
| `testNamespaceElementNameNotEmpty` | ElementNameNotEmpty |
| `testNamespaceElementNameContainsValidCharacters` | ElementNameContainsValidCharacters |
| `testNamespaceElementNameCannotContainSubsequentUnderscores` | ElementNameCannotContainSubsequentUnderscores |
| `testNamespaceElementNameFirstCharacterCannotBeDigit` | ElementNameFirstCharacterCannotBeDigit |
| `testNamespaceElementNameLastCharacterCannotBeUnderscore` | ElementNameLastCharacterCannotBeUnderscore |

---

## PsmValidationTypeTest

Tests for type system validations.

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testEnumerationMemberValueIsUnique` | EnumerationMemberValueIsUnique |
| `testEnumerationContainsAtLeastTwoMembers` | EnumerationContainsAtLeastTwoMembers |
| `testScaleIsLowerThanPrecision` | ScaleIsLowerThanPrecision |
| `testValidScale` | ValidScale |
| `testPrimitiveTypeNamesAreUnique` | PrimitiveTypeNamesAreUnique |
| `testValidMaxLength` | ValidMaxLength |
| `testMaxLengthIsNotTooLarge` | MaxLengthIsNotTooLarge (critique) |
| `testValidRegex` | ValidRegex |
| `testTimeStampBaseUnitIsValid` | TimeStampBaseUnitIsValid |
| `testTimeBaseUnitIsValid` | TimeBaseUnitIsValid |

---

## PsmValidationDataTest

Tests for entity type and data validations.

### Cardinality Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testCardinalityUpperIsAtLeastOneAssociationEnd` | CardinalityUpperIsAtLeastOne |
| `testCardinalityLowerIsGreaterThanOrEqualToZeroContainment` | CardinalityLowerIsGreaterThanOrEqualToZero |
| `testCardinalityLowerMustBeLessOrEqualToUpper` | CardinalityLowerMustBeLessOrEqualToUpper |

### Association End Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testCascadeDeleteOnlyAllowedIfUpperCardinalityIsOne` | CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne |
| `testPartnerIsNotSelf` | PartnerIsNotSelf |
| `testOppositePartnerIsDefined` | OppositePartnerIsDefined |
| `testValidPartnerRelations` | ValidPartnerRelations |
| `testValidPartnerType` | ValidPartnerType |
| `testAtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound` | AtLeastOnePartnerInBidirectionalAssociationHasZeroLowerBound |

### Entity Type Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testEntityTypeNamesAreUnique` | EntityTypeNamesAreUnique |
| `testInheritanceIsNotRecursive` | InheritanceIsNotRecursive |
| `testInheritedAndOwnAttributeNameIsUniqueInEntityType` | InheritedAndOwnAttributeNameIsUniqueInEntityType |
| `testInheritedAndOwnRelationNameIsUniqueInEntityType` | InheritedAndOwnRelationNameIsUniqueInEntityType |

### Inheritance Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testInheritingUniqueAttributeNamesLowerCase` | InheritingUniqueAttributeNames |
| `testInheritingUniqueAttributeNamesMixedCase` | InheritingUniqueAttributeNames |
| `testInheritingUniqueRelationNamesLowerCase` | InheritingUniqueRelationNames |
| `testInheritingUniqueRelationNamesMixedCase` | InheritingUniqueRelationNames |
| `testInheritingUniqueDataPropertyNamesLowerCase` | InheritingUniqueDataPropertyNames |
| `testInheritingUniqueDataPropertyNamesMixedCase` | InheritingUniqueDataPropertyNames |

---

## PsmValidationDerivedTest

Tests for derived property validations.

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testStaticDataNamesAreUnique` | StaticDataNamesAreUnique |
| `testStaticNavigationNamesAreUnique` | StaticNavigationNamesAreUnique |
| `testInheritedAndOwnDataPropertyNameIsUniqueInEntityType` | InheritedAndOwnDataPropertyNameIsUniqueInEntityType |
| `testInheritedAndOwnNavigationPropertyNameIsUniqueInEntityType` | InheritedAndOwnNavigationPropertyNameIsUniqueInEntityType |
| `testSetterExpressionsAreNotSupportedYetInPrimitiveAccessor` | SetterExpressionsAreNotSupportedYet |
| `testSetterExpressionsAreNotSupportedYetInReferenceAccessor` | SetterExpressionsAreNotSupportedYet |
| `testNotRequiredIfDerived` | NotRequiredIfDerived |

---

## PsmValidationMeasureTest

Tests for measure and unit validations.

### Measure Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testNoCircularReferencesOfDerivedMeasures` | NoCircularReferencesOfDerivedMeasures |
| `testBaseUnitShouldBeDefined` | BaseUnitShouldBeDefined |
| `testMeasureNameIsUnique` | MeasureNameIsUnique |
| `testMeasureSymbolIsUnique` | MeasureSymbolIsUnique |

### Unit Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testUnitRates` | UnitRatesAreValid |
| `testUnitNameIsUnique` | UnitNameIsUnique |
| `testUnitSymbolIsUnique` | UnitSymbolIsUnique |
| `testUnitSymbolIsUniqueInMeasure` | UnitSymbolIsUniqueInMeasure |

### Duration Unit Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testMicrosecondRateIsValid` | DurationUnitRateIsValid |
| `testMillisecondRateIsValid` | DurationUnitRateIsValid |
| `testSecondRateIsValid` | DurationUnitRateIsValid |
| `testMinuteRateIsValid` | DurationUnitRateIsValid |
| `testHourRateIsValid` | DurationUnitRateIsValid |
| `testDayRateIsValid` | DurationUnitRateIsValid |
| `testWeekRateIsValid` | DurationUnitRateIsValid |
| `testYearRateIsValid` | DurationUnitRateIsValid |

---

## PsmValidationServiceTest

Tests for service layer validations.

### Transfer Attribute Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testDataTypeMatchesBindingDataType` | DataTypeMatchesBindingDataType |
| `testRequiredFlagMatchesBindingRequiredFlag` | RequiredFlagMatchesBindingRequiredFlag |
| `testTransferAttributeBindingIsValid` | TransferAttributeBindingIsValid |

### Transfer Object Relation Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testTargetMatchesBindingTarget` | TargetMatchesBindingTarget |
| `testCardinalityMatchesBindingCardinality` | CardinalityMatchesBindingCardinality |
| `testTransferObjectRelationIsEmbedded` | TransferObjectRelationIsEmbedded |
| `testTransferObjectRelationBindingIsValid` | TransferObjectRelationBindingIsValid |
| `testEmbeddedOnBothSidesAreNotAllowed` | EmbeddedOnBothSidesAreNotAllowed |

### Transfer Object Type Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testTransferObjectTypeNamesAreUnique` | TransferObjectTypeNamesAreUnique |

### Cardinality Validations (Service Layer)

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testCardinalityLowerIsGreaterThanOrEqualToZeroRelation` | CardinalityLowerIsGreaterThanOrEqualToZero |
| `testCardinalityLowerMustBeLessOrEqualToUpperRelation` | CardinalityLowerMustBeLessOrEqualToUpper |
| `testCardinalityUpperIsAtLeastOneRelation` | CardinalityUpperIsAtLeastOne |
| `testCardinalityLowerIsGreaterThanOrEqualToZeroParameter` | CardinalityLowerIsGreaterThanOrEqualToZero |
| `testCardinalityLowerMustBeLessOrEqualToUpperParameter` | CardinalityLowerMustBeLessOrEqualToUpper |
| `testCardinalityUpperIsAtLeastOneParameter` | CardinalityUpperIsAtLeastOne |

### Bound Operation Validations

| Test Method | Constraint Tested |
|-------------|-------------------|
| `testOwnerIsMappedTransferObjectType` | OwnerIsMappedTransferObjectType |
| `testBindingIsValid` | BindingIsValid |
| `testParametersAreValid` | ParametersAreValid |
| `testInitOperationCannotHaveInput` | InitOperationCannotHaveInput |

---

## PsmJavaValidationTest

Tests specifically for the Java (Zeta) validation framework.

| Test Method | Description |
|-------------|-------------|
| `testValidModel` | Validates a complete model with no errors |
| `testElementNameNotEmpty` | Tests ElementNameNotEmpty constraint |
| `testNamedElementIsUniqueInItsContainer` | Tests NamedElementIsUniqueInItsContainer constraint |
| `testValidMaxLength` | Tests ValidMaxLength constraint |
| `testScaleIsLowerThanPrecision` | Tests ScaleIsLowerThanPrecision constraint |
| `testCardinalityUpperIsAtLeastOne` | Tests CardinalityUpperIsAtLeastOne constraint |
| `testValidationResultsContainCorrectInfo` | Verifies ValidationResult structure |

---

## PsmValidationParameterizedTest

Parameterized tests that run the same test cases with both EVL and Java validation engines to ensure consistency.

### Test Cases

| Test Case | Expected Constraint |
|-----------|---------------------|
| ValidModel | (no violations) |
| EmptyElementName | ElementNameNotEmpty |
| DuplicateElementNames | NamedElementIsUniqueInItsContainer |
| InvalidMaxLength | ValidMaxLength |
| InvalidScale | ScaleIsLowerThanPrecision |
| InvalidCardinalityUpper | CardinalityUpperIsAtLeastOne |
| NegativeCardinalityLower | CardinalityLowerIsGreaterThanOrEqualToZero |
| CardinalityLowerGreaterThanUpper | CardinalityLowerMustBeLessOrEqualToUpper |
| InvalidPrecision | ScaleIsLowerThanPrecision |
| NegativeScale | ValidScale |

### Test Methods

| Test Method | Description |
|-------------|-------------|
| `testValidation` | Runs each test case with EVL and Java validation (20 tests) |
| `testValidationConsistency` | Verifies EVL and Java produce same results (10 tests) |

---

## PsmValidationPerformanceTest

Performance comparison tests between EVL and Java validation.

| Test Method | Description |
|-------------|-------------|
| `testPerformanceComparison` | Compares EVL vs Java validation performance |
| `testJavaValidationOnLargeModel` | Tests Java validation on large models |
| `testEvlValidationOnLargeModel` | Tests EVL validation on large models |

### Performance Results

Based on tests with ~1000 elements:

| Validation Engine | Average (ms) | Min (ms) | Max (ms) |
|-------------------|--------------|----------|----------|
| Java (Zeta)       | 54           | 50       | 58       |
| EVL               | 407          | 397      | 432      |
| **Speedup**       | **7.5x**     |          |          |

---

## Running Tests

### Run All Validation Tests

```bash
mvn test -pl model-test
```

### Run Specific Test Class

```bash
mvn test -pl model-test -Dtest=PsmValidationDataTest
```

### Run Specific Test Method

```bash
mvn test -pl model-test -Dtest=PsmValidationDataTest#testCardinalityUpperIsAtLeastOneAssociationEnd
```

### Run Parameterized Tests Only

```bash
mvn test -pl model-test -Dtest=PsmValidationParameterizedTest
```

### Run Performance Tests

```bash
mvn test -pl model-test -Dtest=PsmValidationPerformanceTest
```

---

## Adding New Tests

### For EVL Validation

1. Add test method to appropriate `PsmValidation*Test.java` class
2. Create model that violates the constraint
3. Use `runEpsilon()` with expected errors/warnings

```java
@Test
void testMyConstraint() throws Exception {
    // Create invalid model
    MyElement element = newMyElementBuilder().withName("").build();
    Model m = newModelBuilder().withName("M").withElements(element).build();
    psmModel.addContent(m);

    runEpsilon(
        ImmutableList.of("MyConstraint|Error message"),
        Collections.emptyList()
    );
}
```

### For Java Validation

1. Add test to `PsmJavaValidationTest.java`
2. Use `PsmValidator.validate()` and check results

```java
@Test
void testMyConstraint() throws Exception {
    // Create invalid model
    MyElement element = newMyElementBuilder().withName("").build();
    Model m = newModelBuilder().withName("M").withElements(element).build();
    psmModel.addContent(m);

    List<ValidationResult> results = getValidationResults();
    
    boolean hasError = results.stream()
        .anyMatch(r -> "MyConstraint".equals(r.getConstraintName()));
    
    assertTrue(hasError, "Expected MyConstraint violation");
}
```

### For Parameterized Tests (Both Engines)

1. Add test case to `validationTestCases()` in `PsmValidationParameterizedTest.java`

```java
ValidationTestCase.failing("MyTestCase", psmModel -> {
    MyElement element = newMyElementBuilder().withName("").build();
    Model m = newModelBuilder().withName("M").withElements(element).build();
    psmModel.addContent(m);
}, "MyConstraint")
```

---

## Related Documentation

- [Validation Overview](README.md)
- [Java Validation Framework](java-validation-framework.md)
- [Zeta Framework Documentation](https://github.com/BlackBeltTechnology/judo-zeta)
