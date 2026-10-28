package hu.blackbelt.judo.meta.psm.validation.rules.data;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2024 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.zeta.annotation.Constraint;
import hu.blackbelt.judo.zeta.annotation.Critique;
import hu.blackbelt.judo.zeta.annotation.Satisfies;
import hu.blackbelt.judo.zeta.annotation.ValidationContext;
import hu.blackbelt.judo.zeta.validation.core.ValidationResult;
import hu.blackbelt.judo.zeta.validation.core.ValidationRule;
import hu.blackbelt.judo.zeta.validation.core.Severity;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Validation rules for EntityType.
 * Corresponds to validations/data/entityType.evl
 */
@ValidationContext(EntityType.class)
public class EntityTypeValidations {

    // Constraint/Critique name constants
    private static final String ENTITY_TYPE_NAMES_ARE_UNIQUE = "EntityTypeNamesAreUnique";
    private static final String INHERITANCE_IS_NOT_RECURSIVE = "InheritanceIsNotRecursive";
    private static final String ABSTRACT_ENTITY_TYPE_SUPER_ENTITY_TYPES_ARE_ABSTRACT = "AbstractEntityTypeSuperEntityTypesAreAbstract";
    private static final String INHERITING_UNIQUE_ATTRIBUTE_NAMES = "InheritingUniqueAttributeNames";
    private static final String INHERITING_UNIQUE_RELATION_NAMES = "InheritingUniqueRelationNames";
    private static final String INHERITING_UNIQUE_SEQUENCE_NAMES = "InheritingUniqueSequenceNames";
    private static final String INHERITING_UNIQUE_DATA_PROPERTY_NAMES = "InheritingUniqueDataPropertyNames";
    private static final String INHERITING_UNIQUE_NAVIGATION_PROPERTY_NAMES = "InheritingUniqueNavigationPropertyNames";
    private static final String INHERITED_OPERATION_AND_ATTRIBUTE_NAMES_ARE_UNIQUE = "InheritedOperationAndAttributeNamesAreUnique";
    private static final String INHERITED_OPERATION_AND_RELATION_NAMES_ARE_UNIQUE = "InheritedOperationAndRelationNamesAreUnique";
    private static final String INHERITED_OPERATION_AND_SEQUENCE_NAMES_ARE_UNIQUE = "InheritedOperationAndSequenceNamesAreUnique";
    private static final String INHERITED_OPERATION_AND_NAVIGATION_PROPERTY_NAMES_ARE_UNIQUE = "InheritedOperationAndNavigationPropertyNamesAreUnique";
    private static final String INHERITED_OPERATION_AND_DATA_PROPERTY_NAMES_ARE_UNIQUE = "InheritedOperationAndDataPropertyNamesAreUnique";
    private static final String INHERITING_ATTRIBUTES_AND_RELATIONS_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingAttributesAndRelationsOfTheSameNameIsNotAllowed";
    private static final String INHERITING_ATTRIBUTES_AND_SEQUENCES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingAttributesAndSequencesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_ATTRIBUTES_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingAttributesAndDataPropertiesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_ATTRIBUTES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingAttributesAndNavigationPropertiesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_RELATIONS_AND_SEQUENCES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingRelationsAndSequencesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_RELATIONS_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingRelationsAndDataPropertiesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_RELATIONS_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingRelationsAndNavigationPropertiesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_SEQUENCES_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingSequencesAndDataPropertiesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_SEQUENCES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingSequencesAndNavigationPropertiesOfTheSameNameIsNotAllowed";
    private static final String INHERITING_DATA_PROPERTIES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED = "InheritingDataPropertiesAndNavigationPropertiesOfTheSameNameIsNotAllowed";
    // External constraint references
    private static final String NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER = "namedElementIsUniqueInItsContainer";

    // Helper methods for getting inherited names
    private Set<String> getInheritedAttributeNames(EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(s -> s.getAttributes().stream())
                .map(a -> a.getName().toLowerCase())
                .collect(Collectors.toSet());
    }

    private Set<String> getInheritedRelationNames(EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(s -> s.getRelations().stream())
                .map(r -> r.getName().toLowerCase())
                .collect(Collectors.toSet());
    }

    private Set<String> getInheritedSequenceNames(EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(s -> s.getSequences().stream())
                .map(s -> s.getName().toLowerCase())
                .collect(Collectors.toSet());
    }

    private Set<String> getInheritedDataPropertyNames(EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(s -> s.getDataProperties().stream())
                .map(d -> d.getName().toLowerCase())
                .collect(Collectors.toSet());
    }

