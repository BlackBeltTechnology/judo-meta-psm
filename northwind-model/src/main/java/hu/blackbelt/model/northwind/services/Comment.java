package hu.blackbelt.model.northwind.services;

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newTransferAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.useUnmappedTransferObjectType;

public class Comment {

    /*
    <elements xsi:type="service:UnmappedTransferObjectType" xmi:id="_wNexgKiXEemuF_XcMCHsqg" name="Comment">
      <attributes xmi:id="_yNTUMKiXEemuF_XcMCHsqg" name="note" required="true" dataType="_tXQUoIOGEeiLE-B2bbL0fg"/>
      <attributes xmi:id="_zE1ZIKiXEemuF_XcMCHsqg" name="author" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_ziXpsKiXEemuF_XcMCHsqg" name="timestamp" dataType="_Z9J8IIN1EeiLE-B2bbL0fg"/>
    </elements>
    */
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
