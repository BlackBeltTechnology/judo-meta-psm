/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.Navigation;
import hu.blackbelt.judo.meta.psm.facade.Property;
import hu.blackbelt.judo.meta.psm.facade.PropertySet;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl#getNavigationProperties <em>Navigation Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertySetImpl extends NamedElementImpl implements PropertySet {
    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The cached value of the '{@link #getNavigationProperties() <em>Navigation Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNavigationProperties()
     * @generated
     * @ordered
     */
    protected EList<Navigation> navigationProperties;

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
    protected PropertySetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.PROPERTY_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, FacadePackage.PROPERTY_SET__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Navigation> getNavigationProperties() {
        if (navigationProperties == null) {
            navigationProperties = new EObjectContainmentEList<Navigation>(Navigation.class, this, FacadePackage.PROPERTY_SET__NAVIGATION_PROPERTIES);
        }
        return navigationProperties;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.PROPERTY_SET__ENTITY_TYPE, oldEntityType, entityType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY_SET__ENTITY_TYPE, oldEntityType, entityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FacadePackage.PROPERTY_SET__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case FacadePackage.PROPERTY_SET__NAVIGATION_PROPERTIES:
                return ((InternalEList<?>)getNavigationProperties()).basicRemove(otherEnd, msgs);
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
            case FacadePackage.PROPERTY_SET__PROPERTIES:
                return getProperties();
            case FacadePackage.PROPERTY_SET__NAVIGATION_PROPERTIES:
                return getNavigationProperties();
            case FacadePackage.PROPERTY_SET__ENTITY_TYPE:
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
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FacadePackage.PROPERTY_SET__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case FacadePackage.PROPERTY_SET__NAVIGATION_PROPERTIES:
                getNavigationProperties().clear();
                getNavigationProperties().addAll((Collection<? extends Navigation>)newValue);
                return;
            case FacadePackage.PROPERTY_SET__ENTITY_TYPE:
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
            case FacadePackage.PROPERTY_SET__PROPERTIES:
                getProperties().clear();
                return;
            case FacadePackage.PROPERTY_SET__NAVIGATION_PROPERTIES:
                getNavigationProperties().clear();
                return;
            case FacadePackage.PROPERTY_SET__ENTITY_TYPE:
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
            case FacadePackage.PROPERTY_SET__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case FacadePackage.PROPERTY_SET__NAVIGATION_PROPERTIES:
                return navigationProperties != null && !navigationProperties.isEmpty();
            case FacadePackage.PROPERTY_SET__ENTITY_TYPE:
                return entityType != null;
        }
        return super.eIsSet(featureID);
    }

} //PropertySetImpl
