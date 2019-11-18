package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newNavigationPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceSelectorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useDataProperty;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useNavigationProperty;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class OrderDetail {

    /*
        <elements xsi:type="data:EntityType" xmi:id="__XzocINkEeiLE-B2bbL0fg" name="OrderDetail">
          <attributes xmi:id="_bG7OUIN6EeiLE-B2bbL0fg" name="unitPrice" dataType="_VDVVQIUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_d3obYIN6EeiLE-B2bbL0fg" name="quantity" dataType="_TXtg8IUcEeipmMyz9cMCRA" required="true"/>
          <attributes xmi:id="_jIROkIN6EeiLE-B2bbL0fg" name="discount" dataType="_VDVVQIUcEeipmMyz9cMCRA" required="true"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_6QtRsLwNEeiOuYiCo6IbXQ" name="product" target="_6XH80INkEeiLE-B2bbL0fg">
            <cardinality xmi:id="_98quuudSEeiJv53TEP0vvQ" lower="1"/>
          </relations>
          <dataProperties xmi:id="_mr-oACVvEemLpvUY7MQgng" name="productName" dataType="_Nppx8IUcEeipmMyz9cMCRA">
            <getterExpression xmi:id="_oHyJsDneEemsDIfvozHEKg" expression="self.product.productName"/>
          </dataProperties>
          <dataProperties xmi:id="_2MDDoCVvEemLpvUY7MQgng" name="categoryName" dataType="_Nppx8IUcEeipmMyz9cMCRA">
            <getterExpression xmi:id="_pXNKMDneEemsDIfvozHEKg" expression="self.product.category.categoryName"/>
          </dataProperties>
          <dataProperties xmi:id="__vG3MECrEemcEMUWkvDcXg" name="price" dataType="_VDVVQIUcEeipmMyz9cMCRA">
            <getterExpression xmi:id="_ECYDMECsEemcEMUWkvDcXg" expression="self.quantity * self.unitPrice * (1 - self.discount)"/>
          </dataProperties>
          <navigationProperties xmi:id="_rYlgkEZqEemHs64O5EYsyQ" name="category" target="_43ZPcINkEeiLE-B2bbL0fg">
            <cardinality xmi:id="_sAcx0EZqEemHs64O5EYsyQ" lower="1"/>
            <getterExpression xsi:type="derived:ReferenceSelectorType" xmi:id="_vLkC8EZqEemHs64O5EYsyQ" expression="self.product.category"/>
            <setterExpression xmi:id="_xMOTIEZqEemHs64O5EYsyQ" expression="self.product.category"/>
          </navigationProperties>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute unitPrice = newAttributeBuilder().build();
    public Attribute quantity = newAttributeBuilder().build();
    public Attribute discount = newAttributeBuilder().build();
    public DataProperty productName = newDataPropertyBuilder().build();
    public DataProperty categoryName = newDataPropertyBuilder().build();
    public DataProperty price = newDataPropertyBuilder().build();
    public NavigationProperty category = newNavigationPropertyBuilder().build();
    public AssociationEnd product = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Double $double, Integer $integer, Product $product,
                     Category $category
    ) {
        useEntityType($)
                .withName("OrderDetail")
                .withAttributes(useAttribute(unitPrice)
                        .withName("unitPrice")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(quantity)
                        .withName("quantity")
                        .withDataType($integer.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(discount)
                        .withName("discount")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withRelations(useAssociationEnd(product).withName("product")
                        .withTarget($product.$)
                        .withCardinality(newCardinalityBuilder().withLower(1))
                        .build()
                )
                .withDataProperties(useDataProperty(productName)
                        .withName("productName")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.product.productName")
                        )
                )
                .withDataProperties(useDataProperty(categoryName)
                        .withName("categoryName")
                        .withDataType($string.$)
                        .withRequired(true)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.product.category.categoryName")
                        )
                )
                .withDataProperties(useDataProperty(price)
                        .withName("price")
                        .withRequired(true)
                        .withDataType($double.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.quantity * self.unitPrice * (1 - self.discount)")
                        )
                )
                .withNavigationProperties(useNavigationProperty(category)
                        .withName("category")
                        .withTarget($category.$)
                        .withCardinality(newCardinalityBuilder()
                                .withLower(1))
                        .withGetterExpression(newReferenceSelectorTypeBuilder()
                                .withExpression("self.product.category")
                        )
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
