package com.yummy.pojo;

import java.util.Date;

/**
 * GiftExchange entity. @author MyEclipse Persistence Tools
 */

public class GiftExchange implements java.io.Serializable {

	// Fields

	private Integer id;
	private Customer customer;
	private Gift gift;
	private Date date;

	// Constructors

	/** default constructor */
	public GiftExchange() {
	}

	/** minimal constructor */
	public GiftExchange(Integer id, Customer customer, Gift gift) {
		this.id = id;
		this.customer = customer;
		this.gift = gift;
	}

	/** full constructor */
	public GiftExchange(Integer id, Customer customer, Gift gift, Date date) {
		this.id = id;
		this.customer = customer;
		this.gift = gift;
		this.date = date;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Gift getGift() {
		return this.gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}