package com.yummy.dao;

import java.sql.SQLException;
import java.util.List;

import com.yummy.pojo.ShopWorker;

public interface IShopWorkerDAO {

	public abstract void save(ShopWorker transientInstance);
	
	public abstract void save(String username, String shopName, String password, String email,String registerDate) throws SQLException;

	public abstract void delete(ShopWorker transientInstance);

	public abstract ShopWorker findById(java.lang.String id);

	public abstract List findAll();
	
	public ShopWorker findByUserName(java.lang.String username);
	
	public void  update(ShopWorker shopWorker);
	
}
