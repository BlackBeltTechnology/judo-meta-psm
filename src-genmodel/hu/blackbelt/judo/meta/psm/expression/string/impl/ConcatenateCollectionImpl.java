/**
 */
package hu.blackbelt.judo.meta.psm.expression.string.impl;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;

import hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection;
import hu.blackbelt.judo.meta.psm.expression.string.StringPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concatenate Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcatenateCollectionImpl extends MinimalEObjectImpl.Container implements ConcatenateCollection {
	/**
	 * The cached value of the '{@link #getCollectionExpression() <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionExpression()
	 * @generated
	 * @ordered
	 */
	protected CollectionExpression collectionExpression;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression expression;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected StringExpression separator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcatenateCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringPackage.Literals.CONCATENATE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionExpression getCollectionExpression() {
		return collectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionExpression(CollectionExpression newCollectionExpression, NotificationChain msgs) {
		CollectionExpression oldCollectionExpression = collectionExpression;
		collectionExpression = newCollectionExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION, oldCollectionExpression, newCollectionExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionExpression(CollectionExpression newCollectionExpression) {
		if (newCollectionExpression != collectionExpression) {
			NotificationChain msgs = null;
			if (collectionExpression != null)
				msgs = ((InternalEObject)collectionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION, null, msgs);
			if (newCollectionExpression != null)
				msgs = ((InternalEObject)newCollectionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION, null, msgs);
			msgs = basicSetCollectionExpression(newCollectionExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION, newCollectionExpression, newCollectionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(StringExpression newExpression, NotificationChain msgs) {
		StringExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.CONCATENATE_COLLECTION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(StringExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.CONCATENATE_COLLECTION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.CONCATENATE_COLLECTION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.CONCATENATE_COLLECTION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeparator(StringExpression newSeparator, NotificationChain msgs) {
		StringExpression oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringPackage.CONCATENATE_COLLECTION__SEPARATOR, oldSeparator, newSeparator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(StringExpression newSeparator) {
		if (newSeparator != separator) {
			NotificationChain msgs = null;
			if (separator != null)
				msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringPackage.CONCATENATE_COLLECTION__SEPARATOR, null, msgs);
			if (newSeparator != null)
				msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringPackage.CONCATENATE_COLLECTION__SEPARATOR, null, msgs);
			msgs = basicSetSeparator(newSeparator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringPackage.CONCATENATE_COLLECTION__SEPARATOR, newSeparator, newSeparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION:
				return basicSetCollectionExpression(null, msgs);
			case StringPackage.CONCATENATE_COLLECTION__EXPRESSION:
				return basicSetExpression(null, msgs);
			case StringPackage.CONCATENATE_COLLECTION__SEPARATOR:
				return basicSetSeparator(null, msgs);
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
			case StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION:
				return getCollectionExpression();
			case StringPackage.CONCATENATE_COLLECTION__EXPRESSION:
				return getExpression();
			case StringPackage.CONCATENATE_COLLECTION__SEPARATOR:
				return getSeparator();
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
			case StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION:
				setCollectionExpression((CollectionExpression)newValue);
				return;
			case StringPackage.CONCATENATE_COLLECTION__EXPRESSION:
				setExpression((StringExpression)newValue);
				return;
			case StringPackage.CONCATENATE_COLLECTION__SEPARATOR:
				setSeparator((StringExpression)newValue);
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
			case StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION:
				setCollectionExpression((CollectionExpression)null);
				return;
			case StringPackage.CONCATENATE_COLLECTION__EXPRESSION:
				setExpression((StringExpression)null);
				return;
			case StringPackage.CONCATENATE_COLLECTION__SEPARATOR:
				setSeparator((StringExpression)null);
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
			case StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION:
				return collectionExpression != null;
			case StringPackage.CONCATENATE_COLLECTION__EXPRESSION:
				return expression != null;
			case StringPackage.CONCATENATE_COLLECTION__SEPARATOR:
				return separator != null;
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
		if (baseClass == AggregatedExpression.class) {
			switch (derivedFeatureID) {
				case StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION: return ExpressionPackage.AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION;
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
		if (baseClass == AggregatedExpression.class) {
			switch (baseFeatureID) {
				case ExpressionPackage.AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION: return StringPackage.CONCATENATE_COLLECTION__COLLECTION_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConcatenateCollectionImpl
