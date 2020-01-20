package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;
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

    public ExposedGraph categories = newExposedGraphBuilder().build();
    public ExposedGraph products = newExposedGraphBuilder().build();

    public void init(Model $model, ProductInfo $productInfo, CategoryInfo $categoryInfo, AllProducts $allProducts,
                     AllCategories $allCategories) {
        useAccessPoint($)
                .withName("externalAP")
                .withExposedGraphs(useExposedGraph(categories)
                        .withName("categories")
                        .withMappedTransferObjectType($categoryInfo.$)
                        .withSelector($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedGraphs(useExposedGraph(products)
                        .withName("products")
                        .withMappedTransferObjectType($productInfo.$)
                        .withSelector($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .build();

        useModel($model).withElements($).build();
    }
}
