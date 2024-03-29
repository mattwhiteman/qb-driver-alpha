package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

/**
 * AbmcFifoLot generated by hbm2java
 */
@Entity
@Table(name = "abmc_fifo_lot")
public class AbmcFifoLot implements java.io.Serializable {

	private AbmcFifoLotId id;
	private BigDecimal quantity;
	private BigDecimal unitCost;
	private Integer acquisitionTargetId;
	private Integer disbursementTargetId;
	private Integer companyId;

	public AbmcFifoLot() {
	}

	public AbmcFifoLot(AbmcFifoLotId id, BigDecimal quantity, BigDecimal unitCost) {
		this.id = id;
		this.quantity = quantity;
		this.unitCost = unitCost;
	}

	public AbmcFifoLot(AbmcFifoLotId id, BigDecimal quantity, BigDecimal unitCost, Integer acquisitionTargetId,
			Integer disbursementTargetId, Integer companyId) {
		this.id = id;
		this.quantity = quantity;
		this.unitCost = unitCost;
		this.acquisitionTargetId = acquisitionTargetId;
		this.disbursementTargetId = disbursementTargetId;
		this.companyId = companyId;
	}

	@EmbeddedId

	public AbmcFifoLotId getId() {
		return this.id;
	}

	public void setId(AbmcFifoLotId id) {
		this.id = id;
	}

	@Column(name = "quantity", nullable = false, precision = 20, scale = 5)
	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	@Column(name = "unit_cost", nullable = false, precision = 20, scale = 5)
	public BigDecimal getUnitCost() {
		return this.unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	@Column(name = "acquisition_target_id")
	public Integer getAcquisitionTargetId() {
		return this.acquisitionTargetId;
	}

	public void setAcquisitionTargetId(Integer acquisitionTargetId) {
		this.acquisitionTargetId = acquisitionTargetId;
	}

	@Column(name = "disbursement_target_id")
	public Integer getDisbursementTargetId() {
		return this.disbursementTargetId;
	}

	public void setDisbursementTargetId(Integer disbursementTargetId) {
		this.disbursementTargetId = disbursementTargetId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
