# AGENTS.md — `model/src/main/java/hu/blackbelt/judo/meta/psm/validation/rules/measure`

Validation rules for PSM measurement units, derived measures, and duration conversion rates.

| File | Purpose |
| --- | --- |
| `DerivedMeasureValidations.java` | Validates PSM `DerivedMeasure` definitions. Exports `noCircularReferencesOfDerivedMeasures()`. Enforces acyclic term hierarchy via `getAllTermMeasures()`, failing with ERROR when a derived measure contains itself. |
| `DurationUnitValidations.java` | Validates conversion ratios for `DurationUnit` across temporal scales. Exports `microsecondRateIsValid()`, `millisecondRateIsValid()`, `secondRateIsValid()`, `minuteRateIsValid()`, `hourRateIsValid()`, `dayRateIsValid()`, `weekRateIsValid()`, `yearRateIsValid()`. Enforces rate dividend and divisor proportions against base duration units. |
| `MeasureValidations.java` | Validates top-level `Measure` definitions. Exports `baseUnitShouldBeDefined()`, `measureNameIsUnique()`, `measureSymbolIsUnique()`. Emits WARNING when base unit (dividend == divisor) is missing, and flags duplicate measure names or symbols. |
| `UnitValidations.java` | Validates individual measurement `Unit` instances. Exports `unitNameIsUnique()`, `unitSymbolIsUnique()`, `unitSymbolIsUniqueInMeasure()`. Rejects duplicate unit names or symbols globally across the model and within the enclosing `Measure`. |
