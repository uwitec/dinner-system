package com.yummy.pojo;

import java.util.HashSet;
import java.util.Set;


/**
 * CustomerInfo entity. @author MyEclipse Persistence Tools
 */

public class CustomerInfo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Customer customer;
     private String telephone;
     private String address;
     private Set orders = new HashSet(0);


    // Constructors

    /** default constructor */
    public CustomerInfo() {
    }

	/** minimal constructor */
    public CustomerInfo(Customer customer, String telephone, String address) {
        this.customer = customer;
        this.telephone = telephone;
        this.address = address;
    }
    
    /** full constructor */
    public CustomerInfo(Customer customer, String telephone, String address, Set orders) {
        this.customer = customer;
        this.telephone = telephone;
        this.address = address;
        this.orders = orders;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }
   








}