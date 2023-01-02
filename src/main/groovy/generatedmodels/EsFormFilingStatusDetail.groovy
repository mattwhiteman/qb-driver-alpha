package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsFormFilingStatusDetail generated by hbm2java
 */
@Entity
@Table(name = "es_form_filing_status_detail")
public class EsFormFilingStatusDetail implements java.io.Serializable {

	private int formFilingStatusDetailId;
	private int formFilingStatusHdrId;
	private String attrId;
	private String attrValue;
	private String formFilingStatusDetailAbmId;
	private Integer companyId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;

	public EsFormFilingStatusDetail() {
	}

	public EsFormFilingStatusDetail(int formFilingStatusDetailId, int formFilingStatusHdrId, String attrId,
			String formFilingStatusDetailAbmId, Date dbCreatedTms, Date dbModifiedTms) {
		this.formFilingStatusDetailId = formFilingStatusDetailId;
		this.formFilingStatusHdrId = formFilingStatusHdrId;
		this.attrId = attrId;
		this.formFilingStatusDetailAbmId = formFilingStatusDetailAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public EsFormFilingStatusDetail(int formFilingStatusDetailId, int formFilingStatusHdrId, String attrId,
			String attrValue, String formFilingStatusDetailAbmId, Integer companyId, Date dbCreatedTms,
			Date dbModifiedTms) {
		this.formFilingStatusDetailId = formFilingStatusDetailId;
		this.formFilingStatusHdrId = formFilingStatusHdrId;
		this.attrId = attrId;
		this.attrValue = attrValue;
		this.formFilingStatusDetailAbmId = formFilingStatusDetailAbmId;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	@Id

	@Column(name = "form_filing_status_detail_id", unique = true, nullable = false)
	public int getFormFilingStatusDetailId() {
		return this.formFilingStatusDetailId;
	}

	public void setFormFilingStatusDetailId(int formFilingStatusDetailId) {
		this.formFilingStatusDetailId = formFilingStatusDetailId;
	}

	@Column(name = "form_filing_status_hdr_id", nullable = false)
	public int getFormFilingStatusHdrId() {
		return this.formFilingStatusHdrId;
	}

	public void setFormFilingStatusHdrId(int formFilingStatusHdrId) {
		this.formFilingStatusHdrId = formFilingStatusHdrId;
	}

	@Column(name = "attr_id", nullable = false, length = 200)
	public String getAttrId() {
		return this.attrId;
	}

	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}

	@Column(name = "attr_value", length = 2000)
	public String getAttrValue() {
		return this.attrValue;
	}

	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	@Column(name = "form_filing_status_detail_abm_id", nullable = false, length = 17)
	public String getFormFilingStatusDetailAbmId() {
		return this.formFilingStatusDetailAbmId;
	}

	public void setFormFilingStatusDetailAbmId(String formFilingStatusDetailAbmId) {
		this.formFilingStatusDetailAbmId = formFilingStatusDetailAbmId;
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
