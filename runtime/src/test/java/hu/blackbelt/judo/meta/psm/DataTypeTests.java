package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.type.EnumerationType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DataTypeTests extends NorthwindTests {

    @Test
    public void testIsInteger() {
        assertThat(getEntityType("OrderDetail").getAttributeType("quantity").isInteger(), is(Boolean.TRUE));
    }

    @Test
    public void testIsDecimal() {
        assertThat(getEntityType("OrderDetail").getAttributeType("unitPrice").isDecimal(), is(Boolean.TRUE));
    }

    @Test
    public void testIsString() {
        assertThat(getEntityType("Order").getAttributeType("shipName").isString(), is(Boolean.TRUE));
    }

    @Test
    public void testIsBoolean() {
        assertThat(getEntityType("Product").getAttributeType("discounted").isBoolean(), is(Boolean.TRUE));
    }

    @Test
    public void testIsEnumeration() {
        assertThat(getEntityType("InternationalAddress").getAttributeType("country").isEnumeration(), is(Boolean.TRUE));
    }

    @Test
    public void testIsDate() {
        assertThat(getEntityType("Employee").getAttributeType("birthDate").isDate(), is(Boolean.TRUE));
    }

    @Test
    public void testIsTimestamp() {
        assertThat(getEntityType("Order").getAttributeType("orderDate").isTimestamp(), is(Boolean.TRUE));
    }

    @Test
    public void testIsMeasured() {
        assertThat(getEntityType("Product").getAttributeType("weight").isMeasured(), is(Boolean.TRUE));
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
