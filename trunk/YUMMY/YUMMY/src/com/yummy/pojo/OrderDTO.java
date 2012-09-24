package com.yummy.pojo;

import java.util.List;

public class OrderDTO {
	
	private String username;
	private String address;
	private String telephone;
	private String message;
	private String shopname;
	private float totalPrice;
	private List items;
	
	public OrderDTO() {
		super();
	}

	public OrderDTO(String username, String address, String telephone,
			String message) {
		super();
		this.username = username;
		this.address = address;
		this.telephone = telephone;
		this.message = message;
	}
	
	
	public OrderDTO(String username, String address, String telephone,
			String message, String shopname, float totalPrice, List items) {
		super();
		this.username = username;
		this.address = address;
		this.telephone = telephone;
		this.shopname = shopname;
		this.message = message;
		this.totalPrice = totalPrice;
		this.items = items;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	
	
}
