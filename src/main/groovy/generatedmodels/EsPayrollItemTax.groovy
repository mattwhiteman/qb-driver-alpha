package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsPayrollItemTax generated by hbm2java
 */
@Entity
@Table(name = "es_payroll_item_tax")
public class EsPayrollItemTax implements java.io.Serializable {

	private int payrollItemId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Short state;
	private Short taxLaw;
	private byte futaCreditBool;
	private byte dbHasTaxRateHistDataBool;
	private String payrollItemAbmId;
	private Integer companyId;

	public EsPayrollItemTax() {
	}

	public EsPayrollItemTax(int payrollItemId, Date dbCreatedTms, Date dbModifiedTms, byte futaCreditBool,
			byte dbHasTaxRateHistDataBool) {
		this.payrollItemId = payrollItemId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.futaCreditBool = futaCreditBool;
		this.dbHasTaxRateHistDataBool = dbHasTaxRateHistDataBool;
	}

	public EsPayrollItemTax(int payrollItemId, Date dbCreatedTms, Date dbModifiedTms, Short state, Short taxLaw,
			byte futaCreditBool, byte dbHasTaxRateHistDataBool, String payrollItemAbmId, Integer companyId) {
		this.payrollItemId = payrollItemId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.state = state;
		this.taxLaw = taxLaw;
		this.futaCreditBool = futaCreditBool;
		this.dbHasTaxRateHistDataBool = dbHasTaxRateHistDataBool;
		this.payrollItemAbmId = payrollItemAbmId;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "payroll_item_id", unique = true, nullable = false)
	public int getPayrollItemId() {
		return this.payrollItemId;
	}

	public void setPayrollItemId(int payrollItemId) {
		this.payrollItemId = payrollItemId;
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

	@Column(name = "state")
	public Short getState() {
		return this.state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	@Column(name = "tax_law")
	public Short getTaxLaw() {
		return this.taxLaw;
	}

	public void setTaxLaw(Short taxLaw) {
		this.taxLaw = taxLaw;
	}

	@Column(name = "futa_credit_bool", nullable = false)
	public byte getFutaCreditBool() {
		return this.futaCreditBool;
	}

	public void setFutaCreditBool(byte futaCreditBool) {
		this.futaCreditBool = futaCreditBool;
	}

	@Column(name = "db_has_tax_rate_hist_data_bool", nullable = false)
	public byte getDbHasTaxRateHistDataBool() {
		return this.dbHasTaxRateHistDataBool;
	}

	public void setDbHasTaxRateHistDataBool(byte dbHasTaxRateHistDataBool) {
		this.dbHasTaxRateHistDataBool = dbHasTaxRateHistDataBool;
	}

	@Column(name = "payroll_item_abm_id", length = 17)
	public String getPayrollItemAbmId() {
		return this.payrollItemAbmId;
	}

	public void setPayrollItemAbmId(String payrollItemAbmId) {
		this.payrollItemAbmId = payrollItemAbmId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
