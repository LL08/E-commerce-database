package dao;

import java.sql.*;

public interface Table_DAO {
	//��ѯ
	public ResultSet select_all();
	public ResultSet select_part(String ... msgs);
	public ResultSet select_distinct(String msgs);
	public ResultSet select_where(String columnName,String expression);
	public ResultSet select_where_in(String ... msgs);
	public ResultSet select_between(String name,String msgs1,String msgs2);
	//�е���ɾ��
	public void alter_add(String name,String type);
	public void alter_alter(String name,String type);
	public void alter_drop(String name);
	//ָ��������
	public ResultSet order_by(String name);
	public ResultSet order_by_desc(String name);
	//������
	public void insert_into(String ... msgs);
	public void insert_into_appoint(int n,String ... msgs);
	//����ɾ����
	public void updata(String name1,String name2,String oldValue,String newValue);
	public void delete(String name,String value);
	
	public void top(int n);
	//ɾ�������
	public void drop();
	public void close();
}
