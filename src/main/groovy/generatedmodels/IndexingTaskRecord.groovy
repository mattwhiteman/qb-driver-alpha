package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * IndexingTaskRecord generated by hbm2java
 */
@Entity
@Table(name = "indexing_task_record")
public class IndexingTaskRecord implements java.io.Serializable {

	private int taskId;
	private String taskName;
	private Date taskLastRun;
	private int indexingTaskUserId;

	public IndexingTaskRecord() {
	}

	public IndexingTaskRecord(int taskId, String taskName, Date taskLastRun, int indexingTaskUserId) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskLastRun = taskLastRun;
		this.indexingTaskUserId = indexingTaskUserId;
	}

	@Id

	@Column(name = "task_id", unique = true, nullable = false)
	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	@Column(name = "task_name", nullable = false, length = 120)
	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "task_last_run", nullable = false, length = 19)
	public Date getTaskLastRun() {
		return this.taskLastRun;
	}

	public void setTaskLastRun(Date taskLastRun) {
		this.taskLastRun = taskLastRun;
	}

	@Column(name = "indexing_task_user_id", nullable = false)
	public int getIndexingTaskUserId() {
		return this.indexingTaskUserId;
	}

	public void setIndexingTaskUserId(int indexingTaskUserId) {
		this.indexingTaskUserId = indexingTaskUserId;
	}

}