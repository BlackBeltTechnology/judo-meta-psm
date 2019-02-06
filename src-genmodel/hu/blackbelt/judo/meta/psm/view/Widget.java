/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.service.TransferAttribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Widget#getTransferAttribute <em>Transfer Attribute</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.Widget#getEmittedEvents <em>Emitted Events</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends Component {
	/**
	 * Returns the value of the '<em><b>Transfer Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Attribute</em>' reference.
	 * @see #setTransferAttribute(TransferAttribute)
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getWidget_TransferAttribute()
	 * @model required="true"
	 * @generated
	 */
	TransferAttribute getTransferAttribute();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.Widget#getTransferAttribute <em>Transfer Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Attribute</em>' reference.
	 * @see #getTransferAttribute()
	 * @generated
	 */
	void setTransferAttribute(TransferAttribute value);

	/**
	 * Returns the value of the '<em><b>Emitted Events</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emitted Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emitted Events</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getWidget_EmittedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEmittedEvents();

} // Widget
