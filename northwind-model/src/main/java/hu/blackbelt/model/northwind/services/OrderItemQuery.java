package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.model.northwind.entities.OrderDetail;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderItemQuery {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_nao6QCVuEemLpvUY7MQgng" name="OrderItemQuery" entityType="__XzocINkEeiLE-B2bbL0fg" entityReferencePresence="REQUIRED">
      <relations xmi:id="_eboboEWeEemHs64O5EYsyQ" name="product" binding="_6QtRsLwNEeiOuYiCo6IbXQ" range="_vA7SgEZlEemHs64O5EYsyQ" target="_PL79YIHuEemFzY3ZWApzVQ" embedded="true">
        <cardinality xmi:id="_ElBGIEWiEemHs64O5EYsyQ" lower="1"/>
      </relations>
      <relations xmi:id="_cg0_UIFIEemFzY3ZWApzVQ" name="category" binding="_rYlgkEZqEemHs64O5EYsyQ" range="_xeUiAEZlEemHs64O5EYsyQ" target="_xxeTIEWXEemHs64O5EYsyQ" embedded="true">
        <cardinality xmi:id="_cg0_UYFIEemFzY3ZWApzVQ" lower="1"/>
      </relations>
      <attributes xmi:id="_w9fJgCVuEemLpvUY7MQgng" name="unitPrice" required="true" dataType="_VDVVQIUcEeipmMyz9cMCRA" binding="_bG7OUIN6EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_xdLWMCVuEemLpvUY7MQgng" name="quantity" required="true" dataType="_TXtg8IUcEeipmMyz9cMCRA" binding="_d3obYIN6EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_x6C4YCVuEemLpvUY7MQgng" name="discount" required="true" dataType="_VDVVQIUcEeipmMyz9cMCRA" binding="_jIROkIN6EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_LxWxUIFIEemFzY3ZWApzVQ" name="productName" required="true" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_mr-oACVvEemLpvUY7MQgng"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute quantity = newTransferAttributeBuilder().build();
    public TransferAttribute discount = newTransferAttributeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();

    public TransferObjectRelation product = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, OrderDetail $orderDetail,
                     ProductInfoQuery $productInfoQuery, CategoryInfo $categoryInfo, AllProducts $allProducts, AllCategories $allCategories) {
        useMappedTransferObjectType($)
                .withName("OrderItemQuery")
                .withEntityType($orderDetail.$)
                .withAttributes(useTransferAttribute(unitPrice)
                        .withName("unitPrice")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($orderDetail.unitPrice)
                )
                .withAttributes(useTransferAttribute(quantity)
                        .withName("quantity")
                        .withRequired(true)
                        .withDataType($integer.$)
                        .withBinding($orderDetail.quantity)
                )
                .withAttributes(useTransferAttribute(discount)
                        .withName("discount")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($orderDetail.discount)
                )
                .withAttributes(useTransferAttribute(productName)
                        .withName("productName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($orderDetail.productName)
                )
                .withRelations(useTransferObjectRelation(product)
                        .withName("product")
                        .withBinding($orderDetail.product)
                        .withTarget($productInfoQuery.$)
                        .withRange($allProducts.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($orderDetail.category)
                        .withTarget($categoryInfo.$)
                        .withRange($allCategories.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .build();

        usePackage($package).withElements($).build();
    }
}
