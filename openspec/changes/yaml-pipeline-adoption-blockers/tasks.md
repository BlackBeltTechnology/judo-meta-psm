## 1. Implementation

- [x] 1.1 Java rule: add `&& r.getTarget() == self.eContainer()` to `embeddedOnBothSidesAreNotAllowed()`
- [x] 1.2 EVL constraint: add `and r.target == self.eContainer()` to `EmbeddedOnBothSidesAreNotAllowed`
- [x] 1.3 Cycle / non-cycle tests (both engines, XMI reload, Northwind regression, consistency) in `PsmValidationParameterizedTest`
- [x] 1.4 Spec delta (`validation`) and `AGENTS.md` rows updated
