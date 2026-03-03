package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

	private static Connection cn;

	public static Connection getDBConnection() throws SQLException {
		//if connection is not there then create a new one otherwise return existing one
		if (cn == null) {
			//connection url along with username and password
			String url = "jdbc:mysql://localhost:3306/dac22?useSSL=false&allowPublicKeyRetrieval=true";
			cn =  DriverManager.getConnection(url, "root", "root123");
		}
		return cn;
	}
}
