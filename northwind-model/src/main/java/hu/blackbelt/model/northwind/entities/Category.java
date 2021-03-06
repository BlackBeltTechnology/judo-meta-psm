package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.CategoryInfo;
import hu.blackbelt.model.northwind.services.ProductInfo;
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

    public BoundOperation listProducts = newBoundOperationBuilder().build();
    public BoundOperation moveProducts = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, Text $text, Binary $binary, Product $product, Employee $employee,
                     hu.blackbelt.model.northwind.services.Category $category, hu.blackbelt.model.northwind.services.Product $product_,
                     CategoryInfo $categoryInfo, ProductInfo $productInfo) {
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
                .withOperations(useBoundOperation(listProducts)
                        .withName("_listProductsForNorthwind_services_CategoryInfo")
                        .withInstanceRepresentation($categoryInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundOperation(moveProducts)
                        .withName("_moveProducts")
                        .withInstanceRepresentation($categoryInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withCustomImplementation(true)
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(-1).build()
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
