package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.Order;
import hu.blackbelt.model.northwind.types.Gps;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newBoundOperationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useBoundOperation;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderInfo {


    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_-L7R4IFREemFzY3ZWApzVQ" name="OrderInfo" entityType="_-H4RoINkEeiLE-B2bbL0fg">
      <relations xmi:id="_-L7R4YFREemFzY3ZWApzVQ" name="items" binding="_2CC44LwNEeiOuYiCo6IbXQ" target="_-eoLcIFREemFzY3ZWApzVQ">
        <cardinality xmi:id="_-L7R4oFREemFzY3ZWApzVQ" upper="-1"/>
      </relations>
      <relations xmi:id="_csG2sIFSEemFzY3ZWApzVQ" name="shipper" binding="_WVBGcLwNEeiOuYiCo6IbXQ" target="_OUfQ4IFSEemFzY3ZWApzVQ">
        <cardinality xmi:id="_mBre8IFSEemFzY3ZWApzVQ"/>
      </relations>
      <relations xmi:id="_AJB7MKfHEemuF_XcMCHsqg" name="categories" binding="_qMfVoHrHEemPuYxp6QV8dA" target="_xxeTIEWXEemHs64O5EYsyQ">
        <cardinality xmi:id="_Ig3v4KfHEemuF_XcMCHsqg" upper="-1"/>
      </relations>
      <relations xmi:id="_hkJUIKiYEemuF_XcMCHsqg" name="comments" target="_wNexgKiXEemuF_XcMCHsqg" embedded="true">
        <cardinality xmi:id="_lw-g8KiYEemuF_XcMCHsqg" upper="-1"/>
      </relations>
      <attributes xmi:id="_-L7R5YFREemFzY3ZWApzVQ" name="orderDate" required="true" dataType="_Z9J8IIN1EeiLE-B2bbL0fg" binding="_WXvUoIN1EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_-L7R5oFREemFzY3ZWApzVQ" name="shipperName" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_5i40sCVQEemLpvUY7MQgng"/>
      <operations xmi:id="_jEaRYKPUEem4Sqe63wVljw" name="updateOrder">
        <output xmi:id="_qVIF8KPUEem4Sqe63wVljw" name="output" type="_-L7R4IFREemFzY3ZWApzVQ">
          <cardinality xmi:id="_MI6JgKPVEem4Sqe63wVljw" lower="1"/>
        </output>
        <input xmi:id="_ofHmkKPUEem4Sqe63wVljw" name="input" type="_-L7R4IFREemFzY3ZWApzVQ">
          <cardinality xmi:id="_MeG9cKPVEem4Sqe63wVljw" lower="1"/>
        </input>
      </operations>
      <operations xmi:id="_lrK4QKPUEem4Sqe63wVljw" name="deleteOrder"/>
      <operations xmi:id="_Agu9kKiYEemuF_XcMCHsqg" name="changeShipment">
        <output xmi:id="_F72icKiYEemuF_XcMCHsqg" name="output" type="_-L7R4IFREemFzY3ZWApzVQ">
          <cardinality xmi:id="_iziC8KiZEemuF_XcMCHsqg" lower="1"/>
        </output>
        <input xmi:id="_EPFeoKiYEemuF_XcMCHsqg" name="input" type="_gw4goKiXEemuF_XcMCHsqg">
          <cardinality xmi:id="_jG31sKiZEemuF_XcMCHsqg" lower="1"/>
        </input>
      </operations>
    </elements>
    */

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();

    public TransferAttribute orderDate = newTransferAttributeBuilder().build();
    public TransferAttribute shipperName = newTransferAttributeBuilder().build();

    public TransferObjectRelation items = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation shipper = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation comments = newTransferObjectRelationBuilder().build();

    public BoundOperation updateOrder = newBoundOperationBuilder().build();
    public BoundOperation deleteOrder = newBoundOperationBuilder().build();
    public BoundOperation changeShipment = newBoundOperationBuilder().build();
    public BoundOperation createItem = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, TimeStamp $timeStamp,
                     Order $order, OrderItem $orderItem, ShipperInfo $shipperInfo, CategoryInfo $categoryInfo,
                     ShipmentChange $shipmentChange, Comment $comment) {
        useMappedTransferObjectType($)
                .withName("OrderInfo")
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
                        .withBinding($order.shipperName)
                )
                .withRelations(useTransferObjectRelation(items)
                        .withName("items")
                        .withBinding($order.orderDetails)
                        .withTarget($orderItem.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1).withUpper(-1)
                        )
                        .withCreate(createItem)
                )
                .withRelations(useTransferObjectRelation(shipper)
                        .withName("shipper")
                        .withBinding($order.shipper)
                        .withTarget($shipperInfo.$)
                        .withCardinality(newCardinalityBuilder())
                )
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withBinding($order.categories)
                        .withTarget($categoryInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        ))
                .withRelations(useTransferObjectRelation(comments)
                        .withName("comments")
                        .withTarget($comment.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        ))
                .withOperations(useBoundOperation(createItem)
                        .withName("createItem")
                        .withOutput(newParameterBuilder()
                                .withName("output")
                                .withType($orderItem.$)
                                .withCardinality(newCardinalityBuilder()
                                        .withLower(1)
                                )
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($orderItem.$)
                                .withCardinality(newCardinalityBuilder()
                                        .withLower(1)
                                )
                        )
                        .withImplementation(
                                newOperationBodyBuilder()
                                        .withStateful(true)
                                        .withCustomImplementation(true)
                        )
                )
                .withOperations(useBoundOperation(updateOrder)
                        .withName("updateOrder")
                        .withOutput(newParameterBuilder()
                                .withName("output")
                                .withType($)
                                .withCardinality(newCardinalityBuilder()
                                        .withLower(1)
                                )
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($)
                                .withCardinality(newCardinalityBuilder()
                                        .withLower(1)
                                )
                        )
                        .withImplementation(
                                newOperationBodyBuilder()
                                        .withStateful(true)
                                        .withCustomImplementation(true)
                        )
                )
                .withOperations(useBoundOperation(deleteOrder)
                        .withName("deleteOrder")
                        .withImplementation(
                                newOperationBodyBuilder()
                                        .withStateful(true)
                                        .withCustomImplementation(true)
                        )
                )
                .withOperations(useBoundOperation(changeShipment)
                        .withName("changeShipment")
                        .withOutput(newParameterBuilder()
                                .withName("output")
                                .withType($)
                                .withCardinality(newCardinalityBuilder()
                                        .withLower(1)
                                )
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($shipmentChange.$)
                                .withCardinality(newCardinalityBuilder()
                                        .withLower(1)
                                )
                        )
                        .withImplementation(
                                newOperationBodyBuilder()
                                        .withStateful(true)
                                        .withCustomImplementation(true)
                        )
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
