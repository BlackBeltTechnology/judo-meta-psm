/**
 */
package hu.blackbelt.judo.meta.psm.authentication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage
 * @generated
 */
public interface AuthenticationFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AuthenticationFactory eINSTANCE = hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Password Authenticated User</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Password Authenticated User</em>'.
     * @generated
     */
    PasswordAuthenticatedUser createPasswordAuthenticatedUser();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AuthenticationPackage getAuthenticationPackage();

} //AuthenticationFactory
