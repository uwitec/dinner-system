package com.yummy.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.yummy.service.impl.HighQualifiedFoodsService;
/**
 * 
 * Function: 游客访问网站时会被此action拦截，提取数据库中需要显示的食物信息 . <br/> 
 * date: 2012-9-20 下午3:10:19 <br/> 
 * 
 * @author jiahui 
 * @version 1.0
 */
@Component
public class MainAction extends ActionSupport {

	private List highQualifiedFoodsList = null;
	@Resource
	private HighQualifiedFoodsService highQualifiedFoodsService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		highQualifiedFoodsList = highQualifiedFoodsService.getHighQualifiedFoods();
		System.out.println("食物链的数量是：" + highQualifiedFoodsList.size());
		return SUCCESS;
	}

	public List getHighQualifiedFoodsList() {
		return highQualifiedFoodsList;
	}

	public void setHighQualifiedFoodsList(List highQualifiedFoodsList) {
		this.highQualifiedFoodsList = highQualifiedFoodsList;
	}

	public HighQualifiedFoodsService getHighQualifiedFoodsService() {
		return highQualifiedFoodsService;
	}

	public void setHighQualifiedFoodsService(
			HighQualifiedFoodsService highQualifiedFoodsService) {
		this.highQualifiedFoodsService = highQualifiedFoodsService;
	}

	
}
