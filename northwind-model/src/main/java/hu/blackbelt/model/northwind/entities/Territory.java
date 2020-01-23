package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Territory {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute territoryDescription = newAttributeBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();
    public AssociationEnd region = newAssociationEndBuilder().build();
    public AssociationEnd shipper = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Employee $employee, Region $region, Shipper $shipper) {
        useEntityType($)
                .withName("Territory")
                .withAttributes(useAttribute(territoryDescription)
                        .withName("territoryDescription")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(employees)
                        .withName("territory")
                        .withTarget($employee.$)
                        .withPartner($employee.territory)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(region)
                        .withName("region")
                        .withTarget($region.$)
                        .withPartner($region.territories)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(shipper)
                        .withName("shipper")
                        .withTarget($shipper.$)
                        .withPartner($shipper.territory)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
