package authentication

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals


class QbLoginTest {

    @Test
    public void testGetUsableLoginName() {
        QbLogin login = new QbLogin()
        login.loginName = "Admin"
        login.password = "123abc"
        login.serverName = "localhost"
        login.dbName = "qbschema"
        login.dbIp = "localhost"
        login.dbPort = "4000"
        login.loginType = QbLoginTypeEnum.LOGIN_QBUSER

        assertEquals("41646d696e", login.getUsableLoginName())
    }

    @Test
    public void testGetUsableOdbcLoginName() {
        QbLogin login = new QbLogin()
        login.loginName = "Admin"
        login.password = "123abc"
        login.serverName = "localhost"
        login.dbName = "qbschema"
        login.dbIp = "localhost"
        login.dbPort = "4000"
        login.loginType = QbLoginTypeEnum.LOGIN_ODBC

        assertEquals("Admin", login.getUsableLoginName())
    }

    @Test
    public void testGetUsablePassword() {
        QbLogin login = new QbLogin()
        login.loginName = "Admin"
        login.password = "123abc"
        login.serverName = "localhost"
        login.dbName = "qbschema"
        login.dbIp = "localhost"
        login.dbPort = "4000"
        login.loginType = QbLoginTypeEnum.LOGIN_QBUSER

        assertEquals("06979c931f84406fc190f6a6f21e512f600d0a8800", login.getUsablePassword())
    }

    @Test
    public void testGetUsableOdbcPassword() {
        QbLogin login = new QbLogin()
        login.loginName = "Admin"
        login.password = "123abc"
        login.serverName = "localhost"
        login.dbName = "qbschema"
        login.dbIp = "localhost"
        login.dbPort = "4000"
        login.loginType = QbLoginTypeEnum.LOGIN_ODBC

        assertEquals("123abc", login.getUsablePassword())
    }
}
