package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Region {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_RocuQINlEeiLE-B2bbL0fg" name="Region">
          <attributes xmi:id="_U_SgsIOFEeiLE-B2bbL0fg" name="regionDescription" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_BEhSYLwPEeiOuYiCo6IbXQ" name="territories" target="_QckxAINlEeiLE-B2bbL0fg" partner="__dS14LwOEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98rVwedSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
        </elements>
    */
    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute regionDescription = newAttributeBuilder().build();
    public AssociationEnd territories = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Territory $territory) {
        useEntityType($)
                .withName("Region")
                .withAttributes(useAttribute(regionDescription)
                        .withName("regionDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(territories)
                        .withName("territories")
                        .withTarget($territory.$)
                        .withPartner($territory.region)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
