package com.yummy.service.impl;

import com.yummy.dao.IShopDAO;
import com.yummy.pojo.Shop;
import com.yummy.service.IShopService;

public class ShopService implements IShopService{

	private IShopDAO shopDAO;
	
	public void setShopDAO(IShopDAO shopDAO) {
		this.shopDAO = shopDAO;
	}

	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		shopDAO.save(shop);
	}

	public Shop getShop(String shopName) {
		// TODO Auto-generated method stub
		return shopDAO.findByShopName(shopName);
	}

	public Boolean isExistShop(String shopName) {
		// TODO Auto-generated method stub
		Shop shop = shopDAO.findByShopName(shopName);
		if(shop==null) return false;
		
		return true;
	}

	public void updateShop(Shop shop) {
		// TODO Auto-generated method stub
		shopDAO.update(shop);
		
	}
	
	
}
