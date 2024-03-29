package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * CfPrefAttribute generated by hbm2java
 */
@Entity
@Table(name = "cf_pref_attribute")
public class CfPrefAttribute implements java.io.Serializable {

	private int preferenceId;
	private String abmId;
	private String preferenceName;
	private String description;
	private Integer companyId;

	public CfPrefAttribute() {
	}

	public CfPrefAttribute(int preferenceId, String abmId, String preferenceName) {
		this.preferenceId = preferenceId;
		this.abmId = abmId;
		this.preferenceName = preferenceName;
	}

	public CfPrefAttribute(int preferenceId, String abmId, String preferenceName, String description,
			Integer companyId) {
		this.preferenceId = preferenceId;
		this.abmId = abmId;
		this.preferenceName = preferenceName;
		this.description = description;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "preference_id", unique = true, nullable = false)
	public int getPreferenceId() {
		return this.preferenceId;
	}

	public void setPreferenceId(int preferenceId) {
		this.preferenceId = preferenceId;
	}

	@Column(name = "abm_id", nullable = false, length = 17)
	public String getAbmId() {
		return this.abmId;
	}

	public void setAbmId(String abmId) {
		this.abmId = abmId;
	}

	@Column(name = "preference_name", nullable = false, length = 2048)
	public String getPreferenceName() {
		return this.preferenceName;
	}

	public void setPreferenceName(String preferenceName) {
		this.preferenceName = preferenceName;
	}

	@Column(name = "description", length = 2048)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
