package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcCustomStyle generated by hbm2java
 */
@Entity
@Table(name = "abmc_custom_style")
public class AbmcCustomStyle implements java.io.Serializable {

	private int customStyleId;
	private String customStyleAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private String name;
	private byte isHiddenBool;
	private byte isDeletedBool;
	private byte isDeletePendingBool;
	private Integer styleRecordId;
	private Integer attributesId;
	private Short styleViewType;
	private byte isPredefinedBool;
	private Integer companyId;

	public AbmcCustomStyle() {
	}

	public AbmcCustomStyle(int customStyleId, Date dbCreatedTms, Date dbModifiedTms, byte isHiddenBool,
			byte isDeletedBool, byte isDeletePendingBool, byte isPredefinedBool) {
		this.customStyleId = customStyleId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.isPredefinedBool = isPredefinedBool;
	}

	public AbmcCustomStyle(int customStyleId, String customStyleAbmId, Date dbCreatedTms, Date dbModifiedTms,
			Integer timestampTms, Integer modtimestampTms, String name, byte isHiddenBool, byte isDeletedBool,
			byte isDeletePendingBool, Integer styleRecordId, Integer attributesId, Short styleViewType,
			byte isPredefinedBool, Integer companyId) {
		this.customStyleId = customStyleId;
		this.customStyleAbmId = customStyleAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.name = name;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.styleRecordId = styleRecordId;
		this.attributesId = attributesId;
		this.styleViewType = styleViewType;
		this.isPredefinedBool = isPredefinedBool;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "custom_style_id", unique = true, nullable = false)
	public int getCustomStyleId() {
		return this.customStyleId;
	}

	public void setCustomStyleId(int customStyleId) {
		this.customStyleId = customStyleId;
	}

	@Column(name = "custom_style_abm_id", length = 17)
	public String getCustomStyleAbmId() {
		return this.customStyleAbmId;
	}

	public void setCustomStyleAbmId(String customStyleAbmId) {
		this.customStyleAbmId = customStyleAbmId;
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

	@Column(name = "name", length = 42)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "is_hidden_bool", nullable = false)
	public byte getIsHiddenBool() {
		return this.isHiddenBool;
	}

	public void setIsHiddenBool(byte isHiddenBool) {
		this.isHiddenBool = isHiddenBool;
	}

	@Column(name = "is_deleted_bool", nullable = false)
	public byte getIsDeletedBool() {
		return this.isDeletedBool;
	}

	public void setIsDeletedBool(byte isDeletedBool) {
		this.isDeletedBool = isDeletedBool;
	}

	@Column(name = "is_delete_pending_bool", nullable = false)
	public byte getIsDeletePendingBool() {
		return this.isDeletePendingBool;
	}

	public void setIsDeletePendingBool(byte isDeletePendingBool) {
		this.isDeletePendingBool = isDeletePendingBool;
	}

	@Column(name = "style_record_id")
	public Integer getStyleRecordId() {
		return this.styleRecordId;
	}

	public void setStyleRecordId(Integer styleRecordId) {
		this.styleRecordId = styleRecordId;
	}

	@Column(name = "attributes_id")
	public Integer getAttributesId() {
		return this.attributesId;
	}

	public void setAttributesId(Integer attributesId) {
		this.attributesId = attributesId;
	}

	@Column(name = "style_view_type")
	public Short getStyleViewType() {
		return this.styleViewType;
	}

	public void setStyleViewType(Short styleViewType) {
		this.styleViewType = styleViewType;
	}

	@Column(name = "is_predefined_bool", nullable = false)
	public byte getIsPredefinedBool() {
		return this.isPredefinedBool;
	}

	public void setIsPredefinedBool(byte isPredefinedBool) {
		this.isPredefinedBool = isPredefinedBool;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}