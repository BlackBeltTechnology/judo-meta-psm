package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.entities.Category;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class CategoryInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute categoryName = newTransferAttributeBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();

    public BoundTransferOperation listProducts = newBoundTransferOperationBuilder().build();
    public BoundTransferOperation moveProductsToCategory = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, Category $category, ProductInfo $productInfo,
                     AllProducts $allProducts) {
        useMappedTransferObjectType($)
                .withName("CategoryInfo")
                .withEntityType($category.$)
                .withAttributes(useTransferAttribute(categoryName)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withBinding($category.categoryName)
                )
                .withRelations(useTransferObjectRelation(products)
                        .withName("products")
                        .withBinding($category.products)
                        .withTarget($productInfo.$)
                        .withRange($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        )
                )
                .withOperations(useBoundTransferOperation(listProducts)
                        .withName("_listProducts")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(products)
                                .build())
                        .withBinding($category.listProducts)
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(moveProductsToCategory)
                        .withName("moveProductsToCategory")
                        .withBinding($category.moveProducts)
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(-1).build()
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
