package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsFrequencyEffectiveDate generated by hbm2java
 */
@Entity
@Table(name = "es_frequency_effective_date")
public class EsFrequencyEffectiveDate implements java.io.Serializable {

	private int frequencyEffectiveDateId;
	private Short frequencyType;
	private Date effectiveDate;
	private String rulesFrequencyId;
	private Integer qbRecordNumberId;
	private int bitfields;
	private String other;
	private String frequencyEffectiveDateAbmId;
	private Date dbModifiedTms;
	private Date dbCreatedTms;
	private Integer companyId;

	public EsFrequencyEffectiveDate() {
	}

	public EsFrequencyEffectiveDate(int frequencyEffectiveDateId, int bitfields, String frequencyEffectiveDateAbmId,
			Date dbModifiedTms, Date dbCreatedTms) {
		this.frequencyEffectiveDateId = frequencyEffectiveDateId;
		this.bitfields = bitfields;
		this.frequencyEffectiveDateAbmId = frequencyEffectiveDateAbmId;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
	}

	public EsFrequencyEffectiveDate(int frequencyEffectiveDateId, Short frequencyType, Date effectiveDate,
			String rulesFrequencyId, Integer qbRecordNumberId, int bitfields, String other,
			String frequencyEffectiveDateAbmId, Date dbModifiedTms, Date dbCreatedTms, Integer companyId) {
		this.frequencyEffectiveDateId = frequencyEffectiveDateId;
		this.frequencyType = frequencyType;
		this.effectiveDate = effectiveDate;
		this.rulesFrequencyId = rulesFrequencyId;
		this.qbRecordNumberId = qbRecordNumberId;
		this.bitfields = bitfields;
		this.other = other;
		this.frequencyEffectiveDateAbmId = frequencyEffectiveDateAbmId;
		this.dbModifiedTms = dbModifiedTms;
		this.dbCreatedTms = dbCreatedTms;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "frequency_effective_date_id", unique = true, nullable = false)
	public int getFrequencyEffectiveDateId() {
		return this.frequencyEffectiveDateId;
	}

	public void setFrequencyEffectiveDateId(int frequencyEffectiveDateId) {
		this.frequencyEffectiveDateId = frequencyEffectiveDateId;
	}

	@Column(name = "frequency_type")
	public Short getFrequencyType() {
		return this.frequencyType;
	}

	public void setFrequencyType(Short frequencyType) {
		this.frequencyType = frequencyType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "effective_date", length = 10)
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@Column(name = "rules_frequency_id", length = 32)
	public String getRulesFrequencyId() {
		return this.rulesFrequencyId;
	}

	public void setRulesFrequencyId(String rulesFrequencyId) {
		this.rulesFrequencyId = rulesFrequencyId;
	}

	@Column(name = "qb_record_number_id")
	public Integer getQbRecordNumberId() {
		return this.qbRecordNumberId;
	}

	public void setQbRecordNumberId(Integer qbRecordNumberId) {
		this.qbRecordNumberId = qbRecordNumberId;
	}

	@Column(name = "bitfields", nullable = false)
	public int getBitfields() {
		return this.bitfields;
	}

	public void setBitfields(int bitfields) {
		this.bitfields = bitfields;
	}

	@Column(name = "other", length = 1024)
	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	@Column(name = "frequency_effective_date_abm_id", nullable = false, length = 17)
	public String getFrequencyEffectiveDateAbmId() {
		return this.frequencyEffectiveDateAbmId;
	}

	public void setFrequencyEffectiveDateAbmId(String frequencyEffectiveDateAbmId) {
		this.frequencyEffectiveDateAbmId = frequencyEffectiveDateAbmId;
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

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
