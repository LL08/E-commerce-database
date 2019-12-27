package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.*;
import pojo.*;

public class Test {//��Ʒ��������
	SqlSession sqlSession;
	Community community;
	CommunityDao communityDao;
	List<AskQuestion> askQuestions;
	AskQuestionDao askQuestionDao;
	List<List<Answer>> answerss;
	AnswerDao answerDao;
	public void CommunityTest(int goodsID) throws IOException {//��ѯ��Ʒ���������Ϣ
		String resource = "mybatis-config.xml";
		// ��ȡ�����ļ�
		InputStream is = Resources.getResourceAsStream(resource);
		// ����SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// ��ȡsqlSession
		sqlSession = sqlSessionFactory.openSession();
		communityDao = new CommunityDaoImpl(sqlSession);
		askQuestionDao=new AskQuestionDaoImpl(sqlSession);
		answerDao=new AnswerDaoImpl(sqlSession);
		community=communityDao.selectCommunityByGoodsId(goodsID);
		sqlSession.commit();
		
		community.getCommunity();
		System.out.println();
		
		if(community.getQuestionNum()>0) {
			askQuestionDao=new AskQuestionDaoImpl(sqlSession);
			askQuestions=askQuestionDao.queryQuestionAllByCommunityID(community.getCommunityID());
			answerss=new ArrayList<List<Answer>>();
			sqlSession.commit();
			
			this.showAskQuestionList(askQuestions);
			if(answerss.size()>0) {
				for(List<Answer> answers:answerss) {
					if(answers.size()>0)
						this.showAnswerList(answers);
				}
			}
		}
	}
	public void showAnswerList(List<Answer> answers) {
		for(Answer answer:answers) {
			answer.getAnswer();
			System.out.println();
		}
	}
	public void showAskQuestionList(List<AskQuestion> askQuestions) {
		int i=0;
		for(AskQuestion ask:askQuestions) {
			System.out.println(i++);
	//		ask.getAskQuestion();
			System.out.println();
			List<Answer> answers=answerDao.queryAnswerAllByQuestionID(ask.getQuestionID());
			if(answers.size()>0)
				answerss.add(answers);
		}
	}
	public void askQuestionTest(int userID,String question) {//�û����һ�����⣬ask_question����һ�����⣬community����������Ŀ
		
		AskQuestion userAsk=new AskQuestion();
		userAsk.setUserID(userID);
		userAsk.setAttentionNum(0);
		userAsk.setCommunityID(community.getCommunityID());
		userAsk.setTagID(1);
		userAsk.setQuestionContent("user: "+userID+" "+question);
		userAsk.setCreateTime(new Date());
		askQuestionDao.insertAskQuestion(userAsk);
		sqlSession.commit();
		
		community.setQuestionNum(community.getQuestionNum()+1);
		communityDao.updateCommunity(community);
		sqlSession.commit();
	}
	public void answerQuestionTest(int userID,int questionID,String answerContent) {//�û��ش�һ�����⣬answer����һ���ش�
		Answer userAnswer=new Answer();
		userAnswer.setUserID(userID);
		userAnswer.setQuestionID(questionID);
		userAnswer.setThumbUpNum(0);
		userAnswer.setAnswerContent("userID: "+userID+" "+answerContent);
		userAnswer.setAnswerTime(new Date());
		answerDao.insertAnswer(userAnswer);
		sqlSession.commit();
	}
	public void deleteQuestionTest(int questionID) {//ɾ��һ�����⣬��������µĻش�ȫ��ɾ����community������Ŀ��1
		answerDao.deleteAnswerByQuestionID(questionID);
		sqlSession.commit();
		
		askQuestionDao.deleteAskQuestion(questionID);
		sqlSession.commit();
		
		community.setQuestionNum(community.getQuestionNum()-1);
		communityDao.updateCommunity(community);
		sqlSession.commit();
	}
	public void deleteAnswerTest(int questionID,int userID) {//ɾ��һ���ش�
		QUBean qubean=new QUBean();
		qubean.setqID(questionID);
		qubean.setuID(userID);
		answerDao.deleteAnswer(qubean);
		sqlSession.commit();
	}
	public static void main(String [] args) throws IOException {
		Test test=new Test();
		test.CommunityTest(1);//��ʼ��
//		test.askQuestionTest(1, "���һ������");
//		test.answerQuestionTest(2, 1, "һ���ش�");
//		test.answerQuestionTest(3, 1, "һ���ش�");
//		test.answerQuestionTest(4, 1, "һ���ش�");
//		test.deleteAnswerTest(1, 3);
//		test.deleteQuestionTest(1);
		test.CommunityTest(1);
	}
}
