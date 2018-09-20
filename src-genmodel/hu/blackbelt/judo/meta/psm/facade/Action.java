/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Action#getResult <em>Result</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Action#getBody <em>Body</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Action#isList <em>List</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.Action#isExternal <em>External</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Facade {
    /**
     * Returns the value of the '<em><b>Result</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' reference.
     * @see #setResult(View)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAction_Result()
     * @model
     * @generated
     */
    View getResult();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Action#getResult <em>Result</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' reference.
     * @see #getResult()
     * @generated
     */
    void setResult(View value);

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
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAction_Body()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getBody();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Action#getBody <em>Body</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' attribute.
     * @see #getBody()
     * @generated
     */
    void setBody(String value);

    /**
     * Returns the value of the '<em><b>List</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List</em>' attribute.
     * @see #setList(boolean)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAction_List()
     * @model required="true"
     * @generated
     */
    boolean isList();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Action#isList <em>List</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List</em>' attribute.
     * @see #isList()
     * @generated
     */
    void setList(boolean value);

    /**
     * Returns the value of the '<em><b>External</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>External</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>External</em>' attribute.
     * @see #setExternal(boolean)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getAction_External()
     * @model
     * @generated
     */
    boolean isExternal();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.Action#isExternal <em>External</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>External</em>' attribute.
     * @see #isExternal()
     * @generated
     */
    void setExternal(boolean value);

} // Action
