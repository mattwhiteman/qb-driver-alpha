package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * AbmcUserRoleId generated by hbm2java
 */
@Embeddable
public class AbmcUserRoleId implements java.io.Serializable {

	private int userId;
	private int roleId;

	public AbmcUserRoleId() {
	}

	public AbmcUserRoleId(int userId, int roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbmcUserRoleId))
			return false;
		AbmcUserRoleId castOther = (AbmcUserRoleId) other;

		return (this.getUserId() == castOther.getUserId()) && (this.getRoleId() == castOther.getRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getRoleId();
		return result;
	}

}