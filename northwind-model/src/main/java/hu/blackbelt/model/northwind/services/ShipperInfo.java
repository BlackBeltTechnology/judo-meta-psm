package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.model.northwind.entities.Company;
import hu.blackbelt.model.northwind.entities.Shipper;
import hu.blackbelt.model.northwind.types.Gps;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class ShipperInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute companyName = newTransferAttributeBuilder().build();
    public TransferAttribute location = newTransferAttributeBuilder().build();

    public void init(Package $package, String $string, Shipper $shipper, Company $company, Gps $gps) {
        useMappedTransferObjectType($)
                .withName("ShipperInfo")
                .withEntityType($shipper.$)
                .withAttributes(useTransferAttribute(companyName)
                        .withName("companyName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($company.companyName)
                )
                .withAttributes(useTransferAttribute(location)
                        .withName("location")
                        .withRequired(false)
                        .withDataType($gps.$)
                        .withBinding($company.location)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
