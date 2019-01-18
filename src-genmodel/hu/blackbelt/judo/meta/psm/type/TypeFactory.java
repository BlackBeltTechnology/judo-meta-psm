/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TypeFactory eINSTANCE = hu.blackbelt.judo.meta.psm.type.impl.TypeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Custom Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Type</em>'.
     * @generated
     */
    CustomType createCustomType();

    /**
     * Returns a new object of class '<em>String Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Type</em>'.
     * @generated
     */
    StringType createStringType();

    /**
     * Returns a new object of class '<em>Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Numeric Type</em>'.
     * @generated
     */
    NumericType createNumericType();

    /**
     * Returns a new object of class '<em>Boolean Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Type</em>'.
     * @generated
     */
    BooleanType createBooleanType();

    /**
     * Returns a new object of class '<em>Enumeration Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Type</em>'.
     * @generated
     */
    EnumerationType createEnumerationType();

    /**
     * Returns a new object of class '<em>Enumeration Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Member</em>'.
     * @generated
     */
    EnumerationMember createEnumerationMember();

    /**
     * Returns a new object of class '<em>XML Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XML Type</em>'.
     * @generated
     */
    XMLType createXMLType();

    /**
     * Returns a new object of class '<em>Cardinality</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cardinality</em>'.
     * @generated
     */
    Cardinality createCardinality();

    /**
     * Returns a new object of class '<em>Password Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Password Type</em>'.
     * @generated
     */
    PasswordType createPasswordType();

    /**
     * Returns a new object of class '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Type</em>'.
     * @generated
     */
    DateType createDateType();

    /**
     * Returns a new object of class '<em>Timestamp Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timestamp Type</em>'.
     * @generated
     */
    TimestampType createTimestampType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
