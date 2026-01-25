/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.OperationBody;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isDeleteOnResult <em>Delete On Result</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isUpdateOnResult <em>Update On Result</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getInputRange <em>Input Range</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperation()
 * @model abstract="true"
 * @generated
 */
public interface TransferOperation extends NamedElement, OperationDeclaration
{
	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' containment reference.
	 * @see #setBehaviour(TransferOperationBehaviour)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperation_Behaviour()
	 * @model containment="true"
	 * @generated
	 */
	TransferOperationBehaviour getBehaviour();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getBehaviour <em>Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' containment reference.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(TransferOperationBehaviour value);

	/**
	 * Returns the value of the '<em><b>Immutable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immutable</em>' attribute.
	 * @see #setImmutable(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperation_Immutable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isImmutable();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isImmutable <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immutable</em>' attribute.
	 * @see #isImmutable()
	 * @generated
	 */
	void setImmutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete On Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete On Result</em>' attribute.
	 * @see #setDeleteOnResult(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperation_DeleteOnResult()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDeleteOnResult();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isDeleteOnResult <em>Delete On Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Result</em>' attribute.
	 * @see #isDeleteOnResult()
	 * @generated
	 */
	void setDeleteOnResult(boolean value);

	/**
	 * Returns the value of the '<em><b>Update On Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update On Result</em>' attribute.
	 * @see #setUpdateOnResult(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperation_UpdateOnResult()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isUpdateOnResult();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isUpdateOnResult <em>Update On Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update On Result</em>' attribute.
	 * @see #isUpdateOnResult()
	 * @generated
	 */
	void setUpdateOnResult(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Range</em>' reference.
	 * @see #setInputRange(TransferObjectRelation)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperation_InputRange()
	 * @model
	 * @generated
	 */
	TransferObjectRelation getInputRange();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getInputRange <em>Input Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Range</em>' reference.
	 * @see #getInputRange()
	 * @generated
	 */
	void setInputRange(TransferObjectRelation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	OperationBody getImplementation();

} // TransferOperation
