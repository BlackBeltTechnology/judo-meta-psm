package hu.blackbelt.judo.meta.psm.constraint.util.builder;

/**
 * <!-- begin-user-doc -->
 *   A facade for the builders for the EMF package ' <em><b>http://blackbelt.hu/judo/meta/psm/constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */

 public class ConstraintBuilders {
    public static final InvariantConstraintBuilder newInvariantConstraintBuilder() {
      return InvariantConstraintBuilder.create();
    }
    public static final InvariantConstraintBuilder newInvariantConstraintBuilder(boolean nullCheck) {
      return InvariantConstraintBuilder.create(nullCheck);
    }
    public static final InvariantConstraintBuilder useInvariantConstraint(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint instance) {
      return InvariantConstraintBuilder.use(instance);
    }
    public static final InvariantConstraintBuilder useInvariantConstraint(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint instance, boolean nullCheck) {
      return InvariantConstraintBuilder.use(instance, nullCheck);
    }
}
