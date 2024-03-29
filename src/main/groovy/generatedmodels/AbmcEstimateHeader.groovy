package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcEstimateHeader generated by hbm2java
 */
@Entity
@Table(name = "abmc_estimate_header")
public class AbmcEstimateHeader implements java.io.Serializable {

	private int transactionId;
	private int targetId;
	private Date transactionDate;
	private Integer customerId;
	private Integer salesTaxCodeId;
	private Integer termsId;
	private Integer salesRepId;
	private String shipToId;
	private String contactId;
	private Integer customStyleId;
	private Integer customerMessageId;
	private Date latestLinkDate;
	private Integer writeCount;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private Integer transNum;
	private byte isNoPostBool;
	private byte isMemorizedTransactionBool;
	private Integer lastEditBy;
	private byte isToBePrintedBool;
	private byte isToBeSentBool;
	private byte isSplitBool;
	private Short clearedType;
	private byte isArapBool;
	private Date shipDate;
	private Date deliveryDate;
	private byte isOldTranTaxBool;
	private byte isSaleBool;
	private byte isFinanceChargeBool;
	private String docNum;
	private String docNumNumericpart;
	private String poNum;
	private Date dueDate;
	private String fob;
	private String abmId;
	private byte isAlwaysTrackBool;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private String other;
	private Integer companyId;
	private String memo;
	private byte isAmtInclTaxBool;
	private String companyTaxNumber;
	private short lastAuditableAction;
	private byte isSdkAppBool;
	private Integer currencyId;
	private double exchangeRate;
	private byte hasAttachmentsBool;
	private String externalIdent;
	private Integer siteId;
	private String stickyNote;
	private Integer transactionSendformsId;

	public AbmcEstimateHeader() {
	}

