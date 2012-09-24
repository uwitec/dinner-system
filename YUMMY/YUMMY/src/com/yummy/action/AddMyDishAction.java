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
import com.yummy.pojo.Shop;
import com.yummy.service.IDishService;

public class AddMyDishAction extends ActionSupport {
	

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
		//没登录 设定为...
		//request.getSession().setAttribute("shopName","dfs");
		//String shopname = (String) request.getSession().getAttribute("shopName");
		Shop shop = (Shop)ActionContext.getContext().getSession().get("shop_on");
		String shopname = shop.getShopname();
		if("".equals(picOne))picOne = ServletActionContext.getServletContext().getRealPath("/images/dish/default_pic.jpg");
		
		String img_type = picOne.substring(picOne.lastIndexOf('.'));
		//Random ran = new Random(2);
		String fileName = name+img_type;
		File localfile = new File(picOne);
		String RealPath = ServletActionContext.getServletContext().getRealPath("/images");
		
		
		File file = new File(RealPath+"\\"+shopname);
		
		System.out.print(RealPath+"\\"+shopname);
		
		if(!file.exists()){
			file.mkdirs();
		}
		try {
			FileUtils.copyFile(localfile, new File(file,fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uploadTime = new Date();
		String path = RealPath+"\\"+shopname+"\\"+fileName;
		Dish dish = new Dish(shop,name,point,price,introduction,category, tag, uploadTime,path);
		
		dishService.addDish(dish);

		return SUCCESS;
	}
}