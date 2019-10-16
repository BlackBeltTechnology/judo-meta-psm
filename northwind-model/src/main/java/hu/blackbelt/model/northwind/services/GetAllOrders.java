package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnboundOperation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class GetAllOrders {

    /*
        <elements xsi:type="service:UnboundOperation" xmi:id="_mr1P4EWhEemHs64O5EYsyQ" name="getAllOrders">
          <implementation stateful="false"/>
          <output xmi:id="_oxIvgEWhEemHs64O5EYsyQ" name="output" type="_ETGEYCVQEemLpvUY7MQgng">
            <cardinality xmi:id="_rFrlAEWhEemHs64O5EYsyQ" upper="-1"/>
          </output>
        </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(Package $package, OrderInfoQuery $orderInfoQuery) {
        useUnboundOperation($)
                .withName("getAllOrders")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(false))
                .withOutput(newParameterBuilder()
                        .withName("output")
                        .withType($orderInfoQuery.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1)))
                .build();

        usePackage($package).withElements($).build();
    }
}
