package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableSet;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;
import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.type.TimestampType;
import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EntityTypeTests extends NorthwindTests {

    @Test
    public void testSingleGetSuperTypes() {
        assertThat(new HashSet<>(getEntityType("Employee").getAllSuperEntityTypes()), is(ImmutableSet.of(
                getEntityType("Person"))));
    }

    @Test
    public void testMultiGetSuperTypes() {
        assertThat(new HashSet<>(getEntityType("Individual").getAllSuperEntityTypes()), is(ImmutableSet.of(
                getEntityType("Customer"),
                getEntityType("Person"))));
    }

    @Test
    public void testDiamondGetSuperTypes() {
        assertThat(new HashSet<>(getEntityType("OnlineInternationalOrder").getAllSuperEntityTypes()), is(ImmutableSet.of(
                getEntityType("Order"),
                getEntityType("OnlineOrder"),
                getEntityType("InternationalOrder"))));
    }

    @Test
    public void testOrderAttribute() {
        final PrimitiveTypedElement orderDate = getEntityType("Order").getAttribute("orderDate");
        assertThat(orderDate, instanceOf(Attribute.class));

        assertThat(orderDate.getDataType(), instanceOf(TimestampType.class));
    }

    @Test
    public void testOrderAttributeType() {
        assertThat(getEntityType("Order").getAttribute("shipName").getDataType(), instanceOf(StringType.class));
    }

    @Test
    public void testOrderDataProperty() {
        final PrimitiveTypedElement totalPrice = getEntityType("Order").getAttribute("totalPrice");
        assertThat(totalPrice, instanceOf(DataProperty.class));

        assertThat(totalPrice.getDataType(), instanceOf(NumericType.class));
    }

    @Test
    public void testOrderRelation() {
        final ReferenceTypedElement orderDetails = getEntityType("Order").getReference("customer");
        assertThat(orderDetails, instanceOf(Relation.class));

        assertThat(orderDetails.getTarget(), is(getEntityType("Customer")));
        assertThat(orderDetails.isCollection(), is(Boolean.FALSE));
    }

    @Test
    public void testOrderNavigationProperty() {
        final ReferenceTypedElement itemsWithCategoryPicture = getEntityType("Order").getReference("itemsWithCategoryPicture");
        assertThat(itemsWithCategoryPicture, instanceOf(NavigationProperty.class));

        assertThat(itemsWithCategoryPicture.getTarget(), is(getEntityType("OrderDetail")));
        assertThat(itemsWithCategoryPicture.isCollection(), is(Boolean.TRUE));
    }
}
