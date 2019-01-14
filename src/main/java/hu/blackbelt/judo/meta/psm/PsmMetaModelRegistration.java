package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.action.ActionPackage;
import hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;
import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.util.PsmResourceFactoryImpl;
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
    Resource.Factory factory;

    @Activate
    public void activate(ComponentContext componentContext) {
        Dictionary<String, Object> params = new Hashtable<>();
        params.put("meta", "psm");
        params.put("version", componentContext.getBundleContext().getBundle().getVersion());
        params.put("bundle", componentContext.getBundleContext().getBundle());

        factory = new PsmResourceFactoryImpl();
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
        resourceSet.getPackageRegistry().put(TypePackage.eINSTANCE.getNsURI(), TypePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(NamespacePackage.eINSTANCE.getNsURI(), NamespacePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(DataPackage.eINSTANCE.getNsURI(), DataPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(FacadePackage.eINSTANCE.getNsURI(), FacadePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(BehaviorPackage.eINSTANCE.getNsURI(), BehaviorPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ActionPackage.eINSTANCE.getNsURI(), ActionPackage.eINSTANCE);
    }
}
