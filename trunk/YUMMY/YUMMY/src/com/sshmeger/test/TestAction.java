package com.sshmeger.test;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private String name;
    private String password;
    private TestDAO testDAO;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
	public void setTestDAO(TestDAO testDAO) {
		this.testDAO = testDAO;
	}

	public String execute(){
		Test test = new Test(name,password);
		testDAO.save(test);
    	return SUCCESS;
    }

}
