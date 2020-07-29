package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.*;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class InternalAP {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();

    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation shippers = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation allInternationalOrders = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation ordersAssignedToEmployee = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation lastTwoWeekOrders = newTransferObjectRelationBuilder().build();

    public TransferObjectRelation exposed = newTransferObjectRelationBuilder().build();

    public UnboundOperation getAllProducts = newUnboundOperationBuilder().build();
    public UnboundOperation createProduct = newUnboundOperationBuilder().build();
    public UnboundOperation updateProduct = newUnboundOperationBuilder().build();
    public UnboundOperation deleteProduct = newUnboundOperationBuilder().build();
    public UnboundOperation setCategoryOfProduct = newUnboundOperationBuilder().build();

    public Parameter inputOfCreateProduct = newParameterBuilder().build();
    public Parameter inputOfUpdateProduct = newParameterBuilder().build();
    public Parameter inputOfSetCategoryOfProduct = newParameterBuilder().build();

    public UnboundOperation getAllCategoriesToCreateProduct = newUnboundOperationBuilder().build();
    public UnboundOperation getAllCategoriesToUpdateProduct = newUnboundOperationBuilder().build();
    public UnboundOperation getAllCategoriesToSetCategoryOfProduct = newUnboundOperationBuilder().build();

    public UnboundOperation getAllCategories = newUnboundOperationBuilder().build();
    public UnboundOperation createCategory = newUnboundOperationBuilder().build();
    public UnboundOperation updateCategory = newUnboundOperationBuilder().build();
    public UnboundOperation deleteCategory = newUnboundOperationBuilder().build();
    public UnboundOperation setProductsOfCategory = newUnboundOperationBuilder().build();
    public UnboundOperation addProductsToCategory = newUnboundOperationBuilder().build();
    public UnboundOperation removeProductsFromCategory = newUnboundOperationBuilder().build();

    public UnboundOperation getAllShippers = newUnboundOperationBuilder().build();
    public UnboundOperation createShipper = newUnboundOperationBuilder().build();
    public UnboundOperation updateShipper = newUnboundOperationBuilder().build();
    public UnboundOperation deleteShipper = newUnboundOperationBuilder().build();

    public UnboundOperation getAllInternationalOrders = newUnboundOperationBuilder().build();
    public UnboundOperation createInternationalOrder = newUnboundOperationBuilder().build();
    public UnboundOperation updateInternationalOrder = newUnboundOperationBuilder().build();
    public UnboundOperation deleteInternationalOrder = newUnboundOperationBuilder().build();

    public void init(Model $model, ProductInfo $productInfo, CategoryInfo $categoryInfo, ShipperInfo $shipperInfo,
                     OrderInfo $orderInfo, InternationalOrderInfo $internationalOrderInfo, AllProducts $allProducts,
                     AllCategories $allCategories, AllShippers $allShippers,
                     OrderAssignedToEmployee $orderAssignedToEmployee, OrdersOfLastTwoWeeks $ordersOfLastTwoWeeks,
                     AllInternationalOrders $allInternationalOrders) {
        useUnmappedTransferObjectType($)
                .withName("internalAP")
                .withRelations(useTransferObjectRelation(products)
                        .withName("products")
                        .withTarget($productInfo.$)
                        .withBinding($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(shippers)
                        .withName("shippers")
                        .withTarget($shipperInfo.$)
                        .withBinding($allShippers.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withTarget($categoryInfo.$)
                        .withBinding($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(ordersAssignedToEmployee)
                        .withName("ordersAssignedToEmployee")
                        .withTarget($orderInfo.$)
                        .withBinding($orderAssignedToEmployee.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(allInternationalOrders)
                        .withName("internationalOrders")
                        .withTarget($internationalOrderInfo.$)
                        .withBinding($allInternationalOrders.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(lastTwoWeekOrders)
                        .withName("LastTwoWeekOrders")
                        .withTarget($orderInfo.$)
                        .withBinding($ordersOfLastTwoWeeks.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(exposed)
                        .withName("exposed")
                        .withTarget($internationalOrderInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                                .withUpper(1))
                        .build()
                )
                .withOperations(useUnboundOperation(getAllProducts)
                        .withName("getAllProducts")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner(products)
                                .build())
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
                .withOperations(useUnboundOperation(createProduct)
                        .withName("createProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE)
                                .withOwner(products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(useParameter(inputOfCreateProduct)
                                .withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(updateProduct)
                        .withName("updateProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE)
                                .withOwner(products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(useParameter(inputOfUpdateProduct)
                                .withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(deleteProduct)
                        .withName("deleteProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE)
                                .withOwner(products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(setCategoryOfProduct)
                        .withName("setCategoryOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
                                .withOwner(products)
                                .withRelation($productInfo.category)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(useParameter(inputOfSetCategoryOfProduct)
                                .withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllCategoriesToCreateProduct)
                        .withName("getAllCategoriesToCreateProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
                                .withOwner(inputOfCreateProduct)
                                .withRelation($productInfo.category)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllCategoriesToUpdateProduct)
                        .withName("getAllCategoriesToUpdateProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
                                .withOwner(inputOfUpdateProduct)
                                .withRelation($productInfo.category)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllCategoriesToSetCategoryOfProduct)
                        .withName("getAllCategoriesToSetCategoryOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RANGE_OF_RELATION)
                                .withOwner(inputOfSetCategoryOfProduct)
                                .withRelation($productInfo.category)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(0).withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllCategories)
                        .withName("getAllCategories")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner(categories)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createCategory)
                        .withName("createCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE)
                                .withOwner(categories)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(updateCategory)
                        .withName("updateCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE)
                                .withOwner(categories)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(deleteCategory)
                        .withName("deleteCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE)
                                .withOwner(categories)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(setProductsOfCategory)
                        .withName("setProductsOfCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.SET_RELATION)
                                .withOwner(categories)
                                .withRelation($categoryInfo.products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(addProductsToCategory)
                        .withName("addProductsToCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.ADD_ALL_TO_RELATION)
                                .withOwner(categories)
                                .withRelation($categoryInfo.products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(removeProductsFromCategory)
                        .withName("removeProductsFromCategory")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION)
                                .withOwner(categories)
                                .withRelation($categoryInfo.products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllShippers)
                        .withName("getAllShippers")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner(shippers)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createShipper)
                        .withName("createShipper")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE)
                                .withOwner(shippers)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(updateShipper)
                        .withName("updateShipper")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE)
                                .withOwner(shippers)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(deleteShipper)
                        .withName("deleteShipper")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE)
                                .withOwner(shippers)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($shipperInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(getAllInternationalOrders)
                        .withName("getAllInternationalOrders")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createInternationalOrder)
                        .withName("createInternationalOrder")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(updateInternationalOrder)
                        .withName("updateInternationalOrder")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.UPDATE)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(deleteInternationalOrder)
                        .withName("deleteInternationalOrder")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.DELETE)
                                .withOwner(allInternationalOrders)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(true)
                        )
                        .withInput(newParameterBuilder()
                                .withName("input")
                                .withType($internationalOrderInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withLower(1)
                                )
                        )
                        .build()
                )
                .build();
        useModel($model).withElements($).build();
    }
}
