/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.service.Operation;

import hu.blackbelt.judo.meta.psm.view.ActionMenuItem;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Menu Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ActionMenuItemImpl#getExposedService <em>Exposed Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionMenuItemImpl extends MenuItemImpl implements ActionMenuItem {
    /**
     * The cached value of the '{@link #getExposedService() <em>Exposed Service</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExposedService()
     * @generated
     * @ordered
     */
    protected Operation exposedService;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionMenuItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.ACTION_MENU_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getExposedService() {
        if (exposedService != null && exposedService.eIsProxy()) {
            InternalEObject oldExposedService = (InternalEObject)exposedService;
            exposedService = (Operation)eResolveProxy(oldExposedService);
            if (exposedService != oldExposedService) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.ACTION_MENU_ITEM__EXPOSED_SERVICE, oldExposedService, exposedService));
            }
        }
        return exposedService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetExposedService() {
        return exposedService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExposedService(Operation newExposedService) {
        Operation oldExposedService = exposedService;
        exposedService = newExposedService;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.ACTION_MENU_ITEM__EXPOSED_SERVICE, oldExposedService, exposedService));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ViewPackage.ACTION_MENU_ITEM__EXPOSED_SERVICE:
                if (resolve) return getExposedService();
                return basicGetExposedService();
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
            case ViewPackage.ACTION_MENU_ITEM__EXPOSED_SERVICE:
                setExposedService((Operation)newValue);
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
            case ViewPackage.ACTION_MENU_ITEM__EXPOSED_SERVICE:
                setExposedService((Operation)null);
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
            case ViewPackage.ACTION_MENU_ITEM__EXPOSED_SERVICE:
                return exposedService != null;
        }
        return super.eIsSet(featureID);
    }

} //ActionMenuItemImpl
