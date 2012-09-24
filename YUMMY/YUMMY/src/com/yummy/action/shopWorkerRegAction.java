package com.yummy.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Dish;
import com.yummy.service.IShopWorkerService;

public class shopWorkerRegAction extends ActionSupport {

	private String username;
	private String password;
	private String email;
	private String shopName;
	private String registerDate;
	
	private IShopWorkerService shopWorkerService;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		/*shopWRegE:1用户名为空
         *      	2：密码为空
         *      	3：确认密码为空
         *      	4：密码与确认密码不符
         *      	5：用户名已存在
         *      	6.店铺名字为空
         */
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		username = new String(request.getParameter("username").getBytes("ISO8859_1"),"UTF-8");
		if(username.length() == 0){
			session.setAttribute("shopWRegE", 1);
			return "error";
		}else{
			
			if(shopWorkerService.isExistUSer(username)){
				session.setAttribute("shopWRegE", 5);
				return "error";
			}else{
				
				password = (String)request.getParameter("password");
				
				if(password.length() == 0){
					session.setAttribute("shopWRegE", 2);
					return "error";
				}else{
					
					String repass = (String)request.getParameter("repass");
					
					if(repass.length() == 0){
						session.setAttribute("shopWRegE", 3);
						return "error";
					}else{
						
						if(!password.equals(repass)){
							session.setAttribute("shopWRegE", 4);
							return "error";
						}else{
							email = (String)request.getParameter("email");
							//gender = (String)request.getParameter("gender");
							shopName = new String(request.getParameter("shopName").getBytes("ISO8859_1"),"GBK");
							if(shopName.length() == 0){
								session.setAttribute("shopWRegE", 6);
								return "error";
							}else{
//								ShopWorker shopWorker = new ShopWorker();
//								Customer customer = new Customer(username, password, email,gender, 0);
//								customerService.addUser(customer);
//								session.setAttribute("username", username);

								java.util.Calendar c = java.util.Calendar.getInstance();    
						        java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
						        registerDate = f.format(c.getTime());
						        
						        shopWorkerService.addUser(username,password,shopName,email,registerDate);

								return SUCCESS;
							}
						}
					}
				}
			}
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public IShopWorkerService getShopworkerService() {
		return shopWorkerService;
	}

	public void setShopworkerService(IShopWorkerService shopworkerService) {
		this.shopWorkerService = shopworkerService;
	}

	public IShopWorkerService getShopWorkerService() {
		return shopWorkerService;
	}

	public void setShopWorkerService(IShopWorkerService shopWorkerService) {
		this.shopWorkerService = shopWorkerService;
	}
	
}
