package pojo;

public class Community {
	int communityID;	//int	����ID	��������
	int goodsID;	//int	��ƷID	�ǿ�
	int questionNum;	//int	��������	�ǿ�
	String communityIntro;	//Nvarchar(100)	��������	����Ϊ��
	int tagNum;	//int	��ǩ����	����Ϊ��
	String tagID;	//Nvarchar(100)	��ǩID	����Ϊ��
	public int getCommunityID() {
		return communityID;
	}
	public void setCommunityID(int communityID) {
		this.communityID = communityID;
	}
	public int getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	public int getQuestionNum() {
		return questionNum;
	}
	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}
	public String getCommunityIntro() {
		return communityIntro;
	}
	public void setCommunityIntro(String communityIntro) {
		this.communityIntro = communityIntro;
	}
	public int getTagNum() {
		return tagNum;
	}
	public void setTagNum(int tagNum) {
		this.tagNum = tagNum;
	}
	public String getTagID() {
		return tagID;
	}
	public void setTagID(String tagID) {
		this.tagID = tagID;
	}
	public void getCommunity() {
		System.out.println("communityID: "+this.getCommunityID());
		System.out.println("communityIntro: "+this.getCommunityIntro());
		System.out.println("tagNum: "+this.getTagNum());
		System.out.println("tagID��"+this.getTagID().replaceAll("_", "  "));
		System.out.println("questionNum: "+this.getQuestionNum());
	}
}
