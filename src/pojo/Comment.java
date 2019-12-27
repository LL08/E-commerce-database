package pojo;

public class Comment {
	int commentID;	//int	评论编号	自增主键
	int goodsID;	//int	商品id	非空
	int userID;		//int	用户id	非空
	String goodsComment;	//Ntext	商品评论内容	非空
	String commentImg;	//Nvarchar(50)	评论图片	允许为空
	int Star;	//int	评价星级	允许为空
	int tagID;	//Nvarchar(50)	标签ID	允许为空
	int isAppend;	//smallint	是否为追加评论	非空，默认为0
	int isDefault;	//smallint	是否为默认评论	允许为空
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
