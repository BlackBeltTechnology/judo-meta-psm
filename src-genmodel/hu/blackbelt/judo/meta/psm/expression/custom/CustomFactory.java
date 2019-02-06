/**
 */
package hu.blackbelt.judo.meta.psm.expression.custom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomPackage
 * @generated
 */
public interface CustomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	CustomAttribute createCustomAttribute();

	/**
	 * Returns a new object of class '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Expression</em>'.
	 * @generated
	 */
	CustomSwitchExpression createCustomSwitchExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CustomPackage getCustomPackage();

} //CustomFactory
