/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.AttachListNavigation;
import hu.blackbelt.judo.meta.psm.facade.DetachListNavigation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.ListNavigation;
import hu.blackbelt.judo.meta.psm.facade.TraverseListNavigation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl#getTraverseDefinition <em>Traverse Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl#getAttachDefinition <em>Attach Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl#getDetachNavigation <em>Detach Navigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListNavigationImpl extends NavigationImpl implements ListNavigation {
    /**
     * The cached value of the '{@link #getTraverseDefinition() <em>Traverse Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraverseDefinition()
     * @generated
     * @ordered
     */
    protected TraverseListNavigation traverseDefinition;

    /**
     * The cached value of the '{@link #getAttachDefinition() <em>Attach Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachDefinition()
     * @generated
     * @ordered
     */
    protected AttachListNavigation attachDefinition;

    /**
     * The cached value of the '{@link #getDetachNavigation() <em>Detach Navigation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetachNavigation()
     * @generated
     * @ordered
     */
    protected DetachListNavigation detachNavigation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ListNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.LIST_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TraverseListNavigation getTraverseDefinition() {
        return traverseDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTraverseDefinition(TraverseListNavigation newTraverseDefinition, NotificationChain msgs) {
        TraverseListNavigation oldTraverseDefinition = traverseDefinition;
        traverseDefinition = newTraverseDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION, oldTraverseDefinition, newTraverseDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTraverseDefinition(TraverseListNavigation newTraverseDefinition) {
        if (newTraverseDefinition != traverseDefinition) {
            NotificationChain msgs = null;
            if (traverseDefinition != null)
                msgs = ((InternalEObject)traverseDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION, null, msgs);
            if (newTraverseDefinition != null)
                msgs = ((InternalEObject)newTraverseDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION, null, msgs);
            msgs = basicSetTraverseDefinition(newTraverseDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION, newTraverseDefinition, newTraverseDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttachListNavigation getAttachDefinition() {
        return attachDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttachDefinition(AttachListNavigation newAttachDefinition, NotificationChain msgs) {
        AttachListNavigation oldAttachDefinition = attachDefinition;
        attachDefinition = newAttachDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION, oldAttachDefinition, newAttachDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttachDefinition(AttachListNavigation newAttachDefinition) {
        if (newAttachDefinition != attachDefinition) {
            NotificationChain msgs = null;
            if (attachDefinition != null)
                msgs = ((InternalEObject)attachDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION, null, msgs);
            if (newAttachDefinition != null)
                msgs = ((InternalEObject)newAttachDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION, null, msgs);
            msgs = basicSetAttachDefinition(newAttachDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION, newAttachDefinition, newAttachDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DetachListNavigation getDetachNavigation() {
        return detachNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDetachNavigation(DetachListNavigation newDetachNavigation, NotificationChain msgs) {
        DetachListNavigation oldDetachNavigation = detachNavigation;
        detachNavigation = newDetachNavigation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION, oldDetachNavigation, newDetachNavigation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDetachNavigation(DetachListNavigation newDetachNavigation) {
        if (newDetachNavigation != detachNavigation) {
            NotificationChain msgs = null;
            if (detachNavigation != null)
                msgs = ((InternalEObject)detachNavigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION, null, msgs);
            if (newDetachNavigation != null)
                msgs = ((InternalEObject)newDetachNavigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION, null, msgs);
            msgs = basicSetDetachNavigation(newDetachNavigation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION, newDetachNavigation, newDetachNavigation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION:
                return basicSetTraverseDefinition(null, msgs);
            case FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION:
                return basicSetAttachDefinition(null, msgs);
            case FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION:
                return basicSetDetachNavigation(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION:
                return getTraverseDefinition();
            case FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION:
                return getAttachDefinition();
            case FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION:
                return getDetachNavigation();
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
            case FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION:
                setTraverseDefinition((TraverseListNavigation)newValue);
                return;
            case FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION:
                setAttachDefinition((AttachListNavigation)newValue);
                return;
            case FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION:
                setDetachNavigation((DetachListNavigation)newValue);
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
            case FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION:
                setTraverseDefinition((TraverseListNavigation)null);
                return;
            case FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION:
                setAttachDefinition((AttachListNavigation)null);
                return;
            case FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION:
                setDetachNavigation((DetachListNavigation)null);
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
            case FacadePackage.LIST_NAVIGATION__TRAVERSE_DEFINITION:
                return traverseDefinition != null;
            case FacadePackage.LIST_NAVIGATION__ATTACH_DEFINITION:
                return attachDefinition != null;
            case FacadePackage.LIST_NAVIGATION__DETACH_NAVIGATION:
                return detachNavigation != null;
        }
        return super.eIsSet(featureID);
    }

} //ListNavigationImpl
