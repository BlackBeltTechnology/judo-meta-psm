/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.Function;
import hu.blackbelt.judo.meta.psm.facade.OrderDirection;
import hu.blackbelt.judo.meta.psm.facade.Property;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getPath <em>Path</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getOrderIndex <em>Order Index</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getOrderDirection <em>Order Direction</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#isViewable <em>Viewable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType;

    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected static final Function FUNCTION_EDEFAULT = Function.VALUE;

    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected Function function = FUNCTION_EDEFAULT;

    /**
     * The default value of the '{@link #getOrderIndex() <em>Order Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderIndex()
     * @generated
     * @ordered
     */
    protected static final int ORDER_INDEX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getOrderIndex() <em>Order Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderIndex()
     * @generated
     * @ordered
     */
    protected int orderIndex = ORDER_INDEX_EDEFAULT;

    /**
     * The default value of the '{@link #getOrderDirection() <em>Order Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderDirection()
     * @generated
     * @ordered
     */
    protected static final OrderDirection ORDER_DIRECTION_EDEFAULT = OrderDirection.ASC;

    /**
     * The cached value of the '{@link #getOrderDirection() <em>Order Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderDirection()
     * @generated
     * @ordered
     */
    protected OrderDirection orderDirection = ORDER_DIRECTION_EDEFAULT;

    /**
     * The default value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFilterable()
     * @generated
     * @ordered
     */
    protected static final boolean FILTERABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFilterable()
     * @generated
     * @ordered
     */
    protected boolean filterable = FILTERABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isViewable() <em>Viewable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isViewable()
     * @generated
     * @ordered
     */
    protected static final boolean VIEWABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isViewable() <em>Viewable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isViewable()
     * @generated
     * @ordered
     */
    protected boolean viewable = VIEWABLE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType getDataType() {
        if (dataType != null && dataType.eIsProxy()) {
            InternalEObject oldDataType = (InternalEObject)dataType;
            dataType = (DataType)eResolveProxy(oldDataType);
            if (dataType != oldDataType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
            }
        }
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType basicGetDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataType(DataType newDataType) {
        DataType oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Function getFunction() {
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFunction(Function newFunction) {
        Function oldFunction = function;
        function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__FUNCTION, oldFunction, function));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getOrderIndex() {
        return orderIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrderIndex(int newOrderIndex) {
        int oldOrderIndex = orderIndex;
        orderIndex = newOrderIndex;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__ORDER_INDEX, oldOrderIndex, orderIndex));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrderDirection getOrderDirection() {
        return orderDirection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrderDirection(OrderDirection newOrderDirection) {
        OrderDirection oldOrderDirection = orderDirection;
        orderDirection = newOrderDirection == null ? ORDER_DIRECTION_EDEFAULT : newOrderDirection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__ORDER_DIRECTION, oldOrderDirection, orderDirection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFilterable() {
        return filterable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilterable(boolean newFilterable) {
        boolean oldFilterable = filterable;
        filterable = newFilterable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__FILTERABLE, oldFilterable, filterable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isViewable() {
        return viewable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setViewable(boolean newViewable) {
        boolean oldViewable = viewable;
        viewable = newViewable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__VIEWABLE, oldViewable, viewable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.PROPERTY__DATA_TYPE:
                if (resolve) return getDataType();
                return basicGetDataType();
            case FacadePackage.PROPERTY__PATH:
                return getPath();
            case FacadePackage.PROPERTY__FUNCTION:
                return getFunction();
            case FacadePackage.PROPERTY__ORDER_INDEX:
                return getOrderIndex();
            case FacadePackage.PROPERTY__ORDER_DIRECTION:
                return getOrderDirection();
            case FacadePackage.PROPERTY__FILTERABLE:
                return isFilterable();
            case FacadePackage.PROPERTY__VIEWABLE:
                return isViewable();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FacadePackage.PROPERTY__DATA_TYPE:
                setDataType((DataType)newValue);
                return;
            case FacadePackage.PROPERTY__PATH:
                setPath((String)newValue);
                return;
            case FacadePackage.PROPERTY__FUNCTION:
                setFunction((Function)newValue);
                return;
            case FacadePackage.PROPERTY__ORDER_INDEX:
                setOrderIndex((Integer)newValue);
                return;
            case FacadePackage.PROPERTY__ORDER_DIRECTION:
                setOrderDirection((OrderDirection)newValue);
                return;
            case FacadePackage.PROPERTY__FILTERABLE:
                setFilterable((Boolean)newValue);
                return;
            case FacadePackage.PROPERTY__VIEWABLE:
                setViewable((Boolean)newValue);
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
            case FacadePackage.PROPERTY__DATA_TYPE:
                setDataType((DataType)null);
                return;
            case FacadePackage.PROPERTY__PATH:
                setPath(PATH_EDEFAULT);
                return;
            case FacadePackage.PROPERTY__FUNCTION:
                setFunction(FUNCTION_EDEFAULT);
                return;
            case FacadePackage.PROPERTY__ORDER_INDEX:
                setOrderIndex(ORDER_INDEX_EDEFAULT);
                return;
            case FacadePackage.PROPERTY__ORDER_DIRECTION:
                setOrderDirection(ORDER_DIRECTION_EDEFAULT);
                return;
            case FacadePackage.PROPERTY__FILTERABLE:
                setFilterable(FILTERABLE_EDEFAULT);
                return;
            case FacadePackage.PROPERTY__VIEWABLE:
                setViewable(VIEWABLE_EDEFAULT);
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
            case FacadePackage.PROPERTY__DATA_TYPE:
                return dataType != null;
            case FacadePackage.PROPERTY__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
            case FacadePackage.PROPERTY__FUNCTION:
                return function != FUNCTION_EDEFAULT;
            case FacadePackage.PROPERTY__ORDER_INDEX:
                return orderIndex != ORDER_INDEX_EDEFAULT;
            case FacadePackage.PROPERTY__ORDER_DIRECTION:
                return orderDirection != ORDER_DIRECTION_EDEFAULT;
            case FacadePackage.PROPERTY__FILTERABLE:
                return filterable != FILTERABLE_EDEFAULT;
            case FacadePackage.PROPERTY__VIEWABLE:
                return viewable != VIEWABLE_EDEFAULT;
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
        result.append(" (path: ");
        result.append(path);
        result.append(", function: ");
        result.append(function);
        result.append(", orderIndex: ");
        result.append(orderIndex);
        result.append(", orderDirection: ");
        result.append(orderDirection);
        result.append(", filterable: ");
        result.append(filterable);
        result.append(", viewable: ");
        result.append(viewable);
        result.append(')');
        return result.toString();
    }

} //PropertyImpl
