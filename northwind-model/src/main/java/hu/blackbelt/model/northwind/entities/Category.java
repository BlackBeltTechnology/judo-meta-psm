package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.types.Binary;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Category {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute categoryName = newAttributeBuilder().build();
    public Attribute description = newAttributeBuilder().build();
    public Attribute picture = newAttributeBuilder().build();
    public AssociationEnd products = newAssociationEndBuilder().build();
    public AssociationEnd owner = newAssociationEndBuilder().build();

    public BoundOperation _getProducts = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, Text $text, Binary $binary, Product $product, Employee $employee,
                     hu.blackbelt.model.northwind.services.Category $category, hu.blackbelt.model.northwind.services.Product $product_) {
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
                .withOperations(useBoundOperation(_getProducts)
                        .withName("_getProducts")
                        .withInstanceRepresentation($category.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($product_.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
