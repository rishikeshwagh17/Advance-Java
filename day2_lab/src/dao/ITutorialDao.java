package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Tutorial;

public interface ITutorialDao {
	
	//add a method to display tutorials in desc
	List<String> getAllTutorialsByTopic(int topicId) throws SQLException;
	//all tutorial by topic name
	Tutorial getTutorialByName(String name) throws SQLException;
	
	//method for update visits
	String updateTutorialVisits(int tutorialId)throws SQLException;
}
