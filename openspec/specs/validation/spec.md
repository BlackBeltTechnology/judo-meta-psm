# validation Specification

## Purpose
TBD - created by archiving change add-java-validation-framework. Update Purpose after archive.
## Requirements
### Requirement: Java Validation Framework
The PSM model validation system SHALL support Java-based validation as an alternative to EVL validation, providing improved IDE integration, debugging capabilities, and performance through parallel execution.

#### Scenario: Java validator validates PSM model
- **GIVEN** a PSM model with validation rules defined in Java
- **WHEN** the Java validator is invoked on the model
- **THEN** all model elements are validated according to Java-defined rules
- **AND** validation results contain errors and warnings
- **AND** results are identical to EVL validation output

#### Scenario: Parallel validation execution for large models
- **GIVEN** a PSM model with more than 5000 elements
- **WHEN** Java validation is executed
- **THEN** validation is performed in parallel across multiple threads
- **AND** validation completes faster than sequential execution
- **AND** results are thread-safe and consistent

#### Scenario: Validation with satisfies dependency caching
- **GIVEN** validation rules with satisfies() dependencies
- **WHEN** validation is executed
- **THEN** satisfies() results are cached per element
- **AND** dependent constraints are not re-evaluated unnecessarily
- **AND** validation performance is improved through caching

### Requirement: Validation Annotations
The Java validation framework SHALL provide a comprehensive set of annotations for declaring validation rules, guards, dependencies, and extension methods.

#### Scenario: Constraint annotation defines error-level validation
- **GIVEN** a validation rule class with a method annotated with @Constraint
- **WHEN** the validation registry scans the class
- **THEN** the constraint is registered as an error-level validation rule
- **AND** the constraint name and message are extracted from annotation attributes
- **AND** the rule can be invoked on applicable model elements

#### Scenario: Critique annotation defines warning-level validation
- **GIVEN** a validation rule class with a method annotated with @Critique
- **WHEN** the validation registry scans the class
- **THEN** the critique is registered as a warning-level validation rule
- **AND** failures are reported as warnings, not errors

#### Scenario: Guard annotation enables conditional validation
- **GIVEN** a constraint with @Guard(method = "guardMethod")
- **WHEN** validation is executed
- **THEN** the guard method is evaluated first
- **AND** the constraint only executes if the guard returns true
- **AND** the constraint passes automatically if the guard returns false

#### Scenario: Satisfies annotation declares constraint dependencies
- **GIVEN** a constraint with @Satisfies(constraints = {"Dep1", "Dep2"})
- **WHEN** validation is executed
- **THEN** Dep1 and Dep2 are evaluated first
- **AND** the constraint only executes if both dependencies are satisfied
- **AND** the constraint passes automatically if any dependency fails

#### Scenario: ValidationContext annotation specifies target type
- **GIVEN** a validation class annotated with @ValidationContext(EntityType.class)
- **WHEN** the validation registry scans classes
- **THEN** all validators in the class are associated with EntityType
- **AND** validators are invoked only for EntityType instances

#### Scenario: ExtensionMethod annotation registers helper methods
- **GIVEN** a class annotated with @ExtensionMethod(NamedElement.class)
- **WHEN** the extension method registry scans classes
- **THEN** all public methods are registered as extension methods
- **AND** methods can be invoked via ValidationContext.call()

#### Scenario: Cached annotation enables method result caching
- **GIVEN** an extension method annotated with @Cached
- **WHEN** the method is invoked multiple times for the same element
- **THEN** the result is computed only once
- **AND** subsequent invocations return the cached result
- **AND** cache is thread-safe for parallel execution

### Requirement: Validation Registry
The validation framework SHALL provide a registry that discovers, registers, and manages validation rules with support for type hierarchies, guards, and dependencies.

#### Scenario: Registry discovers validation classes
- **GIVEN** validation rule classes in the classpath
- **WHEN** ValidationRegistry.register() is called
- **THEN** all @ValidationContext annotated classes are discovered
- **AND** all @Constraint and @Critique methods are registered
- **AND** validators are indexed by target type

#### Scenario: Registry finds validators for type hierarchy
- **GIVEN** validators registered for NamedElement
- **WHEN** getValidatorsFor(EntityType.class) is called
- **THEN** validators for EntityType are returned
- **AND** validators for NamedElement are also returned (supertype)
- **AND** validators for EObject are also returned (root type)

