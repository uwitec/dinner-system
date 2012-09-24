package com.yummy.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Dish;
import com.yummy.service.IDishService;

public class UpdateMyDishAction extends ActionSupport {
	

	private String name;
	private Integer point;
	private Float price;
	private String introduction;
	private String category;
	private String tag;
	private Date uploadTime;
	private String picOne;
	
	private IDishService dishService;


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getPoint() {
		return point;
	}



	public void setPoint(Integer point) {
		this.point = point;
	}



	public Float getPrice() {
		return price;
	}



	public void setPrice(Float price) {
		this.price = price;
	}



	public String getIntroduction() {
		return introduction;
	}



	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getTag() {
		return tag;
	}



	public void setTag(String tag) {
		this.tag = tag;
	}



	public Date getUploadTime() {
		return uploadTime;
	}



	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}



	public String getPicOne() {
		return picOne;
	}



	public void setPicOne(String picOne) {
		this.picOne = picOne;
	}



	public IDishService getDishService() {
		return dishService;
	}



	public void setDishService(IDishService dishService) {
		this.dishService = dishService;
	}



	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("dishId");
		
		Dish dish = dishService.getDish(Integer.parseInt(id));
		request.setAttribute("dishUpade", dish);

		return SUCCESS;
	}

}