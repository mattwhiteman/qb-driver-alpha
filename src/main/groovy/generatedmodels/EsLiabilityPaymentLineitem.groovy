package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsLiabilityPaymentLineitem generated by hbm2java
 */
@Entity
@Table(name = "es_liability_payment_lineitem")
public class EsLiabilityPaymentLineitem implements java.io.Serializable {

	private int targetId;
	private int transactionId;
	private Integer accountId;
	private Date transactionDate;
	private Short transactionViewType;
	private Integer customerId;
	private Integer vendorId;
	private Integer otherId;
	private Integer nextTargetId;
	private Integer payrollItemId;
	private Integer classId;
	private Integer siblingAccountId;
	private String contactId;
	private Integer writeCount;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private Integer lastEditBy;
	private byte isSourceBool;
	private byte isSplitBool;
	private byte isHasPayitemBool;
	private byte isPurchaseBool;
	private byte isMemorizedTransactionBool;
	private byte isPaidBool;
	private byte isDepositedBool;
	private String docNum;
	private String docNumNumericpart;
	private Short transactionNameType;
	private Short lineitemNameType;
	private Date payrollDate;
	private BigDecimal amountAmt;
	private Short clearedType;
	private Short reimbursedType;
	private byte efpIsPenaltyBool;
	private byte efpIsInterestBool;
	private Date reconcileDate;
	private BigDecimal openBalanceAmt;
	private Date latestLinkDate;
	private String abmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;
	private String memo;
	private Integer currencyId;
	private double exchangeRate;
	private BigDecimal foreignAmountAmt;
	private byte isGainLossTargetBool;
	private BigDecimal netOpenBalanceAmt;
	private BigDecimal taxOpenBalanceAmt;
	private BigDecimal grossOpenBalanceAmt;
	private Integer employeeId;
	private Integer empPayItemIdNum;
	private Integer txnLineOrder;

	public EsLiabilityPaymentLineitem() {
	}

	public EsLiabilityPaymentLineitem(int targetId, int transactionId, byte isSourceBool, byte isSplitBool,
			byte isHasPayitemBool, byte isPurchaseBool, byte isMemorizedTransactionBool, byte isPaidBool,
			byte isDepositedBool, byte efpIsPenaltyBool, byte efpIsInterestBool, String abmId, Date dbCreatedTms,
			Date dbModifiedTms, double exchangeRate, byte isGainLossTargetBool) {
		this.targetId = targetId;
		this.transactionId = transactionId;
		this.isSourceBool = isSourceBool;
		this.isSplitBool = isSplitBool;
		this.isHasPayitemBool = isHasPayitemBool;
		this.isPurchaseBool = isPurchaseBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isPaidBool = isPaidBool;
		this.isDepositedBool = isDepositedBool;
		this.efpIsPenaltyBool = efpIsPenaltyBool;
		this.efpIsInterestBool = efpIsInterestBool;
		this.abmId = abmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.exchangeRate = exchangeRate;
		this.isGainLossTargetBool = isGainLossTargetBool;
	}

