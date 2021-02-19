package hu.blackbelt.model.northwind.extension;

import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.*;

public class Services {

    public Package $ = newPackageBuilder().build();

    public void init(Package $package) {
        usePackage($).withName("services").build();

        usePackage($package).withPackages($).build();
    }
}
