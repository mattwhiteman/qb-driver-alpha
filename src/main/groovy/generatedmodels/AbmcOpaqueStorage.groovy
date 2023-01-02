package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcOpaqueStorage generated by hbm2java
 */
@Entity
@Table(name = "abmc_opaque_storage")
public class AbmcOpaqueStorage implements java.io.Serializable {

	private String opaqueStorageAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private String externalKey;
	private String ownerId;
	private String staticMetadata;
	private String dynamicMetadata;
	private String blob;
	private Integer companyId;

	public AbmcOpaqueStorage() {
	}

	public AbmcOpaqueStorage(String opaqueStorageAbmId, Date dbCreatedTms, Date dbModifiedTms, String externalKey) {
		this.opaqueStorageAbmId = opaqueStorageAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.externalKey = externalKey;
	}

	public AbmcOpaqueStorage(String opaqueStorageAbmId, Date dbCreatedTms, Date dbModifiedTms, String externalKey,
			String ownerId, String staticMetadata, String dynamicMetadata, String blob, Integer companyId) {
		this.opaqueStorageAbmId = opaqueStorageAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.externalKey = externalKey;
		this.ownerId = ownerId;
		this.staticMetadata = staticMetadata;
		this.dynamicMetadata = dynamicMetadata;
		this.blob = blob;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "opaque_storage_abm_id", unique = true, nullable = false, length = 17)
	public String getOpaqueStorageAbmId() {
		return this.opaqueStorageAbmId;
	}

	public void setOpaqueStorageAbmId(String opaqueStorageAbmId) {
		this.opaqueStorageAbmId = opaqueStorageAbmId;
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

	@Column(name = "external_key", nullable = false, length = 40)
	public String getExternalKey() {
		return this.externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	@Column(name = "owner_id", length = 40)
	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	@Column(name = "static_metadata", length = 40)
	public String getStaticMetadata() {
		return this.staticMetadata;
	}

	public void setStaticMetadata(String staticMetadata) {
		this.staticMetadata = staticMetadata;
	}

	@Column(name = "dynamic_metadata", length = 100)
	public String getDynamicMetadata() {
		return this.dynamicMetadata;
	}

	public void setDynamicMetadata(String dynamicMetadata) {
		this.dynamicMetadata = dynamicMetadata;
	}

	@Column(name = "blob", length = 16777215)
	public String getBlob() {
		return this.blob;
	}

	public void setBlob(String blob) {
		this.blob = blob;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
