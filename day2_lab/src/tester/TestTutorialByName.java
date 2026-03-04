package tester;

import java.util.List;
import java.util.Scanner;

import dao.TutorialDaoImpl;
import pojos.Tutorial;

public class TestTutorialByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			//create a instance of dao impl class
			TutorialDaoImpl daoImpl = new TutorialDaoImpl();
			System.out.println("Enter the topic name for the tutorials");
			Tutorial tutorial = daoImpl.getTutorialByName(sc.nextLine());
			System.out.println(tutorial);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
