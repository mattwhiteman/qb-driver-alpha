package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsEmployeeTax generated by hbm2java
 */
@Entity
@Table(name = "es_employee_tax")
public class EsEmployeeTax implements java.io.Serializable {

	private int employeeId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Short fitFilingStatusType;
	private Short fitAllowances;
	private byte subjectToFitBool;
	private byte subjectToSsecBool;
	private byte subjectToMcareBool;
	private byte subjectToFutaBool;
	private byte subjectToAeicBool;
	private byte enforceStandardTaxationBool;
	private Short stateWorkedType;
	private Short stateLivedType;
	private Short sitFilingStatusType;
	private Short sitAllowances;
	private Integer stateTaxTableVersion;
	private byte subjectToSuiBool;
	private byte subjectToSdiBool;
	private byte hasPensionPlanBool;
	private BigDecimal fitExtraWithholdingAmt;
	private BigDecimal sitExtraWithholdingAmt;
	private String stateMisc1;
	private String stateMisc2;
	private String stateMisc3;
	private String employeeAbmId;
	private Integer numOtherTax;
	private Integer companyId;
	private Short provinceLivedType;
	private short provinceWorkedType;
	private BigDecimal td1ClaimAmt;
	private BigDecimal quebecTaxClaimAmt;
	private BigDecimal eiEmployerFactor;
	private BigDecimal annualHdZoneDeductionAmt;
	private Short numberOfDependents;
	private byte isSubjectToEiBool;
	private byte isSubjectToCppBool;
	private byte isSubjectToQuebecTaxBool;
	private byte isSubjectToQppBool;
	private byte isSubjectToQpipBool;
	private BigDecimal quebecAdditionalTaxAmt;
	private byte isSubjectToQhsfBool;
	private byte isSubjectToCntBool;
	private String employeeTaxCode;
	private short employeeNationalInsuranceCode;
	private Date taxCodeDate;
	private Date nationalInsuranceCodeDate;
	private byte isCompanyDirectorBool;
	private byte isSubjectToCollectionStudentLoansBool;
	private byte qualifiesForWorkingFamilyTaxCreditBool;
	private byte qualifiesForScottishVariableRateBool;
	private byte isNiCodeChangedBool;
	private String schemeContractedOutNumber;
	private byte isSubjectToQhcBool;
	private short planTypeForStudentLoan;

	public EsEmployeeTax() {
	}

	public EsEmployeeTax(int employeeId, Date dbCreatedTms, Date dbModifiedTms, byte subjectToFitBool,
			byte subjectToSsecBool, byte subjectToMcareBool, byte subjectToFutaBool, byte subjectToAeicBool,
			byte enforceStandardTaxationBool, byte subjectToSuiBool, byte subjectToSdiBool, byte hasPensionPlanBool,
			short provinceWorkedType, byte isSubjectToEiBool, byte isSubjectToCppBool, byte isSubjectToQuebecTaxBool,
			byte isSubjectToQppBool, byte isSubjectToQpipBool, byte isSubjectToQhsfBool, byte isSubjectToCntBool,
			short employeeNationalInsuranceCode, byte isCompanyDirectorBool, byte isSubjectToCollectionStudentLoansBool,
			byte qualifiesForWorkingFamilyTaxCreditBool, byte qualifiesForScottishVariableRateBool,
			byte isNiCodeChangedBool, byte isSubjectToQhcBool, short planTypeForStudentLoan) {
		this.employeeId = employeeId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.subjectToFitBool = subjectToFitBool;
		this.subjectToSsecBool = subjectToSsecBool;
		this.subjectToMcareBool = subjectToMcareBool;
		this.subjectToFutaBool = subjectToFutaBool;
		this.subjectToAeicBool = subjectToAeicBool;
		this.enforceStandardTaxationBool = enforceStandardTaxationBool;
		this.subjectToSuiBool = subjectToSuiBool;
		this.subjectToSdiBool = subjectToSdiBool;
		this.hasPensionPlanBool = hasPensionPlanBool;
		this.provinceWorkedType = provinceWorkedType;
		this.isSubjectToEiBool = isSubjectToEiBool;
		this.isSubjectToCppBool = isSubjectToCppBool;
		this.isSubjectToQuebecTaxBool = isSubjectToQuebecTaxBool;
		this.isSubjectToQppBool = isSubjectToQppBool;
		this.isSubjectToQpipBool = isSubjectToQpipBool;
		this.isSubjectToQhsfBool = isSubjectToQhsfBool;
		this.isSubjectToCntBool = isSubjectToCntBool;
		this.employeeNationalInsuranceCode = employeeNationalInsuranceCode;
		this.isCompanyDirectorBool = isCompanyDirectorBool;
		this.isSubjectToCollectionStudentLoansBool = isSubjectToCollectionStudentLoansBool;
		this.qualifiesForWorkingFamilyTaxCreditBool = qualifiesForWorkingFamilyTaxCreditBool;
		this.qualifiesForScottishVariableRateBool = qualifiesForScottishVariableRateBool;
		this.isNiCodeChangedBool = isNiCodeChangedBool;
		this.isSubjectToQhcBool = isSubjectToQhcBool;
		this.planTypeForStudentLoan = planTypeForStudentLoan;
	}

