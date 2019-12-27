package pojo;

import java.math.BigDecimal;
import java.sql.*;

public class Order {
	int ID;//	int	������¼id
	int orderID;//	int	�������
	Date creatTime;//	datatime	��������ʱ��
	int sellerShopID;//	int		���ҵ���ID
	int userID;//	Nvarchar(50)	��ң��û�����Ա��
	int state;//	int	����״̬
	BigDecimal actualPay;//	smallmoney	ʵ�ʸ���
	int modeOfPay;//	smallint	֧����ʽ
	BigDecimal discount;//	smallmoney	�����Ż��ۿ�
	int deliveryID;//	int	�����ջ���Ϣ
	public int getID() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getSellerShopID() {
		return sellerShopID;
	}
	public void setSellerShopID(int sellerShopID) {
		this.sellerShopID = sellerShopID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public BigDecimal getActualPay() {
		return actualPay;
	}
	public void setActualPay(BigDecimal actualPay) {
		this.actualPay = actualPay;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getModeOfPay() {
		return modeOfPay;
	}
	public void setModeOfPay(int modeOfPay) {
		this.modeOfPay = modeOfPay;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public int getDeliveryID() {
		return deliveryID;
	}
	public void setDeliveryID(int deliveryID) {
		this.deliveryID = deliveryID;
	}
	
}
