package hu.blackbelt.judo.meta.psm.runtime;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;

import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;

import java.io.*;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport.setupRelativeUriRoot;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;
import static org.eclipse.emf.common.util.URI.createURI;

/**
 * A wrapper class on a Psm metamodel based model. This wrapper organizing the model a structure which can be used
 * in Tatami as a logical model.
 * The logical model have version and loaded resources. The logical model can handle load and save from / to different
 * type of input / output source.
 *
 * Examples:
 *
 * Load an model from file.
 * <pre>
 *    PsmModel psmModel = PsmModel.loadPsmModel(psmLoadArgumentsBuilder()
 *                 .uri(org.eclipse.emf.common.util.URI.createFileURI(new File("src/test/model/test.psm").getAbsolutePath()))
 *                 .build());
 *
 * </pre>
 *
 * More complex example, where model is loaded over an {@link URIHandler} in OSGi environment.
 *
 * <pre>
 *
 *    BundleURIHandler bundleURIHandler = new BundleURIHandler("urn", "", bundleContext.getBundle());
 *
 *    PsmModel psmModel = PsmModel.buildPsmModel()
 *                 .uri(org.eclipse.emf.common.util.URI.createURI("urn:test.psm"))
 *                 .uriHandler(bundleURIHandler)
 * </pre>
 *
 * Create an empty psm model
 * <pre>
 *    PsmModel psmModel = PsmModel.buildPsmModel()
 *                 .uri(URI.createFileURI("test.model"))
 *                 .build()
 * </pre>
 *
 */
public class PsmModel {

    public static final String NAME = "name";
    public static final String VERSION = "version";
    public static final String URI = "uri";
    public static final String RESOURCESET = "resourceset";

    private URI uri;
    private PsmModelResourceSupport psmModelResourceSupport;

    /**
     * Return the model's name
     * @return model's name
     */
    public String getName() {
        return psmModelResourceSupport.getStreamOfPsmNamespaceModel().findFirst().orElseThrow(() -> new IllegalStateException("Could not get PSM model")).getName();
    }

    /**
     * Return the model's version
     * @return model's version
     */
    public String getVersion() {
        return psmModelResourceSupport.getStreamOfPsmNamespaceModel().findFirst().orElseThrow(() -> new IllegalStateException("Could not get PSM model")).getVersion();
    }

    /**
     * Return all properties as a {@link Dictionary}
     * @return
     */
    public Dictionary<String, Object> toDictionary() {
        Dictionary<String, Object> ret = new Hashtable<>();
        ret.put(NAME, getName());
        ret.put(VERSION, getVersion());
        ret.put(URI, uri);
        ret.put(RESOURCESET, psmModelResourceSupport.getResourceSet());
        return ret;
    }

    /**
     * Get the model's {@link PsmModelResourceSupport} resource helper itself.
     * @return instance of {@link PsmModelResourceSupport}
     */
    public PsmModelResourceSupport getPsmModelResourceSupport() {
        return psmModelResourceSupport;
    }

    /**
     * Get the model's isolated {@link ResourceSet}
     * @return instance of {@link ResourceSet}
     */
    public ResourceSet getResourceSet() {
        return psmModelResourceSupport.getResourceSet();
    }


    /**
     * Get the model's root resource which represents the mdoel's uri {@link URI} itself.
     * If the given resource does not exists new one is created.
     * @return instance of {@link Resource}
     */
    public Resource getResource() {
        if (getResourceSet().getResource(uri, false) == null) {
            getResourceSet().createResource(uri);
        }
        return getResourceSet().getResource(uri, false);
    }

    /**
     * Add content to the given model's root.
     * @param object Object to add to resource.
     * @return return this instance
     */
    @SuppressWarnings("UnusedReturnValue")
    public PsmModel addContent(EObject object) {
        getResource().getContents().add(object);
        return this;
    }

