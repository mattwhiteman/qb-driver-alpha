package generatedmodels

import javax.persistence.EmbeddedId;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Table

/**
 * MvSearchData generated by hbm2java
 */
@Entity
@Table(name = "mv_search_data")
public class MvSearchData implements java.io.Serializable {

	private MvSearchDataId id;

	public MvSearchData() {
	}

	public MvSearchData(MvSearchDataId id) {
		this.id = id;
	}

	@EmbeddedId

	public MvSearchDataId getId() {
		return this.id;
	}

	public void setId(MvSearchDataId id) {
		this.id = id;
	}

}