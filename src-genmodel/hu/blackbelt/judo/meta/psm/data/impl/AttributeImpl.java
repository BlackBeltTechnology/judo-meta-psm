/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.DataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl#isIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {
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
     * The default value of the '{@link #isIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdentifier()
     * @generated
     * @ordered
     */
    protected static final boolean IDENTIFIER_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIdentifier() <em>Identifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdentifier()
     * @generated
     * @ordered
     */
    protected boolean identifier = IDENTIFIER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.ATTRIBUTE;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ATTRIBUTE__REQUIRED, oldRequired, required));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIdentifier() {
        return identifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdentifier(boolean newIdentifier) {
        boolean oldIdentifier = identifier;
        identifier = newIdentifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ATTRIBUTE__IDENTIFIER, oldIdentifier, identifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataPackage.ATTRIBUTE__DATA_TYPE:
                if (resolve) return getDataType();
                return basicGetDataType();
            case DataPackage.ATTRIBUTE__REQUIRED:
                return isRequired();
            case DataPackage.ATTRIBUTE__IDENTIFIER:
                return isIdentifier();
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
            case DataPackage.ATTRIBUTE__DATA_TYPE:
                setDataType((DataType)newValue);
                return;
            case DataPackage.ATTRIBUTE__REQUIRED:
                setRequired((Boolean)newValue);
                return;
            case DataPackage.ATTRIBUTE__IDENTIFIER:
                setIdentifier((Boolean)newValue);
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
            case DataPackage.ATTRIBUTE__DATA_TYPE:
                setDataType((DataType)null);
                return;
            case DataPackage.ATTRIBUTE__REQUIRED:
                setRequired(REQUIRED_EDEFAULT);
                return;
            case DataPackage.ATTRIBUTE__IDENTIFIER:
                setIdentifier(IDENTIFIER_EDEFAULT);
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
            case DataPackage.ATTRIBUTE__DATA_TYPE:
                return dataType != null;
            case DataPackage.ATTRIBUTE__REQUIRED:
                return required != REQUIRED_EDEFAULT;
            case DataPackage.ATTRIBUTE__IDENTIFIER:
                return identifier != IDENTIFIER_EDEFAULT;
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
        result.append(" (required: ");
        result.append(required);
        result.append(", identifier: ");
        result.append(identifier);
        result.append(')');
        return result.toString();
    }

} //AttributeImpl
