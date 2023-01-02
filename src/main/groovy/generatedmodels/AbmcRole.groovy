package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcRole generated by hbm2java
 */
@Entity
@Table(name = "abmc_role")
public class AbmcRole implements java.io.Serializable {

	private int roleId;
	private int companyId;
	private String roleAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private String name;
	private Integer categoryType;
	private byte isVisibleBool;
	private String description;

	public AbmcRole() {
	}

	public AbmcRole(int roleId, int companyId, Date dbCreatedTms, Date dbModifiedTms, byte isVisibleBool) {
		this.roleId = roleId;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isVisibleBool = isVisibleBool;
	}

	public AbmcRole(int roleId, int companyId, String roleAbmId, Date dbCreatedTms, Date dbModifiedTms, String name,
			Integer categoryType, byte isVisibleBool, String description) {
		this.roleId = roleId;
		this.companyId = companyId;
		this.roleAbmId = roleAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.name = name;
		this.categoryType = categoryType;
		this.isVisibleBool = isVisibleBool;
		this.description = description;
	}

	@Id

	@Column(name = "role_id", unique = true, nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "role_abm_id", length = 17)
	public String getRoleAbmId() {
		return this.roleAbmId;
	}

	public void setRoleAbmId(String roleAbmId) {
		this.roleAbmId = roleAbmId;
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

	@Column(name = "name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "category_type")
	public Integer getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}

	@Column(name = "is_visible_bool", nullable = false)
	public byte getIsVisibleBool() {
		return this.isVisibleBool;
	}

	public void setIsVisibleBool(byte isVisibleBool) {
		this.isVisibleBool = isVisibleBool;
	}

	@Column(name = "description", length = 512)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}