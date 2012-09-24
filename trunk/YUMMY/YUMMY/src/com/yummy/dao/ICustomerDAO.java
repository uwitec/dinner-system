package com.yummy.dao;

import java.util.List;

import com.yummy.pojo.Customer;


public interface ICustomerDAO {

	public abstract void save(Customer transientInstance);

	public abstract void delete(Customer transientInstance);

	public abstract Customer findById(java.lang.String id);

	public abstract List findAll();
	
	public Customer findByUserName(java.lang.String username);
	
	public void  update(Customer customer);
}
