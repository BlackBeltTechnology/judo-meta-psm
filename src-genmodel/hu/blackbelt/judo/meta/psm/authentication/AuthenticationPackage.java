/**
 */
package hu.blackbelt.judo.meta.psm.authentication;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticationFactory
 * @model kind="package"
 * @generated
 */
public interface AuthenticationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "authentication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/authentication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "authentication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthenticationPackage eINSTANCE = hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticatedUserImpl <em>Authenticated User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticatedUserImpl
	 * @see hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl#getAuthenticatedUser()
	 * @generated
	 */
	int AUTHENTICATED_USER = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATED_USER__USER = 0;

	/**
	 * The number of structural features of the '<em>Authenticated User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATED_USER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authenticated User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATED_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.authentication.impl.PasswordAuthenticatedUserImpl <em>Password Authenticated User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.authentication.impl.PasswordAuthenticatedUserImpl
	 * @see hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl#getPasswordAuthenticatedUser()
	 * @generated
	 */
	int PASSWORD_AUTHENTICATED_USER = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_AUTHENTICATED_USER__USER = AUTHENTICATED_USER__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_AUTHENTICATED_USER__PASSWORD = AUTHENTICATED_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_AUTHENTICATED_USER__LOGIN = AUTHENTICATED_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Password Authenticated User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_AUTHENTICATED_USER_FEATURE_COUNT = AUTHENTICATED_USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Password Authenticated User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_AUTHENTICATED_USER_OPERATION_COUNT = AUTHENTICATED_USER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser <em>Password Authenticated User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Authenticated User</em>'.
	 * @see hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser
	 * @generated
	 */
	EClass getPasswordAuthenticatedUser();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Password</em>'.
	 * @see hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getPassword()
	 * @see #getPasswordAuthenticatedUser()
	 * @generated
	 */
	EReference getPasswordAuthenticatedUser_Password();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login</em>'.
	 * @see hu.blackbelt.judo.meta.psm.authentication.PasswordAuthenticatedUser#getLogin()
	 * @see #getPasswordAuthenticatedUser()
	 * @generated
	 */
	EReference getPasswordAuthenticatedUser_Login();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.authentication.AuthenticatedUser <em>Authenticated User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authenticated User</em>'.
	 * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticatedUser
	 * @generated
	 */
	EClass getAuthenticatedUser();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.authentication.AuthenticatedUser#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see hu.blackbelt.judo.meta.psm.authentication.AuthenticatedUser#getUser()
	 * @see #getAuthenticatedUser()
	 * @generated
	 */
	EReference getAuthenticatedUser_User();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthenticationFactory getAuthenticationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.authentication.impl.PasswordAuthenticatedUserImpl <em>Password Authenticated User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.authentication.impl.PasswordAuthenticatedUserImpl
		 * @see hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl#getPasswordAuthenticatedUser()
		 * @generated
		 */
		EClass PASSWORD_AUTHENTICATED_USER = eINSTANCE.getPasswordAuthenticatedUser();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSWORD_AUTHENTICATED_USER__PASSWORD = eINSTANCE.getPasswordAuthenticatedUser_Password();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSWORD_AUTHENTICATED_USER__LOGIN = eINSTANCE.getPasswordAuthenticatedUser_Login();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticatedUserImpl <em>Authenticated User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticatedUserImpl
		 * @see hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl#getAuthenticatedUser()
		 * @generated
		 */
		EClass AUTHENTICATED_USER = eINSTANCE.getAuthenticatedUser();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATED_USER__USER = eINSTANCE.getAuthenticatedUser_User();

	}

} //AuthenticationPackage
