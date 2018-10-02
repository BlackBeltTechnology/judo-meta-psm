package hu.blackbelt.judo.meta.psm.tracker;

import hu.blackbelt.judo.meta.psm.PsmMetaModel;
import hu.blackbelt.judo.meta.psm.PsmModelInfo;
import hu.blackbelt.osgi.utils.osgi.api.BundleCallback;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import hu.blackbelt.osgi.utils.osgi.api.BundleUtil;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.Version;
import org.osgi.framework.VersionRange;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

@Component(immediate = true)
@Slf4j
public class PsmModelBundleTracker {

    public static final String PSM_MODELS = "Psm-Models";

    @Reference
    BundleTrackerManager bundleTrackerManager;

    @Reference
    PsmMetaModel psmMetaModel;

    Map<String, ServiceRegistration<PsmModelInfo>> psmRegistrations = new ConcurrentHashMap<>();
    Map<String, PsmModelInfo> psmModels = new HashMap<>();

    @Activate
    public void activate(final ComponentContext componentContext) {
        bundleTrackerManager.registerBundleCallback(this.getClass().getName(),
                new PsmRegisterCallback(componentContext.getBundleContext()),
                new PsmUnregisterCallback(componentContext.getBundleContext()),
                new PsmBundlePredicate());
    }

    @Deactivate
    public void deactivate(final ComponentContext componentContext) {
        bundleTrackerManager.unregisterBundleCallback(this.getClass().getName());
    }

    private static class PsmBundlePredicate implements Predicate<Bundle> {
        @Override
        public boolean test(Bundle bundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(bundle, PSM_MODELS);
            if (entries == null) {
                return false;
            }
            return true;
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
                if (params.containsKey(PsmModelInfo.META_VERSION)) {
                    VersionRange versionRange = new VersionRange(params.get(PsmModelInfo.META_VERSION).replaceAll("\"", ""));
                    if (versionRange.includes(bundleContext.getBundle().getVersion())) {

                        // Unpack model
                        try {
                            String key = trackedBundle.getBundleId() + "-" + params.get(PsmModelInfo.NAME);

                            File file = BundleUtil.copyBundleFileToPersistentStorage(trackedBundle, key + ".model", params.get(PsmModelInfo.FILE));

                            PsmModelInfo psmModelInfo = new PsmModelInfo(
                                    file,
                                    params.get(PsmModelInfo.NAME),
                                    new Version(params.get(PsmModelInfo.VERSION)),
                                    URI.createURI(file.getAbsolutePath()),
                                    params.get(PsmModelInfo.CHECKSUM),
                                    versionRange);

                            log.info("Registering model: " + psmModelInfo);

                            ServiceRegistration<PsmModelInfo> modelServiceRegistration = bundleContext.registerService(PsmModelInfo.class, psmModelInfo, psmModelInfo.toDictionary());
                            psmModels.put(key, psmModelInfo);
                            psmRegistrations.put(key, modelServiceRegistration);

                        } catch (IOException e) {
                            log.error("Could not load model: " + params.get(PsmModelInfo.NAME) + " from bundle: " + trackedBundle.getBundleId());
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
        BundleContext bundleContext;

        public PsmUnregisterCallback(BundleContext bundleContext) {
            this.bundleContext = bundleContext;
        }

        @Override
        public void accept(Bundle trackedBundle) {
            List<Map<String, String>> entries = BundleUtil.getHeaderEntries(trackedBundle, PSM_MODELS);
            for (Map<String, String> params : entries) {
                VersionRange versionRange = new VersionRange(params.get(PsmModelInfo.META_VERSION).replaceAll("\"", ""));
                if (params.containsKey(PsmModelInfo.META_VERSION)) {
                    if (versionRange.includes(bundleContext.getBundle().getVersion())) {
                        String key = trackedBundle.getBundleId() + "-" + params.get(PsmModelInfo.NAME);
                        ServiceRegistration<PsmModelInfo> modelServiceRegistration = psmRegistrations.get(key);

                        if (modelServiceRegistration != null) {
                            log.info("Unregistering moodel: " + psmModels.get(key));
                            modelServiceRegistration.unregister();
                            psmRegistrations.remove(key);
                            psmModels.remove(key);
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
}
