package com.yummy.service.impl;

import java.util.List;

import com.yummy.dao.IDishDAO;
import com.yummy.dao.IShopDAO;
import com.yummy.pojo.Dish;
import com.yummy.service.IDishService;

public class DishService implements IDishService {
	
	private IDishDAO dishDAO;
	
	

	public void setDishDAO(IDishDAO dishDAO) {
		this.dishDAO = dishDAO;
	}



	public void addDish(Dish dish) {
		// TODO Auto-generated method stub
		this.dishDAO.save(dish);

	}



	public Dish getDish(int id) {
		// TODO Auto-generated method stub
		return dishDAO.findById(id);
	}



	public List getAllMyDish(String shopName) {
		// TODO Auto-generated method stub
		return dishDAO.selectAllByShop(shopName);
	}



	public void updateDish(int id) {
		// TODO Auto-generated method stub
		dishDAO.updateById(id);
	}

}
