package pojo;

import java.sql.SQLException;

import dao.TableDao;

public class Admin{
	int ID;//����Ա��¼id ��������
	String adminName;//	Nvarchar(10)	����Ա����
	String adminPassword;//	Nvarchar(15)	����Ա����
	String adminType;//	smallint	����Ա����
	int adminPower;//	int	����ԱȨ��
	int isEnable;//	bit	����Ա�Ƿ�����
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminType() {
		return adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}
	public int getAdminPower() {
		return adminPower;
	}
	public void setAdminPower(int adminPower) {
		this.adminPower = adminPower;
	}
	public int isEnable() {
		return isEnable;
	}
	public void setEnable(int isEnable) {
		this.isEnable = isEnable;
	}
	
	
}
