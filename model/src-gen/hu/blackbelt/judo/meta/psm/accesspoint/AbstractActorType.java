/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Actor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getTransferObjectType <em>Transfer Object Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getRealm <em>Realm</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAbstractActorType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractActorType extends TransferObjectType
{
	/**
	 * Returns the value of the '<em><b>Transfer Object Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Object Type</em>' reference.
	 * @see #setTransferObjectType(TransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAbstractActorType_TransferObjectType()
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getActorType
	 * @model opposite="actorType"
	 * @generated
	 */
	TransferObjectType getTransferObjectType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getTransferObjectType <em>Transfer Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Object Type</em>' reference.
	 * @see #getTransferObjectType()
	 * @generated
	 */
	void setTransferObjectType(TransferObjectType value);

	/**
	 * Returns the value of the '<em><b>Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realm</em>' attribute.
	 * @see #setRealm(String)
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAbstractActorType_Realm()
	 * @model
	 * @generated
	 */
	String getRealm();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getRealm <em>Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realm</em>' attribute.
	 * @see #getRealm()
	 * @generated
	 */
	void setRealm(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAbstractActorType_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // AbstractActorType
