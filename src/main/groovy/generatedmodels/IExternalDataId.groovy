package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Embeddable

/**
 * IExternalDataId generated by hbm2java
 */
@Embeddable
public class IExternalDataId implements java.io.Serializable {

	private String keyFld;
	private int recNum;

	public IExternalDataId() {
	}

	public IExternalDataId(String keyFld, int recNum) {
		this.keyFld = keyFld;
		this.recNum = recNum;
	}

	@Column(name = "key_fld", nullable = false, length = 256)
	public String getKeyFld() {
		return this.keyFld;
	}

	public void setKeyFld(String keyFld) {
		this.keyFld = keyFld;
	}

	@Column(name = "rec_num", nullable = false)
	public int getRecNum() {
		return this.recNum;
	}

	public void setRecNum(int recNum) {
		this.recNum = recNum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IExternalDataId))
			return false;
		IExternalDataId castOther = (IExternalDataId) other;

		return ((this.getKeyFld() == castOther.getKeyFld()) || (this.getKeyFld() != null \
				&& castOther.getKeyFld() != null && this.getKeyFld().equals(castOther.getKeyFld()))) \
				&& (this.getRecNum() == castOther.getRecNum());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getKeyFld() == null ? 0 : this.getKeyFld().hashCode());
		result = 37 * result + this.getRecNum();
		return result;
	}

}
