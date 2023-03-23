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
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Product {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute productName = newAttributeBuilder().build();
    public Attribute quantityPerUnit = newAttributeBuilder().build();
    public Attribute unitPrice = newAttributeBuilder().build();
    public Attribute unitsInStock = newAttributeBuilder().build();
    public Attribute unitsOnOrder = newAttributeBuilder().build();
    public Attribute reorderLevel = newAttributeBuilder().build();
    public Attribute discounted = newAttributeBuilder().build();
    public Attribute weight = newAttributeBuilder().build();
    public AssociationEnd category = newAssociationEndBuilder().build();
    public AssociationEnd supplier = newAssociationEndBuilder().build();
    public AssociationEnd manufacturers = newAssociationEndBuilder().build();
    public AssociationEnd store = newAssociationEndBuilder().build();

    public BoundOperation listCategoryForNorthwind_services_ProductInfo = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, Boolean $boolean,
                     MassStoredInKilograms $massStoredInKilograms, Category $category, Supplier $supplier,
                     Company $company, Store $store, hu.blackbelt.model.northwind.services.Product $product,
                     hu.blackbelt.model.northwind.services.Category $category_, ProductInfo $productInfo,
                     CategoryInfo $categoryInfo) {
        useEntityType($)
                .withName("Product")
                .withAttributes(useAttribute(productName)
                        .withName("productName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(quantityPerUnit)
                        .withName("quantityPerUnit")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(unitPrice)
                        .withName("unitPrice")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(unitsInStock)
                        .withName("unitsInStock")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(unitsOnOrder)
                        .withName("unitsOnOrder")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(reorderLevel)
                        .withName("reorderLevel")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(discounted)
                        .withName("discounted")
                        .withDataType($boolean.$)
                )
                .withAttributes(useAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInKilograms.$)
                )
                .withRelations(useAssociationEnd(category)
                        .withName("category")
                        .withTarget($category.$)
                        .withPartner($category.products)
                        .withCardinality(newCardinalityBuilder()
                            .withLower(1)
                        )
                        .build()
                )
                .withRelations(useAssociationEnd(supplier)
                        .withName("supplier")
                        .withTarget($supplier.$)
                        .withPartner($supplier.suppliedProduct)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(manufacturers)
                        .withName("manufacturers")
                        .withTarget($company.$)
                        .withPartner($company.manufacturedProducts)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(store)
                        .withName("store")
                        .withTarget($store.$)
                        .withPartner($store.products)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withOperations(useBoundOperation(listCategoryForNorthwind_services_ProductInfo)
                        .withName("_listCategoryForNorthwind_services_ProductInfo")
                        .withInstanceRepresentation($productInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                        .withLower(1)
                                        .withUpper(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
