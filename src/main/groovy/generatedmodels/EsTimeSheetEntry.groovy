package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsTimeSheetEntry generated by hbm2java
 */
@Entity
@Table(name = "es_time_sheet_entry")
public class EsTimeSheetEntry implements java.io.Serializable {

	private int timeSheetEntryId;
	private Integer clockInDatetime;
	private Integer clockOutDatetime;
	private Integer clockDuration;
	private int timeSheetId;
	private int timeSheetEntryOrder;
	private int companyId;
	private String timeSheetEntryAbmId;
	private int modtimestampTms;
	private Date dbModifiedTms;
	private int timestampTms;
	private Date dbCreatedTms;

	public EsTimeSheetEntry() {
	}

	public EsTimeSheetEntry(int timeSheetEntryId, int timeSheetId, int timeSheetEntryOrder, int companyId,
			String timeSheetEntryAbmId, int modtimestampTms, Date dbModifiedTms, int timestampTms, Date dbCreatedTms) {
		this.timeSheetEntryId = timeSheetEntryId;
		this.timeSheetId = timeSheetId;
		this.timeSheetEntryOrder = timeSheetEntryOrder;
		this.companyId = companyId;
		this.timeSheetEntryAbmId = timeSheetEntryAbmId;
		this.modtimestampTms = modtimestampTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.dbCreatedTms = dbCreatedTms;
	}

	public EsTimeSheetEntry(int timeSheetEntryId, Integer clockInDatetime, Integer clockOutDatetime,
			Integer clockDuration, int timeSheetId, int timeSheetEntryOrder, int companyId, String timeSheetEntryAbmId,
			int modtimestampTms, Date dbModifiedTms, int timestampTms, Date dbCreatedTms) {
		this.timeSheetEntryId = timeSheetEntryId;
		this.clockInDatetime = clockInDatetime;
		this.clockOutDatetime = clockOutDatetime;
		this.clockDuration = clockDuration;
		this.timeSheetId = timeSheetId;
		this.timeSheetEntryOrder = timeSheetEntryOrder;
		this.companyId = companyId;
		this.timeSheetEntryAbmId = timeSheetEntryAbmId;
		this.modtimestampTms = modtimestampTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.dbCreatedTms = dbCreatedTms;
	}

	@Id

	@Column(name = "time_sheet_entry_id", unique = true, nullable = false)
	public int getTimeSheetEntryId() {
		return this.timeSheetEntryId;
	}

	public void setTimeSheetEntryId(int timeSheetEntryId) {
		this.timeSheetEntryId = timeSheetEntryId;
	}

	@Column(name = "clock_in_datetime")
	public Integer getClockInDatetime() {
		return this.clockInDatetime;
	}

	public void setClockInDatetime(Integer clockInDatetime) {
		this.clockInDatetime = clockInDatetime;
	}

	@Column(name = "clock_out_datetime")
	public Integer getClockOutDatetime() {
		return this.clockOutDatetime;
	}

	public void setClockOutDatetime(Integer clockOutDatetime) {
		this.clockOutDatetime = clockOutDatetime;
	}

	@Column(name = "clock_duration")
	public Integer getClockDuration() {
		return this.clockDuration;
	}

	public void setClockDuration(Integer clockDuration) {
		this.clockDuration = clockDuration;
	}

	@Column(name = "time_sheet_id", nullable = false)
	public int getTimeSheetId() {
		return this.timeSheetId;
	}

	public void setTimeSheetId(int timeSheetId) {
		this.timeSheetId = timeSheetId;
	}

	@Column(name = "time_sheet_entry_order", nullable = false)
	public int getTimeSheetEntryOrder() {
		return this.timeSheetEntryOrder;
	}

	public void setTimeSheetEntryOrder(int timeSheetEntryOrder) {
		this.timeSheetEntryOrder = timeSheetEntryOrder;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "time_sheet_entry_abm_id", nullable = false, length = 17)
	public String getTimeSheetEntryAbmId() {
		return this.timeSheetEntryAbmId;
	}

	public void setTimeSheetEntryAbmId(String timeSheetEntryAbmId) {
		this.timeSheetEntryAbmId = timeSheetEntryAbmId;
	}

	@Column(name = "modtimestamp_tms", nullable = false)
	public int getModtimestampTms() {
		return this.modtimestampTms;
	}

	public void setModtimestampTms(int modtimestampTms) {
		this.modtimestampTms = modtimestampTms;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "db_created_tms", nullable = false, length = 19)
	public Date getDbCreatedTms() {
		return this.dbCreatedTms;
	}

	public void setDbCreatedTms(Date dbCreatedTms) {
		this.dbCreatedTms = dbCreatedTms;
	}

}