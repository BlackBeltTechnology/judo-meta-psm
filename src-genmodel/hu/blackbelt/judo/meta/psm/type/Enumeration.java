/**
 */
package hu.blackbelt.judo.meta.psm.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.Enumeration#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Primitive {
    /**
     * Returns the value of the '<em><b>Members</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.type.Member}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Members</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.type.TypePackage#getEnumeration_Members()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Member> getMembers();

} // Enumeration
