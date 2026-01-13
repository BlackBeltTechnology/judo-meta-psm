/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType()
 * @model
 * @generated
 */
public interface MappedTransferObjectType extends TransferObjectType
{
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(EntityType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType_EntityType()
	 * @model required="true"
	 * @generated
	 */
	EntityType getEntityType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EntityType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(LogicalExpressionType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getMappedTransferObjectType_Filter()
	 * @model containment="true"
	 * @generated
	 */
	LogicalExpressionType getFilter();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(LogicalExpressionType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isInstantiable();

} // MappedTransferObjectType
