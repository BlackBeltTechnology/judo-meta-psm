/**
 */
package hu.blackbelt.judo.meta.psm.action.impl;

import hu.blackbelt.judo.meta.psm.action.ActionPackage;
import hu.blackbelt.judo.meta.psm.action.PrimitiveParameter;

import hu.blackbelt.judo.meta.psm.type.Primitive;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.impl.PrimitiveParameterImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveParameterImpl extends ParameterImpl implements PrimitiveParameter {
    /**
     * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimitiveType()
     * @generated
     * @ordered
     */
    protected Primitive primitiveType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PrimitiveParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.PRIMITIVE_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Primitive getPrimitiveType() {
        if (primitiveType != null && primitiveType.eIsProxy()) {
            InternalEObject oldPrimitiveType = (InternalEObject)primitiveType;
            primitiveType = (Primitive)eResolveProxy(oldPrimitiveType);
            if (primitiveType != oldPrimitiveType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionPackage.PRIMITIVE_PARAMETER__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
            }
        }
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Primitive basicGetPrimitiveType() {
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrimitiveType(Primitive newPrimitiveType) {
        Primitive oldPrimitiveType = primitiveType;
        primitiveType = newPrimitiveType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.PRIMITIVE_PARAMETER__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ActionPackage.PRIMITIVE_PARAMETER__PRIMITIVE_TYPE:
                if (resolve) return getPrimitiveType();
                return basicGetPrimitiveType();
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
            case ActionPackage.PRIMITIVE_PARAMETER__PRIMITIVE_TYPE:
                setPrimitiveType((Primitive)newValue);
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
            case ActionPackage.PRIMITIVE_PARAMETER__PRIMITIVE_TYPE:
                setPrimitiveType((Primitive)null);
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
            case ActionPackage.PRIMITIVE_PARAMETER__PRIMITIVE_TYPE:
                return primitiveType != null;
        }
        return super.eIsSet(featureID);
    }

} //PrimitiveParameterImpl
