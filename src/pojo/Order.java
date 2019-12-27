package pojo;

import java.math.BigDecimal;
import java.sql.*;

public class Order {
	int ID;//	int	订单记录id
	int orderID;//	int	订单编号
	Date creatTime;//	datatime	订单创建时间
	int sellerShopID;//	int		卖家店铺ID
	int userID;//	Nvarchar(50)	买家（用户）会员名
	int state;//	int	订单状态
	BigDecimal actualPay;//	smallmoney	实际付款
	int modeOfPay;//	smallint	支付方式
	BigDecimal discount;//	smallmoney	订单优惠折扣
	int deliveryID;//	int	订单收货信息
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
