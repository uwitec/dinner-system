package com.yummy.dao;

import java.util.List;

import com.yummy.pojo.Dish;


public interface IDishDAO {
	
	public abstract void save(Dish transientInstance);
	
	public abstract Dish findById(Integer  id);

	public abstract List selectAllByShop(String shopName);
	
	public abstract void updateById(int id);

}
