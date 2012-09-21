package com.yummy.pojo;

import java.sql.Timestamp;


/**
 * Estimate entity. @author MyEclipse Persistence Tools
 */

public class Estimate  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Customer customer;
     private Dish dish;
     private Short point;
     private String comment;
     private Timestamp date;


    // Constructors

    /** default constructor */
    public Estimate() {
    }

	/** minimal constructor */
    public Estimate(Customer customer, Dish dish, Short point) {
        this.customer = customer;
        this.dish = dish;
        this.point = point;
    }
    
    /** full constructor */
    public Estimate(Customer customer, Dish dish, Short point, String comment, Timestamp date) {
        this.customer = customer;
        this.dish = dish;
        this.point = point;
        this.comment = comment;
        this.date = date;
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

    public Dish getDish() {
        return this.dish;
    }
    
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Short getPoint() {
        return this.point;
    }
    
    public void setPoint(Short point) {
        this.point = point;
    }

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getDate() {
        return this.date;
    }
    
    public void setDate(Timestamp date) {
        this.date = date;
    }
   








}