package com.yummy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.service.impl.CenterService;

@Component("myCenterAction")
@Scope("prototype")
public class MyCenterAction extends ActionSupport {

	private Map session;
	
	@Resource(name="centerService")
	private CenterService centerService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		session = ActionContext.getContext().getSession();
		
		//检查用户是否已经登陆.
		String username = (String) session.get("username");
		if (username == null || "".equals(username)) {
			return ERROR; 
		}
		System.out.println("MyCenterAction--> username: " + username);
		List currentOrders = centerService.getCurrentOrder(username);
		List finishedOrders = centerService.getFinishedOrder(username);
		session.put("currentOrders", currentOrders);
		session.put("finishedOrders", finishedOrders);
		return SUCCESS;
	}
	
}
