package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.OrderInfo;
import hu.blackbelt.model.northwind.services.OrderItem;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.*;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Order {

    public EntityType $ = newEntityTypeBuilder().build();

    public Attribute orderDate = newAttributeBuilder().build();
    public Attribute requiredDate = newAttributeBuilder().build();
    public Attribute shippedDate = newAttributeBuilder().build();
    public Attribute freight = newAttributeBuilder().build();
    public Attribute shipName = newAttributeBuilder().build();
    public Attribute priority = newAttributeBuilder().build();

    public AssociationEnd customer = newAssociationEndBuilder().build();
    public AssociationEnd shipper = newAssociationEndBuilder().build();
    public AssociationEnd employee = newAssociationEndBuilder().build();
    public Containment shipAddress = newContainmentBuilder().build();
    public Containment orderDetails = newContainmentBuilder().build();
    public DataProperty shipped = newDataPropertyBuilder().build();
    public DataProperty shipperName = newDataPropertyBuilder().build();
    public DataProperty shipperLocation = newDataPropertyBuilder().build();
    public DataProperty hasHeavyItem = newDataPropertyBuilder().build();
    public DataProperty numberOfItems = newDataPropertyBuilder().build();
    public DataProperty numberOfDiscountedItemsOutOfStock = newDataPropertyBuilder().build();
    public DataProperty numberOfCategories = newDataPropertyBuilder().build();
    public DataProperty totalPrice = newDataPropertyBuilder().build();
    public DataProperty totalWeight = newDataPropertyBuilder().build();
    public DataProperty numberOfDiscountedProductsInCategories = newDataPropertyBuilder().build();

    public NavigationProperty discountedItemsOutOfStock = newNavigationPropertyBuilder().build();
    public NavigationProperty categories = newNavigationPropertyBuilder().build();

    public BoundOperation getDetails = newBoundOperationBuilder().build();
    public BoundOperation createDetail = newBoundOperationBuilder().build();
    public BoundOperation updateDetail = newBoundOperationBuilder().build();
    public BoundOperation deleteDetail = newBoundOperationBuilder().build();
    public BoundOperation setProductOfDetail = newBoundOperationBuilder().build();

    public void init(Package $package, String $string, TimeStamp $timeStamp, Double $double, Boolean $boolean,
                     Integer $integer, Gps $gps, Priority $priority, MassStoredInGrams $massStoredInGrams,
                     Customer $customer, Shipper $shipper, Employee $employee,
                     InternationalAddress $internationalAddress, OrderDetail $orderDetail, Category $category,
                     Territory $territory, OrderInfo $orderInfo, OrderItem $orderItem) {
        useEntityType($).withName("Order")
                .withAttributes(useAttribute(orderDate)
                        .withName("orderDate")
                        .withRequired(true)
                        .withDataType($timeStamp.$)
                )
                .withAttributes(useAttribute(requiredDate)
                        .withName("requiredDate")
                        .withDataType($timeStamp.$)
                )
                .withAttributes(useAttribute(shippedDate)
                        .withName("shippedDate")
                        .withDataType($timeStamp.$)
                )
                .withAttributes(useAttribute(freight)
                        .withName("freight")
                        .withDataType($double.$)
                )
                .withAttributes(useAttribute(shipName)
                        .withName("shipName")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(priority)
                        .withName("priority")
                        .withRequired(false)
                        .withDataType($priority.$)
                )
                .withRelations(useAssociationEnd(customer)
                        .withName("customer")
                        .withTarget($customer.$)
                        .withPartner($customer.orders)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(shipper)
                        .withName("shipper")
                        .withTarget($shipper.$)
                        .withPartner($shipper.shipperOrders)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(employee)
                        .withName("employee")
                        .withTarget($employee.$)
                        .withPartner($employee.orders)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useContainment(shipAddress)
                        .withName("shipAddress")
                        .withTarget($internationalAddress.$)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useContainment(orderDetails)
                        .withName("orderDetails")
                        .withTarget($orderDetail.$)
                        .withCardinality(newCardinalityBuilder().withLower(1).withUpper(-1))
                        .build()
                )
                .withDataProperties(useDataProperty(shipped)
                        .withName("shipped")
                        .withDataType($boolean.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.shippedDate!isdefined()"))
                        .build()
                )
                .withDataProperties(useDataProperty(shipperName)
                        .withName("shipperName")
                        .withDataType($string.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.shipper.companyName"))
                        .build()
                )
                .withDataProperties(useDataProperty(shipperLocation)
                        .withName("shipperLocation")
                        .withDataType($gps.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.shipper.location"))
                        .build()
                )
                .withNavigationProperties(useNavigationProperty(discountedItemsOutOfStock)
                        .withName("discountedItemsOutOfStock")
                        .withTarget($orderDetail.$)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .withGetterExpression(newReferenceExpressionTypeBuilder()
                                .withExpression("self.orderDetails!filter(od | od.discount > 0 and od.product.unitsInStock = 0)"))
                        .build()
                )
                .withNavigationProperties(useNavigationProperty(categories)
                        .withName("categories")
                        .withTarget($category.$)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .withGetterExpression(newReferenceExpressionTypeBuilder()
                                .withExpression("self.orderDetails.product.category"))
                        .build()
                )
                .withDataProperties(useDataProperty(hasHeavyItem)
                        .withName("hasHeavyItem")
                        .withDataType($boolean.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.orderDetails!exists(i | i.weight > 1000 [dkg])"))
                        .build()
                )
                .withDataProperties(useDataProperty(numberOfItems)
                        .withName("numberOfItems")
                        .withDataType($integer.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.orderDetails!count()"))
                        .build()
                )
                .withDataProperties(useDataProperty(numberOfDiscountedItemsOutOfStock)
                        .withName("numberOfDiscountedItemsOutOfStock")
                        .withDataType($integer.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.discountedItemsOutOfStock!count()"))
                        .build()
                )
                .withDataProperties(useDataProperty(numberOfCategories)
                        .withName("numberOfCategories")
                        .withDataType($integer.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.orderDetails.product.category!count()"))
                        .build()
                )
                .withDataProperties(useDataProperty(totalPrice)
                        .withName("totalPrice")
                        .withDataType($double.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.orderDetails!sum(i | i.price)"))
                        .build()
                )
                .withDataProperties(useDataProperty(totalWeight)
                        .withName("totalWeight")
                        .withDataType($massStoredInGrams.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.orderDetails!sum(i | i.weight)"))
                        .build()
                )
                .withDataProperties(useDataProperty(numberOfDiscountedProductsInCategories)
                        .withName("numberOfDiscountedProductsInCategories")
                        .withDataType($integer.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.categories!sum(c | c.products!filter(p | p.discounted)!count())"))
                        .build()
                )
                .withOperations(useBoundOperation(getDetails)
                        .withName("getDetails")
                        .withInstanceRepresentation($orderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundOperation(createDetail)
                        .withName("createDetail")
                        .withInstanceRepresentation($orderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundOperation(updateDetail)
                        .withName("updateDetail")
                        .withInstanceRepresentation($orderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundOperation(deleteDetail)
                        .withName("deleteDetail")
                        .withInstanceRepresentation($orderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundOperation(setProductOfDetail)
                        .withName("setProductOfDetail")
                        .withInstanceRepresentation($orderInfo.$)
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($orderItem.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
