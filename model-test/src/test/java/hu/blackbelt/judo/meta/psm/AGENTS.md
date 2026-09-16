# AGENTS.md — `model-test/src/test/java/hu/blackbelt/judo/meta/psm`

Integration and unit tests for PSM model elements, EMF reflection, validation rules, and helper utilities.

| File | Purpose |
| --- | --- |
| `BuiltInOperationTest.java` | Tests built-in operation representations and `toString()` output across primitive types, models, packages, entity types, and relations. |
| `DataTypeTest.java` | Tests `DataType` type predicates (`isInteger`, `isDecimal`, `isString`, `isBoolean`, `isEnumeration`, `isDate`, `isTimestamp`, `isMeasured`) and `EnumerationType.contains()` against Northwind model elements. |
| `EntityTypeTest.java` | Tests supertype hierarchy traversal (`getAllSuperEntityTypes` with single, multiple, and diamond inheritance) and attribute/navigation property resolution on `EntityType`. |
| `ExecutionContextTest.java` | Tests reflective model creation inside Epsilon `ExecutionContext` and EVL validation runtime using `BufferedSlf4jLogger` and `WrappedEmfModelContext`. |
| `NorthwindTest.java` | Abstract base test fixture for Northwind PSM tests. Loads `Demo.fullDemo()` into `resourceSet` and `northwind` `Model`, exporting `getEntityType(name)` and `getMappedTransferObjectType(name)` lookup helpers. |
| `PsmJavaValidationTest.java` | Tests `PsmValidator.validatePsm` Java-based validation engine against synthetic models, asserting parity with expected EVL error and warning diagnostics. |
| `PsmUtilsTest.java` | Tests `PsmUtils` static operations: transfer object instantiability, bound operation inheritance traversal, attribute/relation collection, sequence retrieval, and XMI ID uniqueness validation. |
| `PsmValidationAccesspointTest.java` | Base validation test fixture executing EVL scripts via `PsmEpsilonValidator.validatePsm` against synthetic accesspoint and actor model configurations. |
| `PsmValidationDataTest.java` | EVL `data`-package rules via `PsmEpsilonValidator.validatePsm` in `runEpsilon`: cardinality (`testCardinalityUpperIsAtLeastOneAssociationEnd`), partner pairing (`testPartnerIsNotSelf`), inheritance (`testInheritanceIsNotRecursive`, `testInheritingUniqueAttributeNamesLowerCase`), plus `testInvariantConstraintValidation`. Builder-wired fixtures must match each test's expected error sets. |
| `PsmValidationDerivedTest.java` | Tests EVL validation rules for derived features, data expressions, expression types, and derived navigation properties. |
| `PsmValidationMeasureTest.java` | Tests EVL validation rules for measurement units, conversions, rates (microsecond through year), duration types, and measurement hierarchies. |
| `PsmValidationNamespaceTest.java` | Tests EVL validation rules for namespaces, packages, models, unique element naming, and package containment constraints. |
| `PsmValidationParameterizedTest.java` | Parameterized test suite running identical test models against both EVL and Java validation engines to verify diagnostic consistency. |
| `PsmValidationPerformanceTest.java` | Benchmarks execution time and throughput of Java-based `PsmValidator` against EVL script execution over a generated 1000-element model. |
| `PsmValidationServiceTest.java` | EVL `service`-package rules via `PsmEpsilonValidator.validatePsm`: binding parity (`testDataTypeMatchesBindingDataType`, `testRequiredFlagMatchesBindingRequiredFlag`), mapped owners (`testOwnerIsMappedTransferObjectType`), operations (`testInitOperationCannotHaveInput`), and `testAllRequiredFeaturesHaveBindingIfCreatable`. Fixtures mix `newActorTypeBuilder` with `ServiceBuilders`/`DataBuilders`. |
| `PsmValidationTest.java` | Integration test exercising `PsmEpsilonValidator.calculatePsmValidationScriptURI()` and default PSM validation rule execution over full model fixtures. |
| `PsmValidationTypeTest.java` | Tests EVL validation rules for primitive data types, string constraints, precision/scale on numeric types, and enumeration definitions. |
