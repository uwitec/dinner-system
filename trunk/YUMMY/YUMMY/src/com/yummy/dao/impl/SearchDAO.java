package com.yummy.dao.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.yummy.dao.ISearchDAO;

public class SearchDAO extends HibernateDaoSupport implements ISearchDAO {

	private List searchFoods = null;
	private List searchShops = null;
	
	public List getFoods(String searchItem) {
		// TODO Auto-generated method stub
		String sql = "select dish.name, dish.price from Dish dish where dish.name like " 
				+ "'%" + "白饭" + "%'";
		System.out.println("查询食物：" + sql);
		String testSQL = "from Dish where name like '%白饭%'";
		searchFoods = getHibernateTemplate().find(testSQL);
		if (searchFoods != null) {
			System.out.println("查询到的食物 ：" + searchFoods.size());
		}
		return searchFoods;
	}

	public List getShops(String searchItem) {
		// TODO Auto-generated method stub
		String sql = "select shopname from com.yummy.pojo.Shop where shopname like " 
				+ "'%" + "测试" + "%'";
		System.out.println("查询店铺：" + sql);
		String testSQL = "from Shop";
		searchShops = getHibernateTemplate().find(testSQL);
		if (searchShops != null) {
			System.out.println("查询到的食物 ：" + searchShops.size());
		}
		return searchShops;
	}

}
