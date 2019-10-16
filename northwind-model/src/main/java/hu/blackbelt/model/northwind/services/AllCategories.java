package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.entities.Category;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useStaticNavigation;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class AllCategories {
    /*
        <elements xsi:type="derived:StaticNavigation" xmi:id="_xeUiAEZlEemHs64O5EYsyQ" name="allCategories" target="_43ZPcINkEeiLE-B2bbL0fg">
          <cardinality xmi:id="_Xu2cQEvNEemBn-SJ5OPvtg" upper="-1"/>
          <getterExpression xmi:id="_dyTMcEvNEemBn-SJ5OPvtg" expression="northwind::entities::Category"/>
        </elements>
    */
    public StaticNavigation $ = newStaticNavigationBuilder().build();

    public void init(Package $package, Category $category) {
        useStaticNavigation($)
                .withName("allCategories")
                .withTarget($category.$)
                .withCardinality(newCardinalityBuilder().withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder()
                        .withExpression("northwind::entities::Category")
                )
                .build();

        usePackage($package).withElements($).build();
    }

}
