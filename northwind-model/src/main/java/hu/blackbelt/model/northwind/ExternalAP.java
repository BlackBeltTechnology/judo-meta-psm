package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.model.northwind.services.AllCategories;
import hu.blackbelt.model.northwind.services.AllProducts;
import hu.blackbelt.model.northwind.services.CategoryInfo;
import hu.blackbelt.model.northwind.services.ProductInfo;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ExternalAP {

    public AccessPoint $ = newAccessPointBuilder().build();

    public void init(Model $model, ProductInfo $productInfo, CategoryInfo $categoryInfo, AllProducts $allProducts,
                     AllCategories $allCategories) {
        useAccessPoint($)
                .withName("externalAP")
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("products")
                        .withMappedTransferObjectType($productInfo.$)
                        .withSelector($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("categories")
                        .withMappedTransferObjectType($categoryInfo.$)
                        .withSelector($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .build();

        useModel($model).withElements($).build();
    }
}