	public EsEmployeeTax(int employeeId, Date dbCreatedTms, Date dbModifiedTms, Short fitFilingStatusType,
			Short fitAllowances, byte subjectToFitBool, byte subjectToSsecBool, byte subjectToMcareBool,
			byte subjectToFutaBool, byte subjectToAeicBool, byte enforceStandardTaxationBool, Short stateWorkedType,
			Short stateLivedType, Short sitFilingStatusType, Short sitAllowances, Integer stateTaxTableVersion,
			byte subjectToSuiBool, byte subjectToSdiBool, byte hasPensionPlanBool, BigDecimal fitExtraWithholdingAmt,
			BigDecimal sitExtraWithholdingAmt, String stateMisc1, String stateMisc2, String stateMisc3,
			String employeeAbmId, Integer numOtherTax, Integer companyId, Short provinceLivedType,
			short provinceWorkedType, BigDecimal td1ClaimAmt, BigDecimal quebecTaxClaimAmt, BigDecimal eiEmployerFactor,
			BigDecimal annualHdZoneDeductionAmt, Short numberOfDependents, byte isSubjectToEiBool,
			byte isSubjectToCppBool, byte isSubjectToQuebecTaxBool, byte isSubjectToQppBool, byte isSubjectToQpipBool,
			BigDecimal quebecAdditionalTaxAmt, byte isSubjectToQhsfBool, byte isSubjectToCntBool,
			String employeeTaxCode, short employeeNationalInsuranceCode, Date taxCodeDate,
			Date nationalInsuranceCodeDate, byte isCompanyDirectorBool, byte isSubjectToCollectionStudentLoansBool,
			byte qualifiesForWorkingFamilyTaxCreditBool, byte qualifiesForScottishVariableRateBool,
			byte isNiCodeChangedBool, String schemeContractedOutNumber, byte isSubjectToQhcBool,
			short planTypeForStudentLoan) {
		this.employeeId = employeeId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.fitFilingStatusType = fitFilingStatusType;
		this.fitAllowances = fitAllowances;
		this.subjectToFitBool = subjectToFitBool;
		this.subjectToSsecBool = subjectToSsecBool;
		this.subjectToMcareBool = subjectToMcareBool;
		this.subjectToFutaBool = subjectToFutaBool;
		this.subjectToAeicBool = subjectToAeicBool;
		this.enforceStandardTaxationBool = enforceStandardTaxationBool;
		this.stateWorkedType = stateWorkedType;
		this.stateLivedType = stateLivedType;
		this.sitFilingStatusType = sitFilingStatusType;
		this.sitAllowances = sitAllowances;
		this.stateTaxTableVersion = stateTaxTableVersion;
		this.subjectToSuiBool = subjectToSuiBool;
		this.subjectToSdiBool = subjectToSdiBool;
		this.hasPensionPlanBool = hasPensionPlanBool;
		this.fitExtraWithholdingAmt = fitExtraWithholdingAmt;
		this.sitExtraWithholdingAmt = sitExtraWithholdingAmt;
		this.stateMisc1 = stateMisc1;
		this.stateMisc2 = stateMisc2;
		this.stateMisc3 = stateMisc3;
		this.employeeAbmId = employeeAbmId;
		this.numOtherTax = numOtherTax;
		this.companyId = companyId;
		this.provinceLivedType = provinceLivedType;
		this.provinceWorkedType = provinceWorkedType;
		this.td1ClaimAmt = td1ClaimAmt;
		this.quebecTaxClaimAmt = quebecTaxClaimAmt;
		this.eiEmployerFactor = eiEmployerFactor;
		this.annualHdZoneDeductionAmt = annualHdZoneDeductionAmt;
		this.numberOfDependents = numberOfDependents;
		this.isSubjectToEiBool = isSubjectToEiBool;
		this.isSubjectToCppBool = isSubjectToCppBool;
		this.isSubjectToQuebecTaxBool = isSubjectToQuebecTaxBool;
		this.isSubjectToQppBool = isSubjectToQppBool;
		this.isSubjectToQpipBool = isSubjectToQpipBool;
		this.quebecAdditionalTaxAmt = quebecAdditionalTaxAmt;
		this.isSubjectToQhsfBool = isSubjectToQhsfBool;
		this.isSubjectToCntBool = isSubjectToCntBool;
		this.employeeTaxCode = employeeTaxCode;
		this.employeeNationalInsuranceCode = employeeNationalInsuranceCode;
		this.taxCodeDate = taxCodeDate;
		this.nationalInsuranceCodeDate = nationalInsuranceCodeDate;
		this.isCompanyDirectorBool = isCompanyDirectorBool;
		this.isSubjectToCollectionStudentLoansBool = isSubjectToCollectionStudentLoansBool;
		this.qualifiesForWorkingFamilyTaxCreditBool = qualifiesForWorkingFamilyTaxCreditBool;
		this.qualifiesForScottishVariableRateBool = qualifiesForScottishVariableRateBool;
		this.isNiCodeChangedBool = isNiCodeChangedBool;
		this.schemeContractedOutNumber = schemeContractedOutNumber;
		this.isSubjectToQhcBool = isSubjectToQhcBool;
		this.planTypeForStudentLoan = planTypeForStudentLoan;
	}

