package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;
import hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage;
import hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage;
import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.expression.collection.CollectionPackage;
import hu.blackbelt.judo.meta.expression.constant.ConstantPackage;
import hu.blackbelt.judo.meta.expression.custom.CustomPackage;
import hu.blackbelt.judo.meta.expression.enumeration.EnumerationPackage;
import hu.blackbelt.judo.meta.expression.logical.LogicalPackage;
import hu.blackbelt.judo.meta.expression.numeric.NumericPackage;
import hu.blackbelt.judo.meta.expression.object.ObjectPackage;
import hu.blackbelt.judo.meta.expression.operator.OperatorPackage;
import hu.blackbelt.judo.meta.expression.string.StringPackage;
import hu.blackbelt.judo.meta.expression.variable.VariablePackage;
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

        //             NamespaceFactory theNamespaceFactory = (NamespaceFactory)EPackage.Registry.INSTANCE.getEFactory(NamespacePackage.eNS_URI);
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

        // External metamodel - expression package
        resourceSet.getPackageRegistry().put(ExpressionPackage.eINSTANCE.getNsURI(), ExpressionPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(CollectionPackage.eINSTANCE.getNsURI(), CollectionPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ConstantPackage.eINSTANCE.getNsURI(), ConstantPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(CustomPackage.eINSTANCE.getNsURI(), CustomPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(EnumerationPackage.eINSTANCE.getNsURI(), EnumerationPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(LogicalPackage.eINSTANCE.getNsURI(), LogicalPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(NumericPackage.eINSTANCE.getNsURI(), NumericPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ObjectPackage.eINSTANCE.getNsURI(), ObjectPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(OperatorPackage.eINSTANCE.getNsURI(), OperatorPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(StringPackage.eINSTANCE.getNsURI(), StringPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(VariablePackage.eINSTANCE.getNsURI(), VariablePackage.eINSTANCE);

    }
}