    /**
     * Load an model into {@link PsmModel} default {@link Resource}.
     * The {@link URI}, {@link URIHandler} and {@link ResourceSet} arguments are not used here, because it has
     * already set.
     * @param loadArgumentsBuilder {@link LoadArguments.LoadArgumentsBuilder} used for load.
     * @return this {@link PsmModelResourceSupport}
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public PsmModel loadResource(LoadArguments.LoadArgumentsBuilder
                                                        loadArgumentsBuilder)
            throws IOException, PsmValidationException {
        return loadResource(loadArgumentsBuilder.build());
    }

    /**
     * Load an model into {@link PsmModel} default {@link Resource}.
     * The {@link URI}, {@link URIHandler} and {@link ResourceSet} arguments are not used here, because it has
     * already set.
     * @param loadArguments {@link LoadArguments} used for load.
     * @return this {@link PsmModelResourceSupport}
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    @SuppressWarnings("WeakerAccess")
    public PsmModel loadResource(LoadArguments loadArguments)
            throws IOException, PsmValidationException {

        Resource resource = getResource();
        Map loadOptions = loadArguments.getLoadOptions()
                .orElseGet(PsmModelResourceSupport::getPsmModelDefaultLoadOptions);

        try {
            InputStream inputStream = loadArguments.getInputStream()
                    .orElseGet(() -> loadArguments.getFile().map(f -> {
                        try {
                            return new FileInputStream(f);
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }).orElse(null));

            if (inputStream != null) {
                resource.load(inputStream, loadOptions);
            } else {
                resource.load(loadOptions);
            }

        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            } else {
                throw e;
            }
        }

        if (loadArguments.isValidateModel() && !isValid()) {
            throw new PsmValidationException(this);
        }
        return this;
    }

    /**
     * Load an model. {@link LoadArguments.LoadArgumentsBuilder} contains all parameter
     * @param loadArgumentsBuilder {@link LoadArguments.LoadArgumentsBuilder} used for load
     * @return new {@link PsmModel} instance
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public static PsmModel loadPsmModel(LoadArguments.LoadArgumentsBuilder loadArgumentsBuilder)
            throws IOException, PsmValidationException {
        return loadPsmModel(loadArgumentsBuilder.build());
    }

    /**
     * Load an model. {@link LoadArguments} contains all parameter
     * @param loadArguments {@link LoadArguments.LoadArgumentsBuilder} used for load
     * @return new {@link PsmModel} instance.
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public static PsmModel loadPsmModel(LoadArguments loadArguments) throws IOException, PsmValidationException {
        try {
            PsmModelResourceSupport psmModelResourceSupport = PsmModelResourceSupport
                    .loadPsm(loadArguments.toPsmModelResourceSupportLoadArgumentsBuilder()
                            .validateModel(false));
            PsmModel psmModel = buildPsmModel()
                    .uri(loadArguments.getUri().orElseGet(() ->
                            createURI("psm.model")))
                    .psmModelResourceSupport(psmModelResourceSupport)
                    .build();

            setupRelativeUriRoot(psmModel.getResourceSet(), loadArguments.uri);

            if (loadArguments.validateModel && !psmModelResourceSupport.isValid()) {
                throw new PsmValidationException(psmModel);
            }
            return psmModel;

        } catch (PsmModelResourceSupport.PsmValidationException ignore) {
            throw new IllegalStateException("This exception generated because the code is broken");
        }
    }

    /**
     * Save the model to the given URI.
     * @throws IOException when IO error occurred
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public void savePsmModel() throws IOException, PsmValidationException {
        savePsmModel(SaveArguments.psmSaveArgumentsBuilder());
    }

    /**
     * Save the model as the given {@link SaveArguments.SaveArgumentsBuilder} defines
     * @param saveArgumentsBuilder the {@link SaveArguments.SaveArgumentsBuilder} used for save
     * @throws IOException when IO error occurred
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public void savePsmModel(SaveArguments.SaveArgumentsBuilder saveArgumentsBuilder)
            throws IOException, PsmValidationException {
        savePsmModel(saveArgumentsBuilder.build());
    }

    /**
     * Save the model as the given {@link SaveArguments} defines
     * @param saveArguments the {@link SaveArguments} used for save
     * @throws IOException when IO error occurred
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public void savePsmModel(SaveArguments saveArguments) throws IOException, PsmValidationException {
        if (saveArguments.validateModel && !psmModelResourceSupport.isValid()) {
            throw new PsmValidationException(this);
        }
        try {
            psmModelResourceSupport.savePsm(saveArguments.toPsmModelResourceSupportSaveArgumentsBuilder()
                    .validateModel(false));
        } catch (PsmModelResourceSupport.PsmValidationException e) {
            // Validation disaled, this exception cannot be thrown
        }
    }

    /**
     * Get distinct diagnostics for model. Only  {@link Diagnostic}.WARN and {@link Diagnostic}.ERROR are returns.
     * @return set of {@link Diagnostic}
     */
    public Set<Diagnostic> getDiagnostics() {
        return psmModelResourceSupport.getDiagnostics();
    }

