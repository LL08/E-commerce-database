package dao;

import java.sql.*;

public interface Table_DAO {
	//查询
	public ResultSet select_all();
	public ResultSet select_part(String ... msgs);
	public ResultSet select_distinct(String msgs);
	public ResultSet select_where(String columnName,String expression);
	public ResultSet select_where_in(String ... msgs);
	public ResultSet select_between(String name,String msgs1,String msgs2);
	//列的增删修
	public void alter_add(String name,String type);
	public void alter_alter(String name,String type);
	public void alter_drop(String name);
	//指定列排序
	public ResultSet order_by(String name);
	public ResultSet order_by_desc(String name);
	//插入行
	public void insert_into(String ... msgs);
	public void insert_into_appoint(int n,String ... msgs);
	//更新删除行
	public void updata(String name1,String name2,String oldValue,String newValue);
	public void delete(String name,String value);
	
	public void top(int n);
	//删表关连接
	public void drop();
	public void close();
}
