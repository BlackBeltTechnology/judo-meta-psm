/**
 */
package hu.blackbelt.judo.meta.psm.constraint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage
 * @generated
 */
public interface ConstraintFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConstraintFactory eINSTANCE = hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Invariant Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Invariant Constraint</em>'.
     * @generated
     */
    InvariantConstraint createInvariantConstraint();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ConstraintPackage getConstraintPackage();

} //ConstraintFactory
