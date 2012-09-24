package com.yummy.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Customer;
import com.yummy.service.impl.CustomerService;

@Component("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	
	@Resource(name="CustomerService")
	private CustomerService customerService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean isLogin = customerService.verified(username, password);
		if (isLogin) {
			Map session = ActionContext.getContext().getSession();
			session.put("username", username);
			return SUCCESS;
		}else {
			return INPUT;
		}
	}

	@Override
	public void validate() {   
		//检查用户输入的用户名合法性
		if (username == null || username.length() < 4 || username.length() > 15) {
			addFieldError("username", "用户名长度不符合要求");
			System.out.println("用户名不合符要求");
		}
		//检查输入密码的合法性
		if (password == null || password.length() < 4 || password.length() > 15) {
			addFieldError("password", "密码长度不符合要求");
			System.out.println("密码长度不符合要求");
		} 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
