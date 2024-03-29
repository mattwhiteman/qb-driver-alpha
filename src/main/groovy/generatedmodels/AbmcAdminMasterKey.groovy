package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAdminMasterKey generated by hbm2java
 */
@Entity
@Table(name = "abmc_admin_master_key")
public class AbmcAdminMasterKey implements java.io.Serializable {

	private int adminMasterKeyId;
	private String adminEncryptMasterKey;
	private String adminMasterKeyAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;

	public AbmcAdminMasterKey() {
	}

	public AbmcAdminMasterKey(int adminMasterKeyId, String adminEncryptMasterKey, String adminMasterKeyAbmId,
			Date dbCreatedTms, Date dbModifiedTms) {
		this.adminMasterKeyId = adminMasterKeyId;
		this.adminEncryptMasterKey = adminEncryptMasterKey;
		this.adminMasterKeyAbmId = adminMasterKeyAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcAdminMasterKey(int adminMasterKeyId, String adminEncryptMasterKey, String adminMasterKeyAbmId,
			Date dbCreatedTms, Date dbModifiedTms, Integer companyId) {
		this.adminMasterKeyId = adminMasterKeyId;
		this.adminEncryptMasterKey = adminEncryptMasterKey;
		this.adminMasterKeyAbmId = adminMasterKeyAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "admin_master_key_id", unique = true, nullable = false)
	public int getAdminMasterKeyId() {
		return this.adminMasterKeyId;
	}

	public void setAdminMasterKeyId(int adminMasterKeyId) {
		this.adminMasterKeyId = adminMasterKeyId;
	}

	@Column(name = "admin_encrypt_master_key", nullable = false, length = 257)
	public String getAdminEncryptMasterKey() {
		return this.adminEncryptMasterKey;
	}

	public void setAdminEncryptMasterKey(String adminEncryptMasterKey) {
		this.adminEncryptMasterKey = adminEncryptMasterKey;
	}

	@Column(name = "admin_master_key_abm_id", nullable = false, length = 17)
	public String getAdminMasterKeyAbmId() {
		return this.adminMasterKeyAbmId;
	}

	public void setAdminMasterKeyAbmId(String adminMasterKeyAbmId) {
		this.adminMasterKeyAbmId = adminMasterKeyAbmId;
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
