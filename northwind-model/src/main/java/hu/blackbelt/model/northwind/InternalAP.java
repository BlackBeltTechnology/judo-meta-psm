package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.model.northwind.services.CreateCategory;
import hu.blackbelt.model.northwind.services.CreateInternationalOrder;
import hu.blackbelt.model.northwind.services.CreateOrder;
import hu.blackbelt.model.northwind.services.CreateProduct;
import hu.blackbelt.model.northwind.services.CreateShipper;
import hu.blackbelt.model.northwind.services.GetAllInternationalOrders;
import hu.blackbelt.model.northwind.services.GetAllOrders;
import hu.blackbelt.model.northwind.services.OrderAssignedToEmployee;
import hu.blackbelt.model.northwind.services.OrderInfoQuery;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newAccessPointBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newExposedGraphBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newExposedServiceBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.useAccessPoint;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternalAP {

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


    public void init(Model $model, OrderInfoQuery $orderInfoQuery,
                     GetAllOrders $getAllOrders, GetAllInternationalOrders $getAllInternationalOrders,
                     CreateOrder $createOrder, CreateInternationalOrder $createInternationalOrder,
                     CreateShipper $createShipper, CreateProduct $createProduct, CreateCategory $createCategory,
                     OrderAssignedToEmployee $orderAssignedToEmployee
    ) {
        useAccessPoint($)
                .withName("internalAP")
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("ordersAssignedToEmployee")
                        .withSelector($orderAssignedToEmployee.$)
                        .withMappedTransferObjectType($orderInfoQuery.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedServices(newExposedServiceBuilder().withOperation($getAllOrders.$))
                .withExposedServices(newExposedServiceBuilder().withOperation($getAllInternationalOrders.$))
                .withExposedServices(newExposedServiceBuilder().withOperation($createOrder.$))
                .withExposedServices(newExposedServiceBuilder().withOperation($createInternationalOrder.$))
                .withExposedServices(newExposedServiceBuilder().withOperation($createShipper.$))
                .withExposedServices(newExposedServiceBuilder().withOperation($createProduct.$))
                .withExposedServices(newExposedServiceBuilder().withOperation($createCategory.$))
                .build();
        useModel($model).withElements($).build();
    }
}
