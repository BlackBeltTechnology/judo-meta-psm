# AGENTS.md — `northwind-model/src/main/java/hu/blackbelt/model/northwind`

Bootstrap classes, top-level packages, actor access points, and demo runner for the Northwind PSM model.

| File | Purpose |
| --- | --- |
| `Demo.java` | Main demo runner assembling the Northwind PSM model tree. Exports `fullDemo()`, `main(String[])`. Instantiates entities, packages, actor types, services, and validates output via `validatePsm()` and Epsilon scripts before serialization. |
| `Entities.java` | Package definition for entities. Exports `init(Model)`. Creates package named `entities` and links it into the model root. |
| `Extension.java` | Package definition for extension types. Exports `init(Model)`. Creates package named `_extension` and registers it in the target model. |
| `ExternalAP.java` | Defines the unmapped transfer object type `externalAP`. Exports `init(Model, String)`. Registers email attribute and associates element with target model. |
| `ExternalUser.java` | Defines actor type `ExternalUser` with operations. Exports `init(Model, ExternalAP, ProductInfo, CategoryInfo)`. Binds relations for categories and products, configuring principal, list, and create operations. |
| `InternalAP.java` | Defines the unmapped transfer object type `internalAP`. Exports `init(Model, String)`. Registers email attribute and attaches object type to the target model. |
| `InternalUser.java` | Defines actor type `InternalUser` with operations. Exports `init(Model, ...)`. Binds relations for shippers, international orders, and order listings with corresponding transfer operations. |
| `Measures.java` | Package definition for measures. Exports `init(Model)`. Scaffolds package named `measures` and attaches it to the model root. |
| `Optional.java` | Package definition for optional transfer object types. Exports `init(Model)`. Configures package named `_optional_transferobjecttypes` and attaches it to the model. |
| `Services.java` | Package definition for service components. Exports `init(Model)`. Configures package named `services` and attaches it to the model root. |
| `Types.java` | Package definition for fundamental types. Exports `init(Model)`. Scaffolds package named `types` and registers it in the target model. |
