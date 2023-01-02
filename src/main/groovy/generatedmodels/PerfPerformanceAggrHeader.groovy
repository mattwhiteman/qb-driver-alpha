package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * PerfPerformanceAggrHeader generated by hbm2java
 */
@Entity
@Table(name = "perf_performance_aggr_header")
public class PerfPerformanceAggrHeader implements java.io.Serializable {

	private int perfPerformanceAggrHeaderId;
	private int metricType;
	private int eventNameId;
	private int userId;
	private int machineId;
	private int qbVersionId;
	private Date startDate;
	private Date endDate;
	private Date timeAggregated;

	public PerfPerformanceAggrHeader() {
	}

	public PerfPerformanceAggrHeader(int perfPerformanceAggrHeaderId, int metricType, int eventNameId, int userId,
			int machineId, int qbVersionId, Date startDate, Date timeAggregated) {
		this.perfPerformanceAggrHeaderId = perfPerformanceAggrHeaderId;
		this.metricType = metricType;
		this.eventNameId = eventNameId;
		this.userId = userId;
		this.machineId = machineId;
		this.qbVersionId = qbVersionId;
		this.startDate = startDate;
		this.timeAggregated = timeAggregated;
	}

	public PerfPerformanceAggrHeader(int perfPerformanceAggrHeaderId, int metricType, int eventNameId, int userId,
			int machineId, int qbVersionId, Date startDate, Date endDate, Date timeAggregated) {
		this.perfPerformanceAggrHeaderId = perfPerformanceAggrHeaderId;
		this.metricType = metricType;
		this.eventNameId = eventNameId;
		this.userId = userId;
		this.machineId = machineId;
		this.qbVersionId = qbVersionId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timeAggregated = timeAggregated;
	}

	@Id

	@Column(name = "perf_performance_aggr_header_id", unique = true, nullable = false)
	public int getPerfPerformanceAggrHeaderId() {
		return this.perfPerformanceAggrHeaderId;
	}

	public void setPerfPerformanceAggrHeaderId(int perfPerformanceAggrHeaderId) {
		this.perfPerformanceAggrHeaderId = perfPerformanceAggrHeaderId;
	}

	@Column(name = "metric_type", nullable = false)
	public int getMetricType() {
		return this.metricType;
	}

	public void setMetricType(int metricType) {
		this.metricType = metricType;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date", nullable = false, length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date", length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_aggregated", nullable = false, length = 19)
	public Date getTimeAggregated() {
		return this.timeAggregated;
	}

	public void setTimeAggregated(Date timeAggregated) {
		this.timeAggregated = timeAggregated;
	}

}
