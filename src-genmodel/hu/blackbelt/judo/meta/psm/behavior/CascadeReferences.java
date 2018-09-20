/**
 */
package hu.blackbelt.judo.meta.psm.behavior;

import hu.blackbelt.judo.meta.psm.data.Reference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cascade References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.behavior.CascadeReferences#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage#getCascadeReferences()
 * @model
 * @generated
 */
public interface CascadeReferences extends EObject {
    /**
     * Returns the value of the '<em><b>References</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.Reference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>References</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage#getCascadeReferences_References()
     * @model
     * @generated
     */
    EList<Reference> getReferences();

} // CascadeReferences
