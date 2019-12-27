package dao;

import org.apache.ibatis.session.SqlSession;

import pojo.Community;

public class CommunityDaoImpl implements CommunityDao{
	public SqlSession sqlSession;
	public CommunityDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public Community selectCommunityById(int communityID) {
		// TODO �Զ����ɵķ������
		return this.sqlSession.selectOne("CommunityMapper.selectCommunityById", communityID);
	}
	@Override
	public void insertCommunity(Community community) {
		// TODO �Զ����ɵķ������
		this.sqlSession.insert("CommunityMapper.insertCommunity",community);
	}
	@Override
	public void updateCommunity(Community community) {
		// TODO �Զ����ɵķ������
		this.sqlSession.update("CommunityMapper.updateCommunity", community);
	}
	@Override
	public void deleteCommunity(int communityID) {
		// TODO �Զ����ɵķ������
		this.sqlSession.delete("CommunityMapper.deleteCommunity", communityID);
	}
	@Override
	public Community selectCommunityByGoodsId(int goodsID) {
		// TODO �Զ����ɵķ������
		return this.sqlSession.selectOne("CommunityMapper.selectCommunityByGoodsId", goodsID);
	}
}
