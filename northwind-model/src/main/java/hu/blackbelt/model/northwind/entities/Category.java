package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Binary;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Category {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute categoryName = newAttributeBuilder().build();
    public Attribute description = newAttributeBuilder().build();
    public Attribute picture = newAttributeBuilder().build();
    public AssociationEnd products = newAssociationEndBuilder().build();
    public AssociationEnd owner = newAssociationEndBuilder().build();


    public void init(Package $package, String $string, Text $text, Binary $binary, Product $product, Employee $employee) {
        useEntityType($).withName("Category")
                .withAttributes(useAttribute(categoryName).withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(description).withName("description")
                        .withDataType($text.$)
                )
                .withAttributes(useAttribute(picture).withName("picture")
                        .withDataType($binary.$)
                )
                .withRelations(useAssociationEnd(products).withName("products")
                        .withTarget($product.$)
                        .withPartner($product.category)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(owner).withName("owner")
                        .withTarget($employee.$)
                        .withPartner($employee.category)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
