package com.yummy.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.dao.impl.CustomerInfoDAO;
import com.yummy.pojo.OrderDTO;
import com.yummy.service.impl.OrderService;

@Component("payAction")
@Scope("prototype")
public class PayAction extends ActionSupport {
	private String address;
	private String telephone;
	private String message;
	
	private Map session;
	
	@Resource(name="orderService")
	private OrderService orderService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		session = ActionContext.getContext().getSession();
		float totalPrice = (Float) session.get("totalPrice");
		String username = (String) session.get("username");
		List items = (List) session.get("items");
		String shopname = (String) session.get("shopname");
//		System.out.println("0.1--> payAction取出shopname：" + shopname);
		orderService.save(new OrderDTO(username, address, telephone, message,shopname, totalPrice, items));
		session.remove("totalPrice");
		session.remove("items");
		return SUCCESS;
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (address == null || "".equals(address.trim())) {
			addFieldError("address", "地址信息不能为空");
		}
		if (telephone == null || "".equals(telephone.trim())) {
			addFieldError("telephone", "联系电话不能为空");
		}
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
