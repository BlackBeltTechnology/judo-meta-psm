/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical.impl;

import hu.blackbelt.judo.meta.psm.expression.ElementName;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

import hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage;
import hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Of Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.TypeOfExpressionImpl#getObjectExpression <em>Object Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.TypeOfExpressionImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOfExpressionImpl extends MinimalEObjectImpl.Container implements TypeOfExpression {
    /**
     * The cached value of the '{@link #getObjectExpression() <em>Object Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectExpression()
     * @generated
     * @ordered
     */
    protected ObjectExpression objectExpression;

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
    protected TypeOfExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LogicalPackage.Literals.TYPE_OF_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectExpression getObjectExpression() {
        return objectExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObjectExpression(ObjectExpression newObjectExpression, NotificationChain msgs) {
        ObjectExpression oldObjectExpression = objectExpression;
        objectExpression = newObjectExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION, oldObjectExpression, newObjectExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectExpression(ObjectExpression newObjectExpression) {
        if (newObjectExpression != objectExpression) {
            NotificationChain msgs = null;
            if (objectExpression != null)
                msgs = ((InternalEObject)objectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
            if (newObjectExpression != null)
                msgs = ((InternalEObject)newObjectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
            msgs = basicSetObjectExpression(newObjectExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION, newObjectExpression, newObjectExpression));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalPackage.TYPE_OF_EXPRESSION__ELEMENT_NAME, oldElementName, elementName));
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
            eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.TYPE_OF_EXPRESSION__ELEMENT_NAME, oldElementName, elementName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION:
                return basicSetObjectExpression(null, msgs);
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
            case LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION:
                return getObjectExpression();
            case LogicalPackage.TYPE_OF_EXPRESSION__ELEMENT_NAME:
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
            case LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)newValue);
                return;
            case LogicalPackage.TYPE_OF_EXPRESSION__ELEMENT_NAME:
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
            case LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)null);
                return;
            case LogicalPackage.TYPE_OF_EXPRESSION__ELEMENT_NAME:
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
            case LogicalPackage.TYPE_OF_EXPRESSION__OBJECT_EXPRESSION:
                return objectExpression != null;
            case LogicalPackage.TYPE_OF_EXPRESSION__ELEMENT_NAME:
                return elementName != null;
        }
        return super.eIsSet(featureID);
    }

} //TypeOfExpressionImpl
