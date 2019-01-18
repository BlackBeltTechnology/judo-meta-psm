/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant.impl;

import hu.blackbelt.judo.meta.psm.expression.ElementName;

import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;
import hu.blackbelt.judo.meta.psm.expression.constant.Instance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.InstanceImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends ConstantImpl implements Instance {
    /**
     * The cached value of the '{@link #getElementName() <em>Element Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementName()
     * @generated
     * @ordered
     */
    protected ElementName elementName;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ConstantPackage.Literals.INSTANCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementName getElementName() {
        if (elementName != null && elementName.eIsProxy()) {
            InternalEObject oldElementName = (InternalEObject)elementName;
            elementName = (ElementName)eResolveProxy(oldElementName);
            if (elementName != oldElementName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstantPackage.INSTANCE__ELEMENT_NAME, oldElementName, elementName));
            }
        }
        return elementName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementName basicGetElementName() {
        return elementName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElementName(ElementName newElementName) {
        ElementName oldElementName = elementName;
        elementName = newElementName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ConstantPackage.INSTANCE__ELEMENT_NAME, oldElementName, elementName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ConstantPackage.INSTANCE__ELEMENT_NAME:
                if (resolve) return getElementName();
                return basicGetElementName();
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
            case ConstantPackage.INSTANCE__ELEMENT_NAME:
                setElementName((ElementName)newValue);
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
            case ConstantPackage.INSTANCE__ELEMENT_NAME:
                setElementName((ElementName)null);
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
            case ConstantPackage.INSTANCE__ELEMENT_NAME:
                return elementName != null;
        }
        return super.eIsSet(featureID);
    }

} //InstanceImpl
