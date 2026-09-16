# AGENTS.md — `model/src/main/epsilon/validations/type`

EVL validation constraints and aggregator for PSM primitive, numeric, string, temporal, and enumeration types.

| File | Purpose |
| --- | --- |
| `_importType.evl` | Aggregates type-definition EVL validations. Imports rules for enums, numerics, primitives, strings, time, and timestamp types. |
| `enumerationMember.evl` | Validates `PSM!EnumerationMember` ordinals. Defines `EnumerationMemberValueIsUnique` checking that member ordinals are unique within the parent enumeration container. |
| `enumerationType.evl` | Validates `PSM!EnumerationType` sizing. Defines critique `EnumerationContainsAtLeastTwoMembers` warning when an enum defines fewer than two members. |
| `numeric.evl` | Validates `PSM!NumericType` precision and scale bounds. Defines `ScaleIsLowerThanPrecision` (`precision > scale`) and `ValidScale` (`scale >= 0`). |
| `primitive.evl` | Validates `PSM!Primitive` type naming. Defines critique `PrimitiveTypeNamesAreUnique` checking case-insensitive uniqueness across all primitive types. |
| `string.evl` | Validates `PSM!StringType` constraints and patterns. Defines `ValidMaxLength` (`maxLength > 0`), critique `MaxLengthIsNotTooLarge` (`maxLength <= 4000`), and `ValidRegex` via `psmUtils.isRegex()`. |
| `time.evl` | Validates `PSM!TimeType` units. Defines `TimeBaseUnitIsValid` ensuring `baseUnit` is one of `nanosecond`, `microsecond`, `millisecond`, or `second`. |
| `timestamp.evl` | Validates `PSM!TimestampType` units. Defines `TimeStampBaseUnitIsValid` restricting `baseUnit` to `nanosecond` through `day`. |
