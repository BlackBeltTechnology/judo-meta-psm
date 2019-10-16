package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Url;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Supplier {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_FWhCkINlEeiLE-B2bbL0fg" name="Supplier" superEntityTypes="_DJ29wINlEeiLE-B2bbL0fg">
          <attributes xmi:id="_-x_D8IN3EeiLE-B2bbL0fg" name="homePage" dataType="_A5EFMIN4EeiLE-B2bbL0fg"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_vr4UMOdTEeiJv53TEP0vvQ" name="suppliedProducts" target="_6XH80INkEeiLE-B2bbL0fg" partner="_vfAfILwMEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_glmp4OdZEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute homePage = newAttributeBuilder().build();
    public AssociationEnd suppliedProduct = newAssociationEndBuilder().build();

    public void init(Package $package, Url $url, Company $company, Product $product) {
        useEntityType($)
                .withName("Supplier")
                .withSuperEntityTypes($company.$)
                .withAttributes(useAttribute(homePage)
                        .withName("homePage")
                        .withDataType($url.$)
                )
                .withRelations(useAssociationEnd(suppliedProduct)
                        .withName("suppliedProducts")
                        .withTarget($product.$)
                        .withPartner($product.supplier)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
