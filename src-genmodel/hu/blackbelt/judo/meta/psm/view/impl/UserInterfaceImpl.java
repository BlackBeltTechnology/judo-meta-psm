/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceElementImpl;

import hu.blackbelt.judo.meta.psm.view.ObjectView;
import hu.blackbelt.judo.meta.psm.view.UserInterface;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.UserInterfaceImpl#getMainView <em>Main View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.UserInterfaceImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfaceImpl extends NamespaceElementImpl implements UserInterface {
    /**
     * The cached value of the '{@link #getMainView() <em>Main View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainView()
     * @generated
     * @ordered
     */
    protected ObjectView mainView;

    /**
     * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected StaticNavigation selector;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UserInterfaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.USER_INTERFACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView getMainView() {
        if (mainView != null && mainView.eIsProxy()) {
            InternalEObject oldMainView = (InternalEObject)mainView;
            mainView = (ObjectView)eResolveProxy(oldMainView);
            if (mainView != oldMainView) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.USER_INTERFACE__MAIN_VIEW, oldMainView, mainView));
            }
        }
        return mainView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView basicGetMainView() {
        return mainView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMainView(ObjectView newMainView) {
        ObjectView oldMainView = mainView;
        mainView = newMainView;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.USER_INTERFACE__MAIN_VIEW, oldMainView, mainView));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticNavigation getSelector() {
        return selector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSelector(StaticNavigation newSelector, NotificationChain msgs) {
        StaticNavigation oldSelector = selector;
        selector = newSelector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewPackage.USER_INTERFACE__SELECTOR, oldSelector, newSelector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelector(StaticNavigation newSelector) {
        if (newSelector != selector) {
            NotificationChain msgs = null;
            if (selector != null)
                msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewPackage.USER_INTERFACE__SELECTOR, null, msgs);
            if (newSelector != null)
                msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewPackage.USER_INTERFACE__SELECTOR, null, msgs);
            msgs = basicSetSelector(newSelector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.USER_INTERFACE__SELECTOR, newSelector, newSelector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ViewPackage.USER_INTERFACE__SELECTOR:
                return basicSetSelector(null, msgs);
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
            case ViewPackage.USER_INTERFACE__MAIN_VIEW:
                if (resolve) return getMainView();
                return basicGetMainView();
            case ViewPackage.USER_INTERFACE__SELECTOR:
                return getSelector();
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
            case ViewPackage.USER_INTERFACE__MAIN_VIEW:
                setMainView((ObjectView)newValue);
                return;
            case ViewPackage.USER_INTERFACE__SELECTOR:
                setSelector((StaticNavigation)newValue);
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
            case ViewPackage.USER_INTERFACE__MAIN_VIEW:
                setMainView((ObjectView)null);
                return;
            case ViewPackage.USER_INTERFACE__SELECTOR:
                setSelector((StaticNavigation)null);
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
            case ViewPackage.USER_INTERFACE__MAIN_VIEW:
                return mainView != null;
            case ViewPackage.USER_INTERFACE__SELECTOR:
                return selector != null;
        }
        return super.eIsSet(featureID);
    }

} //UserInterfaceImpl