    /**
     * Checks the model have any {@link Diagnostic}.ERROR diagnostics. When there is no any the model assumed as valid.
     * @return true when model is valid
     */
    public boolean isValid() {
        return psmModelResourceSupport.isValid();
    }

    /**
     * Print model as string
     * @return model as XML string
     */
    @SuppressWarnings("WeakerAccess")
    public String asString() {
        return psmModelResourceSupport.asString();
    }

    /**
     * Get diagnostics as a String
     * @return diagnostic list as string. Every line represents one diagnostic.
     */
    @SuppressWarnings("WeakerAccess")
    public String getDiagnosticsAsString() {
        return psmModelResourceSupport.getDiagnosticsAsString();
    }

    /**
     * This exception is thrown when validateModel is true on load or save and the model is not conform with its
     * defined metamodel.
     */
    @SuppressWarnings("WeakerAccess")
    public static class PsmValidationException extends Exception {
        PsmModel psmModel;

        public PsmValidationException(PsmModel psmModel) {
            super("Invalid model\n" + psmModel.getDiagnosticsAsString());
            this.psmModel = psmModel;
        }
    }

    /**
     * Arguments for {@link PsmModel#loadPsmModel(LoadArguments)}
     * It can handle variance of the presented arguments.
     */
    public static class LoadArguments {
        URI uri;
        URIHandler uriHandler;
        ResourceSet resourceSet;
        Map<Object, Object> loadOptions;
        boolean validateModel;
        InputStream inputStream;
        File file;

        private static URIHandler $default$uriHandler() {
            return null;
        }

        private static ResourceSet $default$resourceSet() {
            return null;
        }

        private static File $default$file() {
            return null;
        }

        private static InputStream $default$inputStream() {
            return null;
        }

        private static Map<Object, Object> $default$loadOptions() {
            return PsmModelResourceSupport.getPsmModelDefaultLoadOptions();
        }

        Optional<URI> getUri() {
            return ofNullable(uri);
        }

        Optional<URIHandler> getUriHandler() {
            return ofNullable(uriHandler);
        }

        Optional<ResourceSet> getResourceSet() {
            return ofNullable(resourceSet);
        }

        Optional<Map<Object, Object>> getLoadOptions() {
            return ofNullable(loadOptions);
        }

        boolean isValidateModel() {
            return validateModel;
        }

        Optional<File> getFile() {
            return ofNullable(file);
        }

        Optional<InputStream> getInputStream() {
            return ofNullable(inputStream);
        }

        /**
         * Builder for {@link PsmModel#loadPsmModel(LoadArguments)}.
         */
        public static class LoadArgumentsBuilder {
            private URI uri;

            private boolean uriHandler$set;
            private URIHandler uriHandler;

            private boolean resourceSet$set;
            private ResourceSet resourceSet;


            private boolean loadOptions$set;
            private Map<Object, Object> loadOptions;

            private boolean validateModel = true;

            private boolean file$set;
            private File file;


            private boolean inputStream$set;
            private InputStream inputStream;


            LoadArgumentsBuilder() {
            }

            /**
             * Defines the {@link URI} of the model.
             * This is mandatory.
             */
            public LoadArgumentsBuilder uri(final URI uri) {
                requireNonNull(uri);
                this.uri = uri;
                return this;
            }


