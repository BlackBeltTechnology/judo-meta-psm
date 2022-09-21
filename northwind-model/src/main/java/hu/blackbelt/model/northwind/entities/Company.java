package hu.blackbelt.model.northwind.entities;

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

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Gps;
import hu.blackbelt.model.northwind.types.Phone;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Company {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute companyName = newAttributeBuilder().build();
    public Attribute contactName = newAttributeBuilder().build();
    public Attribute contactTitle = newAttributeBuilder().build();
    public Attribute phone = newAttributeBuilder().build();
    public Attribute fax = newAttributeBuilder().build();
    public Attribute location = newAttributeBuilder().build();
    public AssociationEnd manufacturedProducts = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Phone $phone, Customer $customer, Product $product, Gps $gps) {
        useEntityType($).withName("Company")
                .withSuperEntityTypes($customer.$)
                .withAttributes(useAttribute(companyName)
                        .withName("companyName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(contactName)
                        .withName("contactName")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(contactTitle)
                        .withName("contactTitle")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(phone)
                        .withName("phone")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(fax)
                        .withName("fax")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(location)
                        .withName("location")
                        .withDataType($gps.$)
                )
                .withRelations(useAssociationEnd(manufacturedProducts)
                        .withName("manufacturedProducts")
                        .withTarget($product.$)
                        .withPartner($product.manufacturers)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build())
                .build();

        usePackage($package).withElements($).build();
    }
}
