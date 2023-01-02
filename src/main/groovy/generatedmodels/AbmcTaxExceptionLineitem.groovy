package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcTaxExceptionLineitem generated by hbm2java
 */
@Entity
@Table(name = "abmc_tax_exception_lineitem")
public class AbmcTaxExceptionLineitem implements java.io.Serializable {

	private AbmcTaxExceptionLineitemId id;
	private int transactionId;
	private Integer accountId;
	private Integer taxCodeId;
	private Integer itemId;
	private Date filedDate;
	private byte isTransTaxBool;
	private byte isSourceBool;
	private BigDecimal amountAmt;
	private BigDecimal paidAmountAmt;
	private String abmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;

	public AbmcTaxExceptionLineitem() {
	}

	public AbmcTaxExceptionLineitem(AbmcTaxExceptionLineitemId id, int transactionId, byte isTransTaxBool,
			byte isSourceBool, String abmId, Date dbCreatedTms, Date dbModifiedTms) {
		this.id = id;
		this.transactionId = transactionId;
		this.isTransTaxBool = isTransTaxBool;
		this.isSourceBool = isSourceBool;
		this.abmId = abmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcTaxExceptionLineitem(AbmcTaxExceptionLineitemId id, int transactionId, Integer accountId,
			Integer taxCodeId, Integer itemId, Date filedDate, byte isTransTaxBool, byte isSourceBool,
			BigDecimal amountAmt, BigDecimal paidAmountAmt, String abmId, Date dbCreatedTms, Date dbModifiedTms,
			Integer companyId) {
		this.id = id;
		this.transactionId = transactionId;
		this.accountId = accountId;
		this.taxCodeId = taxCodeId;
		this.itemId = itemId;
		this.filedDate = filedDate;
		this.isTransTaxBool = isTransTaxBool;
		this.isSourceBool = isSourceBool;
		this.amountAmt = amountAmt;
		this.paidAmountAmt = paidAmountAmt;
		this.abmId = abmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcTaxExceptionLineitemId getId() {
		return this.id;
	}

	public void setId(AbmcTaxExceptionLineitemId id) {
		this.id = id;
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

	@Column(name = "tax_code_id")
	public Integer getTaxCodeId() {
		return this.taxCodeId;
	}

	public void setTaxCodeId(Integer taxCodeId) {
		this.taxCodeId = taxCodeId;
	}

	@Column(name = "item_id")
	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "filed_date", length = 10)
	public Date getFiledDate() {
		return this.filedDate;
	}

	public void setFiledDate(Date filedDate) {
		this.filedDate = filedDate;
	}

	@Column(name = "is_trans_tax_bool", nullable = false)
	public byte getIsTransTaxBool() {
		return this.isTransTaxBool;
	}

	public void setIsTransTaxBool(byte isTransTaxBool) {
		this.isTransTaxBool = isTransTaxBool;
	}

	@Column(name = "is_source_bool", nullable = false)
	public byte getIsSourceBool() {
		return this.isSourceBool;
	}

	public void setIsSourceBool(byte isSourceBool) {
		this.isSourceBool = isSourceBool;
	}

	@Column(name = "amount_amt", precision = 20, scale = 5)
	public BigDecimal getAmountAmt() {
		return this.amountAmt;
	}

	public void setAmountAmt(BigDecimal amountAmt) {
		this.amountAmt = amountAmt;
	}

	@Column(name = "paid_amount_amt", precision = 20, scale = 5)
	public BigDecimal getPaidAmountAmt() {
		return this.paidAmountAmt;
	}

	public void setPaidAmountAmt(BigDecimal paidAmountAmt) {
		this.paidAmountAmt = paidAmountAmt;
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

}
