/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#getFunction()
 * @model
 * @generated
 */
public enum Function implements Enumerator {
    /**
     * The '<em><b>VALUE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VALUE_VALUE
     * @generated
     * @ordered
     */
    VALUE(0, "VALUE", "VALUE"),

    /**
     * The '<em><b>AVG</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AVG_VALUE
     * @generated
     * @ordered
     */
    AVG(1, "AVG", "AVG"),

    /**
     * The '<em><b>COUNT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COUNT_VALUE
     * @generated
     * @ordered
     */
    COUNT(2, "COUNT", "COUNT"),

    /**
     * The '<em><b>MIN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MIN_VALUE
     * @generated
     * @ordered
     */
    MIN(3, "MIN", "MIN"),

    /**
     * The '<em><b>MAX</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAX_VALUE
     * @generated
     * @ordered
     */
    MAX(4, "MAX", "MAX"),

    /**
     * The '<em><b>SUM</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUM_VALUE
     * @generated
     * @ordered
     */
    SUM(5, "SUM", "SUM");

    /**
     * The '<em><b>VALUE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VALUE
     * @model
     * @generated
     * @ordered
     */
    public static final int VALUE_VALUE = 0;

    /**
     * The '<em><b>AVG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>AVG</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AVG
     * @model
     * @generated
     * @ordered
     */
    public static final int AVG_VALUE = 1;

    /**
     * The '<em><b>COUNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>COUNT</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COUNT
     * @model
     * @generated
     * @ordered
     */
    public static final int COUNT_VALUE = 2;

    /**
     * The '<em><b>MIN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MIN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MIN
     * @model
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE = 3;

    /**
     * The '<em><b>MAX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>MAX</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAX
     * @model
     * @generated
     * @ordered
     */
    public static final int MAX_VALUE = 4;

    /**
     * The '<em><b>SUM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>SUM</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUM
     * @model
     * @generated
     * @ordered
     */
    public static final int SUM_VALUE = 5;

    /**
     * An array of all the '<em><b>Function</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Function[] VALUES_ARRAY =
        new Function[] {
            VALUE,
            AVG,
            COUNT,
            MIN,
            MAX,
            SUM,
        };

    /**
     * A public read-only list of all the '<em><b>Function</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Function> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Function</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Function get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Function result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Function</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Function getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Function result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Function</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Function get(int value) {
        switch (value) {
            case VALUE_VALUE: return VALUE;
            case AVG_VALUE: return AVG;
            case COUNT_VALUE: return COUNT;
            case MIN_VALUE: return MIN;
            case MAX_VALUE: return MAX;
            case SUM_VALUE: return SUM;
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
    private Function(int value, String name, String literal) {
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
    
} //Function
