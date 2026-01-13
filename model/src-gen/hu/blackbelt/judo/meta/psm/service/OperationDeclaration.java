/**
 */
package hu.blackbelt.judo.meta.psm.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getFaults <em>Faults</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getOutput <em>Output</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperationDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface OperationDeclaration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Faults</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faults</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperationDeclaration_Faults()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getFaults();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Parameter)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperationDeclaration_Output()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getOutput();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Parameter value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Parameter)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperationDeclaration_Input()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getInput();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Parameter value);

} // OperationDeclaration
