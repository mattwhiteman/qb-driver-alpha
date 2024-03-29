package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcShipping generated by hbm2java
 */
@Entity
@Table(name = "abmc_shipping")
public class AbmcShipping implements java.io.Serializable {

	private int shippingId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private String name;
	private byte isHiddenBool;
	private byte isDeletedBool;
	private byte isDeletePendingBool;
	private Integer attributesId;
	private String shippingAbmId;
	private Integer companyId;

	public AbmcShipping() {
	}

	public AbmcShipping(int shippingId, Date dbCreatedTms, Date dbModifiedTms, byte isHiddenBool, byte isDeletedBool,
			byte isDeletePendingBool) {
		this.shippingId = shippingId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
	}

	public AbmcShipping(int shippingId, Date dbCreatedTms, Date dbModifiedTms, Integer timestampTms,
			Integer modtimestampTms, String name, byte isHiddenBool, byte isDeletedBool, byte isDeletePendingBool,
			Integer attributesId, String shippingAbmId, Integer companyId) {
		this.shippingId = shippingId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.name = name;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.attributesId = attributesId;
		this.shippingAbmId = shippingAbmId;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "shipping_id", unique = true, nullable = false)
	public int getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
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

	@Column(name = "name", length = 16)
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

	@Column(name = "attributes_id")
	public Integer getAttributesId() {
		return this.attributesId;
	}

	public void setAttributesId(Integer attributesId) {
		this.attributesId = attributesId;
	}

	@Column(name = "shipping_abm_id", length = 17)
	public String getShippingAbmId() {
		return this.shippingAbmId;
	}

	public void setShippingAbmId(String shippingAbmId) {
		this.shippingAbmId = shippingAbmId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
