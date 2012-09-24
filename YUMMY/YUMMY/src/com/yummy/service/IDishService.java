package com.yummy.service;

import java.util.List;

import com.yummy.pojo.Dish;


public interface IDishService {
	public void addDish(Dish dish);
	
	public Dish getDish(int id);
	
	public List getAllMyDish(String shopName);
	
	public void updateDish(Dish dish);

}
