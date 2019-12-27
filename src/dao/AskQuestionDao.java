package dao;
import java.util.List;
import pojo.*;
public interface AskQuestionDao {
	public List<AskQuestion> queryQuestionAllByCommunityID(int communityID);
	public AskQuestion selectAskQuestionById(int questionID);
	public void insertAskQuestion(AskQuestion askQuestion);
	public void updateAskQuestion(AskQuestion askQuestion);
	public void deleteAskQuestion(int questionID);
}
