package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Shipper {

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd shipperOrders = newAssociationEndBuilder().build();
    public AssociationEnd territory = newAssociationEndBuilder().build();

    public void init(Package $package, Company $company, Order $order, Territory $territory) {
        useEntityType($)
                .withName("Shipper")
                .withSuperEntityTypes($company.$)
                .withRelations(useAssociationEnd(shipperOrders)
                        .withName("shipperOrders")
                        .withTarget($order.$)
                        .withPartner($order.shipper)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(territory)
                        .withName("territory")
                        .withTarget($territory.$)
                        .withPartner($territory.shipper)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
