package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.User;

import static utils.DBUtils.openConnection;

public class UserDaoImpl implements IUsersDao {
	private Connection cn;
	private PreparedStatement pst1;

	public UserDaoImpl() throws SQLException {
		// create a connection
		cn = openConnection();
		// pass the sql to the statement
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
	}

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		//set IN params
		pst1.setString(1, email);
		pst1.setString(2, password);
		
		//then execute the query to get result
		try(ResultSet rst = pst1.executeQuery()){
			if(rst.next()) {
				//id | name    | email          | password | reg_amt | reg_date   | role 
				User user = new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getDouble(5), rst.getDate(6), rst.getString(7));
				return user;
			}
		}
		
		return null;
	}
	
	public void cleanUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
		if(cn != null)
			cn.close();
	}

}