	@Id

	@Column(name = "employee_id", unique = true, nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", nullable = false, length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_modified_tms", nullable = false, length = 19)
	public Date getDbModifiedTms() {
		return this.dbModifiedTms;
	}

	public void setDbModifiedTms(Date dbModifiedTms) {
		this.dbModifiedTms = dbModifiedTms;
	}

	@Column(name = "fit_filing_status_type")
	public Short getFitFilingStatusType() {
		return this.fitFilingStatusType;
	}

	public void setFitFilingStatusType(Short fitFilingStatusType) {
		this.fitFilingStatusType = fitFilingStatusType;
	}

	@Column(name = "fit_allowances")
	public Short getFitAllowances() {
		return this.fitAllowances;
	}

	public void setFitAllowances(Short fitAllowances) {
		this.fitAllowances = fitAllowances;
	}

	@Column(name = "subject_to_fit_bool", nullable = false)
	public byte getSubjectToFitBool() {
		return this.subjectToFitBool;
	}

	public void setSubjectToFitBool(byte subjectToFitBool) {
		this.subjectToFitBool = subjectToFitBool;
	}

	@Column(name = "subject_to_ssec_bool", nullable = false)
	public byte getSubjectToSsecBool() {
		return this.subjectToSsecBool;
	}

	public void setSubjectToSsecBool(byte subjectToSsecBool) {
		this.subjectToSsecBool = subjectToSsecBool;
	}

	@Column(name = "subject_to_mcare_bool", nullable = false)
	public byte getSubjectToMcareBool() {
		return this.subjectToMcareBool;
	}

	public void setSubjectToMcareBool(byte subjectToMcareBool) {
		this.subjectToMcareBool = subjectToMcareBool;
	}

	@Column(name = "subject_to_futa_bool", nullable = false)
	public byte getSubjectToFutaBool() {
		return this.subjectToFutaBool;
	}

	public void setSubjectToFutaBool(byte subjectToFutaBool) {
		this.subjectToFutaBool = subjectToFutaBool;
	}

	@Column(name = "subject_to_aeic_bool", nullable = false)
	public byte getSubjectToAeicBool() {
		return this.subjectToAeicBool;
	}

	public void setSubjectToAeicBool(byte subjectToAeicBool) {
		this.subjectToAeicBool = subjectToAeicBool;
	}

	@Column(name = "enforce_standard_taxation_bool", nullable = false)
	public byte getEnforceStandardTaxationBool() {
		return this.enforceStandardTaxationBool;
	}

	public void setEnforceStandardTaxationBool(byte enforceStandardTaxationBool) {
		this.enforceStandardTaxationBool = enforceStandardTaxationBool;
	}

