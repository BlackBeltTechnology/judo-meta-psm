/**
 */
package hu.blackbelt.judo.meta.psm.view;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unbound Action Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.UnboundActionLink#getActionView <em>Action View</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getUnboundActionLink()
 * @model
 * @generated
 */
public interface UnboundActionLink extends Component {
	/**
	 * Returns the value of the '<em><b>Action View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action View</em>' reference.
	 * @see #setActionView(ObjectView)
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getUnboundActionLink_ActionView()
	 * @model required="true"
	 * @generated
	 */
	ObjectView getActionView();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.UnboundActionLink#getActionView <em>Action View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action View</em>' reference.
	 * @see #getActionView()
	 * @generated
	 */
	void setActionView(ObjectView value);

} // UnboundActionLink
