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
		// TODO 自动生成的方法存根
		return this.sqlSession.selectList("AnswerMapper.queryAnswerAllByQuestionID", questionID);
	}

	@Override
	public Answer selectAnswerById(QUBean qubean) {
		// TODO 自动生成的方法存根
		return this.sqlSession.selectOne("AnswerMapper.selectAnswerById", qubean);
	}

	@Override
	public void insertAnswer(Answer answer) {
		// TODO 自动生成的方法存根
		this.sqlSession.insert("AnswerMapper.insertAnswer", answer);
	}

	@Override
	public void updateAnswer(Answer answer) {
		// TODO 自动生成的方法存根
		this.sqlSession.update("AnswerMapper.updateAnswer", answer);
	}

	@Override
	public void deleteAnswer(QUBean qubean) {
		// TODO 自动生成的方法存根
		this.sqlSession.delete("AnswerMapper.deleteAnswer", qubean);
	}
	@Override
	public void deleteAnswerByQuestionID(int questionID) {
		// TODO 自动生成的方法存根
		this.sqlSession.delete("AnswerMapper.deleteAnswerByQuestionID", questionID);
	}

}
