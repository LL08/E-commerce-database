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
		// TODO 自动生成的方法存根
		ct=null;
		try {		        //1.加载驱动		 
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		  
			System.out.println("加载驱动成功！");	
			}catch(Exception e) {		 
				e.printStackTrace();		
				System.out.println("加载驱动失败！");	
			}		
		try {  		        //2.连接		  
			ct = DriverManager.getConnection(url,user,password);		 
			System.out.println("连接数据库成功！");
			}catch(Exception e) {	
				e.printStackTrace();		
				System.out.println("连接数据库失败！");		
			}	
		return ct;
	}

	public void close() {
		// TODO 自动生成的方法存根
		try {
			ct.close();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	@Override
	public void drop() {
		// TODO 自动生成的方法存根
		try {
			Statement st=ct.createStatement();
			st.executeUpdate("DROP DATABASE "+DBName);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
}