	@Column(name = "state_worked_type")
	public Short getStateWorkedType() {
		return this.stateWorkedType;
	}

	public void setStateWorkedType(Short stateWorkedType) {
		this.stateWorkedType = stateWorkedType;
	}

	@Column(name = "state_lived_type")
	public Short getStateLivedType() {
		return this.stateLivedType;
	}

	public void setStateLivedType(Short stateLivedType) {
		this.stateLivedType = stateLivedType;
	}

	@Column(name = "sit_filing_status_type")
	public Short getSitFilingStatusType() {
		return this.sitFilingStatusType;
	}

	public void setSitFilingStatusType(Short sitFilingStatusType) {
		this.sitFilingStatusType = sitFilingStatusType;
	}

	@Column(name = "sit_allowances")
	public Short getSitAllowances() {
		return this.sitAllowances;
	}

	public void setSitAllowances(Short sitAllowances) {
		this.sitAllowances = sitAllowances;
	}

	@Column(name = "state_tax_table_version")
	public Integer getStateTaxTableVersion() {
		return this.stateTaxTableVersion;
	}

	public void setStateTaxTableVersion(Integer stateTaxTableVersion) {
		this.stateTaxTableVersion = stateTaxTableVersion;
	}

	@Column(name = "subject_to_sui_bool", nullable = false)
	public byte getSubjectToSuiBool() {
		return this.subjectToSuiBool;
	}

	public void setSubjectToSuiBool(byte subjectToSuiBool) {
		this.subjectToSuiBool = subjectToSuiBool;
	}

	@Column(name = "subject_to_sdi_bool", nullable = false)
	public byte getSubjectToSdiBool() {
		return this.subjectToSdiBool;
	}

	public void setSubjectToSdiBool(byte subjectToSdiBool) {
		this.subjectToSdiBool = subjectToSdiBool;
	}

	@Column(name = "has_pension_plan_bool", nullable = false)
	public byte getHasPensionPlanBool() {
		return this.hasPensionPlanBool;
	}

	public void setHasPensionPlanBool(byte hasPensionPlanBool) {
		this.hasPensionPlanBool = hasPensionPlanBool;
	}

	@Column(name = "fit_extra_withholding_amt", precision = 20, scale = 5)
	public BigDecimal getFitExtraWithholdingAmt() {
		return this.fitExtraWithholdingAmt;
	}

	public void setFitExtraWithholdingAmt(BigDecimal fitExtraWithholdingAmt) {
		this.fitExtraWithholdingAmt = fitExtraWithholdingAmt;
	}

	@Column(name = "sit_extra_withholding_amt", precision = 20, scale = 5)
	public BigDecimal getSitExtraWithholdingAmt() {
		return this.sitExtraWithholdingAmt;
	}

	public void setSitExtraWithholdingAmt(BigDecimal sitExtraWithholdingAmt) {
		this.sitExtraWithholdingAmt = sitExtraWithholdingAmt;
	}

	@Column(name = "state_misc1", length = 56)
	public String getStateMisc1() {
		return this.stateMisc1;
	}

	public void setStateMisc1(String stateMisc1) {
		this.stateMisc1 = stateMisc1;
	}

	@Column(name = "state_misc2", length = 56)
	public String getStateMisc2() {
		return this.stateMisc2;
	}

	public void setStateMisc2(String stateMisc2) {
		this.stateMisc2 = stateMisc2;
	}

	@Column(name = "state_misc3", length = 56)
	public String getStateMisc3() {
		return this.stateMisc3;
	}

	public void setStateMisc3(String stateMisc3) {
		this.stateMisc3 = stateMisc3;
	}

	@Column(name = "employee_abm_id", length = 17)
	public String getEmployeeAbmId() {
		return this.employeeAbmId;
	}

	public void setEmployeeAbmId(String employeeAbmId) {
		this.employeeAbmId = employeeAbmId;
	}

	@Column(name = "num_other_tax")
	public Integer getNumOtherTax() {
		return this.numOtherTax;
	}

	public void setNumOtherTax(Integer numOtherTax) {
		this.numOtherTax = numOtherTax;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "province_lived_type")
	public Short getProvinceLivedType() {
		return this.provinceLivedType;
	}

	public void setProvinceLivedType(Short provinceLivedType) {
		this.provinceLivedType = provinceLivedType;
	}

	@Column(name = "province_worked_type", nullable = false)
	public short getProvinceWorkedType() {
		return this.provinceWorkedType;
	}

