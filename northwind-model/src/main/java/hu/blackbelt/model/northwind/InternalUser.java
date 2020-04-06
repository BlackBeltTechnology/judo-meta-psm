package hu.blackbelt.model.northwind;

import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.namespace.Model;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.useActorType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;

public class InternalUser {

    public ActorType $ = newActorTypeBuilder().build();

    public void init(Model $model, InternalAP $internalAP) {
        useActorType($)
                .withName("InternalUser")
                .withTransferObjectType($internalAP.$)
                .withRealm("ldapRealm")
                .build();

        useModel($model).withElements($).build();
    }
}
