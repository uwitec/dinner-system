package com.yummy.pojo;

import java.sql.Timestamp;
import java.util.List;

public class OrderDetailsDTO {
	
	private String shopname;
	private List<ItemDTO> items;
	private float totalPrice;
	private Timestamp time;
	
	public String getShopname() {
		return shopname;
	}
	
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	
	public List<ItemDTO> getItems() {
		return items;
	}
	
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	
	public float getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Timestamp getTime() {
		return time;
	}
	
	public void setTime(Timestamp time) {
		this.time = time;
	}
	
}
