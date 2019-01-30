/**
 */
package hu.blackbelt.judo.meta.psm.expression.operator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decimal Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.operator.OperatorPackage#getDecimalOperator()
 * @model
 * @generated
 */
public enum DecimalOperator implements Enumerator {
    /**
     * The '<em><b>Add</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ADD_VALUE
     * @generated
     * @ordered
     */
    ADD(0, "add", "+"),

    /**
     * The '<em><b>Substract</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTRACT_VALUE
     * @generated
     * @ordered
     */
    SUBSTRACT(1, "substract", "-"),

    /**
     * The '<em><b>Multiply</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MULTIPLY_VALUE
     * @generated
     * @ordered
     */
    MULTIPLY(2, "multiply", "*"),

    /**
     * The '<em><b>Divide</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DIVIDE_VALUE
     * @generated
     * @ordered
     */
    DIVIDE(3, "divide", "/");

    /**
     * The '<em><b>Add</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Add</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ADD
     * @model name="add" literal="+"
     * @generated
     * @ordered
     */
    public static final int ADD_VALUE = 0;

    /**
     * The '<em><b>Substract</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substract</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTRACT
     * @model name="substract" literal="-"
     * @generated
     * @ordered
     */
    public static final int SUBSTRACT_VALUE = 1;

    /**
     * The '<em><b>Multiply</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Multiply</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MULTIPLY
     * @model name="multiply" literal="*"
     * @generated
     * @ordered
     */
    public static final int MULTIPLY_VALUE = 2;

    /**
     * The '<em><b>Divide</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Divide</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DIVIDE
     * @model name="divide" literal="/"
     * @generated
     * @ordered
     */
    public static final int DIVIDE_VALUE = 3;

    /**
     * An array of all the '<em><b>Decimal Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DecimalOperator[] VALUES_ARRAY =
        new DecimalOperator[] {
            ADD,
            SUBSTRACT,
            MULTIPLY,
            DIVIDE,
        };

    /**
     * A public read-only list of all the '<em><b>Decimal Operator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DecimalOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Decimal Operator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DecimalOperator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DecimalOperator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Decimal Operator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DecimalOperator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DecimalOperator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Decimal Operator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DecimalOperator get(int value) {
        switch (value) {
            case ADD_VALUE: return ADD;
            case SUBSTRACT_VALUE: return SUBSTRACT;
            case MULTIPLY_VALUE: return MULTIPLY;
            case DIVIDE_VALUE: return DIVIDE;
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
    private DecimalOperator(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
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
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //DecimalOperator