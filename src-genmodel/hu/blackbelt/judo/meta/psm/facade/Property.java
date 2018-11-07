/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getReadDefinition <em>Read Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Property#getWriteDefinition <em>Write Definition</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property extends NamedElement {
    /**
     * Returns the value of the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' reference.
     * @see #setDataType(DataType)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_DataType()
     * @model required="true" derived="true"
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getDataType <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Read Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Definition</em>' containment reference.
     * @see #setReadDefinition(ReadProperty)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_ReadDefinition()
     * @model containment="true"
     * @generated
     */
    ReadProperty getReadDefinition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getReadDefinition <em>Read Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Definition</em>' containment reference.
     * @see #getReadDefinition()
     * @generated
     */
    void setReadDefinition(ReadProperty value);

    /**
     * Returns the value of the '<em><b>Write Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Write Definition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Write Definition</em>' containment reference.
     * @see #setWriteDefinition(WriteProperty)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getProperty_WriteDefinition()
     * @model containment="true"
     * @generated
     */
    WriteProperty getWriteDefinition();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Property#getWriteDefinition <em>Write Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Write Definition</em>' containment reference.
     * @see #getWriteDefinition()
     * @generated
     */
    void setWriteDefinition(WriteProperty value);

} // Property
