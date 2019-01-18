/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.NavigationExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.Variable;
import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation From Object Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionNavigationFromObjectExpressionImpl extends MinimalEObjectImpl.Container implements CollectionNavigationFromObjectExpression {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceName()
     * @generated
     * @ordered
     */
    protected static final String REFERENCE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceName()
     * @generated
     * @ordered
     */
    protected String referenceName = REFERENCE_NAME_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CollectionNavigationFromObjectExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CollectionPackage.Literals.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferenceName(String newReferenceName) {
        String oldReferenceName = referenceName;
        referenceName = newReferenceName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME, oldReferenceName, referenceName));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION, oldObjectExpression, newObjectExpression);
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
                msgs = ((InternalEObject)objectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
            if (newObjectExpression != null)
                msgs = ((InternalEObject)newObjectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
            msgs = basicSetObjectExpression(newObjectExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION, newObjectExpression, newObjectExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION:
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
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME:
                return getName();
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME:
                return getReferenceName();
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION:
                return getObjectExpression();
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
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME:
                setName((String)newValue);
                return;
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME:
                setReferenceName((String)newValue);
                return;
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)newValue);
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
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME:
                setReferenceName(REFERENCE_NAME_EDEFAULT);
                return;
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)null);
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
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME:
                return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION:
                return objectExpression != null;
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
        if (baseClass == Variable.class) {
            switch (derivedFeatureID) {
                case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME: return VariablePackage.VARIABLE__NAME;
                default: return -1;
            }
        }
        if (baseClass == ObjectVariable.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NavigationExpression.class) {
            switch (derivedFeatureID) {
                case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME: return ExpressionPackage.NAVIGATION_EXPRESSION__REFERENCE_NAME;
                default: return -1;
            }
        }
        if (baseClass == ReferenceSelector.class) {
            switch (derivedFeatureID) {
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
        if (baseClass == Variable.class) {
            switch (baseFeatureID) {
                case VariablePackage.VARIABLE__NAME: return CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME;
                default: return -1;
            }
        }
        if (baseClass == ObjectVariable.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NavigationExpression.class) {
            switch (baseFeatureID) {
                case ExpressionPackage.NAVIGATION_EXPRESSION__REFERENCE_NAME: return CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME;
                default: return -1;
            }
        }
        if (baseClass == ReferenceSelector.class) {
            switch (baseFeatureID) {
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
        result.append(" (name: ");
        result.append(name);
        result.append(", referenceName: ");
        result.append(referenceName);
        result.append(')');
        return result.toString();
    }

} //CollectionNavigationFromObjectExpressionImpl
