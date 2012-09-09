package com.yummy.dao.impl;

import java.util.HashSet;
import java.util.Set;

/**
 * Shop entity. @author MyEclipse Persistence Tools
 */

public class Shop implements java.io.Serializable {

	// Fields

	private String shopname;
	private String address;
	private String telephone;
	private String qq;
	private String introduction;
	private String logo;
	private Integer point;
	private String deliveryRange;
//	private Set hotFoods = new HashSet(0);
//	private Set dishs = new HashSet(0);
//	private Set collectShops = new HashSet(0);
//	private Set shopWorkers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Shop() {
	}

	/** minimal constructor */
	public Shop(String shopname, String address, String telephone,String qq,
			String introduction,String logo,Integer point,String deliveryRange) {
		this.shopname = shopname;
		this.address = address;
		this.telephone = telephone;
		this.qq = qq;
		this.introduction = introduction;
		this.logo = logo;
		this.point = point;
		this.deliveryRange = deliveryRange;
	}

	/** full constructor */
	public Shop(String shopname, String address, String telephone, String qq,
			String introduction, String logo, Integer point,
			String deliveryRange, Set hotFoods, Set dishs, Set collectShops,
			Set shopWorkers) {
		this.shopname = shopname;
		this.address = address;
		this.telephone = telephone;
		this.qq = qq;
		this.introduction = introduction;
		this.logo = logo;
		this.point = point;
		this.deliveryRange = deliveryRange;
//		this.hotFoods = hotFoods;
	//	this.dishs = dishs;
//		this.collectShops = collectShops;
//		this.shopWorkers = shopWorkers;
	}

	// Property accessors

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Integer getPoint() {
		return this.point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getDeliveryRange() {
		return this.deliveryRange;
	}

	public void setDeliveryRange(String deliveryRange) {
		this.deliveryRange = deliveryRange;
	}
	/*
	public Set getHotFoods() {
		return this.hotFoods;
	}

	public void setHotFoods(Set hotFoods) {
		this.hotFoods = hotFoods;
	}

	public Set getDishs() {
		return this.dishs;
	}

	public void setDishs(Set dishs) {
		this.dishs = dishs;
	}

	public Set getCollectShops() {
		return this.collectShops;
	}

	public void setCollectShops(Set collectShops) {
		this.collectShops = collectShops;
	}

	public Set getShopWorkers() {
		return this.shopWorkers;
	}

	public void setShopWorkers(Set shopWorkers) {
		this.shopWorkers = shopWorkers;
	}
*/
}