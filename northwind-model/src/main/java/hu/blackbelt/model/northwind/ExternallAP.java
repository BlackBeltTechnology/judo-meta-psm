package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.model.northwind.services.AllCategories;
import hu.blackbelt.model.northwind.services.AllProducts;
import hu.blackbelt.model.northwind.services.CategoryInfo;
import hu.blackbelt.model.northwind.services.ProductInfo;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newAccessPointBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newExposedGraphBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.useAccessPoint;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ExternallAP {

    /*
      <elements xsi:type="accesspoint:AccessPoint" xmi:id="_X9vDsEZlEemHs64O5EYsyQ" name="internalAP">
        <exposedGraphs xmi:id="_hanN0EZlEemHs64O5EYsyQ" name="ordersAssignedToEmployee" mappedTransferObjectType="_ETGEYCVQEemLpvUY7MQgng" selector="_EuQ5MCYbEemLpvUY7MQgng">
          <cardinality xmi:id="_ApEPoKiXEemuF_XcMCHsqg" upper="-1"/>
        </exposedGraphs>
        <exposedServices xmi:id="_fvPm8EyhEemBn-SJ5OPvtg" operation="_mr1P4EWhEemHs64O5EYsyQ"/>
        <exposedServices xmi:id="_R0KCoKiXEemuF_XcMCHsqg" operation="_Yp23UIFUEemFzY3ZWApzVQ"/>
        <exposedServices xmi:id="_ErUCYHsLEemPuYxp6QV8dA" operation="_nkcqoHruEemPuYxp6QV8dA"/>
        <exposedServices xmi:id="_GskDIKiXEemuF_XcMCHsqg" operation="_SZmaMIFUEemFzY3ZWApzVQ"/>
        <exposedServices xmi:id="_G94coKiXEemuF_XcMCHsqg" operation="_99BAcKiTEemuF_XcMCHsqg"/>
        <exposedServices xmi:id="_HEroMKiXEemuF_XcMCHsqg" operation="_5fazwKiTEemuF_XcMCHsqg"/>
        <exposedServices xmi:id="_MVcXMKiXEemuF_XcMCHsqg" operation="__nxSEKiTEemuF_XcMCHsqg"/>
      </elements>
     */
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
