package com.yummy.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.yummy.dao.impl.OrderDAO;
import com.yummy.dao.impl.OrderInfoDAO;
import com.yummy.pojo.ItemDTO;
import com.yummy.pojo.OrderDetailsDTO;
import com.yummy.service.ICenterService;

@Component("centerService")
@Scope("prototype")
public class CenterService implements ICenterService {

	@Resource(name="OrderDAO")
	private OrderDAO orderDAO;
	
	@Resource(name="OrderInfoDAO")
	private OrderInfoDAO orderInfoDAO;
	
	public List getCurrentOrder(String username) {
		// TODO Auto-generated method stub
		
		List currentOrderDetals = null;
		System.out.println("用户名： " + username);
		List currentOrders = orderDAO.getCurrentOrder(username);
		if (currentOrders != null) {   
			currentOrderDetals = new ArrayList();
			System.out.println("CenterService---> currentOrders:" + currentOrders.size());
			for (int i = 0; i < currentOrders.size(); i++) { System.out.println("for::: " + i);
				Object[] tempOrder = (Object[]) currentOrders.get(i);
				OrderDetailsDTO orderDetail = new OrderDetailsDTO();
				orderDetail.setTime((Timestamp) tempOrder[1]);
				orderDetail.setTotalPrice((Float) tempOrder[3]);
				orderDetail.setShopname((String) tempOrder[4]);
				int orderID = (Integer) tempOrder[0];
				System.out.println("orderID--> " + orderID);
				List orderInfos = orderInfoDAO.getByID(orderID);
				System.out.println("搜索到orderInfo长度：" + orderInfos.size());
				List<ItemDTO> items = new ArrayList<ItemDTO>();
				for (int j = 0; j < orderInfos.size(); j++) {
					Object[] temp = (Object[]) orderInfos.get(j);
					ItemDTO item = new ItemDTO();
					item.setItemname((String) temp[0]);
					item.setOrderCount((Integer) temp[1]);
					items.add(item);
					System.out.println("11=====");
				}
				orderDetail.setItems(items);
				System.out.println("22=====");
				currentOrderDetals.add(orderDetail);
				System.out.println("33=====");
			}
		}
		System.out.println("44=====");
		return currentOrderDetals;
	}

	public List getFinishedOrder(String username) {
		// TODO Auto-generated method stub
		List FinishedOrders = orderDAO.getFinishedOrder(username);
		return FinishedOrders;
	}

	public void cancelOrder(String username) {
		// TODO Auto-generated method stub

	}

}
