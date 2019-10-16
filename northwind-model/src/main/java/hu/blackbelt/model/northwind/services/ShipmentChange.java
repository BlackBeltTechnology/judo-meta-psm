package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.types.Date;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnmappedTransferObjectType;

public class ShipmentChange {

    /*
    <elements xsi:type="service:UnmappedTransferObjectType" xmi:id="_gw4goKiXEemuF_XcMCHsqg" name="ShipmentChange">
      <attributes xmi:id="_k8gzkKiXEemuF_XcMCHsqg" name="shipperName" required="true" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_lWG_UKiXEemuF_XcMCHsqg" name="orderDate" dataType="_Z9J8IIN1EeiLE-B2bbL0fg"/>
    </elements>
    */
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
