package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.InternalAP;
import hu.blackbelt.model.northwind.entities.InternationalOrder;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class InternationalOrderInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute customsDescription = newTransferAttributeBuilder().build();
    public TransferAttribute exciseTax = newTransferAttributeBuilder().build();

    public UnboundOperation getAllInternationalOrders = newUnboundOperationBuilder().build();
    public UnboundOperation createInternationalOrder = newUnboundOperationBuilder().build();
    public UnboundOperation updateInternationalOrder = newUnboundOperationBuilder().build();
    public UnboundOperation deleteInternationalOrder = newUnboundOperationBuilder().build();

    public void init(Package $package, String $string, Double $double, InternationalOrder $internationalOrder,
                     OrderInfo $orderInfo, final InternalAP $internalAP) {
        useMappedTransferObjectType($)
                .withName("InternationalOrderInfo")
                .withEntityType($internationalOrder.$)
                .withSuperTransferObjectTypes($orderInfo.$)
                .withAttributes(useTransferAttribute(customsDescription)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withBinding($internationalOrder.customsDescription)
                )
                .withAttributes(useTransferAttribute(exciseTax)
                        .withName("exciseTax")
                        .withDataType($double.$)
                        .withRequired(true)
                        .withBinding($internationalOrder.exciseTax)
                )
                .withAttributes(useTransferAttribute(customsDescription)
                        .withName("customsDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withBinding($internationalOrder.customsDescription)
                )
                .withOperations(useUnboundOperation(getAllInternationalOrders)
                        .withName("getAllInternationalOrders")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner($internalAP.allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createInternationalOrder)
                        .withName("createInternationalOrder")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE)
                                .withOwner($internalAP.allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(updateInternationalOrder)
                        .withName("updateInternationalOrder")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE)
                                .withOwner($internalAP.allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(deleteInternationalOrder)
                        .withName("deleteInternationalOrder")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE)
                                .withOwner($internalAP.allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