	public void setProvinceWorkedType(short provinceWorkedType) {
		this.provinceWorkedType = provinceWorkedType;
	}

	@Column(name = "td1_claim_amt", precision = 20, scale = 5)
	public BigDecimal getTd1ClaimAmt() {
		return this.td1ClaimAmt;
	}

	public void setTd1ClaimAmt(BigDecimal td1ClaimAmt) {
		this.td1ClaimAmt = td1ClaimAmt;
	}

	@Column(name = "quebec_tax_claim_amt", precision = 20, scale = 5)
	public BigDecimal getQuebecTaxClaimAmt() {
		return this.quebecTaxClaimAmt;
	}

	public void setQuebecTaxClaimAmt(BigDecimal quebecTaxClaimAmt) {
		this.quebecTaxClaimAmt = quebecTaxClaimAmt;
	}

	@Column(name = "ei_employer_factor", precision = 20, scale = 5)
	public BigDecimal getEiEmployerFactor() {
		return this.eiEmployerFactor;
	}

	public void setEiEmployerFactor(BigDecimal eiEmployerFactor) {
		this.eiEmployerFactor = eiEmployerFactor;
	}

	@Column(name = "annual_hd_zone_deduction_amt", precision = 20, scale = 5)
	public BigDecimal getAnnualHdZoneDeductionAmt() {
		return this.annualHdZoneDeductionAmt;
	}

	public void setAnnualHdZoneDeductionAmt(BigDecimal annualHdZoneDeductionAmt) {
		this.annualHdZoneDeductionAmt = annualHdZoneDeductionAmt;
	}

	@Column(name = "number_of_dependents")
	public Short getNumberOfDependents() {
		return this.numberOfDependents;
	}

