## ADDED Requirements

### Requirement: Embedded cycle rule reports only real cycles
The `EmbeddedOnBothSidesAreNotAllowed` constraint SHALL report a `TransferObjectRelation` only when the relation is embedded, bound to an `AssociationEnd` with a partner, and its target transfer object has an embedded relation that is bound to that partner end AND targets the container of the checked relation. The Java rule and the EVL constraint SHALL produce identical results, also for a model saved to XMI and reloaded.

#### Scenario: True two-sided embedded cycle is reported
- **GIVEN** `T1.r1` embedded to `T2` and `T2.r2` embedded to `T1`, bound to partner ends
- **WHEN** the model is validated with the Java rule or the EVL constraint
- **THEN** both `r1` and `r2` are reported as `EmbeddedOnBothSidesAreNotAllowed`

#### Scenario: Self-association cycle is reported
- **GIVEN** `T1.r1` and `T1.r2` both embedded to `T1`, bound to the two ends of a self-association
- **WHEN** the model is validated
- **THEN** both relations are reported

#### Scenario: Reverse relation targets a different transfer object
- **GIVEN** `RackType.rackElement` embedded to `RackElement`, and `RackElement.rackType` embedded, bound to the partner end, targeting a different transfer object `RackTypeForRackElement`
- **WHEN** the model is validated with either engine, in code or after an XMI save/reload
- **THEN** no `EmbeddedOnBothSidesAreNotAllowed` error is reported

#### Scenario: Reverse relation is not embedded or is bound to another association
- **GIVEN** a reverse relation targeting the container that is either not embedded, or embedded but bound to an end of a different association
- **WHEN** the model is validated with either engine
- **THEN** no error is reported
