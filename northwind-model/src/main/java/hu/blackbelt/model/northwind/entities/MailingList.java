package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class MailingList {

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd person = newAssociationEndBuilder().build();

    public void init(Package $package, Person $person) {
        useEntityType($).withName("MailingList")
                .withRelations(useAssociationEnd(person)
                        .withName("person")
                        .withTarget($person.$)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
