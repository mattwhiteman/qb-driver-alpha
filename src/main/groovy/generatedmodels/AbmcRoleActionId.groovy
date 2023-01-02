package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * AbmcRoleActionId generated by hbm2java
 */
@Embeddable
public class AbmcRoleActionId implements java.io.Serializable {

	private int roleId;
	private int entitlementId;

	public AbmcRoleActionId() {
	}

	public AbmcRoleActionId(int roleId, int entitlementId) {
		this.roleId = roleId;
		this.entitlementId = entitlementId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "entitlement_id", nullable = false)
	public int getEntitlementId() {
		return this.entitlementId;
	}

	public void setEntitlementId(int entitlementId) {
		this.entitlementId = entitlementId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbmcRoleActionId))
			return false;
		AbmcRoleActionId castOther = (AbmcRoleActionId) other;

		return (this.getRoleId() == castOther.getRoleId()) && (this.getEntitlementId() == castOther.getEntitlementId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRoleId();
		result = 37 * result + this.getEntitlementId();
		return result;
	}

}