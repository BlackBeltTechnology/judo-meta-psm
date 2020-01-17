package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.model.northwind.services.AllInternationalOrders;
import hu.blackbelt.model.northwind.services.CreateInternationalOrder;
import hu.blackbelt.model.northwind.services.CreateOrder;
import hu.blackbelt.model.northwind.services.InternationalOrderInfoQuery;
import hu.blackbelt.model.northwind.services.OrderAssignedToEmployee;
import hu.blackbelt.model.northwind.services.OrderInfoQuery;
import hu.blackbelt.model.northwind.services.OrdersOfLastTwoWeeks;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.*;
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


    public void init(Model $model, OrderInfoQuery $orderInfoQuery, InternationalOrderInfoQuery $internationalOrderInfoQuery,
                     CreateOrder $createOrder, CreateInternationalOrder $createInternationalOrder,
                     OrderAssignedToEmployee $orderAssignedToEmployee, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks,
                     AllInternationalOrders $allInternationalOrders) {
        useAccessPoint($)
                .withName("internalAP")
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("ordersAssignedToEmployee")
                        .withSelector($orderAssignedToEmployee.$)
                        .withMappedTransferObjectType($orderInfoQuery.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withCreate($createOrder.$)
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("allInternationalOrders")
                        .withSelector($allInternationalOrders.$)
                        .withMappedTransferObjectType($internationalOrderInfoQuery.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withCreate($createInternationalOrder.$)
                        .build()
                )
                .withExposedGraphs(newExposedGraphBuilder()
                        .withName("LastTwoWeekOrders")
                        .withSelector($ordersOfLastTwoWeeks.$)
                        .withMappedTransferObjectType($orderInfoQuery.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withExposedServices(newExposedServiceBuilder().withName("exposed").withOperationGroup($internationalOrderInfoQuery.$)).build();
        useModel($model).withElements($).build();
    }
}
