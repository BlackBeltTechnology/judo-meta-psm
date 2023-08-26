package hu.blackbelt.judo.meta.psm.osgi.itest;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import org.slf4j.Logger;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.model.northwind.Demo;
import hu.blackbelt.osgi.utils.osgi.api.BundleTrackerManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerClass;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

import javax.inject.Inject;
import java.io.*;
import java.net.MalformedURLException;

import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.calculatePsmValidationScriptURI;
import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.validatePsm;
import static hu.blackbelt.judo.meta.psm.osgi.itest.KarafFeatureProvider.karafConfig;
import static org.ops4j.pax.exam.CoreOptions.*;
import static org.ops4j.pax.exam.OptionUtils.combine;
import static org.ops4j.pax.tinybundles.core.TinyBundles.bundle;
import static org.ops4j.pax.tinybundles.core.TinyBundles.withBnd;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerClass.class)
@Slf4j
public class PsmModelLoadITest {

    private static final String DEMO = "northwind-psm";

    @Inject
    protected BundleTrackerManager bundleTrackerManager;

    @Inject
    BundleContext bundleContext;

    @Inject
    PsmModel psmModel;

    @Configuration
    public Option[] config() throws FileNotFoundException, UnsupportedEncodingException, MalformedURLException {

        return combine(karafConfig(this.getClass()),
                mavenBundle(maven()
                        .groupId("hu.blackbelt.judo.meta")
                        .artifactId("hu.blackbelt.judo.meta.psm.osgi")
                        .versionAsInProject()),
                mavenBundle(maven()
                        .groupId("hu.blackbelt.judo.meta")
                        .artifactId("hu.blackbelt.judo.meta.psm.model.northwind")
                        .versionAsInProject()),
                getProvisonModelBundle());
    }

    public Option getProvisonModelBundle() throws FileNotFoundException, UnsupportedEncodingException {
        return provision(
                getPsmModelBundle()
        );
    }

    private InputStream getPsmModelBundle() throws FileNotFoundException, UnsupportedEncodingException {
        Demo demModel = new Demo();
        PsmModel psmModel = demModel.fullDemo();

        return bundle()
                .add( "model/" + psmModel.getName() + "-psm.model",
                        new ByteArrayInputStream(psmModel.asString().getBytes("UTF-8")))
                .set( Constants.BUNDLE_MANIFESTVERSION, "2")
                .set( Constants.BUNDLE_SYMBOLICNAME, psmModel.getName() + "-psm" )
                //set( Constants.IMPORT_PACKAGE, "meta/psm;version=\"" + getConfiguration(META_PSM_IMPORT_RANGE) +"\"")
                .set( "Psm-Models", "name=" + psmModel.getName() + ";file=model/" + psmModel.getName() + "-psm.model")
                .build( withBnd());
    }

    @Test
    public void testModelValidation() throws Exception {
        try (BufferedSlf4jLogger bufferedLog = new BufferedSlf4jLogger(log)) {
            validatePsm(bufferedLog, psmModel, calculatePsmValidationScriptURI());
        }
    }
}
