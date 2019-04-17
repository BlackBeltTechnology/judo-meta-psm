package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.type.BooleanType;
import hu.blackbelt.judo.meta.psm.type.DataType;
import hu.blackbelt.judo.meta.psm.type.DateType;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.type.TimestampType;

public class PsmUtils {

    /**
     * Check if a data type is integer.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is integer, false otherwise
     */
    public static boolean isInteger(final DataType dataType) {
        return isNumeric(dataType) && ((NumericType)dataType).getPrecision() == 0;
    }

    /**
     * Check if a data type is decimal.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is decimal, false otherwise
     */
    public static boolean isDecimal(final DataType dataType) {
        return isNumeric(dataType) && ((NumericType)dataType).getPrecision() > 0;
    }

    /**
     * Check if a data type is numeric.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is numeric, false otherwise
     */
    public static boolean isNumeric(final DataType dataType) {
        return dataType instanceof NumericType;
    }

    /**
     * Check if a data type is boolean.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is boolean, false otherwise
     */
    public static boolean isBoolean(final DataType dataType) {
        return dataType instanceof BooleanType;
    }

    /**
     * Check if a data type is string.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is string, false otherwise
     */
    public static boolean isString(final DataType dataType) {
        return dataType instanceof StringType;
    }

    /**
     * Check if a data type is date.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is date, false otherwise
     */
    public static boolean isDate(final DataType dataType) {
        return dataType instanceof DateType;
    }

    /**
     * Check if a data type is timestamp.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is timestamp, false otherwise
     */
    public static boolean isTimestamp(final DataType dataType) {
        return dataType instanceof TimestampType;
    }

    /**
     * Check if a data type is enumeration.
     *
     * @param dataType data type to check
     * @return <code>true</code> if data type is enumeration, false otherwise
     */
    public static boolean isEnumeration(final DataType dataType) {
        return dataType instanceof EnumerationType;
    }
}
