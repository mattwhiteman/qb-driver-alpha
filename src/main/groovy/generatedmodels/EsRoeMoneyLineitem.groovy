package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsRoeMoneyLineitem generated by hbm2java
 */
@Entity
@Table(name = "es_roe_money_lineitem")
public class EsRoeMoneyLineitem implements java.io.Serializable {

	private int roeMoneyLineitemId;
	private String roeMoneyLineitemAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private int employeeId;
	private short roeMoneyType;
	private short roeMoneyCode;
	private Date payStartDate;
	private Date payEndDate;
	private BigDecimal payAmountAmt;
	private short payFrequencyType;

	public EsRoeMoneyLineitem() {
	}

	public EsRoeMoneyLineitem(int roeMoneyLineitemId, String roeMoneyLineitemAbmId, Date dbCreatedTms,
			Date dbModifiedTms, int employeeId, short roeMoneyType, short roeMoneyCode, BigDecimal payAmountAmt,
			short payFrequencyType) {
		this.roeMoneyLineitemId = roeMoneyLineitemId;
		this.roeMoneyLineitemAbmId = roeMoneyLineitemAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.employeeId = employeeId;
		this.roeMoneyType = roeMoneyType;
		this.roeMoneyCode = roeMoneyCode;
		this.payAmountAmt = payAmountAmt;
		this.payFrequencyType = payFrequencyType;
	}

	public EsRoeMoneyLineitem(int roeMoneyLineitemId, String roeMoneyLineitemAbmId, Date dbCreatedTms,
			Date dbModifiedTms, int employeeId, short roeMoneyType, short roeMoneyCode, Date payStartDate,
			Date payEndDate, BigDecimal payAmountAmt, short payFrequencyType) {
		this.roeMoneyLineitemId = roeMoneyLineitemId;
		this.roeMoneyLineitemAbmId = roeMoneyLineitemAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.employeeId = employeeId;
		this.roeMoneyType = roeMoneyType;
		this.roeMoneyCode = roeMoneyCode;
		this.payStartDate = payStartDate;
		this.payEndDate = payEndDate;
		this.payAmountAmt = payAmountAmt;
		this.payFrequencyType = payFrequencyType;
	}

	@Id

	@Column(name = "roe_money_lineitem_id", unique = true, nullable = false)
	public int getRoeMoneyLineitemId() {
		return this.roeMoneyLineitemId;
	}

	public void setRoeMoneyLineitemId(int roeMoneyLineitemId) {
		this.roeMoneyLineitemId = roeMoneyLineitemId;
	}

	@Column(name = "roe_money_lineitem_abm_id", nullable = false, length = 17)
	public String getRoeMoneyLineitemAbmId() {
		return this.roeMoneyLineitemAbmId;
	}

	public void setRoeMoneyLineitemAbmId(String roeMoneyLineitemAbmId) {
		this.roeMoneyLineitemAbmId = roeMoneyLineitemAbmId;
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

	@Column(name = "employee_id", nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "roe_money_type", nullable = false)
	public short getRoeMoneyType() {
		return this.roeMoneyType;
	}

	public void setRoeMoneyType(short roeMoneyType) {
		this.roeMoneyType = roeMoneyType;
	}

	@Column(name = "roe_money_code", nullable = false)
	public short getRoeMoneyCode() {
		return this.roeMoneyCode;
	}

	public void setRoeMoneyCode(short roeMoneyCode) {
		this.roeMoneyCode = roeMoneyCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pay_start_date", length = 10)
	public Date getPayStartDate() {
		return this.payStartDate;
	}

	public void setPayStartDate(Date payStartDate) {
		this.payStartDate = payStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pay_end_date", length = 10)
	public Date getPayEndDate() {
		return this.payEndDate;
	}

	public void setPayEndDate(Date payEndDate) {
		this.payEndDate = payEndDate;
	}

	@Column(name = "pay_amount_amt", nullable = false, precision = 20, scale = 5)
	public BigDecimal getPayAmountAmt() {
		return this.payAmountAmt;
	}

	public void setPayAmountAmt(BigDecimal payAmountAmt) {
		this.payAmountAmt = payAmountAmt;
	}

	@Column(name = "pay_frequency_type", nullable = false)
	public short getPayFrequencyType() {
		return this.payFrequencyType;
	}

	public void setPayFrequencyType(short payFrequencyType) {
		this.payFrequencyType = payFrequencyType;
	}

}
