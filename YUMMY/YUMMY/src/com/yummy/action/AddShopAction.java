package com.yummy.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yummy.dao.impl.Shop;
import com.yummy.service.IShopService;

public class AddShopAction extends ActionSupport{
	
	private String shopname;
	private String address;
	private String telephone;
	private String qq;
	private String introduction;
	private String logo;
	private Integer point;
	private String deliveryRange;
	
	private IShopService shopService;
	
	public String getShopname() {
		return shopname;
	}



	public void setShopname(String shopname) {
		this.shopname = shopname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getQq() {
		return qq;
	}



	public void setQq(String qq) {
		this.qq = qq;
	}



	public String getIntroduction() {
		return introduction;
	}



	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}



	public String getLogo() {
		return logo;
	}



	public void setLogo(String logo) {
		this.logo = logo;
	}


	
	public Integer getPoint() {
		return point;
	}



	public void setPoint(Integer point) {
		this.point = point;
	}



	public String getDeliveryRange() {
		return deliveryRange;
	}



	public void setDeliveryRange(String deliveryRange) {
		this.deliveryRange = deliveryRange;
	}



	public void setShopService(IShopService shopService) {
		this.shopService = shopService;
	}


	public void validate(){
		if(shopname=="")
				addFieldError("SN_noNull","餐厅名不能为空");
	}

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Shop shop = new Shop(shopname,address,telephone,qq,introduction,logo,0,deliveryRange);
		request.setAttribute("shopName", shopname);
		shopService.addShop(shop);
		return SUCCESS;
	}

}
