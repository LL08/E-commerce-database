package pojo;

import java.math.BigDecimal;

public class Goods {
	int goodsID;//	int	��Ʒ��¼id
	String goodsNumber;//	Nvarchar(50)	��Ʒ���
	String goodsName;//	Nvarchar(50)	��Ʒ����
	int goodsCategoryID;//	int	��Ʒ����ID
	BigDecimal costPrice;//	smallmoney	��Ʒ����
	BigDecimal sellPrice;//	smallmoney	��Ʒ�ۼ�
	String goodsImg;//	Nvarchar(50)	��ƷͼƬ
	float goodsWeigth;//	float	����
	String goodsIntro;//	ntext	��Ʒ����
	int goodsStore;//	int	��Ʒ�洢����
	int clickNum;//	int	������ʴ���
	int isPost;//		�Ƿ��ϼ�/�¼�
	int tagID;//	��ǩID
	String manufacturer; //��������
	int shopID; //��Ʒ��������
	
	public int getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}
	public String getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsCategoryID() {
		return goodsCategoryID;
	}
	public void setGoodsCategoryID(int goodsCategoryID) {
		this.goodsCategoryID = goodsCategoryID;
	}
	public BigDecimal getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}
	public BigDecimal getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getIsPost() {
		return isPost;
	}
	public void setIsPost(int isPost) {
		this.isPost = isPost;
	}
	public int getTagID() {
		return tagID;
	}
	public void setTagID(int tagID) {
		this.tagID = tagID;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getShopID() {
		return shopID;
	}
	public void setShopID(int shopID) {
		this.shopID = shopID;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public float getGoodsWeigth() {
		return goodsWeigth;
	}
	public void setGoodsWeigth(float goodsWeigth) {
		this.goodsWeigth = goodsWeigth;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public int getGoodsStore() {
		return goodsStore;
	}
	public void setGoodsStore(int goodsStore) {
		this.goodsStore = goodsStore;
	}
	public int getClickNum() {
		return clickNum;
	}
	public void setClickNum(int clickNum) {
		this.clickNum = clickNum;
	}

	
	
}
