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
