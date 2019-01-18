/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.service.UnboundOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exposed Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedService#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getExposedService()
 * @model
 * @generated
 */
public interface ExposedService extends NamedElement {
    /**
     * Returns the value of the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' reference.
     * @see #setOperation(UnboundOperation)
     * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getExposedService_Operation()
     * @model required="true"
     * @generated
     */
    UnboundOperation getOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedService#getOperation <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(UnboundOperation value);

} // ExposedService
