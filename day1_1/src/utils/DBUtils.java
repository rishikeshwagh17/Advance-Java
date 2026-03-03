package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	// add a static method to return a DB connection instance

	private static Connection cn;

	// modify the given code to ensure the Singleton instance of DB connection (not
	// a scalable solution)
	// going to be replaced by the connection pool, from hibernate onwards
	public static Connection getDBConnection() throws SQLException {
		if (cn == null) {
			String url = "jdbc:mysql://localhost:3306/dac22?useSSL=false&allowPublicKeyRetrieval=true";
			cn = DriverManager.getConnection(url, "root", "root123");
		}
		return cn;
	}
}
