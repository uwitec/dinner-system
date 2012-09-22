package com.yummy.action;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Shop;
import com.yummy.service.impl.ShopService;

@Component("shopDetailsAction")
@Scope("prototype")
public class ShopDetailsAction extends ActionSupport {

	private String shopname;
	
	@Resource(name="ShopService")
	private ShopService shopService;
	
	private Map session;
	
	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		shopname = shopname.trim();
		if (shopname == null || "".equals(shopname)) {
			return ERROR;
		}
		System.out.println("=====shopname: " + shopname);
		session = ActionContext.getContext().getSession();
		Shop shop = shopService.getShop(shopname);
		if (shop != null) {
			System.out.println("查询到有shop存在，准备显示");
		}
		System.out.println("");
		session.put("shop", shop);
		return SUCCESS;
	}
	
}
