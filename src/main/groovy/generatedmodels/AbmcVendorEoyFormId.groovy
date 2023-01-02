package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * AbmcVendorEoyFormId generated by hbm2java
 */
@Embeddable
public class AbmcVendorEoyFormId implements java.io.Serializable {

	private int vendorId;
	private int taxYear;
	private String submitReferenceId;
	private int formType;
	private byte isFiscalYearEnd;

	public AbmcVendorEoyFormId() {
	}

	public AbmcVendorEoyFormId(int vendorId, int taxYear, String submitReferenceId, int formType,
			byte isFiscalYearEnd) {
		this.vendorId = vendorId;
		this.taxYear = taxYear;
		this.submitReferenceId = submitReferenceId;
		this.formType = formType;
		this.isFiscalYearEnd = isFiscalYearEnd;
	}

	@Column(name = "vendor_id", nullable = false)
	public int getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	@Column(name = "tax_year", nullable = false)
	public int getTaxYear() {
		return this.taxYear;
	}

	public void setTaxYear(int taxYear) {
		this.taxYear = taxYear;
	}

	@Column(name = "submit_reference_id", nullable = false, length = 12)
	public String getSubmitReferenceId() {
		return this.submitReferenceId;
	}

	public void setSubmitReferenceId(String submitReferenceId) {
		this.submitReferenceId = submitReferenceId;
	}

	@Column(name = "form_type", nullable = false)
	public int getFormType() {
		return this.formType;
	}

	public void setFormType(int formType) {
		this.formType = formType;
	}

	@Column(name = "is_fiscal_year_end", nullable = false)
	public byte getIsFiscalYearEnd() {
		return this.isFiscalYearEnd;
	}

	public void setIsFiscalYearEnd(byte isFiscalYearEnd) {
		this.isFiscalYearEnd = isFiscalYearEnd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbmcVendorEoyFormId))
			return false;
		AbmcVendorEoyFormId castOther = (AbmcVendorEoyFormId) other;

		return (this.getVendorId() == castOther.getVendorId()) && (this.getTaxYear() == castOther.getTaxYear()) \
				&& ((this.getSubmitReferenceId() == castOther.getSubmitReferenceId()) \
						|| (this.getSubmitReferenceId() != null && castOther.getSubmitReferenceId() != null \
								&& this.getSubmitReferenceId().equals(castOther.getSubmitReferenceId()))) \
				&& (this.getFormType() == castOther.getFormType()) \
				&& (this.getIsFiscalYearEnd() == castOther.getIsFiscalYearEnd());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getVendorId();
		result = 37 * result + this.getTaxYear();
		result = 37 * result + (getSubmitReferenceId() == null ? 0 : this.getSubmitReferenceId().hashCode());
		result = 37 * result + this.getFormType();
		result = 37 * result + this.getIsFiscalYearEnd();
		return result;
	}

}
