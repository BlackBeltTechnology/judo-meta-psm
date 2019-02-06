/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.view.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewFactoryImpl extends EFactoryImpl implements ViewFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewFactory init() {
		try {
			ViewFactory theViewFactory = (ViewFactory)EPackage.Registry.INSTANCE.getEFactory(ViewPackage.eNS_URI);
			if (theViewFactory != null) {
				return theViewFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViewPackage.CONTAINER: return createContainer();
			case ViewPackage.WIDGET: return createWidget();
			case ViewPackage.OBJECT_VIEW: return createObjectView();
			case ViewPackage.GROUPBOX: return createGroupbox();
			case ViewPackage.PLACEHOLDER: return createPlaceholder();
			case ViewPackage.LINK: return createLink();
			case ViewPackage.EMBEDDED: return createEmbedded();
			case ViewPackage.ACTION: return createAction();
			case ViewPackage.VISIBLE_CONTROL: return createVisibleControl();
			case ViewPackage.ENABLED_CONTROL: return createEnabledControl();
			case ViewPackage.EVENT: return createEvent();
			case ViewPackage.MENU_BAR: return createMenuBar();
			case ViewPackage.MENU: return createMenu();
			case ViewPackage.ENTRY_MENU_ITEM: return createEntryMenuItem();
			case ViewPackage.ACTION_MENU_ITEM: return createActionMenuItem();
			case ViewPackage.USER_INTERFACE: return createUserInterface();
			case ViewPackage.RENDERER: return createRenderer();
			case ViewPackage.BACK: return createBack();
			case ViewPackage.UNBOUND_ACTION_LINK: return createUnboundActionLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ViewPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case ViewPackage.VIEW_TYPE:
				return createViewTypeFromString(eDataType, initialValue);
			case ViewPackage.LAYOUT_TYPE:
				return createLayoutTypeFromString(eDataType, initialValue);
			case ViewPackage.ALIGNMENT_TYPE:
				return createAlignmentTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ViewPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case ViewPackage.VIEW_TYPE:
				return convertViewTypeToString(eDataType, instanceValue);
			case ViewPackage.LAYOUT_TYPE:
				return convertLayoutTypeToString(eDataType, instanceValue);
			case ViewPackage.ALIGNMENT_TYPE:
				return convertAlignmentTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.blackbelt.judo.meta.psm.view.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Widget createWidget() {
		WidgetImpl widget = new WidgetImpl();
		return widget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectView createObjectView() {
		ObjectViewImpl objectView = new ObjectViewImpl();
		return objectView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Groupbox createGroupbox() {
		GroupboxImpl groupbox = new GroupboxImpl();
		return groupbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Placeholder createPlaceholder() {
		PlaceholderImpl placeholder = new PlaceholderImpl();
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedded createEmbedded() {
		EmbeddedImpl embedded = new EmbeddedImpl();
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleControl createVisibleControl() {
		VisibleControlImpl visibleControl = new VisibleControlImpl();
		return visibleControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnabledControl createEnabledControl() {
		EnabledControlImpl enabledControl = new EnabledControlImpl();
		return enabledControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuBar createMenuBar() {
		MenuBarImpl menuBar = new MenuBarImpl();
		return menuBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryMenuItem createEntryMenuItem() {
		EntryMenuItemImpl entryMenuItem = new EntryMenuItemImpl();
		return entryMenuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMenuItem createActionMenuItem() {
		ActionMenuItemImpl actionMenuItem = new ActionMenuItemImpl();
		return actionMenuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Renderer createRenderer() {
		RendererImpl renderer = new RendererImpl();
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Back createBack() {
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnboundActionLink createUnboundActionLink() {
		UnboundActionLinkImpl unboundActionLink = new UnboundActionLinkImpl();
		return unboundActionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventType(String literal) {
		EventType result = EventType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + ViewPackage.Literals.EVENT_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		return createEventType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventType(EventType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return convertEventType((EventType)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewType(String literal) {
		ViewType result = ViewType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + ViewPackage.Literals.VIEW_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewTypeFromString(EDataType eDataType, String initialValue) {
		return createViewType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewType(ViewType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewTypeToString(EDataType eDataType, Object instanceValue) {
		return convertViewType((ViewType)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutType createLayoutType(String literal) {
		LayoutType result = LayoutType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + ViewPackage.Literals.LAYOUT_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutType createLayoutTypeFromString(EDataType eDataType, String initialValue) {
		return createLayoutType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutType(LayoutType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayoutTypeToString(EDataType eDataType, Object instanceValue) {
		return convertLayoutType((LayoutType)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentType(String literal) {
		AlignmentType result = AlignmentType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + ViewPackage.Literals.ALIGNMENT_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType createAlignmentTypeFromString(EDataType eDataType, String initialValue) {
		return createAlignmentType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentType(AlignmentType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentTypeToString(EDataType eDataType, Object instanceValue) {
		return convertAlignmentType((AlignmentType)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPackage getViewPackage() {
		return (ViewPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewPackage getPackage() {
		return ViewPackage.eINSTANCE;
	}

} //ViewFactoryImpl
