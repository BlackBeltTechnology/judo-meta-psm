package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;

public class Comment {

    public UnmappedTransferObjectType $ = newUnmappedTransferObjectTypeBuilder().build();

    public void init(Package $package, String $string, Text $text, TimeStamp $timeStamp) {
        useUnmappedTransferObjectType($)
                .withName("Comment")
                .withAttributes(newTransferAttributeBuilder().withName("note").withRequired(true).withDataType($text.$))
                .withAttributes(newTransferAttributeBuilder().withName("author").withDataType($string.$))
                .withAttributes(newTransferAttributeBuilder().withName("timestamp").withDataType($timeStamp.$))
                .build();

        usePackage($package).withElements($).build();
    }
}
