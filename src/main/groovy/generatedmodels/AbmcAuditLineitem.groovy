package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAuditLineitem generated by hbm2java
 */
@Entity
@Table(name = "abmc_audit_lineitem")
public class AbmcAuditLineitem implements java.io.Serializable {

	private AbmcAuditLineitemId id;
	private int targetId;
	private Integer accountId;
	private String accountName;
	private Integer classId;
	private String className;
	private String docNum;
	private Integer lineitemCustomerId;
	private Integer lineitemVendorId;
	private Integer lineitemEmployeeId;
	private Integer lineitemOtherId;
	private Short lineitemNameType;
	private String lineitemNameText;
	private BigDecimal amountAmt;
	private BigDecimal amountQnty;
	private BigDecimal quantityAmt;
	private BigDecimal quantityQnty;
	private BigDecimal unitPriceAmt;
	private BigDecimal unitPriceQnty;
	private BigDecimal unitPricePct;
	private Integer itemId;
	private String itemName;
	private Integer paymentMethodId;
	private String paymentMethodName;
	private Date dueDate;
	private byte isSourceBool;
	private byte isDiscountBool;
	private Short clearedType;
	private byte isNoPostBool;
	private byte isSplitBool;
	private byte isToBePrintedBool;
	private byte isGroupendRowBool;
	private byte isAuditTrailDataBool;
	private byte isClosingDateExceptionBool;
	private Integer siblingAccountId;
	private String siblingAccountName;
	private Short transactionViewType;
	private Date billedDate;
	private Integer modUserId;
	private String modUserName;
	private String abmId;
	private Date dbModifiedTms;
	private Date dbCreatedTms;
	private String memo;
	private int companyId;
	private Integer siteId;
	private Integer unitId;
	private String auditHeaderAbmId;
	private Integer currencyId;
	private double exchangeRate;
	private BigDecimal foreignAmountAmt;
	private byte isGainLossTargetBool;
	private String currencyCode;
	private BigDecimal foreignAmountQnty;
	private String siteName;
	private String snList;
	private Integer rsbId;

	public AbmcAuditLineitem() {
	}

	public AbmcAuditLineitem(AbmcAuditLineitemId id, int targetId, byte isSourceBool, byte isDiscountBool,
			byte isNoPostBool, byte isSplitBool, byte isToBePrintedBool, byte isGroupendRowBool,
			byte isAuditTrailDataBool, byte isClosingDateExceptionBool, String abmId, Date dbModifiedTms,
			Date dbCreatedTms, int companyId, String auditHeaderAbmId, double exchangeRate, byte isGainLossTargetBool) {
		this.id = id;
		this.targetId = targetId;
		this.isSourceBool = isSourceBool;
		this.isDiscountBool = isDiscountBool;
		this.isNoPostBool = isNoPostBool;
		this.isSplitBool = isSplitBool;
		this.isToBePrintedBool = isToBePrintedBool;
		this.isGroupendRowBool = isGroupendRowBool;
		this.isAuditTrailDataBool = isAuditTrailDataBool;
		this.isClosingDateExceptionBool = isClosingDateExceptionBool;
		this.abmId = abmId;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.companyId = companyId;
		this.auditHeaderAbmId = auditHeaderAbmId;
		this.exchangeRate = exchangeRate;
		this.isGainLossTargetBool = isGainLossTargetBool;
	}

