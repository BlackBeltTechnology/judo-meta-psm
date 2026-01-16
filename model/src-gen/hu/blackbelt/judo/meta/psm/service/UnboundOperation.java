/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.OperationBody;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unbound Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#isInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getUnboundOperation()
 * @model
 * @generated
 */
public interface UnboundOperation extends TransferOperation
{
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(OperationBody)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getUnboundOperation_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	OperationBody getImplementation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(OperationBody value);

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' attribute.
	 * @see #setInitializer(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getUnboundOperation_Initializer()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInitializer();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#isInitializer <em>Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' attribute.
	 * @see #isInitializer()
	 * @generated
	 */
	void setInitializer(boolean value);

} // UnboundOperation
