/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage
 * @generated
 */
public interface DerivedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DerivedFactory eINSTANCE = hu.blackbelt.judo.meta.psm.derived.impl.DerivedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property</em>'.
	 * @generated
	 */
	DataProperty createDataProperty();

	/**
	 * Returns a new object of class '<em>Navigation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Property</em>'.
	 * @generated
	 */
	NavigationProperty createNavigationProperty();

	/**
	 * Returns a new object of class '<em>Static Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Navigation</em>'.
	 * @generated
	 */
	StaticNavigation createStaticNavigation();

	/**
	 * Returns a new object of class '<em>Static Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Data</em>'.
	 * @generated
	 */
	StaticData createStaticData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DerivedPackage getDerivedPackage();

} //DerivedFactory
