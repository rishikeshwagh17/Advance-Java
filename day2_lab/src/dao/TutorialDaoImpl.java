package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.openConnection;
import pojos.Tutorial;

public class TutorialDaoImpl implements ITutorialDao {

	private Connection cn;
	private PreparedStatement pst1,pst2,pst3;
	
	
	public TutorialDaoImpl() throws SQLException {
		//connection set up throws exception
		cn = openConnection();
		//create a prep statement  for query
		pst1 = cn.prepareStatement("select name from tutorials where topic_id=? order by visits desc");
		pst2 = cn.prepareStatement("select * from tutorials where name=? ");
		pst3 = cn.prepareStatement("update tutorials SET visits = visits +1 where id= ?");
	}
	
	@Override
	public List<String> getAllTutorialsByTopic(int topicId) throws SQLException {
		//set IN Params to get details
		pst1.setInt(1, topicId);
		List<String> tutorials = new ArrayList<>();
		//now as we set param execute the SQL query
		try(ResultSet rst =  pst1.executeQuery()){
			while(rst.next()) {
				tutorials.add(rst.getString(1));
			}
		}
		return tutorials;
	}

	@Override
	public Tutorial getTutorialByName(String name) throws SQLException {
		//SET IN Param
		pst2.setString(1, name);
		Tutorial tutorial = null;
		//executeQuery
		try(ResultSet rst = pst2.executeQuery()){
			if(rst.next()) {
				 tutorial = new Tutorial(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDate(4), rst.getInt(5), rst.getString(6), rst.getInt(7));
			}
		}
		return tutorial;
	}

	@Override
	public String updateTutorialVisits(int tutorialId) throws SQLException {
		//SET in params
		pst3.setInt(1, tutorialId);
		//execute the query now
		int executeUpdate = pst3.executeUpdate();
		if(executeUpdate ==1) {
			return "Tutorial visit updated...";
		}
		return "tutorial visit update failed";
	}

	
	
}
