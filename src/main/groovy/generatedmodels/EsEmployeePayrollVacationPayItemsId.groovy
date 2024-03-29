package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * EsEmployeePayrollVacationPayItemsId generated by hbm2java
 */
@Embeddable
public class EsEmployeePayrollVacationPayItemsId implements java.io.Serializable {

	private int employeeId;
	private int payrollItemId;

	public EsEmployeePayrollVacationPayItemsId() {
	}

	public EsEmployeePayrollVacationPayItemsId(int employeeId, int payrollItemId) {
		this.employeeId = employeeId;
		this.payrollItemId = payrollItemId;
	}

	@Column(name = "employee_id", nullable = false)
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "payroll_item_id", nullable = false)
	public int getPayrollItemId() {
		return this.payrollItemId;
	}

	public void setPayrollItemId(int payrollItemId) {
		this.payrollItemId = payrollItemId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EsEmployeePayrollVacationPayItemsId))
			return false;
		EsEmployeePayrollVacationPayItemsId castOther = (EsEmployeePayrollVacationPayItemsId) other;

		return (this.getEmployeeId() == castOther.getEmployeeId()) \
				&& (this.getPayrollItemId() == castOther.getPayrollItemId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmployeeId();
		result = 37 * result + this.getPayrollItemId();
		return result;
	}

}
