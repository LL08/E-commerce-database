package pojo;
import java.math.BigDecimal;
import java.sql.*;
public class Seckill {
	int seckillID;//	int	��ɱ�id	��������
	Date createTime;//	datetime	��ɱ�����ʱ��	�ǿ�
	String goodsNumber;//	Nvarchar(50)	��ɱ����ƷID	�ǿ�
	int lastedTime;//	int	�����ʱ�䣨�룩	�ǿ�
	int limitedNumber;//	int	�޹�����	����Ϊ��
	BigDecimal seckillPrice;//	smallmoney	��ɱ��	�ǿ�
	String Intro;//	Nvarchar(1000)	��ɱ�˵��	����Ϊ��
	public int getSeckillID() {
		return seckillID;
	}
	public void setSeckillID(int seckillID) {
		this.seckillID = seckillID;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public int getLastedTime() {
		return lastedTime;
	}
	public void setLastedTime(int lastedTime) {
		this.lastedTime = lastedTime;
	}
	public int getLimitedNumber() {
		return limitedNumber;
	}
	public void setLimitedNumber(int limitedNumber) {
		this.limitedNumber = limitedNumber;
	}
	public BigDecimal getSeckillPrice() {
		return seckillPrice;
	}
	public void setSeckillPrice(BigDecimal seckillPrice) {
		this.seckillPrice = seckillPrice;
	}
	public String getIntro() {
		return Intro;
	}
	public void setIntro(String intro) {
		Intro = intro;
	}

}
