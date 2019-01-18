/**
 */
package hu.blackbelt.judo.meta.psm.authorization;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import hu.blackbelt.judo.meta.psm.service.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getReferenceTypedElements <em>Reference Typed Elements</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getOperations <em>Operations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getIncludedAuthorizationResources <em>Included Authorization Resources</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage#getAuthorizationResource()
 * @model
 * @generated
 */
public interface AuthorizationResource extends NamespaceElement {
    /**
     * Returns the value of the '<em><b>Reference Typed Elements</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Typed Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reference Typed Elements</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage#getAuthorizationResource_ReferenceTypedElements()
     * @model
     * @generated
     */
    EList<ReferenceTypedElement> getReferenceTypedElements();

    /**
     * Returns the value of the '<em><b>Operations</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage#getAuthorizationResource_Operations()
     * @model
     * @generated
     */
    EList<Operation> getOperations();

    /**
     * Returns the value of the '<em><b>Included Authorization Resources</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Included Authorization Resources</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Included Authorization Resources</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage#getAuthorizationResource_IncludedAuthorizationResources()
     * @model
     * @generated
     */
    EList<AuthorizationResource> getIncludedAuthorizationResources();

} // AuthorizationResource
