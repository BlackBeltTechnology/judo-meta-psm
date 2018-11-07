/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standalone Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.StandaloneFacade#getEntitySelector <em>Entity Selector</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getStandaloneFacade()
 * @model
 * @generated
 */
public interface StandaloneFacade extends Facade {
    /**
     * Returns the value of the '<em><b>Entity Selector</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entity Selector</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity Selector</em>' reference.
     * @see #setEntitySelector(EntitySelector)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getStandaloneFacade_EntitySelector()
     * @model required="true"
     * @generated
     */
    EntitySelector getEntitySelector();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.StandaloneFacade#getEntitySelector <em>Entity Selector</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity Selector</em>' reference.
     * @see #getEntitySelector()
     * @generated
     */
    void setEntitySelector(EntitySelector value);

} // StandaloneFacade
