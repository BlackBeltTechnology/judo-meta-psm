package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class InternalAP {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();
    
    public TransferAttribute email = newTransferAttributeBuilder().build();

    public void init(Model $model, String $string) {
        useUnmappedTransferObjectType($)
                .withName("internalAP")
                .withAttributes(useTransferAttribute(email)
                        .withName("email")
                        .withRequired(false)
                        .withDataType($string.$)
                )
                .build();
        useModel($model).withElements($).build();
    }
}
