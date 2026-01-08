# Implementation Tasks: Integrate Zeta Java Validation Framework for PSM

> **Note**: The core Zeta validation framework is already implemented in `judo-ng/runtime/judo-zeta/`. 
> This task list covers only PSM-specific integration work.

## 1. Project Setup

### 1.1 Add Dependencies
- [x] 1.1.1 Add `judo-zeta-common` dependency to parent `pom.xml` and `osgi/pom.xml`
- [x] 1.1.2 Add `judo-zeta-annotations` dependency to parent `pom.xml` and `osgi/pom.xml`
- [x] 1.1.3 Add `judo-zeta-validation-core` dependency to parent `pom.xml` and `osgi/pom.xml`
- [x] 1.1.4 Add dependencies to `model-test/pom.xml` for testing
- [x] 1.1.5 Verify dependencies resolve correctly (build compiles)

### 1.2 Create Package Structure
- [x] 1.2.1 Create `hu.blackbelt.judo.meta.psm.validation` package
- [x] 1.2.2 Create `hu.blackbelt.judo.meta.psm.validation.rules.namespace` package
- [x] 1.2.3 Create `hu.blackbelt.judo.meta.psm.validation.rules.type` package
- [x] 1.2.4 Create `hu.blackbelt.judo.meta.psm.validation.rules.data` package
- [x] 1.2.5 Create `hu.blackbelt.judo.meta.psm.validation.rules.derived` package
- [x] 1.2.6 Create `hu.blackbelt.judo.meta.psm.validation.rules.measure` package
- [x] 1.2.7 Create `hu.blackbelt.judo.meta.psm.validation.rules.service` package
- [x] 1.2.8 Create `hu.blackbelt.judo.meta.psm.validation.rules.accesspoint` package
- [x] 1.2.9 Create `hu.blackbelt.judo.meta.psm.validation.extensions` package

### 1.3 Create Main Entry Point
- [x] 1.3.1 Implement `PsmModelProvider` class (implements `ModelProvider`)
- [x] 1.3.2 Implement `PsmValidator` class
- [x] 1.3.3 Implement `PsmJavaValidationException` class
- [x] 1.3.4 Add validation methods (simple, with expected errors/warnings, with parallel flag)
- [x] 1.3.5 Add automatic validator and extension method registration
- [x] 1.3.6 Add result checking against expected errors/warnings

## 2. Extension Methods Implementation

> **Note**: Extension methods were not needed - PsmUtils already provides all required helper methods.

### 2.1 Implement Common Extension Methods
- [x] 2.1.1 Reviewed existing `PsmUtils` - provides all needed operations
- [x] 2.1.2 No additional extension methods required

## 3. Validation Rules Implementation

### 3.1 Namespace Validations
- [x] 3.1.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.namespace` package
- [x] 3.1.2 Translate `namespace/namedElement.evl` → `NamedElementValidations.java`
- [x] 3.1.3 Translate `namespace/model.evl` → `ModelValidations.java`

### 3.2 Type Validations
- [x] 3.2.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.type` package
- [x] 3.2.2 Translate `type/primitive.evl` → `PrimitiveValidations.java`
- [x] 3.2.3 Translate `type/numeric.evl` → `NumericValidations.java`
- [x] 3.2.4 Translate `type/string.evl` → `StringValidations.java`
- [x] 3.2.5 Translate `type/timestamp.evl` → `TimestampValidations.java`
- [x] 3.2.6 Translate `type/time.evl` → `TimeValidations.java`
- [x] 3.2.7 Translate `type/enumerationType.evl` → `EnumerationTypeValidations.java`
- [x] 3.2.8 Translate `type/enumerationMember.evl` → `EnumerationMemberValidations.java`

### 3.3 Data Validations
- [x] 3.3.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.data` package
- [x] 3.3.2 Translate `data/entityType.evl` → `EntityTypeValidations.java`
- [x] 3.3.3 Translate `data/attribute.evl` → `AttributeValidations.java`
- [x] 3.3.4 Translate `data/relation.evl` → `RelationValidations.java`
- [x] 3.3.5 Translate `data/associationEnd.evl` → `AssociationEndValidations.java`
- [x] 3.3.6 Translate `data/cardinality.evl` → `CardinalityValidations.java`
- [x] 3.3.7 Translate `data/boundOperation.evl` → `BoundOperationValidations.java`
- [x] 3.3.8 Translate `data/sequence.evl` → `SequenceValidations.java`
- [x] 3.3.9 Translate `data/entitySequence.evl` → `EntitySequenceValidations.java`
- [x] 3.3.10 Translate `data/invariantConstraint.evl` → `InvariantConstraintValidations.java`

### 3.4 Derived Validations
- [x] 3.4.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.derived` package
- [x] 3.4.2 Translate `derived/dataProperty.evl` → `DataPropertyValidations.java`
- [x] 3.4.3 Translate `derived/navigationProperty.evl` → `NavigationPropertyValidations.java`
- [x] 3.4.4 Translate `derived/staticData.evl` → `StaticDataValidations.java`
- [x] 3.4.5 Translate `derived/staticNavigation.evl` → `StaticNavigationValidations.java`
- [x] 3.4.6 Translate `derived/primitiveAccessor.evl` → `PrimitiveAccessorValidations.java`
- [x] 3.4.7 Translate `derived/referenceAccessor.evl` → `ReferenceAccessorValidations.java`

