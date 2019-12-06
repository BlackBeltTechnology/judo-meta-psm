package hu.blackbelt.model.northwind;

import hu.blackbelt.epsilon.runtime.execution.exceptions.ScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.StringBuilderLogger;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.model.northwind.entities.Address;
import hu.blackbelt.model.northwind.entities.Category;
import hu.blackbelt.model.northwind.entities.City;
import hu.blackbelt.model.northwind.entities.Company;
import hu.blackbelt.model.northwind.entities.Customer;
import hu.blackbelt.model.northwind.entities.Employee;
import hu.blackbelt.model.northwind.entities.Induvidual;
import hu.blackbelt.model.northwind.entities.InternationalAddress;
import hu.blackbelt.model.northwind.entities.InternationalOrder;
import hu.blackbelt.model.northwind.entities.MailingList;
import hu.blackbelt.model.northwind.entities.OnlineInternationalOrder;
import hu.blackbelt.model.northwind.entities.OnlineOrder;
import hu.blackbelt.model.northwind.entities.Order;
import hu.blackbelt.model.northwind.entities.OrderDetail;
import hu.blackbelt.model.northwind.entities.PaymentList;
import hu.blackbelt.model.northwind.entities.Person;
import hu.blackbelt.model.northwind.entities.Product;
import hu.blackbelt.model.northwind.entities.Region;
import hu.blackbelt.model.northwind.entities.Shipper;
import hu.blackbelt.model.northwind.entities.Store;
import hu.blackbelt.model.northwind.entities.Supplier;
import hu.blackbelt.model.northwind.entities.Territory;
import hu.blackbelt.model.northwind.measures.Acceleration;
import hu.blackbelt.model.northwind.measures.AmountOfSubstance;
import hu.blackbelt.model.northwind.measures.Area;
import hu.blackbelt.model.northwind.measures.Capacitance;
import hu.blackbelt.model.northwind.measures.Density;
import hu.blackbelt.model.northwind.measures.ElectricCharge;
import hu.blackbelt.model.northwind.measures.ElectricCurrent;
import hu.blackbelt.model.northwind.measures.ElectricPotential;
import hu.blackbelt.model.northwind.measures.ElectricalConductance;
import hu.blackbelt.model.northwind.measures.ElectricalResistance;
import hu.blackbelt.model.northwind.measures.Force;
import hu.blackbelt.model.northwind.measures.Frequency;
import hu.blackbelt.model.northwind.measures.Illuminance;
import hu.blackbelt.model.northwind.measures.Inductance;
import hu.blackbelt.model.northwind.measures.Length;
import hu.blackbelt.model.northwind.measures.LuminousIntensity;
import hu.blackbelt.model.northwind.measures.MagneticFlux;
import hu.blackbelt.model.northwind.measures.MagneticFluxDensity;
import hu.blackbelt.model.northwind.measures.Mass;
import hu.blackbelt.model.northwind.measures.Momentum;
import hu.blackbelt.model.northwind.measures.MonthBasedTime;
import hu.blackbelt.model.northwind.measures.Power;
import hu.blackbelt.model.northwind.measures.Pressure;
import hu.blackbelt.model.northwind.measures.Temperature;
import hu.blackbelt.model.northwind.measures.ThermodynamicTemperature;
import hu.blackbelt.model.northwind.measures.Time;
import hu.blackbelt.model.northwind.measures.Velocity;
import hu.blackbelt.model.northwind.measures.Volume;
import hu.blackbelt.model.northwind.measures.Work;
import hu.blackbelt.model.northwind.services.AllCategories;
import hu.blackbelt.model.northwind.services.AllProducts;
import hu.blackbelt.model.northwind.services.CategoryInfo;
import hu.blackbelt.model.northwind.services.Comment;
import hu.blackbelt.model.northwind.services.CreateCategory;
import hu.blackbelt.model.northwind.services.CreateInternationalOrder;
import hu.blackbelt.model.northwind.services.CreateOrder;
import hu.blackbelt.model.northwind.services.CreateProduct;
import hu.blackbelt.model.northwind.services.CreateShipper;
import hu.blackbelt.model.northwind.services.GetAllInternationalOrders;
import hu.blackbelt.model.northwind.services.GetAllOrders;
import hu.blackbelt.model.northwind.services.InternationalOrderInfo;
import hu.blackbelt.model.northwind.services.InternationalOrderInfoQuery;
import hu.blackbelt.model.northwind.services.OrderAssignedToEmployee;
import hu.blackbelt.model.northwind.services.OrderInfo;
import hu.blackbelt.model.northwind.services.OrderInfoQuery;
import hu.blackbelt.model.northwind.services.OrderItem;
import hu.blackbelt.model.northwind.services.OrderItemQuery;
import hu.blackbelt.model.northwind.services.ProductInfo;
import hu.blackbelt.model.northwind.services.ProductInfoQuery;
import hu.blackbelt.model.northwind.services.ShipmentChange;
import hu.blackbelt.model.northwind.services.ShipperInfo;
import hu.blackbelt.model.northwind.services.TerritoryInfo;
import hu.blackbelt.model.northwind.services.TotalNumberOfOrders;
import hu.blackbelt.model.northwind.types.Measured;
import hu.blackbelt.model.northwind.types.measured.AreaStoredInSquareMetre;
import hu.blackbelt.model.northwind.types.Binary;
import hu.blackbelt.model.northwind.types.Boolean;
import hu.blackbelt.model.northwind.types.Countries;
import hu.blackbelt.model.northwind.types.Date;
import hu.blackbelt.model.northwind.types.Double;
import hu.blackbelt.model.northwind.types.Float;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.Long;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;
import hu.blackbelt.model.northwind.types.Phone;
import hu.blackbelt.model.northwind.types.String;
import hu.blackbelt.model.northwind.types.Text;
import hu.blackbelt.model.northwind.types.TimeStamp;
import hu.blackbelt.model.northwind.types.measured.TimeStoredInMonths;
import hu.blackbelt.model.northwind.types.measured.TimeStoredInSeconds;
import hu.blackbelt.model.northwind.types.Titles;
import hu.blackbelt.model.northwind.types.Url;
import hu.blackbelt.model.northwind.types.measured.VelocityStoredInKmPerHour;
import hu.blackbelt.model.northwind.types.measured.VolumeStoredInLitre;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.calculatePsmValidationScriptURI;
import static hu.blackbelt.judo.meta.psm.PsmEpsilonValidator.validatePsm;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.useModel;
import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.SaveArguments.psmSaveArgumentsBuilder;

