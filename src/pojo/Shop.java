package pojo;

import java.sql.*;

public class Shop {
	int sellerShopID;//	int	店铺ID	自增主键
	Date creatTime;//	datatime	店铺创建时间	非空
	String shopName;//	Nvarchar(50)	店铺名字	非空 唯一
	String shopImg;//	Nvarchar(50)	店铺头像	允许为空
	String shopOwnerName;//	Nvarchar(50)	店铺所有者姓名	非空
	String shopIntro;//	Nvarchar(100)	店铺简介	允许为空
	int fansNumber;//	int	粉丝数	允许为空
	int shopType;//	int	店铺类型	允许为空
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
