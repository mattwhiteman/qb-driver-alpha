package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

/**
 * AbmcCheckLineSn generated by hbm2java
 */
@Entity
@Table(name = "abmc_check_line_sn")
public class AbmcCheckLineSn implements java.io.Serializable {

	private AbmcCheckLineSnId id;
	private Integer snId;
	private int companyId;

	public AbmcCheckLineSn() {
	}

	public AbmcCheckLineSn(AbmcCheckLineSnId id, int companyId) {
		this.id = id;
		this.companyId = companyId;
	}

	public AbmcCheckLineSn(AbmcCheckLineSnId id, Integer snId, int companyId) {
		this.id = id;
		this.snId = snId;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcCheckLineSnId getId() {
		return this.id;
	}

	public void setId(AbmcCheckLineSnId id) {
		this.id = id;
	}

	@Column(name = "sn_id")
	public Integer getSnId() {
		return this.snId;
	}

	public void setSnId(Integer snId) {
		this.snId = snId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

}