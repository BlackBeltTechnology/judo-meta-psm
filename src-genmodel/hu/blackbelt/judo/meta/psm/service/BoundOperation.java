/**
 */
package hu.blackbelt.judo.meta.psm.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.BoundOperation#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getBoundOperation()
 * @model
 * @generated
 */
public interface BoundOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(MappedTransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getBoundOperation_Input()
	 * @model required="true"
	 * @generated
	 */
	MappedTransferObjectType getInput();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.BoundOperation#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(MappedTransferObjectType value);

} // BoundOperation
