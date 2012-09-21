package com.yummy.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private CustomerInfo customerInfo;
	private Timestamp orderTime;
	private Integer status;
	private Float totalPrice;
	private String message;
	private Integer grade;
	private Set orderInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(CustomerInfo customerInfo, Timestamp orderTime,
			Integer status, Integer grade) {
		this.customerInfo = customerInfo;
		this.orderTime = orderTime;
		this.status = status;
		this.grade = grade;
	}

	/** full constructor */
	public Order(CustomerInfo customerInfo, Timestamp orderTime,
			Integer status, Float totalPrice, String message, Integer grade,
			Set orderInfos) {
		this.customerInfo = customerInfo;
		this.orderTime = orderTime;
		this.status = status;
		this.totalPrice = totalPrice;
		this.message = message;
		this.grade = grade;
		this.orderInfos = orderInfos;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public CustomerInfo getCustomerInfo() {
		return this.customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public Timestamp getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Set getOrderInfos() {
		return this.orderInfos;
	}

	public void setOrderInfos(Set orderInfos) {
		this.orderInfos = orderInfos;
	}

}