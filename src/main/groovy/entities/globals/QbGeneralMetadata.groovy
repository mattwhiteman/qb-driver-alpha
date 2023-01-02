package entities.globals


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="QBAdminGroup.I_GENERAL")
public class QbGeneralMetadata
{
	@Id
	@Column(name="key_fld")
	int key
	
	@Column(name="rec_num")
	int recNum
	
	@Column(name="data_size")
	int dataSize
	
	@Column(name="data_fld")
	byte[] dataFld


	@Override
	public String toString() {
		return "QbGeneralMetadata [key=" + key + ", recNum=" + recNum + ", dataSize=" + dataSize + ", dataFld=" \
				+ Arrays.toString(dataFld) + "]";
	}	
}