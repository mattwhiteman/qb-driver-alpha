package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsPayrollYtd generated by hbm2java
 */
@Entity
@Table(name = "es_payroll_ytd")
public class EsPayrollYtd implements java.io.Serializable {

	private int payrollYtdId;
	private String ytdType;
	private Integer employeeId;
	private int payrollItemId;
	private String periodType;
	private Integer periodIndex;
	private Date periodBeginDate;
	private Date periodEndDate;
	private int periodYear;
	private Integer taxTableVersion;
	private BigDecimal incomeSubjectToTaxAmt;
	private BigDecimal wageBaseAmt;
	private BigDecimal tipsWageBaseAmt;
	private BigDecimal amountAmt;
	private String payrollYtdAbmId;
	private Integer companyId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;

	public EsPayrollYtd() {
	}

	public EsPayrollYtd(int payrollYtdId, String ytdType, int payrollItemId, String periodType, Date periodBeginDate,
			Date periodEndDate, int periodYear, BigDecimal incomeSubjectToTaxAmt, BigDecimal wageBaseAmt,
			BigDecimal tipsWageBaseAmt, BigDecimal amountAmt, String payrollYtdAbmId, Date dbCreatedTms,
			Date dbModifiedTms) {
		this.payrollYtdId = payrollYtdId;
		this.ytdType = ytdType;
		this.payrollItemId = payrollItemId;
		this.periodType = periodType;
		this.periodBeginDate = periodBeginDate;
		this.periodEndDate = periodEndDate;
		this.periodYear = periodYear;
		this.incomeSubjectToTaxAmt = incomeSubjectToTaxAmt;
		this.wageBaseAmt = wageBaseAmt;
		this.tipsWageBaseAmt = tipsWageBaseAmt;
		this.amountAmt = amountAmt;
		this.payrollYtdAbmId = payrollYtdAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public EsPayrollYtd(int payrollYtdId, String ytdType, Integer employeeId, int payrollItemId, String periodType,
			Integer periodIndex, Date periodBeginDate, Date periodEndDate, int periodYear, Integer taxTableVersion,
			BigDecimal incomeSubjectToTaxAmt, BigDecimal wageBaseAmt, BigDecimal tipsWageBaseAmt, BigDecimal amountAmt,
			String payrollYtdAbmId, Integer companyId, Date dbCreatedTms, Date dbModifiedTms) {
		this.payrollYtdId = payrollYtdId;
		this.ytdType = ytdType;
		this.employeeId = employeeId;
		this.payrollItemId = payrollItemId;
		this.periodType = periodType;
		this.periodIndex = periodIndex;
		this.periodBeginDate = periodBeginDate;
		this.periodEndDate = periodEndDate;
		this.periodYear = periodYear;
		this.taxTableVersion = taxTableVersion;
		this.incomeSubjectToTaxAmt = incomeSubjectToTaxAmt;
		this.wageBaseAmt = wageBaseAmt;
		this.tipsWageBaseAmt = tipsWageBaseAmt;
		this.amountAmt = amountAmt;
		this.payrollYtdAbmId = payrollYtdAbmId;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	@Id

	@Column(name = "payroll_ytd_id", unique = true, nullable = false)
	public int getPayrollYtdId() {
		return this.payrollYtdId;
	}

	public void setPayrollYtdId(int payrollYtdId) {
		this.payrollYtdId = payrollYtdId;
	}

	@Column(name = "ytd_type", nullable = false, length = 16)
	public String getYtdType() {
		return this.ytdType;
	}

	public void setYtdType(String ytdType) {
		this.ytdType = ytdType;
	}

	@Column(name = "employee_id")
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "payroll_item_id", nullable = false)
	public int getPayrollItemId() {
		return this.payrollItemId;
	}

	public void setPayrollItemId(int payrollItemId) {
		this.payrollItemId = payrollItemId;
	}

	@Column(name = "period_type", nullable = false, length = 16)
	public String getPeriodType() {
		return this.periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	@Column(name = "period_index")
	public Integer getPeriodIndex() {
		return this.periodIndex;
	}

	public void setPeriodIndex(Integer periodIndex) {
		this.periodIndex = periodIndex;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "period_begin_date", nullable = false, length = 10)
	public Date getPeriodBeginDate() {
		return this.periodBeginDate;
	}

	public void setPeriodBeginDate(Date periodBeginDate) {
		this.periodBeginDate = periodBeginDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "period_end_date", nullable = false, length = 10)
	public Date getPeriodEndDate() {
		return this.periodEndDate;
	}

	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	@Column(name = "period_year", nullable = false)
	public int getPeriodYear() {
		return this.periodYear;
	}

	public void setPeriodYear(int periodYear) {
		this.periodYear = periodYear;
	}

	@Column(name = "tax_table_version")
	public Integer getTaxTableVersion() {
		return this.taxTableVersion;
	}

	public void setTaxTableVersion(Integer taxTableVersion) {
		this.taxTableVersion = taxTableVersion;
	}

	@Column(name = "income_subject_to_tax_amt", nullable = false, precision = 20, scale = 5)
	public BigDecimal getIncomeSubjectToTaxAmt() {
		return this.incomeSubjectToTaxAmt;
	}

	public void setIncomeSubjectToTaxAmt(BigDecimal incomeSubjectToTaxAmt) {
		this.incomeSubjectToTaxAmt = incomeSubjectToTaxAmt;
	}

	@Column(name = "wage_base_amt", nullable = false, precision = 20, scale = 5)
	public BigDecimal getWageBaseAmt() {
		return this.wageBaseAmt;
	}

	public void setWageBaseAmt(BigDecimal wageBaseAmt) {
		this.wageBaseAmt = wageBaseAmt;
	}

	@Column(name = "tips_wage_base_amt", nullable = false, precision = 20, scale = 5)
	public BigDecimal getTipsWageBaseAmt() {
		return this.tipsWageBaseAmt;
	}

	public void setTipsWageBaseAmt(BigDecimal tipsWageBaseAmt) {
		this.tipsWageBaseAmt = tipsWageBaseAmt;
	}

	@Column(name = "amount_amt", nullable = false, precision = 20, scale = 5)
	public BigDecimal getAmountAmt() {
		return this.amountAmt;
	}

	public void setAmountAmt(BigDecimal amountAmt) {
		this.amountAmt = amountAmt;
	}

	@Column(name = "payroll_ytd_abm_id", nullable = false, length = 17)
	public String getPayrollYtdAbmId() {
		return this.payrollYtdAbmId;
	}

	public void setPayrollYtdAbmId(String payrollYtdAbmId) {
		this.payrollYtdAbmId = payrollYtdAbmId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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

}
