package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * PatchSqlAuditLog generated by hbm2java
 */
@Entity
@Table(name = "patch_sql_audit_log")
public class PatchSqlAuditLog implements java.io.Serializable {

	private int id;
	private String syncUser;
	private Date syncTime;
	private String syncPubs;
	private String sourceScriptVersion;
	private String targetScriptVersion;
	private String sqlText;
	private Integer sqlCode;
	private String sqlState;
	private String sqlMessage;

	public PatchSqlAuditLog() {
	}

	public PatchSqlAuditLog(int id, Date syncTime) {
		this.id = id;
		this.syncTime = syncTime;
	}

	public PatchSqlAuditLog(int id, String syncUser, Date syncTime, String syncPubs, String sourceScriptVersion,
			String targetScriptVersion, String sqlText, Integer sqlCode, String sqlState, String sqlMessage) {
		this.id = id;
		this.syncUser = syncUser;
		this.syncTime = syncTime;
		this.syncPubs = syncPubs;
		this.sourceScriptVersion = sourceScriptVersion;
		this.targetScriptVersion = targetScriptVersion;
		this.sqlText = sqlText;
		this.sqlCode = sqlCode;
		this.sqlState = sqlState;
		this.sqlMessage = sqlMessage;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "sync_user", length = 128)
	public String getSyncUser() {
		return this.syncUser;
	}

	public void setSyncUser(String syncUser) {
		this.syncUser = syncUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sync_time", nullable = false, length = 19)
	public Date getSyncTime() {
		return this.syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	@Column(name = "sync_pubs", length = 128)
	public String getSyncPubs() {
		return this.syncPubs;
	}

	public void setSyncPubs(String syncPubs) {
		this.syncPubs = syncPubs;
	}

	@Column(name = "source_script_version", length = 256)
	public String getSourceScriptVersion() {
		return this.sourceScriptVersion;
	}

	public void setSourceScriptVersion(String sourceScriptVersion) {
		this.sourceScriptVersion = sourceScriptVersion;
	}

	@Column(name = "target_script_version", length = 256)
	public String getTargetScriptVersion() {
		return this.targetScriptVersion;
	}

	public void setTargetScriptVersion(String targetScriptVersion) {
		this.targetScriptVersion = targetScriptVersion;
	}

	@Column(name = "sql_text", length = 10000)
	public String getSqlText() {
		return this.sqlText;
	}

	public void setSqlText(String sqlText) {
		this.sqlText = sqlText;
	}

	@Column(name = "sql_code")
	public Integer getSqlCode() {
		return this.sqlCode;
	}

	public void setSqlCode(Integer sqlCode) {
		this.sqlCode = sqlCode;
	}

	@Column(name = "sql_state", length = 5)
	public String getSqlState() {
		return this.sqlState;
	}

	public void setSqlState(String sqlState) {
		this.sqlState = sqlState;
	}

	@Column(name = "sql_message", length = 4000)
	public String getSqlMessage() {
		return this.sqlMessage;
	}

	public void setSqlMessage(String sqlMessage) {
		this.sqlMessage = sqlMessage;
	}

}