package tester;

import java.util.List;
import java.util.Scanner;

import dao.TutorialDaoImpl;
import pojos.Tutorial;

public class TestTutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			//create a instance of dao impl class
			TutorialDaoImpl daoImpl = new TutorialDaoImpl();
			System.out.println("Enter the topic id for the tutorials");
			List<String> allTutorialsByTopic = daoImpl.getAllTutorialsByTopic(sc.nextInt());
			allTutorialsByTopic.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
