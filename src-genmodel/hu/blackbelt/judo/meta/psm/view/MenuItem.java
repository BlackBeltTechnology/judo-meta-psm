/**
 */
package hu.blackbelt.judo.meta.psm.view;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.MenuItem#getView <em>View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.MenuItem#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getMenuItem()
 * @model abstract="true"
 * @generated
 */
public interface MenuItem extends EObject {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(ObjectView)
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getMenuItem_View()
	 * @model required="true"
	 * @generated
	 */
	ObjectView getView();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.MenuItem#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(ObjectView value);

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
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getMenuItem_Target()
	 * @model required="true"
	 * @generated
	 */
	Placeholder getTarget();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.view.MenuItem#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Placeholder value);

} // MenuItem
