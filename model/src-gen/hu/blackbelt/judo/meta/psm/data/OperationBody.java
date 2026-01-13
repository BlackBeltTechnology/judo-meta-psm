/**
 */
package hu.blackbelt.judo.meta.psm.data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.OperationBody#isStateful <em>Stateful</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.OperationBody#isCustomImplementation <em>Custom Implementation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.OperationBody#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getOperationBody()
 * @model
 * @generated
 */
public interface OperationBody extends EObject
{
	/**
	 * Returns the value of the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stateful</em>' attribute.
	 * @see #setStateful(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getOperationBody_Stateful()
	 * @model required="true"
	 * @generated
	 */
	boolean isStateful();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.OperationBody#isStateful <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stateful</em>' attribute.
	 * @see #isStateful()
	 * @generated
	 */
	void setStateful(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Implementation</em>' attribute.
	 * @see #setCustomImplementation(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getOperationBody_CustomImplementation()
	 * @model required="true"
	 * @generated
	 */
	boolean isCustomImplementation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.OperationBody#isCustomImplementation <em>Custom Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Implementation</em>' attribute.
	 * @see #isCustomImplementation()
	 * @generated
	 */
	void setCustomImplementation(boolean value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getOperationBody_Body()
	 * @model dataType="hu.blackbelt.judo.meta.psm.script.Script"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.OperationBody#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // OperationBody
