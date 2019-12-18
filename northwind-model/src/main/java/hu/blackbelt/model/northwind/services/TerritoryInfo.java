package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.model.northwind.entities.Territory;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;

public class TerritoryInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute description = newTransferAttributeBuilder().build();

    public void init(Package $package, String $string, Territory $territory) {
        useMappedTransferObjectType($)
                .withName("TerritoryInfo")
                .withEntityType($territory.$)
                .withAttributes(useTransferAttribute(description)
                        .withName("description")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($territory.territoryDescription)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
