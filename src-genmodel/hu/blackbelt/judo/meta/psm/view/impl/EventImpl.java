/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.view.Action;
import hu.blackbelt.judo.meta.psm.view.Event;
import hu.blackbelt.judo.meta.psm.view.EventType;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.EventImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.EventImpl#getTriggered <em>Triggered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
    /**
     * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventType()
     * @generated
     * @ordered
     */
    protected static final EventType EVENT_TYPE_EDEFAULT = EventType.SYSTEM_CHANGED;

    /**
     * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventType()
     * @generated
     * @ordered
     */
    protected EventType eventType = EVENT_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getTriggered() <em>Triggered</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTriggered()
     * @generated
     * @ordered
     */
    protected Action triggered;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.EVENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventType(EventType newEventType) {
        EventType oldEventType = eventType;
        eventType = newEventType == null ? EVENT_TYPE_EDEFAULT : newEventType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.EVENT__EVENT_TYPE, oldEventType, eventType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Action getTriggered() {
        if (triggered != null && triggered.eIsProxy()) {
            InternalEObject oldTriggered = (InternalEObject)triggered;
            triggered = (Action)eResolveProxy(oldTriggered);
            if (triggered != oldTriggered) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.EVENT__TRIGGERED, oldTriggered, triggered));
            }
        }
        return triggered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Action basicGetTriggered() {
        return triggered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggered(Action newTriggered) {
        Action oldTriggered = triggered;
        triggered = newTriggered;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.EVENT__TRIGGERED, oldTriggered, triggered));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ViewPackage.EVENT__EVENT_TYPE:
                return getEventType();
            case ViewPackage.EVENT__TRIGGERED:
                if (resolve) return getTriggered();
                return basicGetTriggered();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ViewPackage.EVENT__EVENT_TYPE:
                setEventType((EventType)newValue);
                return;
            case ViewPackage.EVENT__TRIGGERED:
                setTriggered((Action)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ViewPackage.EVENT__EVENT_TYPE:
                setEventType(EVENT_TYPE_EDEFAULT);
                return;
            case ViewPackage.EVENT__TRIGGERED:
                setTriggered((Action)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ViewPackage.EVENT__EVENT_TYPE:
                return eventType != EVENT_TYPE_EDEFAULT;
            case ViewPackage.EVENT__TRIGGERED:
                return triggered != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (eventType: ");
        result.append(eventType);
        result.append(')');
        return result.toString();
    }

} //EventImpl
