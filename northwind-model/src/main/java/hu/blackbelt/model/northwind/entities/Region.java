package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Region {

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
