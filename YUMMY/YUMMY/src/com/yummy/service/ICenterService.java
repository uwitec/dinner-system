package com.yummy.service;

import java.util.List;

public interface ICenterService {
	public List getCurrentOrder(String username);
	public List getFinishedOrder(String username);
	public void cancelOrder(String username);
}
