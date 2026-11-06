# AGENTS.md — `model/src/main/epsilon/validations/accesspoint`

EVL validation constraints and aggregator for accesspoint transfer object actor types.

| File | Purpose |
| --- | --- |
| `_importAccesspoint.evl` | Aggregates accesspoint EVL rules. Imports `actorType.evl`. |
| `actorType.evl` | Validates actor type mapping on transfer objects. Defines `ActorTypeIsMapped` ensuring `PSM!MappedTransferObjectType` references `PSM!MappedActorType`, and `ActorTypeIsUnmapped` ensuring `PSM!UnmappedTransferObjectType` references `PSM!ActorType`. |
