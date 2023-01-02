package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * AbmcEdlistDeletecountMapId generated by hbm2java
 */
@Embeddable
public class AbmcEdlistDeletecountMapId implements java.io.Serializable {

	private short edlistType;
	private int recordId;

	public AbmcEdlistDeletecountMapId() {
	}

	public AbmcEdlistDeletecountMapId(short edlistType, int recordId) {
		this.edlistType = edlistType;
		this.recordId = recordId;
	}

	@Column(name = "edlist_type", nullable = false)
	public short getEdlistType() {
		return this.edlistType;
	}

	public void setEdlistType(short edlistType) {
		this.edlistType = edlistType;
	}

	@Column(name = "record_id", nullable = false)
	public int getRecordId() {
		return this.recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbmcEdlistDeletecountMapId))
			return false;
		AbmcEdlistDeletecountMapId castOther = (AbmcEdlistDeletecountMapId) other;

		return (this.getEdlistType() == castOther.getEdlistType()) && (this.getRecordId() == castOther.getRecordId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEdlistType();
		result = 37 * result + this.getRecordId();
		return result;
	}

}