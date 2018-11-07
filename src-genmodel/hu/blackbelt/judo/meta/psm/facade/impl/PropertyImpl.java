/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.Property;
import hu.blackbelt.judo.meta.psm.facade.ReadProperty;
import hu.blackbelt.judo.meta.psm.facade.WriteProperty;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.DataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getReadDefinition <em>Read Definition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl#getWriteDefinition <em>Write Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PropertyImpl extends NamedElementImpl implements Property {
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
     * The cached value of the '{@link #getReadDefinition() <em>Read Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadDefinition()
     * @generated
     * @ordered
     */
    protected ReadProperty readDefinition;

    /**
     * The cached value of the '{@link #getWriteDefinition() <em>Write Definition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteDefinition()
     * @generated
     * @ordered
     */
    protected WriteProperty writeDefinition;

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
    public ReadProperty getReadDefinition() {
        return readDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReadDefinition(ReadProperty newReadDefinition, NotificationChain msgs) {
        ReadProperty oldReadDefinition = readDefinition;
        readDefinition = newReadDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__READ_DEFINITION, oldReadDefinition, newReadDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadDefinition(ReadProperty newReadDefinition) {
        if (newReadDefinition != readDefinition) {
            NotificationChain msgs = null;
            if (readDefinition != null)
                msgs = ((InternalEObject)readDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.PROPERTY__READ_DEFINITION, null, msgs);
            if (newReadDefinition != null)
                msgs = ((InternalEObject)newReadDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.PROPERTY__READ_DEFINITION, null, msgs);
            msgs = basicSetReadDefinition(newReadDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__READ_DEFINITION, newReadDefinition, newReadDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WriteProperty getWriteDefinition() {
        return writeDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWriteDefinition(WriteProperty newWriteDefinition, NotificationChain msgs) {
        WriteProperty oldWriteDefinition = writeDefinition;
        writeDefinition = newWriteDefinition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__WRITE_DEFINITION, oldWriteDefinition, newWriteDefinition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWriteDefinition(WriteProperty newWriteDefinition) {
        if (newWriteDefinition != writeDefinition) {
            NotificationChain msgs = null;
            if (writeDefinition != null)
                msgs = ((InternalEObject)writeDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.PROPERTY__WRITE_DEFINITION, null, msgs);
            if (newWriteDefinition != null)
                msgs = ((InternalEObject)newWriteDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.PROPERTY__WRITE_DEFINITION, null, msgs);
            msgs = basicSetWriteDefinition(newWriteDefinition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.PROPERTY__WRITE_DEFINITION, newWriteDefinition, newWriteDefinition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FacadePackage.PROPERTY__READ_DEFINITION:
                return basicSetReadDefinition(null, msgs);
            case FacadePackage.PROPERTY__WRITE_DEFINITION:
                return basicSetWriteDefinition(null, msgs);
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
            case FacadePackage.PROPERTY__DATA_TYPE:
                if (resolve) return getDataType();
                return basicGetDataType();
            case FacadePackage.PROPERTY__READ_DEFINITION:
                return getReadDefinition();
            case FacadePackage.PROPERTY__WRITE_DEFINITION:
                return getWriteDefinition();
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
            case FacadePackage.PROPERTY__READ_DEFINITION:
                setReadDefinition((ReadProperty)newValue);
                return;
            case FacadePackage.PROPERTY__WRITE_DEFINITION:
                setWriteDefinition((WriteProperty)newValue);
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
            case FacadePackage.PROPERTY__READ_DEFINITION:
                setReadDefinition((ReadProperty)null);
                return;
            case FacadePackage.PROPERTY__WRITE_DEFINITION:
                setWriteDefinition((WriteProperty)null);
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
            case FacadePackage.PROPERTY__READ_DEFINITION:
                return readDefinition != null;
            case FacadePackage.PROPERTY__WRITE_DEFINITION:
                return writeDefinition != null;
        }
        return super.eIsSet(featureID);
    }

} //PropertyImpl
