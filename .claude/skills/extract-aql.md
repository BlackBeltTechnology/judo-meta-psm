---
name: Extract AQL Expressions
description: Extract AQL (Acceleo Query Language) expressions from Sirius odesign files
---

# Extract AQL Expressions from Odesign Files

This skill extracts AQL expressions from Sirius odesign XML files for analysis.

## Prerequisites

**Always read `docs/aql.md` first** - it contains comprehensive AQL language reference including:
- Syntax fundamentals and operators
- All available services (String, Collection, EObject, Boolean, Numeric)
- Common patterns and examples
- Migration notes from MTL/Acceleo 3

## Target File

The primary odesign file in this project is:
- `designer/description/esm.odesign`

## Extraction Instructions

When extracting AQL expressions from an odesign file:

1. **Locate AQL Expressions**: Search for XML attributes containing values that start with `aql:`
   - Common attribute patterns: `*Expression="aql:..."`, `*expression="aql:..."`

2. **Common Expression Attributes**:
   - `labelExpression` - Display labels for diagram elements
   - `preconditionExpression` - Conditions for enabling/showing elements
   - `predicateExpression` - Boolean conditions for filtering
   - `valueExpression` - Values for properties/settings
   - `candidatesExpression` - Selection candidates for dropdowns
   - `semanticCandidatesExpression` - Semantic element candidates
   - `browseExpression` - Navigation expressions
   - `conditionExpression` - Conditional logic
   - `viewConditionExpression` - View filtering conditions
   - `targetFinderExpression` - Target element finders
   - `sourceFinderExpression` - Source element finders
   - `inputLabelExpression` - Input field labels
   - `isEnabledExpression` - Enable/disable conditions
   - `rootExpression` - Tree root expressions
   - `childrenExpression` - Tree children expressions

3. **Extract Context Information**:
   - Parent element tag name (e.g., `containerMappings`, `ownedTools`, `filters`)
   - Element `name` attribute if present
   - Element `xsi:type` if present
   - Line number for reference

4. **Output Format**:
   Present results as a markdown table:
   ```
   | Line | Element | Name | Attribute | Expression |
   |------|---------|------|-----------|------------|
   | 87   | style   | -    | labelExpression | aql:self.getFQName() |
   ```

## Example Extractions

### Label Expressions
```xml
<style labelExpression="aql:self.getFQName()"/>
<endLabelStyleDescription labelExpression="aql:self.getMember().getLineDisplayLabel()"/>
```

### Precondition Expressions
```xml
<ownedTools precondition="aql:self.oclIsKindOf(namespace::NamespaceElement)"/>
<ownedTools preconditionExpression="aql:false"/>
```

### Value Expressions
```xml
<subModelOperations valueExpression="aql:container.createAttribute()"/>
<subModelOperations valueExpression="aql:self.getUniqueName('attribute')"/>
```

### Candidate Expressions
```xml
<subVariables candidatesExpression="aql:views->first().target.getAllInstancesOf(namespace::Namespace)"/>
```

## AQL Expression Patterns

Common AQL patterns found in this project:

1. **Model Navigation**:
   - `self.eContainer()` - Parent element
   - `self.eContents()` - Child elements
   - `self.getModel()` - Root model element
   - `self.getAllInstancesOf(Type)` - All instances of type

2. **Type Checking**:
   - `self.oclIsTypeOf(Type)` - Exact type check
   - `self.oclIsKindOf(Type)` - Type or subtype check
   - `self.oclAsType(Type)` - Type cast

3. **Service Method Calls** (from Services.java):
   - `self.createAttribute()` - Create new attribute
   - `self.createOneWayRelation(target)` - Create relation
   - `self.showMessageDialog('message')` - Show dialog
   - `self.getUniqueName('prefix')` - Generate unique name

4. **Collection Operations**:
   - `collection->select(condition)` - Filter
   - `collection->reject(condition)` - Exclude
   - `collection->collect(expr)` - Map
   - `collection->first()` - First element
   - `collection->sortedBy(expr)` - Sort

## Usage

To use this skill, read the odesign file and extract expressions matching the patterns above. Group by expression type or element context as needed for analysis.
