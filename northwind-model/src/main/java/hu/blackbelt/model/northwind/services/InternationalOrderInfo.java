package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.InternationalOrder;
import hu.blackbelt.model.northwind.entities.Order;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternationalOrderInfo {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_HebikIFTEemFzY3ZWApzVQ" name="InternationalOrderInfo" entityType="_MoVqYINlEeiLE-B2bbL0fg">
      <relations xmi:id="_HebikYFTEemFzY3ZWApzVQ" name="items" binding="_2CC44LwNEeiOuYiCo6IbXQ" target="_-eoLcIFREemFzY3ZWApzVQ">
        <cardinality xmi:id="_HebikoFTEemFzY3ZWApzVQ" upper="-1"/>
      </relations>
      <relations xmi:id="_Hebik4FTEemFzY3ZWApzVQ" name="shipper" binding="_WVBGcLwNEeiOuYiCo6IbXQ" target="_OUfQ4IFSEemFzY3ZWApzVQ">
        <cardinality xmi:id="_HebilIFTEemFzY3ZWApzVQ"/>
      </relations>
      <attributes xmi:id="_HebilYFTEemFzY3ZWApzVQ" name="orderDate" required="true" dataType="_Z9J8IIN1EeiLE-B2bbL0fg" binding="_WXvUoIN1EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_HebiloFTEemFzY3ZWApzVQ" name="shipperName" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_5i40sCVQEemLpvUY7MQgng"/>
      <attributes xmi:id="_jh3_MIFTEemFzY3ZWApzVQ" name="customsDescription" required="true" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_FpOkYIN_EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_kGaPoIFTEemFzY3ZWApzVQ" name="exciseTax" required="true" dataType="_VDVVQIUcEeipmMyz9cMCRA" binding="_It85oIN_EeiLE-B2bbL0fg"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute orderDate = newTransferAttributeBuilder().build();
    public TransferAttribute shipperName = newTransferAttributeBuilder().build();
    public TransferAttribute customsDescription = newTransferAttributeBuilder().build();
    public TransferAttribute exciseTax = newTransferAttributeBuilder().build();

    public TransferObjectRelation items = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation shipper = newTransferObjectRelationBuilder().build();


    public void init(Package $package, String $string, Double $double, TimeStamp $timeStamp, Order $order,
                     InternationalOrder $internationalOrder,
                     OrderItemQuery $orderItemQuery, ShipperInfo $shipperInfo) {
        useMappedTransferObjectType($)
                .withName("InternationalOrderInfo")
                .withEntityType($internationalOrder.$)
                .withAttributes(useTransferAttribute(orderDate)
                        .withName("orderDate")
                        .withDataType($timeStamp.$)
                        .withRequired(true)
                        .withBinding($order.orderDate)
                )
                .withAttributes(useTransferAttribute(shipperName)
                        .withName("shipperName")
                        .withDataType($string.$)
                        .withBinding($order.shipperName)
                )
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
                .withRelations(useTransferObjectRelation(items)
                        .withName("items")
                        .withBinding($order.orderDetails)
                        .withTarget($orderItemQuery.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1).withUpper(-1)
                        )
                )
                .withRelations(useTransferObjectRelation(shipper)
                        .withName("shipper")
                        .withBinding($order.shipper)
                        .withTarget($shipperInfo.$)
                        .withCardinality(newCardinalityBuilder())
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
