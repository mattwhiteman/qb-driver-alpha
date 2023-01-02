package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcUnitDefault generated by hbm2java
 */
@Entity
@Table(name = "abmc_unit_default")
public class AbmcUnitDefault implements java.io.Serializable {

	private AbmcUnitDefaultId id;
	private int defaultUnitId;
	private String unitDefaultAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;

	public AbmcUnitDefault() {
	}

	public AbmcUnitDefault(AbmcUnitDefaultId id, int defaultUnitId, String unitDefaultAbmId, Date dbCreatedTms,
			Date dbModifiedTms) {
		this.id = id;
		this.defaultUnitId = defaultUnitId;
		this.unitDefaultAbmId = unitDefaultAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcUnitDefault(AbmcUnitDefaultId id, int defaultUnitId, String unitDefaultAbmId, Date dbCreatedTms,
			Date dbModifiedTms, Integer companyId) {
		this.id = id;
		this.defaultUnitId = defaultUnitId;
		this.unitDefaultAbmId = unitDefaultAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcUnitDefaultId getId() {
		return this.id;
	}

	public void setId(AbmcUnitDefaultId id) {
		this.id = id;
	}

	@Column(name = "default_unit_id", nullable = false)
	public int getDefaultUnitId() {
		return this.defaultUnitId;
	}

	public void setDefaultUnitId(int defaultUnitId) {
		this.defaultUnitId = defaultUnitId;
	}

	@Column(name = "unit_default_abm_id", nullable = false, length = 17)
	public String getUnitDefaultAbmId() {
		return this.unitDefaultAbmId;
	}

	public void setUnitDefaultAbmId(String unitDefaultAbmId) {
		this.unitDefaultAbmId = unitDefaultAbmId;
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
