package pojo;

public class GotCoupon {
	int ID;//	Int	优惠券领取记录id	自增主键
	int couponID;//	int	优惠券id	非空
	int userID;//	int	领取优惠券的用户会员id	非空
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCouponID() {
		return couponID;
	}
	public void setCouponID(int couponID) {
		this.couponID = couponID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
}
