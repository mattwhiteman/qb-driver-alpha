package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * AbmcLookupTxnType generated by hbm2java
 */
@Entity
@Table(name = "abmc_lookup_txn_type")
public class AbmcLookupTxnType implements java.io.Serializable {

	private int id;
	private String name;
	private String description;

	public AbmcLookupTxnType() {
	}

	public AbmcLookupTxnType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public AbmcLookupTxnType(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 256)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
