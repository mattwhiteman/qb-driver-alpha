package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * PerfPerformanceCounterData generated by hbm2java
 */
@Entity
@Table(name = "perf_performance_counter_data")
public class PerfPerformanceCounterData implements java.io.Serializable {

	private int performanceCounterDataId;
	private int eventNameId;
	private int userId;
	private int machineId;
	private int qbVersionId;
	private Date eventTime;
	private Date dbCreatedTms;

	public PerfPerformanceCounterData() {
	}

	public PerfPerformanceCounterData(int performanceCounterDataId, int eventNameId, int userId, int machineId,
			int qbVersionId, Date eventTime, Date dbCreatedTms) {
		this.performanceCounterDataId = performanceCounterDataId;
		this.eventNameId = eventNameId;
		this.userId = userId;
		this.machineId = machineId;
		this.qbVersionId = qbVersionId;
		this.eventTime = eventTime;
		this.dbCreatedTms = dbCreatedTms;
	}

	@Id

	@Column(name = "performance_counter_data_id", unique = true, nullable = false)
	public int getPerformanceCounterDataId() {
		return this.performanceCounterDataId;
	}

	public void setPerformanceCounterDataId(int performanceCounterDataId) {
		this.performanceCounterDataId = performanceCounterDataId;
	}

	@Column(name = "event_name_id", nullable = false)
	public int getEventNameId() {
		return this.eventNameId;
	}

	public void setEventNameId(int eventNameId) {
		this.eventNameId = eventNameId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "machine_id", nullable = false)
	public int getMachineId() {
		return this.machineId;
	}

	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}

	@Column(name = "qb_version_id", nullable = false)
	public int getQbVersionId() {
		return this.qbVersionId;
	}

	public void setQbVersionId(int qbVersionId) {
		this.qbVersionId = qbVersionId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "event_time", nullable = false, length = 19)
	public Date getEventTime() {
		return this.eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
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
