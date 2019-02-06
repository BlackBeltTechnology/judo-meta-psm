/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage
 * @generated
 */
public interface TemporalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemporalFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Date Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Attribute</em>'.
	 * @generated
	 */
	DateAttribute createDateAttribute();

	/**
	 * Returns a new object of class '<em>Timestamp Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Attribute</em>'.
	 * @generated
	 */
	TimestampAttribute createTimestampAttribute();

	/**
	 * Returns a new object of class '<em>Date Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Switch Expression</em>'.
	 * @generated
	 */
	DateSwitchExpression createDateSwitchExpression();

	/**
	 * Returns a new object of class '<em>Timestamp Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Switch Expression</em>'.
	 * @generated
	 */
	TimestampSwitchExpression createTimestampSwitchExpression();

	/**
	 * Returns a new object of class '<em>Timestamp Addition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Addition Expression</em>'.
	 * @generated
	 */
	TimestampAdditionExpression createTimestampAdditionExpression();

	/**
	 * Returns a new object of class '<em>Timestamp Difference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Difference Expression</em>'.
	 * @generated
	 */
	TimestampDifferenceExpression createTimestampDifferenceExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemporalPackage getTemporalPackage();

} //TemporalFactory
