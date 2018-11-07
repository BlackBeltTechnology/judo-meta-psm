/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.CreateOperation;
import hu.blackbelt.judo.meta.psm.facade.DeleteOperation;
import hu.blackbelt.judo.meta.psm.facade.Facade;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.PropertySet;
import hu.blackbelt.judo.meta.psm.facade.UpdateOperation;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getPropertySet <em>Property Set</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getUpdateOperation <em>Update Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getCreateOperation <em>Create Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl#getDeleteOperation <em>Delete Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FacadeImpl extends NamedElementImpl implements Facade {
    /**
     * The cached value of the '{@link #getPropertySet() <em>Property Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertySet()
     * @generated
     * @ordered
     */
    protected PropertySet propertySet;

    /**
     * The cached value of the '{@link #getUpdateOperation() <em>Update Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdateOperation()
     * @generated
     * @ordered
     */
    protected UpdateOperation updateOperation;

    /**
     * The cached value of the '{@link #getCreateOperation() <em>Create Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateOperation()
     * @generated
     * @ordered
     */
    protected CreateOperation createOperation;

    /**
     * The cached value of the '{@link #getDeleteOperation() <em>Delete Operation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteOperation()
     * @generated
     * @ordered
     */
    protected DeleteOperation deleteOperation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FacadeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.FACADE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertySet getPropertySet() {
        if (propertySet != null && propertySet.eIsProxy()) {
            InternalEObject oldPropertySet = (InternalEObject)propertySet;
            propertySet = (PropertySet)eResolveProxy(oldPropertySet);
            if (propertySet != oldPropertySet) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.FACADE__PROPERTY_SET, oldPropertySet, propertySet));
            }
        }
        return propertySet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertySet basicGetPropertySet() {
        return propertySet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropertySet(PropertySet newPropertySet) {
        PropertySet oldPropertySet = propertySet;
        propertySet = newPropertySet;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__PROPERTY_SET, oldPropertySet, propertySet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UpdateOperation getUpdateOperation() {
        return updateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpdateOperation(UpdateOperation newUpdateOperation, NotificationChain msgs) {
        UpdateOperation oldUpdateOperation = updateOperation;
        updateOperation = newUpdateOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__UPDATE_OPERATION, oldUpdateOperation, newUpdateOperation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpdateOperation(UpdateOperation newUpdateOperation) {
        if (newUpdateOperation != updateOperation) {
            NotificationChain msgs = null;
            if (updateOperation != null)
                msgs = ((InternalEObject)updateOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.FACADE__UPDATE_OPERATION, null, msgs);
            if (newUpdateOperation != null)
                msgs = ((InternalEObject)newUpdateOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.FACADE__UPDATE_OPERATION, null, msgs);
            msgs = basicSetUpdateOperation(newUpdateOperation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__UPDATE_OPERATION, newUpdateOperation, newUpdateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CreateOperation getCreateOperation() {
        return createOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCreateOperation(CreateOperation newCreateOperation, NotificationChain msgs) {
        CreateOperation oldCreateOperation = createOperation;
        createOperation = newCreateOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__CREATE_OPERATION, oldCreateOperation, newCreateOperation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreateOperation(CreateOperation newCreateOperation) {
        if (newCreateOperation != createOperation) {
            NotificationChain msgs = null;
            if (createOperation != null)
                msgs = ((InternalEObject)createOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.FACADE__CREATE_OPERATION, null, msgs);
            if (newCreateOperation != null)
                msgs = ((InternalEObject)newCreateOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.FACADE__CREATE_OPERATION, null, msgs);
            msgs = basicSetCreateOperation(newCreateOperation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__CREATE_OPERATION, newCreateOperation, newCreateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeleteOperation getDeleteOperation() {
        return deleteOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDeleteOperation(DeleteOperation newDeleteOperation, NotificationChain msgs) {
        DeleteOperation oldDeleteOperation = deleteOperation;
        deleteOperation = newDeleteOperation;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__DELETE_OPERATION, oldDeleteOperation, newDeleteOperation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeleteOperation(DeleteOperation newDeleteOperation) {
        if (newDeleteOperation != deleteOperation) {
            NotificationChain msgs = null;
            if (deleteOperation != null)
                msgs = ((InternalEObject)deleteOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FacadePackage.FACADE__DELETE_OPERATION, null, msgs);
            if (newDeleteOperation != null)
                msgs = ((InternalEObject)newDeleteOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FacadePackage.FACADE__DELETE_OPERATION, null, msgs);
            msgs = basicSetDeleteOperation(newDeleteOperation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.FACADE__DELETE_OPERATION, newDeleteOperation, newDeleteOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FacadePackage.FACADE__UPDATE_OPERATION:
                return basicSetUpdateOperation(null, msgs);
            case FacadePackage.FACADE__CREATE_OPERATION:
                return basicSetCreateOperation(null, msgs);
            case FacadePackage.FACADE__DELETE_OPERATION:
                return basicSetDeleteOperation(null, msgs);
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
            case FacadePackage.FACADE__PROPERTY_SET:
                if (resolve) return getPropertySet();
                return basicGetPropertySet();
            case FacadePackage.FACADE__UPDATE_OPERATION:
                return getUpdateOperation();
            case FacadePackage.FACADE__CREATE_OPERATION:
                return getCreateOperation();
            case FacadePackage.FACADE__DELETE_OPERATION:
                return getDeleteOperation();
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
            case FacadePackage.FACADE__PROPERTY_SET:
                setPropertySet((PropertySet)newValue);
                return;
            case FacadePackage.FACADE__UPDATE_OPERATION:
                setUpdateOperation((UpdateOperation)newValue);
                return;
            case FacadePackage.FACADE__CREATE_OPERATION:
                setCreateOperation((CreateOperation)newValue);
                return;
            case FacadePackage.FACADE__DELETE_OPERATION:
                setDeleteOperation((DeleteOperation)newValue);
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
            case FacadePackage.FACADE__PROPERTY_SET:
                setPropertySet((PropertySet)null);
                return;
            case FacadePackage.FACADE__UPDATE_OPERATION:
                setUpdateOperation((UpdateOperation)null);
                return;
            case FacadePackage.FACADE__CREATE_OPERATION:
                setCreateOperation((CreateOperation)null);
                return;
            case FacadePackage.FACADE__DELETE_OPERATION:
                setDeleteOperation((DeleteOperation)null);
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
            case FacadePackage.FACADE__PROPERTY_SET:
                return propertySet != null;
            case FacadePackage.FACADE__UPDATE_OPERATION:
                return updateOperation != null;
            case FacadePackage.FACADE__CREATE_OPERATION:
                return createOperation != null;
            case FacadePackage.FACADE__DELETE_OPERATION:
                return deleteOperation != null;
        }
        return super.eIsSet(featureID);
    }

} //FacadeImpl
