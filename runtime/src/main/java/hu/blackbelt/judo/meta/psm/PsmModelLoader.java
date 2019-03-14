package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;
import hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage;
import hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage;
import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;
import hu.blackbelt.judo.meta.psm.script.ScriptPackage;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.util.PsmResourceFactoryImpl;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PsmModelLoader {

    public static void registerPsmMetamodel(ResourceSet resourceSet) {
        resourceSet.getPackageRegistry().put(AccesspointPackage.eINSTANCE.getNsURI(), AccesspointPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(AuthenticationPackage.eINSTANCE.getNsURI(), AuthenticationPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(AuthorizationPackage.eINSTANCE.getNsURI(), AuthorizationPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ConstraintPackage.eINSTANCE.getNsURI(), ConstraintPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DataPackage.eINSTANCE.getNsURI(), DataPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DerivedPackage.eINSTANCE.getNsURI(), DerivedPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(NamespacePackage.eINSTANCE.getNsURI(), NamespacePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ScriptPackage.eINSTANCE.getNsURI(), ScriptPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ServicePackage.eINSTANCE.getNsURI(), ServicePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(TypePackage.eINSTANCE.getNsURI(), TypePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ViewPackage.eINSTANCE.getNsURI(), ViewPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(MeasurePackage.eINSTANCE.getNsURI(), MeasurePackage.eINSTANCE);
    }


    public static Resource.Factory getFactory() {
        return new PsmResourceFactoryImpl();
    }

    public static ResourceSet createPsmResourceSet() {
        ResourceSet resourceSet = new ResourceSetImpl();
        registerPsmMetamodel(resourceSet);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ResourceFactoryRegistryImpl.DEFAULT_EXTENSION, getFactory());
        return resourceSet;
    }


    public static PsmModel loadPsmModel(URI uri, String name, String version) throws IOException {
        return loadPsmModel(createPsmResourceSet(), uri, name, version, null, null);
    }

    public static PsmModel loadPsmModel(ResourceSet resourceSet, URI uri, String name, String version) throws IOException {
        return loadPsmModel(resourceSet, uri, name, version, null, null);
    }

    public static PsmModel loadPsmModel(ResourceSet resourceSet, URI uri, String name, String version, String checksum, String acceptedMetaVersionRange) throws IOException {
        registerPsmMetamodel(resourceSet);
        Resource resource = resourceSet.createResource(uri);
        Map<Object, Object> loadOptions = new HashMap<>();
        //loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        //loadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);
        loadOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
        resource.load(loadOptions);

        PsmModel.PsmModelBuilder b = PsmModel.buildPsmModel();

        b.name(name)
                .version(version)
                .uri(uri)
                .checksum(checksum)
                .resource(resource);

        if (checksum != null) {
            b.checksum(checksum);
        }

        if (acceptedMetaVersionRange != null)  {
            b.metaVersionRange(acceptedMetaVersionRange);
        }
        return b.build();
    }

}
