package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.type.EnumerationType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DataTypeTests extends NorthwindTests {

    @Test
    public void testIsInteger() {
        assertThat(getEntityType("OrderDetail").getAttribute("quantity").getDataType().isInteger(), is(Boolean.TRUE));
    }

    @Test
    public void testIsDecimal() {
        assertThat(getEntityType("OrderDetail").getAttribute("unitPrice").getDataType().isDecimal(), is(Boolean.TRUE));
    }

    @Test
    public void testIsString() {
        assertThat(getEntityType("Order").getAttribute("shipName").getDataType().isString(), is(Boolean.TRUE));
    }

    @Test
    public void testIsBoolean() {
        assertThat(getEntityType("Product").getAttribute("discounted").getDataType().isBoolean(), is(Boolean.TRUE));
    }

    @Test
    public void testIsEnumeration() {
        assertThat(getEntityType("InternationalAddress").getAttribute("country").getDataType().isEnumeration(), is(Boolean.TRUE));
    }

    @Test
    public void testIsDate() {
        assertThat(getEntityType("Employee").getAttribute("birthDate").getDataType().isDate(), is(Boolean.TRUE));
    }

    @Test
    public void testIsTimestamp() {
        assertThat(getEntityType("Order").getAttribute("orderDate").getDataType().isTimestamp(), is(Boolean.TRUE));
    }

    @Test
    public void testIsMeasured() {
        assertThat(getEntityType("Product").getAttribute("weight").getDataType().isMeasured(), is(Boolean.TRUE));
    }

    @Test
    public void testContains() {
        final EnumerationType enumerationType = (EnumerationType) northwind.getPackages().stream()
                .filter(p -> "types".equals(p.getName()))
                .findFirst().get()
                .getElements().stream()
                .filter(e -> "Countries".equals(e.getName()))
                .findFirst().get();

        assertThat(enumerationType.contains("AT"), is(Boolean.TRUE));
        assertThat(enumerationType.contains("UA"), is(Boolean.FALSE));
    }
}
