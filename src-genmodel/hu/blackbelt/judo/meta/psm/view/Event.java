/**
 */
package hu.blackbelt.judo.meta.psm.view;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Event#getEventType <em>Event Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Event#getTriggered <em>Triggered</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
    /**
     * Returns the value of the '<em><b>Event Type</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.view.EventType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Type</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.EventType
     * @see #setEventType(EventType)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getEvent_EventType()
     * @model required="true"
     * @generated
     */
    EventType getEventType();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Event#getEventType <em>Event Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Type</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.view.EventType
     * @see #getEventType()
     * @generated
     */
    void setEventType(EventType value);

    /**
     * Returns the value of the '<em><b>Triggered</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggered</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Triggered</em>' reference.
     * @see #setTriggered(Action)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getEvent_Triggered()
     * @model required="true"
     * @generated
     */
    Action getTriggered();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Event#getTriggered <em>Triggered</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triggered</em>' reference.
     * @see #getTriggered()
     * @generated
     */
    void setTriggered(Action value);

} // Event
