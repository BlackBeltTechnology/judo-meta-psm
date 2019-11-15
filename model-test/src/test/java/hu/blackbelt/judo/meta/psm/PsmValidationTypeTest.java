package hu.blackbelt.judo.meta.psm;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newBooleanTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCustomTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newDateTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationMemberBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newNumericTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newPasswordTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newTimestampTypeBuilder;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;

import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.BooleanType;
import hu.blackbelt.judo.meta.psm.type.CustomType;
import hu.blackbelt.judo.meta.psm.type.DateType;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.PasswordType;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.type.TimestampType;

class PsmValidationTypeTest {

	Logger logger = LoggerFactory.getLogger(PsmValidationTypeTest.class);

	private final String createdSourceModelName = "urn:psm.judo-meta-psm";

	private PsmModel psmModel;
	private Log log = new Slf4jLog();

	@BeforeEach
	void setUp() {
		psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).name("test").build();
	}

	private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
		try {
			PsmEpsilonValidator.validatePsm(log, psmModel,
					new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."), expectedErrors,
					expectedWarnings);
		} catch (EvlScriptExecutionException ex) {
			logger.error("EVL failed", ex);
			logger.error("\u001B[31m - expected errors: {}\u001B[0m", expectedErrors);
			logger.error("\u001B[31m - unexpected errors: {}\u001B[0m", ex.getUnexpectedErrors());
			logger.error("\u001B[31m - errors not found: {}\u001B[0m", ex.getErrorsNotFound());
			logger.error("\u001B[33m - expected warnings: {}\u001B[0m", expectedWarnings);
			logger.error("\u001B[33m - unexpected warnings: {}\u001B[0m", ex.getUnexpectedWarnings());
			logger.error("\u001B[33m - warnings not found: {}\u001B[0m", ex.getWarningsNotFound());
			throw ex;
		}
	}

	@Test
	void testEnumerationMemberValueIsUnique() throws Exception {
		log.info("Testing constraint: EnumerationMemberValueIsUnique");

		Model m = newModelBuilder().withName("M")
				.withElements(
						ImmutableList.of(newEnumerationTypeBuilder().withName("E")
								.withMembers(ImmutableList.of(
										newEnumerationMemberBuilder().withName("A").withOrdinal(0).build(),
										newEnumerationMemberBuilder().withName("B").withOrdinal(0).build()))
								.build()))
				.build();

		psmModel.addContent(m);

		runEpsilon(
				ImmutableList.of(
						"EnumerationMemberValueIsUnique|Enum member number of enum member: A is not unique in enum: E",
						"EnumerationMemberValueIsUnique|Enum member number of enum member: B is not unique in enum: E"),
				Collections.emptyList());
	}

	@Test
	void testEnumerationContainsAtLeastTwoMembers() throws Exception {
		log.info("Testing constraint: EnumerationContainsAtLeastTwoMembers");

		Model m = newModelBuilder().withName("M").withElements(newEnumerationTypeBuilder().withName("E")
				.withMembers(newEnumerationMemberBuilder().withName("m").build()).build()).build();

		psmModel.addContent(m);
		runEpsilon(Collections.emptyList(),
				ImmutableList.of("EnumerationContainsAtLeastTwoMembers|Enum E has no or only a single member"));
	}

	@Test
	void testScaleIsLowerThanPrecision() throws Exception {
		log.info("Testing constraint: ScaleIsLowerThanPrecision");

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList
						.of(newNumericTypeBuilder().withName("InvalidScale").withPrecision(5).withScale(10).build()))
				.build();

		psmModel.addContent(m);

		runEpsilon(ImmutableList.of("ScaleIsLowerThanPrecision|Scale (10) must be less than precision (5)"),
				Collections.emptyList());
	}

	@Test
	void testValidScale() throws Exception {
		log.info("Testing constraint: ValidScale");

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList
						.of(newNumericTypeBuilder().withName("InvalidScale").withPrecision(5).withScale(-2).build()))
				.build();

		psmModel.addContent(m);

		runEpsilon(ImmutableList.of("ValidScale|Scale (-2) must be at least 0"), Collections.emptyList());
	}

	@Test
	void testPrimitiveTypeNamesAreUnique() throws Exception {
		log.info("Testing critique: PrimitiveTypeNamesAreUnique");

		NumericType type1 = newNumericTypeBuilder().withName("integer").withPrecision(18).build();
		NumericType type2 = newNumericTypeBuilder().withName("INTEGER").withPrecision(18).build();
		CustomType type3 = newCustomTypeBuilder().withName("type").build();
		StringType type4 = newStringTypeBuilder().withName("Type").withMaxLength(255).build();
		PasswordType type5 = newPasswordTypeBuilder().withName("pw").build();
		BooleanType type6 = newBooleanTypeBuilder().withName("PW").build();
		DateType type7 = newDateTypeBuilder().withName("time").build();
		TimestampType type8 = newTimestampTypeBuilder().withName("Time").build();

		Package p1 = newPackageBuilder().withName("pkg1").withElements(ImmutableList.of(type1, type3, type5, type7))
				.build();
		Package p2 = newPackageBuilder().withName("pkg2").withElements(ImmutableList.of(type2, type4, type6, type8))
				.build();

		Model m = newModelBuilder().withName("M").withPackages(ImmutableList.of(p1, p2)).build();

		psmModel.addContent(m);
		runEpsilon(Collections.emptyList(),
				ImmutableList.of("PrimitiveTypeNamesAreUnique|Primitive type name is not unique: integer",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: INTEGER",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: type",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: Type",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: pw",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: PW",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: time",
						"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: Time"));
	}

	@Test
	void testValidMaxLength() throws Exception {
		log.info("Testing constraint: ValidMaxLength");

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(newStringTypeBuilder().withName("String").withMaxLength(-3).build()))
				.build();

		psmModel.addContent(m);

		runEpsilon(ImmutableList.of("ValidMaxLength|MaxLength must be greater than 0: String"),
				Collections.emptyList());
	}

	@Test
	void testMaxLengthIsNotTooLarge() throws Exception {
		log.info("Testing constraint: MaxLengthIsNotTooLarge");

		Model m = newModelBuilder().withName("M")
				.withElements(newStringTypeBuilder().withName("String").withMaxLength(4001).build()).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("MaxLengthIsNotTooLarge|MaxLength must be less than/equals to 4000: String"),
				Collections.emptyList());
	}

	@Test
	void testValidRegex() throws Exception {
		log.info("Testing constraint: ValidRegex");

		StringType stringType = newStringTypeBuilder().withName("regexpyStringy").withMaxLength(100)
				.withRegExp("árvíztűrőtükörfúrógép").build();
		StringType invalidStringType = newStringTypeBuilder().withName("invalidRegexpyStringy").withMaxLength(100)
				.withRegExp("[árvíztűrőtükörfúrógép").build();

		Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(stringType, invalidStringType)).build();

		psmModel.addContent(m);
		runEpsilon(ImmutableList.of("ValidRegex|Invalid regular expression of invalidRegexpyStringy"),
				Collections.emptyList());
	}

	@Test
	void testTimeStampBaseUnitIsValid() throws Exception {
		log.info("Testing constraint: TimeStampBaseUnitIsValid");

		TimestampType weekTimestamp = newTimestampTypeBuilder().withName("weekTimestamp")
				.withBaseUnit(DurationType.WEEK).build();
		TimestampType monthTimestamp = newTimestampTypeBuilder().withName("monthTimestamp")
				.withBaseUnit(DurationType.MONTH).build();
		TimestampType yearTimestamp = newTimestampTypeBuilder().withName("yearTimestamp")
				.withBaseUnit(DurationType.YEAR).build();

		Model m = newModelBuilder().withName("M")
				.withElements(ImmutableList.of(weekTimestamp, monthTimestamp, yearTimestamp)).build();

		psmModel.addContent(m);

		runEpsilon(
				ImmutableList.of("TimeStampBaseUnitIsValid|Base unit of timestamp type: weekTimestamp is invalid.",
						"TimeStampBaseUnitIsValid|Base unit of timestamp type: monthTimestamp is invalid.",
						"TimeStampBaseUnitIsValid|Base unit of timestamp type: yearTimestamp is invalid."),
				Collections.emptyList());
	}
}
