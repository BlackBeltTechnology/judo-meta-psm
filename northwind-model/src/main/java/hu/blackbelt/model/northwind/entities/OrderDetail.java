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
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.OrderItem;
import hu.blackbelt.model.northwind.services.ProductInfo;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderDetail {

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute unitPrice = newAttributeBuilder().build();
    public Attribute quantity = newAttributeBuilder().build();
    public Attribute discount = newAttributeBuilder().build();
    public DataProperty productName = newDataPropertyBuilder().build();
    public DataProperty categoryName = newDataPropertyBuilder().build();
    public DataProperty price = newDataPropertyBuilder().build();
    public DataProperty weight = newDataPropertyBuilder().build();
    public DataProperty heavy = newDataPropertyBuilder().build();
    public NavigationProperty category = newNavigationPropertyBuilder().build();
    public AssociationEnd product = newAssociationEndBuilder().build();

    public BoundOperation listProduct = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, Double $double, Integer $integer, Boolean $boolean,
                     MassStoredInGrams $massStoredInGrams, Product $product, Category $category,
                     OrderItem $orderItem, ProductInfo $productInfo) {
        useEntityType($)
                .withName("OrderDetail")
                .withAttributes(useAttribute(unitPrice)
                        .withName("unitPrice")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(quantity)
                        .withName("quantity")
                        .withDataType($integer.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(discount)
                        .withName("discount")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(product).withName("product")
                        .withTarget($product.$)
                        .withCardinality(newCardinalityBuilder().withLower(1))
                        .build()
                )
                .withDataProperties(useDataProperty(productName)
                        .withName("productName")
                        .withDataType($string.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.product.productName")
                        )
                )
                .withDataProperties(useDataProperty(categoryName)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.category.categoryName")
                        )
                )
                .withDataProperties(useDataProperty(price)
                        .withName("price")
                        .withDataType($double.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.quantity * self.unitPrice * (1 - self.discount)")
                        )
                )
                .withDataProperties(useDataProperty(weight)
                        .withName("weight")
                        .withDataType($massStoredInGrams.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.quantity * self.product.weight")
                        )
                )
                .withDataProperties(useDataProperty(heavy)
                        .withName("heavy")
                        .withDataType($boolean.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.weight > 1000 [dkg]")
                        )
                )
                .withNavigationProperties(useNavigationProperty(category)
                        .withName("category")
                        .withTarget($category.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(0))
                        .withGetterExpression(newReferenceSelectorTypeBuilder()
                                .withExpression("self.product.category")
                        )
                )
                .withOperations(useBoundOperation(listProduct)
                        .withName("_listProductForNorthwind_services_OrderItem")
                        .withInstanceRepresentation($orderItem.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
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
