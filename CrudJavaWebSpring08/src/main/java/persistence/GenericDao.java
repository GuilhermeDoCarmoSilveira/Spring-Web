package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {
	
	private Connection c;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String hostName = "localhost";
		String dbName = "Spring08";
		String user = "sa";
		String senha = "123456";
		
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		
		return c = DriverManager.getConnection(
				   String.format("jdbc:jtds:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s;", hostName, dbName, user, senha));

	}

}