package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Address {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute address = newAttributeBuilder().build();
    public Attribute region = newAttributeBuilder().build();
    public Attribute postalCode = newAttributeBuilder().build();
    public Attribute description = newAttributeBuilder().build();
    public AssociationEnd city = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, City $city, Text $text) {
        useEntityType($).withName("Address")
                .withAttributes(useAttribute(address)
                        .withName("address")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(region)
                        .withName("region")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(postalCode)
                        .withName("postalCode")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(description)
                        .withName("description")
                        .withDataType($text.$)
                        .withRequired(false)
                )
                .withRelations(useAssociationEnd(city)
                        .withName("city")
                        .withTarget($city.$)
                        .withCardinality(newCardinalityBuilder().withLower(1))
                        .build()
                )

                .build();

        usePackage($package).withElements($).build();
    }
}
