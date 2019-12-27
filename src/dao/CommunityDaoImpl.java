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
		// TODO 自动生成的方法存根
		return this.sqlSession.selectOne("CommunityMapper.selectCommunityById", communityID);
	}
	@Override
	public void insertCommunity(Community community) {
		// TODO 自动生成的方法存根
		this.sqlSession.insert("CommunityMapper.insertCommunity",community);
	}
	@Override
	public void updateCommunity(Community community) {
		// TODO 自动生成的方法存根
		this.sqlSession.update("CommunityMapper.updateCommunity", community);
	}
	@Override
	public void deleteCommunity(int communityID) {
		// TODO 自动生成的方法存根
		this.sqlSession.delete("CommunityMapper.deleteCommunity", communityID);
	}
	@Override
	public Community selectCommunityByGoodsId(int goodsID) {
		// TODO 自动生成的方法存根
		return this.sqlSession.selectOne("CommunityMapper.selectCommunityByGoodsId", goodsID);
	}
}
