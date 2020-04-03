package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.model.northwind.entities.InternationalOrder;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class InternationalOrderInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute customsDescription = newTransferAttributeBuilder().build();
    public TransferAttribute exciseTax = newTransferAttributeBuilder().build();

    public void init(Package $package, String $string, Double $double, InternationalOrder $internationalOrder,
                     OrderInfo $orderInfo) {
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
                .build();

        usePackage($package).withElements($).build();
    }
}
