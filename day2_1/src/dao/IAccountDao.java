package dao;

import java.sql.SQLException;

public interface IAccountDao {
	
	//add a method to transfer funds from source to dest a/c
	String transferFunds(int srcAcctNo,int destAcctNo,double amount) throws SQLException;
	
}
