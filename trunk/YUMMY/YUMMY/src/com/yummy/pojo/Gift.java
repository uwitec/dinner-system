package com.yummy.pojo;

import java.util.HashSet;
import java.util.Set;


/**
 * Gift entity. @author MyEclipse Persistence Tools
 */

public class Gift  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String giftName;
     private Integer grade;
     private Integer account;
     private Set giftExchanges = new HashSet(0);


    // Constructors

    /** default constructor */
    public Gift() {
    }

	/** minimal constructor */
    public Gift(Integer id, String giftName, Integer grade, Integer account) {
        this.id = id;
        this.giftName = giftName;
        this.grade = grade;
        this.account = account;
    }
    
    /** full constructor */
    public Gift(Integer id, String giftName, Integer grade, Integer account, Set giftExchanges) {
        this.id = id;
        this.giftName = giftName;
        this.grade = grade;
        this.account = account;
        this.giftExchanges = giftExchanges;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiftName() {
        return this.giftName;
    }
    
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Integer getGrade() {
        return this.grade;
    }
    
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getAccount() {
        return this.account;
    }
    
    public void setAccount(Integer account) {
        this.account = account;
    }

    public Set getGiftExchanges() {
        return this.giftExchanges;
    }
    
    public void setGiftExchanges(Set giftExchanges) {
        this.giftExchanges = giftExchanges;
    }
   








}