# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm/validation/rules/type`

Validation rules for PSM primitives, numeric constraints, string formats, enums, and temporal types.

| File | Purpose |
| --- | --- |
| `EnumerationMemberValidations.java` | Validates `EnumerationMember` instances within their parent enum. Exports `enumerationMemberValueIsUnique()`. Rejects duplicate member ordinal numbers across the enclosing `EnumerationType`. |
| `EnumerationTypeValidations.java` | Validates `EnumerationType` structures. Exports `enumerationContainsAtLeastTwoMembers()`. Emits WARNING critique when an enum defines zero or only a single member. |
| `NumericValidations.java` | Validates `NumericType` bounds. Exports `scaleIsLowerThanPrecision()`, `validScale()`. Enforces non-negative scale and requires scale strictly less than precision. |
| `PrimitiveValidations.java` | Validates `Primitive` type declarations globally. Exports `primitiveTypeNamesAreUnique()`. Emits WARNING critique if duplicate primitive type names exist across the model. |
| `StringValidations.java` | Validates `StringType` definitions. Exports `validMaxLength()`, `maxLengthIsNotTooLarge()`, `validRegex()`. Rejects maxLength <= 0 or invalid regex syntax with ERROR, and issues WARNING critique when maxLength exceeds 4000. |
| `TimeValidations.java` | Validates `TimeType` configuration. Exports `timeBaseUnitIsValid()`. Restricts valid base units to nanosecond, microsecond, millisecond, and second. |
| `TimestampValidations.java` | Validates `TimestampType` configuration. Exports `timeStampBaseUnitIsValid()`. Restricts valid base units to nanosecond through day durations. |