#### Scenario: Registry looks up validator by name
- **GIVEN** a registered constraint named "EntityTypeHasName"
- **WHEN** getValidatorByName("EntityTypeHasName") is called
- **THEN** the validator descriptor is returned
- **AND** the validator can be invoked

### Requirement: Validation Executor
The validation framework SHALL provide an executor that orchestrates validation with support for sequential and parallel execution, guard evaluation, and dependency checking.

#### Scenario: Sequential validation execution
- **GIVEN** a model with fewer than 5000 elements
- **WHEN** ValidationExecutor.validate() is called with parallel=false
- **THEN** validation is performed sequentially
- **AND** all applicable validators are executed for each element
- **AND** failures are collected and returned

#### Scenario: Parallel validation execution
- **GIVEN** a model with more than 5000 elements
- **WHEN** ValidationExecutor.validate() is called with parallel=true
- **THEN** elements are divided into chunks
- **AND** chunks are processed in parallel using a work-stealing pool
- **AND** validation is thread-safe
- **AND** failures are collected and returned

#### Scenario: Guard evaluation prevents unnecessary validation
- **GIVEN** a constraint with a guard that returns false
- **WHEN** the validator is executed
- **THEN** the guard is evaluated first
- **AND** the constraint logic is not executed
- **AND** ValidationResult.pass() is returned

#### Scenario: Satisfies dependency evaluation
- **GIVEN** a constraint that depends on another constraint
- **WHEN** the validator is executed
- **THEN** the dependency is checked via ValidationContext.satisfies()
- **AND** if the dependency fails, the constraint passes automatically
- **AND** if the dependency passes, the constraint logic executes

### Requirement: Validation Context
The validation framework SHALL provide a runtime context that enables validation rules to access model utilities, check constraint dependencies, invoke extension methods, and cache results.

#### Scenario: Context provides access to model utilities
- **GIVEN** a ValidationContext with PsmUtils
- **WHEN** a validation rule accesses the context
- **THEN** PsmUtils methods are available
- **AND** the resource set is accessible

#### Scenario: Context checks constraint satisfaction
- **GIVEN** a validation rule that calls ctx.satisfies("OtherConstraint")
- **WHEN** satisfies() is invoked
- **THEN** OtherConstraint is evaluated if not already cached
- **AND** the result is cached for the current element
- **AND** subsequent calls return the cached result

#### Scenario: Context invokes extension methods
- **GIVEN** an extension method "getFQName" registered for NamedElement
- **WHEN** ctx.call(element, "getFQName") is invoked
- **THEN** the extension method is executed
- **AND** the result is returned
- **AND** cached results are used if method is annotated with @Cached

#### Scenario: Context provides thread-safe current element
- **GIVEN** parallel validation execution
- **WHEN** multiple threads access ValidationContext
- **THEN** each thread has its own current element (ThreadLocal)
- **AND** no thread interference occurs

### Requirement: Dual Validation Testing
The PSM validation test suite SHALL run both EVL and Java validation for every test case, ensuring semantic equivalence between the two approaches.

#### Scenario: Parameterized test runs both validation methods
- **GIVEN** a parameterized test with @EnumSource(ValidationMethod.class)
- **WHEN** the test is executed
- **THEN** the test runs once with EVL validation
- **AND** the test runs once with Java validation
- **AND** both executions produce identical results

#### Scenario: Test validates equivalence of error messages
- **GIVEN** a test case expecting specific error messages
- **WHEN** both EVL and Java validation execute
- **THEN** both produce the same error names
- **AND** both produce the same error messages
- **AND** no unexpected errors occur

#### Scenario: Test validates equivalence of warning messages
- **GIVEN** a test case expecting specific warning messages
- **WHEN** both EVL and Java validation execute
- **THEN** both produce the same warning names
- **AND** both produce the same warning messages
- **AND** no unexpected warnings occur

### Requirement: Extension Method Registry
The validation framework SHALL provide a registry for extension methods with support for caching, type-based lookup, and dynamic invocation.

#### Scenario: Registry discovers extension method classes
- **GIVEN** extension method classes annotated with @ExtensionMethod
- **WHEN** ExtensionMethodRegistry.register() is called
- **THEN** all public methods are registered
- **AND** methods are indexed by target type and method name

#### Scenario: Registry invokes extension method
- **GIVEN** a registered extension method "hasContainer"
- **WHEN** registry.invoke(element, "hasContainer") is called
- **THEN** the method is invoked with element as the first parameter
- **AND** the result is returned

