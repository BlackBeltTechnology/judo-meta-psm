/**
 */
package hu.blackbelt.judo.meta.psm.facade;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traverse Function Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation#getTraverseFunction <em>Traverse Function</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getTraverseFunctionSingleNavigation()
 * @model
 * @generated
 */
public interface TraverseFunctionSingleNavigation extends TraverseSingleNavigation {
    /**
     * Returns the value of the '<em><b>Traverse Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Traverse Function</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Traverse Function</em>' attribute.
     * @see #setTraverseFunction(String)
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getTraverseFunctionSingleNavigation_TraverseFunction()
     * @model dataType="hu.blackbelt.judo.meta.psm.type.Script" required="true"
     * @generated
     */
    String getTraverseFunction();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation#getTraverseFunction <em>Traverse Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Traverse Function</em>' attribute.
     * @see #getTraverseFunction()
     * @generated
     */
    void setTraverseFunction(String value);

} // TraverseFunctionSingleNavigation
