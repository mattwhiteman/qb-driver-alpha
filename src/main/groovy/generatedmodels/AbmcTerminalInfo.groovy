package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * AbmcTerminalInfo generated by hbm2java
 */
@Entity
@Table(name = "abmc_terminal_info")
public class AbmcTerminalInfo implements java.io.Serializable {

	private int terminalInfoId;
	private String serialNumber;
	private String terminalId;
	private String terminalInfoAbmId;
	private Integer companyId;

	public AbmcTerminalInfo() {
	}

	public AbmcTerminalInfo(int terminalInfoId, String serialNumber, String terminalId, String terminalInfoAbmId) {
		this.terminalInfoId = terminalInfoId;
		this.serialNumber = serialNumber;
		this.terminalId = terminalId;
		this.terminalInfoAbmId = terminalInfoAbmId;
	}

	public AbmcTerminalInfo(int terminalInfoId, String serialNumber, String terminalId, String terminalInfoAbmId,
			Integer companyId) {
		this.terminalInfoId = terminalInfoId;
		this.serialNumber = serialNumber;
		this.terminalId = terminalId;
		this.terminalInfoAbmId = terminalInfoAbmId;
		this.companyId = companyId;
	}

	@Id

	@Column(name = "terminal_info_id", unique = true, nullable = false)
	public int getTerminalInfoId() {
		return this.terminalInfoId;
	}

	public void setTerminalInfoId(int terminalInfoId) {
		this.terminalInfoId = terminalInfoId;
	}

	@Column(name = "serial_number", nullable = false, length = 17)
	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Column(name = "terminal_id", nullable = false, length = 9)
	public String getTerminalId() {
		return this.terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	@Column(name = "terminal_info_abm_id", nullable = false, length = 17)
	public String getTerminalInfoAbmId() {
		return this.terminalInfoAbmId;
	}

	public void setTerminalInfoAbmId(String terminalInfoAbmId) {
		this.terminalInfoAbmId = terminalInfoAbmId;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

}
