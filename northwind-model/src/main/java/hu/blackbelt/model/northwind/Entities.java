package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Entities {
    /*
      <packages xmi:id="_l025cNODEeim9MGHLpE1bQ" name="entities">
     */
    public Package $ = newPackageBuilder().build();

    public void init(Model $model) {
        usePackage($).withName("entities").build();

        useModel($model).withPackages($).build();
    }
}
