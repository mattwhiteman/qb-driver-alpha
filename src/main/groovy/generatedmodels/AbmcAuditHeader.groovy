package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAuditHeader generated by hbm2java
 */
@Entity
@Table(name = "abmc_audit_header")
public class AbmcAuditHeader implements java.io.Serializable {

	private AbmcAuditHeaderId id;
	private Integer createdTimestampTms;
	private Integer modtimestampTms;
	private Date transactionDate;
	private Integer transNum;
	private String docNum;
	private String fob;
	private Integer termsId;
	private String termsName;
	private Integer salesRepId;
	private String salesRepName;
	private Integer shipViaId;
	private String shipViaName;
	private int targetId;
	private Integer numItemTargets;
	private Date shipDate;
	private Integer modUserId;
	private String modUserName;
	private byte isAuditTrailDataBool;
	private byte isClosingDateExceptionBool;
	private byte isDeletionBool;
	private Integer deleteTms;
	private Integer deleteUserId;
	private String deleteUserName;
	private String auditHeaderAbmId;
	private Date dbModifiedTms;
	private Date dbCreatedTms;
	private int companyId;
	private short lastAuditableAction;
	private byte isSdkAppBool;
	private int transactionViewType;
	private Integer transactionCustomerId;
	private Integer transactionVendorId;
	private Integer transactionEmployeeId;
	private Integer transactionOtherId;
	private Short transactionNameType;
	private String transactionNameText;
	private Integer currencyId;
	private double exchangeRate;
	private String stickyNote;

	public AbmcAuditHeader() {
	}

	public AbmcAuditHeader(AbmcAuditHeaderId id, int targetId, byte isAuditTrailDataBool,
			byte isClosingDateExceptionBool, byte isDeletionBool, String auditHeaderAbmId, Date dbModifiedTms,
			Date dbCreatedTms, int companyId, short lastAuditableAction, byte isSdkAppBool, int transactionViewType,
			double exchangeRate) {
		this.id = id;
		this.targetId = targetId;
		this.isAuditTrailDataBool = isAuditTrailDataBool;
		this.isClosingDateExceptionBool = isClosingDateExceptionBool;
		this.isDeletionBool = isDeletionBool;
		this.auditHeaderAbmId = auditHeaderAbmId;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.companyId = companyId;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.transactionViewType = transactionViewType;
		this.exchangeRate = exchangeRate;
	}

	public AbmcAuditHeader(AbmcAuditHeaderId id, Integer createdTimestampTms, Integer modtimestampTms,
			Date transactionDate, Integer transNum, String docNum, String fob, Integer termsId, String termsName,
			Integer salesRepId, String salesRepName, Integer shipViaId, String shipViaName, int targetId,
			Integer numItemTargets, Date shipDate, Integer modUserId, String modUserName, byte isAuditTrailDataBool,
			byte isClosingDateExceptionBool, byte isDeletionBool, Integer deleteTms, Integer deleteUserId,
			String deleteUserName, String auditHeaderAbmId, Date dbModifiedTms, Date dbCreatedTms, int companyId,
			short lastAuditableAction, byte isSdkAppBool, int transactionViewType, Integer transactionCustomerId,
			Integer transactionVendorId, Integer transactionEmployeeId, Integer transactionOtherId,
			Short transactionNameType, String transactionNameText, Integer currencyId, double exchangeRate,
			String stickyNote) {
		this.id = id;
		this.createdTimestampTms = createdTimestampTms;
		this.modtimestampTms = modtimestampTms;
		this.transactionDate = transactionDate;
		this.transNum = transNum;
		this.docNum = docNum;
		this.fob = fob;
		this.termsId = termsId;
		this.termsName = termsName;
		this.salesRepId = salesRepId;
		this.salesRepName = salesRepName;
		this.shipViaId = shipViaId;
		this.shipViaName = shipViaName;
		this.targetId = targetId;
		this.numItemTargets = numItemTargets;
		this.shipDate = shipDate;
		this.modUserId = modUserId;
		this.modUserName = modUserName;
		this.isAuditTrailDataBool = isAuditTrailDataBool;
		this.isClosingDateExceptionBool = isClosingDateExceptionBool;
		this.isDeletionBool = isDeletionBool;
		this.deleteTms = deleteTms;
		this.deleteUserId = deleteUserId;
		this.deleteUserName = deleteUserName;
		this.auditHeaderAbmId = auditHeaderAbmId;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.companyId = companyId;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.transactionViewType = transactionViewType;
		this.transactionCustomerId = transactionCustomerId;
		this.transactionVendorId = transactionVendorId;
		this.transactionEmployeeId = transactionEmployeeId;
		this.transactionOtherId = transactionOtherId;
		this.transactionNameType = transactionNameType;
		this.transactionNameText = transactionNameText;
		this.currencyId = currencyId;
		this.exchangeRate = exchangeRate;
		this.stickyNote = stickyNote;
	}

