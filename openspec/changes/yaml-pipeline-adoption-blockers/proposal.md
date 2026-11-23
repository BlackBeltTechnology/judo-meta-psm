## Why

`EmbeddedOnBothSidesAreNotAllowed` (Java `TransferObjectRelationValidations.embeddedOnBothSidesAreNotAllowed()` and EVL `transferObjectRelation.evl`) reports a "Circular aggregation" whenever the target transfer object has an embedded relation bound to the partner end — even when that reverse relation targets a *different* transfer object of the same entity (rackinspect shape). That is a false positive: no embedding cycle exists.

## What Changes

- Java rule and EVL constraint additionally require the reverse relation to target the container of the checked relation (`r.getTarget() == self.eContainer()` / `r.target == self.eContainer()`). Identity comparison; message unchanged.
- `PsmValidationParameterizedTest` gains cycle / non-cycle scenarios run on both engines, in-code and after an XMI save/reload, plus a Northwind regression and an EVL/Java consistency check.

## Capabilities

### New Capabilities

### Modified Capabilities
- `validation`: the embedded-cycle constraint reports only real cycles

## Impact

- `model` module: `TransferObjectRelationValidations.java`, `transferObjectRelation.evl`.
- `model-test` module: `PsmValidationParameterizedTest.java`.
- Behaviour: models that previously failed with a false "Circular aggregation found on relation" now pass; true two-sided and self-association cycles still fail. Compatible; rollback = revert the two one-line conditions. Part of superproject feature `yaml-pipeline-adoption-blockers` (JNG-6445).