    private Set<String> getInheritedNavigationPropertyNames(EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(s -> s.getNavigationProperties().stream())
                .map(n -> n.getName().toLowerCase())
                .collect(Collectors.toSet());
    }

    private Set<String> getInheritedOperationNames(EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(s -> s.getOperations().stream())
                .map(o -> o.getName().toLowerCase())
                .collect(Collectors.toSet());
    }

    @Critique(name = ENTITY_TYPE_NAMES_ARE_UNIQUE, message = "Entity type name is not unique")
    @Satisfies(NAMED_ELEMENT_IS_UNIQUE_IN_ITS_CONTAINER)
    public ValidationRule entityTypeNamesAreUnique() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        boolean hasDuplicate = context.getAllInstances(EntityType.class).stream()
                .filter(e -> e != self)
                .anyMatch(e -> e.getName() != null && self.getName() != null
                        && e.getName().equalsIgnoreCase(self.getName()));

        if (hasDuplicate) {
            return ValidationResult.fail(
                    ENTITY_TYPE_NAMES_ARE_UNIQUE,
                    "There are two or more entity types of the same name: " + self.getName(),
                    Severity.WARNING,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITANCE_IS_NOT_RECURSIVE, message = "Entity type inheritance is recursive")
    public ValidationRule inheritanceIsNotRecursive() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        if (self.getAllSuperEntityTypes().contains(self)) {
            return ValidationResult.fail(
                    INHERITANCE_IS_NOT_RECURSIVE,
                    "Entity type " + self.getName() + " is recursive",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = ABSTRACT_ENTITY_TYPE_SUPER_ENTITY_TYPES_ARE_ABSTRACT, message = "Abstract entity type cannot have non-abstract super entity types")
    @Satisfies(INHERITANCE_IS_NOT_RECURSIVE)
    public ValidationRule abstractEntityTypeSuperEntityTypesAreAbstract() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        if (!self.isAbstract()) {
            return ValidationResult.pass();
        }

        boolean hasNonAbstractSuper = self.getSuperEntityTypes().stream()
                .anyMatch(s -> !s.isAbstract());

        if (hasNonAbstractSuper) {
            return ValidationResult.fail(
                    ABSTRACT_ENTITY_TYPE_SUPER_ENTITY_TYPES_ARE_ABSTRACT,
                    "Abstract entity type: " + self.getName() + " cannot have non abstract super entity type(s).",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_UNIQUE_ATTRIBUTE_NAMES, message = "Inherited attributes have same name")
    public ValidationRule inheritingUniqueAttributeNames() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> inheritedNames = getInheritedAttributeNames(self);
        
        for (String name : inheritedNames) {
            long count = self.getAllSuperEntityTypes().stream()
                    .flatMap(s -> s.getAttributes().stream())
                    .filter(a -> a.getName() != null && a.getName().equalsIgnoreCase(name))
                    .count();
            
            if (count > 1) {
                return ValidationResult.fail(
                        INHERITING_UNIQUE_ATTRIBUTE_NAMES,
                        "Entity type: " + self.getName() + " has inherited attributes of the same name.",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_UNIQUE_RELATION_NAMES, message = "Inherited relations have same name")
    public ValidationRule inheritingUniqueRelationNames() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> inheritedNames = getInheritedRelationNames(self);
        
        for (String name : inheritedNames) {
            long count = self.getAllSuperEntityTypes().stream()
                    .flatMap(s -> s.getRelations().stream())
                    .filter(r -> r.getName() != null && r.getName().equalsIgnoreCase(name))
                    .count();
            
            if (count > 1) {
                return ValidationResult.fail(
                        INHERITING_UNIQUE_RELATION_NAMES,
                        "Entity type: " + self.getName() + " has inherited relations of the same name.",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_UNIQUE_SEQUENCE_NAMES, message = "Inherited sequences have same name")
    public ValidationRule inheritingUniqueSequenceNames() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> inheritedNames = getInheritedSequenceNames(self);
        
        for (String name : inheritedNames) {
            long count = self.getAllSuperEntityTypes().stream()
                    .flatMap(s -> s.getSequences().stream())
                    .filter(seq -> seq.getName() != null && seq.getName().equalsIgnoreCase(name))
                    .count();
            
            if (count > 1) {
                return ValidationResult.fail(
                        INHERITING_UNIQUE_SEQUENCE_NAMES,
                        "Entity type: " + self.getName() + " has inherited sequences of the same name.",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_UNIQUE_DATA_PROPERTY_NAMES, message = "Inherited data properties have same name")
    public ValidationRule inheritingUniqueDataPropertyNames() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> inheritedNames = getInheritedDataPropertyNames(self);
        
        for (String name : inheritedNames) {
            long count = self.getAllSuperEntityTypes().stream()
                    .flatMap(s -> s.getDataProperties().stream())
                    .filter(dp -> dp.getName() != null && dp.getName().equalsIgnoreCase(name))
                    .count();
            
            if (count > 1) {
                return ValidationResult.fail(
                        INHERITING_UNIQUE_DATA_PROPERTY_NAMES,
                        "Entity type: " + self.getName() + " has inherited data properties of the same name.",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_UNIQUE_NAVIGATION_PROPERTY_NAMES, message = "Inherited navigation properties have same name")
    public ValidationRule inheritingUniqueNavigationPropertyNames() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> inheritedNames = getInheritedNavigationPropertyNames(self);
        
        for (String name : inheritedNames) {
            long count = self.getAllSuperEntityTypes().stream()
                    .flatMap(s -> s.getNavigationProperties().stream())
                    .filter(np -> np.getName() != null && np.getName().equalsIgnoreCase(name))
                    .count();
            
            if (count > 1) {
                return ValidationResult.fail(
                        INHERITING_UNIQUE_NAVIGATION_PROPERTY_NAMES,
                        "Entity type: " + self.getName() + " has inherited navigation properties of the same name.",
                        Severity.ERROR,
                        self
                );
            }
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITED_OPERATION_AND_ATTRIBUTE_NAMES_ARE_UNIQUE, message = "Inherited operations and attributes have same name")
    public ValidationRule inheritedOperationAndAttributeNamesAreUnique() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> attrNames = getInheritedAttributeNames(self);
        Set<String> opNames = getInheritedOperationNames(self);

        boolean hasConflict = attrNames.stream().anyMatch(opNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITED_OPERATION_AND_ATTRIBUTE_NAMES_ARE_UNIQUE,
                    "Entity type: " + self.getName() + " has inherited operation(s) and inherited attribute(s) of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITED_OPERATION_AND_RELATION_NAMES_ARE_UNIQUE, message = "Inherited operations and relations have same name")
    public ValidationRule inheritedOperationAndRelationNamesAreUnique() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> relNames = getInheritedRelationNames(self);
        Set<String> opNames = getInheritedOperationNames(self);

        boolean hasConflict = relNames.stream().anyMatch(opNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITED_OPERATION_AND_RELATION_NAMES_ARE_UNIQUE,
                    "Entity type: " + self.getName() + " has inherited operation(s) and inherited relation(s) of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITED_OPERATION_AND_SEQUENCE_NAMES_ARE_UNIQUE, message = "Inherited operations and sequences have same name")
    public ValidationRule inheritedOperationAndSequenceNamesAreUnique() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> seqNames = getInheritedSequenceNames(self);
        Set<String> opNames = getInheritedOperationNames(self);

        boolean hasConflict = seqNames.stream().anyMatch(opNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITED_OPERATION_AND_SEQUENCE_NAMES_ARE_UNIQUE,
                    "Entity type: " + self.getName() + " has inherited operation(s) and inherited sequence(s) of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITED_OPERATION_AND_NAVIGATION_PROPERTY_NAMES_ARE_UNIQUE, message = "Inherited operations and navigation properties have same name")
    public ValidationRule inheritedOperationAndNavigationPropertyNamesAreUnique() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> navNames = getInheritedNavigationPropertyNames(self);
        Set<String> opNames = getInheritedOperationNames(self);

        boolean hasConflict = navNames.stream().anyMatch(opNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITED_OPERATION_AND_NAVIGATION_PROPERTY_NAMES_ARE_UNIQUE,
                    "Entity type: " + self.getName() + " has inherited operation(s) and inherited navigation properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITED_OPERATION_AND_DATA_PROPERTY_NAMES_ARE_UNIQUE, message = "Inherited operations and data properties have same name")
    public ValidationRule inheritedOperationAndDataPropertyNamesAreUnique() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> dpNames = getInheritedDataPropertyNames(self);
        Set<String> opNames = getInheritedOperationNames(self);

        boolean hasConflict = dpNames.stream().anyMatch(opNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITED_OPERATION_AND_DATA_PROPERTY_NAMES_ARE_UNIQUE,
                    "Entity type: " + self.getName() + " has inherited operation(s) and inherited data properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_ATTRIBUTES_AND_RELATIONS_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited attributes and relations have same name")
    public ValidationRule inheritingAttributesAndRelationsOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> attrNames = getInheritedAttributeNames(self);
        Set<String> relNames = getInheritedRelationNames(self);

        boolean hasConflict = attrNames.stream().anyMatch(relNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_ATTRIBUTES_AND_RELATIONS_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited relation(s) and inherited attribute(s) of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_ATTRIBUTES_AND_SEQUENCES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited attributes and sequences have same name")
    public ValidationRule inheritingAttributesAndSequencesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> attrNames = getInheritedAttributeNames(self);
        Set<String> seqNames = getInheritedSequenceNames(self);

        boolean hasConflict = attrNames.stream().anyMatch(seqNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_ATTRIBUTES_AND_SEQUENCES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited sequence(s) and inherited transfer attribute(s) of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_ATTRIBUTES_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited attributes and data properties have same name")
    public ValidationRule inheritingAttributesAndDataPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> attrNames = getInheritedAttributeNames(self);
        Set<String> dpNames = getInheritedDataPropertyNames(self);

        boolean hasConflict = attrNames.stream().anyMatch(dpNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_ATTRIBUTES_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited attribute(s) and inherited data properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_ATTRIBUTES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited attributes and navigation properties have same name")
    public ValidationRule inheritingAttributesAndNavigationPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> attrNames = getInheritedAttributeNames(self);
        Set<String> navNames = getInheritedNavigationPropertyNames(self);

        boolean hasConflict = attrNames.stream().anyMatch(navNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_ATTRIBUTES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited attribute(s) and inherited navigation properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_RELATIONS_AND_SEQUENCES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited relations and sequences have same name")
    public ValidationRule inheritingRelationsAndSequencesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> relNames = getInheritedRelationNames(self);
        Set<String> seqNames = getInheritedSequenceNames(self);

        boolean hasConflict = relNames.stream().anyMatch(seqNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_RELATIONS_AND_SEQUENCES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited sequence(s) and inherited relation(s) of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_RELATIONS_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited relations and data properties have same name")
    public ValidationRule inheritingRelationsAndDataPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> relNames = getInheritedRelationNames(self);
        Set<String> dpNames = getInheritedDataPropertyNames(self);

        boolean hasConflict = relNames.stream().anyMatch(dpNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_RELATIONS_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited relation(s) and inherited data properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_RELATIONS_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited relations and navigation properties have same name")
    public ValidationRule inheritingRelationsAndNavigationPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> relNames = getInheritedRelationNames(self);
        Set<String> navNames = getInheritedNavigationPropertyNames(self);

        boolean hasConflict = relNames.stream().anyMatch(navNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_RELATIONS_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited relation(s) and inherited navigation properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_SEQUENCES_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited sequences and data properties have same name")
    public ValidationRule inheritingSequencesAndDataPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> seqNames = getInheritedSequenceNames(self);
        Set<String> dpNames = getInheritedDataPropertyNames(self);

        boolean hasConflict = seqNames.stream().anyMatch(dpNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_SEQUENCES_AND_DATA_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited sequence(s) and inherited data properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_SEQUENCES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited sequences and navigation properties have same name")
    public ValidationRule inheritingSequencesAndNavigationPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> seqNames = getInheritedSequenceNames(self);
        Set<String> navNames = getInheritedNavigationPropertyNames(self);

        boolean hasConflict = seqNames.stream().anyMatch(navNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_SEQUENCES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited sequence(s) and inherited navigation properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    @Constraint(name = INHERITING_DATA_PROPERTIES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED, message = "Inherited data properties and navigation properties have same name")
    public ValidationRule inheritingDataPropertiesAndNavigationPropertiesOfTheSameNameIsNotAllowed() {
        return (element, context) -> {
            EntityType self = (EntityType) element;
        Set<String> dpNames = getInheritedDataPropertyNames(self);
        Set<String> navNames = getInheritedNavigationPropertyNames(self);

        boolean hasConflict = dpNames.stream().anyMatch(navNames::contains);

        if (hasConflict) {
            return ValidationResult.fail(
                    INHERITING_DATA_PROPERTIES_AND_NAVIGATION_PROPERTIES_OF_THE_SAME_NAME_IS_NOT_ALLOWED,
                    "Entity type: " + self.getName() + " has inherited data properties and inherited navigation properties of the same name.",
                    Severity.ERROR,
                    self
            );
        }
        return ValidationResult.pass();
    
        };
    }

    // Note: Complex operation validations (InheritedOperationsAreValid, EntityTypeMustBeAbstractIfAnOperationIsAbstract,
    // NeedToOverrideMultipleOperationImplementations) require psmUtils which needs to be implemented separately
    // For now, they are omitted as they require significant additional utility code
}
