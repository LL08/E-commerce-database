package pojo;

import java.sql.Date;

public class Coupon {
	int couponID;	//Int	�Ż�ȯid	��������
	String couponName;	//Nvarchar(50)	�Ż�ȯ����	�ǿ�
	int sellerShopID;	//Int	�����ĵ���	�ǿ�
	Date createTime;	//Datetime	�Ż�ȯ����ʱ��	�ǿ�
	int isUsable;	//Smallint	�Ż�ȯ�Ƿ����	����Ϊ��
	int validTime;	//Int	�Ż�ȯ��Ч����	�ǿ�
	int isGot;	//Smallint	�Ƿ���ȡ	�ǿ�
	int isUsed;	//Smallint	�Ƿ�ʹ��	�ǿ�
	int couponType;	//Smallint	�Ż�ȯ����	����Ϊ��
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
