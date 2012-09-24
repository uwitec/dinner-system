package com.yummy.pojo;

import java.util.HashSet;
import java.util.Set;

import org.apache.struts2.components.Date;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private String email;
	private String gender;
	private Integer credits;
	private String registerDate;
	private Set collectDishs = new HashSet(0);
	private Set giftExchanges = new HashSet(0);
	private Set collectShops = new HashSet(0);
	private Set estimates = new HashSet(0);
	private Set customerInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	public Customer(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/** minimal constructor */
	public Customer(String username, String password, String email,
			String gender, Integer credits) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.credits = credits;
		java.util.Calendar c = java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
        this.registerDate = f.format(c.getTime());  
	}

	/** full constructor */
	public Customer(String username, String password, String email,
			String gender, Integer credits, String registerDate,
			Set collectDishs, Set giftExchanges, Set collectShops,
			Set estimates, Set customerInfos) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.credits = credits;
		this.registerDate = registerDate;
		this.collectDishs = collectDishs;
		this.giftExchanges = giftExchanges;
		this.collectShops = collectShops;
		this.estimates = estimates;
		this.customerInfos = customerInfos;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getCredits() {
		return this.credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public Set getCollectDishs() {
		return this.collectDishs;
	}

	public void setCollectDishs(Set collectDishs) {
		this.collectDishs = collectDishs;
	}

	public Set getGiftExchanges() {
		return this.giftExchanges;
	}

	public void setGiftExchanges(Set giftExchanges) {
		this.giftExchanges = giftExchanges;
	}

	public Set getCollectShops() {
		return this.collectShops;
	}

	public void setCollectShops(Set collectShops) {
		this.collectShops = collectShops;
	}

	public Set getEstimates() {
		return this.estimates;
	}

	public void setEstimates(Set estimates) {
		this.estimates = estimates;
	}

	public Set getCustomerInfos() {
		return this.customerInfos;
	}

	public void setCustomerInfos(Set customerInfos) {
		this.customerInfos = customerInfos;
	}

}