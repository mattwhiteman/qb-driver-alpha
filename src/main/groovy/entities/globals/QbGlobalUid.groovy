package entities.globals

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="QBAdminGroup.abmc_abm_id")
public class QbGlobalUid
{
	@Id
	@Column(name="id_type")
	int id
	
	@Column(name="abm_id")
	String abmId

	@Override
	public String toString() {
		return "QbGlobalUid [id=" + id + ", abmId=" + abmId + "]";
	}
}