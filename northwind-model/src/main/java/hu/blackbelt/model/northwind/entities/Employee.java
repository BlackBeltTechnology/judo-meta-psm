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
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.*;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Employee {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute titleOfCourtesy = newAttributeBuilder().build();
    public Attribute birthDate = newAttributeBuilder().build();
    public Attribute hireDate = newAttributeBuilder().build();
    public Attribute homePhone = newAttributeBuilder().build();
    public Attribute extension = newAttributeBuilder().build();
    public Attribute photo = newAttributeBuilder().build();
    public Attribute notes = newAttributeBuilder().build();
    public Attribute photoPath = newAttributeBuilder().build();
    public AssociationEnd orders = newAssociationEndBuilder().build();
    public Containment address = newContainmentBuilder().build();
    public AssociationEnd reportsTo = newAssociationEndBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();
    public AssociationEnd territory = newAssociationEndBuilder().build();
    public AssociationEnd category = newAssociationEndBuilder().build();


    public void init(Package $package,
                     String $string, Date $date, Phone $phone, Photo $photo, Text $text,
                     Person $person, Order $order, Address $address, Territory $territory, Category $category) {

        useEntityType($).withName("Employee")
                .withSuperEntityTypes($person.$)
                .withAttributes(useAttribute(titleOfCourtesy)
                        .withName("titleOfCourtesy")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(birthDate)
                        .withName("birthDate")
                        .withDataType($date.$)
                )
                .withAttributes(useAttribute(hireDate)
                        .withName("hireDate")
                        .withDataType($date.$)
                )
                .withAttributes(useAttribute(homePhone)
                        .withName("homePhone")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(extension)
                        .withName("extension")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(photo)
                        .withName("photo")
                        .withDataType($photo.$)
                )
                .withAttributes(useAttribute(notes)
                        .withName("notes")
                        .withDataType($text.$)
                )
                .withAttributes(useAttribute(photoPath)
                        .withName("photoPath")
                        .withDataType($text.$)
                )
                .withRelations(useAssociationEnd(orders)
                        .withName("orders")
                        .withTarget($order.$)
                        .withPartner($order.employee)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useContainment(address)
                        .withName("address")
                        .withTarget($address.$)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(reportsTo)
                        .withName("reportsTo")
                        .withTarget($)
                        .withPartner(employees)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(employees)
                        .withName("employees")
                        .withTarget($)
                        .withPartner(reportsTo)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(territory)
                        .withName("territory")
                        .withTarget($territory.$)
                        .withPartner($territory.employees)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(category)
                        .withName("category")
                        .withTarget($category.$)
                        .withPartner($category.owner)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
