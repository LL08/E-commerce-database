package pojo;
import java.math.BigDecimal;
import java.sql.*;
public class Seckill {
	int seckillID;//	int	秒杀活动id	自增主键
	Date createTime;//	datetime	秒杀活动创建时间	非空
	String goodsNumber;//	Nvarchar(50)	秒杀的商品ID	非空
	int lastedTime;//	int	活动持续时间（秒）	非空
	int limitedNumber;//	int	限购数量	允许为空
	BigDecimal seckillPrice;//	smallmoney	秒杀价	非空
	String Intro;//	Nvarchar(1000)	秒杀活动说明	允许为空
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
