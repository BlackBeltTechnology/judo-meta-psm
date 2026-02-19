## Why

The generator-commons library has added `FileNormalizerRegistry` support for whitespace-tolerant file comparison during checksum validation. The UI metamodel (judo-meta-ui) has already adopted this in PR #172. The PSM metamodel and the fullstack project template need the same adaptation so that PSM-generated files (Java SDK, REST) benefit from content normalization — preventing spurious regeneration when external formatters modify whitespace, imports, or quote styles.

## What Changes

- Add `FileNormalizerRegistry normalizerRegistry` field to `PsmGeneratorParameter`
- Pass `normalizerRegistry` through in `PsmGenerator.mapPsmParameters()` to the underlying `GeneratorParameter`
- Bump `judo-generator-commons-version` in judo-meta-psm to `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison`
- Bump `judo-generator-commons-version` in judo-esm-fullstack-project-template to the same version

## Capabilities

### New Capabilities
- `normalizer-passthrough`: Wire FileNormalizerRegistry from PsmGeneratorParameter through to GeneratorParameter, enabling content normalization in the PSM generator pipeline

### Modified Capabilities

## Impact

- `generator-engine` module: `PsmGeneratorParameter.java` and `PsmGenerator.java` gain normalizerRegistry support
- `pom.xml` (judo-meta-psm root): dependency version bump for generator-commons
- `pom.xml` (judo-esm-fullstack-project-template root): dependency version bump for generator-commons
- No breaking changes — normalizerRegistry defaults to null, and the auto preset activates via `GeneratorParameter.getEffectiveNormalizerRegistry()` fallback
