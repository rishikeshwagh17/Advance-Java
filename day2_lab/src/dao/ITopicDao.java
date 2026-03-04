package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Topic;

public interface ITopicDao {
	
	
	//add a method to display all the available topics
	List<Topic> getAllTopics() throws SQLException;
}
