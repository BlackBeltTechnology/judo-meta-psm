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

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.InternationalOrderInfo;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;

public class InternationalOrder {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute customsDescription = newAttributeBuilder().build();
    public Attribute exciseTax = newAttributeBuilder().build();
    
    public BoundOperation updateInstanceForNorthwind_services_InternationalOrderInfo = newBoundOperationBuilder().build();
    public BoundOperation deleteInstanceForNorthwind_services_InternationalOrderInfo = newBoundOperationBuilder().build();
    public BoundOperation refreshInstanceForNorthwind_services_InternationalOrderInfo = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, Double $double, Order $order, InternationalOrderInfo $internationalOrderInfo) {
        useEntityType($)
                .withName("InternationalOrder")
                .withSuperEntityTypes($order.$)
                .withAttributes(useAttribute(customsDescription)
                        .withName("customsDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(exciseTax)
                        .withName("exciseTax")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withOperations(useBoundOperation(updateInstanceForNorthwind_services_InternationalOrderInfo)
                        .withName("_updateInstanceForNorthwind_services_InternationalOrderInfo")
                        .withInstanceRepresentation($internationalOrderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundOperation(deleteInstanceForNorthwind_services_InternationalOrderInfo)
                        .withName("_deleteInstanceForNorthwind_services_InternationalOrderInfo")
                        .withInstanceRepresentation($internationalOrderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .build()
                )
                .withOperations(useBoundOperation(refreshInstanceForNorthwind_services_InternationalOrderInfo)
                        .withName("_refreshInstanceForNorthwind_services_InternationalOrderInfo")
                        .withInstanceRepresentation($internationalOrderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withOutput(newParameterBuilder()
                                .withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
