package pojo;

public class Comment {
	int commentID;	//int	���۱��	��������
	int goodsID;	//int	��Ʒid	�ǿ�
	int userID;		//int	�û�id	�ǿ�
	String goodsComment;	//Ntext	��Ʒ��������	�ǿ�
	String commentImg;	//Nvarchar(50)	����ͼƬ	����Ϊ��
	int Star;	//int	�����Ǽ�	����Ϊ��
	int tagID;	//Nvarchar(50)	��ǩID	����Ϊ��
	int isAppend;	//smallint	�Ƿ�Ϊ׷������	�ǿգ�Ĭ��Ϊ0
	int isDefault;	//smallint	�Ƿ�ΪĬ������	����Ϊ��
	public int getCommentID() {
		return commentID;
	}
	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}
	public int getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getGoodsComment() {
		return goodsComment;
	}
	public void setGoodsComment(String goodsComment) {
		this.goodsComment = goodsComment;
	}
	public String getCommentImg() {
		return commentImg;
	}
	public void setCommentImg(String commentImg) {
		this.commentImg = commentImg;
	}
	public int getStar() {
		return Star;
	}
	public void setStar(int star) {
		Star = star;
	}
	public int getTagID() {
		return tagID;
	}
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}
	public int getIsAppend() {
		return isAppend;
	}
	public void setIsAppend(int isAppend) {
		this.isAppend = isAppend;
	}
	public int getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

}
