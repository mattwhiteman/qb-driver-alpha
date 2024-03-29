package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcAccountUser generated by hbm2java
 */
@Entity
@Table(name = "abmc_account_user")
public class AbmcAccountUser implements java.io.Serializable {

	private int accountId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private String name;
	private byte isHiddenBool;
	private byte isDeletedBool;
	private byte isDeletePendingBool;
	private Integer reimbursedAccountId;
	private Integer attributesId;
	private Integer parentId;
	private Short sublevel;
	private Integer taxLineIdNum;
	private Short colorR;
	private Short colorG;
	private Short colorB;
	private Short type;
	private byte isReimbursedBool;
	private byte isOnlineBool;
	private byte showOnlineTabBool;
	private String accountNum;
	private String bankNumber;
	private String description;
	private String lastPrintDoc;
	private String accountAbmId;
	private String workPaperReference;
	private Integer companyId;
	private Integer salesTaxCodeId;
	private String toolTipDescription;
	private byte saveAllMatchedBool;
	private byte saveAllValidNewBool;
	private Date bankStatementDate;
	private String routingNumber;
	private Short accountType;
	private Integer currencyId;
	private byte hasAttachmentsBool;
	private Integer classId;
	private String sortCode;
	private String accountHolderName;
	private String buildingSocRef;

	public AbmcAccountUser() {
	}

	public AbmcAccountUser(int accountId, Date dbCreatedTms, Date dbModifiedTms, byte isHiddenBool, byte isDeletedBool,
			byte isDeletePendingBool, byte isReimbursedBool, byte isOnlineBool, byte showOnlineTabBool,
			byte saveAllMatchedBool, byte saveAllValidNewBool, byte hasAttachmentsBool) {
		this.accountId = accountId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.isReimbursedBool = isReimbursedBool;
		this.isOnlineBool = isOnlineBool;
		this.showOnlineTabBool = showOnlineTabBool;
		this.saveAllMatchedBool = saveAllMatchedBool;
		this.saveAllValidNewBool = saveAllValidNewBool;
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	public AbmcAccountUser(int accountId, Date dbCreatedTms, Date dbModifiedTms, Integer timestampTms,
			Integer modtimestampTms, String name, byte isHiddenBool, byte isDeletedBool, byte isDeletePendingBool,
			Integer reimbursedAccountId, Integer attributesId, Integer parentId, Short sublevel, Integer taxLineIdNum,
			Short colorR, Short colorG, Short colorB, Short type, byte isReimbursedBool, byte isOnlineBool,
			byte showOnlineTabBool, String accountNum, String bankNumber, String description, String lastPrintDoc,
			String accountAbmId, String workPaperReference, Integer companyId, Integer salesTaxCodeId,
			String toolTipDescription, byte saveAllMatchedBool, byte saveAllValidNewBool, Date bankStatementDate,
			String routingNumber, Short accountType, Integer currencyId, byte hasAttachmentsBool, Integer classId,
			String sortCode, String accountHolderName, String buildingSocRef) {
		this.accountId = accountId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.name = name;
		this.isHiddenBool = isHiddenBool;
		this.isDeletedBool = isDeletedBool;
		this.isDeletePendingBool = isDeletePendingBool;
		this.reimbursedAccountId = reimbursedAccountId;
		this.attributesId = attributesId;
		this.parentId = parentId;
		this.sublevel = sublevel;
		this.taxLineIdNum = taxLineIdNum;
		this.colorR = colorR;
		this.colorG = colorG;
		this.colorB = colorB;
		this.type = type;
		this.isReimbursedBool = isReimbursedBool;
		this.isOnlineBool = isOnlineBool;
		this.showOnlineTabBool = showOnlineTabBool;
		this.accountNum = accountNum;
		this.bankNumber = bankNumber;
		this.description = description;
		this.lastPrintDoc = lastPrintDoc;
		this.accountAbmId = accountAbmId;
		this.workPaperReference = workPaperReference;
		this.companyId = companyId;
		this.salesTaxCodeId = salesTaxCodeId;
		this.toolTipDescription = toolTipDescription;
		this.saveAllMatchedBool = saveAllMatchedBool;
		this.saveAllValidNewBool = saveAllValidNewBool;
		this.bankStatementDate = bankStatementDate;
		this.routingNumber = routingNumber;
		this.accountType = accountType;
		this.currencyId = currencyId;
		this.hasAttachmentsBool = hasAttachmentsBool;
		this.classId = classId;
		this.sortCode = sortCode;
		this.accountHolderName = accountHolderName;
		this.buildingSocRef = buildingSocRef;
	}

	@Id

	@Column(name = "account_id", unique = true, nullable = false)
	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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

	@Column(name = "reimbursed_account_id")
	public Integer getReimbursedAccountId() {
		return this.reimbursedAccountId;
	}

	public void setReimbursedAccountId(Integer reimbursedAccountId) {
		this.reimbursedAccountId = reimbursedAccountId;
	}

	@Column(name = "attributes_id")
	public Integer getAttributesId() {
		return this.attributesId;
	}

	public void setAttributesId(Integer attributesId) {
		this.attributesId = attributesId;
	}

	@Column(name = "parent_id")
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "sublevel")
	public Short getSublevel() {
		return this.sublevel;
	}

