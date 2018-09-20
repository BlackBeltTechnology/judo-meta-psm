/**
 */
package hu.blackbelt.judo.meta.psm.namespace;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.Facade;

import hu.blackbelt.judo.meta.psm.type.Type;

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
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getPackages <em>Packages</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getTypes <em>Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getFacades <em>Facades</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
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

    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.type.Type}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_Types()
     * @model containment="true"
     * @generated
     */
    EList<Type> getTypes();

    /**
     * Returns the value of the '<em><b>Entity Types</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.EntityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Types</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_EntityTypes()
     * @model containment="true"
     * @generated
     */
    EList<EntityType> getEntityTypes();

    /**
     * Returns the value of the '<em><b>Facades</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.Facade}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Facades</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Facades</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_Facades()
     * @model containment="true"
     * @generated
     */
    EList<Facade> getFacades();

} // Namespace