	public AbmcAuditLineitem(AbmcAuditLineitemId id, int targetId, Integer accountId, String accountName,
			Integer classId, String className, String docNum, Integer lineitemCustomerId, Integer lineitemVendorId,
			Integer lineitemEmployeeId, Integer lineitemOtherId, Short lineitemNameType, String lineitemNameText,
			BigDecimal amountAmt, BigDecimal amountQnty, BigDecimal quantityAmt, BigDecimal quantityQnty,
			BigDecimal unitPriceAmt, BigDecimal unitPriceQnty, BigDecimal unitPricePct, Integer itemId, String itemName,
			Integer paymentMethodId, String paymentMethodName, Date dueDate, byte isSourceBool, byte isDiscountBool,
			Short clearedType, byte isNoPostBool, byte isSplitBool, byte isToBePrintedBool, byte isGroupendRowBool,
			byte isAuditTrailDataBool, byte isClosingDateExceptionBool, Integer siblingAccountId,
			String siblingAccountName, Short transactionViewType, Date billedDate, Integer modUserId,
			String modUserName, String abmId, Date dbModifiedTms, Date dbCreatedTms, String memo, int companyId,
			Integer siteId, Integer unitId, String auditHeaderAbmId, Integer currencyId, double exchangeRate,
			BigDecimal foreignAmountAmt, byte isGainLossTargetBool, String currencyCode, BigDecimal foreignAmountQnty,
			String siteName, String snList, Integer rsbId) {
		this.id = id;
		this.targetId = targetId;
		this.accountId = accountId;
		this.accountName = accountName;
		this.classId = classId;
		this.className = className;
		this.docNum = docNum;
		this.lineitemCustomerId = lineitemCustomerId;
		this.lineitemVendorId = lineitemVendorId;
		this.lineitemEmployeeId = lineitemEmployeeId;
		this.lineitemOtherId = lineitemOtherId;
		this.lineitemNameType = lineitemNameType;
		this.lineitemNameText = lineitemNameText;
		this.amountAmt = amountAmt;
		this.amountQnty = amountQnty;
		this.quantityAmt = quantityAmt;
		this.quantityQnty = quantityQnty;
		this.unitPriceAmt = unitPriceAmt;
		this.unitPriceQnty = unitPriceQnty;
		this.unitPricePct = unitPricePct;
		this.itemId = itemId;
		this.itemName = itemName;
		this.paymentMethodId = paymentMethodId;
		this.paymentMethodName = paymentMethodName;
		this.dueDate = dueDate;
		this.isSourceBool = isSourceBool;
		this.isDiscountBool = isDiscountBool;
		this.clearedType = clearedType;
		this.isNoPostBool = isNoPostBool;
		this.isSplitBool = isSplitBool;
		this.isToBePrintedBool = isToBePrintedBool;
		this.isGroupendRowBool = isGroupendRowBool;
		this.isAuditTrailDataBool = isAuditTrailDataBool;
		this.isClosingDateExceptionBool = isClosingDateExceptionBool;
		this.siblingAccountId = siblingAccountId;
		this.siblingAccountName = siblingAccountName;
		this.transactionViewType = transactionViewType;
		this.billedDate = billedDate;
		this.modUserId = modUserId;
		this.modUserName = modUserName;
		this.abmId = abmId;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.memo = memo;
		this.companyId = companyId;
		this.siteId = siteId;
		this.unitId = unitId;
		this.auditHeaderAbmId = auditHeaderAbmId;
		this.currencyId = currencyId;
		this.exchangeRate = exchangeRate;
		this.foreignAmountAmt = foreignAmountAmt;
		this.isGainLossTargetBool = isGainLossTargetBool;
		this.currencyCode = currencyCode;
		this.foreignAmountQnty = foreignAmountQnty;
		this.siteName = siteName;
		this.snList = snList;
		this.rsbId = rsbId;
	}

	@EmbeddedId

	public AbmcAuditLineitemId getId() {
		return this.id;
	}

	public void setId(AbmcAuditLineitemId id) {
		this.id = id;
	}

