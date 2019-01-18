/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.service.TransferRelation;

import hu.blackbelt.judo.meta.psm.view.Navigation;
import hu.blackbelt.judo.meta.psm.view.ObjectView;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl#getNavigationView <em>Navigation View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl#getRangeView <em>Range View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl#getTransferRelation <em>Transfer Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NavigationImpl extends ComponentImpl implements Navigation {
    /**
     * The cached value of the '{@link #getNavigationView() <em>Navigation View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNavigationView()
     * @generated
     * @ordered
     */
    protected ObjectView navigationView;

    /**
     * The cached value of the '{@link #getRangeView() <em>Range View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRangeView()
     * @generated
     * @ordered
     */
    protected ObjectView rangeView;

    /**
     * The cached value of the '{@link #getTransferRelation() <em>Transfer Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransferRelation()
     * @generated
     * @ordered
     */
    protected TransferRelation transferRelation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView getNavigationView() {
        if (navigationView != null && navigationView.eIsProxy()) {
            InternalEObject oldNavigationView = (InternalEObject)navigationView;
            navigationView = (ObjectView)eResolveProxy(oldNavigationView);
            if (navigationView != oldNavigationView) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.NAVIGATION__NAVIGATION_VIEW, oldNavigationView, navigationView));
            }
        }
        return navigationView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView basicGetNavigationView() {
        return navigationView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNavigationView(ObjectView newNavigationView) {
        ObjectView oldNavigationView = navigationView;
        navigationView = newNavigationView;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.NAVIGATION__NAVIGATION_VIEW, oldNavigationView, navigationView));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView getRangeView() {
        if (rangeView != null && rangeView.eIsProxy()) {
            InternalEObject oldRangeView = (InternalEObject)rangeView;
            rangeView = (ObjectView)eResolveProxy(oldRangeView);
            if (rangeView != oldRangeView) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.NAVIGATION__RANGE_VIEW, oldRangeView, rangeView));
            }
        }
        return rangeView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView basicGetRangeView() {
        return rangeView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRangeView(ObjectView newRangeView) {
        ObjectView oldRangeView = rangeView;
        rangeView = newRangeView;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.NAVIGATION__RANGE_VIEW, oldRangeView, rangeView));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransferRelation getTransferRelation() {
        if (transferRelation != null && transferRelation.eIsProxy()) {
            InternalEObject oldTransferRelation = (InternalEObject)transferRelation;
            transferRelation = (TransferRelation)eResolveProxy(oldTransferRelation);
            if (transferRelation != oldTransferRelation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.NAVIGATION__TRANSFER_RELATION, oldTransferRelation, transferRelation));
            }
        }
        return transferRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransferRelation basicGetTransferRelation() {
        return transferRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransferRelation(TransferRelation newTransferRelation) {
        TransferRelation oldTransferRelation = transferRelation;
        transferRelation = newTransferRelation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.NAVIGATION__TRANSFER_RELATION, oldTransferRelation, transferRelation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ViewPackage.NAVIGATION__NAVIGATION_VIEW:
                if (resolve) return getNavigationView();
                return basicGetNavigationView();
            case ViewPackage.NAVIGATION__RANGE_VIEW:
                if (resolve) return getRangeView();
                return basicGetRangeView();
            case ViewPackage.NAVIGATION__TRANSFER_RELATION:
                if (resolve) return getTransferRelation();
                return basicGetTransferRelation();
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
            case ViewPackage.NAVIGATION__NAVIGATION_VIEW:
                setNavigationView((ObjectView)newValue);
                return;
            case ViewPackage.NAVIGATION__RANGE_VIEW:
                setRangeView((ObjectView)newValue);
                return;
            case ViewPackage.NAVIGATION__TRANSFER_RELATION:
                setTransferRelation((TransferRelation)newValue);
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
            case ViewPackage.NAVIGATION__NAVIGATION_VIEW:
                setNavigationView((ObjectView)null);
                return;
            case ViewPackage.NAVIGATION__RANGE_VIEW:
                setRangeView((ObjectView)null);
                return;
            case ViewPackage.NAVIGATION__TRANSFER_RELATION:
                setTransferRelation((TransferRelation)null);
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
            case ViewPackage.NAVIGATION__NAVIGATION_VIEW:
                return navigationView != null;
            case ViewPackage.NAVIGATION__RANGE_VIEW:
                return rangeView != null;
            case ViewPackage.NAVIGATION__TRANSFER_RELATION:
                return transferRelation != null;
        }
        return super.eIsSet(featureID);
    }

} //NavigationImpl
