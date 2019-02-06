/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage
 * @generated
 */
public interface ConstantFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstantFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Constant</em>'.
	 * @generated
	 */
	IntegerConstant createIntegerConstant();

	/**
	 * Returns a new object of class '<em>Decimal Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Constant</em>'.
	 * @generated
	 */
	DecimalConstant createDecimalConstant();

	/**
	 * Returns a new object of class '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Constant</em>'.
	 * @generated
	 */
	BooleanConstant createBooleanConstant();

	/**
	 * Returns a new object of class '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant</em>'.
	 * @generated
	 */
	StringConstant createStringConstant();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Custom Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Data</em>'.
	 * @generated
	 */
	CustomData createCustomData();

	/**
	 * Returns a new object of class '<em>Measured Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measured Decimal</em>'.
	 * @generated
	 */
	MeasuredDecimal createMeasuredDecimal();

	/**
	 * Returns a new object of class '<em>Measured Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measured Integer</em>'.
	 * @generated
	 */
	MeasuredInteger createMeasuredInteger();

	/**
	 * Returns a new object of class '<em>Date Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Constant</em>'.
	 * @generated
	 */
	DateConstant createDateConstant();

	/**
	 * Returns a new object of class '<em>Timestamp Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Constant</em>'.
	 * @generated
	 */
	TimestampConstant createTimestampConstant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstantPackage getConstantPackage();

} //ConstantFactory
