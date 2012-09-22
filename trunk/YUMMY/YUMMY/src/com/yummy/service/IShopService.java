package com.yummy.service;

import com.yummy.pojo.Shop;

public interface IShopService {
	
	public Shop getShop(String shopName);

	public void addShop(Shop shop);
	
	public Boolean isExistShop(String shopName);
	
	public void updateShop(Shop shop);
	

}
