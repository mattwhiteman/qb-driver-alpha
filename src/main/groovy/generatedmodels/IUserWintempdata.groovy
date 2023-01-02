package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

/**
 * IUserWintempdata generated by hbm2java
 */
@Entity
@Table(name = "i_user_wintempdata")
public class IUserWintempdata implements java.io.Serializable {

	private IUserWintempdataId id;
	private int dataSize;
	private byte[] dataFld;

	public IUserWintempdata() {
	}

	public IUserWintempdata(IUserWintempdataId id, int dataSize, byte[] dataFld) {
		this.id = id;
		this.dataSize = dataSize;
		this.dataFld = dataFld;
	}

	@EmbeddedId

	public IUserWintempdataId getId() {
		return this.id;
	}

	public void setId(IUserWintempdataId id) {
		this.id = id;
	}

	@Column(name = "data_size", nullable = false)
	public int getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(int dataSize) {
		this.dataSize = dataSize;
	}

	@Column(name = "data_fld", nullable = false)
	public byte[] getDataFld() {
		return this.dataFld;
	}

	public void setDataFld(byte[] dataFld) {
		this.dataFld = dataFld;
	}

}
