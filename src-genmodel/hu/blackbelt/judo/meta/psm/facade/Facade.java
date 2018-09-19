/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getLinks <em>Links</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Facade#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade()
 * @model abstract="true"
 * @generated
 */
public interface Facade extends NamedElement {
    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Links</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.Link}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Links</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_Links()
     * @model containment="true"
     * @generated
     */
    EList<Link> getLinks();

    /**
     * Returns the value of the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Type</em>' reference.
     * @see #setEntityType(EntityType)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFacade_EntityType()
     * @model
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getEntityType <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

} // Facade