	public EsLiabilityPaymentLineitem(int targetId, int transactionId, Integer accountId, Date transactionDate,
			Short transactionViewType, Integer customerId, Integer vendorId, Integer otherId, Integer nextTargetId,
			Integer payrollItemId, Integer classId, Integer siblingAccountId, String contactId, Integer writeCount,
			Integer timestampTms, Integer modtimestampTms, Integer lastEditBy, byte isSourceBool, byte isSplitBool,
			byte isHasPayitemBool, byte isPurchaseBool, byte isMemorizedTransactionBool, byte isPaidBool,
			byte isDepositedBool, String docNum, String docNumNumericpart, Short transactionNameType,
			Short lineitemNameType, Date payrollDate, BigDecimal amountAmt, Short clearedType, Short reimbursedType,
			byte efpIsPenaltyBool, byte efpIsInterestBool, Date reconcileDate, BigDecimal openBalanceAmt,
			Date latestLinkDate, String abmId, Date dbCreatedTms, Date dbModifiedTms, Integer companyId, String memo,
			Integer currencyId, double exchangeRate, BigDecimal foreignAmountAmt, byte isGainLossTargetBool,
			BigDecimal netOpenBalanceAmt, BigDecimal taxOpenBalanceAmt, BigDecimal grossOpenBalanceAmt,
			Integer employeeId, Integer empPayItemIdNum, Integer txnLineOrder) {
		this.targetId = targetId;
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.transactionDate = transactionDate;
		this.transactionViewType = transactionViewType;
		this.customerId = customerId;
		this.vendorId = vendorId;
		this.otherId = otherId;
		this.nextTargetId = nextTargetId;
		this.payrollItemId = payrollItemId;
		this.classId = classId;
		this.siblingAccountId = siblingAccountId;
		this.contactId = contactId;
		this.writeCount = writeCount;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.lastEditBy = lastEditBy;
		this.isSourceBool = isSourceBool;
		this.isSplitBool = isSplitBool;
		this.isHasPayitemBool = isHasPayitemBool;
		this.isPurchaseBool = isPurchaseBool;
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
		this.isPaidBool = isPaidBool;
		this.isDepositedBool = isDepositedBool;
		this.docNum = docNum;
		this.docNumNumericpart = docNumNumericpart;
		this.transactionNameType = transactionNameType;
		this.lineitemNameType = lineitemNameType;
		this.payrollDate = payrollDate;
		this.amountAmt = amountAmt;
		this.clearedType = clearedType;
		this.reimbursedType = reimbursedType;
		this.efpIsPenaltyBool = efpIsPenaltyBool;
		this.efpIsInterestBool = efpIsInterestBool;
		this.reconcileDate = reconcileDate;
		this.openBalanceAmt = openBalanceAmt;
		this.latestLinkDate = latestLinkDate;
		this.abmId = abmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
		this.memo = memo;
		this.currencyId = currencyId;
		this.exchangeRate = exchangeRate;
		this.foreignAmountAmt = foreignAmountAmt;
		this.isGainLossTargetBool = isGainLossTargetBool;
		this.netOpenBalanceAmt = netOpenBalanceAmt;
		this.taxOpenBalanceAmt = taxOpenBalanceAmt;
		this.grossOpenBalanceAmt = grossOpenBalanceAmt;
		this.employeeId = employeeId;
		this.empPayItemIdNum = empPayItemIdNum;
		this.txnLineOrder = txnLineOrder;
	}

	@Id

