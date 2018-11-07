/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Function Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty#getReadFunction <em>Read Function</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getReadFunctionProperty()
 * @model
 * @generated
 */
public interface ReadFunctionProperty extends ReadProperty {
    /**
     * Returns the value of the '<em><b>Read Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Read Function</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Read Function</em>' attribute.
     * @see #setReadFunction(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getReadFunctionProperty_ReadFunction()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getReadFunction();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty#getReadFunction <em>Read Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Read Function</em>' attribute.
     * @see #getReadFunction()
     * @generated
     */
    void setReadFunction(String value);

} // ReadFunctionProperty
