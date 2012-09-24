package com.yummy.service;

import java.sql.SQLException;

import com.yummy.pojo.ShopWorker;

public interface IShopWorkerService {

	public ShopWorker getUser(String username);

	public void addUser(ShopWorker shopWorker);
	
	public void addUser(String username, String shopName, String password, String email,String registerDate) throws SQLException;
	
	public Boolean isExistUSer(String username);
	
	public void updateUser(ShopWorker shopWorker);
	
}
