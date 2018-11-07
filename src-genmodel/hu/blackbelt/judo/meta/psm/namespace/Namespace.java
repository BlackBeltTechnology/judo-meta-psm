/**
 */
package hu.blackbelt.judo.meta.psm.namespace;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.EntitySelector;
import hu.blackbelt.judo.meta.psm.facade.PropertySet;
import hu.blackbelt.judo.meta.psm.facade.StandaloneFacade;

import hu.blackbelt.judo.meta.psm.type.DataType;

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
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getFacades <em>Facades</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getEntitySelectors <em>Entity Selectors</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getEntityTypes <em>Entity Types</em>}</li>
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
     * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.type.DataType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Types</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_DataTypes()
     * @model containment="true"
     * @generated
     */
    EList<DataType> getDataTypes();

    /**
     * Returns the value of the '<em><b>Facades</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.StandaloneFacade}.
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
    EList<StandaloneFacade> getFacades();

    /**
     * Returns the value of the '<em><b>Entity Selectors</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.EntitySelector}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Selectors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Selectors</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_EntitySelectors()
     * @model containment="true"
     * @generated
     */
    EList<EntitySelector> getEntitySelectors();

    /**
     * Returns the value of the '<em><b>Property Sets</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.PropertySet}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Sets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Sets</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamespacePackage#getNamespace_PropertySets()
     * @model containment="true"
     * @generated
     */
    EList<PropertySet> getPropertySets();

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

} // Namespace
