package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * AbmcCfFacts generated by hbm2java
 */
@Entity
@Table(name = "abmc_cf_facts")
public class AbmcCfFacts implements java.io.Serializable {

	private int factId;
	private String factKey;
	private String factValue;
	private String factType;

	public AbmcCfFacts() {
	}

	public AbmcCfFacts(int factId, String factKey) {
		this.factId = factId;
		this.factKey = factKey;
	}

	public AbmcCfFacts(int factId, String factKey, String factValue, String factType) {
		this.factId = factId;
		this.factKey = factKey;
		this.factValue = factValue;
		this.factType = factType;
	}

	@Id

	@Column(name = "fact_id", unique = true, nullable = false)
	public int getFactId() {
		return this.factId;
	}

	public void setFactId(int factId) {
		this.factId = factId;
	}

	@Column(name = "fact_key", nullable = false, length = 128)
	public String getFactKey() {
		return this.factKey;
	}

	public void setFactKey(String factKey) {
		this.factKey = factKey;
	}

	@Column(name = "fact_value", length = 4096)
	public String getFactValue() {
		return this.factValue;
	}

	public void setFactValue(String factValue) {
		this.factValue = factValue;
	}

	@Column(name = "fact_type", length = 16)
	public String getFactType() {
		return this.factType;
	}

	public void setFactType(String factType) {
		this.factType = factType;
	}

}
