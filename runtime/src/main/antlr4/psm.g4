grammar psm;

prog
    : modelDeclaration
    ;

modelDeclaration
    : MODEL name
        declarations
      END
    ;

packageDeclaration
    : PACKAGE name
        declarations
      END
    ;

declarations
    : (packageDeclaration | typeDeclaration | entityDeclaration | viewDeclaration | actionDeclaration)*
    ;

viewDeclaration
    : VIEW name (BASE entityName)?
         (propertyDeclaration | linkDeclaration)*
      END
    ;

actionDeclaration
    : ACTION name (BASE entityName)? (RESULT viewName)?
         (propertyDeclaration | linkDeclaration)*
         body
      END
    ;

propertyDeclaration
    : PROPERTY name '(' path ')'
    ;

linkDeclaration
    : LINK name '(' path ')' ':' viewName
    ;



entityDeclaration
    : (ABSTRACT)? ENTITY name (SPECIALIZES entityName (',' entityName)*)?
         (attributeDeclaration | endpointDeclaration)*
      END
    ;

endpointDeclaration
    : (ASSOCIATION | COMPOSITION) name '(' attributeName ')' (PARTNER endpointName)?
    ;

attributeDeclaration
    : ATTRIBUTE attributeModifier name ':' dataType
    ;

attributeModifier
    : ((REQUIRED? ID?) | (ID? REQUIRED?))
    ;

dataType
    : primitiveType | collectionType | typeDeclarationName
    ;

typeDeclaration
    : TYPEDEF name (primitiveType | collectionType)
    ;

collectionType
    : collectionModifier primitiveType COLLECTION
    ;

collectionModifier
    : ((UNIQUE? ORDERED?) | (ORDERED? UNIQUE?))
    ;

primitiveType
    : BOOLEAN
    | NUMERIC ('(' NaturalLiteral ',' NaturalLiteral ')')?
    | STRING ('(' NaturalLiteral ')')?
    | ENUMERATION '(' memberName (',' memberName)* ')'
    | entityName
    | CUSTOM
    ;

body
    : BODY
        (createStatement | deleteStatement)*
      END
    ;

createStatement
    : CREATE entityName (VALUES valueDefinition)?
    ;

deleteStatement
    : DELETE IDENTIFIER
    ;

findStatement
    : FIND IDENTIFIER WHERE
    ;

getStatement
    : GET IDENTIFIER WHERE
    ;

valueDefinition
    : attributeSetting (',' attributeSetting)*
    ;

attributeSetting
    : attributeName '=' IDENTIFIER
    ;

path
    : IDENTIFIER
    ;

memberName
    : '"' IDENTIFIER '"'
    ;

endpointName
    : (entityName SEPARATOR)? IDENTIFIER
    ;

attributeName
    : (entityName SEPARATOR)? IDENTIFIER
    ;

linkName
    : (facadeName SEPARATOR)? IDENTIFIER
    ;

propertyName
    : (facadeName SEPARATOR)? IDENTIFIER
    ;

actionName
    : facadeName
    ;

viewName
    : facadeName
    ;

facadeName
    : (namespace)? IDENTIFIER
    ;

entityName
    : (namespace)? IDENTIFIER
    ;

typeDeclarationName
    : (namespace)? IDENTIFIER
    ;

namespace
    : IDENTIFIER SEPARATOR (namespace)?
    ;

name
    : IDENTIFIER
    ;

// Keywords

ABSTRACT:       'abstract';
ACTION:         'action';
ASSOCIATION:    'association';
ATTRIBUTE:      'attribute';
BASE:           'base';
BODY:           'body';
BOOLEAN:        'boolean';
COMPOSITION:    'composition';
CREATE:         'create';
CUSTOM:         'custom';
DELETE:         'delete';
END:            'end';
ENTITY:         'entity';
ENUMERATION:    'enumeration';
FIND:           'find';
GET:            'get';
ID:             'identifier';
LINK:           'link';
MODEL:          'model';
NUMERIC:        'numeric';
ORDERED:        'ordered';
PACKAGE:        'package';
PARTNER:        'partner';
PROPERTY:       'property';
REFERENCE:      'reference';
REQUIRED:       'required';
RESULT:         'result';
SPECIALIZES:    'specializes';
STRING:         'string';
TYPEDEF:        'type';
UNIQUE:         'unique';
VALUES:         'values';
WHERE:          'where';
VIEW:           'view';

COLLECTION
    : '[]'
    ;

SEPARATOR
    : '.'
    ;

IDENTIFIER
    :   JavaLetter JavaLetterOrDigit*
    ;




NaturalLiteral
    :   '0'
    |   NonZeroDigit Digit*
    ;

IntegerLiteral
    :   Sign? NaturalLiteral
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
Sign
    :   [+-]
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;
