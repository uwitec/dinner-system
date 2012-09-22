package com.yummy.service;

import com.yummy.pojo.ItemDTO;

public interface ICartManager {
	public void add(ItemDTO item);
	public void increase(int id, int quantities);
	public void delete(int id);
	public void update(int id, int quantities);
	public boolean isItemExist(int id);
	public void removeAll();
}
