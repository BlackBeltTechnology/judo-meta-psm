# Design: Java Validation Framework for PSM

## Context

The PSM module currently uses EVL (Epsilon Validation Language) for model validation. EVL provides declarative validation rules but has limitations:
- Poor IDE support (no code completion, limited refactoring)
- Difficult debugging (no standard Java debugger support)
- Runtime-only error detection (no compile-time checking)
- Performance constraints (sequential execution, no caching)

The ESM module successfully implemented a Java-based validation framework (internally called "Zeta") that addresses these limitations while maintaining semantic equivalence with EVL. This framework has proven production-ready and provides significant developer productivity benefits.

### Stakeholders
- **Developers**: Benefit from better tooling and debugging
- **QA**: Gain confidence from dual validation
- **Users**: Experience unchanged (validation remains transparent)

### Constraints
- Must maintain 100% compatibility with existing EVL validation
- Cannot break existing test infrastructure
- Must follow ESM framework patterns for consistency across Judo metamodels

## Goals / Non-Goals

### Goals
1. **Implement complete Java validation framework** mirroring ESM architecture
2. **Translate all 47 PSM EVL files** to Java validation rules
3. **Dual validation testing** - Run both EVL and Java for every test case
4. **Identical results** - Java validation must produce same errors/warnings as EVL
5. **Performance improvements** through parallel execution and caching
6. **Documentation** for framework usage and EVL-to-Java migration

### Non-Goals
1. **NOT deprecating EVL** in this change (future consideration)
2. **NOT changing validation semantics** - same rules, different implementation
3. **NOT modifying existing EVL files** - both coexist independently
4. **NOT adding new validation rules** - only translate existing ones

## Architecture

### Package Structure

```
hu.blackbelt.judo.meta.psm/
└── validation/
    ├── PsmValidator.java                   # Main entry point
    ├── annotation/                         # Validation annotations
    │   ├── ValidationContext.java         # @ValidationContext(Type.class)
    │   ├── Constraint.java                # @Constraint (errors)
    │   ├── Critique.java                  # @Critique (warnings)
    │   ├── Guard.java                     # @Guard(method = "...")
    │   ├── Satisfies.java                 # @Satisfies(constraints = {...})
    │   ├── ExtensionMethod.java           # @ExtensionMethod(Type.class)
    │   ├── Cached.java                    # @Cached
    │   ├── PreValidation.java             # @PreValidation
    │   └── PostValidation.java            # @PostValidation
    ├── core/                               # Core infrastructure
    │   ├── ValidationExecutor.java        # Orchestrates validation
    │   ├── ValidationRegistry.java        # Rule registration/lookup
    │   ├── ValidationContext.java         # Runtime context
    │   ├── ValidatorDescriptor.java       # Rule metadata
    │   ├── ValidationRule.java            # Functional interface
    │   ├── ValidationResult.java          # Result value object
    │   ├── Guard.java                     # Guard functional interface
    │   ├── Severity.java                  # ERROR/WARNING enum
    │   ├── ExtensionMethodRegistry.java   # Extension method management
    │   ├── ExtensionMethodDescriptor.java # Extension method metadata
    │   ├── CacheKey.java                  # Cache key value object
    │   └── CacheKeyBuilder.java           # Cache key factory
    ├── rules/                              # Validation rule implementations
    │   ├── accesspoint/
    │   │   └── ActorTypeValidations.java
    │   ├── data/
    │   │   ├── AssociationEndValidations.java
    │   │   ├── AttributeValidations.java
    │   │   ├── BoundOperationValidations.java
    │   │   ├── CardinalityValidations.java
    │   │   ├── EntitySequenceValidations.java
    │   │   ├── EntityTypeValidations.java
    │   │   ├── InvariantConstraintValidations.java
    │   │   ├── RelationValidations.java
    │   │   └── SequenceValidations.java
    │   ├── derived/
    │   │   ├── DataPropertyValidations.java
    │   │   ├── NavigationPropertyValidations.java
    │   │   ├── PrimitiveAccessorValidations.java
    │   │   ├── ReferenceAccessorValidations.java
    │   │   ├── StaticDataValidations.java
    │   │   └── StaticNavigationValidations.java
    │   ├── measure/
    │   │   ├── DerivedMeasureValidations.java
    │   │   ├── DurationUnitValidations.java
    │   │   ├── MeasureValidations.java
    │   │   └── UnitValidations.java
    │   ├── namespace/
    │   │   ├── ModelValidations.java
    │   │   └── NamedElementValidations.java
    │   ├── service/
    │   │   ├── BoundBehaviourValidations.java
    │   │   ├── BoundTransferOperationValidations.java
    │   │   ├── GetPrincipalBehaviourValidations.java
    │   │   ├── GetRangeBehaviourValidations.java
    │   │   ├── GetTemplateBehaviourValidations.java
    │   │   ├── MappedTransferObjectTypeValidations.java
    │   │   ├── ParameterValidations.java
    │   │   ├── TransferAttributeValidations.java
    │   │   ├── TransferObjectRelationValidations.java
    │   │   ├── TransferObjectTypeValidations.java
    │   │   └── UnboundOperationValidations.java
    │   └── type/
    │       ├── EnumerationMemberValidations.java
    │       ├── EnumerationTypeValidations.java
    │       ├── NumericValidations.java
    │       ├── PrimitiveValidations.java
    │       ├── StringValidations.java
    │       ├── TimeValidations.java
    │       └── TimestampValidations.java
    ├── extensions/                         # Extension methods
    │   ├── NamedElementExtensions.java
    │   ├── EntityTypeExtensions.java
    │   ├── AssociationEndExtensions.java
    │   ├── AttributeExtensions.java
    │   ├── MeasureExtensions.java
    │   └── ... (other extension classes)
    └── util/
        └── EolStyleCollections.java        # EOL collection utilities
```

