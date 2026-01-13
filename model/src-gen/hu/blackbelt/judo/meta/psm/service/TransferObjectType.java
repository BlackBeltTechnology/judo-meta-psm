/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType;

import hu.blackbelt.judo.meta.psm.type.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOperations <em>Operations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOverride <em>Override</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#isQueryCustomizer <em>Query Customizer</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType()
 * @model abstract="true"
 * @generated
 */
public interface TransferObjectType extends DataType
{
	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(TransferAttribute)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Representation()
	 * @model
	 * @generated
	 */
	TransferAttribute getRepresentation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(TransferAttribute value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferObjectRelation> getRelations();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Actor Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getTransferObjectType <em>Transfer Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Type</em>' reference.
	 * @see #setActorType(AbstractActorType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_ActorType()
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getTransferObjectType
	 * @model opposite="transferObjectType"
	 * @generated
	 */
	AbstractActorType getActorType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getActorType <em>Actor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Type</em>' reference.
	 * @see #getActorType()
	 * @generated
	 */
	void setActorType(AbstractActorType value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' reference.
	 * @see #setOverride(TransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_Override()
	 * @model
	 * @generated
	 */
	TransferObjectType getOverride();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOverride <em>Override</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' reference.
	 * @see #getOverride()
	 * @generated
	 */
	void setOverride(TransferObjectType value);

	/**
	 * Returns the value of the '<em><b>Query Customizer</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Customizer</em>' attribute.
	 * @see #setQueryCustomizer(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectType_QueryCustomizer()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isQueryCustomizer();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#isQueryCustomizer <em>Query Customizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Customizer</em>' attribute.
	 * @see #isQueryCustomizer()
	 * @generated
	 */
	void setQueryCustomizer(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isAccessPoint();

} // TransferObjectType
