package dao;

import java.sql.SQLException;

import pojos.User;

public interface IUsersDao {
	
	//add a method to login the user
	
	User authenticateUser(String email, String password) throws SQLException;
	
}
