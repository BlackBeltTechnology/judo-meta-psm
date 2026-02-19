## 1. PSM Generator Engine

- [x] 1.1 Add `FileNormalizerRegistry normalizerRegistry` field with `@Builder.Default null` to `PsmGeneratorParameter.java` and add the import for `hu.blackbelt.judo.generator.commons.FileNormalizerRegistry`
- [x] 1.2 Add `.normalizerRegistry(parameter.normalizerRegistry)` to the `GeneratorParameter` builder in `PsmGenerator.mapPsmParameters()`

## 2. Dependency Version Bumps

- [x] 2.1 Bump `judo-generator-commons-version` in `judo-meta-psm/pom.xml` to `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison`
- [x] 2.2 Bump `judo-generator-commons-version` in `judo-esm-fullstack-project-template/pom.xml` to `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison`

## 3. Verification

- [x] 3.1 Build judo-meta-psm (`mvn clean install -pl generator-engine`)
- [x] 3.2 Build judo-esm-fullstack-project-template
