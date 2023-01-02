package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcContactsChannel generated by hbm2java
 */
@Entity
@Table(name = "abmc_contacts_channel")
public class AbmcContactsChannel implements java.io.Serializable {

	private int channelCategoryId;
	private String channelCategoryName;
	private byte isDefault;
	private byte isDeletedBool;
	private int companyId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;

	public AbmcContactsChannel() {
	}

	public AbmcContactsChannel(int channelCategoryId, String channelCategoryName, byte isDefault, byte isDeletedBool,
			int companyId) {
		this.channelCategoryId = channelCategoryId;
		this.channelCategoryName = channelCategoryName;
		this.isDefault = isDefault;
		this.isDeletedBool = isDeletedBool;
		this.companyId = companyId;
	}

	public AbmcContactsChannel(int channelCategoryId, String channelCategoryName, byte isDefault, byte isDeletedBool,
			int companyId, Date dbCreatedTms, Date dbModifiedTms) {
		this.channelCategoryId = channelCategoryId;
		this.channelCategoryName = channelCategoryName;
		this.isDefault = isDefault;
		this.isDeletedBool = isDeletedBool;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	@Id

	@Column(name = "channel_category_id", unique = true, nullable = false)
	public int getChannelCategoryId() {
		return this.channelCategoryId;
	}

	public void setChannelCategoryId(int channelCategoryId) {
		this.channelCategoryId = channelCategoryId;
	}

	@Column(name = "channel_category_name", nullable = false, length = 42)
	public String getChannelCategoryName() {
		return this.channelCategoryName;
	}

	public void setChannelCategoryName(String channelCategoryName) {
		this.channelCategoryName = channelCategoryName;
	}

	@Column(name = "is_default", nullable = false)
	public byte getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(byte isDefault) {
		this.isDefault = isDefault;
	}

	@Column(name = "is_deleted_bool", nullable = false)
	public byte getIsDeletedBool() {
		return this.isDeletedBool;
	}

	public void setIsDeletedBool(byte isDeletedBool) {
		this.isDeletedBool = isDeletedBool;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_modified_tms", length = 19)
	public Date getDbModifiedTms() {
		return this.dbModifiedTms;
	}

	public void setDbModifiedTms(Date dbModifiedTms) {
		this.dbModifiedTms = dbModifiedTms;
	}

}