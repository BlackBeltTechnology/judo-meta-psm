# `PsmModelBundleTracker.java`

`@Component(immediate = true)` DS component that turns PSM models shipped inside OSGi bundles
into live `PsmModel` services.

## Exports

- `PsmModelBundleTracker` — the component class, `@Slf4j`.
- `public static final String PSM_MODELS = "Psm-Models"` — the manifest header a bundle must
  declare to be tracked.
- `activate(ComponentContext)` (`@Activate`) — registers a register/unregister callback pair plus
  a bundle predicate with the injected `BundleTrackerManager`, keyed by `getClass().getName()`.
- `deactivate(ComponentContext)` (`@Deactivate`) — unregisters that callback under the same key.
- `@Reference BundleTrackerManager bundleTrackerManager` — the only injected collaborator.

## Internal collaborators

- `PsmBundlePredicate implements Predicate<Bundle>` — selects bundles via
  `BundleUtil.hasHeader(bundle, PSM_MODELS)`.
- `PsmRegisterCallback implements BundleCallback` — per header entry, reads `params.get("file")`,
  opens `trackedBundle.getEntry(file).openStream()`, calls
  `loadPsmModel(psmLoadArgumentsBuilder().inputStream(...))`, then
  `bundleContext.registerService(PsmModel.class, psmModel, psmModel.toDictionary())`.
- `PsmUnregisterCallback implements BundleCallback` — re-reads the same header entries on bundle
  stop and calls `ServiceRegistration.unregister()` for each key it holds.

## State and contracts

- Two parallel maps keyed by the header's `PsmModel.NAME` value: `psmModelRegistrations`
  (`ConcurrentHashMap`) and `psmModels` (plain `HashMap` — **not** concurrent, so concurrent
  bundle start/stop callbacks are only as safe as the `BundleTrackerManager`'s own serialisation).
- The model name key must be unique estate-wide: a second bundle declaring an already-registered
  name is **skipped with an `error` log, not an exception** — the first registration wins and the
  second model silently never appears as a service.
- `IOException` and `PsmModel.PsmValidationException` during load are caught and logged; a bundle
  carrying a malformed model still starts normally and simply publishes no service.
- Both callbacks return `null` from `process(Bundle)`, i.e. no background thread — all work runs
  synchronously on the tracker's callback thread.
