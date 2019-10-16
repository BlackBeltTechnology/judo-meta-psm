package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Measures {
    /*
      <packages xmi:id="_g0GS4B1REemwg4NgOjaKeA" name="measures">
     */
    public Package $ = newPackageBuilder().build();

    public void init(Model $model) {
        usePackage($).withName("measures").build();

        useModel($model).withPackages($).build();
    }
}
