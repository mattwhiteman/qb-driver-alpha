package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * AbmcTaxExceptionLineitemId generated by hbm2java
 */
@Embeddable
public class AbmcTaxExceptionLineitemId implements java.io.Serializable {

	private int targetId;
	private int agencyId;

	public AbmcTaxExceptionLineitemId() {
	}

	public AbmcTaxExceptionLineitemId(int targetId, int agencyId) {
		this.targetId = targetId;
		this.agencyId = agencyId;
	}

	@Column(name = "target_id", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "agency_id", nullable = false)
	public int getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbmcTaxExceptionLineitemId))
			return false;
		AbmcTaxExceptionLineitemId castOther = (AbmcTaxExceptionLineitemId) other;

		return (this.getTargetId() == castOther.getTargetId()) && (this.getAgencyId() == castOther.getAgencyId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTargetId();
		result = 37 * result + this.getAgencyId();
		return result;
	}

}
