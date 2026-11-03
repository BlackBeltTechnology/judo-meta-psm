# AGENTS.md — `northwind-model/src/main/java/hu/blackbelt/model/northwind/services`

Transfer object types, static navigations, and DTO definitions for Northwind service interfaces.

| File | Purpose |
| --- | --- |
| `AllCategories.java` | Defines `StaticNavigation` entry `allCategories`. Exports `init(Package, Category)`. Returns collection of all `Category` entity instances via reference expression. |
| `AllInternationalOrders.java` | Defines `StaticNavigation` entry `allInternationalOrders`. Exports `init(Package, InternationalOrder)`. Queries all `InternationalOrder` entities via reference expression. |
| `AllProducts.java` | Defines `StaticNavigation` entry `allProducts`. Exports `init(Package, Product)`. Queries all `Product` entities via reference expression. |
| `AllShippers.java` | Defines `StaticNavigation` entry `allShippers`. Exports `init(Package, Shipper)`. Queries all `Shipper` entities via reference expression. |
| `Category.java` | Defines mapped transfer object type `Category`. Exports `init(Package, String, Category, Product)`. Binds `categoryName` attribute and `products` relation targeting `Product`. |
| `CategoryInfo.java` | Defines mapped transfer object type `CategoryInfo`. Exports `init(Package, String, Category, ProductInfo, AllProducts)`. Exposes category details, `listProducts`, and `moveProductsToCategory` bound operations. |
| `Comment.java` | Defines unmapped transfer object type `Comment`. Exports `init(Package, String, Text, TimeStamp)`. Holds `note`, `author`, and `timestamp` fields. |
| `InternationalOrderInfo.java` | Defines mapped transfer object type `InternationalOrderInfo`. Exports `init(...)`. Exposes customs information, excise tax, order items, and bound operations for international shipments. |
| `OrderAssignedToEmployee.java` | Defines `StaticNavigation` entry `ordersAssignedToEmployee`. Exports `init(Package, Order)`. Resolves orders assigned to employee via reference expression. |
| `OrderInfo.java` | Defines mapped transfer object type `OrderInfo`. Exports `init(...)`. Aggregates order metadata, item collection, shipper details, total calculations, and life-cycle operations. |
| `OrderItem.java` | Defines mapped transfer object type `OrderItem`. Exports `init(...)`. Binds `OrderDetail` entity fields including unit price, quantity, discount, product relation, and weight. |
| `OrdersOfLastTwoWeeks.java` | Defines `StaticNavigation` entry `ordersOfLastTwoWeeks`. Exports `init(Package, Order)`. Filters orders by date criteria via OCL/JQL expression. |
| `Product.java` | Defines mapped transfer object type `Product`. Exports `init(...)`. Binds product attributes and category reference. |
| `ProductInfo.java` | Defines mapped transfer object type `ProductInfo`. Exports `init(...)`. Exposes product pricing, inventory counts, category relations, and range lookup operations. |
| `ShipmentChange.java` | Defines unmapped transfer object type `ShipmentChange`. Exports `init(Package, String, TimeStamp)`. Transports updated shipment date and carrier name. |
| `ShipperInfo.java` | Defines mapped transfer object type `ShipperInfo`. Exports `init(...)`. Binds company name and GPS coordinates for carrier logistics. |
| `TerritoryInfo.java` | Defines mapped transfer object type `TerritoryInfo`. Exports `init(Package, String, Territory)`. Maps territory description from entity. |
| `TotalNumberOfOrders.java` | Defines `StaticData` entry `totalNumberOfOrders`. Exports `init(Package, Integer)`. Evaluates total count of orders via aggregate expression. |
