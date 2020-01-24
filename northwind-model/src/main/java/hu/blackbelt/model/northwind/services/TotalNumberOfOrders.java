package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Integer;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class TotalNumberOfOrders {

    public StaticData $ = newStaticDataBuilder().build();

    public void init(Package $package, Integer $integer) {
       useStaticData($)
                .withName("totalNumberOfOrders")
                .withRequired(true)
                .withDataType($integer.$)
                .withGetterExpression(newDataExpressionTypeBuilder()
                        .withExpression("0 // COUNT(northwind::entities::Order)")
                )
                .build();

        usePackage($package).withElements($).build();
    }

}
