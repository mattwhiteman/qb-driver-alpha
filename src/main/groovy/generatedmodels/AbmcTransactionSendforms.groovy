package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcTransactionSendforms generated by hbm2java
 */
@Entity
@Table(name = "abmc_transaction_sendforms")
public class AbmcTransactionSendforms implements java.io.Serializable {

	private int transactionSendformsId;
	private int transactionId;
	private short transactionViewType;
	private Integer paperMailSentdate;
	private Integer emailSentdate;
	private Integer sendformsUploadTime;
	private byte isPostedForPayment;
	private int companyId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private int timestampTms;
	private int modtimestampTms;
	private Integer faxSentdate;

	public AbmcTransactionSendforms() {
	}

	public AbmcTransactionSendforms(int transactionSendformsId, int transactionId, short transactionViewType,
			byte isPostedForPayment, int companyId, Date dbCreatedTms, Date dbModifiedTms, int timestampTms,
			int modtimestampTms) {
		this.transactionSendformsId = transactionSendformsId;
		this.transactionId = transactionId;
		this.transactionViewType = transactionViewType;
		this.isPostedForPayment = isPostedForPayment;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
	}

	public AbmcTransactionSendforms(int transactionSendformsId, int transactionId, short transactionViewType,
			Integer paperMailSentdate, Integer emailSentdate, Integer sendformsUploadTime, byte isPostedForPayment,
			int companyId, Date dbCreatedTms, Date dbModifiedTms, int timestampTms, int modtimestampTms,
			Integer faxSentdate) {
		this.transactionSendformsId = transactionSendformsId;
		this.transactionId = transactionId;
		this.transactionViewType = transactionViewType;
		this.paperMailSentdate = paperMailSentdate;
		this.emailSentdate = emailSentdate;
		this.sendformsUploadTime = sendformsUploadTime;
		this.isPostedForPayment = isPostedForPayment;
		this.companyId = companyId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.faxSentdate = faxSentdate;
	}

	@Id

	@Column(name = "transaction_sendforms_id", unique = true, nullable = false)
	public int getTransactionSendformsId() {
		return this.transactionSendformsId;
	}

	public void setTransactionSendformsId(int transactionSendformsId) {
		this.transactionSendformsId = transactionSendformsId;
	}

	@Column(name = "transaction_id", nullable = false)
	public int getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "transaction_view_type", nullable = false)
	public short getTransactionViewType() {
		return this.transactionViewType;
	}

	public void setTransactionViewType(short transactionViewType) {
		this.transactionViewType = transactionViewType;
	}

	@Column(name = "paper_mail_sentdate")
	public Integer getPaperMailSentdate() {
		return this.paperMailSentdate;
	}

	public void setPaperMailSentdate(Integer paperMailSentdate) {
		this.paperMailSentdate = paperMailSentdate;
	}

	@Column(name = "email_sentdate")
	public Integer getEmailSentdate() {
		return this.emailSentdate;
	}

	public void setEmailSentdate(Integer emailSentdate) {
		this.emailSentdate = emailSentdate;
	}

	@Column(name = "sendforms_upload_time")
	public Integer getSendformsUploadTime() {
		return this.sendformsUploadTime;
	}

	public void setSendformsUploadTime(Integer sendformsUploadTime) {
		this.sendformsUploadTime = sendformsUploadTime;
	}

	@Column(name = "is_posted_for_payment", nullable = false)
	public byte getIsPostedForPayment() {
		return this.isPostedForPayment;
	}

	public void setIsPostedForPayment(byte isPostedForPayment) {
		this.isPostedForPayment = isPostedForPayment;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
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

	@Column(name = "timestamp_tms", nullable = false)
	public int getTimestampTms() {
		return this.timestampTms;
	}

	public void setTimestampTms(int timestampTms) {
		this.timestampTms = timestampTms;
	}

	@Column(name = "modtimestamp_tms", nullable = false)
	public int getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(int modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
	}

	@Column(name = "fax_sentdate")
	public Integer getFaxSentdate() {
		return this.faxSentdate;
	}

	public void setFaxSentdate(Integer faxSentdate) {
		this.faxSentdate = faxSentdate;
	}

}