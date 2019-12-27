package pojo;

import java.sql.SQLException;
import java.sql.*;

import dao.TableDao;
public class User{
	int	ID;				//用户记录id
	String nickName;	//用户昵称
	String memberName;	//会员名
	String userName;	//用户姓名
	String sex;			//性别
	Date birth;			//出生年月
	String email;		//邮箱地址
	String cellPhone;	//手机号
	String password;	//用户密码
	int userType;		//用户类型
	int deliveryID;		//默认收货信息ID
	Date creatTime;		//用户创建时间
	int rank;			//账号等级
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getID() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getDeliveryID() {
		return deliveryID;
	}
	public void setDeliveryID(int deliveryID) {
		this.deliveryID = deliveryID;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	
}
