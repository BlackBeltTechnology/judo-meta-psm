# AGENTS.md — `model/src/main/epsilon/validations/data`

EVL validation constraints and aggregator for PSM entity data structures, associations, operations, and sequences.

| File | Purpose |
| --- | --- |
| `_importData.evl` | Aggregates data-layer EVL validations. Imports rules for associations, attributes, operations, cardinalities, sequences, entities, and invariant constraints. |
| `associationEnd.evl` | Validates `PSM!AssociationEnd` topology and bounds. Defines `CascadeDeleteOnlyAllowedIfUpperCardinalityIsOne`, `PartnerIsNotSelf`, `OppositePartnerIsDefined`, `ValidPartnerRelations`, `ValidPartnerType`, and critique `AtLeastOneReferenceInBidirectionalAssociationHasZeroLowerBound`. |
| `attribute.evl` | Validates `PSM!Attribute` uniqueness in entity hierarchy. Defines `InheritedAndOwnAttributeNameIsUniqueInEntityType` ensuring attribute names do not collide with inherited container members. |
| `boundOperation.evl` | Validates `PSM!BoundOperation` inheritance and override contracts. Defines `AbstractOperationIsValid`, `AbstractOperationHasNoImplementation`, `InstanceRepresentationMatchesOwnerEntityType`, `OverridingWithValidParameters`, `ImplementationOfAbstractOperationIsStateful`, and `StatefulFlagIsValid`. |
| `cardinality.evl` | Enforces multiplicity bounds on `PSM!Cardinality`. Defines `CardinalityLowerIsGreaterThanOrEqualToZero`, `CardinalityLowerMustBeLessOrEqualToUpper`, and `CardinalityUpperIsAtLeastOne`. |
| `entitySequence.evl` | Validates `PSM!EntitySequence` naming. Defines `InheritedAndOwnSequenceNameIsUniqueInEntityType` ensuring entity sequence names do not collide with inherited features. |
| `entityType.evl` | Validates `PSM!EntityType` inheritance graphs, member collisions, and abstract operation completion. Defines `EntityTypeNamesAreUnique`, `InheritanceIsNotRecursive`, `InheritedOperationsAreValid`, `EntityTypeMustBeAbstractIfAnOperationIsAbstract`, and override collision rules. |
| `invariantConstraint.evl` | Validates `PSM!InvariantConstraint` naming in entity types. Defines `InheritedAndOwnInvariantConstraintNameIsUniqueInEntityType` preventing name collisions with inherited elements. |
| `relation.evl` | Validates `PSM!Relation` naming in entity types. Defines `InheritedAndOwnRelationNameIsUniqueInEntityType` preventing name collisions with inherited elements. |
| `sequence.evl` | Validates `PSM!Sequence` numeric configuration. Defines `ValidInitialValue` (`initialValue >= 0`), `ValidIncrement` (`increment > 0`), and `ValidMaximumValue` (`maximumValue >= initialValue + increment`). |
