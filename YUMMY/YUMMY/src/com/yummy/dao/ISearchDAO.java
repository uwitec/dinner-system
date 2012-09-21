package com.yummy.dao;

import java.util.List;

public interface ISearchDAO {
	public List getFoods(String searchItem);
	public List getShops(String searchItem);
}
