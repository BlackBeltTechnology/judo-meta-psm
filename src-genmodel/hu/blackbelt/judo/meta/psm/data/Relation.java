/**
 */
package hu.blackbelt.judo.meta.psm.data;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Relation#isCascadeDelete <em>Cascade Delete</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends ReferenceTypedElement {
    /**
     * Returns the value of the '<em><b>Cascade Delete</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cascade Delete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cascade Delete</em>' attribute.
     * @see #setCascadeDelete(boolean)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getRelation_CascadeDelete()
     * @model default="false" required="true"
     * @generated
     */
    boolean isCascadeDelete();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Relation#isCascadeDelete <em>Cascade Delete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cascade Delete</em>' attribute.
     * @see #isCascadeDelete()
     * @generated
     */
    void setCascadeDelete(boolean value);

} // Relation
