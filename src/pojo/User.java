package pojo;

import java.sql.SQLException;
import java.sql.*;

import dao.TableDao;
public class User{
	int	ID;				//�û���¼id
	String nickName;	//�û��ǳ�
	String memberName;	//��Ա��
	String userName;	//�û�����
	String sex;			//�Ա�
	Date birth;			//��������
	String email;		//�����ַ
	String cellPhone;	//�ֻ���
	String password;	//�û�����
	int userType;		//�û�����
	int deliveryID;		//Ĭ���ջ���ϢID
	Date creatTime;		//�û�����ʱ��
	int rank;			//�˺ŵȼ�
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