#### Scenario: Registry caches extension method results
- **GIVEN** a method annotated with @Cached
- **WHEN** the method is invoked multiple times for the same element
- **THEN** the result is computed only on the first invocation
- **AND** cached result is returned on subsequent invocations
- **AND** cache key is based on element identity and method name

### Requirement: Validation Result Model
The validation framework SHALL provide an immutable result model that represents validation outcomes with severity levels, messages, and associated model elements.

#### Scenario: ValidationResult represents passing validation
- **GIVEN** a validation rule that passes
- **WHEN** ValidationResult.pass() is returned
- **THEN** the result indicates success
- **AND** the result is considered passing

#### Scenario: ValidationResult represents error
- **GIVEN** a validation rule that fails
- **WHEN** ValidationResult.fail("Error message") is returned
- **THEN** the result indicates failure with ERROR severity
- **AND** the error message is captured
- **AND** the result is considered failing

#### Scenario: ValidationResult represents warning
- **GIVEN** a validation rule that produces a warning
- **WHEN** ValidationResult.warn("Warning message") is returned
- **THEN** the result indicates failure with WARNING severity
- **AND** the warning message is captured
- **AND** the result is considered failing (but non-critical)

### Requirement: EVL to Java Translation Patterns
The validation framework SHALL follow systematic patterns for translating EVL validation rules to Java, ensuring semantic equivalence.

#### Scenario: EVL constraint translates to Java @Constraint
- **GIVEN** an EVL constraint with name, guard, check, and message
- **WHEN** translated to Java
- **THEN** a method with @Constraint annotation is created
- **AND** the constraint name matches the EVL constraint name
- **AND** the guard logic is preserved
- **AND** the check logic is implemented in the lambda body
- **AND** the message is preserved

#### Scenario: EVL critique translates to Java @Critique
- **GIVEN** an EVL critique with name, guard, check, and message
- **WHEN** translated to Java
- **THEN** a method with @Critique annotation is created
- **AND** the critique produces warnings instead of errors

#### Scenario: EVL satisfies translates to ctx.satisfies()
- **GIVEN** an EVL guard with self.satisfies("OtherConstraint")
- **WHEN** translated to Java
- **THEN** the guard checks ctx.satisfies("OtherConstraint")
- **AND** the constraint passes if the dependency fails

#### Scenario: EOL collection operations translate to Java streams
- **GIVEN** EVL logic using collection->select(), ->exists(), ->forAll()
- **WHEN** translated to Java
- **THEN** Java Stream API equivalents are used
- **AND** the semantic behavior is preserved
- **AND** the results are identical

### Requirement: Validation Performance Optimization
The Java validation framework SHALL optimize validation performance through parallel execution, caching, and lazy initialization.

#### Scenario: Parallel execution reduces validation time
- **GIVEN** a large model with >10000 elements
- **WHEN** validation is executed in parallel
- **THEN** execution time is significantly less than sequential execution
- **AND** speedup correlates with available CPU cores

#### Scenario: Satisfies caching prevents redundant evaluation
- **GIVEN** multiple constraints depending on the same constraint
- **WHEN** validation is executed
- **THEN** the dependency is evaluated only once per element
- **AND** results are cached and reused
- **AND** total validation time is reduced

#### Scenario: Extension method caching prevents redundant computation
- **GIVEN** expensive extension methods marked with @Cached
- **WHEN** methods are invoked multiple times for the same element
- **THEN** computation occurs only once
- **AND** cached results are returned on subsequent calls
- **AND** validation performance is improved

### Requirement: Validation Documentation
The Java validation framework SHALL include comprehensive documentation covering architecture, usage patterns, and migration from EVL.

#### Scenario: Framework architecture is documented
- **GIVEN** the Java validation framework documentation
- **WHEN** a developer reads the architecture section
- **THEN** core components are explained
- **AND** package structure is documented
- **AND** execution flow is illustrated
- **AND** design decisions are justified

#### Scenario: EVL to Java migration guide is provided
- **GIVEN** the migration guide documentation
- **WHEN** a developer needs to translate an EVL file
- **THEN** systematic translation patterns are provided
- **AND** complete examples are shown
- **AND** common pitfalls are documented
- **AND** the developer can successfully translate EVL to Java

#### Scenario: Extension method development is documented
- **GIVEN** the extension method documentation
- **WHEN** a developer needs to create helper methods
- **THEN** creation patterns are explained
- **AND** caching best practices are provided
- **AND** examples are shown
- **AND** the developer can create effective extension methods

