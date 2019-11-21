package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.model.northwind.entities.InternationalOrder;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newMappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useMappedTransferObjectType;

public class InternationalOrderInfoQuery {

    /*
    <elements xsi:type="service:MappedTransferObjectType" xmi:id="_8y7MsIFTEemFzY3ZWApzVQ" name="InternationalOrderInfoQuery" entityType="_MoVqYINlEeiLE-B2bbL0fg" entityReferencePresence="REQUIRED">
      <relations xmi:id="_8y7MsYFTEemFzY3ZWApzVQ" name="items" binding="_2CC44LwNEeiOuYiCo6IbXQ" target="_nao6QCVuEemLpvUY7MQgng" embedded="true">
        <cardinality xmi:id="_8y7MsoFTEemFzY3ZWApzVQ" upper="-1"/>
      </relations>
      <relations xmi:id="_8y7Ms4FTEemFzY3ZWApzVQ" name="categories" binding="_qMfVoHrHEemPuYxp6QV8dA" target="_xxeTIEWXEemHs64O5EYsyQ" embedded="true">
        <cardinality xmi:id="_8y7MtIFTEemFzY3ZWApzVQ" upper="-1"/>
      </relations>
      <attributes xmi:id="_8y7MtYFTEemFzY3ZWApzVQ" name="orderDate" required="true" dataType="_Z9J8IIN1EeiLE-B2bbL0fg" binding="_WXvUoIN1EeiLE-B2bbL0fg"/>
      <attributes xmi:id="_8y7MtoFTEemFzY3ZWApzVQ" name="shipperName" dataType="_Nppx8IUcEeipmMyz9cMCRA" binding="_5i40sCVQEemLpvUY7MQgng"/>
    </elements>
    */
    public MappedTransferObjectType $ = newMappedTransferObjectTypeBuilder().build();

    public void init(Package $package, InternationalOrder $internationalOrder,
                     OrderInfoQuery $orderInfoQuery) {
        useMappedTransferObjectType($)
                .withName("InternationalOrderInfoQuery")
                .withEntityType($internationalOrder.$)
                .withSuperTransferObjectTypes($orderInfoQuery.$)
                .build();

        usePackage($package).withElements($).build();
    }
}
