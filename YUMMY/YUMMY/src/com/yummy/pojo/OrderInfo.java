package com.yummy.pojo;

/**
 * OrderInfo entity. @author MyEclipse Persistence Tools
 */

public class OrderInfo implements java.io.Serializable {

	// Fields

	private Integer orderinfoId;
	private Order order;
	private Dish dish;
	private Integer account;

	// Constructors

	/** default constructor */
	public OrderInfo() {
	}

	/** minimal constructor */
	public OrderInfo(Order order, Dish dish) {
		this.order = order;
		this.dish = dish;
	}

	/** full constructor */
	public OrderInfo(Order order, Dish dish, Integer account) {
		this.order = order;
		this.dish = dish;
		this.account = account;
	}

	// Property accessors

	public Integer getOrderinfoId() {
		return this.orderinfoId;
	}

	public void setOrderinfoId(Integer orderinfoId) {
		this.orderinfoId = orderinfoId;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

}