	public AbmcEstimateHeader(int transactionId, int targetId, byte isNoPostBool, byte isMemorizedTransactionBool,
			byte isToBePrintedBool, byte isToBeSentBool, byte isSplitBool, byte isArapBool, byte isOldTranTaxBool,
			byte isSaleBool, byte isFinanceChargeBool, String abmId, byte isAlwaysTrackBool, Date dbCreatedTms,
			Date dbModifiedTms, byte isAmtInclTaxBool, short lastAuditableAction, byte isSdkAppBool,
			double exchangeRate, byte hasAttachmentsBool) {
		this.transactionId = transactionId;
		this.targetId = targetId;
		this.isNoPostBool = isNoPostBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isToBePrintedBool = isToBePrintedBool;
		this.isToBeSentBool = isToBeSentBool;
		this.isSplitBool = isSplitBool;
		this.isArapBool = isArapBool;
		this.isOldTranTaxBool = isOldTranTaxBool;
		this.isSaleBool = isSaleBool;
		this.isFinanceChargeBool = isFinanceChargeBool;
		this.abmId = abmId;
		this.isAlwaysTrackBool = isAlwaysTrackBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isAmtInclTaxBool = isAmtInclTaxBool;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.exchangeRate = exchangeRate;
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	public AbmcEstimateHeader(int transactionId, int targetId, Date transactionDate, Integer customerId,
			Integer salesTaxCodeId, Integer termsId, Integer salesRepId, String shipToId, String contactId,
			Integer customStyleId, Integer customerMessageId, Date latestLinkDate, Integer writeCount,
			Integer timestampTms, Integer modtimestampTms, Integer transNum, byte isNoPostBool,
			byte isMemorizedTransactionBool, Integer lastEditBy, byte isToBePrintedBool, byte isToBeSentBool,
			byte isSplitBool, Short clearedType, byte isArapBool, Date shipDate, Date deliveryDate,
			byte isOldTranTaxBool, byte isSaleBool, byte isFinanceChargeBool, String docNum, String docNumNumericpart,
			String poNum, Date dueDate, String fob, String abmId, byte isAlwaysTrackBool, Date dbCreatedTms,
			Date dbModifiedTms, String other, Integer companyId, String memo, byte isAmtInclTaxBool,
			String companyTaxNumber, short lastAuditableAction, byte isSdkAppBool, Integer currencyId,
			double exchangeRate, byte hasAttachmentsBool, String externalIdent, Integer siteId, String stickyNote,
			Integer transactionSendformsId) {
		this.transactionId = transactionId;
		this.targetId = targetId;
		this.transactionDate = transactionDate;
		this.customerId = customerId;
		this.salesTaxCodeId = salesTaxCodeId;
		this.termsId = termsId;
		this.salesRepId = salesRepId;
		this.shipToId = shipToId;
		this.contactId = contactId;
		this.customStyleId = customStyleId;
		this.customerMessageId = customerMessageId;
		this.latestLinkDate = latestLinkDate;
		this.writeCount = writeCount;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.transNum = transNum;
		this.isNoPostBool = isNoPostBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.lastEditBy = lastEditBy;
		this.isToBePrintedBool = isToBePrintedBool;
		this.isToBeSentBool = isToBeSentBool;
		this.isSplitBool = isSplitBool;
		this.clearedType = clearedType;
		this.isArapBool = isArapBool;
		this.shipDate = shipDate;
		this.deliveryDate = deliveryDate;
		this.isOldTranTaxBool = isOldTranTaxBool;
		this.isSaleBool = isSaleBool;
		this.isFinanceChargeBool = isFinanceChargeBool;
		this.docNum = docNum;
		this.docNumNumericpart = docNumNumericpart;
		this.poNum = poNum;
		this.dueDate = dueDate;
		this.fob = fob;
		this.abmId = abmId;
		this.isAlwaysTrackBool = isAlwaysTrackBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.other = other;
		this.companyId = companyId;
		this.memo = memo;
		this.isAmtInclTaxBool = isAmtInclTaxBool;
		this.companyTaxNumber = companyTaxNumber;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.currencyId = currencyId;
		this.exchangeRate = exchangeRate;
		this.hasAttachmentsBool = hasAttachmentsBool;
		this.externalIdent = externalIdent;
		this.siteId = siteId;
		this.stickyNote = stickyNote;
		this.transactionSendformsId = transactionSendformsId;
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

	@Column(name = "customer_id")
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "sales_tax_code_id")
	public Integer getSalesTaxCodeId() {
		return this.salesTaxCodeId;
	}

	public void setSalesTaxCodeId(Integer salesTaxCodeId) {
		this.salesTaxCodeId = salesTaxCodeId;
	}

	@Column(name = "terms_id")
	public Integer getTermsId() {
		return this.termsId;
	}

	public void setTermsId(Integer termsId) {
		this.termsId = termsId;
	}

	@Column(name = "sales_rep_id")
	public Integer getSalesRepId() {
		return this.salesRepId;
	}

	public void setSalesRepId(Integer salesRepId) {
		this.salesRepId = salesRepId;
	}

	@Column(name = "ship_to_id", length = 17)
	public String getShipToId() {
		return this.shipToId;
	}

	public void setShipToId(String shipToId) {
		this.shipToId = shipToId;
	}

	@Column(name = "contact_id", length = 17)
	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	@Column(name = "custom_style_id")
	public Integer getCustomStyleId() {
		return this.customStyleId;
	}

	public void setCustomStyleId(Integer customStyleId) {
		this.customStyleId = customStyleId;
	}

	@Column(name = "customer_message_id")
	public Integer getCustomerMessageId() {
		return this.customerMessageId;
	}

	public void setCustomerMessageId(Integer customerMessageId) {
		this.customerMessageId = customerMessageId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "latest_link_date", length = 10)
	public Date getLatestLinkDate() {
		return this.latestLinkDate;
	}

	public void setLatestLinkDate(Date latestLinkDate) {
		this.latestLinkDate = latestLinkDate;
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

	@Column(name = "last_edit_by")
	public Integer getLastEditBy() {
		return this.lastEditBy;
	}

	public void setLastEditBy(Integer lastEditBy) {
		this.lastEditBy = lastEditBy;
	}

	@Column(name = "is_to_be_printed_bool", nullable = false)
	public byte getIsToBePrintedBool() {
		return this.isToBePrintedBool;
	}

	public void setIsToBePrintedBool(byte isToBePrintedBool) {
		this.isToBePrintedBool = isToBePrintedBool;
	}

	@Column(name = "is_to_be_sent_bool", nullable = false)
	public byte getIsToBeSentBool() {
		return this.isToBeSentBool;
	}

	public void setIsToBeSentBool(byte isToBeSentBool) {
		this.isToBeSentBool = isToBeSentBool;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "ship_date", length = 10)
	public Date getShipDate() {
		return this.shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "delivery_date", length = 10)
	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Column(name = "is_old_tran_tax_bool", nullable = false)
	public byte getIsOldTranTaxBool() {
		return this.isOldTranTaxBool;
	}

	public void setIsOldTranTaxBool(byte isOldTranTaxBool) {
		this.isOldTranTaxBool = isOldTranTaxBool;
	}

	@Column(name = "is_sale_bool", nullable = false)
	public byte getIsSaleBool() {
		return this.isSaleBool;
	}

	public void setIsSaleBool(byte isSaleBool) {
		this.isSaleBool = isSaleBool;
	}

	@Column(name = "is_finance_charge_bool", nullable = false)
	public byte getIsFinanceChargeBool() {
		return this.isFinanceChargeBool;
	}

	public void setIsFinanceChargeBool(byte isFinanceChargeBool) {
		this.isFinanceChargeBool = isFinanceChargeBool;
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

	@Column(name = "po_num", length = 26)
	public String getPoNum() {
		return this.poNum;
	}

	public void setPoNum(String poNum) {
		this.poNum = poNum;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "due_date", length = 10)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "fob", length = 14)
	public String getFob() {
		return this.fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
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

	@Column(name = "other", length = 30)
	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
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

	@Column(name = "company_tax_number", length = 21)
	public String getCompanyTaxNumber() {
		return this.companyTaxNumber;
	}

	public void setCompanyTaxNumber(String companyTaxNumber) {
		this.companyTaxNumber = companyTaxNumber;
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

	@Column(name = "site_id")
	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	@Column(name = "sticky_note", length = 4000)
	public String getStickyNote() {
		return this.stickyNote;
	}

	public void setStickyNote(String stickyNote) {
		this.stickyNote = stickyNote;
	}

	@Column(name = "transaction_sendforms_id")
	public Integer getTransactionSendformsId() {
		return this.transactionSendformsId;
	}

	public void setTransactionSendformsId(Integer transactionSendformsId) {
		this.transactionSendformsId = transactionSendformsId;
	}

}
