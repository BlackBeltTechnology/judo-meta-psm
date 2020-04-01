package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.services.*;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ExternalAP {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();

    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();

    public void init(Model $model, Product $product, Category $category, AllProducts $allProducts,
                     AllCategories $allCategories) {
        useUnmappedTransferObjectType($)
                .withName("externalAP")
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withTarget($category.$)
                        .withBinding($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(products)
                        .withName("products")
                        .withTarget($product.$)
                        .withBinding($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .build();

        useModel($model).withElements($).build();
    }
}
