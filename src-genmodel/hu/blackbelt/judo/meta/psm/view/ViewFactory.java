/**
 */
package hu.blackbelt.judo.meta.psm.view;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.view.ViewPackage
 * @generated
 */
public interface ViewFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ViewFactory eINSTANCE = hu.blackbelt.judo.meta.psm.view.impl.ViewFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Container</em>'.
     * @generated
     */
    Container createContainer();

    /**
     * Returns a new object of class '<em>Widget</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Widget</em>'.
     * @generated
     */
    Widget createWidget();

    /**
     * Returns a new object of class '<em>Object View</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object View</em>'.
     * @generated
     */
    ObjectView createObjectView();

    /**
     * Returns a new object of class '<em>Groupbox</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Groupbox</em>'.
     * @generated
     */
    Groupbox createGroupbox();

    /**
     * Returns a new object of class '<em>Placeholder</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Placeholder</em>'.
     * @generated
     */
    Placeholder createPlaceholder();

    /**
     * Returns a new object of class '<em>Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Link</em>'.
     * @generated
     */
    Link createLink();

    /**
     * Returns a new object of class '<em>Embedded</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Embedded</em>'.
     * @generated
     */
    Embedded createEmbedded();

    /**
     * Returns a new object of class '<em>Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action</em>'.
     * @generated
     */
    Action createAction();

    /**
     * Returns a new object of class '<em>Visible Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Visible Control</em>'.
     * @generated
     */
    VisibleControl createVisibleControl();

    /**
     * Returns a new object of class '<em>Enabled Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enabled Control</em>'.
     * @generated
     */
    EnabledControl createEnabledControl();

    /**
     * Returns a new object of class '<em>Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Event</em>'.
     * @generated
     */
    Event createEvent();

    /**
     * Returns a new object of class '<em>Menu Bar</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Menu Bar</em>'.
     * @generated
     */
    MenuBar createMenuBar();

    /**
     * Returns a new object of class '<em>Menu</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Menu</em>'.
     * @generated
     */
    Menu createMenu();

    /**
     * Returns a new object of class '<em>Entry Menu Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entry Menu Item</em>'.
     * @generated
     */
    EntryMenuItem createEntryMenuItem();

    /**
     * Returns a new object of class '<em>Action Menu Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Menu Item</em>'.
     * @generated
     */
    ActionMenuItem createActionMenuItem();

    /**
     * Returns a new object of class '<em>User Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>User Interface</em>'.
     * @generated
     */
    UserInterface createUserInterface();

    /**
     * Returns a new object of class '<em>Renderer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Renderer</em>'.
     * @generated
     */
    Renderer createRenderer();

    /**
     * Returns a new object of class '<em>Back</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Back</em>'.
     * @generated
     */
    Back createBack();

    /**
     * Returns a new object of class '<em>Unbound Action Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unbound Action Link</em>'.
     * @generated
     */
    UnboundActionLink createUnboundActionLink();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ViewPackage getViewPackage();

} //ViewFactory
