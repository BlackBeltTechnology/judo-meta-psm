package hu.blackbelt.judo.meta.psm.osgi.itest;

import hu.blackbelt.epsilon.runtime.execution.exceptions.ScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.StringBuilderLogger;
import hu.blackbelt.judo.meta.psm.PsmEpsilonValidator;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerClass;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.service.log.LogService;

import javax.inject.Inject;
import java.io.*;
import java.net.URISyntaxException;

import static hu.blackbelt.judo.meta.psm.osgi.itest.PsmKarafFeatureProvider.*;
import static org.junit.Assert.assertFalse;
import static org.ops4j.pax.exam.CoreOptions.*;
import static org.ops4j.pax.exam.OptionUtils.combine;
import static org.ops4j.pax.tinybundles.core.TinyBundles.bundle;
import static org.ops4j.pax.tinybundles.core.TinyBundles.withBnd;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerClass.class)
public class PsmModelLoadITest {

    private static final String DEMO = "northwind-psm";

    @Inject
    LogService log;

    @Inject
    protected BundleTrackerManager bundleTrackerManager;

    @Inject
    BundleContext bundleContext;

    @Inject
    PsmModel psmModel;

    @Configuration
    public Option[] config() throws FileNotFoundException {

        return combine(getRuntimeFeaturesForMetamodel(this.getClass()),
                mavenBundle(maven()
                        .groupId("hu.blackbelt.judo.meta")
                        .artifactId("hu.blackbelt.judo.meta.psm.osgi")
                        .versionAsInProject()),
                getProvisonModelBundle());
    }

    public Option getProvisonModelBundle() throws FileNotFoundException {
        return provision(
                getPsmModelBundle()
        );
    }

    private InputStream getPsmModelBundle() throws FileNotFoundException {
        return bundle()
                .add( "model/" + DEMO + ".judo-meta-psm",
                        new FileInputStream(new File(testTargetDir(getClass()).getAbsolutePath(),  "northwind-psm.model")))
                .set( Constants.BUNDLE_MANIFESTVERSION, "2")
                .set( Constants.BUNDLE_SYMBOLICNAME, DEMO + "-psm" )
                //set( Constants.IMPORT_PACKAGE, "meta/psm;version=\"" + getConfiguration(META_PSM_IMPORT_RANGE) +"\"")
                .set( "Psm-Models", "file=model/" + DEMO + ".judo-meta-psm;version=1.0.0;name=" + DEMO + ";checksum=notset;meta-version-range=\"[1.0.0,2)\"")
                .build( withBnd());
    }

    @Test
    public void testModelValidation() {
        StringBuilderLogger logger = new StringBuilderLogger(StringBuilderLogger.LogLevel.DEBUG);
        try {
            PsmEpsilonValidator.validatePsm(logger,
                    psmModel,
                    PsmEpsilonValidator.getValidationScriptURI());

        } catch (Exception e) {
            log.log(LogService.LOG_ERROR, logger.getBuffer());
            assertFalse(true);
        }
    }
}