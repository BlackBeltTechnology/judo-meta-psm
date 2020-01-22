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
    public TransferAttribute price = newTransferAttributeBuilder().build();
    public TransferAttribute heavy = newTransferAttributeBuilder().build();
    public TransferAttribute weight = newTransferAttributeBuilder().build();

    public TransferObjectRelation product = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public BoundTransferOperation getProductOfItem = newBoundTransferOperationBuilder().build();

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
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($orderDetail.productName)
                )
                .withRelations(useTransferObjectRelation(product)
                        .withName("product")
                        .withBinding($orderDetail.product)
                        .withTarget($productInfo.$)
                        .withRange($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($orderDetail.category)
                        .withTarget($categoryInfo.$)
                        .withRange($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .withAttributes(useTransferAttribute(price)
                        .withName("price")
                        .withRequired(true)
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
                .withOperations(useBoundTransferOperation(getProductOfItem)
                        .withName("getProductOfItem")
                        .withBinding($orderDetail._getProduct)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RELATION)
                                .withOwner(product)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
