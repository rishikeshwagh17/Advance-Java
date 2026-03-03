package tester;

import java.util.Scanner;

import dao.AccountDaoImpl;

public class TestStoredProc {

	public static void main(String[] args) {
		// testing stored procedure
		try (Scanner sc = new Scanner(System.in)) {
			// create a dao instance
			AccountDaoImpl dao = new AccountDaoImpl();
			System.out.println("enter the  srcAcctNo,  destAcctNo,  amount");
			System.out.println(dao.transferFunds(sc.nextInt(), sc.nextInt(), sc.nextDouble()));
			dao.cleanUp();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
