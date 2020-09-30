package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.InternationalOrderInfo;
import hu.blackbelt.model.northwind.services.OrderInfo;
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
