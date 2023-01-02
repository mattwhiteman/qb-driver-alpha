package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * AbmcUnattendedUser generated by hbm2java
 */
@Entity
@Table(name = "abmc_unattended_user")
public class AbmcUnattendedUser implements java.io.Serializable {

	private int userId;
	private int companyId;
	private String userName;
	private String unattendedUserAbmId;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer timestampTms;
	private Integer modtimestampTms;
	private byte[] password;

	public AbmcUnattendedUser() {
	}

	public AbmcUnattendedUser(int userId, int companyId, String userName, Date dbCreatedTms, Date dbModifiedTms,
			byte[] password) {
		this.userId = userId;
		this.companyId = companyId;
		this.userName = userName;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.password = password;
	}

	public AbmcUnattendedUser(int userId, int companyId, String userName, String unattendedUserAbmId, Date dbCreatedTms,
			Date dbModifiedTms, Integer timestampTms, Integer modtimestampTms, byte[] password) {
		this.userId = userId;
		this.companyId = companyId;
		this.userName = userName;
		this.unattendedUserAbmId = unattendedUserAbmId;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
		this.password = password;
	}

	@Id

	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "user_name", nullable = false, length = 30)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "unattended_user_abm_id", length = 17)
	public String getUnattendedUserAbmId() {
		return this.unattendedUserAbmId;
	}

	public void setUnattendedUserAbmId(String unattendedUserAbmId) {
		this.unattendedUserAbmId = unattendedUserAbmId;
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

	@Column(name = "password", nullable = false)
	public byte[] getPassword() {
		return this.password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

}
