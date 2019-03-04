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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import java.util.Dictionary;
import java.util.Hashtable;

@Component(immediate = true, service = PsmMetaModel.class)
public class PsmMetaModelRegistration implements PsmMetaModel {

    ServiceRegistration<Resource.Factory> psmFactoryRegistration;
    Resource.Factory factory = new PsmResourceFactoryImpl();

    @Activate
    public void activate(ComponentContext componentContext) {
        Dictionary<String, Object> params = new Hashtable<>();
        params.put("meta", "psm");
        params.put("version", componentContext.getBundleContext().getBundle().getVersion());
        params.put("bundle", componentContext.getBundleContext().getBundle());

        psmFactoryRegistration = componentContext.getBundleContext()
                .registerService(Resource.Factory.class, factory, params);
    }

    @Deactivate
    public void deactivate() {
        psmFactoryRegistration.unregister();
    }

    @Override
    public Resource.Factory getFactory() {
        return factory;
    }

    @Override
    public void registerPsmMetamodel(ResourceSet resourceSet) {

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
}
