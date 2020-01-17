package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;

import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class CreateShipper {

    /*
    <elements xsi:type="service:UnboundOperation" xmi:id="_5fazwKiTEemuF_XcMCHsqg" name="createShipper">
      <implementation stateful="false" customImplementation="true"/>
      <output xmi:id="_EE-dMKiUEemuF_XcMCHsqg" name="output" type="_OUfQ4IFSEemFzY3ZWApzVQ">
        <cardinality xmi:id="_EE-dMaiUEemuF_XcMCHsqg" lower="1"/>
      </output>
      <input xmi:id="_EE-dMqiUEemuF_XcMCHsqg" name="input" type="_OUfQ4IFSEemFzY3ZWApzVQ">
        <cardinality xmi:id="_EE-dM6iUEemuF_XcMCHsqg" lower="1"/>
      </input>
    </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(ShipperInfo $shipperInfo) {
        useUnboundOperation($)
                .withName("createShipper")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(true)
                        .withCustomImplementation(true)
                )
                .withInput(newParameterBuilder()
                        .withName("input")
                        .withType($shipperInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .withOutput(newParameterBuilder()
                        .withName("output")
                        .withType($shipperInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .build();

        useMappedTransferObjectType($shipperInfo.$).withOperations($).build();
    }
}
