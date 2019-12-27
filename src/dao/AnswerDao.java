package dao;
import java.util.List;
import pojo.*;
public interface AnswerDao {
	public List<Answer> queryAnswerAllByQuestionID(int questionID);
	public Answer selectAnswerById(QUBean qubean);
	public void insertAnswer(Answer answer);
	public void updateAnswer(Answer answer);
	public void deleteAnswer(QUBean qubean);
	public void deleteAnswerByQuestionID(int questionID);
}
