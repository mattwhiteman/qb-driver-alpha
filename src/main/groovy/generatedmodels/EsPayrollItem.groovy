package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsPayrollItem generated by hbm2java
 */
@Entity
@Table(name = "es_payroll_item")
public class EsPayrollItem implements java.io.Serializable {

	private int payrollItemId;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private String name;
	private byte isHiddenBool;
	private byte isDeletedBool;
	private byte isDeletePendingBool;
	private Short type;
	private byte nonAnnualLimitBool;
	private Integer expenseAccountId;
	private Integer liabilityAccountId;
	private Integer agencyId;
	private Short taxTrackingType;
	private byte adjustGrossBool;
	private Short special;
	private byte isEmployeeRecBool;
	private byte allocateCostBool;
	private Integer assistedServiceId;
	private byte isToSendBool;
	private byte basedOnQuantityBool;
	private byte dbHasTaxDataBool;
	private Short quantityBasedOnHoursType;
	private BigDecimal defaultAmt;
	private BigDecimal defaultRatePct;
	private BigDecimal defaultRateQnty;
	private BigDecimal limitAmt;
	private String agencyNum;
	private BigDecimal overtimeMultiplierQnty;
	private Integer detailType;
	private Short paymentScheduleType;
	private Integer paymentScheduleNum;
	private Date paymentScheduleDate;
	private Date dbModifiedTms;
	private Date dbCreatedTms;
	private String payrollItemAbmId;
	private int companyId;
	private Integer paymentTemplateId;
	private byte affectFederalTaxBool;
	private byte affectCppBool;
	private byte affectUiBool;
	private byte affectQuebecTaxBool;
	private byte affectQppBool;
	private byte isInsurableEarningsTrackingBool;
	private byte isInsurableHoursTrackingBool;
	private byte isReportingPeriodTrackingBool;
	private byte affectQpipBool;
	private byte affectQhsfBool;
	private byte affectCntBool;
	private byte affectNicBool;
	private byte affectAttachmentBool;
	private byte isPensionItemBool;
	private short attachmentType;
	private short limitType;
	private byte isQualifiedPensionSchemeBool;
	private byte basedOnQualifyingEarningsBool;
	private byte isQualifyingEarningsBool;

	public EsPayrollItem() {
	}

	public EsPayrollItem(int payrollItemId, byte isHiddenBool, byte isDeletedBool, byte isDeletePendingBool,
			byte nonAnnualLimitBool, byte adjustGrossBool, byte isEmployeeRecBool, byte allocateCostBool,
			byte isToSendBool, byte basedOnQuantityBool, byte dbHasTaxDataBool, Date dbModifiedTms, Date dbCreatedTms,
			String payrollItemAbmId, int companyId, byte affectFederalTaxBool, byte affectCppBool, byte affectUiBool,
			byte affectQuebecTaxBool, byte affectQppBool, byte isInsurableEarningsTrackingBool,
			byte isInsurableHoursTrackingBool, byte isReportingPeriodTrackingBool, byte affectQpipBool,
			byte affectQhsfBool, byte affectCntBool, byte affectNicBool, byte affectAttachmentBool,
			byte isPensionItemBool, short attachmentType, short limitType, byte isQualifiedPensionSchemeBool,
			byte basedOnQualifyingEarningsBool, byte isQualifyingEarningsBool) {
		this.payrollItemId = payrollItemId;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.nonAnnualLimitBool = nonAnnualLimitBool;
		this.adjustGrossBool = adjustGrossBool;
		this.isEmployeeRecBool = isEmployeeRecBool;
		this.allocateCostBool = allocateCostBool;
		this.isToSendBool = isToSendBool;
		this.basedOnQuantityBool = basedOnQuantityBool;
		this.dbHasTaxDataBool = dbHasTaxDataBool;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.payrollItemAbmId = payrollItemAbmId;
		this.companyId = companyId;
		this.affectFederalTaxBool = affectFederalTaxBool;
		this.affectCppBool = affectCppBool;
		this.affectUiBool = affectUiBool;
		this.affectQuebecTaxBool = affectQuebecTaxBool;
		this.affectQppBool = affectQppBool;
		this.isInsurableEarningsTrackingBool = isInsurableEarningsTrackingBool;
		this.isInsurableHoursTrackingBool = isInsurableHoursTrackingBool;
		this.isReportingPeriodTrackingBool = isReportingPeriodTrackingBool;
		this.affectQpipBool = affectQpipBool;
		this.affectQhsfBool = affectQhsfBool;
		this.affectCntBool = affectCntBool;
		this.affectNicBool = affectNicBool;
		this.affectAttachmentBool = affectAttachmentBool;
		this.isPensionItemBool = isPensionItemBool;
		this.attachmentType = attachmentType;
		this.limitType = limitType;
		this.isQualifiedPensionSchemeBool = isQualifiedPensionSchemeBool;
		this.basedOnQualifyingEarningsBool = basedOnQualifyingEarningsBool;
		this.isQualifyingEarningsBool = isQualifyingEarningsBool;
	}

