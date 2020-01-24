package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class PaymentList {

    public EntityType $ = newEntityTypeBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();

    public void init(Package $package, Employee $employee) {
        useEntityType($)
                .withName("PaymentList")
                .withRelations(useAssociationEnd(employees)
                        .withName("employees")
                        .withTarget($employee.$)
                        .withCardinality(newCardinalityBuilder().withLower(1).withUpper(-1))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
