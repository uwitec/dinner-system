package com.yummy.pojo;
/**
 * Function: 实体bean,用来转载查询店铺结果. <br/> 
 * date: 2012-9-21 上午9:41:33 <br/> 
 * 
 * @author Jiahui.wen
 */
public class SearchShopsDTO {
	private String shopname;
	private String telephone;
	private String introduction;
	private String delivery_range;
	
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getDelivery_range() {
		return delivery_range;
	}
	public void setDelivery_range(String delivery_range) {
		this.delivery_range = delivery_range;
	}
	
	
}
