# `PsmTestModelBuilder.java`

918 lines — read at signature level (contract R5). Test-only fluent factory that
produces a complete PSM `Model` in memory, so a validation or expression test never
needs a `.judo-psm` file on disk.

**What the constructor pre-builds**

A `Model` named `demo` with packages `entities`, `services`, `_default_transferobjecttypes`,
`types`, `measures` and `measured`. It registers the northwind primitives into a
`dataTypes` map keyed by plain names — `String`, `Text`, `Integer`, `Double`, `Boolean`,
`Date`, `Timestamp`, `Time`, `Long`, `Country`, `Gps` — plus measured types
`MassStoredInKilograms`, `MassStoredInGrams`, `MassIntegerKg`, and a `Time` measure with
`day`/`minute`/`second`/`millisecond` `DurationUnit`s exposed as `DurationInDays` and
`DurationInMinutes`.

**Exports**

- `addEntity(name)` → `ScriptTestEntityBuilder`; `getEntity(name)`, `getEntityFromTO(name)` → `Optional`.
- `addMappedTransferObject(toName, entityName)` / `getMappedTransferObject(name)` /
  `getMappedTransferObjectsFromEntity(name)`; `addUnmappedTransferObject(toName)` /
  `getUnmappedTransferObject(name)`.
- `addActorType(name, toName, entityName)` → `ScriptTestActorTypeBuilder`.
- `addBoundOperation(type, name)`, `addUnboundOperation(...)` in four overloads (name only; type+name;
  name+body+returnType(+`Cardinality`)), `getUnboundOperation(name)`.
- `setTwoWayRelation(entity, reference, target, targetReference)`.
- `build()` → `Model`.
- static nested `Cardinality` with `cardinality(int min, int max)` and `create()` producing a PSM
  `hu.blackbelt.judo.meta.psm.type.Cardinality`.
- marker interface `ScriptTestBuilders`, implemented by `ScriptTestEntityBuilder`,
  `ScriptTestMappedTransferObjectBuilder`, `ScriptTestUnmappedTransferObjectBuilder`,
  `ScriptTestActorTypeBuilder`; abstract `ScriptTestOperationBuilder` with
  `ScriptTestUnboundOperationBuilder` / `ScriptTestBoundOperationBuilder` subclasses.
- element builders: `withAttribute`, `withIdentifier`, `withProperty`, `withRelation`,
  `withContainment`, `withAggregation`, `withSuperType`, `withStaticData`, `withStaticNavigation`,
  `withInput`, `withOutput`, `withBody`.

**Contracts a caller can violate**

- Nothing is wired until `build()`. `build()` runs two passes — first `emptyBuild()` on every staged
  builder to create the bare typed elements, then a second pass to attach features — so a test that
  inspects the model before `build()` sees empty entities and unresolved cross-references.
- Type names passed to `withAttribute` / `withProperty` / operation return types must be keys of the
  preloaded `dataTypes` map; an unknown name has no registered primitive behind it.
- Relation/containment targets are resolved by entity name, so the target entity must have been added
  via `addEntity` before `build()`.
- Every `addEntity` also stages a default `MappedTransferObjectType` into the `entities` package of
  `_default_transferobjecttypes`; `getEntityFromTO` relies on that pairing.
- `setTwoWayRelation` is applied during `build()` by matching relation names on the named entity —
  a misspelled `reference` silently leaves the relation one-way instead of failing.
- Builders are instance-inner classes bound to this model instance; they cannot be reused across two
  `PsmTestModelBuilder` instances.
