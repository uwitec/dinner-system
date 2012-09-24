package com.yummy.service.impl;

import java.sql.SQLException;

import com.yummy.dao.IShopWorkerDAO;
import com.yummy.pojo.ShopWorker;
import com.yummy.service.IShopWorkerService;

public class ShopWorkerService implements IShopWorkerService {
	
	private IShopWorkerDAO shopWorkerDAO;

	public void setShopWorkerDAO(IShopWorkerDAO shopWorkerDAO) {
		this.shopWorkerDAO = shopWorkerDAO;
	}

	public ShopWorker getUser(String username) {
		// TODO Auto-generated method stub
		return shopWorkerDAO.findByUserName(username);
	}

	public void addUser(String username, String shopName, String password, String email,String registerDate) throws SQLException {
		// TODO Auto-generated method stub
		shopWorkerDAO.save(username,password,shopName,email,registerDate);
	}

	public Boolean isExistUSer(String username) {
		// TODO Auto-generated method stub
		ShopWorker shopWorker = shopWorkerDAO.findByUserName(username);
		if(shopWorker == null) return false;
		else return true;
	}

	public void updateUser(ShopWorker shopWorker) {
		// TODO Auto-generated method stub
		shopWorkerDAO.update(shopWorker);
	}

	public IShopWorkerDAO getShopWorkerDAO() {
		return shopWorkerDAO;
	}

	public void addUser(ShopWorker shopWorker) {
		// TODO Auto-generated method stub
		
	}


}