            /**
             * Defines the {@link URIHandler} used for model IO. If not defined the default is EMF used.
             */
            public LoadArgumentsBuilder uriHandler(final URIHandler uriHandler) {
                requireNonNull(uriHandler);
                this.uriHandler = uriHandler;
                uriHandler$set = true;
                return this;
            }


            /**
             * Defines the default {@link ResourceSet}. If it is not defined the factory based resourceSet is used.
             */
            public LoadArgumentsBuilder resourceSet(final ResourceSet resourceSet) {
                requireNonNull(resourceSet);
                this.resourceSet = resourceSet;
                resourceSet$set = true;
                return this;
            }


            /**
             * Defines the load options for model. If not defined the
             * {@link PsmModelResourceSupport#getPsmModelDefaultLoadOptions()} us used.
             */
            public LoadArgumentsBuilder loadOptions(final Map<Object, Object> loadOptions) {
                requireNonNull(loadOptions);
                this.loadOptions = loadOptions;
                loadOptions$set = true;
                return this;
            }


            /**
             * Defines that model validation required or not on load. Default: true
             */
            public LoadArgumentsBuilder validateModel(boolean validateModel) {
                this.validateModel = validateModel;
                return this;
            }


            /**
             * Defines the file if it is not loaded from URI. If not defined, URI is used. If inputStream is defined
             * it is used.
             */
            public LoadArgumentsBuilder file(final File file) {
                requireNonNull(file);
                this.file = file;
                file$set = true;
                return this;
            }


            /**
             * Defines the file if it is not loaded from  File or URI. If not defined, File or URI is used.
             */
            public LoadArgumentsBuilder inputStream(final InputStream inputStream) {
                requireNonNull(inputStream);
                this.inputStream = inputStream;
                inputStream$set = true;
                return this;
            }

            public LoadArguments build() {
                URIHandler uriHandler = this.uriHandler;
                if (!uriHandler$set) uriHandler = LoadArguments.$default$uriHandler();
                ResourceSet resourceSet = this.resourceSet;
                if (!resourceSet$set) resourceSet = LoadArguments.$default$resourceSet();

                Map<Object, Object> loadOptions = this.loadOptions;
                if (!loadOptions$set) loadOptions = LoadArguments.$default$loadOptions();
                File file = this.file;
                if (!file$set) file = LoadArguments.$default$file();
                InputStream inputStream = this.inputStream;
                if (!inputStream$set) inputStream = LoadArguments.$default$inputStream();

                return new LoadArguments(
                        uri,
                        uriHandler,
                        resourceSet,
                        loadOptions,
                        validateModel,
                        file,
                        inputStream);
            }

            @java.lang.Override

            public java.lang.String toString() {
                return "PsmModel.LoadArguments.LoadArgumentsBuilder(uri=" + this.uri
                        + ", uriHandler=" + this.uriHandler
                        + ", resourceSet=" + this.resourceSet
                        + ", loadOptions=" + this.loadOptions
                        + ", validateModel=" + this.validateModel
                        + ", file=" + this.file
                        + ", inputStream=" + this.inputStream
                        + ")";
            }
        }


        public static LoadArgumentsBuilder psmLoadArgumentsBuilder() {
            return new LoadArgumentsBuilder();
        }


        private LoadArguments(final URI uri,
                              final URIHandler uriHandler,
                              final ResourceSet resourceSet,
                              final Map<Object, Object> loadOptions,
                              final boolean validateModel,
                              final File file,
                              final InputStream inputStream) {
            this.uri = uri;
            this.uriHandler = uriHandler;
            this.resourceSet = resourceSet;
            this.loadOptions = loadOptions;
            this.validateModel = validateModel;
            this.file = file;
            this.inputStream = inputStream;
        }


        PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder
                    toPsmModelResourceSupportLoadArgumentsBuilder() {
            PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder argumentsBuilder =
                    PsmModelResourceSupport.LoadArguments.psmLoadArgumentsBuilder()
                            .uri(getUri()
                                    .orElseGet(() ->
                                        createURI("psm.model")))
                            .validateModel(isValidateModel());

            getUriHandler().ifPresent(argumentsBuilder::uriHandler);
            getResourceSet().ifPresent(argumentsBuilder::resourceSet);
            getLoadOptions().ifPresent(argumentsBuilder::loadOptions);
            getFile().ifPresent(argumentsBuilder::file);
            getInputStream().ifPresent(argumentsBuilder::inputStream);

            return argumentsBuilder;
        }


    }


    /**
     * Arguments for {@link PsmModel#savePsmModel(SaveArguments)}
     * It can handle variance of the presented arguments.
     */
    public static class SaveArguments {
        OutputStream outputStream;
        File file;
        Map<Object, Object> saveOptions;
        boolean validateModel;

        private static OutputStream $default$outputStream() {
            return null;
        }

        private static File $default$file() {
            return null;
        }

        private static Map<Object, Object> $default$saveOptions() {
            return null;
        }

        public Optional<OutputStream> getOutputStream() {
            return ofNullable(outputStream);
        }

        public Optional<File> getFile() {
            return ofNullable(file);
        }

        public Optional<Map<Object, Object>> getSaveOptions() {
            return ofNullable(saveOptions);
        }

        public boolean isValidateModel() {
            return validateModel;
        }

        /**
         * Builder for {@link PsmModel#savePsmModel(SaveArguments)}.
         */
        public static class SaveArgumentsBuilder {

            private boolean outputStream$set;
            private OutputStream outputStream;

            private boolean file$set;
            private File file;

            private boolean saveOptions$set;
            private Map<Object, Object> saveOptions;

            private boolean validateModel = true;


            SaveArgumentsBuilder() {
            }


            public PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder
                        toPsmModelResourceSupportSaveArgumentsBuilder() {
                PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder argumentsBuilder =
                        PsmModelResourceSupport.SaveArguments.psmSaveArgumentsBuilder().validateModel(validateModel);

                if (outputStream$set) argumentsBuilder.outputStream(outputStream);
                if (file$set) argumentsBuilder.file(file);
                if (saveOptions$set) argumentsBuilder.saveOptions(saveOptions);
                return argumentsBuilder;
            }


            /**
             * Defines {@link OutputStream} which is used by save. Whe it is not defined, file is used.
             */
            public SaveArgumentsBuilder outputStream(final OutputStream outputStream) {
                requireNonNull(outputStream);
                this.outputStream = outputStream;
                outputStream$set = true;
                return this;
            }


            /**
             * Defines {@link File} which is used by save. Whe it is not defined the model's
             * {@link PsmModel#uri is used}
             */
            public SaveArgumentsBuilder file(File file) {
                requireNonNull(file);
                this.file = file;
                file$set = true;
                return this;
            }


            /**
             * Defines save options. When it is not defined
             * {@link PsmModelResourceSupport#getPsmModelDefaultSaveOptions()} is used.
             */
            public SaveArgumentsBuilder saveOptions(final Map<Object, Object> saveOptions) {
                requireNonNull(saveOptions);
                this.saveOptions = saveOptions;
                saveOptions$set = true;
                return this;
            }

            /**
             * Defines that model validation required or not on save. Default: true
             */
            public SaveArgumentsBuilder validateModel(boolean validateModel) {
                this.validateModel = validateModel;
                return this;
            }


            public SaveArguments build() {
                OutputStream outputStream = this.outputStream;
                if (!outputStream$set) outputStream = SaveArguments.$default$outputStream();
                File file = this.file;
                if (!file$set) file = SaveArguments.$default$file();
                Map<Object, Object> saveOptions = this.saveOptions;
                if (!saveOptions$set) saveOptions = SaveArguments.$default$saveOptions();
                return new SaveArguments(outputStream, file, saveOptions, validateModel);
            }

            @java.lang.Override

            public java.lang.String toString() {
                return "PsmModel.SaveArguments.SaveArgumentsBuilder("
                        + "outputStream=" + this.outputStream
                        + ", file=" + this.file
                        + ", saveOptions=" + this.saveOptions
                        + ")";
            }
        }


