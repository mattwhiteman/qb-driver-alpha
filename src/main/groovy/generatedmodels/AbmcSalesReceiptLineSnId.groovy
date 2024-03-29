package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * AbmcSalesReceiptLineSnId generated by hbm2java
 */
@Embeddable
public class AbmcSalesReceiptLineSnId implements java.io.Serializable {

	private int targetId;
	private int snSeq;

	public AbmcSalesReceiptLineSnId() {
	}

	public AbmcSalesReceiptLineSnId(int targetId, int snSeq) {
		this.targetId = targetId;
		this.snSeq = snSeq;
	}

	@Column(name = "target_id", nullable = false)
	public int getTargetId() {
		return this.targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	@Column(name = "sn_seq", nullable = false)
	public int getSnSeq() {
		return this.snSeq;
	}

	public void setSnSeq(int snSeq) {
		this.snSeq = snSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbmcSalesReceiptLineSnId))
			return false;
		AbmcSalesReceiptLineSnId castOther = (AbmcSalesReceiptLineSnId) other;

		return (this.getTargetId() == castOther.getTargetId()) && (this.getSnSeq() == castOther.getSnSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTargetId();
		result = 37 * result + this.getSnSeq();
		return result;
	}

}
