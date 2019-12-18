package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.entities.Product;

import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newStaticNavigationBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useStaticNavigation;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class AllProducts {
    /*
        <elements xsi:type="derived:StaticNavigation" xmi:id="_vA7SgEZlEemHs64O5EYsyQ" name="allProducts" target="_6XH80INkEeiLE-B2bbL0fg">
          <cardinality xmi:id="_WlEJsEvNEemBn-SJ5OPvtg" upper="-1"/>
          <getterExpression xmi:id="_a_OA0EvNEemBn-SJ5OPvtg" expression="northwind::entities::Product"/>
        </elements>
    */
    public StaticNavigation $ = newStaticNavigationBuilder().build();

    public void init(Package $package, Product $product) {
        useStaticNavigation($)
                .withName("allProducts")
                .withTarget($product.$)
                .withCardinality(newCardinalityBuilder().withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder()
                        .withExpression("demo::entities::Product")
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
