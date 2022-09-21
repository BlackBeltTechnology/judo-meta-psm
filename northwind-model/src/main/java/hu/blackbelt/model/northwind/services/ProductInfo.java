package hu.blackbelt.model.northwind.services;

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

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.entities.Product;
import hu.blackbelt.model.northwind.extension.services.GetRangeInputProductInfoCategory;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ProductInfo {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute unitsInStock = newTransferAttributeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();
    public TransferAttribute weight = newTransferAttributeBuilder().build();
    public TransferAttribute discounted = newTransferAttributeBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public UnboundOperation getRangeReferenceCategory = newUnboundOperationBuilder().build();

    public BoundTransferOperation listCategory = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, Boolean $boolean,
                     MassStoredInKilograms $massStoredInKilograms, Product $product, CategoryInfo $categoryInfo,
                     AllCategories $allCategories, GetRangeInputProductInfoCategory $getRangeInput) {
        useMappedTransferObjectType($)
                .withName("ProductInfo")
                .withEntityType($product.$)
                .withAttributes(useTransferAttribute(unitPrice)
                        .withName("unitPrice")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($product.unitPrice)
                )
                .withAttributes(useTransferAttribute(unitsInStock)
                        .withName("unitsInStock")
                        .withDataType($integer.$)
                        .withBinding($product.unitsInStock)
                )
                .withAttributes(useTransferAttribute(productName)
                        .withName("productName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($product.productName)
                )
                .withAttributes(useTransferAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInKilograms.$)
                        .withBinding($product.weight)
                )
                .withAttributes(useTransferAttribute(discounted)
                        .withName("discounted")
                        .withDataType($boolean.$)
                        .withBinding($product.discounted)
                )
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($product.category)
                        .withTarget($categoryInfo.$)
                        .withRange($allCategories.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                                .withUpper(1)
                        ))
                .withOperations(useUnboundOperation(getRangeReferenceCategory)
                        .withName("_getRangeReferenceCategory")
                        .withImmutable(true)
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE)
                                .withOwner(category)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($getRangeInput.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(listCategory)
                        .withName("_listCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(category)
                                .build())
                        .withBinding($product.listCategoryForNorthwind_services_ProductInfo)
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
