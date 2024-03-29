package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

/**
 * AbmcCreditMemoLineSn generated by hbm2java
 */
@Entity
@Table(name = "abmc_credit_memo_line_sn")
public class AbmcCreditMemoLineSn implements java.io.Serializable {

	private AbmcCreditMemoLineSnId id;
	private Integer snId;
	private int companyId;

	public AbmcCreditMemoLineSn() {
	}

	public AbmcCreditMemoLineSn(AbmcCreditMemoLineSnId id, int companyId) {
		this.id = id;
		this.companyId = companyId;
	}

	public AbmcCreditMemoLineSn(AbmcCreditMemoLineSnId id, Integer snId, int companyId) {
		this.id = id;
		this.snId = snId;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcCreditMemoLineSnId getId() {
		return this.id;
	}

	public void setId(AbmcCreditMemoLineSnId id) {
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