        public static SaveArgumentsBuilder psmSaveArgumentsBuilder() {
            return new SaveArgumentsBuilder();
        }


        public PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder toPsmModelResourceSupportSaveArgumentsBuilder() {
            PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder argumentsBuilder =
                    PsmModelResourceSupport.SaveArguments.psmSaveArgumentsBuilder().validateModel(validateModel);

            getOutputStream().ifPresent(o -> argumentsBuilder.outputStream(o));
            getFile().ifPresent(o -> argumentsBuilder.file(o));
            getSaveOptions().ifPresent(o -> argumentsBuilder.saveOptions(o));
            return argumentsBuilder;
        }



        private SaveArguments(final OutputStream outputStream,
                              final File file,
                              final Map<Object, Object> saveOptions,
                              final boolean validateModel) {
            this.outputStream = outputStream;
            this.file = file;
            this.saveOptions = saveOptions;
            this.validateModel = validateModel;
        }
    }



    public static class PsmModelBuilder {

        private URI uri;


        private boolean psmModelResourceSupport$set;
        private PsmModelResourceSupport psmModelResourceSupport;

        private boolean resourceSet$set;
        private ResourceSet resourceSet;

        private URIHandler uriHandler;
        private boolean uriHandler$set;

        PsmModelBuilder() {
        }




        /**
         * Defines the uri {@link URI} of the model. Its mandatory.
         */
        public PsmModelBuilder uri(final URI uri) {
            this.uri = uri;
            return this;
        }


        public PsmModelBuilder psmModelResourceSupport(final PsmModelResourceSupport psmModelResourceSupport) {
            requireNonNull(psmModelResourceSupport);
            this.psmModelResourceSupport = psmModelResourceSupport;
            this.psmModelResourceSupport$set = true;
            return this;
        }

        public PsmModelBuilder resourceSet(final ResourceSet resourceSet) {
            requireNonNull(resourceSet);
            this.resourceSet = resourceSet;
            this.resourceSet$set = true;
            return this;
        }

        public PsmModelBuilder uriHandler(final URIHandler uriHandler) {
            requireNonNull(uriHandler);
            this.uriHandler = uriHandler;
            this.uriHandler$set = true;
            return this;
        }


        public PsmModel build() {
            org.eclipse.emf.common.util.URI uriPhysicalOrLogical = ofNullable(uri)
                    .orElseGet(() ->
                          createURI("psm.model"));


            PsmModelResourceSupport psmModelResourceSupport = this.psmModelResourceSupport;
            if (!psmModelResourceSupport$set) {
                PsmModelResourceSupport.PsmModelResourceSupportBuilder psmModelResourceSupportBuilder =
                        PsmModelResourceSupport.psmModelResourceSupportBuilder()
                                .uri(uriPhysicalOrLogical);

                if (resourceSet$set) psmModelResourceSupportBuilder.resourceSet(resourceSet);
                if (uriHandler$set) psmModelResourceSupportBuilder.uriHandler(uriHandler);

                psmModelResourceSupport = psmModelResourceSupportBuilder.build();
            } else {
                this.uri = psmModelResourceSupport.getResource().getURI();
            }


            return new PsmModel(
                uriPhysicalOrLogical,
                psmModelResourceSupport);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "PsmModel.PsmModelBuilder("
                    + "uri=" + this.uri
                    + ", psmModelResourceSupport=" + this.psmModelResourceSupport + ")";
        }
    }

    public static PsmModelBuilder buildPsmModel() {
        return new PsmModelBuilder();
    }

    private PsmModel(
                     final URI uri,
                     final PsmModelResourceSupport psmModelResourceSupport) {

        requireNonNull(uri, "URI is mandatory");
        this.uri = uri;
        this.psmModelResourceSupport = psmModelResourceSupport;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PsmModel("
                + ", uri=" + this.getUri()
                + ", psmModelResourceSupport=" + this.psmModelResourceSupport + ")";
    }

    /**
     * Get the {@link URI} of the model.
     */
    public URI getUri() {
        return this.uri;
    }
}
