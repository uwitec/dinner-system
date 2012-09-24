package com.yummy.service.impl;

import java.util.List;

import com.yummy.dao.ICustomerDAO;
import com.yummy.pojo.Customer;
import com.yummy.service.ICustomerService;

public class CustomerService implements ICustomerService {
	
	private ICustomerDAO customerDAO;
	
	public void setCustomerDAO(ICustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public Customer getUser(String username) {
		// TODO Auto-generated method stub
		return customerDAO.findByUserName(username);
	}

	public void addUser(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.save(customer);

	}

	public Boolean isExistUSer(String username) {
		// TODO Auto-generated method stub
		Customer customer = customerDAO.findByUserName(username);
		if(customer==null) return false;
		else
		return true;
	}

	public void updateUser(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.update(customer);
	}
	
	public boolean verified(String username, String password) {
		
		List list = customerDAO.findByName(username, password);
		if (list != null && list.size() > 0) {
			System.out.println("customer ´æÔÚ");
			return true;
		}
		return false;
	}

}
