/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.Facade;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.Link;
import hu.blackbelt.judo.meta.psm.facade.Property;

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
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FacadeImpl extends NamedElementImpl implements Facade {
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
     * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinks()
     * @generated
     * @ordered
     */
    protected EList<Link> links;

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
    protected FacadeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.FACADE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, FacadePackage.FACADE__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getLinks() {
        if (links == null) {
            links = new EObjectContainmentEList<Link>(Link.class, this, FacadePackage.FACADE__LINKS);
        }
        return links;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.FACADE__ENTITY_TYPE, oldEntityType, entityType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__ENTITY_TYPE, oldEntityType, entityType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FacadePackage.FACADE__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case FacadePackage.FACADE__LINKS:
                return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
            case FacadePackage.FACADE__PROPERTIES:
                return getProperties();
            case FacadePackage.FACADE__LINKS:
                return getLinks();
            case FacadePackage.FACADE__ENTITY_TYPE:
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
            case FacadePackage.FACADE__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case FacadePackage.FACADE__LINKS:
                getLinks().clear();
                getLinks().addAll((Collection<? extends Link>)newValue);
                return;
            case FacadePackage.FACADE__ENTITY_TYPE:
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
            case FacadePackage.FACADE__PROPERTIES:
                getProperties().clear();
                return;
            case FacadePackage.FACADE__LINKS:
                getLinks().clear();
                return;
            case FacadePackage.FACADE__ENTITY_TYPE:
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
            case FacadePackage.FACADE__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case FacadePackage.FACADE__LINKS:
                return links != null && !links.isEmpty();
            case FacadePackage.FACADE__ENTITY_TYPE:
                return entityType != null;
        }
        return super.eIsSet(featureID);
    }

} //FacadeImpl
