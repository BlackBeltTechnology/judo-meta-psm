package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Binary;
import hu.blackbelt.model.northwind.types.Date;
import hu.blackbelt.model.northwind.types.Phone;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newContainmentBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useContainment;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Employee {
    /*
        <elements xsi:type="data:EntityType" xmi:id="_ONN9gINlEeiLE-B2bbL0fg" name="Employee" superEntityTypes="_rIapkLzhEeiOuYiCo6IbXQ">
          <attributes xmi:id="_DtM4YIOGEeiLE-B2bbL0fg" name="titleOfCourtesy" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <attributes xmi:id="_GGZkYIOGEeiLE-B2bbL0fg" name="birthDate" dataType="_YoqOYIN1EeiLE-B2bbL0fg"/>
          <attributes xmi:id="_ISSNIIOGEeiLE-B2bbL0fg" name="hireDate" dataType="_YoqOYIN1EeiLE-B2bbL0fg"/>
          <attributes xmi:id="_KMDLIIOGEeiLE-B2bbL0fg" name="homePhone" dataType="_Lw4a8IOGEeiLE-B2bbL0fg"/>
          <attributes xmi:id="_k72OkIOGEeiLE-B2bbL0fg" name="extension" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <attributes xmi:id="_mjzq4IOGEeiLE-B2bbL0fg" name="photo" dataType="_j-zrcINuEeiLE-B2bbL0fg"/>
          <attributes xmi:id="_oo5IEIOGEeiLE-B2bbL0fg" name="notes" dataType="_tXQUoIOGEeiLE-B2bbL0fg"/>
          <attributes xmi:id="_qg-EAIOGEeiLE-B2bbL0fg" name="photoPath" dataType="_Nppx8IUcEeipmMyz9cMCRA"/>
          <relations xsi:type="data:AssociationEnd" xmi:id="_jOFqoLwNEeiOuYiCo6IbXQ" name="orders" target="_-H4RoINkEeiLE-B2bbL0fg" partner="_gfRT8LwNEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quvedSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
          <relations xsi:type="data:Containment" xmi:id="_WyM8QLwOEeiOuYiCo6IbXQ" name="address" target="_SDnggLv-EeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quvudSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_Z6tlULwOEeiOuYiCo6IbXQ" name="reportsTo" target="_ONN9gINlEeiLE-B2bbL0fg" partner="_cfMUQLwOEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quv-dSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_cfMUQLwOEeiOuYiCo6IbXQ" name="employees" target="_ONN9gINlEeiLE-B2bbL0fg" partner="_Z6tlULwOEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quwOdSEeiJv53TEP0vvQ" upper="-1"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_h-pmkLwOEeiOuYiCo6IbXQ" name="territory" target="_QckxAINlEeiLE-B2bbL0fg" partner="_klno0LwOEeiOuYiCo6IbXQ">
            <cardinality xmi:id="_98quwedSEeiJv53TEP0vvQ"/>
          </relations>
          <relations xsi:type="data:AssociationEnd" xmi:id="_Y1GwwOdTEeiJv53TEP0vvQ" name="category" target="_43ZPcINkEeiLE-B2bbL0fg" partner="_NACAMOdTEeiJv53TEP0vvQ">
            <cardinality xmi:id="_QmhMcOdYEeiJv53TEP0vvQ"/>
          </relations>
        </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute titleOfCourtesy = newAttributeBuilder().build();
    public Attribute birthDate = newAttributeBuilder().build();
    public Attribute hireDate = newAttributeBuilder().build();
    public Attribute homePhone = newAttributeBuilder().build();
    public Attribute extension = newAttributeBuilder().build();
    public Attribute photo = newAttributeBuilder().build();
    public Attribute notes = newAttributeBuilder().build();
    public Attribute photoPath = newAttributeBuilder().build();
    public AssociationEnd orders = newAssociationEndBuilder().build();
    public Containment address = newContainmentBuilder().build();
    public AssociationEnd reportsTo = newAssociationEndBuilder().build();
    public AssociationEnd employees = newAssociationEndBuilder().build();
    public AssociationEnd territory = newAssociationEndBuilder().build();
    public AssociationEnd category = newAssociationEndBuilder().build();


    public void init(Package $package,
                     String $string, Date $date, Phone $phone, Binary $binary, Text $text,
                     Person $person, Order $order, Address $address, Territory $territory, Category $category) {

        useEntityType($).withName("Employee")
                .withSuperEntityTypes($person.$)
                .withAttributes(useAttribute(titleOfCourtesy)
                        .withName("titleOfCourtesy")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(birthDate)
                        .withName("birthDate")
                        .withDataType($date.$)
                )
                .withAttributes(useAttribute(hireDate)
                        .withName("hireDate")
                        .withDataType($date.$)
                )
                .withAttributes(useAttribute(homePhone)
                        .withName("homePhone")
                        .withDataType($phone.$)
                )
                .withAttributes(useAttribute(extension)
                        .withName("extension")
                        .withDataType($string.$)
                )
                .withAttributes(useAttribute(photo)
                        .withName("photo")
                        .withDataType($binary.$)
                )
                .withAttributes(useAttribute(notes)
                        .withName("notes")
                        .withDataType($text.$)
                )
                .withAttributes(useAttribute(photoPath)
                        .withName("photoPath")
                        .withDataType($text.$)
                )
                .withRelations(useAssociationEnd(orders)
                        .withName("orders")
                        .withTarget($order.$)
                        .withPartner($order.employee)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useContainment(address)
                        .withName("address")
                        .withTarget($address.$)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(reportsTo)
                        .withName("reportsTo")
                        .withTarget($)
                        .withPartner(employees)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(employees)
                        .withName("employees")
                        .withTarget($)
                        .withPartner(reportsTo)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(territory)
                        .withName("territory")
                        .withTarget($territory.$)
                        .withPartner($territory.employees)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(category)
                        .withName("category")
                        .withTarget($category.$)
                        .withPartner($category.owner)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
