package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsTimeSheetFormat generated by hbm2java
 */
@Entity
@Table(name = "es_time_sheet_format")
public class EsTimeSheetFormat implements java.io.Serializable {

	private int timeSheetFormatId;
	private String version;
	private String name;
	private String layoutXml;
	private int companyId;
	private String timeSheetFormatAbmId;
	private int modtimestampTms;
	private Date dbModifiedTms;
	private int timestampTms;
	private Date dbCreatedTms;

	public EsTimeSheetFormat() {
	}

	public EsTimeSheetFormat(int timeSheetFormatId, String name, String layoutXml, int companyId,
			String timeSheetFormatAbmId, int modtimestampTms, Date dbModifiedTms, int timestampTms, Date dbCreatedTms) {
		this.timeSheetFormatId = timeSheetFormatId;
		this.name = name;
		this.layoutXml = layoutXml;
		this.companyId = companyId;
		this.timeSheetFormatAbmId = timeSheetFormatAbmId;
		this.modtimestampTms = modtimestampTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.dbCreatedTms = dbCreatedTms;
	}

	@Id

	@Column(name = "time_sheet_format_id", unique = true, nullable = false)
	public int getTimeSheetFormatId() {
		return this.timeSheetFormatId;
	}

	public void setTimeSheetFormatId(int timeSheetFormatId) {
		this.timeSheetFormatId = timeSheetFormatId;
	}

	@Column(name = "version", nullable = false, length = 21)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "name", nullable = false, length = 51)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "layout_xml", nullable = false, length = 10000)
	public String getLayoutXml() {
		return this.layoutXml;
	}

	public void setLayoutXml(String layoutXml) {
		this.layoutXml = layoutXml;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "time_sheet_format_abm_id", nullable = false, length = 17)
	public String getTimeSheetFormatAbmId() {
		return this.timeSheetFormatAbmId;
	}

	public void setTimeSheetFormatAbmId(String timeSheetFormatAbmId) {
		this.timeSheetFormatAbmId = timeSheetFormatAbmId;
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