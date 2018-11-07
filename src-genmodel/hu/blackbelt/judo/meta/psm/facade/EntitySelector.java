/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.EntitySelector#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getEntitySelector()
 * @model abstract="true"
 * @generated
 */
public interface EntitySelector extends NamedElement {
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
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getEntitySelector_EntityType()
     * @model required="true" derived="true"
     * @generated
     */
    EntityType getEntityType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.EntitySelector#getEntityType <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Type</em>' reference.
     * @see #getEntityType()
     * @generated
     */
    void setEntityType(EntityType value);

} // EntitySelector
