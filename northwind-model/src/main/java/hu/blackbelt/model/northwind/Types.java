package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Types {
    /*
      <packages xmi:id="_w6IJAB1WEemwg4NgOjaKeA" name="types">
     */
    public Package $ = newPackageBuilder().build();

    public void init(Model $model) {
        usePackage($)
                .withName("types")
                .build();

        useModel($model).withPackages($).build();
    }
}
