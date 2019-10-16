package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.TimeStamp;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newContainmentBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useContainment;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newNavigationPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newReferenceExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useDataProperty;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.useNavigationProperty;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Order {

    /*
        <elements xsi:type="data:EntityType" xmi:id="_-H4RoINkEeiLE-B2bbL0fg" name="Order">
          <attributes xmi:id="_WXvUoIN1EeiLE-B2bbL0fg" name="orderDate" dataType="_Z9J8IIN1EeiLE-B2bbL0fg"/>
          <attributes xmi:id="_ebkoMIN1EeiLE-B2bbL0fg" name="requiredDate" dataType="_Z9J8IIN1EeiLE-B2bbL0fg"/>
          <attributes xmi:id="_huP54IN1EeiLE-B2bbL0fg" name="shippedDate" dataType="_Z9J8IIN1EeiLE-B2bbL0fg"/>
          <attributes xmi:id="_kUnfMIN1EeiLE-B2bbL0fg" name="freight" dataType="_VDVVQIUcEeipmMyz9cMCRA"/>
          <attributes xmi:id="_muoDgIN1EeiLE-B2bbL0fg" name="shipName" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_OL6RULwNEeiOuYiCo6IbXQ" name="customer" target="_86B-cINkEeiLE-B2bbL0fg" partner="_KCBq0LwNEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98qutedSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_WVBGcLwNEeiOuYiCo6IbXQ" name="shipper" target="_GnEEcINlEeiLE-B2bbL0fg" partner="_Z9PKULwNEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98qutudSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_gfRT8LwNEeiOuYiCo6IbXQ" name="employee" target="_ONN9gINlEeiLE-B2bbL0fg" partner="_jOFqoLwNEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98qut-dSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:Containment" xmi:id="_spywELwNEeiOuYiCo6IbXQ" name="shipAddress" target="_vTNmEL2REeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quuOdSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:Containment" xmi:id="_2CC44LwNEeiOuYiCo6IbXQ" name="orderDetails" target="__XzocINkEeiLE-B2bbL0fg">
            <cardinality xmi:id="_98quuedSEeiJv53TEP0vvQ" lower="1" upper="-1"/>
          </relations>
          <dataProperties xmi:id="_5i40sCVQEemLpvUY7MQgng" name="shipperName" dataType="_Nppx8IUcEeipmMyz9cMCRA">
            <getterExpression xmi:id="_gs3QQDneEemsDIfvozHEKg" expression="self.shipper.companyName"/>
          </dataProperties>
          <navigationProperties xmi:id="_qMfVoHrHEemPuYxp6QV8dA" name="categories" target="_43ZPcINkEeiLE-B2bbL0fg">
            <cardinality xmi:id="_sLQIYHrHEemPuYxp6QV8dA" upper="-1"/>
            <getterExpression xmi:id="_uQwcUHrHEemPuYxp6QV8dA" expression="self.orderDetails.product.category"/>
          </navigationProperties>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();

    public Attribute orderDate = newAttributeBuilder().build();
    public Attribute requiredDate = newAttributeBuilder().build();
    public Attribute shippedDate = newAttributeBuilder().build();
    public Attribute freight = newAttributeBuilder().build();
    public Attribute shipName = newAttributeBuilder().build();

    public AssociationEnd customer = newAssociationEndBuilder().build();
    public AssociationEnd shipper = newAssociationEndBuilder().build();
    public AssociationEnd employee = newAssociationEndBuilder().build();
    public Containment shipAddress = newContainmentBuilder().build();
    public Containment orderDetails = newContainmentBuilder().build();
    public DataProperty shipperName = newDataPropertyBuilder().build();
    public NavigationProperty categories = newNavigationPropertyBuilder().build();

    public void init(Package $package, String $string, TimeStamp $timeStamp, Double $double,
        Customer $customer, Shipper $shipper, Employee $employee, InternationalAddress $internationalAddress,
                     OrderDetail $orderDetail, Category $category
    ) {
        useEntityType($).withName("Order")
                .withAttributes(useAttribute(orderDate)
                        .withName("orderDate")
                        .withRequired(true)
                        .withDataType($timeStamp.$)
                )
                .withAttributes(useAttribute(requiredDate)
                        .withName("requiredDate")
                        .withDataType($timeStamp.$)
                )
                .withAttributes(useAttribute(shippedDate)
                        .withName("shippedDate")
                        .withDataType($timeStamp.$)
                )
                .withAttributes(useAttribute(freight)
                        .withName("freight")
                        .withDataType($double.$)
                )
                .withAttributes(useAttribute(shipName)
                        .withName("shipName")
                        .withDataType($string.$)
                )
                .withRelations(useAssociationEnd(customer)
                        .withName("customer")
                        .withTarget($customer.$)
                        .withPartner($customer.orders)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(shipper)
                        .withName("shipper")
                        .withTarget($shipper.$)
                        .withPartner($shipper.shipperOrders)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(employee)
                        .withName("employee")
                        .withTarget($employee.$)
                        .withPartner($employee.orders)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useContainment(shipAddress)
                        .withName("shipAddress")
                        .withTarget($internationalAddress.$)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useContainment(orderDetails)
                        .withName("orderDetails")
                        .withTarget($orderDetail.$)
                        .withCardinality(newCardinalityBuilder().withLower(1).withUpper(-1))
                        .build()
                )
                .withDataProperties(useDataProperty(shipperName)
                        .withName("shipperName")
                        .withDataType($string.$)
                        .withGetterExpression(newDataExpressionTypeBuilder()
                                .withExpression("self.shipper.companyName"))
                        .build()
                )
                .withNavigationProperties(useNavigationProperty(categories)
                        .withName("categories")
                        .withTarget($category.$)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .withGetterExpression(newReferenceExpressionTypeBuilder()
                                .withExpression("self.orderDetails.product.category"))
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}