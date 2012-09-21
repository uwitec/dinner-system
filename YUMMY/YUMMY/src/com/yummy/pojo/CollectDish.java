package com.yummy.pojo;

import java.util.Date;


/**
 * CollectDish entity. @author MyEclipse Persistence Tools
 */

public class CollectDish  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Dish dish;
     private Customer customer;
     private Date collectTime;
     private String tag;


    // Constructors

    /** default constructor */
    public CollectDish() {
    }

	/** minimal constructor */
    public CollectDish(Dish dish, Customer customer) {
        this.dish = dish;
        this.customer = customer;
    }
    
    /** full constructor */
    public CollectDish(Dish dish, Customer customer, Date collectTime, String tag) {
        this.dish = dish;
        this.customer = customer;
        this.collectTime = collectTime;
        this.tag = tag;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Dish getDish() {
        return this.dish;
    }
    
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getCollectTime() {
        return this.collectTime;
    }
    
    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }
   








}