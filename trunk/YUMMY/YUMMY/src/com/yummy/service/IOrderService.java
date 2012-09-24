package com.yummy.service;

import com.yummy.pojo.OrderDTO;

public interface IOrderService {
	public void save(OrderDTO orderDTO);
	public int getOrderID(OrderDTO orderDTO);
	public void saveOrder(OrderDTO orderDTO);
	public void saveOrderInfo(OrderDTO orderDTO);
	public void saveCustomerInfo(OrderDTO orderDTO);
	public int getCustomerInfoID();
}
