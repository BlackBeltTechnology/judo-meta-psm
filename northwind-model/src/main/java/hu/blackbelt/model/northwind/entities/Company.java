package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Phone;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Company {

    /*
        <elements xsi:type="data:EntityType" xmi:id="_DJ29wINlEeiLE-B2bbL0fg" name="Company" superEntityTypes="_86B-cINkEeiLE-B2bbL0fg">
          <attributes xmi:id="_Pki0cINzEeiLE-B2bbL0fg" name="companyName" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_0N8k0IN0EeiLE-B2bbL0fg" name="contactName" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <attributes xmi:id="_2IvdkIN0EeiLE-B2bbL0fg" name="contactTitle" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <attributes xmi:id="_LGcmkIN1EeiLE-B2bbL0fg" name="phone" dataType="_Lw4a8IOGEeiLE-B2bbL0fg"/>
          <attributes xmi:id="_L7hNYIN1EeiLE-B2bbL0fg" name="fax" dataType="_Lw4a8IOGEeiLE-B2bbL0fg"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_WQzLgOdUEeiJv53TEP0vvQ" name="manufacturedProducts" target="_6XH80INkEeiLE-B2bbL0fg" partner="_NN_HMOdUEeiJv53TEP0vvQ">
            <cardinality xmi:id="_ee84sOdUEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute companyName = newAttributeBuilder().build();
    public Attribute contactName = newAttributeBuilder().build();
    public Attribute contactTitle = newAttributeBuilder().build();
    public Attribute phone = newAttributeBuilder().build();
    public Attribute fax = newAttributeBuilder().build();
    public AssociationEnd manufacturedProducts = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Phone $phone, Customer $customer, Product $product) {
        useEntityType($).withName("Company")
                .withSuperEntityTypes($customer.$)
                .withAttributes(useAttribute(companyName)
                        .withName("companyName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(contactName)
                        .withName("contactName")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(contactTitle)
                        .withName("contactTitle")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(phone)
                        .withName("phone")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(fax)
                        .withName("fax")
                        .withDataType($phone.$)
                )
                .withRelations(useAssociationEnd(manufacturedProducts)
                        .withName("manufacturedProducts")
                        .withTarget($product.$)
                        .withPartner($product.manufacturers)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build())
                .build();

        usePackage($package).withElements($).build();
    }
}
