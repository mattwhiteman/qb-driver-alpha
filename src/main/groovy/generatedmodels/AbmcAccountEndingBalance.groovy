package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAccountEndingBalance generated by hbm2java
 */
@Entity
@Table(name = "abmc_account_ending_balance")
public class AbmcAccountEndingBalance implements java.io.Serializable {

	private AbmcAccountEndingBalanceId id;
	private BigDecimal cashBasisAmt;
	private BigDecimal accrualBasisAmt;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private String accountEndingBalanceAbmId;
	private int companyId;

	public AbmcAccountEndingBalance() {
	}

	public AbmcAccountEndingBalance(AbmcAccountEndingBalanceId id, Date dbCreatedTms, Date dbModifiedTms,
			String accountEndingBalanceAbmId, int companyId) {
		this.id = id;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.accountEndingBalanceAbmId = accountEndingBalanceAbmId;
		this.companyId = companyId;
	}

	public AbmcAccountEndingBalance(AbmcAccountEndingBalanceId id, BigDecimal cashBasisAmt, BigDecimal accrualBasisAmt,
			Date dbCreatedTms, Date dbModifiedTms, String accountEndingBalanceAbmId, int companyId) {
		this.id = id;
		this.cashBasisAmt = cashBasisAmt;
		this.accrualBasisAmt = accrualBasisAmt;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.accountEndingBalanceAbmId = accountEndingBalanceAbmId;
		this.companyId = companyId;
	}

	@EmbeddedId
	public AbmcAccountEndingBalanceId getId() {
		return this.id;
	}

	public void setId(AbmcAccountEndingBalanceId id) {
		this.id = id;
	}

	@Column(name = "cash_basis_amt", precision = 20, scale = 5)
	public BigDecimal getCashBasisAmt() {
		return this.cashBasisAmt;
	}

	public void setCashBasisAmt(BigDecimal cashBasisAmt) {
		this.cashBasisAmt = cashBasisAmt;
	}

	@Column(name = "accrual_basis_amt", precision = 20, scale = 5)
	public BigDecimal getAccrualBasisAmt() {
		return this.accrualBasisAmt;
	}

	public void setAccrualBasisAmt(BigDecimal accrualBasisAmt) {
		this.accrualBasisAmt = accrualBasisAmt;
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

	@Column(name = "account_ending_balance_abm_id", nullable = false, length = 17)
	public String getAccountEndingBalanceAbmId() {
		return this.accountEndingBalanceAbmId;
	}

	public void setAccountEndingBalanceAbmId(String accountEndingBalanceAbmId) {
		this.accountEndingBalanceAbmId = accountEndingBalanceAbmId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

}
