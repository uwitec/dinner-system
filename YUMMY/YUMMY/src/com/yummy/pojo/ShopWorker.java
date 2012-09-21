package com.yummy.pojo;

/**
 * ShopWorker entity. @author MyEclipse Persistence Tools
 */

public class ShopWorker implements java.io.Serializable {

	// Fields

	private String username;
	private Shop shop;
	private String password;
	private String email;
	private String registerDate;

	// Constructors

	/** default constructor */
	public ShopWorker() {
	}

	/** minimal constructor */
	public ShopWorker(String username, Shop shop, String password, String email) {
		this.username = username;
		this.shop = shop;
		this.password = password;
		this.email = email;
	}

	/** full constructor */
	public ShopWorker(String username, Shop shop, String password,
			String email, String registerDate) {
		this.username = username;
		this.shop = shop;
		this.password = password;
		this.email = email;
		this.registerDate = registerDate;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
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

	public String getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

}