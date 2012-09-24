package com.yummy.action;



import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.Shop;
import com.yummy.service.IShopService;

public class AddShopAction extends ActionSupport{
	
	private Shop shop;
	private String address;
	private String telephone;
	private String qq;
	private String introduction;
	//private File logo_file;
	private String logo;
	private Integer point;
	private String deliveryRange;
	
	private IShopService shopService;
	
	

	public Shop getShop() {
		return shop;
	}



	public void setShop(Shop shop) {
		this.shop = shop;
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



	public String getQq() {
		return qq;
	}



	public void setQq(String qq) {
		this.qq = qq;
	}



	public String getIntroduction() {
		return introduction;
	}



	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLogo() {
		return logo;
	}



	public void setLogo(String logo) {
		this.logo = logo;
	}


	
	public Integer getPoint() {
		return point;
	}



	public void setPoint(Integer point) {
		this.point = point;
	}



	public String getDeliveryRange() {
		return deliveryRange;
	}



	public void setDeliveryRange(String deliveryRange) {
		this.deliveryRange = deliveryRange;
	}



	public void setShopService(IShopService shopService) {
		this.shopService = shopService;
	}


	public void validate(){
		if(shopname=="")
				addFieldError("SN_noNull","餐厅名不能为空");
	}
	
	
	public void uploadPicture(){
		
	}

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		if("".equals(logo)||logo==null)logo=ServletActionContext.getServletContext().getRealPath("/images/shop/default_logo.jpg");
		//System.out.print(ServletActionContext.getServletContext().getRealPath("/images/shop/default_logo.jpg"));
		String logo_type = logo.substring(logo.lastIndexOf('.'));
		
		String fileName = shopname+logo_type;
		File localfile = new File(logo);
		String RealPath = ServletActionContext.getServletContext().getRealPath("/images/shop");
		//System.out.print(RealPath+fileName);
		File file = new File(RealPath);

		if(!file.exists()){
			file.mkdirs();
		}
		try {
			FileUtils.copyFile(localfile, new File(file,fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Shop shop = new Shop(shopname,address,telephone,qq,introduction,RealPath+"\\"+fileName,0,deliveryRange);
		request.setAttribute("shopName", shopname);
		shopService.addShop(shop);
		return SUCCESS;
	}

}
