package com.yummy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.dao.impl.CustomerInfoDAO;
import com.yummy.pojo.CustomerInfo;

@Component("takeOrderAction")
@Scope("prototype")
public class TakeOrderAction extends ActionSupport {

	private Map session;
	
	@Resource(name="CustomerInfoDAO")
	private CustomerInfoDAO customerInfoDAO;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		session = ActionContext.getContext().getSession();
		
		List items = (List) session.get("items");
		if (items == null ) {
			return "none";
		} else if (items.size() == 0) {
			return "none";
		}
		
		String username =  (String) session.get("username");
		if (username == null || "".equals(username)) {
			return ERROR;
		}
		List<CustomerInfo> customerInfos = customerInfoDAO.findByUsername(username);
		System.out.println("用户填写过的地址： " + customerInfos.size());
		session.put("customerInfos", customerInfos);
		return SUCCESS;
	}
	
}