	public EsPayrollItem(int payrollItemId, Integer timestampTms, Integer modtimestampTms, String name,
			byte isHiddenBool, byte isDeletedBool, byte isDeletePendingBool, Short type, byte nonAnnualLimitBool,
			Integer expenseAccountId, Integer liabilityAccountId, Integer agencyId, Short taxTrackingType,
			byte adjustGrossBool, Short special, byte isEmployeeRecBool, byte allocateCostBool,
			Integer assistedServiceId, byte isToSendBool, byte basedOnQuantityBool, byte dbHasTaxDataBool,
			Short quantityBasedOnHoursType, BigDecimal defaultAmt, BigDecimal defaultRatePct,
			BigDecimal defaultRateQnty, BigDecimal limitAmt, String agencyNum, BigDecimal overtimeMultiplierQnty,
			Integer detailType, Short paymentScheduleType, Integer paymentScheduleNum, Date paymentScheduleDate,
			Date dbModifiedTms, Date dbCreatedTms, String payrollItemAbmId, int companyId, Integer paymentTemplateId,
			byte affectFederalTaxBool, byte affectCppBool, byte affectUiBool, byte affectQuebecTaxBool,
			byte affectQppBool, byte isInsurableEarningsTrackingBool, byte isInsurableHoursTrackingBool,
			byte isReportingPeriodTrackingBool, byte affectQpipBool, byte affectQhsfBool, byte affectCntBool,
			byte affectNicBool, byte affectAttachmentBool, byte isPensionItemBool, short attachmentType,
			short limitType, byte isQualifiedPensionSchemeBool, byte basedOnQualifyingEarningsBool,
			byte isQualifyingEarningsBool) {
		this.payrollItemId = payrollItemId;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.name = name;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.type = type;
		this.nonAnnualLimitBool = nonAnnualLimitBool;
		this.expenseAccountId = expenseAccountId;
		this.liabilityAccountId = liabilityAccountId;
		this.agencyId = agencyId;
		this.taxTrackingType = taxTrackingType;
		this.adjustGrossBool = adjustGrossBool;
		this.special = special;
		this.isEmployeeRecBool = isEmployeeRecBool;
		this.allocateCostBool = allocateCostBool;
		this.assistedServiceId = assistedServiceId;
		this.isToSendBool = isToSendBool;
		this.basedOnQuantityBool = basedOnQuantityBool;
		this.dbHasTaxDataBool = dbHasTaxDataBool;
		this.quantityBasedOnHoursType = quantityBasedOnHoursType;
		this.defaultAmt = defaultAmt;
		this.defaultRatePct = defaultRatePct;
		this.defaultRateQnty = defaultRateQnty;
		this.limitAmt = limitAmt;
		this.agencyNum = agencyNum;
		this.overtimeMultiplierQnty = overtimeMultiplierQnty;
		this.detailType = detailType;
		this.paymentScheduleType = paymentScheduleType;
		this.paymentScheduleNum = paymentScheduleNum;
		this.paymentScheduleDate = paymentScheduleDate;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.payrollItemAbmId = payrollItemAbmId;
		this.companyId = companyId;
		this.paymentTemplateId = paymentTemplateId;
		this.affectFederalTaxBool = affectFederalTaxBool;
		this.affectCppBool = affectCppBool;
		this.affectUiBool = affectUiBool;
		this.affectQuebecTaxBool = affectQuebecTaxBool;
		this.affectQppBool = affectQppBool;
		this.isInsurableEarningsTrackingBool = isInsurableEarningsTrackingBool;
		this.isInsurableHoursTrackingBool = isInsurableHoursTrackingBool;
		this.isReportingPeriodTrackingBool = isReportingPeriodTrackingBool;
		this.affectQpipBool = affectQpipBool;
		this.affectQhsfBool = affectQhsfBool;
		this.affectCntBool = affectCntBool;
		this.affectNicBool = affectNicBool;
		this.affectAttachmentBool = affectAttachmentBool;
		this.isPensionItemBool = isPensionItemBool;
		this.attachmentType = attachmentType;
		this.limitType = limitType;
		this.isQualifiedPensionSchemeBool = isQualifiedPensionSchemeBool;
		this.basedOnQualifyingEarningsBool = basedOnQualifyingEarningsBool;
		this.isQualifyingEarningsBool = isQualifyingEarningsBool;
	}

