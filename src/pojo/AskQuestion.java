package pojo;

import java.util.*;

public class AskQuestion {
	int questionID;//	int	�����¼id	��������
	int userID;//	int	�����û�id	�ǿ�
	String questionContent;//	Nvarchar(1000)	��������	�ǿ�
	Date createTime;//	datetime	����ʱ��	�ǿ�
	int communityID;//	int	������������ID	�ǿ�
	int tagID;//	int	�����ǩ	����Ϊ��
	int attentionNum;//	int	��ע���������	����Ϊ��
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
