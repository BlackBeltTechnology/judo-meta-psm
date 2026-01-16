package hu.blackbelt.judo.meta.psm.support;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DelegatingResourceLocator;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import static java.util.Objects.requireNonNull;
import static java.util.Optional.ofNullable;

import hu.blackbelt.judo.meta.psm.PsmPackage;
import hu.blackbelt.judo.meta.psm.util.PsmResourceFactoryImpl;
import hu.blackbelt.judo.meta.psm.util.PsmResourceImpl;


/**
 * This class wraps EMF ResourceSet. This helps to manage URI handler and gives Java 8 stream api over it.
 * It can help handle the model / load save using builder pattern for parameter construction.
 * Examples:
 *
 * Load an model from file. The file URI is used as base URI.
 * <pre>
 *    PsmModelResourceSupport psmModel = PsmModelResourceSupport.loadPsm(
 *            PsmModelResourceSupport.psmLoadArgumentsBuilder()
 *                .uri(URI.createFileURI(new File("src/test/model/test.psm").getAbsolutePath())));
 *
 * </pre>
 *
 * More complex example, where model is loaded over an {@link URIHandler} in OSGi environment.
 * The BundleURIHandler using the given path inside the bundle to resolve URI.
 * <pre>
 *
 *    BundleURIHandler bundleURIHandler = new BundleURIHandler("urn", "", bundleContext.getBundle());
 *
 *    PsmModelResourceSupport psmModel = PsmModelResourceSupport.loadPsm(
 *            PsmModelResourceSupport.psmLoadArgumentsBuilder()
 *                 .uri(URI.createURI("urn:test.psm"))
 *                 .uriHandler(bundleURIHandler)
 *                 .build());
 * </pre>
 *
 * When we want to use {@link URI} as logical reference, so not use it for the resource loading,
 * the {@link File} or {@link InputStream} can be defined for load.
 * <pre>
 *
 *    PsmModelResourceSupport psmModel = PsmModelResourceSupport.loadPsm(
 *            PsmModelResourceSupport.psmLoadArgumentsBuilder()
 *                 .uri(URI.createURI("urn:test.psm"))
 *                 .file(new File("path_to_model"));
 * </pre>
 *
 *
 * Create an empty psm model and load from {@link InputStream}. In that case when save called on model the
 * file will be created on the given URI.
 * <pre>
 *    PsmModelResourceSupport psmModel = PsmModelResourceSupport.psmModelResourceSupportBuilder()
 *                 .uri(URI.createFileURI("test.model"))
 *                 .build();
 *
 *    psmModel.loadResource(PsmModelResourceSupport.psmLoadArgumentsBuilder()
 *                .inputStream(givenStream));
 *
 *    psmModel.save();
 * </pre>
 *
 */
public class PsmModelResourceSupport {

    private static Diagnostician diagnostician = new Diagnostician();

    private ResourceSet resourceSet;

    private URI uri;

    /**
     * Create {@link Stream} from {@link Iterator}.
     * @param sourceIterator the {@link Iterator} {@link Stream} made from
     * @param <T> the generic type
     * @return the {@link Stream} representation of {@link Iterator}
     */
    public <T> Stream<T> asStream(Iterator<T> sourceIterator) {
        return asStream(sourceIterator, false);
    }

    /**
     * Create {@link Stream} from {@link Iterator}.
     * @param sourceIterator the {@link Iterator} {@link Stream} made from
     * @param parallel parallel execution
     * @param <T> the generic type
     * @return the {@link Stream} representation of {@link Iterator}
     */
    @SuppressWarnings("WeakerAccess")
    public <T> Stream<T> asStream(Iterator<T> sourceIterator, boolean parallel) {
        Iterable<T> iterable = () -> sourceIterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }

    /**
     * Get all content of the {@link ResourceSet}
     * @param <T> the generic type
     * @return the {@link Stream} representation of {@link ResourceSet} contents
     */
    @SuppressWarnings("unchecked")
    public <T> Stream<T> all() {
        return asStream((Iterator<T>) resourceSet.getAllContents(), false);
    }

