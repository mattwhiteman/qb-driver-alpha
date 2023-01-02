package authentication

import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils

public class QbLogin
{
	String loginName
	String password
	QbLoginTypeEnum loginType = QbLoginTypeEnum.LOGIN_ODBC
	String serverName
	String dbName
	String dbIp
	String dbPort
	
	public boolean validate()
	{
		if (!loginName) {
			return false
		}

		if (!password) {
			return false
		}

		if (!loginType) {
			return false
		}

		if (!serverName) {
			return false
		}

		if (!dbName) {
			return false
		}

		if (!dbIp) {
			return false
		}

		if (!dbPort) {
			return false
		}
		
		return true
	}
	
	public String getUsableLoginName()
	{
		if (!loginName || loginType == null) {
			return null
		}

		// ODBC accounts are not obfuscated in the db
		if (loginType == QbLoginTypeEnum.LOGIN_ODBC) {
			return loginName
		}
		
		return Hex.encodeHexString(loginName.getBytes())
	}
	
	public String getUsablePassword()
	{
		if (!password || !loginType) {
			return null
		}

		// Passwords for odbc accounts are not obfuscated through the normal algorithm when these accounts are created
		if (loginType == QbLoginTypeEnum.LOGIN_ODBC) {
			return password
		}

		// Concatenate the login name and password into a single string
		String combined = ""
		if (loginName != null) {
			combined += loginName
		}
		combined += password

		// Get the sha1 hash of the combined string
		String hash = DigestUtils.sha1Hex(combined)

		// Append '06' to the beginning of the hash
		String convertedPwd = "06"
		convertedPwd += hash

		// Replace the last 2 hex characters of the hash with '00'
		convertedPwd = convertedPwd.substring(0, convertedPwd.length()-2)
		convertedPwd += "00"
		
		return convertedPwd
	}
	
	public String getConnectionUrl()
	{
		if (!validate()) {
			return null
		}
		
		StringBuilder connectionUrl = new StringBuilder()
		connectionUrl.append("jdbc:sqlanywhere:")
		connectionUrl.append("eng=")
		connectionUrl.append(serverName)
		connectionUrl.append(";database=")
		connectionUrl.append(dbName)
		connectionUrl.append(";links=tcpip(")
		connectionUrl.append("host=")
		connectionUrl.append(dbIp)
		connectionUrl.append(";port=")
		connectionUrl.append(dbPort)
		connectionUrl.append(")")
		
		return connectionUrl.toString()
	}

	@Override
	public String toString() {
		return "QbLogin [loginName=" + loginName + ", password=" + password + ", loginType=" + loginType \
				+ ", serverName=" + serverName + ", dbName=" + dbName + ", dbIp=" + dbIp + ", dbPort=" + dbPort + "]";
	}
}