package hu.blackbelt.model.northwind.types;

import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Measured {

    public Package $ = newPackageBuilder().build();

    public void init(Package $package) {
        usePackage($)
                .withName("measured")
                .build();

        usePackage($package).withPackages($).build();
    }
}
