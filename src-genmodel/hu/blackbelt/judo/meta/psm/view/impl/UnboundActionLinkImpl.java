/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.view.ObjectView;
import hu.blackbelt.judo.meta.psm.view.UnboundActionLink;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unbound Action Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.UnboundActionLinkImpl#getActionView <em>Action View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnboundActionLinkImpl extends ComponentImpl implements UnboundActionLink {
    /**
     * The cached value of the '{@link #getActionView() <em>Action View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionView()
     * @generated
     * @ordered
     */
    protected ObjectView actionView;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnboundActionLinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.UNBOUND_ACTION_LINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView getActionView() {
        if (actionView != null && actionView.eIsProxy()) {
            InternalEObject oldActionView = (InternalEObject)actionView;
            actionView = (ObjectView)eResolveProxy(oldActionView);
            if (actionView != oldActionView) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.UNBOUND_ACTION_LINK__ACTION_VIEW, oldActionView, actionView));
            }
        }
        return actionView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView basicGetActionView() {
        return actionView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setActionView(ObjectView newActionView) {
        ObjectView oldActionView = actionView;
        actionView = newActionView;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.UNBOUND_ACTION_LINK__ACTION_VIEW, oldActionView, actionView));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ViewPackage.UNBOUND_ACTION_LINK__ACTION_VIEW:
                if (resolve) return getActionView();
                return basicGetActionView();
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
            case ViewPackage.UNBOUND_ACTION_LINK__ACTION_VIEW:
                setActionView((ObjectView)newValue);
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
            case ViewPackage.UNBOUND_ACTION_LINK__ACTION_VIEW:
                setActionView((ObjectView)null);
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
            case ViewPackage.UNBOUND_ACTION_LINK__ACTION_VIEW:
                return actionView != null;
        }
        return super.eIsSet(featureID);
    }

} //UnboundActionLinkImpl
