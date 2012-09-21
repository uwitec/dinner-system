package com.yummy.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("foodDetailsAction")
@Scope("prototype")
public class FoodDetailsAction extends ActionSupport {

	private long id;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("====id: " + id + "====");
		return SUCCESS;
	}
	
}