	public void setNumberOfDependents(Short numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	@Column(name = "is_subject_to_ei_bool", nullable = false)
	public byte getIsSubjectToEiBool() {
		return this.isSubjectToEiBool;
	}

	public void setIsSubjectToEiBool(byte isSubjectToEiBool) {
		this.isSubjectToEiBool = isSubjectToEiBool;
	}

	@Column(name = "is_subject_to_cpp_bool", nullable = false)
	public byte getIsSubjectToCppBool() {
		return this.isSubjectToCppBool;
	}

	public void setIsSubjectToCppBool(byte isSubjectToCppBool) {
		this.isSubjectToCppBool = isSubjectToCppBool;
	}

	@Column(name = "is_subject_to_quebec_tax_bool", nullable = false)
	public byte getIsSubjectToQuebecTaxBool() {
		return this.isSubjectToQuebecTaxBool;
	}

	public void setIsSubjectToQuebecTaxBool(byte isSubjectToQuebecTaxBool) {
		this.isSubjectToQuebecTaxBool = isSubjectToQuebecTaxBool;
	}

	@Column(name = "is_subject_to_qpp_bool", nullable = false)
	public byte getIsSubjectToQppBool() {
		return this.isSubjectToQppBool;
	}

	public void setIsSubjectToQppBool(byte isSubjectToQppBool) {
		this.isSubjectToQppBool = isSubjectToQppBool;
	}

	@Column(name = "is_subject_to_qpip_bool", nullable = false)
	public byte getIsSubjectToQpipBool() {
		return this.isSubjectToQpipBool;
	}

	public void setIsSubjectToQpipBool(byte isSubjectToQpipBool) {
		this.isSubjectToQpipBool = isSubjectToQpipBool;
	}

	@Column(name = "quebec_additional_tax_amt", precision = 20, scale = 5)
	public BigDecimal getQuebecAdditionalTaxAmt() {
		return this.quebecAdditionalTaxAmt;
	}

	public void setQuebecAdditionalTaxAmt(BigDecimal quebecAdditionalTaxAmt) {
		this.quebecAdditionalTaxAmt = quebecAdditionalTaxAmt;
	}

	@Column(name = "is_subject_to_qhsf_bool", nullable = false)
	public byte getIsSubjectToQhsfBool() {
		return this.isSubjectToQhsfBool;
	}

	public void setIsSubjectToQhsfBool(byte isSubjectToQhsfBool) {
		this.isSubjectToQhsfBool = isSubjectToQhsfBool;
	}

	@Column(name = "is_subject_to_cnt_bool", nullable = false)
	public byte getIsSubjectToCntBool() {
		return this.isSubjectToCntBool;
	}

	public void setIsSubjectToCntBool(byte isSubjectToCntBool) {
		this.isSubjectToCntBool = isSubjectToCntBool;
	}

	@Column(name = "employee_tax_code", length = 10)
	public String getEmployeeTaxCode() {
		return this.employeeTaxCode;
	}

	public void setEmployeeTaxCode(String employeeTaxCode) {
		this.employeeTaxCode = employeeTaxCode;
	}

	@Column(name = "employee_national_insurance_code", nullable = false)
	public short getEmployeeNationalInsuranceCode() {
		return this.employeeNationalInsuranceCode;
	}

	public void setEmployeeNationalInsuranceCode(short employeeNationalInsuranceCode) {
		this.employeeNationalInsuranceCode = employeeNationalInsuranceCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "tax_code_date", length = 10)
	public Date getTaxCodeDate() {
		return this.taxCodeDate;
	}

	public void setTaxCodeDate(Date taxCodeDate) {
		this.taxCodeDate = taxCodeDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "national_insurance_code_date", length = 10)
	public Date getNationalInsuranceCodeDate() {
		return this.nationalInsuranceCodeDate;
	}

	public void setNationalInsuranceCodeDate(Date nationalInsuranceCodeDate) {
		this.nationalInsuranceCodeDate = nationalInsuranceCodeDate;
	}

	@Column(name = "is_company_director_bool", nullable = false)
	public byte getIsCompanyDirectorBool() {
		return this.isCompanyDirectorBool;
	}

	public void setIsCompanyDirectorBool(byte isCompanyDirectorBool) {
		this.isCompanyDirectorBool = isCompanyDirectorBool;
	}

	@Column(name = "is_subject_to_collection_student_loans_bool", nullable = false)
	public byte getIsSubjectToCollectionStudentLoansBool() {
		return this.isSubjectToCollectionStudentLoansBool;
	}

	public void setIsSubjectToCollectionStudentLoansBool(byte isSubjectToCollectionStudentLoansBool) {
		this.isSubjectToCollectionStudentLoansBool = isSubjectToCollectionStudentLoansBool;
	}

	@Column(name = "qualifies_for_working_family_tax_credit_bool", nullable = false)
	public byte getQualifiesForWorkingFamilyTaxCreditBool() {
		return this.qualifiesForWorkingFamilyTaxCreditBool;
	}

	public void setQualifiesForWorkingFamilyTaxCreditBool(byte qualifiesForWorkingFamilyTaxCreditBool) {
		this.qualifiesForWorkingFamilyTaxCreditBool = qualifiesForWorkingFamilyTaxCreditBool;
	}

	@Column(name = "qualifies_for_Scottish_variable_rate_bool", nullable = false)
	public byte getQualifiesForScottishVariableRateBool() {
		return this.qualifiesForScottishVariableRateBool;
	}

	public void setQualifiesForScottishVariableRateBool(byte qualifiesForScottishVariableRateBool) {
		this.qualifiesForScottishVariableRateBool = qualifiesForScottishVariableRateBool;
	}

	@Column(name = "is_NI_code_changed_bool", nullable = false)
	public byte getIsNiCodeChangedBool() {
		return this.isNiCodeChangedBool;
	}

	public void setIsNiCodeChangedBool(byte isNiCodeChangedBool) {
		this.isNiCodeChangedBool = isNiCodeChangedBool;
	}

	@Column(name = "scheme_contracted_out_number", length = 10)
	public String getSchemeContractedOutNumber() {
		return this.schemeContractedOutNumber;
	}

	public void setSchemeContractedOutNumber(String schemeContractedOutNumber) {
		this.schemeContractedOutNumber = schemeContractedOutNumber;
	}

	@Column(name = "is_subject_to_qhc_bool", nullable = false)
	public byte getIsSubjectToQhcBool() {
		return this.isSubjectToQhcBool;
	}

	public void setIsSubjectToQhcBool(byte isSubjectToQhcBool) {
		this.isSubjectToQhcBool = isSubjectToQhcBool;
	}

	@Column(name = "plan_Type_For_Student_Loan", nullable = false)
	public short getPlanTypeForStudentLoan() {
		return this.planTypeForStudentLoan;
	}

	public void setPlanTypeForStudentLoan(short planTypeForStudentLoan) {
		this.planTypeForStudentLoan = planTypeForStudentLoan;
	}

}
