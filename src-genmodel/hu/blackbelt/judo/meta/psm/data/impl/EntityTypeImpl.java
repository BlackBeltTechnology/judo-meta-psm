/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Endpoint;
import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getSuperEntityTypes <em>Super Entity Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeImpl extends NamedElementImpl implements EntityType {
    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * The cached value of the '{@link #getSuperEntityTypes() <em>Super Entity Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperEntityTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityType> superEntityTypes;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected boolean abstract_ = ABSTRACT_EDEFAULT;

    /**
     * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpoints()
     * @generated
     * @ordered
     */
    protected EList<Endpoint> endpoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.ENTITY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DataPackage.ENTITY_TYPE__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityType> getSuperEntityTypes() {
        if (superEntityTypes == null) {
            superEntityTypes = new EObjectResolvingEList<EntityType>(EntityType.class, this, DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES);
        }
        return superEntityTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAbstract() {
        return abstract_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstract(boolean newAbstract) {
        boolean oldAbstract = abstract_;
        abstract_ = newAbstract;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENTITY_TYPE__ABSTRACT, oldAbstract, abstract_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Endpoint> getEndpoints() {
        if (endpoints == null) {
            endpoints = new EObjectContainmentEList<Endpoint>(Endpoint.class, this, DataPackage.ENTITY_TYPE__ENDPOINTS);
        }
        return endpoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataPackage.ENTITY_TYPE__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case DataPackage.ENTITY_TYPE__ENDPOINTS:
                return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
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
            case DataPackage.ENTITY_TYPE__ATTRIBUTES:
                return getAttributes();
            case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
                return getSuperEntityTypes();
            case DataPackage.ENTITY_TYPE__ABSTRACT:
                return isAbstract();
            case DataPackage.ENTITY_TYPE__ENDPOINTS:
                return getEndpoints();
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
            case DataPackage.ENTITY_TYPE__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
                getSuperEntityTypes().clear();
                getSuperEntityTypes().addAll((Collection<? extends EntityType>)newValue);
                return;
            case DataPackage.ENTITY_TYPE__ABSTRACT:
                setAbstract((Boolean)newValue);
                return;
            case DataPackage.ENTITY_TYPE__ENDPOINTS:
                getEndpoints().clear();
                getEndpoints().addAll((Collection<? extends Endpoint>)newValue);
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
            case DataPackage.ENTITY_TYPE__ATTRIBUTES:
                getAttributes().clear();
                return;
            case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
                getSuperEntityTypes().clear();
                return;
            case DataPackage.ENTITY_TYPE__ABSTRACT:
                setAbstract(ABSTRACT_EDEFAULT);
                return;
            case DataPackage.ENTITY_TYPE__ENDPOINTS:
                getEndpoints().clear();
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
            case DataPackage.ENTITY_TYPE__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
                return superEntityTypes != null && !superEntityTypes.isEmpty();
            case DataPackage.ENTITY_TYPE__ABSTRACT:
                return abstract_ != ABSTRACT_EDEFAULT;
            case DataPackage.ENTITY_TYPE__ENDPOINTS:
                return endpoints != null && !endpoints.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (abstract: ");
        result.append(abstract_);
        result.append(')');
        return result.toString();
    }

} //EntityTypeImpl
