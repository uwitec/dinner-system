package com.yummy.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.yummy.dao.IHighQualifiedFoodDAO;
import com.yummy.service.IHighQualifiedFoodsService;
/**
 * 
 * Function: 调用Dao，获取评价比较高的食物列表 . <br/> 
 * date: 2012-9-20 上午10:22:33 <br/> 
 * 
 * @author jiahui 
 * @version 1.0
 */

@Component
public class HighQualifiedFoodsService implements IHighQualifiedFoodsService {

	private List highQualifiedFoods;
	
	@Resource(name="highQualifiedFoodDAO")
	private IHighQualifiedFoodDAO highQualifiedFoodDAO;
	//类加载时就获取食物列表

	
	public HighQualifiedFoodsService() {
//		highQualifiedFoods = highQualifiedFoodDAO.getHighQualifiedFoods();
	}
	
	public List getHighQualifiedFoods() {
		// TODO Auto-generated method stub
		highQualifiedFoods = highQualifiedFoodDAO.getHighQualifiedFoods();
		return highQualifiedFoods;
	}

}