	@Column(name = "target_id", unique = true, nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "transaction_id", nullable = false)
	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "account_id")
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	@Column(name = "other_id")
	public Integer getOtherId() {
		return this.otherId;
	}

	public void setOtherId(Integer otherId) {
		this.otherId = otherId;
	}

	@Column(name = "next_target_id")
	public Integer getNextTargetId() {
		return this.nextTargetId;
	}

	public void setNextTargetId(Integer nextTargetId) {
		this.nextTargetId = nextTargetId;
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

	@Column(name = "sibling_account_id")
	public Integer getSiblingAccountId() {
		return this.siblingAccountId;
	}

	public void setSiblingAccountId(Integer siblingAccountId) {
		this.siblingAccountId = siblingAccountId;
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

	@Column(name = "last_edit_by")
	public Integer getLastEditBy() {
		return this.lastEditBy;
	}

	public void setLastEditBy(Integer lastEditBy) {
		this.lastEditBy = lastEditBy;
	}

	@Column(name = "is_source_bool", nullable = false)
	public byte getIsSourceBool() {
		return this.isSourceBool;
	}

	public void setIsSourceBool(byte isSourceBool) {
		this.isSourceBool = isSourceBool;
	}

	@Column(name = "is_split_bool", nullable = false)
	public byte getIsSplitBool() {
		return this.isSplitBool;
	}

	public void setIsSplitBool(byte isSplitBool) {
		this.isSplitBool = isSplitBool;
	}

	@Column(name = "is_has_payitem_bool", nullable = false)
	public byte getIsHasPayitemBool() {
		return this.isHasPayitemBool;
	}

	public void setIsHasPayitemBool(byte isHasPayitemBool) {
		this.isHasPayitemBool = isHasPayitemBool;
	}

	@Column(name = "is_purchase_bool", nullable = false)
	public byte getIsPurchaseBool() {
		return this.isPurchaseBool;
	}

	public void setIsPurchaseBool(byte isPurchaseBool) {
		this.isPurchaseBool = isPurchaseBool;
	}

	@Column(name = "is_memorized_transaction_bool", nullable = false)
	public byte getIsMemorizedTransactionBool() {
		return this.isMemorizedTransactionBool;
	}

	public void setIsMemorizedTransactionBool(byte isMemorizedTransactionBool) {
		this.isMemorizedTransactionBool = isMemorizedTransactionBool;
	}

	@Column(name = "is_paid_bool", nullable = false)
	public byte getIsPaidBool() {
		return this.isPaidBool;
	}

	public void setIsPaidBool(byte isPaidBool) {
		this.isPaidBool = isPaidBool;
	}

	@Column(name = "is_deposited_bool", nullable = false)
	public byte getIsDepositedBool() {
		return this.isDepositedBool;
	}

	public void setIsDepositedBool(byte isDepositedBool) {
		this.isDepositedBool = isDepositedBool;
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

	@Column(name = "transaction_name_type")
	public Short getTransactionNameType() {
		return this.transactionNameType;
	}

	public void setTransactionNameType(Short transactionNameType) {
		this.transactionNameType = transactionNameType;
	}

	@Column(name = "lineitem_name_type")
	public Short getLineitemNameType() {
		return this.lineitemNameType;
	}

	public void setLineitemNameType(Short lineitemNameType) {
		this.lineitemNameType = lineitemNameType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "payroll_date", length = 10)
	public Date getPayrollDate() {
		return this.payrollDate;
	}

	public void setPayrollDate(Date payrollDate) {
		this.payrollDate = payrollDate;
	}

	@Column(name = "amount_amt", precision = 20, scale = 5)
	public BigDecimal getAmountAmt() {
		return this.amountAmt;
	}

	public void setAmountAmt(BigDecimal amountAmt) {
		this.amountAmt = amountAmt;
	}

	@Column(name = "cleared_type")
	public Short getClearedType() {
		return this.clearedType;
	}

	public void setClearedType(Short clearedType) {
		this.clearedType = clearedType;
	}

	@Column(name = "reimbursed_type")
	public Short getReimbursedType() {
		return this.reimbursedType;
	}

	public void setReimbursedType(Short reimbursedType) {
		this.reimbursedType = reimbursedType;
	}

	@Column(name = "efp_is_penalty_bool", nullable = false)
	public byte getEfpIsPenaltyBool() {
		return this.efpIsPenaltyBool;
	}

	public void setEfpIsPenaltyBool(byte efpIsPenaltyBool) {
		this.efpIsPenaltyBool = efpIsPenaltyBool;
	}

	@Column(name = "efp_is_interest_bool", nullable = false)
	public byte getEfpIsInterestBool() {
		return this.efpIsInterestBool;
	}

	public void setEfpIsInterestBool(byte efpIsInterestBool) {
		this.efpIsInterestBool = efpIsInterestBool;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "reconcile_date", length = 10)
	public Date getReconcileDate() {
		return this.reconcileDate;
	}

	public void setReconcileDate(Date reconcileDate) {
		this.reconcileDate = reconcileDate;
	}

	@Column(name = "open_balance_amt", precision = 20, scale = 5)
	public BigDecimal getOpenBalanceAmt() {
		return this.openBalanceAmt;
	}

	public void setOpenBalanceAmt(BigDecimal openBalanceAmt) {
		this.openBalanceAmt = openBalanceAmt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "latest_link_date", length = 10)
	public Date getLatestLinkDate() {
		return this.latestLinkDate;
	}

	public void setLatestLinkDate(Date latestLinkDate) {
		this.latestLinkDate = latestLinkDate;
	}

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
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

	@Column(name = "net_open_balance_amt", precision = 20, scale = 5)
	public BigDecimal getNetOpenBalanceAmt() {
		return this.netOpenBalanceAmt;
	}

	public void setNetOpenBalanceAmt(BigDecimal netOpenBalanceAmt) {
		this.netOpenBalanceAmt = netOpenBalanceAmt;
	}

	@Column(name = "tax_open_balance_amt", precision = 20, scale = 5)
	public BigDecimal getTaxOpenBalanceAmt() {
		return this.taxOpenBalanceAmt;
	}

	public void setTaxOpenBalanceAmt(BigDecimal taxOpenBalanceAmt) {
		this.taxOpenBalanceAmt = taxOpenBalanceAmt;
	}

	@Column(name = "gross_open_balance_amt", precision = 20, scale = 5)
	public BigDecimal getGrossOpenBalanceAmt() {
		return this.grossOpenBalanceAmt;
	}

	public void setGrossOpenBalanceAmt(BigDecimal grossOpenBalanceAmt) {
		this.grossOpenBalanceAmt = grossOpenBalanceAmt;
	}

	@Column(name = "employee_id")
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "emp_Pay_Item_Id_Num")
	public Integer getEmpPayItemIdNum() {
		return this.empPayItemIdNum;
	}

	public void setEmpPayItemIdNum(Integer empPayItemIdNum) {
		this.empPayItemIdNum = empPayItemIdNum;
	}

	@Column(name = "txn_line_order")
	public Integer getTxnLineOrder() {
		return this.txnLineOrder;
	}

	public void setTxnLineOrder(Integer txnLineOrder) {
		this.txnLineOrder = txnLineOrder;
	}

}
