package pojo;

import java.util.*;

public class Answer {
	int questionID;//	int	����ID	�ǿ�
	int userID;//	int	�ش���û�id	�ǿ�
	String answerContent;//	Nvarchar(1000)	�ش�����	�ǿ�
	Date answerTime;//	datetime	�ش�ʱ��	�ǿ�
	int thumbUpNum;//	int	�ش������	����Ϊ��
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
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public Date getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(Date answerTime) {
		this.answerTime = answerTime;
	}
	public int getThumbUpNum() {
		return thumbUpNum;
	}
	public void setThumbUpNum(int thumbUpNum) {
		this.thumbUpNum = thumbUpNum;
	}
	public void getAnswer() {
		System.out.println("questionID: "+this.getQuestionID());
		System.out.println("userID: "+this.getUserID());
		System.out.println("thumbUpNum: "+this.getThumbUpNum());
		System.out.println("content: "+this.getAnswerContent());
		System.out.println("answerTime: "+this.getAnswerTime());
	}

}
