package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.*;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class ExternalAP {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();

    public TransferObjectRelation categories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation products = newTransferObjectRelationBuilder().build();

    public UnboundOperation getAllProducts = newUnboundOperationBuilder().build();
    public UnboundOperation getAllCategories = newUnboundOperationBuilder().build();

    public void init(Model $model, Product $product, Category $category, AllProducts $allProducts,
                     AllCategories $allCategories) {
        useUnmappedTransferObjectType($)
                .withName("externalAP")
                .withRelations(useTransferObjectRelation(categories)
                        .withName("categories")
                        .withTarget($category.$)
                        .withBinding($allCategories.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .build()
                )
                .withRelations(useTransferObjectRelation(products)
                        .withName("products")
                        .withTarget($product.$)
                        .withBinding($allProducts.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
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
                                .withType($product.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
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
                                .withType($category.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .build();

        useModel($model).withElements($).build();
    }
}
