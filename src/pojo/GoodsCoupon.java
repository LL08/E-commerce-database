package pojo;

public class GoodsCoupon {
	int ID;//	Int	��Ӧ��¼id	��������
	String goodsNumber;//	Nvarchar(50)	��Ʒ���	�ǿ�
	int couponID;//	Int	�Ż�ȯid	�ǿ�
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
