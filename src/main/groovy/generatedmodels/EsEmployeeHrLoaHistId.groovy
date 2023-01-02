package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * EsEmployeeHrLoaHistId generated by hbm2java
 */
@Embeddable
public class EsEmployeeHrLoaHistId implements java.io.Serializable {

	private String employeeAbmId;
	private int position;

	public EsEmployeeHrLoaHistId() {
	}

	public EsEmployeeHrLoaHistId(String employeeAbmId, int position) {
		this.employeeAbmId = employeeAbmId;
		this.position = position;
	}

	@Column(name = "employee_abm_id", nullable = false, length = 17)
	public String getEmployeeAbmId() {
		return this.employeeAbmId;
	}

	public void setEmployeeAbmId(String employeeAbmId) {
		this.employeeAbmId = employeeAbmId;
	}

	@Column(name = "position", nullable = false)
	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EsEmployeeHrLoaHistId))
			return false;
		EsEmployeeHrLoaHistId castOther = (EsEmployeeHrLoaHistId) other;

		return ((this.getEmployeeAbmId() == castOther.getEmployeeAbmId()) \
				|| (this.getEmployeeAbmId() != null && castOther.getEmployeeAbmId() != null \
						&& this.getEmployeeAbmId().equals(castOther.getEmployeeAbmId()))) \
				&& (this.getPosition() == castOther.getPosition());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmployeeAbmId() == null ? 0 : this.getEmployeeAbmId().hashCode());
		result = 37 * result + this.getPosition();
		return result;
	}

}
