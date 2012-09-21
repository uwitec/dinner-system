package com.yummy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yummy.dao.ISearchDAO;
import com.yummy.pojo.SearchFoodsDTO;
import com.yummy.pojo.SearchShopsDTO;

public class SearchDAO extends HibernateDaoSupport implements ISearchDAO {

	private List<SearchFoodsDTO> searchFoods = new ArrayList<SearchFoodsDTO>();
	private List<SearchShopsDTO> searchShops = new ArrayList<SearchShopsDTO>();
	
	public List getFoods(String searchItem) {
		// TODO Auto-generated method stub
		String sql = "select dish.dishId, dish.name, dish.price, dish.shopname from Dish dish where dish.name like " 
				+ "'%" + searchItem + "%'";
		System.out.println("查询食物：" + sql);
		List temp = getHibernateTemplate().find(sql);
		if (temp != null) {
			System.out.println("查询到的食物 ：" + temp.size());
			int length = temp.size();
			for (int i = 0; i < length; i++) {
				SearchFoodsDTO dto = new SearchFoodsDTO();
				dto.setDishId(  (Integer) ( (Object[])temp.get(i) )[0] );
				dto.setName(  (String) ( (Object[])temp.get(i) )[1] );
				dto.setPrice(  (Float) ( (Object[])temp.get(i) )[2] );
				dto.setShopname(  (String) ( (Object[])temp.get(i) )[3] );
				searchFoods.add(dto);
			}
		}
		return searchFoods;
	}

	public List getShops(String searchItem) {
		// TODO Auto-generated method stub
		String sql = "select shopname, telephone, introduction, deliveryRange from com.yummy.pojo.Shop where shopname like " 
				+ "'%" + "searchItem" + "%'";
		System.out.println("查询店铺：" + sql);
		List temp = getHibernateTemplate().find(sql);
		if (temp != null) {
			System.out.println("查询到的食物 ：" + temp.size());
			int length = temp.size();
			for (int i = 0; i < length; i++) {
				SearchShopsDTO dto = new SearchShopsDTO();
				dto.setShopname(  (String) ( (Object[])temp.get(i) )[0] );
				dto.setTelephone(  (String) ( (Object[])temp.get(i) )[1] );
				dto.setIntroduction(  (String) ( (Object[])temp.get(i) )[2] );
				dto.setDelivery_range(  (String) ( (Object[])temp.get(i) )[3] );
				searchShops.add(dto);
			}
		}
		return searchShops;
	}

}
