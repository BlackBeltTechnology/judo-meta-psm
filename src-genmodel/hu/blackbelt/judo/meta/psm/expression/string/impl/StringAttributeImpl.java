/**
 */
package hu.blackbelt.judo.meta.psm.expression.string.impl;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

import hu.blackbelt.judo.meta.psm.expression.string.StringAttribute;
import hu.blackbelt.judo.meta.psm.expression.string.StringPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.StringAttributeImpl#getObjectExpression <em>Object Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.StringAttributeImpl#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringAttributeImpl extends MinimalEObjectImpl.Container implements StringAttribute {
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
     * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeName()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeName()
     * @generated
     * @ordered
     */
    protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StringPackage.Literals.STRING_ATTRIBUTE;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION, oldObjectExpression, newObjectExpression);
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
                msgs = ((InternalEObject)objectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION, null, msgs);
            if (newObjectExpression != null)
                msgs = ((InternalEObject)newObjectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION, null, msgs);
            msgs = basicSetObjectExpression(newObjectExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION, newObjectExpression, newObjectExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeName(String newAttributeName) {
        String oldAttributeName = attributeName;
        attributeName = newAttributeName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION:
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
            case StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION:
                return getObjectExpression();
            case StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME:
                return getAttributeName();
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
            case StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)newValue);
                return;
            case StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME:
                setAttributeName((String)newValue);
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
            case StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)null);
                return;
            case StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME:
                setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
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
            case StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION:
                return objectExpression != null;
            case StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME:
                return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
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
        if (baseClass == AttributeSelector.class) {
            switch (derivedFeatureID) {
                case StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION: return ExpressionPackage.ATTRIBUTE_SELECTOR__OBJECT_EXPRESSION;
                case StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME: return ExpressionPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE_NAME;
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
        if (baseClass == AttributeSelector.class) {
            switch (baseFeatureID) {
                case ExpressionPackage.ATTRIBUTE_SELECTOR__OBJECT_EXPRESSION: return StringPackage.STRING_ATTRIBUTE__OBJECT_EXPRESSION;
                case ExpressionPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE_NAME: return StringPackage.STRING_ATTRIBUTE__ATTRIBUTE_NAME;
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
        result.append(" (attributeName: ");
        result.append(attributeName);
        result.append(')');
        return result.toString();
    }

} //StringAttributeImpl
