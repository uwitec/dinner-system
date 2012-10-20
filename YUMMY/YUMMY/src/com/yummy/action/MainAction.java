package com.yummy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.yummy.service.impl.HighQualifiedFoodsService;
/**
 * 
 * Function: 游客访问网站时会被此action拦截，提取数据库中需要显示的食物信息 . <br/> 
 * date: 2012-9-20 下午3:10:19 <br/> 
 * 
 * @author jiahui 
 * @version 1.0
 */
@Component("mainAction")
@Scope("prototype")
public class MainAction extends ActionSupport {

	private List highQualifiedFoodsList = null;
	private Map session = null;
	
	@Resource
	private HighQualifiedFoodsService highQualifiedFoodsService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		highQualifiedFoodsList = highQualifiedFoodsService.getHighQualifiedFoods();
		session = ActionContext.getContext().getSession();
		//将获取到的食物放大session中，然后在页面使用OGNL表达式取出并显示
		session.put("highQualifiedFoodsList", highQualifiedFoodsList);
		
		return SUCCESS;
	}
	
}
