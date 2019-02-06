/**
 */
package hu.blackbelt.judo.meta.psm.view.util;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import hu.blackbelt.judo.meta.psm.view.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage
 * @generated
 */
public class ViewSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewSwitch() {
		if (modelPackage == null) {
			modelPackage = ViewPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ViewPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = caseComponent(widget);
				if (result == null) result = caseNamedElement(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.OBJECT_VIEW: {
				ObjectView objectView = (ObjectView)theEObject;
				T result = caseObjectView(objectView);
				if (result == null) result = caseContainer(objectView);
				if (result == null) result = caseNamespaceElement(objectView);
				if (result == null) result = caseNamedElement(objectView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.GROUPBOX: {
				Groupbox groupbox = (Groupbox)theEObject;
				T result = caseGroupbox(groupbox);
				if (result == null) result = caseContainer(groupbox);
				if (result == null) result = caseComponent(groupbox);
				if (result == null) result = caseNamedElement(groupbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.PLACEHOLDER: {
				Placeholder placeholder = (Placeholder)theEObject;
				T result = casePlaceholder(placeholder);
				if (result == null) result = caseComponent(placeholder);
				if (result == null) result = caseNamedElement(placeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.NAVIGATION: {
				Navigation navigation = (Navigation)theEObject;
				T result = caseNavigation(navigation);
				if (result == null) result = caseComponent(navigation);
				if (result == null) result = caseNamedElement(navigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = caseNavigation(link);
				if (result == null) result = caseComponent(link);
				if (result == null) result = caseNamedElement(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.EMBEDDED: {
				Embedded embedded = (Embedded)theEObject;
				T result = caseEmbedded(embedded);
				if (result == null) result = caseNavigation(embedded);
				if (result == null) result = caseComponent(embedded);
				if (result == null) result = caseNamedElement(embedded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseComponent(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.VISIBLE_CONTROL: {
				VisibleControl visibleControl = (VisibleControl)theEObject;
				T result = caseVisibleControl(visibleControl);
				if (result == null) result = caseControl(visibleControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.ENABLED_CONTROL: {
				EnabledControl enabledControl = (EnabledControl)theEObject;
				T result = caseEnabledControl(enabledControl);
				if (result == null) result = caseControl(enabledControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.VIEW_CONTROL: {
				ViewControl viewControl = (ViewControl)theEObject;
				T result = caseViewControl(viewControl);
				if (result == null) result = caseComponent(viewControl);
				if (result == null) result = caseNamedElement(viewControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.MENU_COMPONENT: {
				MenuComponent menuComponent = (MenuComponent)theEObject;
				T result = caseMenuComponent(menuComponent);
				if (result == null) result = caseComponent(menuComponent);
				if (result == null) result = caseNamedElement(menuComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.MENU_BAR: {
				MenuBar menuBar = (MenuBar)theEObject;
				T result = caseMenuBar(menuBar);
				if (result == null) result = caseMenuComponent(menuBar);
				if (result == null) result = caseComponent(menuBar);
				if (result == null) result = caseNamedElement(menuBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = caseMenuComponent(menu);
				if (result == null) result = caseComponent(menu);
				if (result == null) result = caseNamedElement(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.MENU_ITEM: {
				MenuItem menuItem = (MenuItem)theEObject;
				T result = caseMenuItem(menuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.ENTRY_MENU_ITEM: {
				EntryMenuItem entryMenuItem = (EntryMenuItem)theEObject;
				T result = caseEntryMenuItem(entryMenuItem);
				if (result == null) result = caseMenuItem(entryMenuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.ACTION_MENU_ITEM: {
				ActionMenuItem actionMenuItem = (ActionMenuItem)theEObject;
				T result = caseActionMenuItem(actionMenuItem);
				if (result == null) result = caseMenuItem(actionMenuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.USER_INTERFACE: {
				UserInterface userInterface = (UserInterface)theEObject;
				T result = caseUserInterface(userInterface);
				if (result == null) result = caseNamespaceElement(userInterface);
				if (result == null) result = caseNamedElement(userInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.RENDERER: {
				Renderer renderer = (Renderer)theEObject;
				T result = caseRenderer(renderer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.BACK: {
				Back back = (Back)theEObject;
				T result = caseBack(back);
				if (result == null) result = caseViewControl(back);
				if (result == null) result = caseComponent(back);
				if (result == null) result = caseNamedElement(back);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ViewPackage.UNBOUND_ACTION_LINK: {
				UnboundActionLink unboundActionLink = (UnboundActionLink)theEObject;
				T result = caseUnboundActionLink(unboundActionLink);
				if (result == null) result = caseComponent(unboundActionLink);
				if (result == null) result = caseNamedElement(unboundActionLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectView(ObjectView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groupbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groupbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupbox(Groupbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceholder(Placeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigation(Navigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbedded(Embedded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visible Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visible Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibleControl(VisibleControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enabled Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enabled Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabledControl(EnabledControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewControl(ViewControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuComponent(MenuComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuBar(MenuBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuItem(MenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryMenuItem(EntryMenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionMenuItem(ActionMenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInterface(UserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renderer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renderer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenderer(Renderer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBack(Back object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unbound Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unbound Action Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnboundActionLink(UnboundActionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceElement(NamespaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ViewSwitch
