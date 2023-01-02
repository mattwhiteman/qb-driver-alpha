package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

/**
 * AbmcCustomField generated by hbm2java
 */
@Entity
@Table(name = "abmc_custom_field")
public class AbmcCustomField implements java.io.Serializable {

	private AbmcCustomFieldId id;
	private String customFieldAbmId;
	private String field;
	private Integer companyId;

	public AbmcCustomField() {
	}

	public AbmcCustomField(AbmcCustomFieldId id) {
		this.id = id;
	}

	public AbmcCustomField(AbmcCustomFieldId id, String customFieldAbmId, String field, Integer companyId) {
		this.id = id;
		this.customFieldAbmId = customFieldAbmId;
		this.field = field;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcCustomFieldId getId() {
		return this.id;
	}

	public void setId(AbmcCustomFieldId id) {
		this.id = id;
	}

	@Column(name = "custom_field_abm_id", length = 17)
	public String getCustomFieldAbmId() {
		return this.customFieldAbmId;
	}

	public void setCustomFieldAbmId(String customFieldAbmId) {
		this.customFieldAbmId = customFieldAbmId;
	}

	@Column(name = "field", length = 31)
	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
