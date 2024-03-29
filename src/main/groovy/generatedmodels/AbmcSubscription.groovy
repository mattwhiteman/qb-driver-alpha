package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcSubscription generated by hbm2java
 */
@Entity
@Table(name = "abmc_subscription")
public class AbmcSubscription implements java.io.Serializable {

	private String subscriptionAbmId;
	private Integer companyId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private String appInstanceAbmId;
	private Short subscriptionType;
	private byte isRecoverableBool;
	private byte isSynchronousBool;
	private String comCallbackClsid;
	private Short comCallbackClsctxType;
	private Date recoveryTms;
	private Date timeLastModifiedTms;
	private Short qbxmlVersionType;

	public AbmcSubscription() {
	}

	public AbmcSubscription(String subscriptionAbmId, Date dbCreatedTms, Date dbModifiedTms, byte isRecoverableBool,
			byte isSynchronousBool) {
		this.subscriptionAbmId = subscriptionAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isRecoverableBool = isRecoverableBool;
		this.isSynchronousBool = isSynchronousBool;
	}

	public AbmcSubscription(String subscriptionAbmId, Integer companyId, Date dbCreatedTms, Date dbModifiedTms,
			String appInstanceAbmId, Short subscriptionType, byte isRecoverableBool, byte isSynchronousBool,
			String comCallbackClsid, Short comCallbackClsctxType, Date recoveryTms, Date timeLastModifiedTms,
			Short qbxmlVersionType) {
		this.subscriptionAbmId = subscriptionAbmId;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.appInstanceAbmId = appInstanceAbmId;
		this.subscriptionType = subscriptionType;
		this.isRecoverableBool = isRecoverableBool;
		this.isSynchronousBool = isSynchronousBool;
		this.comCallbackClsid = comCallbackClsid;
		this.comCallbackClsctxType = comCallbackClsctxType;
		this.recoveryTms = recoveryTms;
		this.timeLastModifiedTms = timeLastModifiedTms;
		this.qbxmlVersionType = qbxmlVersionType;
	}

	@Id

	@Column(name = "subscription_abm_id", unique = true, nullable = false, length = 17)
	public String getSubscriptionAbmId() {
		return this.subscriptionAbmId;
	}

	public void setSubscriptionAbmId(String subscriptionAbmId) {
		this.subscriptionAbmId = subscriptionAbmId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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

	@Column(name = "app_instance_abm_id", length = 17)
	public String getAppInstanceAbmId() {
		return this.appInstanceAbmId;
	}

	public void setAppInstanceAbmId(String appInstanceAbmId) {
		this.appInstanceAbmId = appInstanceAbmId;
	}

	@Column(name = "subscription_type")
	public Short getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(Short subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	@Column(name = "is_recoverable_bool", nullable = false)
	public byte getIsRecoverableBool() {
		return this.isRecoverableBool;
	}

	public void setIsRecoverableBool(byte isRecoverableBool) {
		this.isRecoverableBool = isRecoverableBool;
	}

	@Column(name = "is_synchronous_bool", nullable = false)
	public byte getIsSynchronousBool() {
		return this.isSynchronousBool;
	}

	public void setIsSynchronousBool(byte isSynchronousBool) {
		this.isSynchronousBool = isSynchronousBool;
	}

	@Column(name = "com_callback_clsid", length = 40)
	public String getComCallbackClsid() {
		return this.comCallbackClsid;
	}

	public void setComCallbackClsid(String comCallbackClsid) {
		this.comCallbackClsid = comCallbackClsid;
	}

	@Column(name = "com_callback_clsctx_type")
	public Short getComCallbackClsctxType() {
		return this.comCallbackClsctxType;
	}

	public void setComCallbackClsctxType(Short comCallbackClsctxType) {
		this.comCallbackClsctxType = comCallbackClsctxType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "recovery_tms", length = 19)
	public Date getRecoveryTms() {
		return this.recoveryTms;
	}

	public void setRecoveryTms(Date recoveryTms) {
		this.recoveryTms = recoveryTms;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_last_modified_tms", length = 19)
	public Date getTimeLastModifiedTms() {
		return this.timeLastModifiedTms;
	}

	public void setTimeLastModifiedTms(Date timeLastModifiedTms) {
		this.timeLastModifiedTms = timeLastModifiedTms;
	}

	@Column(name = "qbxml_version_type")
	public Short getQbxmlVersionType() {
		return this.qbxmlVersionType;
	}

	public void setQbxmlVersionType(Short qbxmlVersionType) {
		this.qbxmlVersionType = qbxmlVersionType;
	}

}
