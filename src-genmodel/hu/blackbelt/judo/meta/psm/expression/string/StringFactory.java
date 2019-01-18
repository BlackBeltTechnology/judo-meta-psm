/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage
 * @generated
 */
public interface StringFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StringFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.string.impl.StringFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    StringAttribute createStringAttribute();

    /**
     * Returns a new object of class '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Reference</em>'.
     * @generated
     */
    StringVariableReference createStringVariableReference();

    /**
     * Returns a new object of class '<em>Concatenate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Concatenate</em>'.
     * @generated
     */
    Concatenate createConcatenate();

    /**
     * Returns a new object of class '<em>Lower Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lower Case</em>'.
     * @generated
     */
    LowerCase createLowerCase();

    /**
     * Returns a new object of class '<em>Upper Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Upper Case</em>'.
     * @generated
     */
    UpperCase createUpperCase();

    /**
     * Returns a new object of class '<em>Length</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Length</em>'.
     * @generated
     */
    Length createLength();

    /**
     * Returns a new object of class '<em>Sub String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub String</em>'.
     * @generated
     */
    SubString createSubString();

    /**
     * Returns a new object of class '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position</em>'.
     * @generated
     */
    Position createPosition();

    /**
     * Returns a new object of class '<em>Replace</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Replace</em>'.
     * @generated
     */
    Replace createReplace();

    /**
     * Returns a new object of class '<em>Trim</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trim</em>'.
     * @generated
     */
    Trim createTrim();

    /**
     * Returns a new object of class '<em>Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Expression</em>'.
     * @generated
     */
    StringSwitchExpression createStringSwitchExpression();

    /**
     * Returns a new object of class '<em>Concatenate Collection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Concatenate Collection</em>'.
     * @generated
     */
    ConcatenateCollection createConcatenateCollection();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    StringPackage getStringPackage();

} //StringFactory
