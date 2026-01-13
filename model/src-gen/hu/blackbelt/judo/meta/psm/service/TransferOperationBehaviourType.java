/**
 */
package hu.blackbelt.judo.meta.psm.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transfer Operation Behaviour Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperationBehaviourType()
 * @model
 * @generated
 */
public enum TransferOperationBehaviourType implements Enumerator
{
	/**
	 * The '<em><b>GET TEMPLATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	GET_TEMPLATE(17, "GET_TEMPLATE", "GET_TEMPLATE"),

	/**
	 * The '<em><b>GET PRINCIPAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_PRINCIPAL_VALUE
	 * @generated
	 * @ordered
	 */
	GET_PRINCIPAL(18, "GET_PRINCIPAL", "GET_PRINCIPAL"),

	/**
	 * The '<em><b>LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(20, "LIST", "LIST"),

	/**
	 * The '<em><b>CREATE INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_INSTANCE(21, "CREATE_INSTANCE", "CREATE_INSTANCE"),

	/**
	 * The '<em><b>VALIDATE CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATE_CREATE(22, "VALIDATE_CREATE", "VALIDATE_CREATE"),

	/**
	 * The '<em><b>REFRESH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH_VALUE
	 * @generated
	 * @ordered
	 */
	REFRESH(23, "REFRESH", "REFRESH"),

	/**
	 * The '<em><b>UPDATE INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_INSTANCE(24, "UPDATE_INSTANCE", "UPDATE_INSTANCE"),

	/**
	 * The '<em><b>VALIDATE UPDATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATE_UPDATE(25, "VALIDATE_UPDATE", "VALIDATE_UPDATE"),

	/**
	 * The '<em><b>DELETE INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE_INSTANCE(26, "DELETE_INSTANCE", "DELETE_INSTANCE"),

	/**
	 * The '<em><b>SET REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SET_REFERENCE(27, "SET_REFERENCE", "SET_REFERENCE"),

	/**
	 * The '<em><b>UNSET REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET_REFERENCE(28, "UNSET_REFERENCE", "UNSET_REFERENCE"),

	/**
	 * The '<em><b>ADD REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ADD_REFERENCE(29, "ADD_REFERENCE", "ADD_REFERENCE"),

	/**
	 * The '<em><b>REMOVE REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_REFERENCE(30, "REMOVE_REFERENCE", "REMOVE_REFERENCE"),

	/**
	 * The '<em><b>GET RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	GET_RANGE(31, "GET_RANGE", "GET_RANGE"),

	/**
	 * The '<em><b>GET METADATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	GET_METADATA(14, "GET_METADATA", "GET_METADATA"),

	/**
	 * The '<em><b>GET UPLOAD TOKEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_UPLOAD_TOKEN_VALUE
	 * @generated
	 * @ordered
	 */
	GET_UPLOAD_TOKEN(15, "GET_UPLOAD_TOKEN", "GET_UPLOAD_TOKEN"),

	/**
	 * The '<em><b>EXPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPORT(16, "EXPORT", "EXPORT"),

	/**
	 * The '<em><b>VALIDATE OPERATION INPUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_OPERATION_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATE_OPERATION_INPUT(25, "VALIDATE_OPERATION_INPUT", "VALIDATE_OPERATION_INPUT");

	/**
	 * The '<em><b>GET TEMPLATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_TEMPLATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_TEMPLATE_VALUE = 17;

	/**
	 * The '<em><b>GET PRINCIPAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_PRINCIPAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_PRINCIPAL_VALUE = 18;

	/**
	 * The '<em><b>LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 20;

	/**
	 * The '<em><b>CREATE INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_INSTANCE_VALUE = 21;

	/**
	 * The '<em><b>VALIDATE CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATE_CREATE_VALUE = 22;

	/**
	 * The '<em><b>REFRESH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFRESH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH_VALUE = 23;

	/**
	 * The '<em><b>UPDATE INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_INSTANCE_VALUE = 24;

	/**
	 * The '<em><b>VALIDATE UPDATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_UPDATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATE_UPDATE_VALUE = 25;

	/**
	 * The '<em><b>DELETE INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_INSTANCE_VALUE = 26;

	/**
	 * The '<em><b>SET REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_REFERENCE_VALUE = 27;

	/**
	 * The '<em><b>UNSET REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_REFERENCE_VALUE = 28;

	/**
	 * The '<em><b>ADD REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADD_REFERENCE_VALUE = 29;

	/**
	 * The '<em><b>REMOVE REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_REFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_REFERENCE_VALUE = 30;

	/**
	 * The '<em><b>GET RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_RANGE_VALUE = 31;

	/**
	 * The '<em><b>GET METADATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_METADATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_METADATA_VALUE = 14;

	/**
	 * The '<em><b>GET UPLOAD TOKEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_UPLOAD_TOKEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_UPLOAD_TOKEN_VALUE = 15;

	/**
	 * The '<em><b>EXPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPORT_VALUE = 16;

	/**
	 * The '<em><b>VALIDATE OPERATION INPUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATE_OPERATION_INPUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATE_OPERATION_INPUT_VALUE = 25;

	/**
	 * An array of all the '<em><b>Transfer Operation Behaviour Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransferOperationBehaviourType[] VALUES_ARRAY =
		new TransferOperationBehaviourType[]
		{
			GET_TEMPLATE,
			GET_PRINCIPAL,
			LIST,
			CREATE_INSTANCE,
			VALIDATE_CREATE,
			REFRESH,
			UPDATE_INSTANCE,
			VALIDATE_UPDATE,
			DELETE_INSTANCE,
			SET_REFERENCE,
			UNSET_REFERENCE,
			ADD_REFERENCE,
			REMOVE_REFERENCE,
			GET_RANGE,
			GET_METADATA,
			GET_UPLOAD_TOKEN,
			EXPORT,
			VALIDATE_OPERATION_INPUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Transfer Operation Behaviour Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransferOperationBehaviourType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transfer Operation Behaviour Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransferOperationBehaviourType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			TransferOperationBehaviourType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Operation Behaviour Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransferOperationBehaviourType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			TransferOperationBehaviourType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Operation Behaviour Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransferOperationBehaviourType get(int value)
	{
		switch (value)
		{
			case GET_TEMPLATE_VALUE: return GET_TEMPLATE;
			case GET_PRINCIPAL_VALUE: return GET_PRINCIPAL;
			case LIST_VALUE: return LIST;
			case CREATE_INSTANCE_VALUE: return CREATE_INSTANCE;
			case VALIDATE_CREATE_VALUE: return VALIDATE_CREATE;
			case REFRESH_VALUE: return REFRESH;
			case UPDATE_INSTANCE_VALUE: return UPDATE_INSTANCE;
			case VALIDATE_UPDATE_VALUE: return VALIDATE_UPDATE;
			case DELETE_INSTANCE_VALUE: return DELETE_INSTANCE;
			case SET_REFERENCE_VALUE: return SET_REFERENCE;
			case UNSET_REFERENCE_VALUE: return UNSET_REFERENCE;
			case ADD_REFERENCE_VALUE: return ADD_REFERENCE;
			case REMOVE_REFERENCE_VALUE: return REMOVE_REFERENCE;
			case GET_RANGE_VALUE: return GET_RANGE;
			case GET_METADATA_VALUE: return GET_METADATA;
			case GET_UPLOAD_TOKEN_VALUE: return GET_UPLOAD_TOKEN;
			case EXPORT_VALUE: return EXPORT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TransferOperationBehaviourType(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //TransferOperationBehaviourType
