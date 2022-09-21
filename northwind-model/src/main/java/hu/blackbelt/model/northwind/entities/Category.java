package hu.blackbelt.model.northwind.entities;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.CategoryInfo;
import hu.blackbelt.model.northwind.services.ProductInfo;
import hu.blackbelt.model.northwind.types.Photo;
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

    public void init(Package $package, String $string, Text $text, Photo $photo, Product $product, Employee $employee,
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
                        .withDataType($photo.$)
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
