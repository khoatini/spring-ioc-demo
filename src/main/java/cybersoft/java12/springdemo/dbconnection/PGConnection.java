package cybersoft.java12.springdemo.dbconnection;

public class PGConnection implements DatabaseConnection {

	private DbDataSource dataSource;
	public PGConnection() {
		
	}
	
	@Override
	public void getConnection() {
		System.out.println("Get PostgreSQl Connection !");
		
	}
	
}