	@Id

	@Column(name = "payroll_item_id", unique = true, nullable = false)
	public int getPayrollItemId() {
		return this.payrollItemId;
	}

	public void setPayrollItemId(int payrollItemId) {
		this.payrollItemId = payrollItemId;
	}

	@Column(name = "timestamp_tms")
	public Integer getTimestampTms() {
		return this.timestampTms;
	}

	public void setTimestampTms(Integer timestampTms) {
		this.timestampTms = timestampTms;
	}

	@Column(name = "modtimestamp_tms")
	public Integer getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(Integer modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "is_hidden_bool", nullable = false)
	public byte getIsHiddenBool() {
		return this.isHiddenBool;
	}

	public void setIsHiddenBool(byte isHiddenBool) {
		this.isHiddenBool = isHiddenBool;
	}

	@Column(name = "is_deleted_bool", nullable = false)
	public byte getIsDeletedBool() {
		return this.isDeletedBool;
	}

	public void setIsDeletedBool(byte isDeletedBool) {
		this.isDeletedBool = isDeletedBool;
	}

	@Column(name = "is_delete_pending_bool", nullable = false)
	public byte getIsDeletePendingBool() {
		return this.isDeletePendingBool;
	}

	public void setIsDeletePendingBool(byte isDeletePendingBool) {
		this.isDeletePendingBool = isDeletePendingBool;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "non_annual_limit_bool", nullable = false)
	public byte getNonAnnualLimitBool() {
		return this.nonAnnualLimitBool;
	}

	public void setNonAnnualLimitBool(byte nonAnnualLimitBool) {
		this.nonAnnualLimitBool = nonAnnualLimitBool;
	}

	@Column(name = "expense_account_id")
	public Integer getExpenseAccountId() {
		return this.expenseAccountId;
	}

	public void setExpenseAccountId(Integer expenseAccountId) {
		this.expenseAccountId = expenseAccountId;
	}

	@Column(name = "liability_account_id")
	public Integer getLiabilityAccountId() {
		return this.liabilityAccountId;
	}

	public void setLiabilityAccountId(Integer liabilityAccountId) {
		this.liabilityAccountId = liabilityAccountId;
	}

