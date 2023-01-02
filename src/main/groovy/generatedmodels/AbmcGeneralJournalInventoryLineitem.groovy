package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcGeneralJournalInventoryLineitem generated by hbm2java
 */
@Entity
@Table(name = "abmc_general_journal_inventory_lineitem")
public class AbmcGeneralJournalInventoryLineitem implements java.io.Serializable {

	private int inventoryRecordId;
	private int targetType;
	private int targetId;
	private Integer purchaseTransactionId;
	private Integer purchaseTargetId;
	private Short purchaseTransactionViewType;
	private Date purchaseTransactionDate;
	private Integer accountId;
	private BigDecimal amountAmt;
	private BigDecimal quantityQnty;
	private String abmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;
	private BigDecimal foreignAmountAmt;

	public AbmcGeneralJournalInventoryLineitem() {
	}

	public AbmcGeneralJournalInventoryLineitem(int inventoryRecordId, int targetType, int targetId, String abmId,
			Date dbCreatedTms, Date dbModifiedTms) {
		this.inventoryRecordId = inventoryRecordId;
		this.targetType = targetType;
		this.targetId = targetId;
		this.abmId = abmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcGeneralJournalInventoryLineitem(int inventoryRecordId, int targetType, int targetId,
			Integer purchaseTransactionId, Integer purchaseTargetId, Short purchaseTransactionViewType,
			Date purchaseTransactionDate, Integer accountId, BigDecimal amountAmt, BigDecimal quantityQnty,
			String abmId, Date dbCreatedTms, Date dbModifiedTms, Integer companyId, BigDecimal foreignAmountAmt) {
		this.inventoryRecordId = inventoryRecordId;
		this.targetType = targetType;
		this.targetId = targetId;
		this.purchaseTransactionId = purchaseTransactionId;
		this.purchaseTargetId = purchaseTargetId;
		this.purchaseTransactionViewType = purchaseTransactionViewType;
		this.purchaseTransactionDate = purchaseTransactionDate;
		this.accountId = accountId;
		this.amountAmt = amountAmt;
		this.quantityQnty = quantityQnty;
		this.abmId = abmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
		this.foreignAmountAmt = foreignAmountAmt;
	}

	@Id

	@Column(name = "inventory_record_id", unique = true, nullable = false)
	public int getInventoryRecordId() {
		return this.inventoryRecordId;
	}

	public void setInventoryRecordId(int inventoryRecordId) {
		this.inventoryRecordId = inventoryRecordId;
	}

	@Column(name = "target_type", nullable = false)
	public int getTargetType() {
		return this.targetType;
	}

	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}

	@Column(name = "target_id", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "purchase_transaction_id")
	public Integer getPurchaseTransactionId() {
		return this.purchaseTransactionId;
	}

	public void setPurchaseTransactionId(Integer purchaseTransactionId) {
		this.purchaseTransactionId = purchaseTransactionId;
	}

	@Column(name = "purchase_target_id")
	public Integer getPurchaseTargetId() {
		return this.purchaseTargetId;
	}

	public void setPurchaseTargetId(Integer purchaseTargetId) {
		this.purchaseTargetId = purchaseTargetId;
	}

	@Column(name = "purchase_transaction_view_type")
	public Short getPurchaseTransactionViewType() {
		return this.purchaseTransactionViewType;
	}

	public void setPurchaseTransactionViewType(Short purchaseTransactionViewType) {
		this.purchaseTransactionViewType = purchaseTransactionViewType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "purchase_transaction_date", length = 10)
	public Date getPurchaseTransactionDate() {
		return this.purchaseTransactionDate;
	}

	public void setPurchaseTransactionDate(Date purchaseTransactionDate) {
		this.purchaseTransactionDate = purchaseTransactionDate;
	}

	@Column(name = "account_id")
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(name = "amount_amt", precision = 20, scale = 5)
	public BigDecimal getAmountAmt() {
		return this.amountAmt;
	}

	public void setAmountAmt(BigDecimal amountAmt) {
		this.amountAmt = amountAmt;
	}

	@Column(name = "quantity_qnty", precision = 20, scale = 5)
	public BigDecimal getQuantityQnty() {
		return this.quantityQnty;
	}

	public void setQuantityQnty(BigDecimal quantityQnty) {
		this.quantityQnty = quantityQnty;
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

	@Column(name = "foreign_amount_amt", precision = 20, scale = 5)
	public BigDecimal getForeignAmountAmt() {
		return this.foreignAmountAmt;
	}

	public void setForeignAmountAmt(BigDecimal foreignAmountAmt) {
		this.foreignAmountAmt = foreignAmountAmt;
	}

}
