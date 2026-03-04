package tester;

import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestUserLogin {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			//creata a daoImpl instance of user
			UserDaoImpl dao = new UserDaoImpl();
			
			//now as instance is created allows user to login to app
			System.out.println("please enter the email and password");
			User authenticateUser = dao.authenticateUser(sc.next(), sc.next());
			if(authenticateUser != null) {
				System.out.println(authenticateUser);
			}else {
				throw new Exception("Login Failed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
