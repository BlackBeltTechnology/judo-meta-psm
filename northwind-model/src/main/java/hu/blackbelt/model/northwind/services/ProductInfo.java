package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.entities.Product;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ProductInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute unitsInStock = newTransferAttributeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();
    public TransferAttribute weight = newTransferAttributeBuilder().build();
    public TransferAttribute discounted = newTransferAttributeBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public UnboundOperation getAllProducts = newUnboundOperationBuilder().build();
    public UnboundOperation createProduct = newUnboundOperationBuilder().build();
    public UnboundOperation updateProduct = newUnboundOperationBuilder().build();
    public UnboundOperation deleteProduct = newUnboundOperationBuilder().build();
    public UnboundOperationWithRelation setCategoryOfProduct = newUnboundOperationWithRelationBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, Boolean $boolean,
                     MassStoredInKilograms $massStoredInKilograms, Product $product, CategoryInfo $categoryInfo,
                     AllCategories $allCategories) {
        useMappedTransferObjectType($)
                .withName("ProductInfo")
                .withEntityType($product.$)
                .withAttributes(useTransferAttribute(unitPrice)
                        .withName("unitPrice")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($product.unitPrice)
                )
                .withAttributes(useTransferAttribute(unitsInStock)
                        .withName("unitsInStock")
                        .withDataType($integer.$)
                        .withBinding($product.unitsInStock)
                )
                .withAttributes(useTransferAttribute(productName)
                        .withName("productName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($product.productName)
                )
                .withAttributes(useTransferAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInKilograms.$)
                        .withBinding($product.weight)
                )
                .withAttributes(useTransferAttribute(discounted)
                        .withName("discounted")
                        .withDataType($boolean.$)
                        .withBinding($product.discounted)
                )
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($product.category)
                        .withTarget($categoryInfo.$)
                        .withRange($allCategories.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .withOperations(useUnboundOperation(getAllProducts)
                        .withName("getAllProducts")
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createProduct)
                        .withName("createProduct")
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(updateProduct)
                        .withName("updateProduct")
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(deleteProduct)
                        .withName("deleteProduct")
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperationWithRelation(setCategoryOfProduct)
                        .withName("setCategoryOfProduct")
                        .withRelation(category)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
