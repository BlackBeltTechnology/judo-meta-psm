package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.*;

public class Services {

    public Package $ = newPackageBuilder().build();

    public void init(Model $model) {
        usePackage($).withName("services").build();

        useModel($model).withPackages($).build();
    }
}
