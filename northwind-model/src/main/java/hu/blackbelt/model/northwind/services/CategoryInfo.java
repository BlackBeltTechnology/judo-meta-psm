package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.*;
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

    public UnboundOperation getAllCategories = newUnboundOperationBuilder().build();
    public UnboundOperation createCategory = newUnboundOperationBuilder().build();
    public UnboundOperation updateCategory = newUnboundOperationBuilder().build();
    public UnboundOperation deleteCategory = newUnboundOperationBuilder().build();
    public UnboundOperationWithRelation setProductsOfCategory = newUnboundOperationWithRelationBuilder().build();
    public UnboundOperationWithRelation addProductsToCategory = newUnboundOperationWithRelationBuilder().build();
    public UnboundOperationWithRelation removeProductsFromCategory = newUnboundOperationWithRelationBuilder().build();

    public void init(Package $package, String $string, Category $category, ProductInfo $productInfo, AllProducts $allProducts) {
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
                .withOperations(useUnboundOperation(getAllCategories)
                        .withName("getAllCategories")
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
                .withOperations(useUnboundOperation(createCategory)
                        .withName("createCategory")
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
                .withOperations(useUnboundOperation(updateCategory)
                        .withName("updateCategory")
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
                .withOperations(useUnboundOperation(deleteCategory)
                        .withName("deleteCategory")
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
                .withOperations(useUnboundOperationWithRelation(setProductsOfCategory)
                        .withName("setProductsOfCategory")
                        .withRelation(products)
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
                .withOperations(useUnboundOperationWithRelation(addProductsToCategory)
                        .withName("addProductsToCategory")
                        .withRelation(products)
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
                .withOperations(useUnboundOperationWithRelation(removeProductsFromCategory)
                        .withName("removeProductsFromCategory")
                        .withRelation(products)
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