### 3.5 Measure Validations
- [x] 3.5.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.measure` package
- [x] 3.5.2 Translate `measure/measure.evl` → `MeasureValidations.java`
- [x] 3.5.3 Translate `measure/unit.evl` → `UnitValidations.java`
- [x] 3.5.4 Translate `measure/derivedMeasure.evl` → `DerivedMeasureValidations.java`
- [x] 3.5.5 Translate `measure/durationUnit.evl` → `DurationUnitValidations.java`

### 3.6 Service Validations
- [x] 3.6.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.service` package
- [x] 3.6.2 Translate `service/transferObjectType.evl` → `TransferObjectTypeValidations.java`
- [x] 3.6.3 Translate `service/mappedTransferObjectType.evl` → `MappedTransferObjectTypeValidations.java`
- [x] 3.6.4 Translate `service/transferAttribute.evl` → `TransferAttributeValidations.java`
- [x] 3.6.5 Translate `service/transferObjectRelation.evl` → `TransferObjectRelationValidations.java`
- [x] 3.6.6 Translate `service/parameter.evl` → `ParameterValidations.java`
- [x] 3.6.7 Translate `service/boundTransferOperation.evl` → `BoundTransferOperationValidations.java`
- [x] 3.6.8 Translate `service/unboundOperation.evl` → `UnboundOperationValidations.java`
- [x] 3.6.9 Translate `service/boundBehaviour.evl` → `BoundBehaviourValidations.java`
- [x] 3.6.10 Translate `service/getPrincipalBehaviour.evl` → `GetPrincipalBehaviourValidations.java`
- [x] 3.6.11 Translate `service/getTemplateBehaviour.evl` → `GetTemplateBehaviourValidations.java`
- [x] 3.6.12 Translate `service/getRangeBehaviour.evl` → `GetRangeBehaviourValidations.java`

### 3.7 Accesspoint Validations
- [x] 3.7.1 Create `hu.blackbelt.judo.meta.psm.validation.rules.accesspoint` package
- [x] 3.7.2 Translate `accesspoint/actorType.evl` → `MappedTransferObjectActorTypeValidations.java` and `UnmappedTransferObjectActorTypeValidations.java`

## 4. Test Infrastructure Updates

### 4.1 Create Test Utilities
- [x] 4.1.1 Add osgi module dependency to model-test
- [x] 4.1.2 Create `PsmJavaValidationTest.java` with validation tests
- [x] 4.1.3 Create `PsmValidationPerformanceTest.java` with performance comparison

### 4.2 Performance Testing
- [x] 4.2.1 Created performance test generating ~1000 element model
- [x] 4.2.2 Benchmarked Java vs EVL validation
- [x] 4.2.3 Verified ~7.5x speedup with Java validation

## 5. Documentation

### 5.1 Framework Documentation
- [x] 5.1.1 Created `package-info.java` with comprehensive documentation
- [x] 5.1.2 Documented usage in tasks.md

## 6. Integration and Testing

### 6.1 Build Integration
- [x] 6.1.1 Verify Maven build compiles successfully
- [x] 6.1.2 All validation tests pass

## Performance Results

Performance comparison with a model containing ~1000 elements (100 entities, 500 attributes, 300 relations):

| Validation Type | Avg (ms) | Min (ms) | Max (ms) |
|-----------------|----------|----------|----------|
| Java            | 54.00    | 50       | 58       |
| EVL             | 406.60   | 397      | 432      |
| **Speedup**     | **7.53x**|          |          |

## Implementation Summary

### Validation Classes Created

| Package | Classes |
|---------|---------|
| validation | PsmValidator, PsmModelProvider, PsmJavaValidationException |
| validation.rules.namespace | NamedElementValidations, ModelValidations |
| validation.rules.type | PrimitiveValidations, NumericValidations, StringValidations, TimestampValidations, TimeValidations, EnumerationTypeValidations, EnumerationMemberValidations |
| validation.rules.data | CardinalityValidations, SequenceValidations, AttributeValidations, RelationValidations, EntitySequenceValidations, InvariantConstraintValidations, AssociationEndValidations, BoundOperationValidations, EntityTypeValidations |
| validation.rules.derived | DataPropertyValidations, NavigationPropertyValidations, StaticDataValidations, StaticNavigationValidations, PrimitiveAccessorValidations, ReferenceAccessorValidations |
| validation.rules.measure | MeasureValidations, UnitValidations, DerivedMeasureValidations, DurationUnitValidations |
| validation.rules.service | TransferObjectTypeValidations, ParameterValidations, UnboundOperationValidations, TransferAttributeValidations, TransferObjectRelationValidations, BoundTransferOperationValidations, MappedTransferObjectTypeValidations, BoundBehaviourValidations, GetPrincipalBehaviourValidations, GetTemplateBehaviourValidations, GetRangeBehaviourValidations |
| validation.rules.accesspoint | MappedTransferObjectActorTypeValidations, UnmappedTransferObjectActorTypeValidations |

**Total: 41 validation classes registered in PsmValidator**
