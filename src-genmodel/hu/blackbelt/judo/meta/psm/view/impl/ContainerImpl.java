/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.view.AlignmentType;
import hu.blackbelt.judo.meta.psm.view.Component;
import hu.blackbelt.judo.meta.psm.view.LayoutType;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl#getAlignment <em>Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NamedElementImpl implements hu.blackbelt.judo.meta.psm.view.Container {
    /**
     * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponents()
     * @generated
     * @ordered
     */
    protected EList<Component> components;

    /**
     * The default value of the '{@link #getLayout() <em>Layout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLayout()
     * @generated
     * @ordered
     */
    protected static final LayoutType LAYOUT_EDEFAULT = LayoutType.HORIZONTAL;

    /**
     * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLayout()
     * @generated
     * @ordered
     */
    protected LayoutType layout = LAYOUT_EDEFAULT;

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlignment()
     * @generated
     * @ordered
     */
    protected static final AlignmentType ALIGNMENT_EDEFAULT = AlignmentType.TOP;

    /**
     * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlignment()
     * @generated
     * @ordered
     */
    protected AlignmentType alignment = ALIGNMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ViewPackage.Literals.CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Component> getComponents() {
        if (components == null) {
            components = new EObjectContainmentEList<Component>(Component.class, this, ViewPackage.CONTAINER__COMPONENTS);
        }
        return components;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LayoutType getLayout() {
        return layout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLayout(LayoutType newLayout) {
        LayoutType oldLayout = layout;
        layout = newLayout == null ? LAYOUT_EDEFAULT : newLayout;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.CONTAINER__LAYOUT, oldLayout, layout));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.CONTAINER__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AlignmentType getAlignment() {
        return alignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAlignment(AlignmentType newAlignment) {
        AlignmentType oldAlignment = alignment;
        alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.CONTAINER__ALIGNMENT, oldAlignment, alignment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ViewPackage.CONTAINER__COMPONENTS:
                return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
            case ViewPackage.CONTAINER__COMPONENTS:
                return getComponents();
            case ViewPackage.CONTAINER__LAYOUT:
                return getLayout();
            case ViewPackage.CONTAINER__TITLE:
                return getTitle();
            case ViewPackage.CONTAINER__ALIGNMENT:
                return getAlignment();
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
            case ViewPackage.CONTAINER__COMPONENTS:
                getComponents().clear();
                getComponents().addAll((Collection<? extends Component>)newValue);
                return;
            case ViewPackage.CONTAINER__LAYOUT:
                setLayout((LayoutType)newValue);
                return;
            case ViewPackage.CONTAINER__TITLE:
                setTitle((String)newValue);
                return;
            case ViewPackage.CONTAINER__ALIGNMENT:
                setAlignment((AlignmentType)newValue);
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
            case ViewPackage.CONTAINER__COMPONENTS:
                getComponents().clear();
                return;
            case ViewPackage.CONTAINER__LAYOUT:
                setLayout(LAYOUT_EDEFAULT);
                return;
            case ViewPackage.CONTAINER__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case ViewPackage.CONTAINER__ALIGNMENT:
                setAlignment(ALIGNMENT_EDEFAULT);
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
            case ViewPackage.CONTAINER__COMPONENTS:
                return components != null && !components.isEmpty();
            case ViewPackage.CONTAINER__LAYOUT:
                return layout != LAYOUT_EDEFAULT;
            case ViewPackage.CONTAINER__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case ViewPackage.CONTAINER__ALIGNMENT:
                return alignment != ALIGNMENT_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (layout: ");
        result.append(layout);
        result.append(", title: ");
        result.append(title);
        result.append(", alignment: ");
        result.append(alignment);
        result.append(')');
        return result.toString();
    }

} //ContainerImpl
