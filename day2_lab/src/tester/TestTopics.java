package tester;

import java.util.List;

import dao.TopicDaoImpl;
import pojos.Topic;

public class TestTopics {

	public static void main(String[] args) {
		//create a dao impl class instance 
		
		try{
			TopicDaoImpl dao  = new TopicDaoImpl();
			//now use the dao method to display all the topics
			List<Topic> allTopics = dao.getAllTopics();
			System.out.println("all the topics ");
			allTopics.forEach(System.out::println);
			dao.cleanUp();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
