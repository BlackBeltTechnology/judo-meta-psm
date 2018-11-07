/**
 */
package hu.blackbelt.judo.meta.psm.namespace.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.EntitySelector;
import hu.blackbelt.judo.meta.psm.facade.PropertySet;
import hu.blackbelt.judo.meta.psm.facade.StandaloneFacade;

import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.DataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getFacades <em>Facades</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getEntitySelectors <em>Entity Selectors</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getPropertySets <em>Property Sets</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getEntityTypes <em>Entity Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
    /**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
    protected EList<hu.blackbelt.judo.meta.psm.namespace.Package> packages;

    /**
     * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataTypes()
     * @generated
     * @ordered
     */
    protected EList<DataType> dataTypes;

    /**
     * The cached value of the '{@link #getFacades() <em>Facades</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFacades()
     * @generated
     * @ordered
     */
    protected EList<StandaloneFacade> facades;

    /**
     * The cached value of the '{@link #getEntitySelectors() <em>Entity Selectors</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntitySelectors()
     * @generated
     * @ordered
     */
    protected EList<EntitySelector> entitySelectors;

    /**
     * The cached value of the '{@link #getPropertySets() <em>Property Sets</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertySets()
     * @generated
     * @ordered
     */
    protected EList<PropertySet> propertySets;

    /**
     * The cached value of the '{@link #getEntityTypes() <em>Entity Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntityTypes()
     * @generated
     * @ordered
     */
    protected EList<EntityType> entityTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamespaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NamespacePackage.Literals.NAMESPACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<hu.blackbelt.judo.meta.psm.namespace.Package> getPackages() {
        if (packages == null) {
            packages = new EObjectContainmentEList<hu.blackbelt.judo.meta.psm.namespace.Package>(hu.blackbelt.judo.meta.psm.namespace.Package.class, this, NamespacePackage.NAMESPACE__PACKAGES);
        }
        return packages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataType> getDataTypes() {
        if (dataTypes == null) {
            dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, NamespacePackage.NAMESPACE__DATA_TYPES);
        }
        return dataTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StandaloneFacade> getFacades() {
        if (facades == null) {
            facades = new EObjectContainmentEList<StandaloneFacade>(StandaloneFacade.class, this, NamespacePackage.NAMESPACE__FACADES);
        }
        return facades;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntitySelector> getEntitySelectors() {
        if (entitySelectors == null) {
            entitySelectors = new EObjectContainmentEList<EntitySelector>(EntitySelector.class, this, NamespacePackage.NAMESPACE__ENTITY_SELECTORS);
        }
        return entitySelectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PropertySet> getPropertySets() {
        if (propertySets == null) {
            propertySets = new EObjectContainmentEList<PropertySet>(PropertySet.class, this, NamespacePackage.NAMESPACE__PROPERTY_SETS);
        }
        return propertySets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EntityType> getEntityTypes() {
        if (entityTypes == null) {
            entityTypes = new EObjectContainmentEList<EntityType>(EntityType.class, this, NamespacePackage.NAMESPACE__ENTITY_TYPES);
        }
        return entityTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NamespacePackage.NAMESPACE__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__DATA_TYPES:
                return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__FACADES:
                return ((InternalEList<?>)getFacades()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__ENTITY_SELECTORS:
                return ((InternalEList<?>)getEntitySelectors()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__PROPERTY_SETS:
                return ((InternalEList<?>)getPropertySets()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                return ((InternalEList<?>)getEntityTypes()).basicRemove(otherEnd, msgs);
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
            case NamespacePackage.NAMESPACE__PACKAGES:
                return getPackages();
            case NamespacePackage.NAMESPACE__DATA_TYPES:
                return getDataTypes();
            case NamespacePackage.NAMESPACE__FACADES:
                return getFacades();
            case NamespacePackage.NAMESPACE__ENTITY_SELECTORS:
                return getEntitySelectors();
            case NamespacePackage.NAMESPACE__PROPERTY_SETS:
                return getPropertySets();
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                return getEntityTypes();
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
            case NamespacePackage.NAMESPACE__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Package>)newValue);
                return;
            case NamespacePackage.NAMESPACE__DATA_TYPES:
                getDataTypes().clear();
                getDataTypes().addAll((Collection<? extends DataType>)newValue);
                return;
            case NamespacePackage.NAMESPACE__FACADES:
                getFacades().clear();
                getFacades().addAll((Collection<? extends StandaloneFacade>)newValue);
                return;
            case NamespacePackage.NAMESPACE__ENTITY_SELECTORS:
                getEntitySelectors().clear();
                getEntitySelectors().addAll((Collection<? extends EntitySelector>)newValue);
                return;
            case NamespacePackage.NAMESPACE__PROPERTY_SETS:
                getPropertySets().clear();
                getPropertySets().addAll((Collection<? extends PropertySet>)newValue);
                return;
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                getEntityTypes().clear();
                getEntityTypes().addAll((Collection<? extends EntityType>)newValue);
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
            case NamespacePackage.NAMESPACE__PACKAGES:
                getPackages().clear();
                return;
            case NamespacePackage.NAMESPACE__DATA_TYPES:
                getDataTypes().clear();
                return;
            case NamespacePackage.NAMESPACE__FACADES:
                getFacades().clear();
                return;
            case NamespacePackage.NAMESPACE__ENTITY_SELECTORS:
                getEntitySelectors().clear();
                return;
            case NamespacePackage.NAMESPACE__PROPERTY_SETS:
                getPropertySets().clear();
                return;
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                getEntityTypes().clear();
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
            case NamespacePackage.NAMESPACE__PACKAGES:
                return packages != null && !packages.isEmpty();
            case NamespacePackage.NAMESPACE__DATA_TYPES:
                return dataTypes != null && !dataTypes.isEmpty();
            case NamespacePackage.NAMESPACE__FACADES:
                return facades != null && !facades.isEmpty();
            case NamespacePackage.NAMESPACE__ENTITY_SELECTORS:
                return entitySelectors != null && !entitySelectors.isEmpty();
            case NamespacePackage.NAMESPACE__PROPERTY_SETS:
                return propertySets != null && !propertySets.isEmpty();
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                return entityTypes != null && !entityTypes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //NamespaceImpl
