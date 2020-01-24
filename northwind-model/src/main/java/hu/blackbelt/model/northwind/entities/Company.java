package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Gps;
import hu.blackbelt.model.northwind.types.Phone;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Company {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute companyName = newAttributeBuilder().build();
    public Attribute contactName = newAttributeBuilder().build();
    public Attribute contactTitle = newAttributeBuilder().build();
    public Attribute phone = newAttributeBuilder().build();
    public Attribute fax = newAttributeBuilder().build();
    public Attribute location = newAttributeBuilder().build();
    public AssociationEnd manufacturedProducts = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Phone $phone, Customer $customer, Product $product, Gps $gps) {
        useEntityType($).withName("Company")
                .withSuperEntityTypes($customer.$)
                .withAttributes(useAttribute(companyName)
                        .withName("companyName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(contactName)
                        .withName("contactName")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(contactTitle)
                        .withName("contactTitle")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(phone)
                        .withName("phone")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(fax)
                        .withName("fax")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(location)
                        .withName("location")
                        .withDataType($gps.$)
                )
                .withRelations(useAssociationEnd(manufacturedProducts)
                        .withName("manufacturedProducts")
                        .withTarget($product.$)
                        .withPartner($product.manufacturers)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build())
                .build();

        usePackage($package).withElements($).build();
    }
}
