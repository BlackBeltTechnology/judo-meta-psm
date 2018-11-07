/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.EntitySelector;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.StandaloneFacade;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standalone Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.StandaloneFacadeImpl#getEntitySelector <em>Entity Selector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandaloneFacadeImpl extends FacadeImpl implements StandaloneFacade {
    /**
     * The cached value of the '{@link #getEntitySelector() <em>Entity Selector</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntitySelector()
     * @generated
     * @ordered
     */
    protected EntitySelector entitySelector;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StandaloneFacadeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.STANDALONE_FACADE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntitySelector getEntitySelector() {
        if (entitySelector != null && entitySelector.eIsProxy()) {
            InternalEObject oldEntitySelector = (InternalEObject)entitySelector;
            entitySelector = (EntitySelector)eResolveProxy(oldEntitySelector);
            if (entitySelector != oldEntitySelector) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.STANDALONE_FACADE__ENTITY_SELECTOR, oldEntitySelector, entitySelector));
            }
        }
        return entitySelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntitySelector basicGetEntitySelector() {
        return entitySelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntitySelector(EntitySelector newEntitySelector) {
        EntitySelector oldEntitySelector = entitySelector;
        entitySelector = newEntitySelector;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.STANDALONE_FACADE__ENTITY_SELECTOR, oldEntitySelector, entitySelector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.STANDALONE_FACADE__ENTITY_SELECTOR:
                if (resolve) return getEntitySelector();
                return basicGetEntitySelector();
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
            case FacadePackage.STANDALONE_FACADE__ENTITY_SELECTOR:
                setEntitySelector((EntitySelector)newValue);
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
            case FacadePackage.STANDALONE_FACADE__ENTITY_SELECTOR:
                setEntitySelector((EntitySelector)null);
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
            case FacadePackage.STANDALONE_FACADE__ENTITY_SELECTOR:
                return entitySelector != null;
        }
        return super.eIsSet(featureID);
    }

} //StandaloneFacadeImpl
