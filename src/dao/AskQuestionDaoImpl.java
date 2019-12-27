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
		// TODO �Զ����ɵķ������
		return this.sqlSession.selectList("AskQuestionMapper.queryQuestionAllByCommunityID", communityID);
	}

	@Override
	public void insertAskQuestion(AskQuestion askQuestion) {
		// TODO �Զ����ɵķ������
		this.sqlSession.insert("AskQuestionMapper.insertAskQuestion", askQuestion);
	}

	@Override
	public void updateAskQuestion(AskQuestion askQuestion) {
		// TODO �Զ����ɵķ������
		this.sqlSession.update("AskQuestionMapper.updateAskQuestion", askQuestion);
	}

	@Override
	public void deleteAskQuestion(int questionID) {
		// TODO �Զ����ɵķ������
		this.sqlSession.delete("AskQuestionMapper.deleteAskQuestion", questionID);
	}
	@Override
	public AskQuestion selectAskQuestionById(int questionID) {
		// TODO �Զ����ɵķ������
		return this.sqlSession.selectOne("AskQuestionMapper.selectAskQuestionById", questionID);
	}

}
