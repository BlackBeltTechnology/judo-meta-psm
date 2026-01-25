/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#getInstanceRepresentation <em>Instance Representation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getBoundOperation()
 * @model
 * @generated
 */
public interface BoundOperation extends NamedElement, OperationDeclaration
{
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(OperationBody)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getBoundOperation_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	OperationBody getImplementation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(OperationBody value);

	/**
	 * Returns the value of the '<em><b>Instance Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Representation</em>' reference.
	 * @see #setInstanceRepresentation(MappedTransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getBoundOperation_InstanceRepresentation()
	 * @model required="true"
	 * @generated
	 */
	MappedTransferObjectType getInstanceRepresentation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#getInstanceRepresentation <em>Instance Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Representation</em>' reference.
	 * @see #getInstanceRepresentation()
	 * @generated
	 */
	void setInstanceRepresentation(MappedTransferObjectType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getBoundOperation_Abstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

} // BoundOperation
