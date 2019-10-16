package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnboundOperation;

public class GetAllInternationalOrders {

    /*
    <elements xsi:type="service:UnboundOperation" xmi:id="_Yp23UIFUEemFzY3ZWApzVQ" name="getAllInternationalOrders">
      <implementation stateful="false"/>
      <output xmi:id="_Yp23UYFUEemFzY3ZWApzVQ" name="output" type="_8y7MsIFTEemFzY3ZWApzVQ">
        <cardinality xmi:id="_Yp23UoFUEemFzY3ZWApzVQ" upper="-1"/>
      </output>
    </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(Package $package, InternationalOrderInfoQuery $internationalOrderInfoQuery) {
        useUnboundOperation($)
                .withName("getAllInternationalOrders")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(false))
                .withOutput(newParameterBuilder()
                        .withName("output")
                        .withType($internationalOrderInfoQuery.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withUpper(-1)))
                .build();

        usePackage($package).withElements($).build();
    }
}
