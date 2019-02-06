/**
 */
package hu.blackbelt.judo.meta.psm.view;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.MenuComponent#getSubMenus <em>Sub Menus</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.MenuComponent#getMenuItems <em>Menu Items</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getMenuComponent()
 * @model abstract="true"
 * @generated
 */
public interface MenuComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Sub Menus</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Menus</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getMenuComponent_SubMenus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getSubMenus();

	/**
	 * Returns the value of the '<em><b>Menu Items</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.view.MenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Items</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage#getMenuComponent_MenuItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuItem> getMenuItems();

} // MenuComponent
