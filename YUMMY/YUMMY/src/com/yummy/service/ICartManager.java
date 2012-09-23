package com.yummy.service;

import java.util.List;

import com.yummy.pojo.ItemDTO;

public interface ICartManager {
	
	public List<ItemDTO> getItems();

	public void setItems(List<ItemDTO> items);
	public void add(ItemDTO item);
	public void increase(int id, int quantities);
	public void delete(int id);
	public void update(int id, int quantities);
	public boolean isItemExist(int id);
	public void remove(int id);
	public void removeAll();
	public float getTotalPrice();
}
