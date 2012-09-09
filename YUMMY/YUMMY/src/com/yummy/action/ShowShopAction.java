package com.yummy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yummy.dao.impl.Shop;
import com.yummy.service.IShopService;

public class ShowShopAction extends ActionSupport{
	
	private IShopService shopService;
	
	public void setShopService(IShopService shopService) {
		this.shopService = shopService;
	}

	public void validate(){
		
	}
	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String shopName = (String)request.getAttribute("shopName");
		Shop myshop = shopService.getShop(shopName);
		if(myshop!=null){
			session.setAttribute("myShop", myshop);
			request.setAttribute("ReadOnly", true);
		}else{
			request.setAttribute("ReadOnly", false);
		}
		return SUCCESS;
	}

}
