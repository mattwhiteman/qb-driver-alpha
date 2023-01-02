package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcCreditCardchargeHeader generated by hbm2java
 */
@Entity
@Table(name = "abmc_credit_cardcharge_header")
public class AbmcCreditCardchargeHeader implements java.io.Serializable {

	private int transactionId;
	private int targetId;
	private Date transactionDate;
	private Short transactionViewType;
	private Integer customerId;
	private Integer vendorId;
	private Integer employeeId;
	private Integer otherId;
	private String abmId;
	private String contactId;
	private Integer writeCount;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private Integer transNum;
	private String docNum;
	private String docNumNumericpart;
	private Integer lastEditBy;
	private Integer numItemTargets;
	private byte isNoPostBool;
	private byte isMemorizedTransactionBool;
	private byte isSplitBool;
	private Short clearedType;
	private byte isArapBool;
	private byte isRefundedBool;
	private Short transactionNameType;
	private byte isAlwaysTrackBool;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;
	private String memo;
	private byte isAmtInclTaxBool;
	private Integer taxCodeId;
	private short lastAuditableAction;
	private byte isSdkAppBool;
	private Integer currencyId;
	private double exchangeRate;
	private byte hasAttachmentsBool;
	private String externalIdent;
	private String stickyNote;

	public AbmcCreditCardchargeHeader() {
	}

	public AbmcCreditCardchargeHeader(int transactionId, int targetId, String abmId, byte isNoPostBool,
			byte isMemorizedTransactionBool, byte isSplitBool, byte isArapBool, byte isRefundedBool,
			byte isAlwaysTrackBool, Date dbCreatedTms, Date dbModifiedTms, byte isAmtInclTaxBool,
			short lastAuditableAction, byte isSdkAppBool, double exchangeRate, byte hasAttachmentsBool) {
		this.transactionId = transactionId;
		this.targetId = targetId;
		this.abmId = abmId;
		this.isNoPostBool = isNoPostBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isSplitBool = isSplitBool;
		this.isArapBool = isArapBool;
		this.isRefundedBool = isRefundedBool;
		this.isAlwaysTrackBool = isAlwaysTrackBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isAmtInclTaxBool = isAmtInclTaxBool;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.exchangeRate = exchangeRate;
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	public AbmcCreditCardchargeHeader(int transactionId, int targetId, Date transactionDate, Short transactionViewType,
			Integer customerId, Integer vendorId, Integer employeeId, Integer otherId, String abmId, String contactId,
			Integer writeCount, Integer timestampTms, Integer modtimestampTms, Integer transNum, String docNum,
			String docNumNumericpart, Integer lastEditBy, Integer numItemTargets, byte isNoPostBool,
			byte isMemorizedTransactionBool, byte isSplitBool, Short clearedType, byte isArapBool, byte isRefundedBool,
			Short transactionNameType, byte isAlwaysTrackBool, Date dbCreatedTms, Date dbModifiedTms, Integer companyId,
			String memo, byte isAmtInclTaxBool, Integer taxCodeId, short lastAuditableAction, byte isSdkAppBool,
			Integer currencyId, double exchangeRate, byte hasAttachmentsBool, String externalIdent, String stickyNote) {
		this.transactionId = transactionId;
		this.targetId = targetId;
		this.transactionDate = transactionDate;
		this.transactionViewType = transactionViewType;
		this.customerId = customerId;
		this.vendorId = vendorId;
		this.employeeId = employeeId;
		this.otherId = otherId;
		this.abmId = abmId;
		this.contactId = contactId;
		this.writeCount = writeCount;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.transNum = transNum;
		this.docNum = docNum;
		this.docNumNumericpart = docNumNumericpart;
		this.lastEditBy = lastEditBy;
		this.numItemTargets = numItemTargets;
		this.isNoPostBool = isNoPostBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isSplitBool = isSplitBool;
		this.clearedType = clearedType;
		this.isArapBool = isArapBool;
		this.isRefundedBool = isRefundedBool;
		this.transactionNameType = transactionNameType;
		this.isAlwaysTrackBool = isAlwaysTrackBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
		this.memo = memo;
		this.isAmtInclTaxBool = isAmtInclTaxBool;
		this.taxCodeId = taxCodeId;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.currencyId = currencyId;
		this.exchangeRate = exchangeRate;
		this.hasAttachmentsBool = hasAttachmentsBool;
		this.externalIdent = externalIdent;
		this.stickyNote = stickyNote;
	}

	@Id

	@Column(name = "transaction_id", unique = true, nullable = false)
	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "target_id", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "transaction_date", length = 10)
	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Column(name = "transaction_view_type")
	public Short getTransactionViewType() {
		return this.transactionViewType;
	}

