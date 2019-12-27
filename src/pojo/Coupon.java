package pojo;

import java.sql.Date;

public class Coupon {
	int couponID;	//Int	优惠券id	自增主键
	String couponName;	//Nvarchar(50)	优惠券名称	非空
	int sellerShopID;	//Int	创建的店铺	非空
	Date createTime;	//Datetime	优惠券创建时间	非空
	int isUsable;	//Smallint	优惠券是否可用	允许为空
	int validTime;	//Int	优惠券有效天数	非空
	int isGot;	//Smallint	是否被领取	非空
	int isUsed;	//Smallint	是否被使用	非空
	int couponType;	//Smallint	优惠券类型	允许为空
	public int getCouponID() {
		return couponID;
	}
	public void setCouponID(int couponID) {
		this.couponID = couponID;
	}
	public String getCouponName() {
		return couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public int getSellerShopID() {
		return sellerShopID;
	}
	public void setSellerShopID(int sellerShopID) {
		this.sellerShopID = sellerShopID;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getIsUsable() {
		return isUsable;
	}
	public void setIsUsable(int isUsable) {
		this.isUsable = isUsable;
	}
	public int getValidTime() {
		return validTime;
	}
	public void setValidTime(int validTime) {
		this.validTime = validTime;
	}
	public int getIsGot() {
		return isGot;
	}
	public void setIsGot(int isGot) {
		this.isGot = isGot;
	}
	public int getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}
	public int getCouponType() {
		return couponType;
	}
	public void setCouponType(int couponType) {
		this.couponType = couponType;
	}

}
