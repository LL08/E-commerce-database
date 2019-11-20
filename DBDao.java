package dao;

import java.sql.*;

public class DBDao implements DB_DAO{
	String DBName,user,password,url;
	Connection ct;
	public DBDao(String dbName,String user,String password) {
		this.DBName=dbName;
		this.user=user;
		this.password=password;
		this.url = "jdbc:sqlserver://localhost:1433;databaseName = "+dbName;
	}
	public Connection connection() {
		// TODO �Զ����ɵķ������
		ct=null;
		try {		        //1.��������		 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		  
			System.out.println("���������ɹ���");	
			}catch(Exception e) {		 
				e.printStackTrace();		
				System.out.println("��������ʧ�ܣ�");	
			}		
		try {  		        //2.����		  
			ct = DriverManager.getConnection(url,user,password);		 
			System.out.println("�������ݿ�ɹ���");
			}catch(Exception e) {	
				e.printStackTrace();		
				System.out.println("�������ݿ�ʧ�ܣ�");		
			}	
		return ct;
	}

	public void close() {
		// TODO �Զ����ɵķ������
		try {
			ct.close();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	@Override
	public void drop() {
		// TODO �Զ����ɵķ������
		try {
			Statement st=ct.createStatement();
			st.executeUpdate("DROP DATABASE "+DBName);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
}
