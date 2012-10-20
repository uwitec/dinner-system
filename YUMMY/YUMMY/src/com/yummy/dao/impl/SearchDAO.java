package com.yummy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yummy.dao.ISearchDAO;
import com.yummy.pojo.Dish;
import com.yummy.pojo.SearchFoodsDTO;
import com.yummy.pojo.SearchShopsDTO;
import com.yummy.pojo.Shop;

public class SearchDAO extends HibernateDaoSupport implements ISearchDAO {

	private List<Dish> searchFoods = new ArrayList<Dish>();
	private List<Shop> searchShops = new ArrayList<Shop>();
	
	public List getFoods(String searchItem) {
		// TODO Auto-generated method stub
		String sql = "select new Dish(dish.dishId, dish.name, dish.price, dish.shop) from Dish dish where dish.name like " 
				+ "'%" + searchItem + "%'";
		System.out.println("查询食物：" + sql);
		List searchFoods = getHibernateTemplate().find(sql);
		if (searchFoods == null || searchFoods.size() == 0) {
			System.out.println("查询食物 -- > 空");
		}
		/*if (temp != null) {
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
		}*/
		return searchFoods;
	}

	public List getShops(String searchItem) {
		// TODO Auto-generated method stub
		String sql = "select new Shop(shop.shopname, shop.telephone, shop.introduction, shop.deliveryRange) from " +
				"com.yummy.pojo.Shop shop " +
				"where shop.shopname like ?";
		Object[] objects = {"%" + searchItem + "%"};
//				+ "'%" + searchItem + "%'";
		System.out.println("查询店铺：" + sql);
		List searchShops = getHibernateTemplate().find(sql, objects);
		System.out.println();
		if (searchShops == null || searchShops.size() == 0) {
			System.out.println("查询餐厅-- > 空");
		}
		/*if (temp != null) {
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
		}*/
		return searchShops;
	}

}
