---
name: Extract Services Methods
description: Extract Java service methods from Services.java and map them to AQL usage in odesign files
---

# Extract Services Methods

This skill extracts Java service methods that are callable from AQL expressions in Sirius odesign files.

## Target File

The Services class in this project is:
- `designer/src/main/java/hu/blackbelt/judo/meta/esm/designer/Services.java`

## AQL-to-Java Mapping Convention

Sirius allows AQL expressions to call Java service methods. The mapping works as follows:

### Calling Convention

| AQL Expression | Java Method |
|----------------|-------------|
| `aql:self.methodName()` | `Services.methodName(self)` |
| `aql:self.methodName(arg)` | `Services.methodName(self, arg)` |
| `aql:source.methodName(target)` | `Services.methodName(source, target)` |

**Key Rule**: The `self` (or first object) in AQL becomes the first parameter in Java.

### Examples from This Project

| AQL in odesign | Java Method |
|----------------|-------------|
| `aql:container.createAttribute()` | `createAttribute(TransferObjectType self)` |
| `aql:source.createOneWayRelation(target)` | `createOneWayRelation(TransferObjectType self, Class target)` |
| `aql:self.showMessageDialog('msg')` | `showMessageDialog(EObject self, String msg)` |
| `aql:self.getModel()` | `getModel(EObject self)` |
| `aql:self.getUniqueName()` | `getUniqueName(NamedElement self)` |
| `aql:self.deleteClass()` | `deleteClass(Class self)` |
| `aql:self.navigateToClassTree()` | `navigateToClassTree(EObject self)` |

## Method Categories

### Create Methods
Methods that create new model elements:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `createActor` | Namespace | ActorType | Create new actor |
| `createEntity` | Namespace | EntityType | Create new entity |
| `createTransferObject` | Namespace | TransferObjectType | Create new transfer object |
| `createAttribute` | TransferObjectType | DataMember | Create new attribute |
| `createOneWayRelation` | TransferObjectType, Class | OneWayRelationMember | Create unidirectional relation |
| `createTwoWayRelation` | TransferObjectType, Class | TwoWayRelationMember | Create bidirectional relation |
| `createOperation` | TransferObjectType, Class | Operation | Create operation |
| `createAccess` | ActorType, TransferObjectType | Access | Create access point |
| `createAttributeBinding` | TransferObjectType, DataFeature | DataMember | Create mapped attribute |
| `createRelationBinding` | TransferObjectType, RelationFeature | OneWayRelationMember | Create mapped relation |
| `createOperationBinding` | TransferObjectType, Operation | Operation | Create mapped operation |
| `createQuery` | TransferObjectType | DataMember | Create query attribute |
| `createComplexQuery` | TransferObjectType | OneWayRelationMember | Create query relation |

### Delete Methods
Methods that remove model elements:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `deleteClass` | Class | Boolean | Delete class and references |
| `deletePackage` | Package | Boolean | Delete package recursively |
| `deleteAccess` | Access | boolean | Delete access point |
| `deleteAttribute` | DataFeature | Boolean | Delete attribute |
| `deleteRelation` | RelationFeature | Boolean | Delete relation |
| `deleteReference` | ClassReference | Boolean | Delete reference |
| `deleteDiagram` | DSemanticDiagram | boolean | Delete diagram |

### Navigation Methods
Methods that open editors/views:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `navigateToActorMenu` | ActorType | boolean | Open actor menu editor |
| `navigateToClassTree` | EObject | boolean | Open class tree view |
| `navigateToViewTree` | EObject | boolean | Open view/edit page tree |
| `navigateToFormTree` | EObject | boolean | Open form page tree |
| `navigateToTableTree` | EObject | boolean | Open table page tree |

### Query/Get Methods
Methods that retrieve information:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `getModel` | EObject | Model | Get root model |
| `getAllInstancesOf` | EObject, EClassifier | UniqueEList<EObject> | Get all instances of type |
| `getUniqueName` | NamedElement | String | Generate unique name |
| `getApplicableAnnotations` | EObject | EList<Annotation> | Get applicable annotations |
| `getNamedMetaClasses` | EObject | EList<EClass> | Get named metaclasses |
| `getMissingElementsFromView` | TransferObjectType | List<NamedElement> | Elements not in view |
| `getMissingElementsFromForm` | TransferObjectType | List<NamedElement> | Elements not in form |

### Update Methods
Methods that modify elements:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `updateRepresentations` | TransferObjectType | TransferObjectType | Update UI representations |
| `updateRepresentation` | EObject, String, String | DRepresentation | Update specific representation |
| `updatePrimaryColor` | ActorType, String | void | Set primary color |
| `updateSecondaryColor` | ActorType, String | void | Set secondary color |
| `setEntityAbstract` | EntityType, Boolean | Boolean | Set abstract flag |
| `setNamespace` | NamespaceElement, Namespace | boolean | Move element to namespace |

