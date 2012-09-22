package com.yummy.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yummy.pojo.ItemDTO;
import com.yummy.service.impl.CartManager;
/**
 * Function: 将用户点击的食物放到购物车 . <br/> 
 * date: 2012-9-22 下午3:32:33 <br/> 
 * 
 * @author Jiahui.wen
 */
@Component("cartAction")
@Scope("prototype")
public class CartAction extends ActionSupport {

	private int id;
	private int orderCount;
	private String itemname;
	private String picPath;
	private float price;
	
	private Map session;
	
	@Override
	public String execute() throws Exception {
		session = ActionContext.getContext().getSession();
		System.out.println("===" + id + orderCount + itemname + picPath + price);
		List<ItemDTO> itemList = (List<ItemDTO>) session.get("items");
		if (itemList == null) {
			itemList = new ArrayList<ItemDTO>();
		}
		
		//创建一个购物车管理类。
		CartManager manager = new CartManager();
		manager.setItems(itemList);
		
		if (id != 0 && orderCount != 0) {
			if (manager.isItemExist(id)) {  //购物车已经存在该种食物
				manager.increase(id, orderCount);
			} else {
				ItemDTO item = new ItemDTO(id, orderCount, itemname, picPath, price);
				manager.add(item);
			}
			session.put("items", manager.getItems());
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
