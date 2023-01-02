package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsComplianceItemName generated by hbm2java
 */
@Entity
@Table(name = "es_compliance_item_name")
public class EsComplianceItemName implements java.io.Serializable {

	private int complianceItemNameId;
	private String itemName;
	private Date dbModifiedTms;
	private Date dbCreatedTms;
	private String complianceItemNameAbmId;
	private int companyId;

	public EsComplianceItemName() {
	}

	public EsComplianceItemName(int complianceItemNameId, String itemName, Date dbModifiedTms, Date dbCreatedTms,
			String complianceItemNameAbmId, int companyId) {
		this.complianceItemNameId = complianceItemNameId;
		this.itemName = itemName;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.complianceItemNameAbmId = complianceItemNameAbmId;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "compliance_item_name_id", unique = true, nullable = false)
	public int getComplianceItemNameId() {
		return this.complianceItemNameId;
	}

	public void setComplianceItemNameId(int complianceItemNameId) {
		this.complianceItemNameId = complianceItemNameId;
	}

	@Column(name = "item_name", nullable = false, length = 128)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_modified_tms", nullable = false, length = 19)
	public Date getDbModifiedTms() {
		return this.dbModifiedTms;
	}

	public void setDbModifiedTms(Date dbModifiedTms) {
		this.dbModifiedTms = dbModifiedTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", nullable = false, length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

	@Column(name = "compliance_item_name_abm_id", nullable = false, length = 17)
	public String getComplianceItemNameAbmId() {
		return this.complianceItemNameAbmId;
	}

	public void setComplianceItemNameAbmId(String complianceItemNameAbmId) {
		this.complianceItemNameAbmId = complianceItemNameAbmId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

}