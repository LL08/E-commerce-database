package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.AskQuestion;

public class AskQuestionDaoImpl implements AskQuestionDao{
	public SqlSession sqlSession;
	public AskQuestionDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<AskQuestion> queryQuestionAllByCommunityID(int communityID) {
		// TODO 自动生成的方法存根
		return this.sqlSession.selectList("AskQuestionMapper.queryQuestionAllByCommunityID", communityID);
	}

	@Override
	public void insertAskQuestion(AskQuestion askQuestion) {
		// TODO 自动生成的方法存根
		this.sqlSession.insert("AskQuestionMapper.insertAskQuestion", askQuestion);
	}

	@Override
	public void updateAskQuestion(AskQuestion askQuestion) {
		// TODO 自动生成的方法存根
		this.sqlSession.update("AskQuestionMapper.updateAskQuestion", askQuestion);
	}

	@Override
	public void deleteAskQuestion(int questionID) {
		// TODO 自动生成的方法存根
		this.sqlSession.delete("AskQuestionMapper.deleteAskQuestion", questionID);
	}
	@Override
	public AskQuestion selectAskQuestionById(int questionID) {
		// TODO 自动生成的方法存根
		return this.sqlSession.selectOne("AskQuestionMapper.selectAskQuestionById", questionID);
	}

}
