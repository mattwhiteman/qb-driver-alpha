package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsEmployeeHrLoaHist generated by hbm2java
 */
@Entity
@Table(name = "es_employee_hr_loa_hist")
public class EsEmployeeHrLoaHist implements java.io.Serializable {

	private EsEmployeeHrLoaHistId id;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Date leaveStartDate;
	private Date leaveExpectedReturnDate;
	private Date leaveActualReturnDate;
	private Short paidType;
	private Short allowanceType;
	private BigDecimal paidPct;
	private String leaveType;
	private String leaveReason;
	private Integer companyId;

	public EsEmployeeHrLoaHist() {
	}

	public EsEmployeeHrLoaHist(EsEmployeeHrLoaHistId id, Date dbCreatedTms, Date dbModifiedTms) {
		this.id = id;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public EsEmployeeHrLoaHist(EsEmployeeHrLoaHistId id, Date dbCreatedTms, Date dbModifiedTms, Date leaveStartDate,
			Date leaveExpectedReturnDate, Date leaveActualReturnDate, Short paidType, Short allowanceType,
			BigDecimal paidPct, String leaveType, String leaveReason, Integer companyId) {
		this.id = id;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.leaveStartDate = leaveStartDate;
		this.leaveExpectedReturnDate = leaveExpectedReturnDate;
		this.leaveActualReturnDate = leaveActualReturnDate;
		this.paidType = paidType;
		this.allowanceType = allowanceType;
		this.paidPct = paidPct;
		this.leaveType = leaveType;
		this.leaveReason = leaveReason;
		this.companyId = companyId;
	}

	@EmbeddedId

	public EsEmployeeHrLoaHistId getId() {
		return this.id;
	}

	public void setId(EsEmployeeHrLoaHistId id) {
		this.id = id;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "leave_start_date", length = 10)
	public Date getLeaveStartDate() {
		return this.leaveStartDate;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "leave_expected_return_date", length = 10)
	public Date getLeaveExpectedReturnDate() {
		return this.leaveExpectedReturnDate;
	}

	public void setLeaveExpectedReturnDate(Date leaveExpectedReturnDate) {
		this.leaveExpectedReturnDate = leaveExpectedReturnDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "leave_actual_return_date", length = 10)
	public Date getLeaveActualReturnDate() {
		return this.leaveActualReturnDate;
	}

	public void setLeaveActualReturnDate(Date leaveActualReturnDate) {
		this.leaveActualReturnDate = leaveActualReturnDate;
	}

	@Column(name = "paid_type")
	public Short getPaidType() {
		return this.paidType;
	}

	public void setPaidType(Short paidType) {
		this.paidType = paidType;
	}

	@Column(name = "allowance_type")
	public Short getAllowanceType() {
		return this.allowanceType;
	}

	public void setAllowanceType(Short allowanceType) {
		this.allowanceType = allowanceType;
	}

	@Column(name = "paid_pct", precision = 20, scale = 5)
	public BigDecimal getPaidPct() {
		return this.paidPct;
	}

	public void setPaidPct(BigDecimal paidPct) {
		this.paidPct = paidPct;
	}

	@Column(name = "leave_type", length = 32)
	public String getLeaveType() {
		return this.leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	@Column(name = "leave_reason", length = 32)
	public String getLeaveReason() {
		return this.leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