	public void setTransactionViewType(Short transactionViewType) {
		this.transactionViewType = transactionViewType;
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

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
	}

	@Column(name = "contact_id", length = 17)
	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	@Column(name = "write_count")
	public Integer getWriteCount() {
		return this.writeCount;
	}

	public void setWriteCount(Integer writeCount) {
		this.writeCount = writeCount;
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

	@Column(name = "trans_num")
	public Integer getTransNum() {
		return this.transNum;
	}

	public void setTransNum(Integer transNum) {
		this.transNum = transNum;
	}

	@Column(name = "doc_num", length = 21)
	public String getDocNum() {
		return this.docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	@Column(name = "doc_num_numericpart", length = 21)
	public String getDocNumNumericpart() {
		return this.docNumNumericpart;
	}

	public void setDocNumNumericpart(String docNumNumericpart) {
		this.docNumNumericpart = docNumNumericpart;
	}

	@Column(name = "last_edit_by")
	public Integer getLastEditBy() {
		return this.lastEditBy;
	}

	public void setLastEditBy(Integer lastEditBy) {
		this.lastEditBy = lastEditBy;
	}

	@Column(name = "num_item_targets")
	public Integer getNumItemTargets() {
		return this.numItemTargets;
	}

	public void setNumItemTargets(Integer numItemTargets) {
		this.numItemTargets = numItemTargets;
	}

	@Column(name = "is_no_post_bool", nullable = false)
	public byte getIsNoPostBool() {
		return this.isNoPostBool;
	}

	public void setIsNoPostBool(byte isNoPostBool) {
		this.isNoPostBool = isNoPostBool;
	}

	@Column(name = "is_memorized_transaction_bool", nullable = false)
	public byte getIsMemorizedTransactionBool() {
		return this.isMemorizedTransactionBool;
	}

	public void setIsMemorizedTransactionBool(byte isMemorizedTransactionBool) {
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
	}

	@Column(name = "is_split_bool", nullable = false)
	public byte getIsSplitBool() {
		return this.isSplitBool;
	}

	public void setIsSplitBool(byte isSplitBool) {
		this.isSplitBool = isSplitBool;
	}

	@Column(name = "cleared_type")
	public Short getClearedType() {
		return this.clearedType;
	}

	public void setClearedType(Short clearedType) {
		this.clearedType = clearedType;
	}

	@Column(name = "is_arap_bool", nullable = false)
	public byte getIsArapBool() {
		return this.isArapBool;
	}

	public void setIsArapBool(byte isArapBool) {
		this.isArapBool = isArapBool;
	}

	@Column(name = "is_refunded_bool", nullable = false)
	public byte getIsRefundedBool() {
		return this.isRefundedBool;
	}

	public void setIsRefundedBool(byte isRefundedBool) {
		this.isRefundedBool = isRefundedBool;
	}

	@Column(name = "transaction_name_type")
	public Short getTransactionNameType() {
		return this.transactionNameType;
	}

	public void setTransactionNameType(Short transactionNameType) {
		this.transactionNameType = transactionNameType;
	}

	@Column(name = "is_always_track_bool", nullable = false)
	public byte getIsAlwaysTrackBool() {
		return this.isAlwaysTrackBool;
	}

	public void setIsAlwaysTrackBool(byte isAlwaysTrackBool) {
		this.isAlwaysTrackBool = isAlwaysTrackBool;
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

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "memo", length = 4096)
	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Column(name = "is_amt_incl_tax_bool", nullable = false)
	public byte getIsAmtInclTaxBool() {
		return this.isAmtInclTaxBool;
	}

	public void setIsAmtInclTaxBool(byte isAmtInclTaxBool) {
		this.isAmtInclTaxBool = isAmtInclTaxBool;
	}

	@Column(name = "tax_code_id")
	public Integer getTaxCodeId() {
		return this.taxCodeId;
	}

	public void setTaxCodeId(Integer taxCodeId) {
		this.taxCodeId = taxCodeId;
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

	@Column(name = "sticky_note", length = 4000)
	public String getStickyNote() {
		return this.stickyNote;
	}

	public void setStickyNote(String stickyNote) {
		this.stickyNote = stickyNote;
	}

}