/**
 */
package hu.blackbelt.judo.meta.psm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.PsmPackage
 * @generated
 */
public interface PsmFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsmFactory eINSTANCE = hu.blackbelt.judo.meta.psm.impl.PsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Place Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Holder</em>'.
	 * @generated
	 */
	PlaceHolder createPlaceHolder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PsmPackage getPsmPackage();

} //PsmFactory
