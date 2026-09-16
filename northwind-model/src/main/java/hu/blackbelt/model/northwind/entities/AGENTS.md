# AGENTS.md — `northwind-model/src/main/java/hu/blackbelt/model/northwind/entities`

Entity type definitions and domain relationships for the Northwind PSM model.

| File | Purpose |
| --- | --- |
| `Address.java` | Defines entity type `Address`. Exports `init(...)`. Configures attributes (street, postal code) and associations to `City`. |
| `Category.java` | Defines entity type `Category`. Exports `init(...)`. Configures category attributes, bound operations (`createCategory`), and bidirectional association to `Product`. |
| `City.java` | Defines entity type `City`. Exports `init(...)`. Configures city name attribute and registers entity in target package. |
| `Company.java` | Defines entity type `Company`. Exports `init(...)`. Configures name, phone, GPS coordinates, and super-type inheritance for customer/supplier. |
| `Customer.java` | Defines entity type `Customer`. Exports `init(...)`. Inherits from `Company`, linking address containment and 1..* order associations. |
| `Employee.java` | Defines entity type `Employee`. Exports `init(...)`. Inherits from `Person`, binding address containment, territory associations, and orders managed. |
| `Induvidual.java` | Defines entity type `Induvidual`. Exports `init(...)`. Represents individual customers inheriting from `Customer` and `Person`. |
| `InternationalAddress.java` | Defines entity type `InternationalAddress`. Exports `init(...)`. Specializes `Address` by adding `Countries` enum attribute. |
| `InternationalOrder.java` | Defines entity type `InternationalOrder`. Exports `init(...)`. Specializes `Order` with customs duty attributes and calculation operations. |
| `MailingList.java` | Defines entity type `MailingList`. Exports `init(...)`. Establishes many-to-many subscription associations between mailing lists and `Person`. |
| `OnlineInternationalOrder.java` | Defines entity type `OnlineInternationalOrder`. Exports `init(...)`. Combines features of `OnlineOrder` and `InternationalOrder`. |
| `OnlineOrder.java` | Defines entity type `OnlineOrder`. Exports `init(...)`. Specializes `Order` with web-specific order tracking URL attributes. |
| `Order.java` | Defines core entity type `Order`. Exports `init(...)`. Sets up order status, line item containment (`OrderDetail`), customer/employee associations, and total calculations. |
| `OrderDetail.java` | Defines entity type `OrderDetail`. Exports `init(...)`. Represents line items connecting `Order` to `Product` with quantity, unit price, and discount. |
| `PaymentList.java` | Defines entity type `PaymentList`. Exports `init(...)`. Represents payroll records associated with `Employee`. |
| `Person.java` | Defines entity type `Person`. Exports `init(...)`. Configures personal identity attributes including first/last name, birthdate, and honorific title. |
| `Product.java` | Defines entity type `Product`. Exports `init(...)`. Configures product attributes, stock levels, supplier relation, and category classification. |
| `Region.java` | Defines entity type `Region`. Exports `init(...)`. Represents geographical sales regions holding 1..* `Territory` associations. |
| `Shipper.java` | Defines entity type `Shipper`. Exports `init(...)`. Specializes `Company` for logistics, linking serviced territories and fulfilled orders. |
| `Store.java` | Defines entity type `Store`. Exports `init(...)`. Represents physical store locations stocking multiple `Product` instances. |
| `Supplier.java` | Defines entity type `Supplier`. Exports `init(...)`. Specializes `Company` for vendor management, linking supplied `Product` items and home page URL. |
| `Territory.java` | Defines entity type `Territory`. Exports `init(...)`. Represents sales territory units assigned to `Region`, `Employee`, and `Shipper`. |
