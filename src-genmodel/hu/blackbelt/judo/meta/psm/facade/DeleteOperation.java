/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.DeleteOperation#getDeleteOperation <em>Delete Operation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDeleteOperation()
 * @model
 * @generated
 */
public interface DeleteOperation extends EObject {
    /**
     * Returns the value of the '<em><b>Delete Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delete Operation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete Operation</em>' attribute.
     * @see #setDeleteOperation(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getDeleteOperation_DeleteOperation()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getDeleteOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.DeleteOperation#getDeleteOperation <em>Delete Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete Operation</em>' attribute.
     * @see #getDeleteOperation()
     * @generated
     */
    void setDeleteOperation(String value);

} // DeleteOperation