public class Demo {
    public Model $ = newModelBuilder().build();

    private Entities entities = new Entities();
    private Measures measures = new Measures();
    private Types types = new Types();
    private Services services = new Services();
    private Measured measured= new Measured();

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
    private CategoryInfo categoryInfo = new CategoryInfo();
    private Comment comment = new Comment();
    private CreateCategory createCategory = new CreateCategory();
    private CreateInternationalOrder createInternationalOrder = new CreateInternationalOrder();
    private CreateOrder createOrder = new CreateOrder();
    private CreateProduct createProduct = new CreateProduct();
    private CreateShipper createShipper = new CreateShipper();
    private GetAllInternationalOrders getAllInternationalOrders = new GetAllInternationalOrders();
    private GetAllOrders getAllOrders = new GetAllOrders();
    private TerritoryInfo territoryInfo = new TerritoryInfo();
    private InternationalOrderInfo internationalOrderInfo = new InternationalOrderInfo();
    private InternationalOrderInfoQuery internationalOrderInfoQuery = new InternationalOrderInfoQuery();
    private OrderInfo orderInfo = new OrderInfo();
    private OrderInfoQuery orderInfoQuery = new OrderInfoQuery();
    private OrderItem orderItem = new OrderItem();
    private OrderItemQuery orderItemQuery = new OrderItemQuery();
    private ProductInfo productInfo = new ProductInfo();
    private ProductInfoQuery productInfoQuery = new ProductInfoQuery();
    private ShipmentChange shipmentChange = new ShipmentChange();
    private ShipperInfo shipperInfo = new ShipperInfo();
    private AreaStoredInSquareMetre areaStoredInSquareMetre = new AreaStoredInSquareMetre();
    private Binary binary = new Binary();
    private Boolean boolean_ = new Boolean();
    private Countries countries = new Countries();
    private Date date = new Date();
    private Double double_ = new Double();
    private Float float_ = new Float();
    private Integer integer = new Integer();
    private Long long_ = new Long();
    private MassStoredInKilograms massStoredInKilograms = new MassStoredInKilograms();
    private MassStoredInGrams massStoredInGrams = new MassStoredInGrams();
    private Phone phone = new Phone();
    private String string = new String();
    private Text text = new Text();
    private TimeStamp timeStamp = new TimeStamp();
    private TimeStoredInMonths timeStoredInMonths = new TimeStoredInMonths();
    private TimeStoredInSeconds timeStoredInSeconds = new TimeStoredInSeconds();
    private Titles titles = new Titles();
    private Url url = new Url();
    private VelocityStoredInKmPerHour velocityStoredInKmPerHour = new VelocityStoredInKmPerHour();
    private VolumeStoredInLitre volumeStoredInLitre = new VolumeStoredInLitre();
    private InternalAP internalAP = new InternalAP();
    private ExternallAP externallAP = new ExternallAP();
    private AllCategories allCategories = new AllCategories();
    private AllProducts allProducts = new AllProducts();
    private OrderAssignedToEmployee orderAssignedToEmployee = new OrderAssignedToEmployee();
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
        force.init(measures.$, mass,acceleration);
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
        binary.init(types.$);
        boolean_.init(types.$);
        countries.init(types.$);
        date.init(types.$);
        double_.init(types.$);
        float_.init(types.$);
        integer.init(types.$);
        long_.init(types.$);
        phone.init(types.$);
        string.init(types.$);
        text.init(types.$);
        timeStamp.init(types.$);
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
        address.init(entities.$, string, city);
        category.init(entities.$, string, text, binary, product, employee);
        city.init(entities.$, string);
        company.init(entities.$, string, phone, customer, product);
        customer.init(entities.$, order, address);
        employee.init(entities.$, string, date, phone, binary, text, person, order,
                address, territory, category);
        induvidual.init(entities.$, phone, person, customer);
        internationalAddress.init(entities.$, countries, address);
        internationalOrder.init(entities.$, string, double_, order);
        mailingList.init(entities.$, person);
        onlineInternationalOrder.init(entities.$, string, internationalOrder, onlineOrder);
        onlineOrder.init(entities.$, url, order);
        order.init(entities.$, string, timeStamp, double_, boolean_, integer, customer, shipper, employee,
                internationalAddress, orderDetail, category, territory);
        orderDetail.init(entities.$, string, double_, integer, boolean_, massStoredInGrams, product, category);
        paymentList.init(entities.$, employee);
        person.init(entities.$, string, titles);
        product.init(entities.$, string, integer, double_, boolean_, massStoredInKilograms, category, supplier,
                company, store);
        region.init(entities.$, string, territory);
        shipper.init(entities.$, company, order, territory);
        store.init(entities.$, product);
        supplier.init(entities.$, url, company, product);
        territory.init(entities.$, string, employee, region, shipper);

