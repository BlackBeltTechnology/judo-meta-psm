package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.services.CategoryInfo;
import hu.blackbelt.model.northwind.services.ProductInfo;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.useActorType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;

public class ExternalUser {

    public ActorType $ = newActorTypeBuilder().build();
    
    public TransferObjectRelation allCategories = newTransferObjectRelationBuilder().build();
    public TransferObjectRelation allProducts = newTransferObjectRelationBuilder().build();
    
    public UnboundOperation principal = newUnboundOperationBuilder().build();
    public UnboundOperation mapPrincipal = newUnboundOperationBuilder().build();
    public UnboundOperation listAllProducts = newUnboundOperationBuilder().build();
    public UnboundOperation listAllCategories = newUnboundOperationBuilder().build();
    public UnboundOperation createInstanceAllProducts = newUnboundOperationBuilder().build();
    public UnboundOperation createInstanceAllCategories = newUnboundOperationBuilder().build();
    public UnboundOperation validateCreateInstanceAllProducts = newUnboundOperationBuilder().build();
    public UnboundOperation validateCreateInstanceAllCategories = newUnboundOperationBuilder().build();

    public void init(Model $model, ExternalAP $externalAP, ProductInfo $productInfo, CategoryInfo $categoryInfo) {
        useActorType($)
                .withName("ExternalUser")
                .withTransferObjectType($externalAP.$)
                .withRealm("")
                .withRelations(useTransferObjectRelation(allCategories)
                        .withName("allCategories")
                        .withTarget($categoryInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withEmbedded(false)
                        .withEmbeddedCreate(true)
                        .withEmbeddedDelete(true)
                        .withEmbeddedUpdate(true)
                        .withAccess(true)
                        .build()
                )
                .withRelations(useTransferObjectRelation(allProducts)
                        .withName("allProducts")
                        .withTarget($productInfo.$)
                        .withCardinality(newCardinalityBuilder()
                                .withUpper(-1))
                        .withEmbedded(false)
                        .withEmbeddedCreate(true)
                        .withEmbeddedDelete(true)
                        .withEmbeddedUpdate(true)
                        .withAccess(true)
                        .build()
                )
                .withOperations(useUnboundOperation(principal)
                        .withName("_principal")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_PRINCIPAL)
                                .withOwner(this.$)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($externalAP.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(listAllProducts)
                        .withName("_listAllProducts")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(allProducts)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(listAllCategories)
                        .withName("_listAllCategories")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.LIST)
                                .withOwner(allCategories)
                                .build())
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useUnboundOperation(createInstanceAllProducts)
                        .withName("_createInstanceAllProducts")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE_INSTANCE)
                                .withOwner(allProducts)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
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
                .withOperations(useUnboundOperation(createInstanceAllCategories)
                        .withName("_createInstanceAllCategories")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.CREATE_INSTANCE)
                                .withOwner(allCategories)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
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
                .withOperations(useUnboundOperation(validateCreateInstanceAllProducts)
                        .withName("_validateCreateInstanceAllProducts")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.VALIDATE_CREATE)
                                .withOwner(allProducts)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($productInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
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
                .withOperations(useUnboundOperation(validateCreateInstanceAllCategories)
                        .withName("_validateCreateInstanceAllCategories")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.VALIDATE_CREATE)
                                .withOwner(allCategories)
                                .build())
                        .withInput(newParameterBuilder().withName("input")
                                .withType($categoryInfo.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder()
                                		.withLower(1)
                                		.withUpper(1)
                                )
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

        useModel($model).withElements($).build();
    }
}
