package com.yummy.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Dish;
import com.yummy.pojo.Shop;
import com.yummy.service.IDishService;
import com.yummy.service.IShopService;

public class ShowAllMyDishAction extends ActionSupport{
	
	private IDishService dishService;

	
	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}

	public void validate(){
		
	}
	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		//没登录 设定为...
				request.getSession().setAttribute("shopName","dfs");
				String shopname = (String) request.getSession().getAttribute("shopName");
		
		List list  = dishService.getAllMyDish(shopname);
		//System.out.print(((Dish)list.get(0)).getName());
		ActionContext.getContext().getSession().put("dishList", list);
		return SUCCESS;
	}

}
