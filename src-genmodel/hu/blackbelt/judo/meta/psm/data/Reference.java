/**
 */
package hu.blackbelt.judo.meta.psm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends Cardinality {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(EntityType)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReference_Target()
     * @model required="true"
     * @generated
     */
    EntityType getTarget();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Reference#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(EntityType value);

} // Reference
