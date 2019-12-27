package pojo;

import java.util.*;

public class Answer {
	int questionID;//	int	问题ID	非空
	int userID;//	int	回答的用户id	非空
	String answerContent;//	Nvarchar(1000)	回答内容	非空
	Date answerTime;//	datetime	回答时间	非空
	int thumbUpNum;//	int	回答点赞数	允许为空
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
