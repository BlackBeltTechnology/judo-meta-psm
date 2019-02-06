/**
 */
package hu.blackbelt.judo.meta.psm.authentication.impl;

import hu.blackbelt.judo.meta.psm.authentication.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthenticationFactoryImpl extends EFactoryImpl implements AuthenticationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthenticationFactory init() {
		try {
			AuthenticationFactory theAuthenticationFactory = (AuthenticationFactory)EPackage.Registry.INSTANCE.getEFactory(AuthenticationPackage.eNS_URI);
			if (theAuthenticationFactory != null) {
				return theAuthenticationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthenticationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AuthenticationPackage.PASSWORD_AUTHENTICATED_USER: return createPasswordAuthenticatedUser();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordAuthenticatedUser createPasswordAuthenticatedUser() {
		PasswordAuthenticatedUserImpl passwordAuthenticatedUser = new PasswordAuthenticatedUserImpl();
		return passwordAuthenticatedUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationPackage getAuthenticationPackage() {
		return (AuthenticationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthenticationPackage getPackage() {
		return AuthenticationPackage.eINSTANCE;
	}

} //AuthenticationFactoryImpl