        // Unmapped transfer object type
        shipmentChange.init(services.$, string, timeStamp);
        comment.init(services.$, string, text, timeStamp);

        // Mapped transfer objects
        categoryInfo.init(services.$, string, category, productInfo, allProducts);
        internationalOrderInfo.init(services.$, string, double_, timeStamp, order, internationalOrder, orderItem, shipperInfo);
        shipperInfo.init(services.$, string, shipper, company);
        productInfo.init(services.$, string, integer, double_, massStoredInKilograms, product, categoryInfo, allCategories);
        productInfoQuery.init(services.$, string, double_, product, categoryInfo, allCategories);
        territoryInfo.init(services.$, string, territory);
        orderItem.init(services.$, string, integer, double_, orderDetail, productInfo, categoryInfo, allProducts, allCategories);
        orderItemQuery.init(services.$, string, integer, double_, boolean_, massStoredInGrams, orderDetail, productInfoQuery, categoryInfo, allProducts, allCategories);
        orderInfo.init(services.$, string, timeStamp, order, orderItem, shipperInfo, categoryInfo, shipmentChange, comment);
        orderInfoQuery.init(services.$, string, timeStamp, boolean_, integer, double_, order, orderItemQuery, categoryInfo, territoryInfo);
        internationalOrderInfoQuery.init(services.$, internationalOrder, orderInfoQuery);

        // Operations
        createCategory.init(services.$, categoryInfo);
        createInternationalOrder.init(services.$, internationalOrderInfo);
        createOrder.init(services.$, orderInfo);
        createProduct.init(services.$, productInfo);
        createShipper.init(services.$, shipperInfo);
        getAllOrders.init(services.$, orderInfoQuery);
        getAllInternationalOrders.init(services.$, internationalOrderInfoQuery);

        // Static Navigation
        allCategories.init(services.$, category);
        allProducts.init(services.$, product);
        orderAssignedToEmployee.init(services.$, order);

        // Static Data
        totalNumberOfOrders.init(services.$, integer);

        // Access Points
        internalAP.init($, orderInfoQuery, getAllOrders, getAllInternationalOrders,
                createOrder, createInternationalOrder, createShipper, createProduct, createCategory, orderAssignedToEmployee);
        externallAP.init($, productInfo, categoryInfo, allProducts, allCategories);

        PsmModel psmModel = createPsmModel();
        psmModel.addContent($);
        return psmModel;
    }

    public static void main(java.lang.String[] args) throws URISyntaxException, IOException {
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
            try {
                validatePsm(new StringBuilderLogger(StringBuilderLogger.LogLevel.DEBUG),
                        psmModel, calculatePsmValidationScriptURI());
            } catch (ScriptExecutionException e) {
                System.err.println(e.toString());
            }
        }
    }


}
