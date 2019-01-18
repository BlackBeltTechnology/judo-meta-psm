/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage
 * @generated
 */
public interface LogicalFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    LogicalFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalFactoryImpl.init();

    /**
     * Returns a new object of class '<em>String Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Comparison</em>'.
     * @generated
     */
    StringComparison createStringComparison();

    /**
     * Returns a new object of class '<em>Enumeration Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Comparison</em>'.
     * @generated
     */
    EnumerationComparison createEnumerationComparison();

    /**
     * Returns a new object of class '<em>Negation Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Negation Expression</em>'.
     * @generated
     */
    NegationExpression createNegationExpression();

    /**
     * Returns a new object of class '<em>Kleene Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Kleene Expression</em>'.
     * @generated
     */
    KleeneExpression createKleeneExpression();

    /**
     * Returns a new object of class '<em>Instance Of Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Of Expression</em>'.
     * @generated
     */
    InstanceOfExpression createInstanceOfExpression();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    LogicalAttribute createLogicalAttribute();

    /**
     * Returns a new object of class '<em>Undefined Attribute Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Undefined Attribute Comparison</em>'.
     * @generated
     */
    UndefinedAttributeComparison createUndefinedAttributeComparison();

    /**
     * Returns a new object of class '<em>Undefined Navigation Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Undefined Navigation Comparison</em>'.
     * @generated
     */
    UndefinedNavigationComparison createUndefinedNavigationComparison();

    /**
     * Returns a new object of class '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Reference</em>'.
     * @generated
     */
    LogicalVariableReference createLogicalVariableReference();

    /**
     * Returns a new object of class '<em>Contains Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Contains Expression</em>'.
     * @generated
     */
    ContainsExpression createContainsExpression();

    /**
     * Returns a new object of class '<em>Integer Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer Comparison</em>'.
     * @generated
     */
    IntegerComparison createIntegerComparison();

    /**
     * Returns a new object of class '<em>Decimal Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal Comparison</em>'.
     * @generated
     */
    DecimalComparison createDecimalComparison();

    /**
     * Returns a new object of class '<em>Object Comparison</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Comparison</em>'.
     * @generated
     */
    ObjectComparison createObjectComparison();

    /**
     * Returns a new object of class '<em>Member Of Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Member Of Expression</em>'.
     * @generated
     */
    MemberOfExpression createMemberOfExpression();

    /**
     * Returns a new object of class '<em>Type Of Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Of Expression</em>'.
     * @generated
     */
    TypeOfExpression createTypeOfExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    LogicalPackage getLogicalPackage();

} //LogicalFactory
