package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

/**
 * AbmcInventoryTransferLineSn generated by hbm2java
 */
@Entity
@Table(name = "abmc_inventory_transfer_line_sn")
public class AbmcInventoryTransferLineSn implements java.io.Serializable {

	private AbmcInventoryTransferLineSnId id;
	private Integer snId;
	private int companyId;

	public AbmcInventoryTransferLineSn() {
	}

	public AbmcInventoryTransferLineSn(AbmcInventoryTransferLineSnId id, int companyId) {
		this.id = id;
		this.companyId = companyId;
	}

	public AbmcInventoryTransferLineSn(AbmcInventoryTransferLineSnId id, Integer snId, int companyId) {
		this.id = id;
		this.snId = snId;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcInventoryTransferLineSnId getId() {
		return this.id;
	}

	public void setId(AbmcInventoryTransferLineSnId id) {
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
