package com.yummy.pojo;

/**
 * 
 * Function: 实体bean 用于转载购物车的食物。. <br/> 
 * date: 2012-9-22 下午6:53:38 <br/> 
 * 
 * @author Jiahui.wen
 */
public class ItemDTO implements java.io.Serializable{
	/**
	 * 食物的Id
	 */
	private int id;
	/**
	 * 选购食物的份数
	 */
	private int orderCount;
	/**
	 * 食物的名字
	 */
	private String itemname;
	/**
	 * 食物简介图路径
	 */
	private String picPath;
	
	/**
	 * 食物价格
	 */
	private float price;

	public ItemDTO() {
		
	}

	public ItemDTO(int id, int orderCount) {
		super();
		this.id = id;
		this.orderCount = orderCount;
	}
	

	public ItemDTO(int id, int orderCount, String itemname, String picPath) {
		super();
		this.id = id;
		this.orderCount = orderCount;
		this.itemname = itemname;
		this.picPath = picPath;
	}

	
	
	public ItemDTO(int id, int orderCount, String itemname, String picPath,
			float price) {
		super();
		this.id = id;
		this.orderCount = orderCount;
		this.itemname = itemname;
		this.picPath = picPath;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