	public void setSublevel(Short sublevel) {
		this.sublevel = sublevel;
	}

	@Column(name = "tax_line_id_num")
	public Integer getTaxLineIdNum() {
		return this.taxLineIdNum;
	}

	public void setTaxLineIdNum(Integer taxLineIdNum) {
		this.taxLineIdNum = taxLineIdNum;
	}

	@Column(name = "color_r")
	public Short getColorR() {
		return this.colorR;
	}

	public void setColorR(Short colorR) {
		this.colorR = colorR;
	}

	@Column(name = "color_g")
	public Short getColorG() {
		return this.colorG;
	}

	public void setColorG(Short colorG) {
		this.colorG = colorG;
	}

	@Column(name = "color_b")
	public Short getColorB() {
		return this.colorB;
	}

	public void setColorB(Short colorB) {
		this.colorB = colorB;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "is_reimbursed_bool", nullable = false)
	public byte getIsReimbursedBool() {
		return this.isReimbursedBool;
	}

	public void setIsReimbursedBool(byte isReimbursedBool) {
		this.isReimbursedBool = isReimbursedBool;
	}

	@Column(name = "is_online_bool", nullable = false)
	public byte getIsOnlineBool() {
		return this.isOnlineBool;
	}

	public void setIsOnlineBool(byte isOnlineBool) {
		this.isOnlineBool = isOnlineBool;
	}

	@Column(name = "show_online_tab_bool", nullable = false)
	public byte getShowOnlineTabBool() {
		return this.showOnlineTabBool;
	}

	public void setShowOnlineTabBool(byte showOnlineTabBool) {
		this.showOnlineTabBool = showOnlineTabBool;
	}

	@Column(name = "account_num", length = 8)
	public String getAccountNum() {
		return this.accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	@Column(name = "bank_number", length = 257)
	public String getBankNumber() {
		return this.bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	@Column(name = "description", length = 201)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "last_print_doc", length = 21)
	public String getLastPrintDoc() {
		return this.lastPrintDoc;
	}

	public void setLastPrintDoc(String lastPrintDoc) {
		this.lastPrintDoc = lastPrintDoc;
	}

	@Column(name = "account_abm_id", length = 17)
	public String getAccountAbmId() {
		return this.accountAbmId;
	}

	public void setAccountAbmId(String accountAbmId) {
		this.accountAbmId = accountAbmId;
	}

	@Column(name = "work_paper_reference", length = 33)
	public String getWorkPaperReference() {
		return this.workPaperReference;
	}

	public void setWorkPaperReference(String workPaperReference) {
		this.workPaperReference = workPaperReference;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "sales_tax_code_id")
	public Integer getSalesTaxCodeId() {
		return this.salesTaxCodeId;
	}

	public void setSalesTaxCodeId(Integer salesTaxCodeId) {
		this.salesTaxCodeId = salesTaxCodeId;
	}

	@Column(name = "tool_tip_description", length = 301)
	public String getToolTipDescription() {
		return this.toolTipDescription;
	}

	public void setToolTipDescription(String toolTipDescription) {
		this.toolTipDescription = toolTipDescription;
	}

	@Column(name = "save_all_matched_bool", nullable = false)
	public byte getSaveAllMatchedBool() {
		return this.saveAllMatchedBool;
	}

	public void setSaveAllMatchedBool(byte saveAllMatchedBool) {
		this.saveAllMatchedBool = saveAllMatchedBool;
	}

	@Column(name = "save_all_valid_new_bool", nullable = false)
	public byte getSaveAllValidNewBool() {
		return this.saveAllValidNewBool;
	}

	public void setSaveAllValidNewBool(byte saveAllValidNewBool) {
		this.saveAllValidNewBool = saveAllValidNewBool;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "bank_statement_date", length = 10)
	public Date getBankStatementDate() {
		return this.bankStatementDate;
	}

	public void setBankStatementDate(Date bankStatementDate) {
		this.bankStatementDate = bankStatementDate;
	}

	@Column(name = "routing_number", length = 257)
	public String getRoutingNumber() {
		return this.routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	@Column(name = "account_type")
	public Short getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Short accountType) {
		this.accountType = accountType;
	}

	@Column(name = "currency_id")
	public Integer getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "has_attachments_bool", nullable = false)
	public byte getHasAttachmentsBool() {
		return this.hasAttachmentsBool;
	}

	public void setHasAttachmentsBool(byte hasAttachmentsBool) {
		this.hasAttachmentsBool = hasAttachmentsBool;
	}

	@Column(name = "class_id")
	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	@Column(name = "sort_code", length = 9)
	public String getSortCode() {
		return this.sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	@Column(name = "account_holder_name", length = 29)
	public String getAccountHolderName() {
		return this.accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Column(name = "building_soc_ref", length = 19)
	public String getBuildingSocRef() {
		return this.buildingSocRef;
	}

	public void setBuildingSocRef(String buildingSocRef) {
		this.buildingSocRef = buildingSocRef;
	}

}
