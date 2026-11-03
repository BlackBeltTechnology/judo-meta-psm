# AGENTS.md — `model/src/main/epsilon/validations/service`

EVL validation constraints and aggregator for PSM transfer objects, service operations, behaviours, parameters, and bindings.

| File | Purpose |
| --- | --- |
| `_importService.evl` | Aggregates service-layer EVL validations. Imports rules for transfer operations, mapped objects, attributes, relations, behaviours, and parameters. |
| `boundBehaviour.evl` | Validates `PSM!TransferOperationBehaviour` relation-bound operations (list, create, validate create, reference mutations). Defines `OwnerOfBoundBehaviourIsRelation`, `OwnerOfBoundBehaviourIsValid`, and `CreateTargetIsNotAbstract`. |
| `boundTransferOperation.evl` | Validates `PSM!BoundTransferOperation` binding compatibility. Defines `OwnerIsMappedTransferObjectType`, `BindingIsValid`, and `ParametersAreValid` ensuring signature matches bound entity operation. |
| `getPrincipalBehaviour.evl` | Validates `GET_PRINCIPAL` operation behaviours; defines `OperationOfGetPrincipalBehaviourIsValid` plus owner/relation/input/output name, type and cardinality rules. → see `getPrincipalBehaviour.evl.AGENTS.md` |
| `getRangeBehaviour.evl` | Validates `GET_RANGE` transfer operation behaviours. Defines `OwnerIsRelationOrOperationUnboundBehaviourGetRange`, `OwnerIsValidGetRangeBehaviour`, `OperationOwnerIsValidGetRange`, `GetRangeBehaviourInputParameterIsDefined`, `GetRangeBehaviourInputNameIsValid`, and `GetRangeBehaviourInputCardinalityIsValid`. |
| `getTemplateBehaviour.evl` | Validates `GET_TEMPLATE` transfer operation behaviours. Defines `OperationOfGetTemplateBehaviourIsValid`, `OwnerOfGetTemplateBehaviourIsValid`, and `RelationOfGetTemplateBehaviourIsUndefined`. |
| `mappedTransferObjectType.evl` | Validates complete feature mappings on creatable transfer objects. Defines `AllRequiredFeaturesHaveBindingIfCreatable` ensuring mapped types used in create operations do not exclude required entity features. |
| `parameter.evl` | Validates service operation parameter constraints. Defines `FaultCardinalityIsValid` requiring fault parameters to have exact cardinality 1..1. |
| `transferAttribute.evl` | Validates transfer attribute bindings to underlying entity features. Defines `DataTypeMatchesBindingDataType`, `RequiredFlagMatchesBindingRequiredFlag`, and `TransferAttributeBindingIsValid`. |
| `transferObjectRelation.evl` | Validates transfer object relation bindings and embedding rules. Defines `TargetMatchesBindingTarget`, `CardinalityMatchesBindingCardinality`, `TransferObjectRelationIsEmbedded`, and `TransferObjectRelationBindingIsValid`. |
| `transferObjectType.evl` | Validates transfer object type naming. Defines critique `TransferObjectTypeNamesAreUnique` across all transfer object types in the model. |
| `unboundOperation.evl` | Validates unbound transfer operations. Defines `BehaviourOrImplementationIsRequired` and `InitOperationCannotHaveInput` requiring initializers to have no input parameter. |
