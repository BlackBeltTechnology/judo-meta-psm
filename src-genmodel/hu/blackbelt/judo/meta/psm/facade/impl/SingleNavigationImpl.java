/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.BindSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.SingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.TraverseSingleNavigation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.SingleNavigationImpl#getTraverseDefinition <em>Traverse Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.SingleNavigationImpl#getBindDefinition <em>Bind Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleNavigationImpl extends NavigationImpl implements SingleNavigation {
    /**
     * The cached value of the '{@link #getTraverseDefinition() <em>Traverse Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraverseDefinition()
     * @generated
     * @ordered
     */
    protected TraverseSingleNavigation traverseDefinition;

    /**
     * The cached value of the '{@link #getBindDefinition() <em>Bind Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindDefinition()
     * @generated
     * @ordered
     */
    protected BindSingleNavigation bindDefinition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SingleNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.SINGLE_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TraverseSingleNavigation getTraverseDefinition() {
        return traverseDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTraverseDefinition(TraverseSingleNavigation newTraverseDefinition, NotificationChain msgs) {
        TraverseSingleNavigation oldTraverseDefinition = traverseDefinition;
        traverseDefinition = newTraverseDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION, oldTraverseDefinition, newTraverseDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTraverseDefinition(TraverseSingleNavigation newTraverseDefinition) {
        if (newTraverseDefinition != traverseDefinition) {
            NotificationChain msgs = null;
            if (traverseDefinition != null)
                msgs = ((InternalEObject)traverseDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION, null, msgs);
            if (newTraverseDefinition != null)
                msgs = ((InternalEObject)newTraverseDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION, null, msgs);
            msgs = basicSetTraverseDefinition(newTraverseDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION, newTraverseDefinition, newTraverseDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BindSingleNavigation getBindDefinition() {
        return bindDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBindDefinition(BindSingleNavigation newBindDefinition, NotificationChain msgs) {
        BindSingleNavigation oldBindDefinition = bindDefinition;
        bindDefinition = newBindDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION, oldBindDefinition, newBindDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindDefinition(BindSingleNavigation newBindDefinition) {
        if (newBindDefinition != bindDefinition) {
            NotificationChain msgs = null;
            if (bindDefinition != null)
                msgs = ((InternalEObject)bindDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION, null, msgs);
            if (newBindDefinition != null)
                msgs = ((InternalEObject)newBindDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION, null, msgs);
            msgs = basicSetBindDefinition(newBindDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION, newBindDefinition, newBindDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION:
                return basicSetTraverseDefinition(null, msgs);
            case FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION:
                return basicSetBindDefinition(null, msgs);
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
            case FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION:
                return getTraverseDefinition();
            case FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION:
                return getBindDefinition();
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
            case FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION:
                setTraverseDefinition((TraverseSingleNavigation)newValue);
                return;
            case FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION:
                setBindDefinition((BindSingleNavigation)newValue);
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
            case FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION:
                setTraverseDefinition((TraverseSingleNavigation)null);
                return;
            case FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION:
                setBindDefinition((BindSingleNavigation)null);
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
            case FacadePackage.SINGLE_NAVIGATION__TRAVERSE_DEFINITION:
                return traverseDefinition != null;
            case FacadePackage.SINGLE_NAVIGATION__BIND_DEFINITION:
                return bindDefinition != null;
        }
        return super.eIsSet(featureID);
    }

} //SingleNavigationImpl
