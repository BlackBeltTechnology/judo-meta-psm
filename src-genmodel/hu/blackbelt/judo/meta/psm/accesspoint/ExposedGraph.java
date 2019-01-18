/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposed Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getSelector <em>Selector</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getEntryTransferObject <em>Entry Transfer Object</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getExposedGraph()
 * @model
 * @generated
 */
public interface ExposedGraph extends NamedElement {
    /**
     * Returns the value of the '<em><b>Selector</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selector</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selector</em>' reference.
     * @see #setSelector(StaticNavigation)
     * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getExposedGraph_Selector()
     * @model required="true"
     * @generated
     */
    StaticNavigation getSelector();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getSelector <em>Selector</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector(StaticNavigation value);

    /**
     * Returns the value of the '<em><b>Entry Transfer Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry Transfer Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry Transfer Object</em>' reference.
     * @see #setEntryTransferObject(MappedTransferObjectType)
     * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getExposedGraph_EntryTransferObject()
     * @model required="true"
     * @generated
     */
    MappedTransferObjectType getEntryTransferObject();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getEntryTransferObject <em>Entry Transfer Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry Transfer Object</em>' reference.
     * @see #getEntryTransferObject()
     * @generated
     */
    void setEntryTransferObject(MappedTransferObjectType value);

} // ExposedGraph