### Component Responsibilities

#### 1. Annotation Layer
Declarative metadata for validation rules. Annotations are processed at runtime by the registry.

**Key Design**: Annotations mirror EVL syntax closely:
- `context EntityType` → `@ValidationContext(EntityType.class)`
- `constraint Name` → `@Constraint(name = "Name", message = "...")`
- `guard: condition` → `@Guard(method = "guardMethod")`

#### 2. Core Infrastructure

**ValidationRegistry**
- Scans classpath for `@ValidationContext` classes
- Registers validators by target EClass type
- Handles type hierarchy (finds validators for supertypes)
- Manages pre/post validation hooks

**ValidationExecutor**
- Orchestrates validation execution
- Automatic parallelization for >5000 elements
- Chunk-based work distribution
- Filters out passing results
- Separates errors from warnings

**ValidationContext**
- Thread-safe runtime context (ThreadLocal for current element)
- Provides `satisfies()` method for constraint dependencies
- Caches `satisfies()` results to prevent redundant evaluation
- Invokes extension methods via `call()`
- Access to `PsmUtils` and resource set

**ValidatorDescriptor**
- Wraps validation rule method
- Lazy initialization of rule lambdas
- Evaluates guards before execution
- Checks `@Satisfies` dependencies
- Interpolates message placeholders

#### 3. Validation Rules

Each validation rule class:
- Annotated with `@ValidationContext(Type.class)`
- Contains methods returning `ValidationRule` (functional interface)
- Each method annotated with `@Constraint` or `@Critique`
- Optional `@Guard` for conditional execution
- Optional `@Satisfies` for constraint dependencies

**Example Pattern**:
```java
@ValidationContext(NamedElement.class)
public class NamedElementValidations {
    
    @Constraint(
        name = "NamedElementHasContainer",
        message = "Named element {element.name} has no container"
    )
    public ValidationRule namedElementHasContainer() {
        return (element, ctx) -> {
            NamedElement self = (NamedElement) element;
            return self.eContainer() != null
                ? ValidationResult.pass()
                : ValidationResult.fail("Named element " + self.getName() + " has no container");
        };
    }
}
```

#### 4. Extension Methods

Provide helper operations similar to EOL operations:
- Annotated with `@ExtensionMethod(Type.class)`
- Methods take target element as first parameter
- Optional `@Cached` for expensive computations
- Invoked via `ValidationContext.call(element, "methodName", args...)`

**Example Pattern**:
```java
@ExtensionMethod(NamedElement.class)
public class NamedElementExtensions {
    
    @Cached
    public String getFQName(NamedElement self) {
        // Expensive computation - result cached
        return buildFullyQualifiedName(self);
    }
}
```

