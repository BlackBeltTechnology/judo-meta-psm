/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.service.TransferRelation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Navigation#getNavigationView <em>Navigation View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Navigation#getRangeView <em>Range View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Navigation#getTransferRelation <em>Transfer Relation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getNavigation()
 * @model abstract="true"
 * @generated
 */
public interface Navigation extends Component {
    /**
     * Returns the value of the '<em><b>Navigation View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Navigation View</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Navigation View</em>' reference.
     * @see #setNavigationView(ObjectView)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getNavigation_NavigationView()
     * @model required="true"
     * @generated
     */
    ObjectView getNavigationView();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Navigation#getNavigationView <em>Navigation View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Navigation View</em>' reference.
     * @see #getNavigationView()
     * @generated
     */
    void setNavigationView(ObjectView value);

    /**
     * Returns the value of the '<em><b>Range View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range View</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range View</em>' reference.
     * @see #setRangeView(ObjectView)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getNavigation_RangeView()
     * @model
     * @generated
     */
    ObjectView getRangeView();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Navigation#getRangeView <em>Range View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range View</em>' reference.
     * @see #getRangeView()
     * @generated
     */
    void setRangeView(ObjectView value);

    /**
     * Returns the value of the '<em><b>Transfer Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transfer Relation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transfer Relation</em>' reference.
     * @see #setTransferRelation(TransferRelation)
     * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getNavigation_TransferRelation()
     * @model required="true"
     * @generated
     */
    TransferRelation getTransferRelation();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Navigation#getTransferRelation <em>Transfer Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transfer Relation</em>' reference.
     * @see #getTransferRelation()
     * @generated
     */
    void setTransferRelation(TransferRelation value);

} // Navigation
