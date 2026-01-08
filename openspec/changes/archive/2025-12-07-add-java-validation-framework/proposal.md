# Change: Integrate Zeta Java Validation Framework for PSM

## Why

The PSM model currently uses EVL (Epsilon Validation Language) for validation, which has limitations in IDE support, debugging capabilities, and performance. A Java-based validation framework (Zeta) has been implemented as a shared runtime module at `judo-ng/runtime/judo-zeta/` that provides:

- Better IDE integration (code completion, refactoring, navigation)
- Standard Java debugging capabilities
- Improved performance through parallel execution and caching
- Type-safe validation rule development
- Easier unit testing with JUnit

This change integrates the existing Zeta framework into PSM and translates the EVL validation rules to Java.

## What Changes

This change integrates the Zeta validation framework and implements PSM-specific validation rules:

### Dependencies (Already Implemented in judo-zeta)
The following components are **already available** in `judo-ng/runtime/judo-zeta/`:

- **zeta-annotations** module:
  - `@Constraint` - Error-level validation rules
  - `@Critique` - Warning-level validation rules
  - `@Satisfies` - Dependency declarations
  - `@Cached` - Method caching indicator
  - `@PreExecution` / `@PostExecution` - Hook annotations

- **validation-core** module:
  - `ValidationExecutor` - Parallel/sequential validation orchestration
  - `ValidationRegistry` - Rule registration and lookup
  - `ValidationContext` - Runtime context with utilities
  - `ValidatorDescriptor` - Rule metadata wrapper
  - `ValidationResult` - Immutable result value object
  - `Severity` - ERROR/WARNING severity enum

### PSM-Specific Implementation (To Be Added)
- **Validation rules package** (`hu.blackbelt.judo.meta.psm.validation.rules`):
  - `accesspoint/` - Actor type validations
  - `data/` - Entity type, attribute, relation validations
  - `derived/` - Data property, navigation property validations
  - `measure/` - Measure and unit validations
  - `namespace/` - Model and named element validations
  - `service/` - Transfer object, operation, parameter validations
  - `type/` - Primitive, enumeration, numeric type validations

- **Extension methods package** (`hu.blackbelt.judo.meta.psm.validation.extensions`):
  - Helper methods mirroring EOL operations
  - Cached computation results for performance

### Entry Point
- `PsmValidator` class providing dual validation execution

### Test Infrastructure
- Convert existing validation tests to parameterized tests
- Run both EVL and Java validation for each test case
- Ensure identical results between both approaches

## Impact

### Affected Specs
- `validation` (NEW) - Adds Java validation framework capability

### Affected Code
- **New files**: ~30+ Java classes for PSM-specific rules and extensions
- **Modified files**:
  - `model/pom.xml` - Add dependency on judo-zeta modules
  - All test files in `model-test/src/test/java/.../psm/` - Convert to parameterized tests

### Behavioral Changes
- **Non-breaking**: EVL validation continues to work exactly as before
- Both validation approaches run in parallel during tests
- Users can invoke either EVL or Java validation independently
- Validation results must be identical between EVL and Java

### Performance Impact
- Java validation expected to be faster due to parallel execution
- Caching of `satisfies()` checks and extension methods reduces redundant computation
- Automatic parallelization for large model element counts (>5000 elements)

### Testing Impact
- All existing validation tests converted to parameterized format
- Each test case runs twice: once with EVL, once with Java
- Test suite execution time may increase slightly due to dual validation
- Increased confidence in validation correctness

### Migration Path
- Phase 1 (This change): Integrate framework and translate all validation rules
- Phase 2 (Future): Teams can choose to deprecate EVL if Java proves sufficient
- No immediate migration required - both approaches coexist

## Dependencies

- **judo-zeta** (`judo-ng/runtime/judo-zeta/`) - Provides core validation framework
  - `zeta-annotations` - Validation annotations
  - `validation-core` - Validation execution engine

## Risks

- **Validation parity risk**: Java validation must produce identical results to EVL
  - **Mitigation**: Parameterized tests verify equivalence for every rule
  
- **Maintenance burden**: Two validation implementations to maintain
  - **Mitigation**: Tests ensure both stay in sync; framework simplifies Java validation development

- **Translation errors**: EVL to Java translation may introduce subtle bugs
  - **Mitigation**: Systematic translation approach; comprehensive test coverage

## Success Criteria

1. All 47 PSM EVL validation files translated to Java
2. All validation test cases pass with both EVL and Java validation
3. Validation results identical between EVL and Java for all test scenarios
4. Java validation framework documentation complete
5. Zero regression in existing EVL validation behavior
