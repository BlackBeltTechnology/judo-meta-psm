/**
 */
package hu.blackbelt.judo.meta.psm.authorization.impl;

import hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage;
import hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceElementImpl;

import hu.blackbelt.judo.meta.psm.service.Operation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl#getReferenceTypedElements <em>Reference Typed Elements</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl#getIncludedAuthorizationResources <em>Included Authorization Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationResourceImpl extends NamespaceElementImpl implements AuthorizationResource {
    /**
     * The cached value of the '{@link #getReferenceTypedElements() <em>Reference Typed Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceTypedElements()
     * @generated
     * @ordered
     */
    protected EList<ReferenceTypedElement> referenceTypedElements;

    /**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
    protected EList<Operation> operations;

    /**
     * The cached value of the '{@link #getIncludedAuthorizationResources() <em>Included Authorization Resources</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncludedAuthorizationResources()
     * @generated
     * @ordered
     */
    protected EList<AuthorizationResource> includedAuthorizationResources;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthorizationResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AuthorizationPackage.Literals.AUTHORIZATION_RESOURCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ReferenceTypedElement> getReferenceTypedElements() {
        if (referenceTypedElements == null) {
            referenceTypedElements = new EObjectResolvingEList<ReferenceTypedElement>(ReferenceTypedElement.class, this, AuthorizationPackage.AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS);
        }
        return referenceTypedElements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOperations() {
        if (operations == null) {
            operations = new EObjectResolvingEList<Operation>(Operation.class, this, AuthorizationPackage.AUTHORIZATION_RESOURCE__OPERATIONS);
        }
        return operations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AuthorizationResource> getIncludedAuthorizationResources() {
        if (includedAuthorizationResources == null) {
            includedAuthorizationResources = new EObjectResolvingEList<AuthorizationResource>(AuthorizationResource.class, this, AuthorizationPackage.AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES);
        }
        return includedAuthorizationResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS:
                return getReferenceTypedElements();
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__OPERATIONS:
                return getOperations();
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES:
                return getIncludedAuthorizationResources();
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
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS:
                getReferenceTypedElements().clear();
                getReferenceTypedElements().addAll((Collection<? extends ReferenceTypedElement>)newValue);
                return;
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__OPERATIONS:
                getOperations().clear();
                getOperations().addAll((Collection<? extends Operation>)newValue);
                return;
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES:
                getIncludedAuthorizationResources().clear();
                getIncludedAuthorizationResources().addAll((Collection<? extends AuthorizationResource>)newValue);
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
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS:
                getReferenceTypedElements().clear();
                return;
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__OPERATIONS:
                getOperations().clear();
                return;
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES:
                getIncludedAuthorizationResources().clear();
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
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS:
                return referenceTypedElements != null && !referenceTypedElements.isEmpty();
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__OPERATIONS:
                return operations != null && !operations.isEmpty();
            case AuthorizationPackage.AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES:
                return includedAuthorizationResources != null && !includedAuthorizationResources.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AuthorizationResourceImpl
