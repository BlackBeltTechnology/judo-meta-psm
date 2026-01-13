/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Actor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType#isManaged <em>Managed</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getMappedActorType()
 * @model
 * @generated
 */
public interface MappedActorType extends AbstractActorType, MappedTransferObjectType
{
	/**
	 * Returns the value of the '<em><b>Managed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed</em>' attribute.
	 * @see #setManaged(boolean)
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getMappedActorType_Managed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isManaged();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType#isManaged <em>Managed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed</em>' attribute.
	 * @see #isManaged()
	 * @generated
	 */
	void setManaged(boolean value);

} // MappedActorType
