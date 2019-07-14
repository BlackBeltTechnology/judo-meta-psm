package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class DataTypeTest extends NorthwindTest {

    @Test
    public void testIsInteger() {
        assertThat(getEntityType("OrderDetail").getAttribute("quantity").getDataType().isInteger(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsDecimal() {
        assertThat(getEntityType("OrderDetail").getAttribute("unitPrice").getDataType().isDecimal(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsString() {
        assertThat(getEntityType("Order").getAttribute("shipName").getDataType().isString(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsBoolean() {
        assertThat(getEntityType("Product").getAttribute("discounted").getDataType().isBoolean(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsEnumeration() {
        assertThat(getEntityType("InternationalAddress").getAttribute("country").getDataType().isEnumeration(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsDate() {
        assertThat(getEntityType("Employee").getAttribute("birthDate").getDataType().isDate(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsTimestamp() {
        assertThat(getEntityType("Order").getAttribute("orderDate").getDataType().isTimestamp(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testIsMeasured() {
        assertThat(getEntityType("Product").getAttribute("weight").getDataType().isMeasured(), equalTo(Boolean.TRUE));
    }

    @Test
    public void testContains() {
        final EnumerationType enumerationType = (EnumerationType) northwind.getPackages().stream()
                .filter(p -> "types".equals(p.getName()))
                .findFirst().get()
                .getElements().stream()
                .filter(e -> "Countries".equals(e.getName()))
                .findFirst().get();

        assertThat(enumerationType.contains("AT"), equalTo(Boolean.TRUE));
        assertThat(enumerationType.contains("UA"), equalTo(Boolean.FALSE));
    }
}
