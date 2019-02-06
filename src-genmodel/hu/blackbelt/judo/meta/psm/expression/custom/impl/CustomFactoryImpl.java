/**
 */
package hu.blackbelt.judo.meta.psm.expression.custom.impl;

import hu.blackbelt.judo.meta.psm.expression.custom.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomFactoryImpl extends EFactoryImpl implements CustomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomFactory init() {
		try {
			CustomFactory theCustomFactory = (CustomFactory)EPackage.Registry.INSTANCE.getEFactory(CustomPackage.eNS_URI);
			if (theCustomFactory != null) {
				return theCustomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CustomPackage.CUSTOM_ATTRIBUTE: return createCustomAttribute();
			case CustomPackage.CUSTOM_SWITCH_EXPRESSION: return createCustomSwitchExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAttribute createCustomAttribute() {
		CustomAttributeImpl customAttribute = new CustomAttributeImpl();
		return customAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomSwitchExpression createCustomSwitchExpression() {
		CustomSwitchExpressionImpl customSwitchExpression = new CustomSwitchExpressionImpl();
		return customSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPackage getCustomPackage() {
		return (CustomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CustomPackage getPackage() {
		return CustomPackage.eINSTANCE;
	}

} //CustomFactoryImpl
