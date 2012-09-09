package com.yummy.dao;

import com.yummy.dao.impl.Shop;

public interface IShopDAO {
	public Shop findByShopName(String shopName);
	public void delete(String shopName);
	public void save(Shop shop);
	public void update(Shop shop);

}
