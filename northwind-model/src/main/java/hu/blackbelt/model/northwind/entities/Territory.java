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
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Territory {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute territoryDescription = newAttributeBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();
    public AssociationEnd region = newAssociationEndBuilder().build();
    public AssociationEnd shipper = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Employee $employee, Region $region, Shipper $shipper) {
        useEntityType($)
                .withName("Territory")
                .withAttributes(useAttribute(territoryDescription)
                        .withName("territoryDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(employees)
                        .withName("territory")
                        .withTarget($employee.$)
                        .withPartner($employee.territory)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(region)
                        .withName("region")
                        .withTarget($region.$)
                        .withPartner($region.territories)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(shipper)
                        .withName("shipper")
                        .withTarget($shipper.$)
                        .withPartner($shipper.territory)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
