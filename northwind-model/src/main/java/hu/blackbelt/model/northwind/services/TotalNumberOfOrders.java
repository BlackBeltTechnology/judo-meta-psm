package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Integer;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticDataBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useStaticData;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class TotalNumberOfOrders {
    /*
        <elements xsi:type="derived:StaticData" xmi:id="_r7S1QE7fEemZHbZiENeSGg" name="totalNumberOfOrders" dataType="_SZ-GUIUcEeipmMyz9cMCRA" required="true">
          <getterExpression xmi:id="_yldAIE7fEemZHbZiENeSGg" expression="0 // COUNT(northwind::entities::Order)"/>
        </elements
    */
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
