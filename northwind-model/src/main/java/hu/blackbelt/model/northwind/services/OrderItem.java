package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.entities.OrderDetail;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderItem {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute quantity = newTransferAttributeBuilder().build();
    public TransferAttribute discount = newTransferAttributeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();
    public TransferAttribute categoryName = newTransferAttributeBuilder().build();
    public TransferAttribute price = newTransferAttributeBuilder().build();
    public TransferAttribute heavy = newTransferAttributeBuilder().build();
    public TransferAttribute weight = newTransferAttributeBuilder().build();

    public TransferObjectRelation product = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public BoundTransferOperation listProduct = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, Boolean $boolean,
                     MassStoredInGrams $massStoredInGrams, OrderDetail $orderDetail, ProductInfo $productInfo,
                     CategoryInfo $categoryInfo, AllProducts $allProducts, AllCategories $allCategories,
                     OrderItem $orderItem) {
        useMappedTransferObjectType($)
                .withName("OrderItem")
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
                        .withDataType($string.$)
                        .withBinding($orderDetail.productName)
                )
                .withAttributes(useTransferAttribute(categoryName)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withBinding($orderDetail.categoryName)
                )
                .withRelations(useTransferObjectRelation(product)
                        .withName("product")
                        .withBinding($orderDetail.product)
                        .withEmbedded(true)
                        .withTarget($productInfo.$)
                        .withRange($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($orderDetail.category)
                        .withEmbedded(true)
                        .withTarget($categoryInfo.$)
                        .withRange($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(0)
                        ))
                .withAttributes(useTransferAttribute(price)
                        .withName("price")
                        .withDataType($double.$)
                        .withBinding($orderDetail.price)
                )
                .withAttributes(useTransferAttribute(heavy)
                        .withName("heavy")
                        .withDataType($boolean.$)
                        .withBinding($orderDetail.heavy)
                )
                .withAttributes(useTransferAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInGrams.$)
                        .withBinding($orderDetail.weight)
                )
                .withOperations(useBoundTransferOperation(listProduct)
                        .withName("_listProduct")
                        .withBinding($orderDetail.listProduct)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(product)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
