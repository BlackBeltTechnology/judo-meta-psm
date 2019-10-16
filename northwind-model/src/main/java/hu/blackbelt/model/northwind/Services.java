package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Services {
    /*
      <packages xmi:id="__cC14CVPEemLpvUY7MQgng" name="service">
     */
    public Package $ = newPackageBuilder().build();

    public void init(Model $model) {
        usePackage($).withName("services").build();

        useModel($model).withPackages($).build();
    }
}
