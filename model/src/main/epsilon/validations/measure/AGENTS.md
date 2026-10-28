# AGENTS.md — `model/src/main/epsilon/validations/measure`

EVL validation constraints and aggregator for PSM physical/temporal measures, units, and conversion rates.

| File | Purpose |
| --- | --- |
| `_importMeasure.evl` | Aggregates measure-related EVL validations. Imports rules for derived measures, duration units, measures, and measurement units. |
| `derivedMeasure.evl` | Validates `PSM!DerivedMeasure` dependency graphs. Defines `NoCircularReferencesOfDerivedMeasures` ensuring term definitions do not contain self-referential cycles. |
| `durationUnit.evl` | Enforces mathematical conversion ratios across temporal duration units. Defines `MicrosecondRateIsValid`, `MillisecondRateIsValid`, and `SecondRateIsValid` (up through higher units) checking conversion rates to smaller units via `psmUtils.getRate()`. |
| `measure.evl` | Validates `PSM!Measure` naming and base units. Defines critique `BaseUnitShouldBeDefined` (`rateDividend == rateDivisor`), critique `MeasureNameIsUnique`, and constraint `MeasureSymbolIsUnique`. |
| `unit.evl` | Validates `PSM!Unit` names and symbols. Defines critique `UnitNameIsUnique`, critique `UnitSymbolIsUnique`, and constraint `UnitSymbolIsUniqueInMeasure` across units in a measure container. |
