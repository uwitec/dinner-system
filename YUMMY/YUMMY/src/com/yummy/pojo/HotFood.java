package com.yummy.pojo;

import java.util.Date;



/**
 * HotFood entity. @author MyEclipse Persistence Tools
 */

public class HotFood implements java.io.Serializable {

	// Fields

	private Integer id;
	private Shop shop;
	private Dish dish;
	private Float currentPrice;
	private Integer account;
	private Date validDate;

	// Constructors

	/** default constructor */
	public HotFood() {
	}

	/** minimal constructor */
	public HotFood(Integer id, Shop shop, Dish dish, Float currentPrice,
			Integer account) {
		this.id = id;
		this.shop = shop;
		this.dish = dish;
		this.currentPrice = currentPrice;
		this.account = account;
	}

	/** full constructor */
	public HotFood(Integer id, Shop shop, Dish dish, Float currentPrice,
			Integer account, Date validDate) {
		this.id = id;
		this.shop = shop;
		this.dish = dish;
		this.currentPrice = currentPrice;
		this.account = account;
		this.validDate = validDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Date getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

}