/**
 */
package hu.blackbelt.judo.meta.psm.namespace.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.facade.Facade;

import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.Type;

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
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl#getFacades <em>Facades</em>}</li>
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
     * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypes()
     * @generated
     * @ordered
     */
    protected EList<Type> types;

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
     * The cached value of the '{@link #getFacades() <em>Facades</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFacades()
     * @generated
     * @ordered
     */
    protected EList<Facade> facades;

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
    public EList<Type> getTypes() {
        if (types == null) {
            types = new EObjectContainmentEList<Type>(Type.class, this, NamespacePackage.NAMESPACE__TYPES);
        }
        return types;
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
    public EList<Facade> getFacades() {
        if (facades == null) {
            facades = new EObjectContainmentEList<Facade>(Facade.class, this, NamespacePackage.NAMESPACE__FACADES);
        }
        return facades;
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
            case NamespacePackage.NAMESPACE__TYPES:
                return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                return ((InternalEList<?>)getEntityTypes()).basicRemove(otherEnd, msgs);
            case NamespacePackage.NAMESPACE__FACADES:
                return ((InternalEList<?>)getFacades()).basicRemove(otherEnd, msgs);
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
            case NamespacePackage.NAMESPACE__TYPES:
                return getTypes();
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                return getEntityTypes();
            case NamespacePackage.NAMESPACE__FACADES:
                return getFacades();
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
            case NamespacePackage.NAMESPACE__TYPES:
                getTypes().clear();
                getTypes().addAll((Collection<? extends Type>)newValue);
                return;
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                getEntityTypes().clear();
                getEntityTypes().addAll((Collection<? extends EntityType>)newValue);
                return;
            case NamespacePackage.NAMESPACE__FACADES:
                getFacades().clear();
                getFacades().addAll((Collection<? extends Facade>)newValue);
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
            case NamespacePackage.NAMESPACE__TYPES:
                getTypes().clear();
                return;
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                getEntityTypes().clear();
                return;
            case NamespacePackage.NAMESPACE__FACADES:
                getFacades().clear();
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
            case NamespacePackage.NAMESPACE__TYPES:
                return types != null && !types.isEmpty();
            case NamespacePackage.NAMESPACE__ENTITY_TYPES:
                return entityTypes != null && !entityTypes.isEmpty();
            case NamespacePackage.NAMESPACE__FACADES:
                return facades != null && !facades.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //NamespaceImpl
