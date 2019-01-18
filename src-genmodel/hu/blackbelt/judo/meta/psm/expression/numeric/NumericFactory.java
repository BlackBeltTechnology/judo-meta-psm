/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage
 * @generated
 */
public interface NumericFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NumericFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Count Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Count Expression</em>'.
     * @generated
     */
    CountExpression createCountExpression();

    /**
     * Returns a new object of class '<em>Integer Aritmetic Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Aritmetic Expression</em>'.
     * @generated
     */
    IntegerAritmeticExpression createIntegerAritmeticExpression();

    /**
     * Returns a new object of class '<em>Decimal Aritmetic Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Aritmetic Expression</em>'.
     * @generated
     */
    DecimalAritmeticExpression createDecimalAritmeticExpression();

    /**
     * Returns a new object of class '<em>Integer Opposite Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Opposite Expression</em>'.
     * @generated
     */
    IntegerOppositeExpression createIntegerOppositeExpression();

    /**
     * Returns a new object of class '<em>Decimal Opposite Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Opposite Expression</em>'.
     * @generated
     */
    DecimalOppositeExpression createDecimalOppositeExpression();

    /**
     * Returns a new object of class '<em>Integer Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Attribute</em>'.
     * @generated
     */
    IntegerAttribute createIntegerAttribute();

    /**
     * Returns a new object of class '<em>Decimal Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Attribute</em>'.
     * @generated
     */
    DecimalAttribute createDecimalAttribute();

    /**
     * Returns a new object of class '<em>Integer Aggregated Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Aggregated Expression</em>'.
     * @generated
     */
    IntegerAggregatedExpression createIntegerAggregatedExpression();

    /**
     * Returns a new object of class '<em>Integer Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Variable Reference</em>'.
     * @generated
     */
    IntegerVariableReference createIntegerVariableReference();

    /**
     * Returns a new object of class '<em>Decimal Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Variable Reference</em>'.
     * @generated
     */
    DecimalVariableReference createDecimalVariableReference();

    /**
     * Returns a new object of class '<em>Decimal Aggregated Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Aggregated Expression</em>'.
     * @generated
     */
    DecimalAggregatedExpression createDecimalAggregatedExpression();

    /**
     * Returns a new object of class '<em>Round Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Round Expression</em>'.
     * @generated
     */
    RoundExpression createRoundExpression();

    /**
     * Returns a new object of class '<em>Integer Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Switch Expression</em>'.
     * @generated
     */
    IntegerSwitchExpression createIntegerSwitchExpression();

    /**
     * Returns a new object of class '<em>Decimal Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Switch Expression</em>'.
     * @generated
     */
    DecimalSwitchExpression createDecimalSwitchExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    NumericPackage getNumericPackage();

} //NumericFactory
