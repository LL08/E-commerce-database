package pojo;

import java.sql.SQLException;

import dao.TableDao;

public class Admin{
	int ID;//管理员记录id 自增主键
	String adminName;//	Nvarchar(10)	管理员姓名
	String adminPassword;//	Nvarchar(15)	管理员密码
	String adminType;//	smallint	管理员类型
	int adminPower;//	int	管理员权限
	int isEnable;//	bit	管理员是否启用
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
