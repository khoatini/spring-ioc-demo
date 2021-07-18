package cybersoft.java12.springdemo.container;

import cybersoft.java12.springdemo.dbconnection.DbDataSource;
import cybersoft.java12.springdemo.dbconnection.MysqlConnection;
import cybersoft.java12.springdemo.dbconnection.PGConnection;

public class IoCContainer {
	
	private static MysqlConnection mySqlConnection = null;
	private static PGConnection pgConnection = null;
	private static DbDataSource dataSource = null;
	
	static public Object getBean(String beanName) {
		switch (beanName) {
		case "mySqlConnection":
			return getMysqlConnection();
		case "pgConnection" :
			return getPgConnection();
		case "dataSource" :
			return getDataSource();	
		default:
			break;
		}
		return null;
	}

	private static Object getDataSource() {
		
		return dataSource == null ? new DbDataSource("", "", "") : dataSource;
	}

	private static Object getPgConnection() {
		
		return pgConnection == null ? new PGConnection() : pgConnection;
	}

	private static Object getMysqlConnection() {
		
		return pgConnection == null ? new MysqlConnection() : pgConnection;
	}
}
