/**
 */
package hu.blackbelt.judo.meta.psm.behavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage
 * @generated
 */
public interface BehaviorFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    BehaviorFactory eINSTANCE = hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Cascade References</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cascade References</em>'.
     * @generated
     */
    CascadeReferences createCascadeReferences();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    BehaviorPackage getBehaviorPackage();

} //BehaviorFactory
