package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnboundOperation;

public class InitializerScript {
    public UnboundOperation $ = ServiceBuilders.newUnboundOperationBuilder().build();

    public void init(Package $package) {
        useUnboundOperation($)
                .withName("initializerScript")
                .withImplementation(newOperationBodyBuilder()
                        .withStateful(true)
                        .withCustomImplementation(true)
                        .withBody("var demo::services::CategoryInfo category := new demo::services::CategoryInfo(categoryName := 'Laptop')\n" +
                                "var demo::services::ProductInfo product := new demo::services::ProductInfo(productName := 'Dell Vostro', unitPrice := 10000, category := category)"
                ))
                .build();

        usePackage($package).withElements($).build();
    }
}
