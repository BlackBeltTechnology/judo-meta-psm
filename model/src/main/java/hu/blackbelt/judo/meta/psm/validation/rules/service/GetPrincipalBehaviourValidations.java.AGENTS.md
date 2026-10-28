# `GetPrincipalBehaviourValidations.java`

Validates `GET_PRINCIPAL` operation behaviours. Exports `operationOfGetPrincipalBehaviourIsValid()`, `ownerOfGetPrincipalBehaviourIsValid()`, `relationOfGetPrincipalBehaviourIsUndefined()`, `getPrincipalOperationInputNameIsValid()`, `getPrincipalOperationOutputParameterIsDefined()`, `getPrincipalOperationOutputNameIsValid()`, `getPrincipalOperationOutputCardinalityIsValid()`.
Enforces unbound operation ownership, disallows relation targeting, and validates 1..1 output cardinality.