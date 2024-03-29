package generatedmodels

import javax.persistence.*;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

/**
 * EsFormsUser generated by hbm2java
 */
@Entity
@Table(name = "es_forms_user")
public class EsFormsUser implements java.io.Serializable {

	private EsFormsUserId id;
	private short showForm;
	private Date dbCreatedTms;
	private Date dbModifiedTms;
	private Integer timestampTms;
	private Integer modtimestampTms;

	public EsFormsUser() {
	}

	public EsFormsUser(EsFormsUserId id, short showForm, Date dbCreatedTms, Date dbModifiedTms) {
		this.id = id;
		this.showForm = showForm;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
	}

	public EsFormsUser(EsFormsUserId id, short showForm, Date dbCreatedTms, Date dbModifiedTms, Integer timestampTms,
			Integer modtimestampTms) {
		this.id = id;
		this.showForm = showForm;
		this.dbCreatedTms = dbCreatedTms;
		this.dbModifiedTms = dbModifiedTms;
		this.timestampTms = timestampTms;
		this.modtimestampTms = modtimestampTms;
	}

	@EmbeddedId

	public EsFormsUserId getId() {
		return this.id;
	}

	public void setId(EsFormsUserId id) {
		this.id = id;
	}

	@Column(name = "show_form", nullable = false)
	public short getShowForm() {
		return this.showForm;
	}

	public void setShowForm(short showForm) {
		this.showForm = showForm;
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

}