	@Column(name = "target_id", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "account_id")
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(name = "account_name", length = 250)
	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	@Column(name = "class_id")
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "class_name", length = 250)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Column(name = "doc_num", length = 21)
	public String getDocNum() {
		return this.docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	@Column(name = "lineitem_customer_id")
	public Integer getLineitemCustomerId() {
		return this.lineitemCustomerId;
	}

	public void setLineitemCustomerId(Integer lineitemCustomerId) {
		this.lineitemCustomerId = lineitemCustomerId;
	}

	@Column(name = "lineitem_vendor_id")
	public Integer getLineitemVendorId() {
		return this.lineitemVendorId;
	}

	public void setLineitemVendorId(Integer lineitemVendorId) {
		this.lineitemVendorId = lineitemVendorId;
	}

	@Column(name = "lineitem_employee_id")
	public Integer getLineitemEmployeeId() {
		return this.lineitemEmployeeId;
	}

	public void setLineitemEmployeeId(Integer lineitemEmployeeId) {
		this.lineitemEmployeeId = lineitemEmployeeId;
	}

	@Column(name = "lineitem_other_id")
	public Integer getLineitemOtherId() {
		return this.lineitemOtherId;
	}

	public void setLineitemOtherId(Integer lineitemOtherId) {
		this.lineitemOtherId = lineitemOtherId;
	}

	@Column(name = "lineitem_name_type")
	public Short getLineitemNameType() {
		return this.lineitemNameType;
	}

	public void setLineitemNameType(Short lineitemNameType) {
		this.lineitemNameType = lineitemNameType;
	}

	@Column(name = "lineitem_name_text", length = 250)
	public String getLineitemNameText() {
		return this.lineitemNameText;
	}

	public void setLineitemNameText(String lineitemNameText) {
		this.lineitemNameText = lineitemNameText;
	}

	@Column(name = "amount_amt", precision = 20, scale = 5)
	public BigDecimal getAmountAmt() {
		return this.amountAmt;
	}

	public void setAmountAmt(BigDecimal amountAmt) {
		this.amountAmt = amountAmt;
	}

	@Column(name = "amount_qnty", precision = 20, scale = 5)
	public BigDecimal getAmountQnty() {
		return this.amountQnty;
	}

	public void setAmountQnty(BigDecimal amountQnty) {
		this.amountQnty = amountQnty;
	}

	@Column(name = "quantity_amt", precision = 20, scale = 5)
	public BigDecimal getQuantityAmt() {
		return this.quantityAmt;
	}

	public void setQuantityAmt(BigDecimal quantityAmt) {
		this.quantityAmt = quantityAmt;
	}

	@Column(name = "quantity_qnty", precision = 20, scale = 5)
	public BigDecimal getQuantityQnty() {
		return this.quantityQnty;
	}

	public void setQuantityQnty(BigDecimal quantityQnty) {
		this.quantityQnty = quantityQnty;
	}

	@Column(name = "unit_price_amt", precision = 20, scale = 5)
	public BigDecimal getUnitPriceAmt() {
		return this.unitPriceAmt;
	}

	public void setUnitPriceAmt(BigDecimal unitPriceAmt) {
		this.unitPriceAmt = unitPriceAmt;
	}

	@Column(name = "unit_price_qnty", precision = 20, scale = 5)
	public BigDecimal getUnitPriceQnty() {
		return this.unitPriceQnty;
	}

	public void setUnitPriceQnty(BigDecimal unitPriceQnty) {
		this.unitPriceQnty = unitPriceQnty;
	}

	@Column(name = "unit_price_pct", precision = 20, scale = 5)
	public BigDecimal getUnitPricePct() {
		return this.unitPricePct;
	}

	public void setUnitPricePct(BigDecimal unitPricePct) {
		this.unitPricePct = unitPricePct;
	}

	@Column(name = "item_id")
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Column(name = "item_name", length = 250)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Column(name = "payment_method_id")
	public Integer getPaymentMethodId() {
		return this.paymentMethodId;
	}

	public void setPaymentMethodId(Integer paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	@Column(name = "payment_method_name", length = 250)
	public String getPaymentMethodName() {
		return this.paymentMethodName;
	}

	public void setPaymentMethodName(String paymentMethodName) {
		this.paymentMethodName = paymentMethodName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "due_date", length = 10)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "is_source_bool", nullable = false)
	public byte getIsSourceBool() {
		return this.isSourceBool;
	}

	public void setIsSourceBool(byte isSourceBool) {
		this.isSourceBool = isSourceBool;
	}

	@Column(name = "is_discount_bool", nullable = false)
	public byte getIsDiscountBool() {
		return this.isDiscountBool;
	}

	public void setIsDiscountBool(byte isDiscountBool) {
		this.isDiscountBool = isDiscountBool;
	}

	@Column(name = "cleared_type")
	public Short getClearedType() {
		return this.clearedType;
	}

	public void setClearedType(Short clearedType) {
		this.clearedType = clearedType;
	}

	@Column(name = "is_no_post_bool", nullable = false)
	public byte getIsNoPostBool() {
		return this.isNoPostBool;
	}

	public void setIsNoPostBool(byte isNoPostBool) {
		this.isNoPostBool = isNoPostBool;
	}

	@Column(name = "is_split_bool", nullable = false)
	public byte getIsSplitBool() {
		return this.isSplitBool;
	}

	public void setIsSplitBool(byte isSplitBool) {
		this.isSplitBool = isSplitBool;
	}

	@Column(name = "is_to_be_printed_bool", nullable = false)
	public byte getIsToBePrintedBool() {
		return this.isToBePrintedBool;
	}

	public void setIsToBePrintedBool(byte isToBePrintedBool) {
		this.isToBePrintedBool = isToBePrintedBool;
	}

	@Column(name = "is_groupend_row_bool", nullable = false)
	public byte getIsGroupendRowBool() {
		return this.isGroupendRowBool;
	}

	public void setIsGroupendRowBool(byte isGroupendRowBool) {
		this.isGroupendRowBool = isGroupendRowBool;
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

	@Column(name = "sibling_account_id")
	public Integer getSiblingAccountId() {
		return this.siblingAccountId;
	}

	public void setSiblingAccountId(Integer siblingAccountId) {
		this.siblingAccountId = siblingAccountId;
	}

	@Column(name = "sibling_account_name", length = 250)
	public String getSiblingAccountName() {
		return this.siblingAccountName;
	}

	public void setSiblingAccountName(String siblingAccountName) {
		this.siblingAccountName = siblingAccountName;
	}

	@Column(name = "transaction_view_type")
	public Short getTransactionViewType() {
		return this.transactionViewType;
	}

	public void setTransactionViewType(Short transactionViewType) {
		this.transactionViewType = transactionViewType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "billed_date", length = 10)
	public Date getBilledDate() {
		return this.billedDate;
	}

	public void setBilledDate(Date billedDate) {
		this.billedDate = billedDate;
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

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
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

	@Column(name = "site_id")
	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	@Column(name = "unit_id")
	public Integer getUnitId() {
		return this.unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	@Column(name = "audit_header_abm_id", nullable = false, length = 17)
	public String getAuditHeaderAbmId() {
		return this.auditHeaderAbmId;
	}

	public void setAuditHeaderAbmId(String auditHeaderAbmId) {
		this.auditHeaderAbmId = auditHeaderAbmId;
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

	@Column(name = "foreign_amount_amt", precision = 20, scale = 5)
	public BigDecimal getForeignAmountAmt() {
		return this.foreignAmountAmt;
	}

	public void setForeignAmountAmt(BigDecimal foreignAmountAmt) {
		this.foreignAmountAmt = foreignAmountAmt;
	}

	@Column(name = "is_gain_loss_target_bool", nullable = false)
	public byte getIsGainLossTargetBool() {
		return this.isGainLossTargetBool;
	}

	public void setIsGainLossTargetBool(byte isGainLossTargetBool) {
		this.isGainLossTargetBool = isGainLossTargetBool;
	}

	@Column(name = "currency_code", length = 101)
	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column(name = "foreign_amount_qnty", precision = 20, scale = 5)
	public BigDecimal getForeignAmountQnty() {
		return this.foreignAmountQnty;
	}

	public void setForeignAmountQnty(BigDecimal foreignAmountQnty) {
		this.foreignAmountQnty = foreignAmountQnty;
	}

	@Column(name = "site_name", length = 32)
	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Column(name = "sn_list", length = 4096)
	public String getSnList() {
		return this.snList;
	}

	public void setSnList(String snList) {
		this.snList = snList;
	}

	@Column(name = "rsb_id")
	public Integer getRsbId() {
		return this.rsbId;
	}

	public void setRsbId(Integer rsbId) {
		this.rsbId = rsbId;
	}

}