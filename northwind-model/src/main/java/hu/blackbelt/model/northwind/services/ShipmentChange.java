package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class ShipmentChange {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();
    public TransferAttribute orderDate = newTransferAttributeBuilder().build();
    public TransferAttribute shipperName = newTransferAttributeBuilder().build();


    public void init(Package $package, String $string, TimeStamp $timeStamp) {
        useUnmappedTransferObjectType($)
                .withName("ShipmentChange")
                .withAttributes(useTransferAttribute(shipperName)
                        .withName("shipperName")
                        .withRequired(true)
                        .withDataType($string.$)
                )
                .withAttributes(useTransferAttribute(orderDate)
                        .withName("orderDate")
                        .withDataType($timeStamp.$)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