### Execution Flow

```
1. PsmValidator.validatePsm(log, model)
   │
   ├─> Create ValidationRegistry
   │   ├─> Scan for @ValidationContext classes
   │   └─> Register all validators
   │
   ├─> Create ExtensionMethodRegistry  
   │   ├─> Scan for @ExtensionMethod classes
   │   └─> Register all extension methods
   │
   ├─> Create ValidationContext
   │   ├─> Inject PsmUtils
   │   ├─> Provide satisfies() cache
   │   └─> Enable extension method calls
   │
   ├─> Create ValidationExecutor
   │   ├─> Parallel if >5000 elements
   │   └─> Sequential otherwise
   │
   ├─> Collect all model elements
   │   └─> ResourceSet.getAllContents()
   │
   ├─> Execute validation
   │   ├─> For each element:
   │   │   ├─> Find applicable validators
   │   │   ├─> Check guard conditions
   │   │   ├─> Check @Satisfies dependencies
   │   │   ├─> Execute validation rule
   │   │   └─> Collect failures
   │   └─> Return all failures
   │
   ├─> Separate errors from warnings
   │
   ├─> Check against expected errors/warnings
   │   ├─> Find unexpected errors
   │   ├─> Find errors not found
   │   ├─> Find unexpected warnings
   │   └─> Find warnings not found
   │
   └─> Return results or throw exception
```

### Parallelization Strategy

**Threshold**: 5000 elements
**Mechanism**: 
- Elements divided into chunks (1 chunk per available processor)
- Work-stealing pool (`Executors.newWorkStealingPool()`)
- Parallel stream processing within chunks
- Thread-safe context (ThreadLocal current element)

**Benefits**:
- Linear scaling with CPU cores
- Automatic load balancing
- No thread synchronization overhead

### Caching Strategy

**1. satisfies() Caching**
- `ConcurrentHashMap<CacheKey, Boolean>`
- Key: (element identity, constraint name)
- Prevents redundant constraint evaluation
- Thread-safe for parallel execution

**2. Extension Method Caching**
- `ConcurrentHashMap<CacheKey, Object>`
- Key: (target identity, method name, arguments)
- Only for `@Cached` methods
- Significant performance gain for expensive operations

## Decisions

### Decision 1: Copy ESM Framework Architecture Exactly
**What**: Use identical package structure, class names, and patterns from ESM.

**Why**:
- Proven production-ready implementation
- Consistency across Judo metamodels (PSM, ESM, RSM in future)
- Reduces learning curve for developers familiar with ESM
- Allows code reuse and shared utilities

**Alternatives Considered**:
- Create custom PSM-specific architecture → Rejected: Unnecessary divergence, reinventing wheel
- Use third-party validation framework (JSR-380, Hibernate Validator) → Rejected: Doesn't support our constraint dependency model

### Decision 2: Dual Validation via Parameterized Tests
**What**: Convert all validation tests to JUnit parameterized tests that run both EVL and Java validation.

**Why**:
- Guarantees result equivalence between EVL and Java
- Catches translation errors immediately
- Provides confidence for future EVL deprecation
- Minimal test code duplication

**Alternatives Considered**:
- Separate test suites → Rejected: Harder to maintain, easy to diverge
- Random sampling validation → Rejected: Incomplete coverage

**Implementation Pattern**:
```java
@ParameterizedTest
@EnumSource(ValidationMethod.class)
void testNamedElementHasContainer(ValidationMethod method) throws Exception {
    // Build test model
    Model m = ...;
    psmModel.addContent(m);
    
    // Run validation with selected method
    runValidation(method, 
        List.of("NamedElementHasContainer|..."),  // expected errors
        List.of());                                // expected warnings
}

enum ValidationMethod {
    EVL,
    JAVA
}

private void runValidation(ValidationMethod method, 
                          Collection<String> expectedErrors,
                          Collection<String> expectedWarnings) {
    if (method == ValidationMethod.EVL) {
        PsmEpsilonValidator.validatePsm(log, psmModel, scriptURI, 
                                       expectedErrors, expectedWarnings);
    } else {
        PsmValidator.validatePsm(log, psmModel, 
                                expectedErrors, expectedWarnings);
    }
}
```

