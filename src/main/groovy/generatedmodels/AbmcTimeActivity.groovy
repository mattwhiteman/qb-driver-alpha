package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcTimeActivity generated by hbm2java
 */
@Entity
@Table(name = "abmc_time_activity")
public class AbmcTimeActivity implements java.io.Serializable {

	private int timeActivityId;
	private Date timeActivityDate;
	private Integer customerId;
	private Integer vendorId;
	private Integer employeeId;
	private Integer otherId;
	private Integer jobId;
	private Integer itemId;
	private Integer payrollItemId;
	private Integer classId;
	private Integer workersCompCodeId;
	private Long timeDuration;
	private Short billingStatus;
	private byte isTransferToPayrollBool;
	private byte isImportedBool;
	private byte isImportedNotAcceptedBool;
	private String abmId;
	private int modtimestampTms;
	private Date dbModifiedTms;
	private int timestampTms;
	private Date dbCreatedTms;
	private String memo;
	private int companyId;
	private Integer timeSheetEntryId;
	private byte userDurationOverrideBool;
	private Integer timeBucketType;
	private byte hasAttachmentsBool;
	private String externalIdent;
	private Integer timeActivityLineOrder;

	public AbmcTimeActivity() {
	}

	public AbmcTimeActivity(int timeActivityId, Date timeActivityDate, byte isTransferToPayrollBool,
			byte isImportedBool, byte isImportedNotAcceptedBool, String abmId, int modtimestampTms, Date dbModifiedTms,
			int timestampTms, Date dbCreatedTms, int companyId, byte userDurationOverrideBool,
			byte hasAttachmentsBool) {
		this.timeActivityId = timeActivityId;
		this.timeActivityDate = timeActivityDate;
		this.isTransferToPayrollBool = isTransferToPayrollBool;
		this.isImportedBool = isImportedBool;
		this.isImportedNotAcceptedBool = isImportedNotAcceptedBool;
		this.abmId = abmId;
		this.modtimestampTms = modtimestampTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.dbCreatedTms = dbCreatedTms;
		this.companyId = companyId;
		this.userDurationOverrideBool = userDurationOverrideBool;
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	public AbmcTimeActivity(int timeActivityId, Date timeActivityDate, Integer customerId, Integer vendorId,
			Integer employeeId, Integer otherId, Integer jobId, Integer itemId, Integer payrollItemId, Integer classId,
			Integer workersCompCodeId, Long timeDuration, Short billingStatus, byte isTransferToPayrollBool,
			byte isImportedBool, byte isImportedNotAcceptedBool, String abmId, int modtimestampTms, Date dbModifiedTms,
			int timestampTms, Date dbCreatedTms, String memo, int companyId, Integer timeSheetEntryId,
			byte userDurationOverrideBool, Integer timeBucketType, byte hasAttachmentsBool, String externalIdent,
			Integer timeActivityLineOrder) {
		this.timeActivityId = timeActivityId;
		this.timeActivityDate = timeActivityDate;
		this.customerId = customerId;
		this.vendorId = vendorId;
		this.employeeId = employeeId;
		this.otherId = otherId;
		this.jobId = jobId;
		this.itemId = itemId;
		this.payrollItemId = payrollItemId;
		this.classId = classId;
		this.workersCompCodeId = workersCompCodeId;
		this.timeDuration = timeDuration;
		this.billingStatus = billingStatus;
		this.isTransferToPayrollBool = isTransferToPayrollBool;
		this.isImportedBool = isImportedBool;
		this.isImportedNotAcceptedBool = isImportedNotAcceptedBool;
		this.abmId = abmId;
		this.modtimestampTms = modtimestampTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.dbCreatedTms = dbCreatedTms;
		this.memo = memo;
		this.companyId = companyId;
		this.timeSheetEntryId = timeSheetEntryId;
		this.userDurationOverrideBool = userDurationOverrideBool;
		this.timeBucketType = timeBucketType;
		this.hasAttachmentsBool = hasAttachmentsBool;
		this.externalIdent = externalIdent;
		this.timeActivityLineOrder = timeActivityLineOrder;
	}

	@Id

	@Column(name = "time_activity_id", unique = true, nullable = false)
	public int getTimeActivityId() {
		return this.timeActivityId;
	}

	public void setTimeActivityId(int timeActivityId) {
		this.timeActivityId = timeActivityId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "time_activity_date", nullable = false, length = 10)
	public Date getTimeActivityDate() {
		return this.timeActivityDate;
	}

	public void setTimeActivityDate(Date timeActivityDate) {
		this.timeActivityDate = timeActivityDate;
	}

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "vendor_id")
	public Integer getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	@Column(name = "employee_id")
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "other_id")
	public Integer getOtherId() {
		return this.otherId;
	}

	public void setOtherId(Integer otherId) {
		this.otherId = otherId;
	}

	@Column(name = "job_id")
	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	@Column(name = "item_id")
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "payroll_item_id")
	public Integer getPayrollItemId() {
		return this.payrollItemId;
	}

	public void setPayrollItemId(Integer payrollItemId) {
		this.payrollItemId = payrollItemId;
	}

	@Column(name = "class_id")
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "workers_comp_code_id")
	public Integer getWorkersCompCodeId() {
		return this.workersCompCodeId;
	}

	public void setWorkersCompCodeId(Integer workersCompCodeId) {
		this.workersCompCodeId = workersCompCodeId;
	}

	@Column(name = "time_duration", precision = 12, scale = 0)
	public Long getTimeDuration() {
		return this.timeDuration;
	}

	public void setTimeDuration(Long timeDuration) {
		this.timeDuration = timeDuration;
	}

	@Column(name = "billing_status")
	public Short getBillingStatus() {
		return this.billingStatus;
	}

	public void setBillingStatus(Short billingStatus) {
		this.billingStatus = billingStatus;
	}

	@Column(name = "is_transfer_to_payroll_bool", nullable = false)
	public byte getIsTransferToPayrollBool() {
		return this.isTransferToPayrollBool;
	}

	public void setIsTransferToPayrollBool(byte isTransferToPayrollBool) {
		this.isTransferToPayrollBool = isTransferToPayrollBool;
	}

	@Column(name = "is_imported_bool", nullable = false)
	public byte getIsImportedBool() {
		return this.isImportedBool;
	}

	public void setIsImportedBool(byte isImportedBool) {
		this.isImportedBool = isImportedBool;
	}

	@Column(name = "is_imported_not_accepted_bool", nullable = false)
	public byte getIsImportedNotAcceptedBool() {
		return this.isImportedNotAcceptedBool;
	}

	public void setIsImportedNotAcceptedBool(byte isImportedNotAcceptedBool) {
		this.isImportedNotAcceptedBool = isImportedNotAcceptedBool;
	}

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
	}

	@Column(name = "Modtimestamp_tms", nullable = false)
	public int getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(int modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_modified_tms", nullable = false, length = 19)
	public Date getDbModifiedTms() {
		return this.dbModifiedTms;
	}

	public void setDbModifiedTms(Date dbModifiedTms) {
		this.dbModifiedTms = dbModifiedTms;
	}

	@Column(name = "Timestamp_tms", nullable = false)
	public int getTimestampTms() {
		return this.timestampTms;
	}

	public void setTimestampTms(int timestampTms) {
		this.timestampTms = timestampTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", nullable = false, length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

	@Column(name = "memo", length = 4096)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "time_sheet_entry_id")
	public Integer getTimeSheetEntryId() {
		return this.timeSheetEntryId;
	}

	public void setTimeSheetEntryId(Integer timeSheetEntryId) {
		this.timeSheetEntryId = timeSheetEntryId;
	}

	@Column(name = "user_duration_override_bool", nullable = false)
	public byte getUserDurationOverrideBool() {
		return this.userDurationOverrideBool;
	}

	public void setUserDurationOverrideBool(byte userDurationOverrideBool) {
		this.userDurationOverrideBool = userDurationOverrideBool;
	}

	@Column(name = "time_bucket_type")
	public Integer getTimeBucketType() {
		return this.timeBucketType;
	}

	public void setTimeBucketType(Integer timeBucketType) {
		this.timeBucketType = timeBucketType;
	}

	@Column(name = "has_attachments_bool", nullable = false)
	public byte getHasAttachmentsBool() {
		return this.hasAttachmentsBool;
	}

	public void setHasAttachmentsBool(byte hasAttachmentsBool) {
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	@Column(name = "external_ident", length = 65)
	public String getExternalIdent() {
		return this.externalIdent;
	}

	public void setExternalIdent(String externalIdent) {
		this.externalIdent = externalIdent;
	}

	@Column(name = "time_activity_line_order")
	public Integer getTimeActivityLineOrder() {
		return this.timeActivityLineOrder;
	}

	public void setTimeActivityLineOrder(Integer timeActivityLineOrder) {
		this.timeActivityLineOrder = timeActivityLineOrder;
	}

}