	@EmbeddedId

	public AbmcAuditHeaderId getId() {
		return this.id;
	}

	public void setId(AbmcAuditHeaderId id) {
		this.id = id;
	}

	@Column(name = "created_timestamp_tms")
	public Integer getCreatedTimestampTms() {
		return this.createdTimestampTms;
	}

	public void setCreatedTimestampTms(Integer createdTimestampTms) {
		this.createdTimestampTms = createdTimestampTms;
	}

	@Column(name = "modtimestamp_tms")
	public Integer getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(Integer modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "transaction_date", length = 10)
	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Column(name = "trans_num")
	public Integer getTransNum() {
		return this.transNum;
	}

	public void setTransNum(Integer transNum) {
		this.transNum = transNum;
	}

	@Column(name = "doc_num", length = 26)
	public String getDocNum() {
		return this.docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	@Column(name = "fob", length = 14)
	public String getFob() {
		return this.fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	@Column(name = "terms_id")
	public Integer getTermsId() {
		return this.termsId;
	}

	public void setTermsId(Integer termsId) {
		this.termsId = termsId;
	}

	@Column(name = "terms_name", length = 250)
	public String getTermsName() {
		return this.termsName;
	}

	public void setTermsName(String termsName) {
		this.termsName = termsName;
	}

	@Column(name = "sales_rep_id")
	public Integer getSalesRepId() {
		return this.salesRepId;
	}

	public void setSalesRepId(Integer salesRepId) {
		this.salesRepId = salesRepId;
	}

	@Column(name = "sales_rep_name", length = 250)
	public String getSalesRepName() {
		return this.salesRepName;
	}

	public void setSalesRepName(String salesRepName) {
		this.salesRepName = salesRepName;
	}

	@Column(name = "ship_via_id")
	public Integer getShipViaId() {
		return this.shipViaId;
	}

	public void setShipViaId(Integer shipViaId) {
		this.shipViaId = shipViaId;
	}

	@Column(name = "ship_via_name", length = 250)
	public String getShipViaName() {
		return this.shipViaName;
	}

	public void setShipViaName(String shipViaName) {
		this.shipViaName = shipViaName;
	}

	@Column(name = "target_id", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "num_item_targets")
	public Integer getNumItemTargets() {
		return this.numItemTargets;
	}

	public void setNumItemTargets(Integer numItemTargets) {
		this.numItemTargets = numItemTargets;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ship_date", length = 10)
	public Date getShipDate() {
		return this.shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	@Column(name = "mod_user_id")
	public Integer getModUserId() {
		return this.modUserId;
	}

	public void setModUserId(Integer modUserId) {
		this.modUserId = modUserId;
	}

	@Column(name = "mod_user_name", length = 128)
	public String getModUserName() {
		return this.modUserName;
	}

	public void setModUserName(String modUserName) {
		this.modUserName = modUserName;
	}

	@Column(name = "is_audit_trail_data_bool", nullable = false)
	public byte getIsAuditTrailDataBool() {
		return this.isAuditTrailDataBool;
	}

	public void setIsAuditTrailDataBool(byte isAuditTrailDataBool) {
		this.isAuditTrailDataBool = isAuditTrailDataBool;
	}

	@Column(name = "is_closing_date_exception_bool", nullable = false)
	public byte getIsClosingDateExceptionBool() {
		return this.isClosingDateExceptionBool;
	}

	public void setIsClosingDateExceptionBool(byte isClosingDateExceptionBool) {
		this.isClosingDateExceptionBool = isClosingDateExceptionBool;
	}

	@Column(name = "is_deletion_bool", nullable = false)
	public byte getIsDeletionBool() {
		return this.isDeletionBool;
	}

	public void setIsDeletionBool(byte isDeletionBool) {
		this.isDeletionBool = isDeletionBool;
	}

	@Column(name = "delete_tms")
	public Integer getDeleteTms() {
		return this.deleteTms;
	}

	public void setDeleteTms(Integer deleteTms) {
		this.deleteTms = deleteTms;
	}

	@Column(name = "delete_user_id")
	public Integer getDeleteUserId() {
		return this.deleteUserId;
	}

	public void setDeleteUserId(Integer deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	@Column(name = "delete_user_name", length = 128)
	public String getDeleteUserName() {
		return this.deleteUserName;
	}

	public void setDeleteUserName(String deleteUserName) {
		this.deleteUserName = deleteUserName;
	}

	@Column(name = "audit_header_abm_id", nullable = false, length = 17)
	public String getAuditHeaderAbmId() {
		return this.auditHeaderAbmId;
	}

	public void setAuditHeaderAbmId(String auditHeaderAbmId) {
		this.auditHeaderAbmId = auditHeaderAbmId;
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

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "last_auditable_action", nullable = false)
	public short getLastAuditableAction() {
		return this.lastAuditableAction;
	}

	public void setLastAuditableAction(short lastAuditableAction) {
		this.lastAuditableAction = lastAuditableAction;
	}

	@Column(name = "is_sdk_app_bool", nullable = false)
	public byte getIsSdkAppBool() {
		return this.isSdkAppBool;
	}

	public void setIsSdkAppBool(byte isSdkAppBool) {
		this.isSdkAppBool = isSdkAppBool;
	}

	@Column(name = "transaction_view_type", nullable = false)
	public int getTransactionViewType() {
		return this.transactionViewType;
	}

	public void setTransactionViewType(int transactionViewType) {
		this.transactionViewType = transactionViewType;
	}

	@Column(name = "transaction_customer_id")
	public Integer getTransactionCustomerId() {
		return this.transactionCustomerId;
	}

	public void setTransactionCustomerId(Integer transactionCustomerId) {
		this.transactionCustomerId = transactionCustomerId;
	}

	@Column(name = "transaction_vendor_id")
	public Integer getTransactionVendorId() {
		return this.transactionVendorId;
	}

	public void setTransactionVendorId(Integer transactionVendorId) {
		this.transactionVendorId = transactionVendorId;
	}

	@Column(name = "transaction_employee_id")
	public Integer getTransactionEmployeeId() {
		return this.transactionEmployeeId;
	}

	public void setTransactionEmployeeId(Integer transactionEmployeeId) {
		this.transactionEmployeeId = transactionEmployeeId;
	}

	@Column(name = "transaction_other_id")
	public Integer getTransactionOtherId() {
		return this.transactionOtherId;
	}

	public void setTransactionOtherId(Integer transactionOtherId) {
		this.transactionOtherId = transactionOtherId;
	}

	@Column(name = "transaction_name_type")
	public Short getTransactionNameType() {
		return this.transactionNameType;
	}

	public void setTransactionNameType(Short transactionNameType) {
		this.transactionNameType = transactionNameType;
	}

	@Column(name = "transaction_name_text", length = 250)
	public String getTransactionNameText() {
		return this.transactionNameText;
	}

	public void setTransactionNameText(String transactionNameText) {
		this.transactionNameText = transactionNameText;
	}

	@Column(name = "currency_id")
	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "exchange_rate", nullable = false, precision = 22, scale = 0)
	public double getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Column(name = "sticky_note", length = 4000)
	public String getStickyNote() {
		return this.stickyNote;
	}

	public void setStickyNote(String stickyNote) {
		this.stickyNote = stickyNote;
	}

}
