package pojo;

import java.util.*;

public class AskQuestion {
	int questionID;//	int	问题记录id	自增主键
	int userID;//	int	提问用户id	非空
	String questionContent;//	Nvarchar(1000)	问题内容	非空
	Date createTime;//	datetime	提问时间	非空
	int communityID;//	int	问题所属社区ID	非空
	int tagID;//	int	问题标签	允许为空
	int attentionNum;//	int	关注问题的人数	允许为空
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getCommunityID() {
		return communityID;
	}
	public void setCommunityID(int communityID) {
		this.communityID = communityID;
	}
	public int getTagID() {
		return tagID;
	}
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}
	public int getAttentionNum() {
		return attentionNum;
	}
	public void setAttentionNum(int attentionNum) {
		this.attentionNum = attentionNum;
	}
	public void getAskQuestion() {
		System.out.println("questionID: "+this.getQuestionID());
		System.out.println("attentionNum: "+this.getAttentionNum());
		System.out.println("content: "+this.getQuestionContent());
		System.out.println("tagID: "+this.getTagID());
		System.out.println("createTime: "+this.getCreateTime());
		System.out.println("communityID: "+this.getCommunityID());
		System.out.println("userID: "+this.getUserID());
	}
}
