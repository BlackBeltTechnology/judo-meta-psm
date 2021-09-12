#!/bin/bash

mvn validate -Dtycho.mode=maven -P update-target-versions -f ./targetdefinition/pom.xml
mvn validate -Dtycho.mode=maven -P update-category-versions -f ./site/pom.xml

