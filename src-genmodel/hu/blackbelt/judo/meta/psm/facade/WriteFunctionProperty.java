/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Function Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty#getWriteOperation <em>Write Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getWriteFunctionProperty()
 * @model
 * @generated
 */
public interface WriteFunctionProperty extends WriteProperty {
    /**
     * Returns the value of the '<em><b>Write Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Write Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Write Operation</em>' attribute.
     * @see #setWriteOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getWriteFunctionProperty_WriteOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getWriteOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty#getWriteOperation <em>Write Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Write Operation</em>' attribute.
     * @see #getWriteOperation()
     * @generated
     */
    void setWriteOperation(String value);

} // WriteFunctionProperty
