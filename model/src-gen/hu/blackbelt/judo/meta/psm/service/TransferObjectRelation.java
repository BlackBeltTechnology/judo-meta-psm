/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Object Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getBinding <em>Binding</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getRange <em>Range</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedCreate <em>Embedded Create</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedUpdate <em>Embedded Update</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedDelete <em>Embedded Delete</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation()
 * @model
 * @generated
 */
public interface TransferObjectRelation extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(ReferenceTypedElement)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_Binding()
	 * @model
	 * @generated
	 */
	ReferenceTypedElement getBinding();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ReferenceTypedElement value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(ReferenceAccessor)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_DefaultValue()
	 * @model
	 * @generated
	 */
	ReferenceAccessor getDefaultValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ReferenceAccessor value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(ReferenceAccessor)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_Range()
	 * @model
	 * @generated
	 */
	ReferenceAccessor getRange();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ReferenceAccessor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	TransferObjectType getTarget();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TransferObjectType value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see #setEmbedded(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_Embedded()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbedded <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' attribute.
	 * @see #isEmbedded()
	 * @generated
	 */
	void setEmbedded(boolean value);

	/**
	 * Returns the value of the '<em><b>Embedded Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Create</em>' attribute.
	 * @see #setEmbeddedCreate(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_EmbeddedCreate()
	 * @model required="true"
	 * @generated
	 */
	boolean isEmbeddedCreate();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedCreate <em>Embedded Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Create</em>' attribute.
	 * @see #isEmbeddedCreate()
	 * @generated
	 */
	void setEmbeddedCreate(boolean value);

	/**
	 * Returns the value of the '<em><b>Embedded Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Update</em>' attribute.
	 * @see #setEmbeddedUpdate(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_EmbeddedUpdate()
	 * @model required="true"
	 * @generated
	 */
	boolean isEmbeddedUpdate();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedUpdate <em>Embedded Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Update</em>' attribute.
	 * @see #isEmbeddedUpdate()
	 * @generated
	 */
	void setEmbeddedUpdate(boolean value);

	/**
	 * Returns the value of the '<em><b>Embedded Delete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Delete</em>' attribute.
	 * @see #setEmbeddedDelete(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_EmbeddedDelete()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isEmbeddedDelete();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedDelete <em>Embedded Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Delete</em>' attribute.
	 * @see #isEmbeddedDelete()
	 * @generated
	 */
	void setEmbeddedDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferObjectRelation_Access()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAccess();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #isAccess()
	 * @generated
	 */
	void setAccess(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isMutable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	boolean isExposedGraph();

} // TransferObjectRelation
