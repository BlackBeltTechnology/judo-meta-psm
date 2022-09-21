package hu.blackbelt.judo.meta.psm;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

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

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class EntityTypeTest extends NorthwindTest {

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
        final PrimitiveTypedElement shipperName = getEntityType("Order").getAttribute("shipperName");
        assertThat(shipperName, instanceOf(DataProperty.class));

        assertThat(shipperName.getDataType(), instanceOf(StringType.class));
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
        final ReferenceTypedElement categories = getEntityType("Order").getReference("categories");
        assertThat(categories, instanceOf(NavigationProperty.class));

        assertThat(categories.getTarget(), is(getEntityType("Category")));
        assertThat(categories.isCollection(), is(Boolean.TRUE));
    }
}