### Decision 3: Functional Interface for Validation Rules
**What**: Use `ValidationRule` functional interface instead of abstract classes.

**Why**:
- Enables lambda expressions (concise rule definitions)
- Functional programming style matches validation logic
- Immutable, thread-safe by design
- Easier to test (pure functions)

**Alternatives Considered**:
- Abstract base class → Rejected: Verbose, limits flexibility
- Interface with default methods → Rejected: Similar to functional interface but more complex

### Decision 4: Annotation-Based Registration
**What**: Use runtime annotation scanning instead of manual registration.

**Why**:
- Declarative, self-documenting
- Reduces boilerplate
- Follows Spring/JPA patterns familiar to Java developers
- Compile-time validation via annotation processors (future enhancement)

**Alternatives Considered**:
- Manual registration in PsmValidator → Rejected: Error-prone, easy to forget
- Convention-based (package scanning without annotations) → Rejected: Less explicit, harder to debug

## EVL to Java Translation Guide

### Pattern Mapping

| EVL Syntax | Java Equivalent |
|------------|----------------|
| `context EntityType { ... }` | `@ValidationContext(EntityType.class)` |
| `constraint Name { ... }` | `@Constraint(name = "Name", message = "...")` |
| `critique Name { ... }` | `@Critique(name = "Name", message = "...")` |
| `guard: condition` | `@Guard(method = "guardMethod")` or inline `if` check |
| `check: condition` | Lambda body: `return condition ? pass() : fail(...)` |
| `message: "..."` | `message` attribute or `fail("...")` argument |
| `self.satisfies("Other")` | `ctx.satisfies("Other")` |
| `self.property` | `((EntityType)element).getProperty()` |
| `collection->select(...)` | `collection.stream().filter(...).collect(...)` |
| `collection->exists(...)` | `collection.stream().anyMatch(...)` |
| `collection->forAll(...)` | `collection.stream().allMatch(...)` |
| `operation name() { ... }` | `@ExtensionMethod` class method |

### Common Patterns

**1. Simple Constraint**
```evl
constraint AttributeHasName {
    check: self.name.isDefined() and self.name.length() > 0
    message: "Attribute must have a name"
}
```

```java
@Constraint(
    name = "AttributeHasName",
    message = "Attribute must have a name"
)
public ValidationRule attributeHasName() {
    return (element, ctx) -> {
        Attribute self = (Attribute) element;
        boolean isValid = self.getName() != null && self.getName().length() > 0;
        return isValid
            ? ValidationResult.pass()
            : ValidationResult.fail("Attribute must have a name");
    };
}
```

**2. Constraint with Guard**
```evl
constraint EntityHasIdentifier {
    guard: not self.isAbstract()
    check: self.attributes.exists(a | a.isIdentifier)
    message: "Entity " + self.name + " must have an identifier attribute"
}
```

```java
@Constraint(
    name = "EntityHasIdentifier",
    message = "Entity {element.name} must have an identifier attribute"
)
public ValidationRule entityHasIdentifier() {
    return (element, ctx) -> {
        EntityType self = (EntityType) element;
        
        // Guard check
        if (self.isAbstract()) {
            return ValidationResult.pass();
        }
        
        // Validation logic
        boolean hasIdentifier = self.getAttributes().stream()
            .anyMatch(Attribute::isIdentifier);
        
        return hasIdentifier
            ? ValidationResult.pass()
            : ValidationResult.fail("Entity " + self.getName() + 
                                   " must have an identifier attribute");
    };
}
```

**3. Constraint with Dependencies**
```evl
constraint EntityNameIsUnique {
    guard: self.satisfies("NamedElementHasContainer")
    check: not Model.allInstances().any(m | m != self.eContainer).elements
               .select(e | e.isKindOf(EntityType))
               .exists(e | e.name.toLowerCase() == self.name.toLowerCase())
    message: "Entity name must be unique: " + self.name
}
```

