/**
 */
package hu.blackbelt.judo.meta.psm.namespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.namespace.NamespaceElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_Elements()
     * @model containment="true"
     * @generated
     */
    EList<NamespaceElement> getElements();

    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.namespace.Package}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_Packages()
     * @model containment="true"
     * @generated
     */
    EList<hu.blackbelt.judo.meta.psm.namespace.Package> getPackages();

} // Namespace
