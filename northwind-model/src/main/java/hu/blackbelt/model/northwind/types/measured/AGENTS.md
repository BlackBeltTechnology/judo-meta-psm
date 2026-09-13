# `northwind-model/src/main/java/hu/blackbelt/model/northwind/types/measured` — unit-bound `MeasuredType` declarations of the Northwind demo PSM model

Every file builds one `MeasuredType` via `MeasureBuilders`, binding a numeric precision/scale
to a concrete `Unit` taken off a measure fragment in `hu.blackbelt.model.northwind.measures`.
`init` takes two arguments — the owning `Package` and the measure instance whose unit field it
reads — so the referenced measure must be initialised first, otherwise `withStoreUnit` receives
`null`. Each type is attached with `usePackage($package).withElements($)`; the `$` field is the
identity attributes reference.

| File | Purpose |
|---|---|
| `AreaStoredInSquareMetre.java` | Declares `MeasuredType` `"AreaStoredInSquareMetre"`, `precision=15`, `scale=4`, store unit `$area.squareMetre`. Exports `$` (`MeasuredType`), `init(Package, Area)`. |
| `MassStoredInGrams.java` | Declares `MeasuredType` `"MassStoredInGrams"`, `precision=15`, `scale=4`, store unit `$mass.gram`. Exports `$` (`MeasuredType`), `init(Package, Mass)`. Gram-based sibling of `MassStoredInKilograms` over the same `Mass` measure. |
| `MassStoredInKilograms.java` | Declares `MeasuredType` `"MassStoredInKilograms"`, `precision=15`, `scale=4`, store unit `$mass.kilogram`. Exports `$` (`MeasuredType`), `init(Package, Mass)`. Stored magnitude differs from `MassStoredInGrams` by the unit's rate — values are not interchangeable without conversion. |
| `TimeStoredInMonths.java` | Declares `MeasuredType` `"TimeStoredInMonths"`, `precision=9`, **no scale** (integral months), store unit `$moMonthBasedTime.month`. Exports `$` (`MeasuredType`), `init(Package, MonthBasedTime)`. Uses the month-based measure, which is deliberately not convertible to the second-based `Time` measure. |
| `TimeStoredInSeconds.java` | Declares `MeasuredType` `"TimeStoredInSeconds"`, `precision=15`, `scale=4`, store unit `$time.second`. Exports `$` (`MeasuredType`), `init(Package, Time)`. |
| `VelocityStoredInKmPerHour.java` | Declares `MeasuredType` `"VelocityStoredInKmPerHour"`, `precision=15`, `scale=4`, store unit `$velocity.kilometrePerHour`. Exports `$` (`MeasuredType`), `init(Package, Velocity)`. Velocity is a derived measure, so its unit exists only after the base measures it is composed from are built. |
| `VolumeStoredInLitre.java` | Declares `MeasuredType` `"VolumeStoredInLitre"`, `precision=15`, `scale=4`, store unit `$volume.litre`. Exports `$` (`MeasuredType`), `init(Package, Volume)`. |
