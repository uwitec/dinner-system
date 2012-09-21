package com.yummy.pojo;

import java.sql.Blob;


/**
 * 
 * Function: 实体bean 用以传输显示在页面上食物的数据 . <br/> 
 * date: 2012-9-20 下午8:56:08 <br/> 
 * 
 * @author jiahui 
 * @version 1.0
 */
public class HighQualifiedFoodDTO {
	
	private long dishId;
	private String name;
	private float price;
	private int point;
	private String shopname;
	private Blob picOne;
	
	public long getDishId() {
		return dishId;
	}

	public void setDishId(long dishId) {
		this.dishId = dishId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getShopname() {
		return shopname;
	}
	
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	
	public Blob getPicOne() {
		return picOne;
	}
	
	public void setPicOne(Blob picOne) {
		this.picOne = picOne;
	}
	
}
