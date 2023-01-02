package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcItemAssemblyHeader generated by hbm2java
 */
@Entity
@Table(name = "abmc_item_assembly_header")
public class AbmcItemAssemblyHeader implements java.io.Serializable {

	private int transactionId;
	private int targetId;
	private Integer itemId;
	private Date transactionDate;
	private String abmId;
	private Integer writeCount;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private Integer transNum;
	private Integer lastEditBy;
	private byte isNoPostBool;
	private byte isMemorizedTransactionBool;
	private byte isSplitBool;
	private byte isArapBool;
	private String docNum;
	private String docNumNumericpart;
	private byte isAlwaysTrackBool;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;
	private String memo;
	private short lastAuditableAction;
	private byte isSdkAppBool;
	private byte isToBePrintedBool;
	private Integer customStyleId;
	private Integer currencyId;
	private double exchangeRate;
	private byte hasAttachmentsBool;
	private String externalIdent;
	private String stickyNote;
	private Integer finalAssemblyTransactionId;

	public AbmcItemAssemblyHeader() {
	}

	public AbmcItemAssemblyHeader(int transactionId, int targetId, String abmId, byte isNoPostBool,
			byte isMemorizedTransactionBool, byte isSplitBool, byte isArapBool, byte isAlwaysTrackBool,
			Date dbCreatedTms, Date dbModifiedTms, short lastAuditableAction, byte isSdkAppBool, byte isToBePrintedBool,
			double exchangeRate, byte hasAttachmentsBool) {
		this.transactionId = transactionId;
		this.targetId = targetId;
		this.abmId = abmId;
		this.isNoPostBool = isNoPostBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isSplitBool = isSplitBool;
		this.isArapBool = isArapBool;
		this.isAlwaysTrackBool = isAlwaysTrackBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.isToBePrintedBool = isToBePrintedBool;
		this.exchangeRate = exchangeRate;
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	public AbmcItemAssemblyHeader(int transactionId, int targetId, Integer itemId, Date transactionDate, String abmId,
			Integer writeCount, Integer timestampTms, Integer modtimestampTms, Integer transNum, Integer lastEditBy,
			byte isNoPostBool, byte isMemorizedTransactionBool, byte isSplitBool, byte isArapBool, String docNum,
			String docNumNumericpart, byte isAlwaysTrackBool, Date dbCreatedTms, Date dbModifiedTms, Integer companyId,
			String memo, short lastAuditableAction, byte isSdkAppBool, byte isToBePrintedBool, Integer customStyleId,
			Integer currencyId, double exchangeRate, byte hasAttachmentsBool, String externalIdent, String stickyNote,
			Integer finalAssemblyTransactionId) {
		this.transactionId = transactionId;
		this.targetId = targetId;
		this.itemId = itemId;
		this.transactionDate = transactionDate;
		this.abmId = abmId;
		this.writeCount = writeCount;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.transNum = transNum;
		this.lastEditBy = lastEditBy;
		this.isNoPostBool = isNoPostBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isSplitBool = isSplitBool;
		this.isArapBool = isArapBool;
		this.docNum = docNum;
		this.docNumNumericpart = docNumNumericpart;
		this.isAlwaysTrackBool = isAlwaysTrackBool;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
		this.memo = memo;
		this.lastAuditableAction = lastAuditableAction;
		this.isSdkAppBool = isSdkAppBool;
		this.isToBePrintedBool = isToBePrintedBool;
		this.customStyleId = customStyleId;
		this.currencyId = currencyId;
		this.exchangeRate = exchangeRate;
		this.hasAttachmentsBool = hasAttachmentsBool;
		this.externalIdent = externalIdent;
		this.stickyNote = stickyNote;
		this.finalAssemblyTransactionId = finalAssemblyTransactionId;
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

	@Column(name = "item_id")
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "transaction_date", length = 10)
	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
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

	@Column(name = "last_edit_by")
	public Integer getLastEditBy() {
		return this.lastEditBy;
	}

	public void setLastEditBy(Integer lastEditBy) {
		this.lastEditBy = lastEditBy;
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

	@Column(name = "is_arap_bool", nullable = false)
	public byte getIsArapBool() {
		return this.isArapBool;
	}

	public void setIsArapBool(byte isArapBool) {
		this.isArapBool = isArapBool;
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

	@Column(name = "is_to_be_printed_bool", nullable = false)
	public byte getIsToBePrintedBool() {
		return this.isToBePrintedBool;
	}

	public void setIsToBePrintedBool(byte isToBePrintedBool) {
		this.isToBePrintedBool = isToBePrintedBool;
	}

	@Column(name = "custom_style_id")
	public Integer getCustomStyleId() {
		return this.customStyleId;
	}

	public void setCustomStyleId(Integer customStyleId) {
		this.customStyleId = customStyleId;
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

	@Column(name = "final_assembly_transaction_id")
	public Integer getFinalAssemblyTransactionId() {
		return this.finalAssemblyTransactionId;
	}

	public void setFinalAssemblyTransactionId(Integer finalAssemblyTransactionId) {
		this.finalAssemblyTransactionId = finalAssemblyTransactionId;
	}

}
