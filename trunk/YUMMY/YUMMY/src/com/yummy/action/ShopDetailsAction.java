package com.yummy.action;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Dish;
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
		session = ActionContext.getContext().getSession();
		Shop shop = shopService.getShop(shopname);
		Set<Dish> dishs = shop.getDishs();
		System.out.println("set size:" + dishs.size());
		session.put("shop", shop);
		session.put("dishs", dishs);
		return SUCCESS;
	}
	
}
