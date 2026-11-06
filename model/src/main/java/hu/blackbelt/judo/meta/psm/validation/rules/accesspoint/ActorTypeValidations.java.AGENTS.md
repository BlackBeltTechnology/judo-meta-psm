# `ActorTypeValidations.java`

Java port of `validations/accesspoint/actorType.evl`. Nested `@ValidationContext` rule sets: `MappedTransferObjectActorTypeValidations.actorTypeIsMapped()` fails when `MappedTransferObjectType.actorType` is not a `MappedActorType`; `UnmappedTransferObjectActorTypeValidations.actorTypeIsUnmapped()` fails on a `MappedActorType`.
Both pass on null `actorType`; register the nested classes, not the outer.