package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcUserRole generated by hbm2java
 */
@Entity
@Table(name = "abmc_user_role")
public class AbmcUserRole implements java.io.Serializable {

	private AbmcUserRoleId id;
	private int companyId;
	private String userAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;

	public AbmcUserRole() {
	}

	public AbmcUserRole(AbmcUserRoleId id, int companyId, Date dbCreatedTms, Date dbModifiedTms) {
		this.id = id;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcUserRole(AbmcUserRoleId id, int companyId, String userAbmId, Date dbCreatedTms, Date dbModifiedTms) {
		this.id = id;
		this.companyId = companyId;
		this.userAbmId = userAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	@EmbeddedId

	public AbmcUserRoleId getId() {
		return this.id;
	}

	public void setId(AbmcUserRoleId id) {
		this.id = id;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "user_abm_id", length = 17)
	public String getUserAbmId() {
		return this.userAbmId;
	}

	public void setUserAbmId(String userAbmId) {
		this.userAbmId = userAbmId;
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