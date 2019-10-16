package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.Order;
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

public class OrderInfoQuery {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_ETGEYCVQEemLpvUY7MQgng" name="OrderInfoQuery" entityType="_-H4RoINkEeiLE-B2bbL0fg" entityReferencePresence="REQUIRED">
      <relations xmi:id="_8M4aICVuEemLpvUY7MQgng" name="items" binding="_2CC44LwNEeiOuYiCo6IbXQ" target="_nao6QCVuEemLpvUY7MQgng" embedded="true">
        <cardinality xmi:id="_-kd8kCVuEemLpvUY7MQgng" upper="-1"/>
      </relations>
      <relations xmi:id="_djRLUHrHEemPuYxp6QV8dA" name="categories" binding="_qMfVoHrHEemPuYxp6QV8dA" target="_xxeTIEWXEemHs64O5EYsyQ" embedded="true">
        <cardinality xmi:id="_J1w0AHrJEemPuYxp6QV8dA" upper="-1"/>
      </relations>
      <attributes xmi:id="_U4tLwCVQEemLpvUY7MQgng" name="orderDate" required="true" dataType="_Z9J8IIN1EeiLE-B2bbL0fg" binding="_WXvUoIN1EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_u7NrYCVQEemLpvUY7MQgng" name="shipperName" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_5i40sCVQEemLpvUY7MQgng"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();

    public TransferAttribute orderDate = newTransferAttributeBuilder().build();
    public TransferAttribute shipperName = newTransferAttributeBuilder().build();

    public TransferObjectRelation items = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();

    public void init(Package $package, String $string, TimeStamp $timeStamp,
                     Order $order, OrderItemQuery $orderItemQuery, CategoryInfo $categoryInfo) {
        useMappedTransferObjectType($)
                .withName("OrderInfoQuery")
                .withEntityType($order.$)
                .withAttributes(useTransferAttribute(orderDate)
                        .withName("orderDate")
                        .withRequired(true)
                        .withDataType($timeStamp.$)
                        .withBinding($order.orderDate)
                )
                .withAttributes(useTransferAttribute(shipperName)
                        .withName("shipperName")
                        .withDataType($string.$)
                        .withBinding($order.shipName)
                )
                .withRelations(useTransferObjectRelation(items)
                        .withName("items")
                        .withBinding($order.orderDetails)
                        .withTarget($orderItemQuery.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1).withUpper(-1)
                        )
                )
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withBinding($order.categories)
                        .withTarget($categoryInfo.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        ))

                .build();

        usePackage($package).withElements($).build();
    }
}
