/**
 */
package hu.blackbelt.judo.meta.psm.view.util;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import hu.blackbelt.judo.meta.psm.view.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage
 * @generated
 */
public class ViewAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewSwitch<Adapter> modelSwitch =
		new ViewSwitch<Adapter>() {
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseObjectView(ObjectView object) {
				return createObjectViewAdapter();
			}
			@Override
			public Adapter caseGroupbox(Groupbox object) {
				return createGroupboxAdapter();
			}
			@Override
			public Adapter casePlaceholder(Placeholder object) {
				return createPlaceholderAdapter();
			}
			@Override
			public Adapter caseNavigation(Navigation object) {
				return createNavigationAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseEmbedded(Embedded object) {
				return createEmbeddedAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseControl(Control object) {
				return createControlAdapter();
			}
			@Override
			public Adapter caseVisibleControl(VisibleControl object) {
				return createVisibleControlAdapter();
			}
			@Override
			public Adapter caseEnabledControl(EnabledControl object) {
				return createEnabledControlAdapter();
			}
			@Override
			public Adapter caseViewControl(ViewControl object) {
				return createViewControlAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseMenuComponent(MenuComponent object) {
				return createMenuComponentAdapter();
			}
			@Override
			public Adapter caseMenuBar(MenuBar object) {
				return createMenuBarAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuItem(MenuItem object) {
				return createMenuItemAdapter();
			}
			@Override
			public Adapter caseEntryMenuItem(EntryMenuItem object) {
				return createEntryMenuItemAdapter();
			}
			@Override
			public Adapter caseActionMenuItem(ActionMenuItem object) {
				return createActionMenuItemAdapter();
			}
			@Override
			public Adapter caseUserInterface(UserInterface object) {
				return createUserInterfaceAdapter();
			}
			@Override
			public Adapter caseRenderer(Renderer object) {
				return createRendererAdapter();
			}
			@Override
			public Adapter caseBack(Back object) {
				return createBackAdapter();
			}
			@Override
			public Adapter caseUnboundActionLink(UnboundActionLink object) {
				return createUnboundActionLinkAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespaceElement(NamespaceElement object) {
				return createNamespaceElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.ObjectView <em>Object View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.ObjectView
	 * @generated
	 */
	public Adapter createObjectViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Groupbox <em>Groupbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Groupbox
	 * @generated
	 */
	public Adapter createGroupboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Placeholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Placeholder
	 * @generated
	 */
	public Adapter createPlaceholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Navigation
	 * @generated
	 */
	public Adapter createNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Embedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Embedded
	 * @generated
	 */
	public Adapter createEmbeddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Control
	 * @generated
	 */
	public Adapter createControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.VisibleControl <em>Visible Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.VisibleControl
	 * @generated
	 */
	public Adapter createVisibleControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.EnabledControl <em>Enabled Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.EnabledControl
	 * @generated
	 */
	public Adapter createEnabledControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.ViewControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.ViewControl
	 * @generated
	 */
	public Adapter createViewControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.MenuComponent <em>Menu Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.MenuComponent
	 * @generated
	 */
	public Adapter createMenuComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.MenuBar <em>Menu Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.MenuBar
	 * @generated
	 */
	public Adapter createMenuBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.MenuItem <em>Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.MenuItem
	 * @generated
	 */
	public Adapter createMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.EntryMenuItem <em>Entry Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.EntryMenuItem
	 * @generated
	 */
	public Adapter createEntryMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.ActionMenuItem <em>Action Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.ActionMenuItem
	 * @generated
	 */
	public Adapter createActionMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.UserInterface
	 * @generated
	 */
	public Adapter createUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Renderer <em>Renderer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Renderer
	 * @generated
	 */
	public Adapter createRendererAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.Back
	 * @generated
	 */
	public Adapter createBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.view.UnboundActionLink <em>Unbound Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.view.UnboundActionLink
	 * @generated
	 */
	public Adapter createUnboundActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.namespace.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.namespace.NamespaceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.namespace.NamespaceElement
	 * @generated
	 */
	public Adapter createNamespaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewAdapterFactory
