package com.yummy.pojo;

import java.util.Date;

/**
 * CollectShop entity. @author MyEclipse Persistence Tools
 */

public class CollectShop implements java.io.Serializable {

	// Fields

	private Integer id;
	private Shop shop;
	private Customer customer;
	private Date collectTime;
	private String tag;

	// Constructors

	/** default constructor */
	public CollectShop() {
	}

	/** minimal constructor */
	public CollectShop(Shop shop, Customer customer, Date collectTime) {
		this.shop = shop;
		this.customer = customer;
		this.collectTime = collectTime;
	}

	/** full constructor */
	public CollectShop(Shop shop, Customer customer, Date collectTime,
			String tag) {
		this.shop = shop;
		this.customer = customer;
		this.collectTime = collectTime;
		this.tag = tag;
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

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCollectTime() {
		return this.collectTime;
	}

	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}