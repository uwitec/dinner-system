package com.yummy.action;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Component("takeOrderAction")
@Scope("prototype")
public class TakeOrderAction extends ActionSupport {

	private Map session;
	
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
		
		return super.execute();
	}
	
}