### UI Helper Methods
Methods for UI interactions:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `showMessageDialog` | EObject, String | boolean | Show info dialog |
| `showConfirmDialog` | EObject, String | boolean | Show confirm dialog |
| `activateAllFilters` | EObject | boolean | Activate diagram filters |
| `setDefaultIcon` | DataField/DataColumn/DataFilter | same | Set default icon |
| `addFeaturesToRepresentations` | TransferObjectType | boolean | Add missing features to UI |

### Check/Validation Methods
Methods that check conditions:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `isUniqueName` | NamedElement | boolean | Check name uniqueness |
| `isUniqueNameInClass` | NamedElement, Class | boolean | Check uniqueness in class |
| `hasAttributeBinding` | TransferObjectType, DataFeature | boolean | Check if binding exists |
| `hasRelationBinding` | TransferObjectType, RelationFeature | boolean | Check if binding exists |
| `hasOperationBinding` | TransferObjectType, Operation | boolean | Check if binding exists |

### Add Methods
Methods that add UI elements:

| Method | First Param Type | Returns | Purpose |
|--------|------------------|---------|---------|
| `addDataField` | Container, DataFeatureReference | DataField | Add data field to form |
| `addDataColumn` | Tabular, DataFeatureReference | DataColumn | Add column to table |
| `addDataFilter` | Tabular, DataFeatureReference | DataFilter | Add filter to table |
| `addTabularReferenceField` | Container, RelationFeatureReference | TabularReferenceField | Add relation field |
| `addOperationForm` | Container, OperationReference | OperationForm | Add operation button |
| `addTransferObjectType` | EntityType, Namespace | TransferObjectType | Add transfer object for entity |

### AQL Migration Helper Methods
Methods added to simplify complex AQL expressions (Phase 2 migration):

| Method | First Param Type | Returns | Purpose | Replaces AQL |
|--------|------------------|---------|---------|--------------|
| `toBooleanLabel` | Boolean | String | Convert boolean to Yes/No | `if candidate then 'Yes' else 'No' endif` |
| `toOptionalName` | Object | String | Get name or empty string | `if candidate <> null then candidate.name else '' endif` |
| `toDisplayCase` | Object | String | Convert to display case | `candidate.toString().toLower().toUpperFirst()` |
| `isNameEmpty` | NamedElement | boolean | Check if name is empty | `self.name.trim().size() == 0` |
| `getVisualElementDisplayLabel` | EObject | String | Get VisualElement label | `self.oclAsType(ui::VisualElement).getDisplayLabel()` |
| `getDataFeatureMember` | EObject | DataMember | Get DataFeatureReference member | `self.oclAsType(structure::DataFeatureReference).getMember()` |
| `getRelationFeatureMember` | EObject | RelationFeature | Get RelationFeatureReference member | `self.oclAsType(structure::RelationFeatureReference).getMember()` |
| `isContainer` | EObject | boolean | Check if is Container | `self.oclIsKindOf(ui::Container)` |
| `isTabular` | EObject | boolean | Check if is Tabular | `self.oclIsKindOf(ui::Tabular)` |
| `isHumanActor` | ActorType | boolean | Check if HUMAN kind | `self.kind == accesspoint::ActorKind::HUMAN` |
| `isInTransferObjectType` | EObject | boolean | Check if in TransferObjectType | `self.eContainer().oclIsTypeOf(structure::TransferObjectType)` |
| `isAdvancedMode` | EObject | boolean | Check if model is advanced | `self.getModel().advanced` |
| `isWidgetNotInTableOperation` | EObject | boolean | Widget not in TableOperation | `self.oclIsKindOf(ui::Widget) and not self.eContainer().oclIsTypeOf(ui::TableOperation)` |
| `isMappedAndReadOnly` | DataFeatureReference | boolean | Check mapped and read-only | `self.getMember().memberType == structure::MemberType::MAPPED and self.getMember().isReadOnly()` |
| `getDataMemberDisplayLabel` | Object | String | Get DataMember label | `if candidate.oclIsKindOf(structure::DataMember) then candidate.getDisplayLabel() else '' endif` |
| `getRelationFeatureSimpleDisplayLabel` | Object | String | Get RelationFeature label | `if candidate.oclIsKindOf(structure::RelationFeature) then candidate.oclAsType(structure::RelationFeature).getSimpleDisplayLabel() else '' endif` |

## Extraction Instructions

1. **Read Services.java**: Parse the Java file to extract public static methods

2. **For Each Method Extract**:
   - Method name
   - First parameter type (determines which AQL objects can call it)
   - Additional parameters
   - Return type
   - JavaDoc description if available

3. **Output Format**:
   ```
   ### Method: createEntity
   - **AQL Call**: `aql:namespace.createEntity()`
   - **Signature**: `EntityType createEntity(Namespace self)`
   - **Purpose**: Create new entity type in namespace
   - **Returns**: The created EntityType
   ```

4. **Group by Category**: Organize methods by their prefix (create*, delete*, get*, etc.)

## Usage

To use this skill, read Services.java and extract method signatures. Map them to their AQL usage patterns and group by functionality for easy reference.
