/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;
import hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCollectionExpressionImpl extends MinimalEObjectImpl.Container implements SubCollectionExpression {
	/**
	 * The cached value of the '{@link #getCollectionExpression() <em>Collection Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionExpression()
	 * @generated
	 * @ordered
	 */
	protected OrderedCollectionExpression collectionExpression;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression position;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression length;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubCollectionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.SUB_COLLECTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedCollectionExpression getCollectionExpression() {
		if (collectionExpression != null && collectionExpression.eIsProxy()) {
			InternalEObject oldCollectionExpression = (InternalEObject)collectionExpression;
			collectionExpression = (OrderedCollectionExpression)eResolveProxy(oldCollectionExpression);
			if (collectionExpression != oldCollectionExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION, oldCollectionExpression, collectionExpression));
			}
		}
		return collectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedCollectionExpression basicGetCollectionExpression() {
		return collectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionExpression(OrderedCollectionExpression newCollectionExpression) {
		OrderedCollectionExpression oldCollectionExpression = collectionExpression;
		collectionExpression = newCollectionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION, oldCollectionExpression, collectionExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (IntegerExpression)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.SUB_COLLECTION_EXPRESSION__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IntegerExpression newPosition) {
		IntegerExpression oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SUB_COLLECTION_EXPRESSION__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getLength() {
		if (length != null && length.eIsProxy()) {
			InternalEObject oldLength = (InternalEObject)length;
			length = (IntegerExpression)eResolveProxy(oldLength);
			if (length != oldLength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.SUB_COLLECTION_EXPRESSION__LENGTH, oldLength, length));
			}
		}
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression basicGetLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(IntegerExpression newLength) {
		IntegerExpression oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SUB_COLLECTION_EXPRESSION__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION:
				if (resolve) return getCollectionExpression();
				return basicGetCollectionExpression();
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__LENGTH:
				if (resolve) return getLength();
				return basicGetLength();
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
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION:
				setCollectionExpression((OrderedCollectionExpression)newValue);
				return;
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__POSITION:
				setPosition((IntegerExpression)newValue);
				return;
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__LENGTH:
				setLength((IntegerExpression)newValue);
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
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION:
				setCollectionExpression((OrderedCollectionExpression)null);
				return;
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__POSITION:
				setPosition((IntegerExpression)null);
				return;
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__LENGTH:
				setLength((IntegerExpression)null);
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
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION:
				return collectionExpression != null;
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__POSITION:
				return position != null;
			case CollectionPackage.SUB_COLLECTION_EXPRESSION__LENGTH:
				return length != null;
		}
		return super.eIsSet(featureID);
	}

} //SubCollectionExpressionImpl
