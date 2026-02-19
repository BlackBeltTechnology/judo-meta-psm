## Context

The judo-generator-commons library now supports `FileNormalizerRegistry` for whitespace-tolerant content comparison during checksum validation. The UI metamodel (judo-meta-ui PR #172) has already adopted this pattern. The PSM metamodel needs the identical plumbing, and the fullstack project template needs its generator-commons dependency bumped.

The pattern is established: each model-specific generator (UI, PSM) wraps the generic `GeneratorParameter` with its own parameter class (e.g., `UiGeneratorParameter`, `PsmGeneratorParameter`). The model-specific `mapXxxParameters()` method translates between them. The `normalizerRegistry` field follows this same delegation pattern.

## Goals / Non-Goals

**Goals:**
- Wire `FileNormalizerRegistry` through the PSM generator pipeline, matching the UI implementation
- Bump generator-commons version in both judo-meta-psm and judo-esm-fullstack-project-template
- Enable default auto-preset normalizers (java, ts, xml, etc.) for all PSM-generated files

**Non-Goals:**
- Adding Maven Mojo `@Parameter` for explicit normalizerRegistry configuration (neither UI nor PSM has this; the fallback via `GeneratorParameter.getEffectiveNormalizerRegistry()` is sufficient)
- Adding custom normalizer presets or YAML descriptor changes (the auto preset covers Java files)
- Modifying the generator-commons library itself

## Decisions

**1. Mirror the UI implementation exactly**

Add `FileNormalizerRegistry normalizerRegistry` as a `@Builder.Default null` field on `PsmGeneratorParameter`, and pass it through in `PsmGenerator.mapPsmParameters()`. This is the exact same 2-line change the UI PR made.

Rationale: Consistency across metamodel generators. The pattern is already proven in UI PR #172.

**2. Rely on `getEffectiveNormalizerRegistry()` fallback for activation**

No explicit normalizerRegistry will be set by callers. Instead, `GeneratorParameter.getEffectiveNormalizerRegistry()` will detect that `normalizeContent` defaults to true and `fileNormalizers` defaults to the auto preset, automatically building a registry.

Rationale: Zero-config activation. All consumers get normalization without changes to Mojos, YAML descriptors, or Maven POM configurations.

**3. Use the feature branch generator-commons version**

Version `1.0.0.20260219_141233_445dccad_feature_JNG_6357_AddContentComparison` — the same version the UI PR uses.

Rationale: The local build of generator-commons is this version. All three repos (generator-commons, meta-ui, meta-psm) stay on the same feature branch version for JNG-6357.

## Risks / Trade-offs

- [Normalization changes checksum behavior] → Mitigated: normalizers only affect comparison, not stored checksums. First run after upgrade may recalculate checksums but won't break existing workflows.
- [Feature branch dependency version] → Mitigated: this is the coordinated feature branch for JNG-6357 across all repos. Will be merged to develop together.
