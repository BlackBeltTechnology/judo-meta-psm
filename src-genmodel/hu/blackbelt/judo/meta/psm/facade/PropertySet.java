/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getNavigationProperties <em>Navigation Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getPropertySet()
 * @model
 * @generated
 */
public interface PropertySet extends NamedElement {
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
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getPropertySet_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Navigation Properties</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.facade.Navigation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Navigation Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Navigation Properties</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getPropertySet_NavigationProperties()
     * @model containment="true"
     * @generated
     */
    EList<Navigation> getNavigationProperties();

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
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getPropertySet_EntityType()
     * @model required="true" derived="true"
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getEntityType <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

} // PropertySet
