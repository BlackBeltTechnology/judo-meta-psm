package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.*;

public class Optional {

    public Package $ = newPackageBuilder().build();

    public void init(Model $model) {
        usePackage($).withName("_optional_transferobjecttypes").build();

        useModel($model).withPackages($).build();
    }
}
