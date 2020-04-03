package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.ExternalAP;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Category {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute categoryName = newTransferAttributeBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();

    public BoundTransferOperation getProductsOfCategory = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, hu.blackbelt.model.northwind.entities.Category $category,
                     Product $product, ExternalAP $externalAP) {

        useMappedTransferObjectType($)
                .withName("Category")
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
                        .withTarget($product.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)
                        )
                )
                .withOperations(useBoundTransferOperation(getProductsOfCategory)
                        .withName("getProductsOfCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RELATION)
                                .withOwner(products)
                                .build())
                        .withBinding($category._getProducts)
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($product.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
