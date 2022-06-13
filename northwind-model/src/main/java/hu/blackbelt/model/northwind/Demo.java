package hu.blackbelt.model.northwind;

import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.ScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.model.northwind.entities.Category;
import hu.blackbelt.model.northwind.entities.Product;
import hu.blackbelt.model.northwind.entities.*;
import hu.blackbelt.model.northwind.extension.services.GetRangeInputProductInfoCategory;
import hu.blackbelt.model.northwind.measures.Time;
import hu.blackbelt.model.northwind.measures.*;
import hu.blackbelt.model.northwind.services.*;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Float;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.Long;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.*;
import hu.blackbelt.model.northwind.types.measured.*;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.calculatePsmValidationScriptURI;
import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.validatePsm;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.SaveArguments.psmSaveArgumentsBuilder;

@Slf4j
public class Demo {
    public Model $ = newModelBuilder().build();

    private Entities entities = new Entities();
    private Measures measures = new Measures();
    private Types types = new Types();
    private Services services = new Services();
    private Measured measured = new Measured();
    private Optional optional = new Optional();
    private hu.blackbelt.model.northwind.optional.Services optionalServices = new hu.blackbelt.model.northwind.optional.Services();
    private Extension extension = new Extension();
    private hu.blackbelt.model.northwind.extension.Services extensionServices = new hu.blackbelt.model.northwind.extension.Services();
    
    private Address address = new Address();
    private Category category = new Category();
    private City city = new City();
    private Company company = new Company();
    private Customer customer = new Customer();
    private Employee employee = new Employee();
    private Induvidual induvidual = new Induvidual();
    private InternationalAddress internationalAddress = new InternationalAddress();
    private InternationalOrder internationalOrder = new InternationalOrder();
    private MailingList mailingList = new MailingList();
    private OnlineInternationalOrder onlineInternationalOrder = new OnlineInternationalOrder();
    private OnlineOrder onlineOrder = new OnlineOrder();
    private Order order = new Order();
    private OrderDetail orderDetail = new OrderDetail();
    private PaymentList paymentList = new PaymentList();
    private Person person = new Person();
    private Product product = new Product();
    private Region region = new Region();
    private Shipper shipper = new Shipper();
    private Store store = new Store();
    private Supplier supplier = new Supplier();
    private Territory territory = new Territory();
    private Acceleration acceleration = new Acceleration();
    private AmountOfSubstance amountOfSubstance = new AmountOfSubstance();
    private Area area = new Area();
    private Capacitance capacitance = new Capacitance();
    private Density density = new Density();
    private ElectricalConductance electricalConductance = new ElectricalConductance();
    private ElectricalResistance electricalResistance = new ElectricalResistance();
    private ElectricCharge electricCharge = new ElectricCharge();
    private ElectricCurrent electricCurrent = new ElectricCurrent();
    private ElectricPotential electricPotential = new ElectricPotential();
    private Force force = new Force();
    private Frequency frequency = new Frequency();
    private Illuminance illuminance = new Illuminance();
    private Inductance inductance = new Inductance();
    private Length length = new Length();
    private LuminousIntensity luminousIntensity = new LuminousIntensity();
    private MagneticFlux magneticFlux = new MagneticFlux();
    private MagneticFluxDensity magneticFluxDensity = new MagneticFluxDensity();
    private Mass mass = new Mass();
    private Momentum momentum = new Momentum();
    private MonthBasedTime monthBasedTime = new MonthBasedTime();
    private Power power = new Power();
    private Pressure pressure = new Pressure();
    private Temperature temperature = new Temperature();
    private ThermodynamicTemperature thermodynamicTemperature = new ThermodynamicTemperature();
    private Time time = new Time();
    private Velocity velocity = new Velocity();
    private Volume volume = new Volume();
    private Work work = new Work();
    private hu.blackbelt.model.northwind.services.Category category_ = new hu.blackbelt.model.northwind.services.Category();
    private CategoryInfo categoryInfo = new CategoryInfo();
    private Comment comment = new Comment();
    private TerritoryInfo territoryInfo = new TerritoryInfo();
    private InternationalOrderInfo internationalOrderInfo = new InternationalOrderInfo();
    private OrderInfo orderInfo = new OrderInfo();
    private OrderItem orderItem = new OrderItem();
    private hu.blackbelt.model.northwind.services.Product product_ = new hu.blackbelt.model.northwind.services.Product();
    private ProductInfo productInfo = new ProductInfo();
    private GetRangeInputProductInfoCategory getRangeInputProductInfoCategory = new GetRangeInputProductInfoCategory();
    private hu.blackbelt.model.northwind.optional.services.ProductInfo optionaProductInfo = new hu.blackbelt.model.northwind.optional.services.ProductInfo();
    private ShipmentChange shipmentChange = new ShipmentChange();
    private ShipperInfo shipperInfo = new ShipperInfo();
    private AreaStoredInSquareMetre areaStoredInSquareMetre = new AreaStoredInSquareMetre();
    private Photo photo = new Photo();
    private Boolean boolean_ = new Boolean();
    private Countries countries = new Countries();
    private Date date = new Date();
    private Double double_ = new Double();
    private Email email = new Email();
    private Float float_ = new Float();
    private Gps gps = new Gps();
    private Integer integer = new Integer();
    private Long long_ = new Long();
    private MassStoredInKilograms massStoredInKilograms = new MassStoredInKilograms();
    private MassStoredInGrams massStoredInGrams = new MassStoredInGrams();
    private Phone phone = new Phone();
    private Priority priority = new Priority();
    private String string = new String();
    private Text text = new Text();
    private TimeStamp timeStamp = new TimeStamp();
    private hu.blackbelt.model.northwind.types.Time timetype = new hu.blackbelt.model.northwind.types.Time();
    private TimeStoredInMonths timeStoredInMonths = new TimeStoredInMonths();
    private TimeStoredInSeconds timeStoredInSeconds = new TimeStoredInSeconds();
    private Titles titles = new Titles();
    private Url url = new Url();
    private VelocityStoredInKmPerHour velocityStoredInKmPerHour = new VelocityStoredInKmPerHour();
    private VolumeStoredInLitre volumeStoredInLitre = new VolumeStoredInLitre();
    private InternalAP internalAP = new InternalAP();
    private InternalUser internalUser = new InternalUser();
    private ExternalAP externalAP = new ExternalAP();
    private ExternalUser externalUser = new ExternalUser();
    private AllCategories allCategories = new AllCategories();
    private AllInternationalOrders allInternationalOrders = new AllInternationalOrders();
    private AllProducts allProducts = new AllProducts();
    private AllShippers allShippers = new AllShippers();
    private OrderAssignedToEmployee orderAssignedToEmployee = new OrderAssignedToEmployee();
    private OrdersOfLastTwoWeeks ordersOfLastTwoWeeks = new OrdersOfLastTwoWeeks();
    private TotalNumberOfOrders totalNumberOfOrders = new TotalNumberOfOrders();

