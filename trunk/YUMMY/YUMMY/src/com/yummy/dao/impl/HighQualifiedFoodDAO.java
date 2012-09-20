package com.yummy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.yummy.dao.IHighQualifiedFoodDAO;

public class HighQualifiedFoodDAO extends HibernateDaoSupport implements IHighQualifiedFoodDAO{

	List highQualifiedFoods = null;
	/**
	 * 用户订餐后评价比较高的食物，用以在主页面显示.
	 */
	public List getHighQualifiedFoods() {
		// TODO Auto-generated method stub
		
	/* Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
	 Query query = session.createQuery(sql);
	 List highQualifiedFoods = query.list();*/
		
	 // 获取评价较高的食物名字，价格，评分，店名，简介图等信息
/*	 String sql = "select name, price, point, shopname, picOne "
			 + "from yummy.dish order by point desc, name asc";*/
		
	String sql = "from dish";
	 
	 highQualifiedFoods = getHibernateTemplate().find(sql);
	 System.out.println("======= highQualifiedFoods.length: " + highQualifiedFoods.size() + "==========");
	 return highQualifiedFoods;
	}

}
