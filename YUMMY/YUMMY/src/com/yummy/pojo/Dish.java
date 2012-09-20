package com.yummy.pojo;

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Function: 添加了图片属性，可以有三张图片 . <br/> 
 * date: 2012-9-20 下午3:40:25 <br/> 
 * 
 * @author jiahui 
 * @version 1.0
 */
public class Dish implements java.io.Serializable {

	// Fields

	private Integer dishId;
	private String shopname;
	private String name;
	private Integer point;
	private Float price;
	private String introduction;
	private String category;
	private String tag;
	private Date uploadTime;
	private Blob picOne;
	private Blob picTwo;
	private Blob picThree;
	private Set collectDishs = new HashSet(0);
	private Set hotFoods = new HashSet(0);
	private Set orderInfos = new HashSet(0);
	private Set estimates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dish() {
	}

	/** minimal constructor */
	public Dish(String shopname, String name, Float price) {
		this.shopname = shopname;
		this.name = name;
		this.price = price;
	}

	/** full constructor */
	public Dish(String shopname, String name, Integer point, Float price,
			String introduction, String category, String tag, Date uploadTime,
			Set collectDishs, Set hotFoods, Set orderInfos, Set estimates) {
		this.shopname = shopname;
		this.name = name;
		this.point = point;
		this.price = price;
		this.introduction = introduction;
		this.category = category;
		this.tag = tag;
		this.uploadTime = uploadTime;
		this.collectDishs = collectDishs;
		this.hotFoods = hotFoods;
		this.orderInfos = orderInfos;
		this.estimates = estimates;
	}

	// Property accessors

	public Integer getDishId() {
		return this.dishId;
	}

	public void setDishId(Integer dishId) {
		this.dishId = dishId;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoint() {
		return this.point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getUploadTime() {
		return this.uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	
	public Blob getPicOne() {
		return picOne;
	}

	public void setPicOne(Blob picOne) {
		this.picOne = picOne;
	}

	public Blob getPicTwo() {
		return picTwo;
	}

	public void setPicTwo(Blob picTwo) {
		this.picTwo = picTwo;
	}

	public Blob getPicThree() {
		return picThree;
	}

	public void setPicThree(Blob picThree) {
		this.picThree = picThree;
	}

	public Set getCollectDishs() {
		return this.collectDishs;
	}

	public void setCollectDishs(Set collectDishs) {
		this.collectDishs = collectDishs;
	}

	public Set getHotFoods() {
		return this.hotFoods;
	}

	public void setHotFoods(Set hotFoods) {
		this.hotFoods = hotFoods;
	}

	public Set getOrderInfos() {
		return this.orderInfos;
	}

	public void setOrderInfos(Set orderInfos) {
		this.orderInfos = orderInfos;
	}

	public Set getEstimates() {
		return this.estimates;
	}

	public void setEstimates(Set estimates) {
		this.estimates = estimates;
	}

}