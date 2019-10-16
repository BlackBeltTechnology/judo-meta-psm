package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class MailingList {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_jHvr8OdYEeiJv53TEP0vvQ" name="MailingList">
          <relations xsi:type="data:AssociationEnd" xmi:id="_y1GVoOdYEeiJv53TEP0vvQ" name="person" target="_rIapkLzhEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_64Hw4OdYEeiJv53TEP0vvQ"/>
          </relations>
        </elements>
    */

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
