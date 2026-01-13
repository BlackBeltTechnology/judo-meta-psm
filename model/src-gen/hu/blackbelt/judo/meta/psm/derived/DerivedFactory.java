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
public interface DerivedFactory extends EFactory
{
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
	 * Returns a new object of class '<em>Reference Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Expression Type</em>'.
	 * @generated
	 */
	ReferenceExpressionType createReferenceExpressionType();

	/**
	 * Returns a new object of class '<em>Reference Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Selector Type</em>'.
	 * @generated
	 */
	ReferenceSelectorType createReferenceSelectorType();

	/**
	 * Returns a new object of class '<em>Data Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Expression Type</em>'.
	 * @generated
	 */
	DataExpressionType createDataExpressionType();

	/**
	 * Returns a new object of class '<em>Attribute Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Selector Type</em>'.
	 * @generated
	 */
	AttributeSelectorType createAttributeSelectorType();

	/**
	 * Returns a new object of class '<em>Logical Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Expression Type</em>'.
	 * @generated
	 */
	LogicalExpressionType createLogicalExpressionType();

	/**
	 * Returns an instance of data type '<em>Expression Dialect</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ExpressionDialect createExpressionDialect(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Expression Dialect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertExpressionDialect(ExpressionDialect instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DerivedPackage getDerivedPackage();

} //DerivedFactory
