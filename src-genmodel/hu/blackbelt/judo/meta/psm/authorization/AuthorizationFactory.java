/**
 */
package hu.blackbelt.judo.meta.psm.authorization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage
 * @generated
 */
public interface AuthorizationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AuthorizationFactory eINSTANCE = hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Resource</em>'.
     * @generated
     */
    AuthorizationResource createAuthorizationResource();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AuthorizationPackage getAuthorizationPackage();

} //AuthorizationFactory
