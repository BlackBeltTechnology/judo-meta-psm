package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnboundOperation;

public class CreateCategory {

    /*
    <elements xsi:type="service:UnboundOperation" xmi:id="__nxSEKiTEemuF_XcMCHsqg" name="createCategory">
      <implementation stateful="false" customImplementation="true"/>
      <output xmi:id="_D1RNQKiUEemuF_XcMCHsqg" name="output" type="_xxeTIEWXEemHs64O5EYsyQ">
        <cardinality xmi:id="_D1RNQaiUEemuF_XcMCHsqg" lower="1"/>
      </output>
      <input xmi:id="_D1RNQqiUEemuF_XcMCHsqg" name="input" type="_xxeTIEWXEemHs64O5EYsyQ">
        <cardinality xmi:id="_D1RNQ6iUEemuF_XcMCHsqg" lower="1"/>
      </input>
    </elements>
    */
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(Package $package, CategoryInfo $categoryInfo) {
        useUnboundOperation($)
                .withName("createCategory")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(true)
                        .withCustomImplementation(true)
                )
                .withInput(newParameterBuilder()
                        .withName("input")
                        .withType($categoryInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                        )
                )
                .withOutput(newParameterBuilder().withName("output")
                        .withType($categoryInfo.$)
                        .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                        )
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
