/**
 */
package hu.blackbelt.judo.meta.psm.authorization.impl;

import hu.blackbelt.judo.meta.psm.authorization.*;

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
public class AuthorizationFactoryImpl extends EFactoryImpl implements AuthorizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthorizationFactory init() {
		try {
			AuthorizationFactory theAuthorizationFactory = (AuthorizationFactory)EPackage.Registry.INSTANCE.getEFactory(AuthorizationPackage.eNS_URI);
			if (theAuthorizationFactory != null) {
				return theAuthorizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthorizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationFactoryImpl() {
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
			case AuthorizationPackage.AUTHORIZATION_RESOURCE: return createAuthorizationResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationResource createAuthorizationResource() {
		AuthorizationResourceImpl authorizationResource = new AuthorizationResourceImpl();
		return authorizationResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPackage getAuthorizationPackage() {
		return (AuthorizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthorizationPackage getPackage() {
		return AuthorizationPackage.eINSTANCE;
	}

} //AuthorizationFactoryImpl
