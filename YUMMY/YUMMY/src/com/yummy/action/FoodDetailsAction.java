package com.yummy.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.dao.impl.DishDAO;
import com.yummy.pojo.Dish;

@Component("foodDetailsAction")
@Scope("prototype")
public class FoodDetailsAction extends ActionSupport {

	private int id;
	@Resource
	private DishDAO dishDAO;
	private Map session;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (((Integer)id) == null) {
			return ERROR;
		}
		Dish dish = dishDAO.findById(id);
		if (dish != null) {
			System.out.println("查询到有食物， 准备要显示");
		}
		session = ActionContext.getContext().getSession();
		session.put("dish", dish);
		return SUCCESS;
	}
	
}
