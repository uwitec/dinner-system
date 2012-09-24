package com.yummy.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Customer;
import com.yummy.service.ICustomerService;

public class RegisterAction extends ActionSupport {

	private String username;
	private String password;
	private String email;
	private String gender;
	private Integer credits;
	private String registerDate;
	
	private ICustomerService customerService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		/*regerror:1用户名为空
         *      2：密码为空
         *      3：确认密码为空
         *      4：密码与确认密码不符
         *      5：用户名已存在
         */
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		username = new String(request.getParameter("username").getBytes("ISO8859_1"),"UTF-8");
		if(username.length() == 0){
			session.setAttribute("regerror", 1);
			return "error";
		}else{
			
			if(customerService.isExistUSer(username)){
				session.setAttribute("regerror", 5);
				return "error";
			}else{
				
				password = (String)request.getParameter("password");
				
				if(password.length() == 0){
					session.setAttribute("regerror", 2);
					return "error";
				}else{
					
					String repass = (String)request.getParameter("repass");
					
					if(repass.length() == 0){
						session.setAttribute("regerror", 3);
						return "error";
					}else{
						
						if(!password.equals(repass)){
							session.setAttribute("regerror", 4);
							return "error";
						}else{
							email = (String)request.getParameter("email");
							//gender = (String)request.getParameter("gender");
							gender = new String(request.getParameter("gender").getBytes("ISO8859_1"),"GBK");
							Customer customer = new Customer(username, password, email,gender, 0);
							customerService.addUser(customer);
							session.setAttribute("username", username);
							return SUCCESS;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	
	

}
