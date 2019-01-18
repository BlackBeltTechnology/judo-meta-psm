/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.service.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Action#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Action#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Action#getResultView <em>Result View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Action#getFaultViews <em>Fault Views</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Component {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Placeholder)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getAction_Target()
     * @model
     * @generated
     */
    Placeholder getTarget();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Action#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Placeholder value);

    /**
     * Returns the value of the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' reference.
     * @see #setOperation(Operation)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getAction_Operation()
     * @model required="true"
     * @generated
     */
    Operation getOperation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Action#getOperation <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(Operation value);

    /**
     * Returns the value of the '<em><b>Result View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result View</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result View</em>' reference.
     * @see #setResultView(ObjectView)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getAction_ResultView()
     * @model
     * @generated
     */
    ObjectView getResultView();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Action#getResultView <em>Result View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result View</em>' reference.
     * @see #getResultView()
     * @generated
     */
    void setResultView(ObjectView value);

    /**
     * Returns the value of the '<em><b>Fault Views</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.ObjectView}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fault Views</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fault Views</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getAction_FaultViews()
     * @model
     * @generated
     */
    EList<ObjectView> getFaultViews();

} // Action
