/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.view.Menu;
import hu.blackbelt.judo.meta.psm.view.MenuComponent;
import hu.blackbelt.judo.meta.psm.view.MenuItem;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.MenuComponentImpl#getSubMenus <em>Sub Menus</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.MenuComponentImpl#getMenuItems <em>Menu Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MenuComponentImpl extends ComponentImpl implements MenuComponent {
	/**
	 * The cached value of the '{@link #getSubMenus() <em>Sub Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<Menu> subMenus;

	/**
	 * The cached value of the '{@link #getMenuItems() <em>Menu Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MenuItem> menuItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.MENU_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Menu> getSubMenus() {
		if (subMenus == null) {
			subMenus = new EObjectContainmentEList<Menu>(Menu.class, this, ViewPackage.MENU_COMPONENT__SUB_MENUS);
		}
		return subMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MenuItem> getMenuItems() {
		if (menuItems == null) {
			menuItems = new EObjectContainmentEList<MenuItem>(MenuItem.class, this, ViewPackage.MENU_COMPONENT__MENU_ITEMS);
		}
		return menuItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewPackage.MENU_COMPONENT__SUB_MENUS:
				return ((InternalEList<?>)getSubMenus()).basicRemove(otherEnd, msgs);
			case ViewPackage.MENU_COMPONENT__MENU_ITEMS:
				return ((InternalEList<?>)getMenuItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewPackage.MENU_COMPONENT__SUB_MENUS:
				return getSubMenus();
			case ViewPackage.MENU_COMPONENT__MENU_ITEMS:
				return getMenuItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewPackage.MENU_COMPONENT__SUB_MENUS:
				getSubMenus().clear();
				getSubMenus().addAll((Collection<? extends Menu>)newValue);
				return;
			case ViewPackage.MENU_COMPONENT__MENU_ITEMS:
				getMenuItems().clear();
				getMenuItems().addAll((Collection<? extends MenuItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewPackage.MENU_COMPONENT__SUB_MENUS:
				getSubMenus().clear();
				return;
			case ViewPackage.MENU_COMPONENT__MENU_ITEMS:
				getMenuItems().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewPackage.MENU_COMPONENT__SUB_MENUS:
				return subMenus != null && !subMenus.isEmpty();
			case ViewPackage.MENU_COMPONENT__MENU_ITEMS:
				return menuItems != null && !menuItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MenuComponentImpl
