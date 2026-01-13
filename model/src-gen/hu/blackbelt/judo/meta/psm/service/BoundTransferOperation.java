/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.OperationBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Transfer Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.BoundTransferOperation#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getBoundTransferOperation()
 * @model
 * @generated
 */
public interface BoundTransferOperation extends TransferOperation
{
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(BoundOperation)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getBoundTransferOperation_Binding()
	 * @model required="true"
	 * @generated
	 */
	BoundOperation getBinding();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.BoundTransferOperation#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(BoundOperation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	OperationBody getImplementation();

} // BoundTransferOperation
