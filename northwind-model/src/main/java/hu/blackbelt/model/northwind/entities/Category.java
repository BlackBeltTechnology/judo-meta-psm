package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Binary;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Category {

    /*
        <elements xsi:type="data:EntityType" xmi:id="_43ZPcINkEeiLE-B2bbL0fg" name="Category">
          <attributes xmi:id="_v7k5EINmEeiLE-B2bbL0fg" name="categoryName" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_Vsjt0INuEeiLE-B2bbL0fg" name="description" dataType="_tXQUoIOGEeiLE-B2bbL0fg"/>
          <attributes xmi:id="_cwpboINuEeiLE-B2bbL0fg" name="picture" dataType="_j-zrcINuEeiLE-B2bbL0fg"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_892OYLwCEeiOuYiCo6IbXQ" name="products" target="_6XH80INkEeiLE-B2bbL0fg" partner="_CkXK8LwDEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98qusOdSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_NACAMOdTEeiJv53TEP0vvQ" name="owner" target="_ONN9gINlEeiLE-B2bbL0fg" partner="_Y1GwwOdTEeiJv53TEP0vvQ">
            <cardinality xmi:id="_rzreIOdUEeiJv53TEP0vvQ"/>
          </relations>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute categoryName = newAttributeBuilder().build();
    public Attribute description = newAttributeBuilder().build();
    public Attribute picture = newAttributeBuilder().build();
    public AssociationEnd products = newAssociationEndBuilder().build();
    public AssociationEnd owner = newAssociationEndBuilder().build();


    public void init(Package $package, String $string, Text $text, Binary $binary, Product $product, Employee $employee) {
        useEntityType($).withName("Category")
                .withAttributes(useAttribute(categoryName).withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(description).withName("description")
                        .withDataType($text.$)
                )
                .withAttributes(useAttribute(picture).withName("picture")
                        .withDataType($binary.$)
                )
                .withRelations(useAssociationEnd(products).withName("products")
                        .withTarget($product.$)
                        .withPartner($product.category)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(owner).withName("owner")
                        .withTarget($employee.$)
                        .withPartner($employee.category)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
