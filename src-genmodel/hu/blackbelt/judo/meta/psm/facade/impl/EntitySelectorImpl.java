/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.EntitySelector;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySelectorImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntitySelectorImpl extends NamedElementImpl implements EntitySelector {
    /**
     * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityType()
     * @generated
     * @ordered
     */
    protected EntityType entityType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntitySelectorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.ENTITY_SELECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getEntityType() {
        if (entityType != null && entityType.eIsProxy()) {
            InternalEObject oldEntityType = (InternalEObject)entityType;
            entityType = (EntityType)eResolveProxy(oldEntityType);
            if (entityType != oldEntityType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.ENTITY_SELECTOR__ENTITY_TYPE, oldEntityType, entityType));
            }
        }
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType basicGetEntityType() {
        return entityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntityType(EntityType newEntityType) {
        EntityType oldEntityType = entityType;
        entityType = newEntityType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ENTITY_SELECTOR__ENTITY_TYPE, oldEntityType, entityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.ENTITY_SELECTOR__ENTITY_TYPE:
                if (resolve) return getEntityType();
                return basicGetEntityType();
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
            case FacadePackage.ENTITY_SELECTOR__ENTITY_TYPE:
                setEntityType((EntityType)newValue);
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
            case FacadePackage.ENTITY_SELECTOR__ENTITY_TYPE:
                setEntityType((EntityType)null);
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
            case FacadePackage.ENTITY_SELECTOR__ENTITY_TYPE:
                return entityType != null;
        }
        return super.eIsSet(featureID);
    }

} //EntitySelectorImpl
