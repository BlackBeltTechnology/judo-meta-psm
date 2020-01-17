package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;

import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class CreateOrder {

    /*
    <elements xsi:type="service:UnboundOperation" xmi:id="_nkcqoHruEemPuYxp6QV8dA" name="createOrder">
      <implementation stateful="false" customImplementation="true"/>
      <output xmi:id="_rcO0gHruEemPuYxp6QV8dA" name="output" type="_-L7R4IFREemFzY3ZWApzVQ">
        <cardinality xmi:id="_EH3n0HrvEemPuYxp6QV8dA" lower="1"/>
      </output>
      <input xmi:id="_pwQa4HruEemPuYxp6QV8dA" name="input" type="_-L7R4IFREemFzY3ZWApzVQ">
        <cardinality xmi:id="_EfGcEHrvEemPuYxp6QV8dA" lower="1"/>
      </input>
    </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(OrderInfo $orderInfo) {
        useUnboundOperation($)
                .withName("createOrder")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(true)
                        .withCustomImplementation(true)
                )
                .withInput(newParameterBuilder()
                        .withName("input")
                        .withType($orderInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .withOutput(newParameterBuilder()
                        .withName("output")
                        .withType($orderInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .build();

        useMappedTransferObjectType($orderInfo.$).withOperations($).build();
    }
}
