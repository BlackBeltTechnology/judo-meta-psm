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
     * Returns a new object of class '<em>Custom</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom</em>'.
     * @generated
     */
    Custom createCustom();

    /**
     * Returns a new object of class '<em>String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String</em>'.
     * @generated
     */
    String createString();

    /**
     * Returns a new object of class '<em>Numeric</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Numeric</em>'.
     * @generated
     */
    Numeric createNumeric();

    /**
     * Returns a new object of class '<em>Boolean</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean</em>'.
     * @generated
     */
    Boolean createBoolean();

    /**
     * Returns a new object of class '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration</em>'.
     * @generated
     */
    Enumeration createEnumeration();

    /**
     * Returns a new object of class '<em>Member</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Member</em>'.
     * @generated
     */
    Member createMember();

    /**
     * Returns a new object of class '<em>XML</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XML</em>'.
     * @generated
     */
    XML createXML();

    /**
     * Returns a new object of class '<em>Complex Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Complex Type</em>'.
     * @generated
     */
    ComplexType createComplexType();

    /**
     * Returns a new object of class '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element</em>'.
     * @generated
     */
    Element createElement();

    /**
     * Returns a new object of class '<em>Cardinality</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cardinality</em>'.
     * @generated
     */
    Cardinality createCardinality();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TypePackage getTypePackage();

} //TypeFactory
