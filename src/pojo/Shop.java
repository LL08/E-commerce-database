package pojo;

import java.sql.*;

public class Shop {
	int sellerShopID;//	int	����ID	��������
	Date creatTime;//	datatime	���̴���ʱ��	�ǿ�
	String shopName;//	Nvarchar(50)	��������	�ǿ� Ψһ
	String shopImg;//	Nvarchar(50)	����ͷ��	����Ϊ��
	String shopOwnerName;//	Nvarchar(50)	��������������	�ǿ�
	String shopIntro;//	Nvarchar(100)	���̼��	����Ϊ��
	int fansNumber;//	int	��˿��	����Ϊ��
	int shopType;//	int	��������	����Ϊ��
	public int getSellerShopID() {
		return sellerShopID;
	}
	public void setSellerShopID(int sellerShopID) {
		this.sellerShopID = sellerShopID;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public String getShopOwnerName() {
		return shopOwnerName;
	}
	public void setShopOwnerName(String shopOwnerName) {
		this.shopOwnerName = shopOwnerName;
	}
	public String getShopIntro() {
		return shopIntro;
	}
	public void setShopIntro(String shopIntro) {
		this.shopIntro = shopIntro;
	}
	public int getFansNumber() {
		return fansNumber;
	}
	public void setFansNumber(int fansNumber) {
		this.fansNumber = fansNumber;
	}
	public int getShopType() {
		return shopType;
	}
	public void setShopType(int shopType) {
		this.shopType = shopType;
	}
	
	
}
