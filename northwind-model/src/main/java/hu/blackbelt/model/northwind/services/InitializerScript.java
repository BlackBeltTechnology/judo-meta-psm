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
                        .withBody("var demo::service::CategoryInfo category := new demo::service::CategoryInfo(categoryName := 'Laptop')\n" +
                                "var demo::service::ProductInfo product := new demo::service::ProductInfo(productName := 'Dell Vostro', unitPrice := 10000)\n" +
                                "product.category := category;\n")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
