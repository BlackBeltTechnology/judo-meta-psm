# `northwind-model/src/main/java/hu/blackbelt/model/northwind/types` — primitive/enum type declarations of the Northwind demo PSM model

Each file is a one-shot builder fragment: a `public <XxxType> $` field pre-built by
`TypeBuilders`, plus `init(Package $package)` which names the type and attaches it to the
passed package via `usePackage($package).withElements($)`. Callers must invoke `init` exactly
once and read the instance through `$`; the field is the identity other model fragments
reference.

| File | Purpose |
|---|---|
| `Boolean.java` | Declares PSM `BooleanType` named `"Boolean"`. Exports field `$` (`BooleanType`), `init(Package)`. No precision/length facets. |
| `Countries.java` | Declares `EnumerationType` named `"Countries"` with members `HU`=0, `AT`=1, `RO`=2, `SK`=3. Exports `$` (`EnumerationType`), `init(Package)`. Ordinals are positional and must stay stable — persisted instance data encodes the ordinal, not the name. |
| `Date.java` | Declares `DateType` named `"Date"` (date without time-of-day). Exports `$` (`DateType`), `init(Package)`. |
| `Double.java` | Declares `NumericType` named `"Double"` with `precision=15`, `scale=4`. Exports `$` (`NumericType`), `init(Package)`. Fixed-point, not IEEE binary float despite name. |
| `Email.java` | Declares `StringType` named `"Email"`, `maxLength=255`, constrained by an RFC-ish address `regExp`. Exports `$` (`StringType`), `init(Package)`. Pattern is anchored `^…$`; validators reject non-matching literals. |
| `Float.java` | Declares `NumericType` named `"Float"` with `precision=7`, `scale=4`. Exports `$` (`NumericType`), `init(Package)`. Narrower sibling of `Double`. |
| `Gps.java` | Declares `CustomType` named `"GPS"` — opaque type with no PSM-level facets, mapped by the runtime. Exports `$` (`CustomType`), `init(Package)`. Note the field class is `Gps` but the model name is uppercase `GPS`. |
| `Integer.java` | Declares `NumericType` named `"Integer"` with `precision=9` and no scale (integral). Exports `$` (`NumericType`), `init(Package)`. |
| `Long.java` | Declares `NumericType` named `"Long"` with `precision=18`, no scale. Exports `$` (`NumericType`), `init(Package)`. |
| `Measured.java` | Declares the nested `Package` named `"measured"` and attaches it via `withPackages($)`, not `withElements($)`. Exports `$` (`Package`), `init(Package)`. Members of `types/measured` must be initialised against this `$`, so `Measured.init` runs before them. |
| `Phone.java` | Declares `StringType` named `"Phone"`, `maxLength=20`, no pattern. Exports `$` (`StringType`), `init(Package)`. |
| `Photo.java` | Declares `BinaryType` named `"Photo"` restricted to mime type `image/*`. Exports `$` (`BinaryType`), `init(Package)`. No size cap declared. |
| `Priority.java` | Declares `EnumerationType` named `"Priority"` with members `NORMAL`=0, `URGENT`=1. Exports `$` (`EnumerationType`), `init(Package)`. Ordinals are the persisted form. |
| `String.java` | Declares `StringType` named `"String"`, `maxLength=255`. Exports `$` (`StringType`), `init(Package)`. Shadows `java.lang.String` inside this package — sibling fragments must qualify the JDK type. |
| `Text.java` | Declares `StringType` named `"Text"`, `maxLength=2000` — the long-form counterpart of `String`. Exports `$` (`StringType`), `init(Package)`. |
| `Time.java` | Declares `TimeType` named `"Time"` (time-of-day without date). Exports `$` (`TimeType`), `init(Package)`. |
| `TimeStamp.java` | Declares `TimestampType` named `"TimeStamp"` (date plus time). Exports `$` (`TimestampType`), `init(Package)`. |
| `Titles.java` | Declares `EnumerationType` named `"Titles"` with members `MS`=0, `MRS`=1, `MR`=2, `DR`=3. Exports `$` (`EnumerationType`), `init(Package)`. Ordinals are the persisted form. |
| `Url.java` | Declares `StringType` named `"URL"`, `maxLength=1024`, no pattern. Exports `$` (`StringType`), `init(Package)`. Class is `Url`, model name is uppercase `URL`. |
