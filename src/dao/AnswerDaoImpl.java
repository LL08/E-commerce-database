package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.Answer;

public class AnswerDaoImpl implements AnswerDao{
	public SqlSession sqlSession;
	public AnswerDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<Answer> queryAnswerAllByQuestionID(int questionID) {
		// TODO �Զ����ɵķ������
		return this.sqlSession.selectList("AnswerMapper.queryAnswerAllByQuestionID", questionID);
	}

	@Override
	public Answer selectAnswerById(QUBean qubean) {
		// TODO �Զ����ɵķ������
		return this.sqlSession.selectOne("AnswerMapper.selectAnswerById", qubean);
	}

	@Override
	public void insertAnswer(Answer answer) {
		// TODO �Զ����ɵķ������
		this.sqlSession.insert("AnswerMapper.insertAnswer", answer);
	}

	@Override
	public void updateAnswer(Answer answer) {
		// TODO �Զ����ɵķ������
		this.sqlSession.update("AnswerMapper.updateAnswer", answer);
	}

	@Override
	public void deleteAnswer(QUBean qubean) {
		// TODO �Զ����ɵķ������
		this.sqlSession.delete("AnswerMapper.deleteAnswer", qubean);
	}
	@Override
	public void deleteAnswerByQuestionID(int questionID) {
		// TODO �Զ����ɵķ������
		this.sqlSession.delete("AnswerMapper.deleteAnswerByQuestionID", questionID);
	}

}
