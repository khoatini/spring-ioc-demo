package cybersoft.java12.springdemo.dbconnection;

public class MysqlConnection implements DatabaseConnection {
	
	private DbDataSource datasource;
	
	public MysqlConnection() {
		
	}
	
	@Override
	public void getConnection() {
		System.out.println("Got SqlConnection");
	}
}
