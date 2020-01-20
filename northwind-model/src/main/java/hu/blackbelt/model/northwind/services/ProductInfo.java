package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.InternalAP;
import hu.blackbelt.model.northwind.entities.Product;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
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
    public UnboundOperation setCategoryOfProduct = newUnboundOperationBuilder().build();

    public Parameter inputOfCreateProduct = newParameterBuilder().build();
    public Parameter inputOfUpdateProduct = newParameterBuilder().build();
    public Parameter inputOfSetCategoryOfProduct = newParameterBuilder().build();

    public UnboundOperation getAllCategoriesToCreateProduct = newUnboundOperationBuilder().build();
    public UnboundOperation getAllCategoriesToUpdateProduct = newUnboundOperationBuilder().build();
    public UnboundOperation getAllCategoriesToSetCategoryOfProduct = newUnboundOperationBuilder().build();

    public UnboundOperation getTemplateOfProduct = newUnboundOperationBuilder().build();

    public BoundTransferOperation getCategoryOfProduct = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, Boolean $boolean,
                     MassStoredInKilograms $massStoredInKilograms, Product $product, CategoryInfo $categoryInfo,
                     ProductInfo $productInfo, AllCategories $allCategories, InternalAP $internalAP) {
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
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner($internalAP.products)
                                .build())
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
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE)
                                .withOwner($internalAP.products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(useParameter(inputOfCreateProduct)
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
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE)
                                .withOwner($internalAP.products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(useParameter(inputOfUpdateProduct)
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
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE)
                                .withOwner($internalAP.products)
                                .build())
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
                .withOperations(useUnboundOperation(setCategoryOfProduct)
                        .withName("setCategoryOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
                                .withOwner($internalAP.products)
                                .withRelation($productInfo.category)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(useParameter(inputOfSetCategoryOfProduct)
                                .withName("input")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllCategoriesToCreateProduct)
                        .withName("getAllCategoriesToCreateProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
                                .withOwner(inputOfCreateProduct)
                                .withRelation($productInfo.category)
                                .build())
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
                .withOperations(useUnboundOperation(getAllCategoriesToUpdateProduct)
                        .withName("getAllCategoriesToUpdateProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
                                .withOwner(inputOfUpdateProduct)
                                .withRelation($productInfo.category)
                                .build())
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
                .withOperations(useUnboundOperation(getAllCategoriesToSetCategoryOfProduct)
                        .withName("getAllCategoriesToSetCategoryOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
                                .withOwner(inputOfSetCategoryOfProduct)
                                .withRelation($productInfo.category)
                                .build())
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
                .withOperations(useUnboundOperation(getTemplateOfProduct)
                        .withName("getTemplateOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_TEMPLATE)
                                .withOwner($)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(getCategoryOfProduct)
                        .withName("getCategoryOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RELATION)
                                .withOwner(category)
                                .build())
                        .withBinding($product._getCategoryInternal)
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
