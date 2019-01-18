/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Operation#getOutput <em>Output</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Operation#getFaults <em>Faults</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Operation#isUndefined <em>Undefined</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperation()
 * @model abstract="true"
 * @generated
 */
public interface Operation extends NamedElement {
    /**
     * Returns the value of the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Body</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' attribute.
     * @see #setBody(String)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperation_Body()
     * @model dataType="hu.blackbelt.judo.meta.psm.script.Script"
     * @generated
     */
    String getBody();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.Operation#getBody <em>Body</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' attribute.
     * @see #getBody()
     * @generated
     */
    void setBody(String value);

    /**
     * Returns the value of the '<em><b>Output</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output</em>' reference.
     * @see #setOutput(TransferObjectType)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperation_Output()
     * @model
     * @generated
     */
    TransferObjectType getOutput();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.Operation#getOutput <em>Output</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' reference.
     * @see #getOutput()
     * @generated
     */
    void setOutput(TransferObjectType value);

    /**
     * Returns the value of the '<em><b>Faults</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.service.TransferObjectType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faults</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperation_Faults()
     * @model
     * @generated
     */
    EList<TransferObjectType> getFaults();

    /**
     * Returns the value of the '<em><b>Undefined</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Undefined</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Undefined</em>' attribute.
     * @see #setUndefined(boolean)
     * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getOperation_Undefined()
     * @model required="true"
     * @generated
     */
    boolean isUndefined();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.Operation#isUndefined <em>Undefined</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Undefined</em>' attribute.
     * @see #isUndefined()
     * @generated
     */
    void setUndefined(boolean value);

} // Operation
