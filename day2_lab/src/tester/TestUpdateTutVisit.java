package tester;

import java.util.Scanner;

import dao.TutorialDaoImpl;
import pojos.Tutorial;

public class TestUpdateTutVisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			// create a instance of dao impl class
			TutorialDaoImpl daoImpl = new TutorialDaoImpl();
			System.out.println("Enter the tutorial id to visit ");
			System.out.println(daoImpl.updateTutorialVisits(sc.nextInt()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
