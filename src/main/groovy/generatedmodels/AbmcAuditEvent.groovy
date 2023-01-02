package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAuditEvent generated by hbm2java
 */
@Entity
@Table(name = "abmc_audit_event")
public class AbmcAuditEvent implements java.io.Serializable {

	private int auditEventId;
	private int eventTms;
	private int modUserId;
	private String modUserName;
	private byte isSdkAppBool;
	private int eventCode;
	private String auditEventAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer companyId;
	private byte[] privateData;

	public AbmcAuditEvent() {
	}

	public AbmcAuditEvent(int auditEventId, int eventTms, int modUserId, byte isSdkAppBool, int eventCode,
			String auditEventAbmId, Date dbCreatedTms, Date dbModifiedTms) {
		this.auditEventId = auditEventId;
		this.eventTms = eventTms;
		this.modUserId = modUserId;
		this.isSdkAppBool = isSdkAppBool;
		this.eventCode = eventCode;
		this.auditEventAbmId = auditEventAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public AbmcAuditEvent(int auditEventId, int eventTms, int modUserId, String modUserName, byte isSdkAppBool,
			int eventCode, String auditEventAbmId, Date dbCreatedTms, Date dbModifiedTms, Integer companyId,
			byte[] privateData) {
		this.auditEventId = auditEventId;
		this.eventTms = eventTms;
		this.modUserId = modUserId;
		this.modUserName = modUserName;
		this.isSdkAppBool = isSdkAppBool;
		this.eventCode = eventCode;
		this.auditEventAbmId = auditEventAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.companyId = companyId;
		this.privateData = privateData;
	}

	@Id

	@Column(name = "audit_event_id", unique = true, nullable = false)
	public int getAuditEventId() {
		return this.auditEventId;
	}

	public void setAuditEventId(int auditEventId) {
		this.auditEventId = auditEventId;
	}

	@Column(name = "event_tms", nullable = false)
	public int getEventTms() {
		return this.eventTms;
	}

	public void setEventTms(int eventTms) {
		this.eventTms = eventTms;
	}

	@Column(name = "mod_user_id", nullable = false)
	public int getModUserId() {
		return this.modUserId;
	}

	public void setModUserId(int modUserId) {
		this.modUserId = modUserId;
	}

	@Column(name = "mod_user_name", length = 128)
	public String getModUserName() {
		return this.modUserName;
	}

	public void setModUserName(String modUserName) {
		this.modUserName = modUserName;
	}

	@Column(name = "is_sdk_app_bool", nullable = false)
	public byte getIsSdkAppBool() {
		return this.isSdkAppBool;
	}

	public void setIsSdkAppBool(byte isSdkAppBool) {
		this.isSdkAppBool = isSdkAppBool;
	}

	@Column(name = "event_code", nullable = false)
	public int getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(int eventCode) {
		this.eventCode = eventCode;
	}

	@Column(name = "audit_event_abm_id", nullable = false, length = 17)
	public String getAuditEventAbmId() {
		return this.auditEventAbmId;
	}

	public void setAuditEventAbmId(String auditEventAbmId) {
		this.auditEventAbmId = auditEventAbmId;
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

	@Column(name = "private_data")
	public byte[] getPrivateData() {
		return this.privateData;
	}

	public void setPrivateData(byte[] privateData) {
		this.privateData = privateData;
	}

}