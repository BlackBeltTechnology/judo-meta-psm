package hu.blackbelt.model.northwind.services;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newOperationBodyBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newBoundTransferOperationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newParameterBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferObjectRelationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferOperationBehaviourBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnboundOperationBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useBoundTransferOperation;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferAttribute;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useTransferObjectRelation;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnboundOperation;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders;
import hu.blackbelt.model.northwind.ExternalAP;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

public class Product {

    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();
    public TransferAttribute productName = newTransferAttributeBuilder().build();
    public TransferAttribute unitPrice = newTransferAttributeBuilder().build();
    public TransferAttribute weight = newTransferAttributeBuilder().build();
    public TransferObjectRelation category = newTransferObjectRelationBuilder().build();

    public UnboundOperation getAllProducts = newUnboundOperationBuilder().build();
    public BoundTransferOperation getCategoryOfProduct = newBoundTransferOperationBuilder().build();

    public void init(Package $package, String $string, Double $double, MassStoredInKilograms $massStoredInKilograms,
                     hu.blackbelt.model.northwind.entities.Product $product, Category $category,
                     AllCategories $allCategories, ExternalAP $externalAP) {
        useMappedTransferObjectType($)
                .withName("Product")
                .withEntityType($product.$)
                .withAttributes(useTransferAttribute(productName)
                        .withName("productName")
                        .withRequired(true)
                        .withDataType($string.$)
                        .withBinding($product.productName)
                )
                .withAttributes(useTransferAttribute(unitPrice)
                        .withName("unitPrice")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withBinding($product.unitPrice)
                )
                .withAttributes(useTransferAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInKilograms.$)
                        .withBinding($product.weight)
                )
                .withRelations(useTransferObjectRelation(category)
                        .withName("category")
                        .withBinding($product.category)
                        .withTarget($category.$)
                        .withRange($allCategories.$)
                        .withEmbedded(true)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1)
                        ))
                .withOperations(useUnboundOperation(getAllProducts)
                        .withName("getAllProducts")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET)
                                .withOwner($externalAP.products)
                                .build())
                        .withImplementation(newOperationBodyBuilder()
                                .withStateful(false)
                        )
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(-1)
                                )
                        )
                        .build()
                )
                .withOperations(useBoundTransferOperation(getCategoryOfProduct)
                        .withName("getCategoryOfProduct")
                        .withBehaviour(newTransferOperationBehaviourBuilder()
                                .withBehaviourType(TransferOperationBehaviourType.GET_RELATION)
                                .withOwner(category)
                                .build())
                        .withBinding($product._getCategory)
                        .withOutput(newParameterBuilder().withName("output")
                                .withType($category.$)
                                .withCardinality(TypeBuilders.newCardinalityBuilder().withUpper(1)
                                )
                        )
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