```java
@Constraint(
    name = "EntityNameIsUnique",
    message = "Entity name must be unique: {element.name}"
)
public ValidationRule entityNameIsUnique() {
    return (element, ctx) -> {
        EntityType self = (EntityType) element;
        
        // Guard: dependency check
        if (!ctx.satisfies("NamedElementHasContainer")) {
            return ValidationResult.pass();
        }
        
        // Get all entities except in same model
        String selfNameLower = self.getName() != null 
            ? self.getName().toLowerCase() : "";
            
        boolean hasDuplicate = ctx.getAllInstances(Model.class).stream()
            .filter(m -> m != self.eContainer())
            .flatMap(m -> m.getElements().stream())
            .filter(e -> e instanceof EntityType)
            .map(e -> (EntityType) e)
            .anyMatch(e -> {
                String eName = e.getName() != null 
                    ? e.getName().toLowerCase() : "";
                return eName.equals(selfNameLower);
            });
        
        return !hasDuplicate
            ? ValidationResult.pass()
            : ValidationResult.fail("Entity name must be unique: " + self.getName());
    };
}
```

## Risks / Trade-offs

### Risk 1: Translation Errors
**Risk**: Manual EVL-to-Java translation may introduce subtle semantic differences.

**Mitigation**:
- Parameterized tests verify equivalence
- Systematic translation checklist
- Peer review of all validation rule translations
- Comprehensive test coverage of edge cases

### Risk 2: Maintenance Burden
**Risk**: Two validation implementations increase maintenance effort.

**Trade-off**: Short-term burden vs long-term benefit.

**Mitigation**:
- Tests ensure both stay synchronized
- Framework design makes Java validation easier to maintain than EVL
- Future: deprecate EVL once Java proven sufficient

### Risk 3: Performance Regression
**Risk**: Java validation might be slower than EVL in some scenarios.

**Trade-off**: Flexibility vs raw performance.

**Mitigation**:
- Parallel execution compensates
- Caching reduces redundant computation
- Benchmark large models to verify performance claims

### Risk 4: Framework Bugs
**Risk**: Core framework bugs affect all validation rules.

**Trade-off**: Centralized infrastructure vs distributed logic.

**Mitigation**:
- Copy proven ESM implementation
- Comprehensive unit tests for framework components
- Integration tests with real models

## Migration Plan

### Phase 1: Framework Implementation (This Change)
1. Copy core framework from ESM → PSM
2. Translate all 47 EVL files to Java
3. Convert all tests to parameterized format
4. Verify equivalence via tests
5. Document framework and translation patterns

### Phase 2: Stabilization (Post-Deployment)
1. Monitor for validation discrepancies
2. Address any Java translation bugs
3. Optimize performance bottlenecks
4. Gather developer feedback

### Phase 3: Future Consideration
1. Evaluate EVL deprecation based on:
   - Java validation stability
   - Developer preference
   - Performance metrics
2. If deprecating EVL:
   - Mark EVL as deprecated
   - Document migration timeline
   - Remove EVL in major version bump

### Rollback Strategy
- EVL validation remains unchanged - can revert to EVL-only tests
- Remove `validation/` package if framework proves problematic
- No schema or API changes - purely additive

## Open Questions

1. **Should we add annotation processor for compile-time validation?**
   - Validate `@Constraint` methods return `ValidationRule`
   - Check `@Guard` method signatures
   - Future enhancement - not blocking

2. **Should we expose validation framework as public API?**
   - Currently internal to model module
   - Could be useful for custom validations
   - Decision: Keep internal for now, expose if demand arises

3. **Should we add validation rule testing utilities?**
   - Helper methods for testing individual rules
   - Mock ValidationContext for unit tests
   - Decision: Add if developers request during implementation

4. **Performance benchmarking needed?**
   - Compare EVL vs Java validation performance
   - Identify optimization opportunities
   - Decision: Measure during implementation, optimize if needed

## References

- ESM Java Validation Framework: `/Users/robson/Project/judo-ng/models/judo-meta-esm/model/src/main/java/hu/blackbelt/judo/meta/esm/validation/`
- ESM Parameterized Tests: `/Users/robson/Project/judo-ng/models/judo-meta-esm/model-test/src/test/java/hu/blackbelt/judo/meta/esm/validation/ValidatorEngineTest.java`
- PSM EVL Validations: `model/src/main/epsilon/validations/`
- PSM Current Tests: `model-test/src/test/java/hu/blackbelt/judo/meta/psm/`
