/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.expression.DataExpression;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;

import hu.blackbelt.judo.meta.psm.type.Primitive;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl#getInitExpression <em>Init Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferAttributeImpl extends NamedElementImpl implements TransferAttribute {
    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected Primitive dataType;

    /**
     * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRequired()
     * @generated
     * @ordered
     */
    protected static final boolean REQUIRED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRequired()
     * @generated
     * @ordered
     */
    protected boolean required = REQUIRED_EDEFAULT;

    /**
     * The cached value of the '{@link #getInitExpression() <em>Init Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitExpression()
     * @generated
     * @ordered
     */
    protected DataExpression initExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransferAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicePackage.Literals.TRANSFER_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Primitive getDataType() {
        if (dataType != null && dataType.eIsProxy()) {
            InternalEObject oldDataType = (InternalEObject)dataType;
            dataType = (Primitive)eResolveProxy(oldDataType);
            if (dataType != oldDataType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
            }
        }
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Primitive basicGetDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataType(Primitive newDataType) {
        Primitive oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequired(boolean newRequired) {
        boolean oldRequired = required;
        required = newRequired;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED, oldRequired, required));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataExpression getInitExpression() {
        return initExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitExpression(DataExpression newInitExpression, NotificationChain msgs) {
        DataExpression oldInitExpression = initExpression;
        initExpression = newInitExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION, oldInitExpression, newInitExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitExpression(DataExpression newInitExpression) {
        if (newInitExpression != initExpression) {
            NotificationChain msgs = null;
            if (initExpression != null)
                msgs = ((InternalEObject)initExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION, null, msgs);
            if (newInitExpression != null)
                msgs = ((InternalEObject)newInitExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION, null, msgs);
            msgs = basicSetInitExpression(newInitExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION, newInitExpression, newInitExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION:
                return basicSetInitExpression(null, msgs);
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
            case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
                if (resolve) return getDataType();
                return basicGetDataType();
            case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
                return isRequired();
            case ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION:
                return getInitExpression();
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
            case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
                setDataType((Primitive)newValue);
                return;
            case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
                setRequired((Boolean)newValue);
                return;
            case ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION:
                setInitExpression((DataExpression)newValue);
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
            case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
                setDataType((Primitive)null);
                return;
            case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
                setRequired(REQUIRED_EDEFAULT);
                return;
            case ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION:
                setInitExpression((DataExpression)null);
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
            case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE:
                return dataType != null;
            case ServicePackage.TRANSFER_ATTRIBUTE__REQUIRED:
                return required != REQUIRED_EDEFAULT;
            case ServicePackage.TRANSFER_ATTRIBUTE__INIT_EXPRESSION:
                return initExpression != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == PrimitiveTypedElement.class) {
            switch (derivedFeatureID) {
                case ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE: return DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == PrimitiveTypedElement.class) {
            switch (baseFeatureID) {
                case DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE: return ServicePackage.TRANSFER_ATTRIBUTE__DATA_TYPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
        result.append(" (required: ");
        result.append(required);
        result.append(')');
        return result.toString();
    }

} //TransferAttributeImpl
