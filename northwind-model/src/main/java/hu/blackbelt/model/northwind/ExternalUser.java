package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.namespace.Model;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.useActorType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;

public class ExternalUser {

    public ActorType $ = newActorTypeBuilder().build();

    public void init(Model $model, ExternalAP $externalAP) {
        useActorType($)
                .withName("ExternalUser")
                .withTransferObjectType($externalAP.$)
                .build();

        useModel($model).withElements($).build();
    }
}
