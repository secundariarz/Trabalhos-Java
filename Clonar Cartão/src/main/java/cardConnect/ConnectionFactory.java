package cardConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/javaweb", "root", "1234");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}