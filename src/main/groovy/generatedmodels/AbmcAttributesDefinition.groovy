package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAttributesDefinition generated by hbm2java
 */
@Entity
@Table(name = "abmc_attributes_definition")
public class AbmcAttributesDefinition implements java.io.Serializable {

	private int attributesDefinitionId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private String name;
	private Short dataType;
	private Integer listAccess;
	private Integer transAccess;
	private Integer controlFlags;
	private String attributesDefinitionAbmId;
	private String ownerGuid;
	private Integer companyId;

	public AbmcAttributesDefinition() {
	}

	public AbmcAttributesDefinition(int attributesDefinitionId, Date dbCreatedTms, Date dbModifiedTms) {
		this.attributesDefinitionId = attributesDefinitionId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcAttributesDefinition(int attributesDefinitionId, Date dbCreatedTms, Date dbModifiedTms,
			Integer timestampTms, Integer modtimestampTms, String name, Short dataType, Integer listAccess,
			Integer transAccess, Integer controlFlags, String attributesDefinitionAbmId, String ownerGuid,
			Integer companyId) {
		this.attributesDefinitionId = attributesDefinitionId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.name = name;
		this.dataType = dataType;
		this.listAccess = listAccess;
		this.transAccess = transAccess;
		this.controlFlags = controlFlags;
		this.attributesDefinitionAbmId = attributesDefinitionAbmId;
		this.ownerGuid = ownerGuid;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "attributes_definition_id", unique = true, nullable = false)
	public int getAttributesDefinitionId() {
		return this.attributesDefinitionId;
	}

	public void setAttributesDefinitionId(int attributesDefinitionId) {
		this.attributesDefinitionId = attributesDefinitionId;
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

	@Column(name = "timestamp_tms")
	public Integer getTimestampTms() {
		return this.timestampTms;
	}

	public void setTimestampTms(Integer timestampTms) {
		this.timestampTms = timestampTms;
	}

	@Column(name = "modtimestamp_tms")
	public Integer getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(Integer modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "data_type")
	public Short getDataType() {
		return this.dataType;
	}

	public void setDataType(Short dataType) {
		this.dataType = dataType;
	}

	@Column(name = "list_access")
	public Integer getListAccess() {
		return this.listAccess;
	}

	public void setListAccess(Integer listAccess) {
		this.listAccess = listAccess;
	}

	@Column(name = "trans_access")
	public Integer getTransAccess() {
		return this.transAccess;
	}

	public void setTransAccess(Integer transAccess) {
		this.transAccess = transAccess;
	}

	@Column(name = "control_flags")
	public Integer getControlFlags() {
		return this.controlFlags;
	}

	public void setControlFlags(Integer controlFlags) {
		this.controlFlags = controlFlags;
	}

	@Column(name = "attributes_definition_abm_id", length = 17)
	public String getAttributesDefinitionAbmId() {
		return this.attributesDefinitionAbmId;
	}

	public void setAttributesDefinitionAbmId(String attributesDefinitionAbmId) {
		this.attributesDefinitionAbmId = attributesDefinitionAbmId;
	}

	@Column(name = "owner_guid", length = 40)
	public String getOwnerGuid() {
		return this.ownerGuid;
	}

	public void setOwnerGuid(String ownerGuid) {
		this.ownerGuid = ownerGuid;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
