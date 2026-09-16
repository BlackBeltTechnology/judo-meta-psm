# AGENTS.md — `northwind-model/src/main/java/hu/blackbelt/model/northwind/extension/services`

Transfer object types supporting extended service input parameters for the Northwind model.

| File | Purpose |
| --- | --- |
| `GetRangeInputProductInfoCategory.java` | Defines unmapped transfer object type `_GetRangeInputProductInfoCategory`. Exports `init(Package, ProductInfo)`. Sets up embedded `owner` relation targeting `ProductInfo` with `0..1` cardinality for `GET_RANGE` range queries. |
