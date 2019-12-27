package dao;

import pojo.*;

public interface CommunityDao {
	public Community selectCommunityById(int communityID);
	public Community selectCommunityByGoodsId(int goodsID);
	public void insertCommunity(Community community);
	public void updateCommunity(Community community);
	public void deleteCommunity(int communityID);
}
