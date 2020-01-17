package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;

import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class CreateProduct {
    /*
        <elements xsi:type="service:UnboundOperation" xmi:id="_99BAcKiTEemuF_XcMCHsqg" name="createProduct">
          <implementation stateful="false" customImplementation="true"/>
          <output xmi:id="_D-kTMKiUEemuF_XcMCHsqg" name="output" type="_o7IkkEWXEemHs64O5EYsyQ">
            <cardinality xmi:id="_D-kTMaiUEemuF_XcMCHsqg" lower="1"/>
          </output>
          <input xmi:id="_D-kTMqiUEemuF_XcMCHsqg" name="input" type="_o7IkkEWXEemHs64O5EYsyQ">
            <cardinality xmi:id="_D-kTM6iUEemuF_XcMCHsqg" lower="1"/>
          </input>
        </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(ProductInfo $productInfo) {
        useUnboundOperation($)
                .withName("createProduct")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(true)
                        .withCustomImplementation(true)
                )
                .withInput(newParameterBuilder()
                        .withName("input")
                        .withType($productInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .withOutput(newParameterBuilder()
                        .withName("output")
                        .withType($productInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder()
                                .withLower(1)
                        )
                )
                .build();

        useMappedTransferObjectType($productInfo.$).withOperations($).build();
    }
}
