package com.yummy.pojo;

import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dish entity. @author MyEclipse Persistence Tools
 */

public class Dish implements java.io.Serializable {

	// Fields

	private Integer dishId;
	private Shop shop;
	private String name;
	private Integer point;
	private Float price;
	private String introduction;
	private String category;
	private String tag;
	private Date uploadTime;
	private String picOne;
	private String picTwo;
	private String picThree;
	private Set collectDishs = new HashSet(0);
	private Set orderInfos = new HashSet(0);
	private Set estimates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dish() {
	}

	public Dish(Integer dishId,String name,Float price, String shopname) {
		super();
		this.dishId = dishId;
//		this.shopname = shopname;
		this.name = name;
		this.price = price;
	}
	
	public Dish(Integer dishId, String shopname, String name, Integer point,
			Float price, Blob picOne) {
		super();
		this.dishId = dishId;
//		this.shopname = shopname;
		this.name = name;
		this.point = point;
		this.price = price;
//		this.picOne = picOne;
	}
	
	/** minimal constructor */
	public Dish(Shop shop, String name, Float price, String picOne) {
		this.shop = shop;
		this.name = name;
		this.price = price;
		this.picOne = picOne;
	}

	/** full constructor */
	public Dish(Shop shop, String name, Integer point, Float price,
			String introduction, String category, String tag, Date uploadTime,
			String picOne, String picTwo, String picThree, Set collectDishs,
			Set orderInfos, Set estimates) {
		this.shop = shop;
		this.name = name;
		this.point = point;
		this.price = price;
		this.introduction = introduction;
		this.category = category;
		this.tag = tag;
		this.uploadTime = uploadTime;
		this.picOne = picOne;
		this.picTwo = picTwo;
		this.picThree = picThree;
		this.collectDishs = collectDishs;
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

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
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

	public String getPicOne() {
		return this.picOne;
	}

	public void setPicOne(String picOne) {
		this.picOne = picOne;
	}

	public String getPicTwo() {
		return this.picTwo;
	}

	public void setPicTwo(String picTwo) {
		this.picTwo = picTwo;
	}

	public String getPicThree() {
		return this.picThree;
	}

	public void setPicThree(String picThree) {
		this.picThree = picThree;
	}

	public Set getCollectDishs() {
		return this.collectDishs;
	}

	public void setCollectDishs(Set collectDishs) {
		this.collectDishs = collectDishs;
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