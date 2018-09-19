/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Structure#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends DataType {
    /**
     * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.type.Field}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fields</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getStructure_Fields()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Field> getFields();

} // Structure
