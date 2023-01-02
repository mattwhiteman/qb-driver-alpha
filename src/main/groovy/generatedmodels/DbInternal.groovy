package generatedmodels

import javax.persistence.EmbeddedId;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Table

/**
 * DbInternal generated by hbm2java
 */
@Entity
@Table(name = "db_internal")
public class DbInternal implements java.io.Serializable {

	private DbInternalId id;

	public DbInternal() {
	}

	public DbInternal(DbInternalId id) {
		this.id = id;
	}

	@EmbeddedId

	public DbInternalId getId() {
		return this.id;
	}

	public void setId(DbInternalId id) {
		this.id = id;
	}

}