package com.yummy.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Shop;
import com.yummy.service.IShopService;

public class ShopLoginAction extends ActionSupport {

	private String shopname;
	private String password;
	private IShopService shopService;
	
	public String getShopname() {
		return shopname;
	}


	public void setShopname(String shopname) {
		this.shopname = shopname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

	public void setShopService(IShopService shopService) {
		this.shopService = shopService;
	}


	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		Shop shop = shopService.getShop(shopname);
		ActionContext.getContext().getSession().put("shop_on", shop);
		return SUCCESS;
	}
}