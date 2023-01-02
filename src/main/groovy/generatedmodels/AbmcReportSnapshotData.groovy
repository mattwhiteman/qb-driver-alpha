package generatedmodels

import javax.persistence.EmbeddedId;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Table

/**
 * AbmcReportSnapshotData generated by hbm2java
 */
@Entity
@Table(name = "abmc_report_snapshot_data")
public class AbmcReportSnapshotData implements java.io.Serializable {

	private AbmcReportSnapshotDataId id;

	public AbmcReportSnapshotData() {
	}

	public AbmcReportSnapshotData(AbmcReportSnapshotDataId id) {
		this.id = id;
	}

	@EmbeddedId

	public AbmcReportSnapshotDataId getId() {
		return this.id;
	}

	public void setId(AbmcReportSnapshotDataId id) {
		this.id = id;
	}

}
