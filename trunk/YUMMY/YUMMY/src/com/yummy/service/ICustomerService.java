package com.yummy.service;

import com.yummy.pojo.Customer;

public interface ICustomerService {
	
	public Customer getUser(String username);

	public void addUser(Customer customer);
	
	public Boolean isExistUSer(String username);
	
	public void updateUser(Customer customer);
}
