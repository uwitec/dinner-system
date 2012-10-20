package com.yummy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.dao.ISearchDAO;

/**
 * Function: 拦截用户搜索的内容 . <br/> 
 * date: 2012-9-20 下午10:31:38 <br/> 
 * 
 * @author Jiahui.wen
 */
@Component
@Scope("prototype")
public class SearchAction extends ActionSupport {

	private String searchItem;
	private Map session = null;
	
	@Resource(name="searchDAO")
	private ISearchDAO searchDAO;
	
	public String getSearchItem() {
		return searchItem;
	}

	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		if (searchItem == null || "".equals(searchItem.trim()) ){
			return "error";
		}
		//获取查询结果，分别是商店和食物。
		List searchFoods = searchDAO.getFoods(searchItem);
		List searchShops = searchDAO.getShops(searchItem);
		
		if (searchShops == null || searchFoods.size() == 0) {
			System.out.println("搜索店铺结果为空");
		}
		
		session = ActionContext.getContext().getSession();
		session.put("searchFoods", searchFoods);
		session.put("searchShops", searchShops);
		return "success";
	}
	
}
