package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.*;
import pojo.*;

/**
 * Servlet implementation class GoodsToCommunity
 */
@WebServlet("/GoodsToCommunity")
public class GoodsToCommunity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CommunityDao communityDao;
		SqlSession sqlSession;
		String resource = "mybatis-config.xml";
		// 读取配置文件
		InputStream is = Resources.getResourceAsStream(resource);
		// 构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// 获取sqlSession
		sqlSession = sqlSessionFactory.openSession();
		communityDao = new CommunityDaoImpl(sqlSession);
		int goodsID=0;
		Cookie [] cookies=request.getCookies();
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("goodsName")) {
				goodsID=Integer.parseInt(cookie.getValue());
				Community community=communityDao.selectCommunityByGoodsId(goodsID);
				request.setAttribute("community", community);
				AskQuestionDao askQuestionDao=new AskQuestionDaoImpl(sqlSession);
				List<AskQuestion> askQuestions=askQuestionDao.queryQuestionAllByCommunityID(community.getCommunityID());
				request.setAttribute("askQuestions", askQuestions);
				String forwardUrl="/community.jsp";
				RequestDispatcher dispatcher =request.getRequestDispatcher(forwardUrl);
			  	dispatcher.forward(request, response);
			}
		}
		

	}

}
