package dao;

import java.sql.*;

class A extends DBDao{

	public A(String dbName, String user, String password) {
		super(dbName, user, password);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}

class B extends TableDao{
	public B(String tableName) {
		super(tableName);
		// TODO �Զ����ɵĹ��캯�����
	}
	int num;
	String user,pw,name;
}

public class Test {

	public static void main(String[] args) {
		String dbname="test3_2";
		String user="171002115";
		String pw="171002115";
		A a=new A(dbname,user,pw);
		B b=new B("�γ̱�");
		b.setConnection(a.connection());
//		b.select_all();
//		b.select_part("CNO","CN","CT");
//		b.select_where("*", "CT = '��Ȫ'");
//		b.select_where_in("CT","��Ȫ","������");
//		b.select_between("CNO", "K001", "K006");
//		b.top(4);
//		b.alter_add("add1", "int");
//		b.alter_alter("add1", "char");
//		b.alter_drop("add1");
//		b.insert_into("I007","����7","1.5","40","����ʦ7");
//		b.insert_into_appoint(5, "CNO","CN","CREDIT","PERIOD","CT","I008","NEW8","3.0","30","NEWTEA8");
//		b.delete("CT", "NEWTEA8");
//		b.order_by("CREDIT");
//		b.order_by_desc("CREDIT");
//		b.updata("CREDIT", "CREDIT", "2.5", "3");
		
	}	
}
