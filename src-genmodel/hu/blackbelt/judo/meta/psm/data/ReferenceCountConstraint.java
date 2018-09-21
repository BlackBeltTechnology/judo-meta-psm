/**
 */
package hu.blackbelt.judo.meta.psm.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Count Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReferenceCountConstraint()
 * @model
 * @generated
 */
public interface ReferenceCountConstraint extends Cardinality {
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
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReferenceCountConstraint_References()
     * @model required="true"
     * @generated
     */
    EList<Reference> getReferences();

} // ReferenceCountConstraint
