## ADDED Requirements

### Requirement: PsmGeneratorParameter supports normalizerRegistry field
`PsmGeneratorParameter` SHALL have a `FileNormalizerRegistry normalizerRegistry` field with `@Builder.Default` value of `null`.

#### Scenario: Default normalizerRegistry is null
- **WHEN** a `PsmGeneratorParameter` is built without setting normalizerRegistry
- **THEN** the normalizerRegistry field SHALL be null

#### Scenario: Custom normalizerRegistry can be set
- **WHEN** a `PsmGeneratorParameter` is built with `.normalizerRegistry(registry)`
- **THEN** the normalizerRegistry field SHALL hold the provided registry instance

### Requirement: PsmGenerator passes normalizerRegistry to GeneratorParameter
`PsmGenerator.mapPsmParameters()` SHALL pass the `normalizerRegistry` from `PsmGeneratorParameter` to the `GeneratorParameter` builder via `.normalizerRegistry(parameter.normalizerRegistry)`.

#### Scenario: normalizerRegistry is delegated to GeneratorParameter
- **WHEN** `mapPsmParameters()` builds a `GeneratorParameter` from a `PsmGeneratorParameter`
- **THEN** the resulting `GeneratorParameter` SHALL have the same normalizerRegistry value as the input

### Requirement: Generator-commons version supports FileNormalizerRegistry
The `judo-generator-commons-version` property in both judo-meta-psm and judo-esm-fullstack-project-template SHALL be updated to `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison`.

#### Scenario: PSM project uses updated generator-commons
- **WHEN** the PSM project is built
- **THEN** it SHALL resolve generator-commons version `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison`

#### Scenario: Template project uses updated generator-commons
- **WHEN** the fullstack template project is built
- **THEN** it SHALL resolve generator-commons version `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison`
