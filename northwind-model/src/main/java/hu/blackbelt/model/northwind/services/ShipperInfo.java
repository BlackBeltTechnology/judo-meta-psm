package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.model.northwind.entities.Company;
import hu.blackbelt.model.northwind.entities.Shipper;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;

// TODO: Finish
public class ShipperInfo {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_OUfQ4IFSEemFzY3ZWApzVQ" name="ShipperInfo" entityType="_GnEEcINlEeiLE-B2bbL0fg">
      <attributes xmi:id="_QqGdYIFSEemFzY3ZWApzVQ" name="companyName" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_Pki0cINzEeiLE-B2bbL0fg"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute companyName = newTransferAttributeBuilder().build();

    public void init(Package $package, String $string, Shipper $shipper, Company $company) {
        useMappedTransferObjectType($)
                .withName("ShipperInfo")
                .withEntityType($shipper.$)
                .withAttributes(useTransferAttribute(companyName)
                        .withName("companyName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($company.companyName)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
