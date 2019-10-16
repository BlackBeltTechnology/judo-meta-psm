package hu.blackbelt.model.northwind.entities;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAssociationEndBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAssociationEnd;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useAttribute;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.useEntityType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class Product {

    /*
    <elements xsi:type="data:EntityType" xmi:id="_6XH80INkEeiLE-B2bbL0fg" name="Product">
      <attributes xmi:id="_LhnHUINvEeiLE-B2bbL0fg" name="productName" dataType="_Nppx8IUcEeipmMyz9cMCRA" required="true"/>
      <attributes xmi:id="_XoxtcINvEeiLE-B2bbL0fg" name="quantityPerUnit" dataType="_TXtg8IUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_bBDQ0INvEeiLE-B2bbL0fg" name="unitPrice" dataType="_VDVVQIUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_gZEMcINxEeiLE-B2bbL0fg" name="unitsInStock" dataType="_TXtg8IUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_oMaM8INxEeiLE-B2bbL0fg" name="unitsOnOrder" dataType="_TXtg8IUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_qvdYgINxEeiLE-B2bbL0fg" name="reorderLevel" dataType="_TXtg8IUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_tYB9QINxEeiLE-B2bbL0fg" name="discounted" dataType="_Xos1AIUcEeipmMyz9cMCRA"/>
      <attributes xmi:id="_cEwUYB5NEemwg4NgOjaKeA" name="weight" dataType="_h2iYkB1XEemwg4NgOjaKeA"/>
      <relations xsi:type="data:AssociationEnd" xmi:id="_CkXK8LwDEeiOuYiCo6IbXQ" name="category" target="_43ZPcINkEeiLE-B2bbL0fg" partner="_892OYLwCEeiOuYiCo6IbXQ">
        <cardinality xmi:id="_98qusedSEeiJv53TEP0vvQ"/>
      </relations>
      <relations xsi:type="data:AssociationEnd" xmi:id="_vfAfILwMEeiOuYiCo6IbXQ" name="supplier" target="_FWhCkINlEeiLE-B2bbL0fg" partner="_vr4UMOdTEeiJv53TEP0vvQ">
        <cardinality xmi:id="_98qusudSEeiJv53TEP0vvQ"/>
      </relations>
      <relations xsi:type="data:AssociationEnd" xmi:id="_NN_HMOdUEeiJv53TEP0vvQ" name="manufacturers" target="_DJ29wINlEeiLE-B2bbL0fg" partner="_WQzLgOdUEeiJv53TEP0vvQ">
        <cardinality xmi:id="_-3AlIOdUEeiJv53TEP0vvQ" upper="-1"/>
      </relations>
      <relations xsi:type="data:AssociationEnd" xmi:id="_VnJ8IOdVEeiJv53TEP0vvQ" name="store" target="_c7JHIOdVEeiJv53TEP0vvQ" partner="_gqZAEOdVEeiJv53TEP0vvQ">
        <cardinality xmi:id="_IVYuoOdWEeiJv53TEP0vvQ"/>
      </relations>
    </elements>
    */

    public EntityType $ = newEntityTypeBuilder().build();
    public Attribute productName = newAttributeBuilder().build();
    public Attribute quantityPerUnit = newAttributeBuilder().build();
    public Attribute unitPrice = newAttributeBuilder().build();
    public Attribute unitsInStock = newAttributeBuilder().build();
    public Attribute unitsOnOrder = newAttributeBuilder().build();
    public Attribute reorderLevel = newAttributeBuilder().build();
    public Attribute discounted = newAttributeBuilder().build();
    public Attribute weight = newAttributeBuilder().build();
    public AssociationEnd category = newAssociationEndBuilder().build();
    public AssociationEnd supplier = newAssociationEndBuilder().build();
    public AssociationEnd manufacturers = newAssociationEndBuilder().build();
    public AssociationEnd store = newAssociationEndBuilder().build();

    public void init(Package $package, String $string, Integer $integer, Double $double, Boolean $boolean,
                     MassStoredInKilograms $massStoredInKilograms, Category $category, Supplier $supplier,
                     Company $company, Store $store) {
        useEntityType($)
                .withName("Product")
                .withAttributes(useAttribute(productName)
                        .withName("productName")
                        .withDataType($string.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(quantityPerUnit)
                        .withName("quantityPerUnit")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(unitPrice)
                        .withName("unitPrice")
                        .withDataType($double.$)
                        .withRequired(true)
                )
                .withAttributes(useAttribute(unitsInStock)
                        .withName("unitsInStock")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(unitsOnOrder)
                        .withName("unitsOnOrder")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(reorderLevel)
                        .withName("reorderLevel")
                        .withDataType($integer.$)
                )
                .withAttributes(useAttribute(discounted)
                        .withName("discounted")
                        .withDataType($boolean.$)
                )
                .withAttributes(useAttribute(weight)
                        .withName("weight")
                        .withDataType($massStoredInKilograms.$)
                )
                .withRelations(useAssociationEnd(category)
                        .withName("category")
                        .withTarget($category.$)
                        .withPartner($category.products)
                        .withCardinality(newCardinalityBuilder()
                            .withLower(1)
                        )
                        .build()
                )
                .withRelations(useAssociationEnd(supplier)
                        .withName("supplier")
                        .withTarget($supplier.$)
                        .withPartner($supplier.suppliedProduct)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .withRelations(useAssociationEnd(manufacturers)
                        .withName("manufacturers")
                        .withTarget($company.$)
                        .withPartner($company.manufacturedProducts)
                        .withCardinality(newCardinalityBuilder().withUpper(-1))
                        .build()
                )
                .withRelations(useAssociationEnd(store)
                        .withName("store")
                        .withTarget($store.$)
                        .withPartner($store.products)
                        .withCardinality(newCardinalityBuilder())
                        .build()
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