    /**
     * Get the given class from {@link ResourceSet}
     * @param clazz The {@link Class} which required
     * @param <T> the generic type
     * @return the {@link Stream} representation of {@link Class} type from {@link ResourceSet} contents
     */
    @SuppressWarnings({"WeakerAccess", "NullableProblems", "unchecked"})
    public <T> Stream<T> getStreamOf(final Class<T> clazz) {
        final Iterable<Notifier> contents = resourceSet::getAllContents;
        return StreamSupport.stream(contents.spliterator(), false)
                .filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e);
    }


    public Stream<hu.blackbelt.judo.meta.psm.PlaceHolder> getStreamOfPsmPlaceHolder() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.PlaceHolder.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.NamedElement> getStreamOfPsmNamespaceNamedElement() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.NamedElement.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.Namespace> getStreamOfPsmNamespaceNamespace() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.Namespace.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.Model> getStreamOfPsmNamespaceModel() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.Model.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.Package> getStreamOfPsmNamespacePackage() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.Package.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.NamespaceElement> getStreamOfPsmNamespaceNamespaceElement() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.NamespaceElement.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.Annotation> getStreamOfPsmNamespaceAnnotation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.Annotation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail> getStreamOfPsmNamespaceAnnotationDetail() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.Primitive> getStreamOfPsmTypePrimitive() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.Primitive.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.CustomType> getStreamOfPsmTypeCustomType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.CustomType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.StringType> getStreamOfPsmTypeStringType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.StringType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.NumericType> getStreamOfPsmTypeNumericType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.NumericType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.BooleanType> getStreamOfPsmTypeBooleanType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.BooleanType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.EnumerationType> getStreamOfPsmTypeEnumerationType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.EnumerationType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.EnumerationMember> getStreamOfPsmTypeEnumerationMember() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.EnumerationMember.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.Type> getStreamOfPsmTypeType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.Type.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.DataType> getStreamOfPsmTypeDataType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.DataType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.XMLType> getStreamOfPsmTypeXMLType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.XMLType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.Cardinality> getStreamOfPsmTypeCardinality() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.Cardinality.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.PasswordType> getStreamOfPsmTypePasswordType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.PasswordType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.DateType> getStreamOfPsmTypeDateType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.DateType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.TimestampType> getStreamOfPsmTypeTimestampType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.TimestampType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.FlatPrimitiveType> getStreamOfPsmTypeFlatPrimitiveType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.FlatPrimitiveType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.BinaryType> getStreamOfPsmTypeBinaryType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.BinaryType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.type.TimeType> getStreamOfPsmTypeTimeType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.type.TimeType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.EntityType> getStreamOfPsmDataEntityType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.EntityType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.Relation> getStreamOfPsmDataRelation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.Relation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.Attribute> getStreamOfPsmDataAttribute() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.Attribute.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.AssociationEnd> getStreamOfPsmDataAssociationEnd() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.AssociationEnd.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement> getStreamOfPsmDataReferenceTypedElement() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement> getStreamOfPsmDataPrimitiveTypedElement() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.Containment> getStreamOfPsmDataContainment() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.Containment.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.Sequence> getStreamOfPsmDataSequence() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.Sequence.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.EntitySequence> getStreamOfPsmDataEntitySequence() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.EntitySequence.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.NamespaceSequence> getStreamOfPsmDataNamespaceSequence() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.NamespaceSequence.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.BoundOperation> getStreamOfPsmDataBoundOperation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.BoundOperation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.data.OperationBody> getStreamOfPsmDataOperationBody() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.data.OperationBody.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint> getStreamOfPsmConstraintInvariantConstraint() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.DataProperty> getStreamOfPsmDerivedDataProperty() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.DataProperty.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.NavigationProperty> getStreamOfPsmDerivedNavigationProperty() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.NavigationProperty.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.StaticNavigation> getStreamOfPsmDerivedStaticNavigation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.StaticNavigation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor> getStreamOfPsmDerivedPrimitiveAccessor() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.StaticData> getStreamOfPsmDerivedStaticData() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.StaticData.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor> getStreamOfPsmDerivedReferenceAccessor() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.ExpressionType> getStreamOfPsmDerivedExpressionType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.ExpressionType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType> getStreamOfPsmDerivedReferenceExpressionType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType> getStreamOfPsmDerivedReferenceSelectorType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.DataExpressionType> getStreamOfPsmDerivedDataExpressionType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.DataExpressionType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType> getStreamOfPsmDerivedAttributeSelectorType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType> getStreamOfPsmDerivedLogicalExpressionType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.TransferObjectType> getStreamOfPsmServiceTransferObjectType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.TransferObjectType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> getStreamOfPsmServiceTransferObjectRelation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.TransferAttribute> getStreamOfPsmServiceTransferAttribute() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.TransferAttribute.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType> getStreamOfPsmServiceMappedTransferObjectType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.OperationDeclaration> getStreamOfPsmServiceOperationDeclaration() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.OperationDeclaration.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType> getStreamOfPsmServiceUnmappedTransferObjectType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.UnboundOperation> getStreamOfPsmServiceUnboundOperation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.UnboundOperation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.Parameter> getStreamOfPsmServiceParameter() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.Parameter.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.BoundTransferOperation> getStreamOfPsmServiceBoundTransferOperation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.BoundTransferOperation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.TransferOperation> getStreamOfPsmServiceTransferOperation() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.TransferOperation.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour> getStreamOfPsmServiceTransferOperationBehaviour() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType> getStreamOfPsmAccesspointAbstractActorType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType> getStreamOfPsmAccesspointMappedActorType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.accesspoint.ActorType> getStreamOfPsmAccesspointActorType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.accesspoint.ActorType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.measure.Measure> getStreamOfPsmMeasureMeasure() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.measure.Measure.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.measure.MeasuredType> getStreamOfPsmMeasureMeasuredType() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.measure.MeasuredType.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.measure.Unit> getStreamOfPsmMeasureUnit() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.measure.Unit.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm> getStreamOfPsmMeasureMeasureDefinitionTerm() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.measure.DurationUnit> getStreamOfPsmMeasureDurationUnit() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.measure.DurationUnit.class);
    }
    public Stream<hu.blackbelt.judo.meta.psm.measure.DerivedMeasure> getStreamOfPsmMeasureDerivedMeasure() {
        return getStreamOf(hu.blackbelt.judo.meta.psm.measure.DerivedMeasure.class);
    }

    /**
     * Set the relative {@link URI} to given {@link URI} and {@link ResourceSet}.
     * Means there is no baseUri the rootUri is used.
     * @param resourceSet {@link ResourceSet} is used
     * @param rootUri {{@link URI}} which us used as root
     */
    public static void setupRelativeUriRoot(ResourceSet resourceSet, URI rootUri) {
        EList<URIHandler> uriHandlers = resourceSet.getURIConverter().getURIHandlers();
        EList<ContentHandler> contentHandlers = resourceSet.getURIConverter().getContentHandlers();

        // Set custom URI handler where URL without base part replaced with the base URI
        resourceSet.setURIConverter(new ExtensibleURIConverterImpl() {
            @Override
            public URI normalize(URI uriPar) {

                String fragment = uriPar.fragment();
                String query = uriPar.query();
                URI trimmedURI = uriPar.trimFragment().trimQuery();
                URI result = getInternalURIMap().getURI(trimmedURI);
                String scheme = result.scheme();
                if (scheme == null) {
                    result = rootUri;
                }

                if (result == trimmedURI) {
                    return uriPar;
                }

                if (query != null) {
                    result = result.appendQuery(query);
                }
                if (fragment != null) {
                    result = result.appendFragment(fragment);
                }
                if (result == null) {
                    return uriPar;
                }
                return normalize(result);
            }
        });

        resourceSet.getURIConverter().getURIHandlers().clear();
        resourceSet.getURIConverter().getURIHandlers().addAll(uriHandlers);
        resourceSet.getURIConverter().getContentHandlers().clear();
        resourceSet.getURIConverter().getContentHandlers().addAll(contentHandlers);
    }

    /**
     * Set the relative {@link URI} to root {@link URI} in the {@link ResourceSet}.
     * Means there is no baseUri the rootUri is used.
     */
    public void setupRelativeUriRoot() {
        setupRelativeUriRoot(getResourceSet(), uri);
    }

    /**
     * Setup the given {@link URIHandler} as the first {@link URIHandler} in the {@link ResourceSet}
     * @param resourceSet {@link ResourceSet} which applied
     * @param uriHandler {@link URIHandler} which is set as primary
     */
    @SuppressWarnings("WeakerAccess")
    public static void setPrimaryUriHandler(ResourceSet resourceSet, URIHandler uriHandler) {
        resourceSet.getURIConverter().getURIHandlers().add(0, uriHandler);
    }


    /**
     * Create a {@link ResourceSet} and register all {@link Resource.Factory} belongs to Psm metamodel.
     * @return the created {@link ResourceSet}
     */
    public static ResourceSet createPsmResourceSet() {
        ResourceSet resourceSet = new ResourceSetImpl();
        registerPsmMetamodel(resourceSet);
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put(ResourceFactoryRegistryImpl.DEFAULT_EXTENSION, getPsmFactory());
        return resourceSet;
    }

    /**
     * Get sensibe default for model loading options.
     * @return Map of options
     */
    public static Map<Object, Object> getPsmModelDefaultLoadOptions() {
        Map<Object, Object> loadOptions = new HashMap<>();
        //loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        //loadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
        return loadOptions;
    }

    /**
     * Get sensibe default for model saving options.
     * @return Map of options
     */
    public static Map<Object, Object> getPsmModelDefaultSaveOptions() {
        Map<Object, Object> saveOptions = new HashMap<>();
        saveOptions.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
        saveOptions.put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl() {
            public URI deresolve(URI uri) {
                return uri.hasFragment()
                        && uri.hasOpaquePart()
                        && this.baseURI.hasOpaquePart()
                        && uri.opaquePart().equals(this.baseURI.opaquePart())
                            ? URI.createURI("#" + uri.fragment())
                            : super.deresolve(uri);
            }
        });
        saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_SKIP_ESCAPE_URI, Boolean.FALSE);
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
        return saveOptions;
    }

    /**
     * Create default {@link Resource.Factory} for the Psm model.
     * @return the created {@link Resource.Factory}
     */
    public static Resource.Factory getPsmFactory() {
        return new PsmResourceFactoryImpl() {
            @Override
            public Resource createResource(URI uri) {
                Resource result = new PsmResourceImpl(uri) {
                    @Override
                    protected boolean useUUIDs() {
                        return true;
                    }
                };
                return result;
            }
        };
    }

    /**
     * Register namespaces for Psm metamodel.
     * @param resourceSet Register Psm packages for the given {@link ResourceSet}
     */
    public static void registerPsmMetamodel(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put(PsmPackage.eINSTANCE.getNsURI(), PsmPackage.eINSTANCE);
    }

    // Builder specific code
    private static ResourceSet $default$resourceSet() {
        return createPsmResourceSet();
    }

    private static URIHandler $default$uriHandler() {
        return null;
    }

    private PsmModelResourceSupport(final ResourceSet resourceSet,
                                    final URIHandler uriHandler,
                                    final URI uri) {
        this.resourceSet = resourceSet;
        this.uri = uri;

        if (uri == null && resourceSet != null) {
            if (resourceSet.getResources().size() == 0) {
                throw new IllegalStateException("URI is not defined and the given ResourceSet is empty. "
                        + "At least one resource can be presented.");
            }
            this.uri = resourceSet.getResources().get(0).getURI();
        }

        if (uriHandler != null) {
            setPrimaryUriHandler(resourceSet, uriHandler);
        }
        setupRelativeUriRoot();

        // If resource does not exists, create resource
        if (getResourceSet().getResource(this.uri, false) == null) {
            getResourceSet().createResource(this.uri);
        }
    }

    /**
     * Builder for {@link PsmModelResourceSupport}
     */
    public static class PsmModelResourceSupportBuilder {
        private ResourceSet resourceSet;
        private URIHandler uriHandler;
        private URI uri;

        PsmModelResourceSupportBuilder() {
        }

        public PsmModelResourceSupportBuilder resourceSet(final ResourceSet resourceSet) {
            this.resourceSet = resourceSet;
            return this;
        }

        public PsmModelResourceSupportBuilder uriHandler(final URIHandler uriHandler) {
            this.uriHandler = uriHandler;
            return this;
        }

        public PsmModelResourceSupportBuilder uri(final URI uri) {
            this.uri = uri;
            return this;
        }

        public PsmModelResourceSupport build() {
            if (uri == null && resourceSet == null) {
                throw new NullPointerException("URI or ResourceSet have to be defined");
            }
            return new PsmModelResourceSupport(
                    resourceSet != null ? resourceSet : $default$resourceSet(),
                    uriHandler != null ? uriHandler : $default$uriHandler(),
                    uri);
        }

        @Override
        public java.lang.String toString() {
            return "PsmModelResourceSupportBuilder(resourceSet=" + this.resourceSet
                    + ", uriHandler=" + this.uriHandler
                    + ", uri=" + this.uri + ")";
        }
    }

    /**
     * Construct a {@link PsmModelResourceSupportBuilder} to build {@link PsmModelResourceSupport}.
     * @return instance of {@link PsmModelResourceSupportBuilder}
     */
    public static PsmModelResourceSupportBuilder psmModelResourceSupportBuilder() {
        return new PsmModelResourceSupportBuilder();
    }

    /**
     * Get the resourceSet this helper based on.
     * @return instance of {@link ResourceSet}
     */
    public ResourceSet getResourceSet() {
        return this.resourceSet;
    }

    /**
     * Get the model's root resource which represents the model's uri {@link URI} itself.
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
     * @return this {@link PsmModelResourceSupport}
     */
    @SuppressWarnings("UnusedReturnValue")
    public PsmModelResourceSupport addContent(EObject object) {
        getResource().getContents().add(object);
        return this;
    }

    /**
     * Load an model into {@link PsmModelResourceSupport} default {@link Resource}.
     * The {@link URI}, {@link URIHandler} and {@link ResourceSet} arguments are not used here, because it has
     * already set.
     * @param loadArgumentsBuilder {@link LoadArguments.LoadArgumentsBuilder} used for load.
     * @return this {@link PsmModelResourceSupport}
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public PsmModelResourceSupport loadResource(PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder
                                                        loadArgumentsBuilder)
            throws IOException, PsmValidationException {
        return loadResource(loadArgumentsBuilder.build());
    }

    /**
     * Load an model into {@link PsmModelResourceSupport} default {@link Resource}.
     * The {@link URI}, {@link URIHandler} and {@link ResourceSet} arguments are not used here, because it has
     * already set.
     * @param loadArguments {@link LoadArguments} used for load.
     * @return this {@link PsmModelResourceSupport}
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    @SuppressWarnings("WeakerAccess")
    public PsmModelResourceSupport loadResource(PsmModelResourceSupport.LoadArguments
                                                loadArguments)
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
            throw new PsmModelResourceSupport.PsmValidationException(this);
        }
        return this;
    }


    /**
     * Load an model. {@link PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder} contains all parameter
     * @param loadArgumentsBuilder {@link LoadArguments.LoadArgumentsBuilder} used for load.
     * @return created instance of {@link PsmModelResourceSupport}
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public static PsmModelResourceSupport loadPsm(PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder
                                                          loadArgumentsBuilder)
            throws IOException, PsmModelResourceSupport.PsmValidationException {
        return loadPsm(loadArgumentsBuilder.build());
    }

    /**
     * Load an model. {@link PsmModelResourceSupport.LoadArguments} contains all parameter
     * @param loadArguments {@link LoadArguments} used for load.
     * @return created instance of {@link PsmModelResourceSupport}
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public static PsmModelResourceSupport loadPsm(PsmModelResourceSupport.LoadArguments loadArguments)
            throws IOException, PsmModelResourceSupport.PsmValidationException {

        PsmModelResourceSupport psmModelResourceSupport = psmModelResourceSupportBuilder()
                        .resourceSet(loadArguments.getResourceSet()
                                .orElseGet(PsmModelResourceSupport::createPsmResourceSet))
                        .uri(loadArguments.getUri()
                                .orElseThrow(() -> new IllegalArgumentException("URI must be set")))
                        .uriHandler(loadArguments.getUriHandler()
                                .orElse(null))
                        .build();

        psmModelResourceSupport.loadResource(loadArguments);
        if (loadArguments.isValidateModel() && !psmModelResourceSupport.isValid()) {
            throw new PsmModelResourceSupport.PsmValidationException(psmModelResourceSupport);
        }
        return psmModelResourceSupport;
    }

    /**
     * Save the model to the given URI.
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public void savePsm() throws IOException, PsmModelResourceSupport.PsmValidationException {
        savePsm(PsmModelResourceSupport.SaveArguments.psmSaveArgumentsBuilder());
    }

    /**
     * Save the model as the given {@link SaveArguments.SaveArgumentsBuilder} defines
     * @param saveArgumentsBuilder {@link SaveArguments.SaveArgumentsBuilder} used for save
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    public void savePsm(PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder saveArgumentsBuilder)
            throws IOException, PsmModelResourceSupport.PsmValidationException {
        savePsm(saveArgumentsBuilder.build());
    }

    /**
     * Save the model as the given {@link PsmModelResourceSupport.SaveArguments} defines
     * @param saveArguments {@link SaveArguments} used for save
     * @throws IOException when IO error occured
     * @throws PsmValidationException when model validation is true and the model is invalid.
     */
    @SuppressWarnings("WeakerAccess")
    public void savePsm(PsmModelResourceSupport.SaveArguments saveArguments)
            throws IOException, PsmModelResourceSupport.PsmValidationException {
        if (saveArguments.isValidateModel() && !isValid()) {
            throw new PsmModelResourceSupport.PsmValidationException(this);
        }
        Map saveOptions = saveArguments.getSaveOptions()
                .orElseGet(PsmModelResourceSupport::getPsmModelDefaultSaveOptions);
        try {
            OutputStream outputStream = saveArguments.getOutputStream()
                    .orElseGet(() -> saveArguments.getFile().map(f -> {
                        try {
                            return new FileOutputStream(f);
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }).orElse(null));
            if (outputStream != null) {
                getResource().save(outputStream, saveOptions);
            } else {
                getResource().save(saveOptions);
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw (IOException) e.getCause();
            } else {
                throw e;
            }
        }
    }

    private Diagnostic getDiagnostic(EObject eObject) {
        // TODO: The hack is called here
        fixEcoreUri();
        BasicDiagnostic diagnostics = new BasicDiagnostic
                (EObjectValidator.DIAGNOSTIC_SOURCE,
                        0,
                        String.format("Diagnosis of %s\n", diagnostician.getObjectLabel(eObject)),
                        new Object [] { eObject });

        diagnostician.validate(eObject, diagnostics, diagnostician.createDefaultContext());
        return diagnostics;
    }

    private static <T> Predicate<T> distinctByKey(
            Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    /**
     * Get distinct diagnostics for model. Only  {@link Diagnostic}.WARN and {@link Diagnostic}.ERROR are returns.
     * @return set of {@link Diagnostic}
     */
    public Set<Diagnostic> getDiagnostics() {
        return all()
                .filter(EObject.class :: isInstance)
                .map(EObject.class :: cast)
                .map(this :: getDiagnostic)
                .filter(d -> d.getSeverity() > Diagnostic.INFO)
                .filter(d -> d.getChildren().size() > 0)
                .flatMap(d -> d.getChildren().stream())
                .filter(distinctByKey(Object::toString))
                .collect(Collectors.toSet());
    }

    /**
     * Checks the model have any {@link Diagnostic}.ERROR diagnostics. When there is no any the model assumed as valid.
     * @return true when model is valid
     */
    public boolean isValid() {
        Set<Diagnostic> diagnostics = getDiagnostics();
        return diagnostics.stream().noneMatch(e -> e.getSeverity() >= Diagnostic.ERROR);
    }

    /**
     * Print model as string
     * @return model as XML string
     */
    public String asString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            // Do not call save on model to bypass the validation
            getResource().save(byteArrayOutputStream, Collections.EMPTY_MAP);
        } catch (IOException ignored) {
        }
        return new String(byteArrayOutputStream.toByteArray(), Charset.defaultCharset());
    }

    /**
     * Get diagnostics as a String
     * @return diagnostic list as string. Every line represents one diagnostic.
     */
    public String getDiagnosticsAsString() {
        return getDiagnostics().stream().map(Object::toString).collect(Collectors.joining("\n"));
    }

    /**
     * Arguments for {@link PsmModelResourceSupport#loadPsm(PsmModelResourceSupport.LoadArguments)}
     * It can handle variance of the presented arguments.
     */
    public static class LoadArguments {
        private URI uri;
        private URIHandler uriHandler;
        private ResourceSet resourceSet;
        private Map<Object, Object> loadOptions;
        private boolean validateModel;
        private InputStream inputStream;
        private File file;

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

        Optional<InputStream> getInputStream() {
            return ofNullable(inputStream);
        }

        Optional<File> getFile() {
            return ofNullable(file);
        }



        @java.lang.SuppressWarnings("all")
        /**
         * Builder for {@link PsmModelResourceSupport#loadPsmModel(PsmModelResourceSupport.LoadArguments)}.
         */
        public static class LoadArgumentsBuilder {
            private URI uri;
            private boolean validateModel = true;

            private boolean uriHandler$set;
            private URIHandler uriHandler;

            private boolean resourceSet$set;
            private ResourceSet resourceSet;

            private boolean loadOptions$set;
            private Map<Object, Object> loadOptions;

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
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder uri(final URI uri) {
                requireNonNull(uri);
                this.uri = uri;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            /**
             * Defines the {@link URIHandler} used for model IO. If not defined the default is EMF used.
             */
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder uriHandler(
                    final URIHandler uriHandler) {
                requireNonNull(uriHandler);
                this.uriHandler = uriHandler;
                uriHandler$set = true;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            /**
             * Defines the default {@link ResourceSet}. If it is not defined the factory based resourceSet is used.
             */
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder resourceSet(
                    final ResourceSet resourceSet) {
                requireNonNull(resourceSet);
                this.resourceSet = resourceSet;
                resourceSet$set = true;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            /**
             * Defines the load options for model. If not defined the
             * {@link PsmModelResourceSupport#getPsmModelDefaultLoadOptions()} us used.
             */
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder loadOptions(
                    final Map<Object, Object> loadOptions) {
                requireNonNull(loadOptions);
                this.loadOptions = loadOptions;
                loadOptions$set = true;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            /**
             * Defines that model validation required or not on load. Default: true
             */
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder validateModel(boolean validateModel) {
                this.validateModel = validateModel;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            /**
             * Defines the file if it is not loaded from URI. If not defined, URI is used. If inputStream is defined
             * it is used.
             */
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder file(final File file) {
                requireNonNull(file);
                this.file = file;
                file$set = true;
                return this;
            }

            @java.lang.SuppressWarnings("all")
            /**
             * Defines the file if it is not loaded from  File or URI. If not defined, File or URI is used.
             */
            public PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder inputStream(
                    final InputStream inputStream) {
                requireNonNull(inputStream);
                this.inputStream = inputStream;
                inputStream$set = true;
                return this;
            }


            public PsmModelResourceSupport.LoadArguments build() {
                URIHandler uriHandler = this.uriHandler;
                if (!uriHandler$set) uriHandler = PsmModelResourceSupport.LoadArguments.$default$uriHandler();
                ResourceSet resourceSet = this.resourceSet;
                if (!resourceSet$set) resourceSet = PsmModelResourceSupport.LoadArguments.$default$resourceSet();
                Map<Object, Object> loadOptions = this.loadOptions;
                if (!loadOptions$set) loadOptions = PsmModelResourceSupport.LoadArguments.$default$loadOptions();
                File file = this.file;
                if (!file$set) file = PsmModelResourceSupport.LoadArguments.$default$file();
                InputStream inputStream = this.inputStream;
                if (!inputStream$set) inputStream = PsmModelResourceSupport.LoadArguments.$default$inputStream();

                return new PsmModelResourceSupport.LoadArguments(uri, uriHandler, resourceSet,
                        loadOptions, validateModel, file, inputStream);
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder(uri=" + this.uri
                        + ", uri=" + this.uri
                        + ", uriHandler=" + this.uriHandler
                        + ", resourceSet=" + this.resourceSet
                        + ", loadOptions=" + this.loadOptions
                        + ", validateModel=" + this.validateModel
                        + ", file=" + this.file
                        + ", inputStream=" + this.inputStream
                        + ")";
            }
        }

        public static PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder psmLoadArgumentsBuilder() {
            return new PsmModelResourceSupport.LoadArguments.LoadArgumentsBuilder();
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
    }

    /**
     * Arguments for {@link PsmModelResourceSupport#savePsm(PsmModelResourceSupport.SaveArguments)}
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

        Optional<OutputStream> getOutputStream() {
            return ofNullable(outputStream);
        }

        Optional<File> getFile() {
            return ofNullable(file);
        }

        Optional<Map<Object, Object>> getSaveOptions() {
            return ofNullable(saveOptions);
        }

        boolean isValidateModel() {
            return validateModel;
        }

        @java.lang.SuppressWarnings("all")
        /**
         * Builder for {@link PsmModelResourceSupport#savePsmModel(PsmModelResourceSupport.SaveArguments)}.
         */
        public static class SaveArgumentsBuilder {
            private boolean outputStream$set;
            private OutputStream outputStream;

            private boolean file$set;
            private File file;

            private boolean saveOptions$set;
            private Map<Object, Object> saveOptions;

            private boolean validateModel = true;

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

            SaveArgumentsBuilder() {
            }

            /**
             * Defines {@link OutputStream} which is used by save. Whe it is not defined, file is used.
             */
            public PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder outputStream(
                    final OutputStream outputStream) {
                requireNonNull(outputStream);
                this.outputStream = outputStream;
                outputStream$set = true;
                return this;
            }

            /**
             * Defines {@link File} which is used by save. Whe it is not defined the model's
             * {@link PsmModelResourceSupport#uri is used}
             */
            public PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder file(File file) {
                requireNonNull(file);
                this.file = file;
                file$set = true;
                return this;
            }

            /**
             * Defines save options. When it is not defined
             * {@link PsmModelResourceSupport#getPsmModelDefaultSaveOptions()} is used.
             * @param saveOptions
             * @return
             */
            public PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder saveOptions(
                    final Map<Object, Object> saveOptions) {
                requireNonNull(saveOptions);
                this.saveOptions = saveOptions;
                saveOptions$set = true;
                return this;
            }

            /**
             * Defines that model validation required or not on save. Default: true
             */
            public PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder validateModel(boolean validateModel) {
                this.validateModel = validateModel;
                return this;
            }

            public PsmModelResourceSupport.SaveArguments build() {
                OutputStream outputStream = this.outputStream;
                if (!outputStream$set) outputStream = PsmModelResourceSupport.SaveArguments.$default$outputStream();
                File file = this.file;
                if (!file$set) file = PsmModelResourceSupport.SaveArguments.$default$file();
                Map<Object, Object> saveOptions = this.saveOptions;
                if (!saveOptions$set) saveOptions = PsmModelResourceSupport.SaveArguments.$default$saveOptions();
                return new PsmModelResourceSupport.SaveArguments(outputStream, file, saveOptions, validateModel);
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder(outputStream=" + this.outputStream
                        + ", file=" + this.file
                        + ", saveOptions=" + this.saveOptions + ")";
            }
        }

        public static PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder psmSaveArgumentsBuilder() {
            return new PsmModelResourceSupport.SaveArguments.SaveArgumentsBuilder();
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

    /**
     * This exception is thrown when validateModel is true on load or save and the model is not conform with its
     * defined metamodel.
     */
    public static class PsmValidationException extends Exception {
        PsmModelResourceSupport psmModelResourceSupport;

        PsmValidationException(PsmModelResourceSupport psmModelResourceSupport) {
            super("Invalid model\n" + psmModelResourceSupport.getDiagnosticsAsString());
            this.psmModelResourceSupport = psmModelResourceSupport;
        }

        PsmModelResourceSupport getPsmModelResourceSupport() {
            return psmModelResourceSupport;
        }
    }

    // TODO: Create ticket on Eclipse. The problem is that the DelegatingResourceLocator
    // creating a baseURL which ends with two trailing slash and the ResourceBundle cannot open the files.
    // This bug is came on Felix based OSGi container.
    private static void fixEcoreUri() {
        try {
            URL baseUrl = EcorePlugin.INSTANCE.getBaseURL();
            if (baseUrl.toString().startsWith("bundle:") && baseUrl.toString().endsWith("//")) {
                URL fixedUrl = new URL(baseUrl.toString().substring(0, baseUrl.toString().length() - 1));
                Field myField = getField(DelegatingResourceLocator.class, "baseURL");
                myField.setAccessible(true);
                myField.set(EcorePlugin.INSTANCE, fixedUrl);
            }
        } catch (Throwable t) {
            t.printStackTrace(System.out);
        }

    }

    private static Field getField(Class clazz, String fieldName)
            throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw e;
            } else {
                return getField(superClass, fieldName);
            }
        }
    }
}
