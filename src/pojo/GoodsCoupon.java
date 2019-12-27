package pojo;

public class GoodsCoupon {
	int ID;//	Int	对应记录id	自增主键
	String goodsNumber;//	Nvarchar(50)	商品编号	非空
	int couponID;//	Int	优惠券id	非空
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		this.ID = id;
	}
	public String getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public int getCouponID() {
		return couponID;
	}
	public void setCouponID(int couponID) {
		this.couponID = couponID;
	}

}
