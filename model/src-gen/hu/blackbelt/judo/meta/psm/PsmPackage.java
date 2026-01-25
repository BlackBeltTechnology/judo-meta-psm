/**
 */
package hu.blackbelt.judo.meta.psm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see hu.blackbelt.judo.meta.psm.PsmFactory
 * @model kind="package"
 * @generated
 */
public interface PsmPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsmPackage eINSTANCE = hu.blackbelt.judo.meta.psm.impl.PsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.impl.PlaceHolderImpl <em>Place Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.impl.PlaceHolderImpl
	 * @see hu.blackbelt.judo.meta.psm.impl.PsmPackageImpl#getPlaceHolder()
	 * @generated
	 */
	int PLACE_HOLDER = 0;

	/**
	 * The number of structural features of the '<em>Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Place Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.PlaceHolder <em>Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Holder</em>'.
	 * @see hu.blackbelt.judo.meta.psm.PlaceHolder
	 * @generated
	 */
	EClass getPlaceHolder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PsmFactory getPsmFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.impl.PlaceHolderImpl <em>Place Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.impl.PlaceHolderImpl
		 * @see hu.blackbelt.judo.meta.psm.impl.PsmPackageImpl#getPlaceHolder()
		 * @generated
		 */
		EClass PLACE_HOLDER = eINSTANCE.getPlaceHolder();

	}

} //PsmPackage
