package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;

import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class CreateInternationalOrder {

    /*
    <elements xsi:type="service:UnboundOperation" xmi:id="_SZmaMIFUEemFzY3ZWApzVQ" name="createInternationalOrder">
      <implementation stateful="false" customImplementation="true"/>
      <output xmi:id="_SZmaMYFUEemFzY3ZWApzVQ" name="output" type="_HebikIFTEemFzY3ZWApzVQ">
        <cardinality xmi:id="_SZmaMoFUEemFzY3ZWApzVQ" lower="1"/>
      </output>
      <input xmi:id="_SZmaM4FUEemFzY3ZWApzVQ" name="input" type="_HebikIFTEemFzY3ZWApzVQ">
        <cardinality xmi:id="_SZmaNIFUEemFzY3ZWApzVQ" lower="1"/>
      </input>
    </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(InternationalOrderInfo $internationalOrderInfo) {
        useUnboundOperation($)
                .withName("createInternationalOrder")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(true)
                        .withCustomImplementation(true)
                )
                .withInput(newParameterBuilder()
                        .withName("input")
                        .withType($internationalOrderInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .withOutput(newParameterBuilder()
                        .withName("output")
                        .withType($internationalOrderInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .build();

        useMappedTransferObjectType($internationalOrderInfo.$).withOperations($).build();
    }
}
