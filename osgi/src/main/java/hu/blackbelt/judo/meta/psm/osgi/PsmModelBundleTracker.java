package hu.blackbelt.judo.meta.psm.osgi;

import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.osgi.utils.osgi.api.BundleCallback;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import hu.blackbelt.osgi.utils.osgi.api.BundleUtil;
import lombok.extern.slf4j.Slf4j;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.VersionRange;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.LoadArguments.psmLoadArgumentsBuilder;
import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.loadPsmModel;
import static java.util.Optional.ofNullable;

@Component(immediate = true)
@Slf4j
@Designate(ocd = PsmModelBundleTracker.TrackerConfig.class)
public class PsmModelBundleTracker {

    public static final String PSM_MODELS = "Psm-Models";

    @ObjectClassDefinition(name="Psm Model Bundle TTracker")
    public @interface TrackerConfig {
        @AttributeDefinition(
                name = "Tags",
                description = "Which tags are on the loaded model when there is no one defined in bundle"
        )
        String tags() default "";
    }

    @Reference
    BundleTrackerManager bundleTrackerManager;

    Map<String, ServiceRegistration<PsmModel>> psmModelRegistrations = new ConcurrentHashMap<>();

    Map<String, PsmModel> psmModels = new HashMap<>();

    TrackerConfig config;

    @Activate
    public void activate(final ComponentContext componentContext, final TrackerConfig trackerConfig) {
        this.config = trackerConfig;
        bundleTrackerManager.registerBundleCallback(this.getClass().getName(),
                new PsmRegisterCallback(componentContext.getBundleContext()),
                new PsmUnregisterCallback(),
                new PsmBundlePredicate());
    }

    @Deactivate
    public void deactivate(final ComponentContext componentContext) {
        bundleTrackerManager.unregisterBundleCallback(this.getClass().getName());
    }

    private static class PsmBundlePredicate implements Predicate<Bundle> {
        @Override
        public boolean test(Bundle trackedBundle) {
            return BundleUtil.hasHeader(trackedBundle, PSM_MODELS);
        }
    }

    private class PsmRegisterCallback implements BundleCallback {

        BundleContext bundleContext;

        public PsmRegisterCallback(BundleContext bundleContext) {
            this.bundleContext = bundleContext;
        }


        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, PSM_MODELS);


            for (Map<String, String> params : entries) {
                String key = params.get(PsmModel.NAME);
                if (psmModelRegistrations.containsKey(key)) {
                    log.error("Psm model already loaded: " + key);
                } else {
                    if (params.containsKey(PsmModel.META_VERSION_RANGE)) {
                        VersionRange versionRange = new VersionRange(params.get(PsmModel.META_VERSION_RANGE).replaceAll("\"", ""));
                        if (versionRange.includes(bundleContext.getBundle().getVersion())) {
                            // Unpack model
                            try {
                                PsmModel psmModel = loadPsmModel(psmLoadArgumentsBuilder()
                                        .inputStream(trackedBundle.getEntry(params.get("file")).openStream())
                                        .name(params.get(PsmModel.NAME))
                                        .version(trackedBundle.getVersion().toString())
                                        .checksum(ofNullable(params.get(PsmModel.CHECKSUM)).orElse("notset"))
                                        .tags(Stream.of(ofNullable(params.get(PsmModel.TAGS)).orElse(config.tags()).split(",")).collect(Collectors.toSet()))
                                        .acceptedMetaVersionRange(Optional.of(versionRange.toString()).orElse("[0,99)")));

                                log.info("Registering Psm model: " + psmModel);

                                ServiceRegistration<PsmModel> modelServiceRegistration = bundleContext.registerService(PsmModel.class, psmModel, psmModel.toDictionary());
                                psmModels.put(key, psmModel);
                                psmModelRegistrations.put(key, modelServiceRegistration);

                            } catch (IOException | PsmModel.PsmValidationException e) {
                                log.error("Could not load Psm model: " + params.get(PsmModel.NAME) + " from bundle: " + trackedBundle.getBundleId(), e);
                            }
                        }
                    }
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

    private class PsmUnregisterCallback implements BundleCallback {

        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, PSM_MODELS);
            for (Map<String, String> params : entries) {
                String key = params.get(PsmModel.NAME);

                if (psmModels.containsKey(key)) {
                    ServiceRegistration<PsmModel> modelServiceRegistration = psmModelRegistrations.get(key);

                    if (modelServiceRegistration != null) {
                        log.info("Unregistering Psm model: " + psmModels.get(key));
                        modelServiceRegistration.unregister();
                        psmModelRegistrations.remove(key);
                        psmModels.remove(key);
                    }
                } else {
                    log.error("Psm Model is not registered: " + key);
                }
            }
        }

        @Override
        public Thread process(Bundle bundle) {
            return null;
        }
    }

}