	@Column(name = "agency_id")
	public Integer getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}

	@Column(name = "tax_tracking_type")
	public Short getTaxTrackingType() {
		return this.taxTrackingType;
	}

	public void setTaxTrackingType(Short taxTrackingType) {
		this.taxTrackingType = taxTrackingType;
	}

	@Column(name = "adjust_gross_bool", nullable = false)
	public byte getAdjustGrossBool() {
		return this.adjustGrossBool;
	}

	public void setAdjustGrossBool(byte adjustGrossBool) {
		this.adjustGrossBool = adjustGrossBool;
	}

	@Column(name = "special")
	public Short getSpecial() {
		return this.special;
	}

	public void setSpecial(Short special) {
		this.special = special;
	}

	@Column(name = "is_employee_rec_bool", nullable = false)
	public byte getIsEmployeeRecBool() {
		return this.isEmployeeRecBool;
	}

	public void setIsEmployeeRecBool(byte isEmployeeRecBool) {
		this.isEmployeeRecBool = isEmployeeRecBool;
	}

	@Column(name = "allocate_cost_bool", nullable = false)
	public byte getAllocateCostBool() {
		return this.allocateCostBool;
	}

	public void setAllocateCostBool(byte allocateCostBool) {
		this.allocateCostBool = allocateCostBool;
	}

	@Column(name = "assisted_service_id")
	public Integer getAssistedServiceId() {
		return this.assistedServiceId;
	}

	public void setAssistedServiceId(Integer assistedServiceId) {
		this.assistedServiceId = assistedServiceId;
	}

	@Column(name = "is_to_send_bool", nullable = false)
	public byte getIsToSendBool() {
		return this.isToSendBool;
	}

	public void setIsToSendBool(byte isToSendBool) {
		this.isToSendBool = isToSendBool;
	}

	@Column(name = "based_on_quantity_bool", nullable = false)
	public byte getBasedOnQuantityBool() {
		return this.basedOnQuantityBool;
	}

	public void setBasedOnQuantityBool(byte basedOnQuantityBool) {
		this.basedOnQuantityBool = basedOnQuantityBool;
	}

	@Column(name = "db_has_tax_data_bool", nullable = false)
	public byte getDbHasTaxDataBool() {
		return this.dbHasTaxDataBool;
	}

	public void setDbHasTaxDataBool(byte dbHasTaxDataBool) {
		this.dbHasTaxDataBool = dbHasTaxDataBool;
	}

	@Column(name = "quantity_based_on_hours_type")
	public Short getQuantityBasedOnHoursType() {
		return this.quantityBasedOnHoursType;
	}

	public void setQuantityBasedOnHoursType(Short quantityBasedOnHoursType) {
		this.quantityBasedOnHoursType = quantityBasedOnHoursType;
	}

	@Column(name = "default_amt", precision = 20, scale = 5)
	public BigDecimal getDefaultAmt() {
		return this.defaultAmt;
	}

	public void setDefaultAmt(BigDecimal defaultAmt) {
		this.defaultAmt = defaultAmt;
	}

	@Column(name = "default_rate_pct", precision = 20, scale = 5)
	public BigDecimal getDefaultRatePct() {
		return this.defaultRatePct;
	}

	public void setDefaultRatePct(BigDecimal defaultRatePct) {
		this.defaultRatePct = defaultRatePct;
	}

	@Column(name = "default_rate_qnty", precision = 20, scale = 5)
	public BigDecimal getDefaultRateQnty() {
		return this.defaultRateQnty;
	}

	public void setDefaultRateQnty(BigDecimal defaultRateQnty) {
		this.defaultRateQnty = defaultRateQnty;
	}

	@Column(name = "limit_amt", precision = 20, scale = 5)
	public BigDecimal getLimitAmt() {
		return this.limitAmt;
	}

	public void setLimitAmt(BigDecimal limitAmt) {
		this.limitAmt = limitAmt;
	}

	@Column(name = "agency_num", length = 21)
	public String getAgencyNum() {
		return this.agencyNum;
	}

	public void setAgencyNum(String agencyNum) {
		this.agencyNum = agencyNum;
	}

	@Column(name = "overtime_multiplier_qnty", precision = 20, scale = 5)
	public BigDecimal getOvertimeMultiplierQnty() {
		return this.overtimeMultiplierQnty;
	}

	public void setOvertimeMultiplierQnty(BigDecimal overtimeMultiplierQnty) {
		this.overtimeMultiplierQnty = overtimeMultiplierQnty;
	}

	@Column(name = "detail_type")
	public Integer getDetailType() {
		return this.detailType;
	}

	public void setDetailType(Integer detailType) {
		this.detailType = detailType;
	}

	@Column(name = "payment_schedule_type")
	public Short getPaymentScheduleType() {
		return this.paymentScheduleType;
	}

	public void setPaymentScheduleType(Short paymentScheduleType) {
		this.paymentScheduleType = paymentScheduleType;
	}

	@Column(name = "payment_schedule_num")
	public Integer getPaymentScheduleNum() {
		return this.paymentScheduleNum;
	}

	public void setPaymentScheduleNum(Integer paymentScheduleNum) {
		this.paymentScheduleNum = paymentScheduleNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "payment_schedule_date", length = 10)
	public Date getPaymentScheduleDate() {
		return this.paymentScheduleDate;
	}

	public void setPaymentScheduleDate(Date paymentScheduleDate) {
		this.paymentScheduleDate = paymentScheduleDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_modified_tms", nullable = false, length = 19)
	public Date getDbModifiedTms() {
		return this.dbModifiedTms;
	}

	public void setDbModifiedTms(Date dbModifiedTms) {
		this.dbModifiedTms = dbModifiedTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", nullable = false, length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

	@Column(name = "payroll_item_abm_id", nullable = false, length = 17)
	public String getPayrollItemAbmId() {
		return this.payrollItemAbmId;
	}

	public void setPayrollItemAbmId(String payrollItemAbmId) {
		this.payrollItemAbmId = payrollItemAbmId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "payment_template_id")
	public Integer getPaymentTemplateId() {
		return this.paymentTemplateId;
	}

	public void setPaymentTemplateId(Integer paymentTemplateId) {
		this.paymentTemplateId = paymentTemplateId;
	}

	@Column(name = "affect_federal_tax_bool", nullable = false)
	public byte getAffectFederalTaxBool() {
		return this.affectFederalTaxBool;
	}

	public void setAffectFederalTaxBool(byte affectFederalTaxBool) {
		this.affectFederalTaxBool = affectFederalTaxBool;
	}

	@Column(name = "affect_CPP_bool", nullable = false)
	public byte getAffectCppBool() {
		return this.affectCppBool;
	}

	public void setAffectCppBool(byte affectCppBool) {
		this.affectCppBool = affectCppBool;
	}

	@Column(name = "affect_UI_bool", nullable = false)
	public byte getAffectUiBool() {
		return this.affectUiBool;
	}

	public void setAffectUiBool(byte affectUiBool) {
		this.affectUiBool = affectUiBool;
	}

	@Column(name = "affect_Quebec_tax_bool", nullable = false)
	public byte getAffectQuebecTaxBool() {
		return this.affectQuebecTaxBool;
	}

	public void setAffectQuebecTaxBool(byte affectQuebecTaxBool) {
		this.affectQuebecTaxBool = affectQuebecTaxBool;
	}

	@Column(name = "affect_QPP_bool", nullable = false)
	public byte getAffectQppBool() {
		return this.affectQppBool;
	}

	public void setAffectQppBool(byte affectQppBool) {
		this.affectQppBool = affectQppBool;
	}

	@Column(name = "is_insurable_earnings_tracking_bool", nullable = false)
	public byte getIsInsurableEarningsTrackingBool() {
		return this.isInsurableEarningsTrackingBool;
	}

	public void setIsInsurableEarningsTrackingBool(byte isInsurableEarningsTrackingBool) {
		this.isInsurableEarningsTrackingBool = isInsurableEarningsTrackingBool;
	}

	@Column(name = "is_insurable_hours_tracking_bool", nullable = false)
	public byte getIsInsurableHoursTrackingBool() {
		return this.isInsurableHoursTrackingBool;
	}

	public void setIsInsurableHoursTrackingBool(byte isInsurableHoursTrackingBool) {
		this.isInsurableHoursTrackingBool = isInsurableHoursTrackingBool;
	}

	@Column(name = "is_reporting_period_tracking_bool", nullable = false)
	public byte getIsReportingPeriodTrackingBool() {
		return this.isReportingPeriodTrackingBool;
	}

	public void setIsReportingPeriodTrackingBool(byte isReportingPeriodTrackingBool) {
		this.isReportingPeriodTrackingBool = isReportingPeriodTrackingBool;
	}

	@Column(name = "affect_QPIP_bool", nullable = false)
	public byte getAffectQpipBool() {
		return this.affectQpipBool;
	}

	public void setAffectQpipBool(byte affectQpipBool) {
		this.affectQpipBool = affectQpipBool;
	}

	@Column(name = "affect_QHSF_bool", nullable = false)
	public byte getAffectQhsfBool() {
		return this.affectQhsfBool;
	}

	public void setAffectQhsfBool(byte affectQhsfBool) {
		this.affectQhsfBool = affectQhsfBool;
	}

	@Column(name = "affect_CNT_bool", nullable = false)
	public byte getAffectCntBool() {
		return this.affectCntBool;
	}

	public void setAffectCntBool(byte affectCntBool) {
		this.affectCntBool = affectCntBool;
	}

	@Column(name = "affect_NIC_bool", nullable = false)
	public byte getAffectNicBool() {
		return this.affectNicBool;
	}

	public void setAffectNicBool(byte affectNicBool) {
		this.affectNicBool = affectNicBool;
	}

	@Column(name = "affect_attachment_bool", nullable = false)
	public byte getAffectAttachmentBool() {
		return this.affectAttachmentBool;
	}

	public void setAffectAttachmentBool(byte affectAttachmentBool) {
		this.affectAttachmentBool = affectAttachmentBool;
	}

	@Column(name = "is_pension_item_bool", nullable = false)
	public byte getIsPensionItemBool() {
		return this.isPensionItemBool;
	}

	public void setIsPensionItemBool(byte isPensionItemBool) {
		this.isPensionItemBool = isPensionItemBool;
	}

	@Column(name = "attachment_type", nullable = false)
	public short getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(short attachmentType) {
		this.attachmentType = attachmentType;
	}

	@Column(name = "limit_type", nullable = false)
	public short getLimitType() {
		return this.limitType;
	}

	public void setLimitType(short limitType) {
		this.limitType = limitType;
	}

	@Column(name = "is_qualified_pension_scheme_bool", nullable = false)
	public byte getIsQualifiedPensionSchemeBool() {
		return this.isQualifiedPensionSchemeBool;
	}

	public void setIsQualifiedPensionSchemeBool(byte isQualifiedPensionSchemeBool) {
		this.isQualifiedPensionSchemeBool = isQualifiedPensionSchemeBool;
	}

	@Column(name = "based_on_qualifying_earnings_bool", nullable = false)
	public byte getBasedOnQualifyingEarningsBool() {
		return this.basedOnQualifyingEarningsBool;
	}

	public void setBasedOnQualifyingEarningsBool(byte basedOnQualifyingEarningsBool) {
		this.basedOnQualifyingEarningsBool = basedOnQualifyingEarningsBool;
	}

	@Column(name = "is_qualifying_earnings_bool", nullable = false)
	public byte getIsQualifyingEarningsBool() {
		return this.isQualifyingEarningsBool;
	}

	public void setIsQualifyingEarningsBool(byte isQualifyingEarningsBool) {
		this.isQualifyingEarningsBool = isQualifyingEarningsBool;
	}

}