    private PsmModel createPsmModel() {
        java.lang.String createdSourceModelName = "urn:psm.judo-meta-psm";
        PsmModel psmModel = PsmModel.buildPsmModel()
                .uri(org.eclipse.emf.common.util.URI.createURI(createdSourceModelName))
                .name("demo")
                .build();
        return psmModel;
    }

    public PsmModel fullDemo() {
        // Model
        useModel($).withName("demo").build();

        // Packages
        measures.init($);
        entities.init($);
        types.init($);
        services.init($);
        measured.init(types.$);
        optional.init($);
        optionalServices.init(optional.$);
        extension.init($);
        extensionServices.init(extension.$);

        // measures
        acceleration.init(measures.$, velocity, time);
        amountOfSubstance.init(measures.$);
        area.init(measures.$, length);
        capacitance.init(measures.$, work, electricPotential);
        density.init(measures.$, mass, volume);
        electricalConductance.init(measures.$, electricalResistance);
        electricalResistance.init(measures.$, electricPotential, electricCurrent);
        electricCharge.init(measures.$, electricCurrent, time);
        electricCurrent.init(measures.$);
        electricPotential.init(measures.$, work, electricCharge);
        force.init(measures.$, mass, acceleration);
        frequency.init(measures.$, time);
        illuminance.init(measures.$, luminousIntensity, area);
        inductance.init(measures.$, magneticFlux, electricCurrent);
        length.init(measures.$);
        luminousIntensity.init(measures.$);
        magneticFlux.init(measures.$, electricPotential, time);
        magneticFluxDensity.init(measures.$, magneticFlux, area);
        mass.init(measures.$);
        momentum.init(measures.$, mass, velocity);
        monthBasedTime.init(measures.$);
        power.init(measures.$, work, time);
        pressure.init(measures.$, force, area);
        temperature.init(measures.$);
        thermodynamicTemperature.init(measures.$);
        time.init(measures.$);
        velocity.init(measures.$, length, time);
        volume.init(measures.$, length);
        work.init(measures.$, force, length);

        // types
        photo.init(types.$);
        boolean_.init(types.$);
        countries.init(types.$);
        date.init(types.$);
        double_.init(types.$);
        email.init(types.$);
        float_.init(types.$);
        gps.init(types.$);
        integer.init(types.$);
        long_.init(types.$);
        phone.init(types.$);
        priority.init(types.$);
        string.init(types.$);
        text.init(types.$);
        timeStamp.init(types.$);
        timetype.init(types.$);
        titles.init(types.$);
        url.init(types.$);

        areaStoredInSquareMetre.init(measured.$, area);
        massStoredInKilograms.init(measured.$, mass);
        massStoredInGrams.init(measured.$, mass);
        timeStoredInMonths.init(measured.$, monthBasedTime);
        timeStoredInSeconds.init(measured.$, time);
        velocityStoredInKmPerHour.init(measured.$, velocity);
        volumeStoredInLitre.init(measured.$, volume);

        // entities
        address.init(entities.$, string, city, text);
        category.init(entities.$, string, text, photo, product, employee, category_, product_, categoryInfo, productInfo);
        city.init(entities.$, string);
        company.init(entities.$, string, phone, customer, product, gps);
        customer.init(entities.$, order, address);
        employee.init(entities.$, string, date, phone, photo, text, person, order,
                address, territory, category);
        induvidual.init(entities.$, phone, person, customer);
        internationalAddress.init(entities.$, countries, address);
        internationalOrder.init(entities.$, string, double_, order, internationalOrderInfo);
        mailingList.init(entities.$, person);
        onlineInternationalOrder.init(entities.$, string, internationalOrder, onlineOrder);
        onlineOrder.init(entities.$, url, order);
        order.init(entities.$, string, timeStamp, double_, boolean_, integer, gps, priority, massStoredInGrams,
                customer, shipper, employee, internationalAddress, orderDetail, category, territory, orderInfo, orderItem, categoryInfo, timetype);
        orderDetail.init(entities.$, string, double_, integer, boolean_, massStoredInGrams, product, category, orderItem, productInfo);
        paymentList.init(entities.$, employee);
        person.init(entities.$, string, titles);
        product.init(entities.$, string, integer, double_, boolean_, massStoredInKilograms, category, supplier,
                company, store, product_, category_, productInfo, categoryInfo);
        region.init(entities.$, string, territory);
        shipper.init(entities.$, company, order, territory);
        store.init(entities.$, product);
        supplier.init(entities.$, url, company, product);
        territory.init(entities.$, string, employee, region, shipper);

        // Unmapped transfer object type
        shipmentChange.init(services.$, string, timeStamp);
        comment.init(services.$, string, text, timeStamp);
        getRangeInputProductInfoCategory.init(extensionServices.$, optionaProductInfo);
        
        // Mapped transfer objects
        category_.init(services.$, string, category, product_);
        categoryInfo.init(services.$, string, category, productInfo, allProducts);
        shipperInfo.init(services.$, string, shipper, company, gps);
        product_.init(services.$, string, double_, massStoredInKilograms, product, category_, allCategories);
        optionaProductInfo.init(optionalServices.$, string, integer, double_, boolean_, massStoredInKilograms, product, categoryInfo, allCategories);
        
        productInfo.init(services.$, string, integer, double_, boolean_, massStoredInKilograms, product, categoryInfo, allCategories, getRangeInputProductInfoCategory);
        optionaProductInfo.$.setOverride(productInfo.$);
        territoryInfo.init(services.$, string, territory);
        orderItem.init(services.$, string, integer, double_, boolean_, massStoredInGrams, orderDetail, productInfo, categoryInfo, allProducts, allCategories, orderItem);
        orderInfo.init(services.$, string, timeStamp, priority, boolean_, gps, integer, double_, massStoredInGrams, order, orderItem, shipperInfo, categoryInfo, shipmentChange, comment, timetype);
        internationalOrderInfo.init(services.$, string, double_, internationalOrder, orderInfo, timeStamp, priority, boolean_, gps, integer, massStoredInGrams, order, orderItem, shipperInfo, categoryInfo, shipmentChange, comment);

        // Static Navigation
        allCategories.init(services.$, category);
        allInternationalOrders.init(services.$, internationalOrder);
        allProducts.init(services.$, product);
        allShippers.init(services.$, shipper);
        orderAssignedToEmployee.init(services.$, order);
        ordersOfLastTwoWeeks.init(services.$, order);

        // Static Data
        totalNumberOfOrders.init(services.$, integer);

        // Access Points
        internalAP.init($, string);
        externalAP.init($, string);

        internalUser.init($, internalAP, internationalOrderInfo, shipperInfo, orderInfo, ordersOfLastTwoWeeks);
        externalUser.init($, externalAP, productInfo, categoryInfo);

        PsmModel psmModel = createPsmModel();
        psmModel.addContent($);
        return psmModel;
    }

    public static void main(java.lang.String[] args) throws Exception {
        Demo demo = new Demo();
        PsmModel psmModel = demo.fullDemo();

        System.out.println(psmModel.getDiagnosticsAsString());

        if (args.length > 0) {
            File file = new File(args[0]);
            file.getParentFile().mkdirs();

            try {
                psmModel.savePsmModel(psmSaveArgumentsBuilder().file(file).build());
            } catch (PsmModel.PsmValidationException e) {
                System.err.println(e.toString());
            }
        } else {

            System.out.println(psmModel.asString());
            try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
                validatePsm(bufferedLog, psmModel, calculatePsmValidationScriptURI());
            } catch (ScriptExecutionException e) {
                System.err.println(e.toString());
            }
        }
    }


}
